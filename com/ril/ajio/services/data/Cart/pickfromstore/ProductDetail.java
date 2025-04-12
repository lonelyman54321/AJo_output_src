/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart.pickfromstore;

import java.io.Serializable;

public class ProductDetail
implements Serializable {
    private int availableQuantity;
    private Boolean pickFromStore;
    private String productCode;

    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public Boolean getPickFromStore() {
        return this.pickFromStore;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setAvailableQuantity(int n3) {
        this.availableQuantity = n3;
    }

    public void setPickFromStore(Boolean bl2) {
        this.pickFromStore = bl2;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }
}

