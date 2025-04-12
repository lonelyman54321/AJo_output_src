/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

public class ProductStockLevelStatus {
    public static final String CODE_OUT_OF_STOCK = "outOfStock";
    private String code;
    private String codeLowerCase;
    private boolean isResponseFromPE;
    private int quantity;
    private int quantityAdded;
    private String statusCode;

    public String getCode() {
        return this.code;
    }

    public String getCodeLowerCase() {
        return this.codeLowerCase;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getQuantityAdded() {
        return this.quantityAdded;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public boolean isResponseFromPE() {
        return this.isResponseFromPE;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setCodeLowerCase(String string2) {
        this.codeLowerCase = string2;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }

    public void setQuantityAdded(int n3) {
        this.quantityAdded = n3;
    }

    public void setResponseFromPE(boolean bl2) {
        this.isResponseFromPE = bl2;
    }

    public void setStatusCode(String string2) {
        this.statusCode = string2;
    }
}

