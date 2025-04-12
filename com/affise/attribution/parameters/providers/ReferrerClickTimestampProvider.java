/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.referrer.AffiseReferrerData;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class ReferrerClickTimestampProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final StoreInstallReferrerUseCase useCase;

    public ReferrerClickTimestampProvider(StoreInstallReferrerUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 15.0f;
        object = ProviderType.REFERRER_CLICK_TIME;
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
        Object object = this.useCase.getInstallReferrerData();
        Object object2 = null;
        if (object != null && (l7 = (l4 = (l3 = ((Number)(object = Long.valueOf(((AffiseReferrerData)object).getReferrerClickTimestampSeconds()))).longValue()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            object2 = object;
        }
        return object2;
    }
}

