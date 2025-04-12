/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

public final class FirstOpenHourProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final FirstAppOpenUseCase useCase;

    public FirstOpenHourProvider(FirstAppOpenUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 9.0f;
        object = ProviderType.FIRST_OPEN_HOUR;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        Comparable<Date> comparable = this.useCase.getFirstOpenDate();
        Long l2 = null;
        if (comparable != null) {
            int n3;
            long l3;
            long l4 = ((Number)((Object)(comparable = Long.valueOf(((Date)comparable).getTime())))).longValue();
            long l7 = l4 - (l3 = 0L);
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object == false) {
                n3 = 0;
                comparable = null;
            }
            if (comparable != null) {
                long l8 = ((Number)((Object)comparable)).longValue();
                Calendar calendar = Calendar.getInstance();
                Date date = new Date(l8);
                calendar.setTime(date);
                calendar.set(14, 0);
                calendar.set(13, 0);
                n3 = 12;
                calendar.set(n3, 0);
                l8 = calendar.getTimeInMillis();
                l2 = l8;
            }
        }
        return l2;
    }
}

