/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CouponPromotion;

import java.io.Serializable;

public class CouponInfo
implements Serializable {
    String domainName;
    String endTime;
    int limitPerEnterprise;
    int limitPerUser;
    String startTime;

    public String getDomainName() {
        return this.domainName;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public int getLimitPerEnterprise() {
        return this.limitPerEnterprise;
    }

    public int getLimitPerUser() {
        return this.limitPerUser;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setDomainName(String string2) {
        this.domainName = string2;
    }

    public void setEndTime(String string2) {
        this.endTime = string2;
    }

    public void setLimitPerEnterprise(int n3) {
        this.limitPerEnterprise = n3;
    }

    public void setLimitPerUser(int n3) {
        this.limitPerUser = n3;
    }

    public void setStartTime(String string2) {
        this.startTime = string2;
    }
}

