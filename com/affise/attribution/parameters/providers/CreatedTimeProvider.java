/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import java.util.Calendar;

public final class CreatedTimeProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;

    public CreatedTimeProvider() {
        ProviderType providerType;
        this.order = 18.0f;
        this.key = providerType = ProviderType.CREATED_TIME;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}

