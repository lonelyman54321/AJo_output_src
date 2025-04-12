/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.payment.query;

public class QueryResendOtp {
    private String splitUpId;
    private String transactionId;

    public String getSplitUpId() {
        return this.splitUpId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setSplitUpId(String string2) {
        this.splitUpId = string2;
    }

    public void setTransactionId(String string2) {
        this.transactionId = string2;
    }
}

