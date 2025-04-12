/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;

public final class PlatformNameProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public PlatformNameProvider() {
        ProviderType providerType;
        this.order = 44.0f;
        this.key = providerType = ProviderType.PLATFORM;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return "android";
    }
}

