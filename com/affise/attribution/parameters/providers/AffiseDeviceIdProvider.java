/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseDeviceIdProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final FirstAppOpenUseCase useCase;

    public AffiseDeviceIdProvider(FirstAppOpenUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 27.0f;
        object = ProviderType.AFFISE_DEVICE_ID;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.useCase.getAffiseDeviseId();
    }
}

