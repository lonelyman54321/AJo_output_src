/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

public final class QueryImps {
    private final Boolean ajiowalletpage;
    private final String extnAmount;
    private final String extnBeneAccNo;
    private final String extnBeneCustomerMailId;
    private final String extnBeneIFSC;
    private final String extnBeneMobileNo;
    private final String extnReturnOrderNo;
    private final String extnSalesOrderNo;
    private final String isOTPVerified;

    public QueryImps(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2) {
        this.extnSalesOrderNo = string2;
        this.extnBeneAccNo = string3;
        this.extnBeneIFSC = string4;
        this.extnBeneMobileNo = string5;
        this.extnBeneCustomerMailId = string6;
        this.extnAmount = string7;
        this.extnReturnOrderNo = string8;
        this.isOTPVerified = string9;
        this.ajiowalletpage = bl2;
    }

    public final Boolean getAjiowalletpage() {
        return this.ajiowalletpage;
    }

    public final String getExtnAmount() {
        return this.extnAmount;
    }

    public final String getExtnBeneAccNo() {
        return this.extnBeneAccNo;
    }

    public final String getExtnBeneCustomerMailId() {
        return this.extnBeneCustomerMailId;
    }

    public final String getExtnBeneIFSC() {
        return this.extnBeneIFSC;
    }

    public final String getExtnBeneMobileNo() {
        return this.extnBeneMobileNo;
    }

    public final String getExtnReturnOrderNo() {
        return this.extnReturnOrderNo;
    }

    public final String getExtnSalesOrderNo() {
        return this.extnSalesOrderNo;
    }

    public final String isOTPVerified() {
        return this.isOTPVerified;
    }
}

