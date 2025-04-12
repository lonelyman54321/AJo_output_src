/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 */
package com.ril.ajio.services.data.search;

import android.text.Spannable;

public class SuggestionSearchModel
implements Comparable {
    private final String code;
    private String dataType;
    private Spannable highlightedText;
    private String imageUrl;
    private final boolean isAutoSuggested;
    private boolean isFromPreviousSearch;
    private String productCount;
    private final String query;
    private String storeType;
    private final String text;

    public SuggestionSearchModel(String string2, String string3, String string4, String string5, String string6, String string7, boolean bl2, Spannable spannable) {
        this.isFromPreviousSearch = false;
        this.text = string2;
        this.code = string3;
        this.query = string4;
        this.imageUrl = string5;
        this.dataType = string6;
        this.productCount = string7;
        this.isAutoSuggested = bl2;
        this.highlightedText = spannable;
    }

    public SuggestionSearchModel(String string2, String string3, String string4, boolean bl2) {
        this.productCount = "";
        this.isFromPreviousSearch = false;
        this.text = string2;
        this.code = string3;
        this.query = string4;
        this.isAutoSuggested = bl2;
    }

    public SuggestionSearchModel(String string2, String string3, String string4, boolean bl2, String string5, String string6) {
        this.productCount = "";
        this.isFromPreviousSearch = false;
        this.text = string2;
        this.code = string3;
        this.query = string4;
        this.isAutoSuggested = bl2;
        this.storeType = string5;
        this.imageUrl = string6;
    }

    public int compareTo(SuggestionSearchModel object) {
        String string2 = this.getText().toUpperCase();
        object = ((SuggestionSearchModel)object).getText().toUpperCase();
        return string2.compareTo((String)object);
    }

    public String getCode() {
        return this.code;
    }

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

    public String getQuery() {
        return this.query;
    }

    public String getStoreType() {
        return this.storeType;
    }

    public String getText() {
        return this.text;
    }

    public boolean isAutoSuggested() {
        return this.isAutoSuggested;
    }

    public boolean isFromPreviousSearch() {
        return this.isFromPreviousSearch;
    }

    public void setDataType(String string2) {
        this.dataType = string2;
    }

    public void setFromPreviousSearch(boolean bl2) {
        this.isFromPreviousSearch = bl2;
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

    public void setStoreType(String string2) {
        this.storeType = string2;
    }
}

