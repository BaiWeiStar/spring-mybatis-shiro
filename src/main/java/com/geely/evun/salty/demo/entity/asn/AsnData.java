package com.geely.evun.salty.demo.entity.asn;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by hangjie.lou on 2017/8/20.
 */
@XStreamAlias("DATA")
public class AsnData {
    @XStreamAlias("ASNMST")
    private Asnmst asnmst;

    public Asnmst getAsnmst() {
        return asnmst;
    }
}
