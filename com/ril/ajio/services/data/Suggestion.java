/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 */
package com.ril.ajio.services.data;

import android.text.Spannable;

public class Suggestion {
    private String dataType;
    private Spannable highlightedText;
    private String imageUrl;
    private String productCount = "";
    private String url;
    private String value;

    public String getDataType() {
        return this.dataType;
    }

    public Spannable getHighlightedText() {
        return this.highlightedText;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getProductCount() {
        return this.productCount;
    }

    public String getUrl() {
        return this.url;
    }

    public String getValue() {
        return this.value;
    }

    public void setDataType(String string2) {
        this.dataType = string2;
    }

    public void setHighlightedText(Spannable spannable) {
        this.highlightedText = spannable;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setProductCount(String string2) {
        this.productCount = string2;
    }

    public void setUrl(String string2) {
        this.url = string2;
    }

    public void setValue(String string2) {
        this.value = string2;
    }
}

