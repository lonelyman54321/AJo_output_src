/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import java.util.Locale;

public final class RegionProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public RegionProvider() {
        ProviderType providerType;
        this.order = 38.0f;
        this.key = providerType = ProviderType.REGION;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return Locale.getDefault().getCountry();
    }
}

