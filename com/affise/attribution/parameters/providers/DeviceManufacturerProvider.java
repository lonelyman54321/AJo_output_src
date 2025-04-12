/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.build.BuildConfigPropertiesProvider;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceManufacturerProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final BuildConfigPropertiesProvider propertiesProvider;

    public DeviceManufacturerProvider(BuildConfigPropertiesProvider object) {
        Intrinsics.checkNotNullParameter(object, "propertiesProvider");
        this.propertiesProvider = object;
        this.order = 24.0f;
        object = ProviderType.DEVICE_MANUFACTURER;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.propertiesProvider.getManufacturer();
    }
}

