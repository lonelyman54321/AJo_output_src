/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;

public class CartPromotionClick
implements Serializable {
    private String action;
    private String label;
    private String url;

    public CartPromotionClick(String string2, String string3, String string4) {
        this.label = string3;
        this.url = string2;
        this.action = string4;
    }

    public String getAction() {
        return this.action;
    }

    public String getLabel() {
        return this.label;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAction(String string2) {
        this.action = string2;
    }

    public void setLabel(String string2) {
        this.label = string2;
    }

    public void setUrl(String string2) {
        this.url = string2;
    }
}

