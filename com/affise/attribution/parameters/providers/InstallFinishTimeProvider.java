/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

public final class InstallFinishTimeProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final FirstAppOpenUseCase useCase;

    public InstallFinishTimeProvider(FirstAppOpenUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 12.0f;
        object = ProviderType.INSTALL_FINISH_TIME;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        long l2;
        long l3;
        long l4;
        long l7;
        Comparable<Date> comparable = this.useCase.getFirstOpenDate();
        Comparable<Date> comparable2 = null;
        if (comparable != null && (l7 = (l4 = (l3 = ((Number)((Object)(comparable = Long.valueOf(((Date)comparable).getTime())))).longValue()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            comparable2 = comparable;
        }
        return comparable2;
    }
}

