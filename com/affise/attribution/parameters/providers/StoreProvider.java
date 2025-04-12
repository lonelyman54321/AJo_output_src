/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.usecase.StoreUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class StoreProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final StoreUseCase storeUseCase;

    public StoreProvider(StoreUseCase object) {
        Intrinsics.checkNotNullParameter(object, "storeUseCase");
        this.storeUseCase = object;
        this.order = 5.0f;
        object = ProviderType.STORE;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.storeUseCase.getStore();
    }
}

