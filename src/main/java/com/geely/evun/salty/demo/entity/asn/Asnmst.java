package com.geely.evun.salty.demo.entity.asn;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
@XStreamAlias("ASNMST")
public class Asnmst {
    @XStreamAlias("PLANT")
    private String PLANT;
    @XStreamAlias("PLAN_RUNSHEET_SN")
    private Integer PLAN_RUNSHEET_SN;
    @XStreamAlias("ASN_NO")
    private String ASN_NO;
    @XStreamAlias("SUPPLIER_NUM")
    private String SUPPLIER_NUM;
    @XStreamAlias("AUTO_NO")
    private String AUTO_NO;
    @XStreamAlias("EXPECTED_ARRIVAL_TIME")
    private String EXPECTED_ARRIVAL_TIME;
    @XStreamAlias("DELIVERY_TIME")
    private String DELIVERY_TIME;
    @XStreamAlias("DOCK")
    private String DOCK;
    @XStreamAlias("WM_NO")
    private String WM_NO;
    @XStreamAlias("OPER_TYPE")
    private String OPER_TYPE;
    @XStreamAlias("DTLLIST")
    private List<Matnrdtl> DTLLIST;

    public String getPLANT() {
        return PLANT;
    }

    public Integer getPLAN_RUNSHEET_SN() {
        return PLAN_RUNSHEET_SN;
    }

    public String getASN_NO() {
        return ASN_NO;
    }

    public String getSUPPLIER_NUM() {
        return SUPPLIER_NUM;
    }

    public String getAUTO_NO() {
        return AUTO_NO;
    }

    public String getEXPECTED_ARRIVAL_TIME() {
        return EXPECTED_ARRIVAL_TIME;
    }

    public String getDELIVERY_TIME() {
        return DELIVERY_TIME;
    }

    public String getDOCK() {
        return DOCK;
    }

    public String getWM_NO() {
        return WM_NO;
    }

    public String getOPER_TYPE() {
        return OPER_TYPE;
    }

    public List<Matnrdtl> getDTLLIST() {
        return DTLLIST;
    }
}
