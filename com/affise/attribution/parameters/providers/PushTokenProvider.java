/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.affise.attribution.parameters.providers;

import android.content.SharedPreferences;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.parameters.providers.PushTokenProvider$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class PushTokenProvider
extends StringPropertyProvider {
    public static final PushTokenProvider$Companion Companion;
    public static final String KEY_APP_PUSHTOKEN = "com.affise.attribution.init.PUSHTOKEN";
    private final ProviderType key;
    private final float order;
    private final SharedPreferences preferences;

    static {
        PushTokenProvider$Companion pushTokenProvider$Companion;
        Companion = pushTokenProvider$Companion = new PushTokenProvider$Companion(null);
    }

    public PushTokenProvider(SharedPreferences object) {
        Intrinsics.checkNotNullParameter(object, "preferences");
        this.preferences = object;
        this.order = 65.0f;
        object = ProviderType.PUSHTOKEN;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return this.preferences.getString(KEY_APP_PUSHTOKEN, null);
    }
}

