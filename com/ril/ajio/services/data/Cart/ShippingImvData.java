/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;

public class ShippingImvData
implements Serializable {
    private boolean displayOverlay;
    private String imageUrl;
    private String productTag;

    public ShippingImvData(String string2, String string3, boolean bl2) {
        this.imageUrl = string2;
        this.productTag = string3;
        this.displayOverlay = bl2;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getProductTag() {
        return this.productTag;
    }

    public boolean isDisplayOverlay() {
        return this.displayOverlay;
    }

    public void setDisplayOverlay(boolean bl2) {
        this.displayOverlay = bl2;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setProductTag(String string2) {
        this.productTag = string2;
    }
}

