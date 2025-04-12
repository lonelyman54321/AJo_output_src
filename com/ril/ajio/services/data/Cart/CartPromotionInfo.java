/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.CartConsumedEntry;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.CartPromotionDetail;
import java.io.Serializable;

public class CartPromotionInfo
implements Serializable {
    private CartConsumedEntry consumedEntry;
    private String description;
    private CartPromotionDetail promotion;

    public CartPromotionInfo(CartPromotion serializable, CartConsumedEntry cartConsumedEntry) {
        String string2;
        this.description = string2 = serializable.getDescription();
        serializable = serializable.getPromotion();
        this.promotion = serializable;
        this.consumedEntry = cartConsumedEntry;
    }

    public CartConsumedEntry getConsumedEntry() {
        return this.consumedEntry;
    }

    public String getDescription() {
        return this.description;
    }

    public CartPromotionDetail getPromotion() {
        return this.promotion;
    }

    public void setConsumedEntry(CartConsumedEntry cartConsumedEntry) {
        this.consumedEntry = cartConsumedEntry;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setPromotion(CartPromotionDetail cartPromotionDetail) {
        this.promotion = cartPromotionDetail;
    }
}

