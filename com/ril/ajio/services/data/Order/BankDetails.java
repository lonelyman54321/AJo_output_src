/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class BankDetails
implements Serializable {
    private String accNo;
    private String confirmAccNo;
    private Boolean encryptedAccountInfo;
    private String ifsc;
    private String refundType;

    public String getAccNo() {
        return this.accNo;
    }

    public String getConfirmAccNo() {
        return this.confirmAccNo;
    }

    public Boolean getEncryptedAccountInfo() {
        return this.encryptedAccountInfo;
    }

    public String getIfsc() {
        return this.ifsc;
    }

    public String getRefundType() {
        return this.refundType;
    }

    public void setAccNo(String string2) {
        this.accNo = string2;
    }

    public void setConfirmAccNo(String string2) {
        this.confirmAccNo = string2;
    }

    public void setEncryptedAccountInfo(Boolean bl2) {
        this.encryptedAccountInfo = bl2;
    }

    public void setIfsc(String string2) {
        this.ifsc = string2;
    }

    public void setRefundType(String string2) {
        this.refundType = string2;
    }
}

