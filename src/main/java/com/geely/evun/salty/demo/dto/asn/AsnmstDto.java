package com.geely.evun.salty.demo.dto.asn;


import com.geely.evun.salty.demo.entity.asn.Asnmst;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
public class AsnmstDto {
    private String PLANT;
    private Integer PLAN_RUNSHEET_SN;
    private String ASN_NO;
    private String SUPPLIER_NUM;
    private String AUTO_NO;
    private String EXPECTED_ARRIVAL_TIME;
    private String DELIVERY_TIME;
    private String DOCK;
    private String WM_NO;
    private String OPER_TYPE;
    public AsnmstDto(){}
    public AsnmstDto(Asnmst a){
        this.PLANT = a.getPLANT();
        this.PLAN_RUNSHEET_SN = a.getPLAN_RUNSHEET_SN();
        this.ASN_NO = a.getASN_NO();
        this.SUPPLIER_NUM = a.getSUPPLIER_NUM();
        this.AUTO_NO = a.getAUTO_NO();
        this.EXPECTED_ARRIVAL_TIME = a.getEXPECTED_ARRIVAL_TIME();
        this.DELIVERY_TIME = a.getDELIVERY_TIME();
        this.DOCK = a.getDOCK();
        this.WM_NO = a.getWM_NO();
        this.OPER_TYPE = a.getOPER_TYPE();
    }

    public String getPLANT() {
        return PLANT;
    }

    public void setPLANT(String PLANT) {
        this.PLANT = PLANT;
    }

    public Integer getPLAN_RUNSHEET_SN() {
        return PLAN_RUNSHEET_SN;
    }

    public void setPLAN_RUNSHEET_SN(Integer PLAN_RUNSHEET_SN) {
        this.PLAN_RUNSHEET_SN = PLAN_RUNSHEET_SN;
    }

    public String getASN_NO() {
        return ASN_NO;
    }

    public void setASN_NO(String ASN_NO) {
        this.ASN_NO = ASN_NO;
    }

    public String getSUPPLIER_NUM() {
        return SUPPLIER_NUM;
    }

    public void setSUPPLIER_NUM(String SUPPLIER_NUM) {
        this.SUPPLIER_NUM = SUPPLIER_NUM;
    }

    public String getAUTO_NO() {
        return AUTO_NO;
    }

    public void setAUTO_NO(String AUTO_NO) {
        this.AUTO_NO = AUTO_NO;
    }

    public String getEXPECTED_ARRIVAL_TIME() {
        return EXPECTED_ARRIVAL_TIME;
    }

    public void setEXPECTED_ARRIVAL_TIME(String EXPECTED_ARRIVAL_TIME) {
        this.EXPECTED_ARRIVAL_TIME = EXPECTED_ARRIVAL_TIME;
    }

    public String getDELIVERY_TIME() {
        return DELIVERY_TIME;
    }

    public void setDELIVERY_TIME(String DELIVERY_TIME) {
        this.DELIVERY_TIME = DELIVERY_TIME;
    }

    public String getDOCK() {
        return DOCK;
    }

    public void setDOCK(String DOCK) {
        this.DOCK = DOCK;
    }

    public String getWM_NO() {
        return WM_NO;
    }

    public void setWM_NO(String WM_NO) {
        this.WM_NO = WM_NO;
    }

    public String getOPER_TYPE() {
        return OPER_TYPE;
    }

    public void setOPER_TYPE(String OPER_TYPE) {
        this.OPER_TYPE = OPER_TYPE;
    }
}
