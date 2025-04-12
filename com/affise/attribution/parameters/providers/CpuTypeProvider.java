/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.build.BuildConfigPropertiesProvider;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class CpuTypeProvider
extends StringPropertyProvider {
    private final BuildConfigPropertiesProvider buildPropertiesProvider;
    private final ProviderType key;
    private final float order;

    public CpuTypeProvider(BuildConfigPropertiesProvider object) {
        Intrinsics.checkNotNullParameter(object, "buildPropertiesProvider");
        this.buildPropertiesProvider = object;
        this.order = 22.0f;
        object = ProviderType.CPU_TYPE;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        List list = this.buildPropertiesProvider.getSupportedABIs();
        return CollectionsKt.R(list, null, null, null, null, 63);
    }
}

