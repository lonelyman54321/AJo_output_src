/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

import java.io.Serializable;

public class QueryText
implements Serializable {
    private String brandCode = null;
    private String queryText = "";
    private String storeId = null;

    public String getBrandCode() {
        return this.brandCode;
    }

    public String getQueryText() {
        return this.queryText;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setBrandCode(String string2) {
        this.brandCode = string2;
    }

    public void setQueryText(String string2) {
        this.queryText = string2;
    }

    public void setStoreId(String string2) {
        this.storeId = string2;
    }
}

