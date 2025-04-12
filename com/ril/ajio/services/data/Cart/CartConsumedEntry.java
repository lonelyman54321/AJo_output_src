/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;

public class CartConsumedEntry
implements Serializable {
    private float adjustedUnitPrice;
    private int orderEntryNumber;
    private int quantity;

    public float getAdjustedUnitPrice() {
        return this.adjustedUnitPrice;
    }

    public int getOrderEntryNumber() {
        return this.orderEntryNumber;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setAdjustedUnitPrice(float f5) {
        this.adjustedUnitPrice = f5;
    }

    public void setOrderEntryNumber(int n3) {
        this.orderEntryNumber = n3;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }
}

