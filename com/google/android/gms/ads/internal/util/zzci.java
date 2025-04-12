/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  android.webkit.WebSettings
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;

public final class zzci
implements Callable {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzci(Context context) {
        this.zza = context;
    }

    public final Object call() {
        String string2;
        Object object = this.zza;
        String string3 = "admob_user_agent";
        SharedPreferences sharedPreferences2 = object.getSharedPreferences(string3, 0);
        String string4 = sharedPreferences2.getString(string2 = "user_agent", "");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string4);
        if (bl2) {
            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
            string4 = WebSettings.getDefaultUserAgent((Context)object);
            sharedPreferences2 = sharedPreferences2.edit().putString(string2, string4);
            SharedPreferencesUtils.publishWorldReadableSharedPreferences(object, (SharedPreferences.Editor)sharedPreferences2, string3);
        } else {
            object = "User agent is already initialized on Google Play Services.";
            zze.zza((String)object);
        }
        return string4;
    }
}

