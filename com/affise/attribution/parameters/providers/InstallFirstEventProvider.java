/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.BooleanPropertyProvider;
import com.affise.attribution.usecase.FirstAppOpenUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class InstallFirstEventProvider
extends BooleanPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final FirstAppOpenUseCase useCase;

    public InstallFirstEventProvider(FirstAppOpenUseCase object) {
        Intrinsics.checkNotNullParameter(object, "useCase");
        this.useCase = object;
        this.order = 10.0f;
        object = ProviderType.INSTALL_FIRST_EVENT;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Boolean provide() {
        return this.useCase.isFirstOpen();
    }
}

