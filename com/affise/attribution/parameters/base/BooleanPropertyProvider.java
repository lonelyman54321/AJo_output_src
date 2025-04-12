/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.base.PropertyProvider;

public abstract class BooleanPropertyProvider
extends PropertyProvider {
    private final boolean defaultValue;

    public Boolean getDefaultValue() {
        return this.defaultValue;
    }
}

