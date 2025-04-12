/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class EmptyStringProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public EmptyStringProvider(ProviderType providerType, float f5) {
        Intrinsics.checkNotNullParameter((Object)providerType, "key");
        this.key = providerType;
        this.order = f5;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return "";
    }
}

