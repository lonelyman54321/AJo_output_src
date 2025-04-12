/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

public class QueryCodWithProductCode {
    private String cartId;
    private boolean isExchange;
    private String pincode;
    private boolean priorityDeliveryEnable;
    private String productCode;
    private int quantity;

    public String getCartId() {
        return this.cartId;
    }

    public String getPincode() {
        return this.pincode;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean isExchange() {
        return this.isExchange;
    }

    public boolean isPriorityDeliveryEnable() {
        return this.priorityDeliveryEnable;
    }

    public void setCartId(String string2) {
        this.cartId = string2;
    }

    public void setExchange(boolean bl2) {
        this.isExchange = bl2;
    }

    public void setPincode(String string2) {
        this.pincode = string2;
    }

    public void setPriorityDeliveryEnable(boolean bl2) {
        this.priorityDeliveryEnable = bl2;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }
}

