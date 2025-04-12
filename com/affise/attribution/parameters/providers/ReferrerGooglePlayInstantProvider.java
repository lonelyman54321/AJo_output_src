/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.BooleanPropertyProvider;
import com.affise.attribution.referrer.AffiseReferrerData;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class ReferrerGooglePlayInstantProvider
extends BooleanPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final StoreInstallReferrerUseCase referrerUseCase;

    public ReferrerGooglePlayInstantProvider(StoreInstallReferrerUseCase object) {
        Intrinsics.checkNotNullParameter(object, "referrerUseCase");
        this.referrerUseCase = object;
        this.order = 17.0f;
        object = ProviderType.REFERRER_GOOGLE_PLAY_INSTANT;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Boolean provide() {
        Object object = this.referrerUseCase.getInstallReferrerData();
        if (object != null) {
            boolean bl2 = ((AffiseReferrerData)object).getGooglePlayInstantParam();
            object = bl2;
        } else {
            boolean bl3 = false;
            object = null;
        }
        return object;
    }
}

