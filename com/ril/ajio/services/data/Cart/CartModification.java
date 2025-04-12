/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartItem;
import java.io.Serializable;

public class CartModification
implements CartItem,
Serializable {
    private CartEntry entry;
    private int quantity;
    private int quantityAdded;
    private String statusCode;
    private String voucherMessages;

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

    public String getVoucherMessages() {
        return this.voucherMessages;
    }

    public void setVoucherMessages(String string2) {
        this.voucherMessages = string2;
    }
}

