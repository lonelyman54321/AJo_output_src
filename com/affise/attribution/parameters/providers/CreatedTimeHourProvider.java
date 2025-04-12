/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import java.util.Calendar;

public final class CreatedTimeHourProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;

    public CreatedTimeHourProvider() {
        ProviderType providerType;
        this.order = 20.0f;
        this.key = providerType = ProviderType.CREATED_TIME_HOUR;
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
        calendar.set(13, 0);
        calendar.set(12, 0);
        return calendar.getTimeInMillis();
    }
}

