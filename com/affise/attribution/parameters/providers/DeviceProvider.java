/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.usecase.RemarketingUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final RemarketingUseCase useCase;

    public DeviceProvider(RemarketingUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 69.0f;
        object = ProviderType.DEVICE;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.useCase.getDevice();
    }
}

