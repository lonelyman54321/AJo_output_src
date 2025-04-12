/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Price;

public class CartIdDetails {
    private String code;
    private String guid;
    private int totalItems;
    private Price totalPrice;
    private Price totalPriceWithTax;
    private String type;

    public String getCode() {
        return this.code;
    }

    public String getGuid() {
        return this.guid;
    }

    public int getTotalItems() {
        return this.totalItems;
    }

    public Price getTotalPrice() {
        return this.totalPrice;
    }

    public Price getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    public String getType() {
        return this.type;
    }
}

