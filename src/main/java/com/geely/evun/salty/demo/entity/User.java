package com.geely.evun.salty.demo.entity;

import java.util.Date;

public class User {
    private String cid;

    private Date ccreatedatetime;

    private Date cmodifydatetime;

    private String cname;

    private String cpwd;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Date getCcreatedatetime() {
        return ccreatedatetime;
    }

    public void setCcreatedatetime(Date ccreatedatetime) {
        this.ccreatedatetime = ccreatedatetime;
    }

    public Date getCmodifydatetime() {
        return cmodifydatetime;
    }

    public void setCmodifydatetime(Date cmodifydatetime) {
        this.cmodifydatetime = cmodifydatetime;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd == null ? null : cpwd.trim();
    }
}