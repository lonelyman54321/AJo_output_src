/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.base;

import com.affise.attribution.parameters.base.Provider;

public abstract class PropertyProvider
implements Provider {
    public abstract Object getDefaultValue();

    public abstract Object provide();

    public final Object provideWithDefault() {
        Object object = this.provide();
        if (object == null) {
            object = this.getDefaultValue();
        }
        return object;
    }
}

