/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.parameters.providers;

import android.content.Context;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class AffisePackageAppNameProvider
extends StringPropertyProvider {
    private final Context context;
    private final ProviderType key;
    private final float order;

    public AffisePackageAppNameProvider(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.context = object;
        this.order = 2.0f;
        object = ProviderType.AFFISE_PKG_APP_NAME;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.context.getPackageName();
    }
}

