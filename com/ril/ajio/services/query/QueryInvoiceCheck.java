/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

import java.io.Serializable;

public class QueryInvoiceCheck
implements Serializable {
    private String consignmentCode;
    private String invoiceNumber;
    private String orderCode;

    public String getConsignmentCode() {
        return this.consignmentCode;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setConsignmentCode(String string2) {
        this.consignmentCode = string2;
    }

    public void setInvoiceNumber(String string2) {
        this.invoiceNumber = string2;
    }

    public void setOrderCode(String string2) {
        this.orderCode = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("QueryInvoiceCheck{consignmentCode='");
        String string2 = this.consignmentCode;
        stringBuilder.append(string2);
        stringBuilder.append("', orderCode='");
        string2 = this.orderCode;
        stringBuilder.append(string2);
        stringBuilder.append("', invoiceNumber='");
        string2 = this.invoiceNumber;
        return h30_0.a(stringBuilder, string2, "'}");
    }
}

