package com.geely.evun.salty.demo.entity.asn;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
@XStreamAlias("HUITEM")
public class Huitem {
    @XStreamAlias("BARCODE_DETAIL_ID")
    private Integer BARCODE_DETAIL_ID;
    @XStreamAlias("ASN_NO")
    private String ASN_NO;
    @XStreamAlias("RUNSHEET_DETAIL_NO")
    private Integer RUNSHEET_DETAIL_NO;
    @XStreamAlias("BARCODE_DATA")
    private String BARCODE_DATA;
    @XStreamAlias("ACTUAL_INHOUSE_PACKAGE_QTY")
    private Double ACTUAL_INHOUSE_PACKAGE_QTY;

    public Integer getBARCODE_DETAIL_ID() {
        return BARCODE_DETAIL_ID;
    }

    public String getASN_NO() {
        return ASN_NO;
    }

    public Integer getRUNSHEET_DETAIL_NO() {
        return RUNSHEET_DETAIL_NO;
    }

    public String getBARCODE_DATA() {
        return BARCODE_DATA;
    }

    public Double getACTUAL_INHOUSE_PACKAGE_QTY() {
        return ACTUAL_INHOUSE_PACKAGE_QTY;
    }
}
