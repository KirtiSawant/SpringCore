package com.CoreSpring.Annotation.Required;

import org.springframework.beans.factory.annotation.Required;

public class Company {
    private Integer cid;
    private String cname;


    public Integer getCid() {
        return cid;
    }

    @Required
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    @Required
    public void setCname(String cname) {
        this.cname = cname;
    }

    public String toString() {
        return "Company [cid=" + cid + ",cname=" + cname + "]";

    }
}
