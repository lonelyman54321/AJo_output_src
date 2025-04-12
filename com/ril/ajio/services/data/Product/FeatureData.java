/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.List;

public final class FeatureData
implements Serializable {
    private String code;
    private List featureValues;
    private String name;
    private String value = "";

    public final String getCode() {
        return this.code;
    }

    public final List getFeatureValues() {
        return this.featureValues;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setFeatureValues(List list) {
        this.featureValues = list;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }
}

