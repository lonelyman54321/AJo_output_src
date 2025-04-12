/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.build.BuildConfigPropertiesProvider;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class ApiLevelOSProvider
extends StringPropertyProvider {
    private final BuildConfigPropertiesProvider buildConfigPropertiesProvider;
    private final ProviderType key;
    private final float order;

    public ApiLevelOSProvider(BuildConfigPropertiesProvider object) {
        Intrinsics.checkNotNullParameter(object, "buildConfigPropertiesProvider");
        this.buildConfigPropertiesProvider = object;
        this.order = 46.0f;
        object = ProviderType.API_LEVEL_OS;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return String.valueOf(this.buildConfigPropertiesProvider.getSDKVersion());
    }
}

