/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution.parameters.providers;

import android.app.Application;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.usecase.StoreInstallReferrerUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class InstallReferrerProvider
extends StringPropertyProvider {
    private final Application app;
    private final ProviderType key;
    private final float order;
    private final StoreInstallReferrerUseCase storeInstallReferrerUseCase;

    public InstallReferrerProvider(Application object, StoreInstallReferrerUseCase storeInstallReferrerUseCase2) {
        Intrinsics.checkNotNullParameter(object, "app");
        Intrinsics.checkNotNullParameter(storeInstallReferrerUseCase2, "storeInstallReferrerUseCase");
        this.app = object;
        this.storeInstallReferrerUseCase = storeInstallReferrerUseCase2;
        this.order = 34.0f;
        object = ProviderType.REFERRER;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.storeInstallReferrerUseCase.getReferrer();
    }
}

