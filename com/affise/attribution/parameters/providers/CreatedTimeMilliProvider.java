/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.utils.TimestampKt;

public final class CreatedTimeMilliProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;

    public CreatedTimeMilliProvider() {
        ProviderType providerType;
        this.order = 19.0f;
        this.key = providerType = ProviderType.CREATED_TIME_MILLI;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        return TimestampKt.timestamp();
    }
}

