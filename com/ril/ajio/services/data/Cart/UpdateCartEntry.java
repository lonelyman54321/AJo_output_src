/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.CartEntry;

public class UpdateCartEntry {
    private CartEntry entry;
    private int quantity;
    private int quantityAdded;
    private String statusCode;

    public CartEntry getEntry() {
        return this.entry;
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
}

