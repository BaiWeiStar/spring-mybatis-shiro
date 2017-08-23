package com.geely.evun.salty.core.utils;

import com.geely.evun.salty.demo.dto.asn.AsnmstDto;
import com.geely.evun.salty.demo.dto.asn.HuitemDto;
import com.geely.evun.salty.demo.dto.asn.MatnrdtlDto;
import com.geely.evun.salty.demo.entity.asn.AsnData;
import com.geely.evun.salty.demo.entity.asn.Asnmst;
import com.geely.evun.salty.demo.entity.asn.Huitem;
import com.geely.evun.salty.demo.entity.asn.Matnrdtl;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
public class XStreamUtil {
    public static <T> T toBean(String xmlStr, Class<T> cls) {
        //注意：不是new Xstream(); 否则报错：java.lang.NoClassDefFoundError: org/xmlpull/v1/XmlPullParserFactory
        XStream xstream = new XStream() {
            @Override
            protected MapperWrapper wrapMapper(MapperWrapper next) {
                return new MapperWrapper(next) {
                    @Override
                    public boolean shouldSerializeMember(Class definedIn, String fieldName) {
                        if (definedIn == Object.class) {
                            try {
                                return this.realClass(fieldName) != null;
                            } catch (Exception e) {
                                return false;
                            }
                        } else {
                            return super.shouldSerializeMember(definedIn, fieldName);
                        }
                    }
                };
            }
        };
        //过滤实体类未知标签
        xstream.ignoreUnknownElements();
        //启用标签过滤
        xstream.processAnnotations(cls);
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;
    }

    public static void main(String[] args) {
        String receivedXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><DATA><ASNMST><PLANT>6321</PLANT><PLAN_RUNSHEET_SN>1009455</PLAN_RUNSHEET_SN><ASN_NO>PD00069044</ASN_NO><SUPPLIER_NUM>270016</SUPPLIER_NUM><AUTO_NO>null</AUTO_NO><EXPECTED_ARRIVAL_TIME>2017-08-16</EXPECTED_ARRIVAL_TIME><DELIVERY_TIME>2017-08-16</DELIVERY_TIME><DOCK/><WM_NO>8000</WM_NO><OPER_TYPE>2</OPER_TYPE><DTLLIST><MATNRDTL><RUNSHEET_DETAIL_ID>1009455</RUNSHEET_DETAIL_ID><ASN_NO>PD00069044</ASN_NO><RUNSHEET_DETAIL_NO>1</RUNSHEET_DETAIL_NO><PART_NO>1068000142</PART_NO><MEASURING_UNIT_NO>PC</MEASURING_UNIT_NO><ISEMERGENCY>null</ISEMERGENCY><CZFLAG>N</CZFLAG><ZSIGN>0</ZSIGN><BATTH_NO>170801</BATTH_NO><REQUIRED_INHOUSE_PACKAGE_QTY>1.0</REQUIRED_INHOUSE_PACKAGE_QTY><ORDER_NO>4500002103</ORDER_NO><ITEM_NO>10</ITEM_NO><POTYPE>K</POTYPE><LGORT>8000</LGORT><PACKAGE_STYLE/><PACKAGE_COUNT>1.0</PACKAGE_COUNT><HULIST><HUITEM><BARCODE_DETAIL_ID>1009455</BARCODE_DETAIL_ID><ASN_NO>PD00069044</ASN_NO><RUNSHEET_DETAIL_NO>1</RUNSHEET_DETAIL_NO><BARCODE_DATA>0170816000001</BARCODE_DATA><ACTUAL_INHOUSE_PACKAGE_QTY>1.0</ACTUAL_INHOUSE_PACKAGE_QTY></HUITEM><HUITEM>...</HUITEM></HULIST></MATNRDTL><MATNRDTL>...</MATNRDTL></DTLLIST></ASNMST></DATA>";
        Asnmst asnData = XStreamUtil.toBean(receivedXml, AsnData.class).getAsnmst();
        Map<String, Object> receiveMap = new HashMap<String, Object>();
        List<Huitem> huitems = new ArrayList<Huitem>();
        List<MatnrdtlDto> matnrdtls = new ArrayList<MatnrdtlDto>();
        for (Matnrdtl m : asnData.getDTLLIST()) {
            if (m.getHULIST() != null) {
                huitems.addAll(m.getHULIST());
            }
            matnrdtls.add(new MatnrdtlDto(m));
        }
        receiveMap.put("ASNMST", new AsnmstDto(asnData));
        receiveMap.put("MATNRDTL", matnrdtls);
        receiveMap.put("HUITEM", huitems);
        String result = JSONObject.fromObject(receiveMap).toString();
        System.out.println(result);
    }
}
