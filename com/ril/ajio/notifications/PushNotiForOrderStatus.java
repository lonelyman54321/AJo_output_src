/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.notifications;

public class PushNotiForOrderStatus {
    private String orderID;
    private String orderStatus;
    private String orderStatusCode;
    private String uniqueID;

    public String getOrderID() {
        return this.orderID;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public String getOrderStatusCode() {
        return this.orderStatusCode;
    }

    public String getUniqueID() {
        return this.uniqueID;
    }

    public void setOrderID(String string2) {
        this.orderID = string2;
    }

    public void setOrderStatus(String string2) {
        this.orderStatus = string2;
    }

    public void setOrderStatusCode(String string2) {
        this.orderStatusCode = string2;
    }

    public void setUniqueID(String string2) {
        this.uniqueID = string2;
    }
}

