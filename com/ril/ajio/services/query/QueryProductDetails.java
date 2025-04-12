/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

public class QueryProductDetails {
    private boolean isBundleOfferAvailable;
    private boolean isRatingEnabled;
    private String[] options;
    private String productCode;
    private String storeId;
    private String unavailableSize;

    public String[] getOptions() {
        return this.options;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public String getUnavailableSize() {
        return this.unavailableSize;
    }

    public boolean isBundleOfferAvailable() {
        return this.isBundleOfferAvailable;
    }

    public boolean isRatingEnabled() {
        return this.isRatingEnabled;
    }

    public void setBundleOfferAvailable(boolean bl2) {
        this.isBundleOfferAvailable = bl2;
    }

    public void setOptions(String[] stringArray) {
        this.options = stringArray;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setRatingEnabled(boolean bl2) {
        this.isRatingEnabled = bl2;
    }

    public void setStoreId(String string2) {
        this.storeId = string2;
    }

    public void setUnavailableSize(String string2) {
        this.unavailableSize = string2;
    }
}

