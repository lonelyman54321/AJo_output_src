/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.affise.attribution.parameters.providers;

import android.content.SharedPreferences;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.parameters.providers.RefTokenProvider$Companion;
import com.affise.attribution.utils.UUIDKt;
import kotlin.jvm.internal.Intrinsics;

public final class RefTokenProvider
extends StringPropertyProvider {
    public static final RefTokenProvider$Companion Companion;
    private static final String KEY = "com.affise.attribution.parameters.REFTOKEN";
    private final ProviderType key;
    private final float order;
    private final SharedPreferences preferences;

    static {
        RefTokenProvider$Companion refTokenProvider$Companion;
        Companion = refTokenProvider$Companion = new RefTokenProvider$Companion(null);
    }

    public RefTokenProvider(SharedPreferences object) {
        Intrinsics.checkNotNullParameter(object, "preferences");
        this.preferences = object;
        this.order = 32.0f;
        object = ProviderType.REFTOKEN;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        Object object = this.preferences;
        SharedPreferences.Editor editor = null;
        String string2 = KEY;
        if ((object = object.getString(string2, null)) == null) {
            object = UUIDKt.generateUUID().toString();
            Intrinsics.checkNotNullExpressionValue(object, "generateUUID().toString()");
            editor = this.preferences.edit();
            editor.putString(string2, (String)object);
            editor.commit();
        }
        return object;
    }
}

