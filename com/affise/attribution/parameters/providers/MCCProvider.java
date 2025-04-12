/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution.parameters.providers;

import android.app.Application;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class MCCProvider
extends StringPropertyProvider {
    private final Application app;
    private final ProviderType key;
    private final float order;

    public MCCProvider(Application object) {
        Intrinsics.checkNotNullParameter(object, "app");
        this.app = object;
        this.order = 36.0f;
        object = ProviderType.MCCODE;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return String.valueOf(this.app.getResources().getConfiguration().mcc);
    }
}

