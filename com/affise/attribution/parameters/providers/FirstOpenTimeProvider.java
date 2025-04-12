/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

public final class FirstOpenTimeProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final FirstAppOpenUseCase useCase;

    public FirstOpenTimeProvider(FirstAppOpenUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 7.0f;
        object = ProviderType.FIRST_OPEN_TIME;
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
        if (comparable != null) {
            long l2 = comparable.getTime();
            comparable = l2;
        } else {
            comparable = null;
        }
        return comparable;
    }
}

