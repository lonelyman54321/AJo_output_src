/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.referrer.AffiseReferrerData;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralTimeProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final StoreInstallReferrerUseCase referrerUseCase;

    public ReferralTimeProvider(StoreInstallReferrerUseCase object) {
        Intrinsics.checkNotNullParameter(object, "referrerUseCase");
        this.referrerUseCase = object;
        this.order = 14.0f;
        object = ProviderType.REFERRAL_TIME;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        Object object = this.referrerUseCase.getInstallReferrerData();
        if (object != null) {
            long l2 = ((AffiseReferrerData)object).getInstallBeginTimestampServerSeconds();
            object = l2;
        } else {
            object = null;
        }
        return object;
    }
}

