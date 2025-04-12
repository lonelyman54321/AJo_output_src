/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.BooleanPropertyProvider;
import com.affise.attribution.usecase.DeviceUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class IsEmulatorProvider
extends BooleanPropertyProvider {
    private final DeviceUseCase deviceUseCase;
    private final ProviderType key;
    private final float order;

    public IsEmulatorProvider(DeviceUseCase object) {
        Intrinsics.checkNotNullParameter(object, "deviceUseCase");
        this.deviceUseCase = object;
        this.order = 67.0f;
        object = ProviderType.IS_EMULATOR;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Boolean provide() {
        return this.deviceUseCase.isEmulator();
    }
}

