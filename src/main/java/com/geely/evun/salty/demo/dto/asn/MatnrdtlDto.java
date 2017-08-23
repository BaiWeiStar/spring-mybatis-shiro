package com.geely.evun.salty.demo.dto.asn;


import com.geely.evun.salty.demo.entity.asn.Matnrdtl;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
public class MatnrdtlDto {
    private Integer RUNSHEET_DETAIL_ID;
    private String ASN_NO;
    private Integer RUNSHEET_DETAIL_NO;
    private String PART_NO;
    private String MEASURING_UNIT_NO;
    private Character ISEMERGENCY;
    private Character CZFLAG;
    private String ZSIGN;
    private String BATTH_NO;
    private Double REQUIRED_INHOUSE_PACKAGE_QTY;
    private String LGORT;
    private String ORDER_NO;
    private Integer ITEM_NO;
    private Character POTYPE;
    private String PACKAGE_STYLE;
    private String PACKAGE_TYPE;
    private String PACKAGE_COUNT;

    public MatnrdtlDto() {
    }

    public MatnrdtlDto(Matnrdtl m) {
        this.RUNSHEET_DETAIL_ID = m.getRUNSHEET_DETAIL_ID();
        this.ASN_NO = m.getASN_NO();
        this.RUNSHEET_DETAIL_NO = m.getRUNSHEET_DETAIL_NO();
        this.PART_NO = m.getPART_NO();
        this.MEASURING_UNIT_NO = m.getMEASURING_UNIT_NO();
        this.ISEMERGENCY = m.getISEMERGENCY();
        this.CZFLAG = m.getCZFLAG();
        this.ZSIGN = m.getZSIGN();
        this.BATTH_NO = m.getBATTH_NO();
        this.REQUIRED_INHOUSE_PACKAGE_QTY = m.getREQUIRED_INHOUSE_PACKAGE_QTY();
        this.LGORT = m.getLGORT();
        this.ORDER_NO = m.getORDER_NO();
        this.ITEM_NO = m.getITEM_NO();
        this.POTYPE = m.getPOTYPE();
        this.PACKAGE_STYLE = m.getPACKAGE_STYLE();
        this.PACKAGE_TYPE = m.getPACKAGE_TYPE();
        this.PACKAGE_COUNT = m.getPACKAGE_COUNT();
    }

    public Integer getRUNSHEET_DETAIL_ID() {
        return RUNSHEET_DETAIL_ID;
    }

    public void setRUNSHEET_DETAIL_ID(Integer RUNSHEET_DETAIL_ID) {
        this.RUNSHEET_DETAIL_ID = RUNSHEET_DETAIL_ID;
    }

    public String getASN_NO() {
        return ASN_NO;
    }

    public void setASN_NO(String ASN_NO) {
        this.ASN_NO = ASN_NO;
    }

    public Integer getRUNSHEET_DETAIL_NO() {
        return RUNSHEET_DETAIL_NO;
    }

    public void setRUNSHEET_DETAIL_NO(Integer RUNSHEET_DETAIL_NO) {
        this.RUNSHEET_DETAIL_NO = RUNSHEET_DETAIL_NO;
    }

    public String getPART_NO() {
        return PART_NO;
    }

    public void setPART_NO(String PART_NO) {
        this.PART_NO = PART_NO;
    }

    public String getMEASURING_UNIT_NO() {
        return MEASURING_UNIT_NO;
    }

    public void setMEASURING_UNIT_NO(String MEASURING_UNIT_NO) {
        this.MEASURING_UNIT_NO = MEASURING_UNIT_NO;
    }

    public Character getISEMERGENCY() {
        return ISEMERGENCY;
    }

    public void setISEMERGENCY(Character ISEMERGENCY) {
        this.ISEMERGENCY = ISEMERGENCY;
    }

    public Character getCZFLAG() {
        return CZFLAG;
    }

    public void setCZFLAG(Character CZFLAG) {
        this.CZFLAG = CZFLAG;
    }

    public String getZSIGN() {
        return ZSIGN;
    }

    public void setZSIGN(String ZSIGN) {
        this.ZSIGN = ZSIGN;
    }

    public String getBATTH_NO() {
        return BATTH_NO;
    }

    public void setBATTH_NO(String BATTH_NO) {
        this.BATTH_NO = BATTH_NO;
    }

    public Double getREQUIRED_INHOUSE_PACKAGE_QTY() {
        return REQUIRED_INHOUSE_PACKAGE_QTY;
    }

    public void setREQUIRED_INHOUSE_PACKAGE_QTY(Double REQUIRED_INHOUSE_PACKAGE_QTY) {
        this.REQUIRED_INHOUSE_PACKAGE_QTY = REQUIRED_INHOUSE_PACKAGE_QTY;
    }

    public String getLGORT() {
        return LGORT;
    }

    public void setLGORT(String LGORT) {
        this.LGORT = LGORT;
    }

    public String getORDER_NO() {
        return ORDER_NO;
    }

    public void setORDER_NO(String ORDER_NO) {
        this.ORDER_NO = ORDER_NO;
    }

    public Integer getITEM_NO() {
        return ITEM_NO;
    }

    public void setITEM_NO(Integer ITEM_NO) {
        this.ITEM_NO = ITEM_NO;
    }

    public Character getPOTYPE() {
        return POTYPE;
    }

    public void setPOTYPE(Character POTYPE) {
        this.POTYPE = POTYPE;
    }

    public String getPACKAGE_STYLE() {
        return PACKAGE_STYLE;
    }

    public void setPACKAGE_STYLE(String PACKAGE_STYLE) {
        this.PACKAGE_STYLE = PACKAGE_STYLE;
    }

    public String getPACKAGE_TYPE() {
        return PACKAGE_TYPE;
    }

    public void setPACKAGE_TYPE(String PACKAGE_TYPE) {
        this.PACKAGE_TYPE = PACKAGE_TYPE;
    }

    public String getPACKAGE_COUNT() {
        return PACKAGE_COUNT;
    }

    public void setPACKAGE_COUNT(String PACKAGE_COUNT) {
        this.PACKAGE_COUNT = PACKAGE_COUNT;
    }
}
