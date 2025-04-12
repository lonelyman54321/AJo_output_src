/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

import java.io.Serializable;

public class QueryOrderCancel
implements Serializable {
    private String cancelDescription;
    private String cancelReason;
    private String orderNo;
    private String productCode;
    private int productQuantity;

    public String getCancelDescription() {
        return this.cancelDescription;
    }

    public String getCancelReason() {
        return this.cancelReason;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public int getProductQuantity() {
        return this.productQuantity;
    }

    public void setCancelDescription(String string2) {
        this.cancelDescription = string2;
    }

    public void setCancelReason(String string2) {
        this.cancelReason = string2;
    }

    public void setOrderNo(String string2) {
        this.orderNo = string2;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setProductQuantity(int n3) {
        this.productQuantity = n3;
    }
}

