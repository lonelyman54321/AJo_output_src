/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.referrer.AffiseReferrerData;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class ReferrerInstallVersionProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final StoreInstallReferrerUseCase useCase;

    public ReferrerInstallVersionProvider(StoreInstallReferrerUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 13.0f;
        object = ProviderType.REFERRER_INSTALL_VERSION;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        Object object = this.useCase.getInstallReferrerData();
        object = object != null ? ((AffiseReferrerData)object).getInstallVersion() : null;
        return object;
    }
}

