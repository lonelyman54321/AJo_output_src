/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.List;

public final class SectionData
implements Serializable {
    private List featureData;
    private String title;

    public final List getFeatureData() {
        return this.featureData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setFeatureData(List list) {
        this.featureData = list;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }
}

