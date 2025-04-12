/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.payment.query;

public class QueryLPBalance {
    private String cardNumber;
    private String isLRManaged;
    private String mobile;
    private String payId;

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getIsLRManaged() {
        return this.isLRManaged;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getPayId() {
        return this.payId;
    }

    public void setCardNumber(String string2) {
        this.cardNumber = string2;
    }

    public void setIsLRManaged(String string2) {
        this.isLRManaged = string2;
    }

    public void setMobile(String string2) {
        this.mobile = string2;
    }

    public void setPayId(String string2) {
        this.payId = string2;
    }
}

