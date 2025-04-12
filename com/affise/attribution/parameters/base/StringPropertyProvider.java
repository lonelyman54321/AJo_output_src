/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.base.PropertyProvider;

public abstract class StringPropertyProvider
extends PropertyProvider {
    private final String defaultValue;

    public StringPropertyProvider() {
        this.defaultValue = "";
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }
}

