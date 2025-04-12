/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

public class QueryCart {
    private int cartEntryNumber;
    private String cartId;
    private String commercialType;
    private String imsBatchId;
    private String productCode;
    private int quantity;

    public int getCartEntryNumber() {
        return this.cartEntryNumber;
    }

    public String getCartId() {
        return this.cartId;
    }

    public String getCommercialType() {
        return this.commercialType;
    }

    public String getImsBatchId() {
        return this.imsBatchId;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setCartEntryNumber(int n3) {
        this.cartEntryNumber = n3;
    }

    public void setCartId(String string2) {
        this.cartId = string2;
    }

    public void setCommercialType(String string2) {
        this.commercialType = string2;
    }

    public void setImsBatchId(String string2) {
        this.imsBatchId = string2;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }
}

