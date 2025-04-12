/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.payment.query;

public class QueryLPOtp {
    private String displayMessage;
    private String mD;
    private String otpdata;
    private String transactionId;

    public String getDisplayMessage() {
        return this.displayMessage;
    }

    public String getMD() {
        return this.mD;
    }

    public String getOtpdata() {
        return this.otpdata;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setDisplayMessage(String string2) {
        this.displayMessage = string2;
    }

    public void setMD(String string2) {
        this.mD = string2;
    }

    public void setOtpdata(String string2) {
        this.otpdata = string2;
    }

    public void setTransactionId(String string2) {
        this.transactionId = string2;
    }
}

