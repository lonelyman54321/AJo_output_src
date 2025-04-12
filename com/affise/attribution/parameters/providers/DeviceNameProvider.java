/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ContentResolver
 *  android.provider.Settings$Global
 */
package com.affise.attribution.parameters.providers;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceNameProvider
extends StringPropertyProvider {
    private final Application app;
    private final ProviderType key;
    private final float order;

    public DeviceNameProvider(Application object) {
        Intrinsics.checkNotNullParameter(object, "app");
        this.app = object;
        this.order = 41.0f;
        object = ProviderType.DEVICE_NAME;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return Settings.Global.getString((ContentResolver)this.app.getContentResolver(), (String)"device_name");
    }
}

