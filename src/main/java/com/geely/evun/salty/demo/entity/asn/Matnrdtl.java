package com.geely.evun.salty.demo.entity.asn;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
@XStreamAlias("MATNRDTL")
public class Matnrdtl {
    @XStreamAlias("RUNSHEET_DETAIL_ID")
    private Integer RUNSHEET_DETAIL_ID;
    @XStreamAlias("ASN_NO")
    private String ASN_NO;
    @XStreamAlias("RUNSHEET_DETAIL_NO")
    private Integer RUNSHEET_DETAIL_NO;
    @XStreamAlias("PART_NO")
    private String PART_NO;
    @XStreamAlias("MEASURING_UNIT_NO")
    private String MEASURING_UNIT_NO;
    @XStreamAlias("ISEMERGENCY")
    private Character ISEMERGENCY;
    @XStreamAlias("CZFLAG")
    private Character CZFLAG;
    @XStreamAlias("ZSIGN")
    private String ZSIGN;
    @XStreamAlias("BATTH_NO")
    private String BATTH_NO;
    @XStreamAlias("REQUIRED_INHOUSE_PACKAGE_QTY")
    private Double REQUIRED_INHOUSE_PACKAGE_QTY;
    @XStreamAlias("LGORT")
    private String LGORT;
    @XStreamAlias("ORDER_NO")
    private String ORDER_NO;
    @XStreamAlias("ITEM_NO")
    private Integer ITEM_NO;
    @XStreamAlias("POTYPE")
    private Character POTYPE;
    @XStreamAlias("PACKAGE_STYLE")
    private String PACKAGE_STYLE;
    @XStreamAlias("PACKAGE_TYPE")
    private String PACKAGE_TYPE;
    @XStreamAlias("PACKAGE_COUNT")
    private String PACKAGE_COUNT;
    @XStreamAlias("HULIST")
    private List<Huitem> HULIST;

    public Integer getRUNSHEET_DETAIL_ID() {
        return RUNSHEET_DETAIL_ID;
    }

    public String getASN_NO() {
        return ASN_NO;
    }

    public Integer getRUNSHEET_DETAIL_NO() {
        return RUNSHEET_DETAIL_NO;
    }

    public String getPART_NO() {
        return PART_NO;
    }

    public String getMEASURING_UNIT_NO() {
        return MEASURING_UNIT_NO;
    }

    public Character getISEMERGENCY() {
        return ISEMERGENCY;
    }

    public Character getCZFLAG() {
        return CZFLAG;
    }

    public String getZSIGN() {
        return ZSIGN;
    }

    public String getBATTH_NO() {
        return BATTH_NO;
    }

    public Double getREQUIRED_INHOUSE_PACKAGE_QTY() {
        return REQUIRED_INHOUSE_PACKAGE_QTY;
    }

    public String getLGORT() {
        return LGORT;
    }

    public String getORDER_NO() {
        return ORDER_NO;
    }

    public Integer getITEM_NO() {
        return ITEM_NO;
    }

    public Character getPOTYPE() {
        return POTYPE;
    }

    public String getPACKAGE_STYLE() {
        return PACKAGE_STYLE;
    }

    public String getPACKAGE_TYPE() {
        return PACKAGE_TYPE;
    }

    public String getPACKAGE_COUNT() {
        return PACKAGE_COUNT;
    }

    public List<Huitem> getHULIST() {
        return HULIST;
    }
}
