/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.build.BuildConfigPropertiesProvider;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class OSVersionProvider
extends StringPropertyProvider {
    private final BuildConfigPropertiesProvider buildConfigPropertiesProvider;
    private final ProviderType key;
    private final float order;

    public OSVersionProvider(BuildConfigPropertiesProvider object) {
        Intrinsics.checkNotNullParameter(object, "buildConfigPropertiesProvider");
        this.buildConfigPropertiesProvider = object;
        this.order = 48.0f;
        object = ProviderType.OS_VERSION;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.buildConfigPropertiesProvider.getReleaseName();
    }
}

