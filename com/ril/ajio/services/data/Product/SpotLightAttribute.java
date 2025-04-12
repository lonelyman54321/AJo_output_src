/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;

public final class SpotLightAttribute
implements Serializable {
    private String attributeName;
    private String attributeValue;

    public final String getAttributeName() {
        return this.attributeName;
    }

    public final String getAttributeValue() {
        return this.attributeValue;
    }

    public final void setAttributeName(String string2) {
        this.attributeName = string2;
    }

    public final void setAttributeValue(String string2) {
        this.attributeValue = string2;
    }
}

