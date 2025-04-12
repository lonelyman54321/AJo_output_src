/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.UiModeManager
 *  android.content.res.Configuration
 */
package com.affise.attribution.parameters.providers;

import android.app.Application;
import android.app.UiModeManager;
import android.content.res.Configuration;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class DeviceTypeProvider
extends StringPropertyProvider {
    private final Application app;
    private final ProviderType key;
    private final float order;

    public DeviceTypeProvider(Application object) {
        Intrinsics.checkNotNullParameter(object, "app");
        this.app = object;
        this.order = 42.0f;
        object = ProviderType.DEVICE_TYPE;
        this.key = object;
    }

    private final String detectDeviceTypeByUIMode() {
        int n3;
        Object object = this.app;
        String string2 = "uimode";
        object = object.getSystemService(string2);
        int n4 = object instanceof UiModeManager;
        String string3 = null;
        if (n4 != 0) {
            object = (UiModeManager)object;
        } else {
            n3 = 0;
            object = null;
        }
        if (object == null) {
            return null;
        }
        n3 = object.getCurrentModeType();
        if (n3 != (n4 = 3)) {
            n4 = 4;
            if (n3 == n4) {
                string3 = "tv";
            }
        } else {
            string3 = "car";
        }
        return string3;
    }

    private final boolean isTablet() {
        Configuration configuration = this.app.getResources().getConfiguration();
        int n3 = configuration.screenLayout & 0xF;
        int n4 = 3;
        if (n3 >= n4) {
            n3 = 1;
        } else {
            n3 = 0;
            configuration = null;
        }
        return n3 != 0;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        String string2 = this.detectDeviceTypeByUIMode();
        if (string2 == null) {
            boolean bl2 = this.isTablet();
            string2 = bl2 ? "tablet" : "smartphone";
        }
        return string2;
    }
}

