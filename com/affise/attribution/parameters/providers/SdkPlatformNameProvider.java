/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.internal.platform.InternalSdkPlatform;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;

public final class SdkPlatformNameProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public SdkPlatformNameProvider() {
        ProviderType providerType;
        this.order = 45.0f;
        this.key = providerType = ProviderType.SDK_PLATFORM;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return InternalSdkPlatform.INSTANCE.getInfo$attribution_release();
    }
}

