/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.utils.UUIDKt;

public final class UuidProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public UuidProvider() {
        ProviderType providerType;
        this.order = 64.0f;
        this.key = providerType = ProviderType.UUID;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return UUIDKt.generateUUID().toString();
    }
}

