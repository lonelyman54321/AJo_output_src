/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import java.io.Serializable;

public final class VariantOptionQualifiers
implements Serializable {
    private String name;
    private String value;

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }
}

