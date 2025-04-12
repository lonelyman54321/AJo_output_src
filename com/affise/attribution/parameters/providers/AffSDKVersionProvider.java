/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;

public final class AffSDKVersionProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public AffSDKVersionProvider() {
        ProviderType providerType;
        this.order = 47.0f;
        this.key = providerType = ProviderType.AFFISE_SDK_VERSION;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return "1.6.52 build (04-02-2025 13:01)";
    }
}

