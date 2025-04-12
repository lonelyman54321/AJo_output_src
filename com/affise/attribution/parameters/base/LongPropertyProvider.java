/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.base.PropertyProvider;

public abstract class LongPropertyProvider
extends PropertyProvider {
    private final long defaultValue;

    public Long getDefaultValue() {
        return this.defaultValue;
    }
}

