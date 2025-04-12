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
import com.affise.attribution.parameters.providers.RefTokensProvider$Companion;
import com.affise.attribution.utils.UUIDKt;
import kotlin.jvm.internal.Intrinsics;

public final class RefTokensProvider
extends StringPropertyProvider {
    public static final RefTokensProvider$Companion Companion;
    private static final String KEY = "com.affise.attribution.parameters.REFTOKENS";
    private final ProviderType key;
    private final float order;
    private final SharedPreferences preferences;

    static {
        RefTokensProvider$Companion refTokensProvider$Companion;
        Companion = refTokensProvider$Companion = new RefTokensProvider$Companion(null);
    }

    public RefTokensProvider(SharedPreferences object) {
        Intrinsics.checkNotNullParameter(object, "preferences");
        this.preferences = object;
        this.order = 33.0f;
        object = ProviderType.REFTOKENS;
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

