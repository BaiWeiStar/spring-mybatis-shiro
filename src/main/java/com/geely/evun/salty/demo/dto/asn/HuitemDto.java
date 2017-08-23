package com.geely.evun.salty.demo.dto.asn;


import com.geely.evun.salty.demo.entity.asn.Huitem;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
public class HuitemDto {
    private Integer BARCODE_DETAIL_ID;
    private String ASN_NO;
    private Integer RUNSHEET_DETAIL_NO;
    private String BARCODE_DATA;
    private Double ACTUAL_INHOUSE_PACKAGE_QTY;

    public HuitemDto(){}
    public HuitemDto(Huitem h){
        this.BARCODE_DETAIL_ID = h.getBARCODE_DETAIL_ID();
        this.ASN_NO = h.getASN_NO();
        this.RUNSHEET_DETAIL_NO = h.getRUNSHEET_DETAIL_NO();
        this.BARCODE_DATA = h.getBARCODE_DATA();
        this.ACTUAL_INHOUSE_PACKAGE_QTY = h.getACTUAL_INHOUSE_PACKAGE_QTY();
    }

    public Integer getBARCODE_DETAIL_ID() {
        return BARCODE_DETAIL_ID;
    }

    public void setBARCODE_DETAIL_ID(Integer BARCODE_DETAIL_ID) {
        this.BARCODE_DETAIL_ID = BARCODE_DETAIL_ID;
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

    public String getBARCODE_DATA() {
        return BARCODE_DATA;
    }

    public void setBARCODE_DATA(String BARCODE_DATA) {
        this.BARCODE_DATA = BARCODE_DATA;
    }

    public Double getACTUAL_INHOUSE_PACKAGE_QTY() {
        return ACTUAL_INHOUSE_PACKAGE_QTY;
    }

    public void setACTUAL_INHOUSE_PACKAGE_QTY(Double ACTUAL_INHOUSE_PACKAGE_QTY) {
        this.ACTUAL_INHOUSE_PACKAGE_QTY = ACTUAL_INHOUSE_PACKAGE_QTY;
    }
}
