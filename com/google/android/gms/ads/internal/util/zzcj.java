/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.webkit.WebSettings
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Callable;

public final class zzcj
implements Callable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzcj(Context context, Context context2) {
        this.zza = context;
        this.zzb = context2;
    }

    public final Object call() {
        String string2;
        Object object = this.zza;
        Context context = this.zzb;
        String string3 = "admob_user_agent";
        boolean bl2 = false;
        if (object != null) {
            string2 = "Attempting to read user agent from Google Play Services.";
            zze.zza(string2);
            object = object.getSharedPreferences(string3, 0);
        } else {
            zze.zza("Attempting to read user agent from local cache.");
            object = context.getSharedPreferences(string3, 0);
            bl2 = true;
        }
        string2 = "user_agent";
        string3 = object.getString(string2, "");
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (bl3) {
            zze.zza("Reading user agent from WebSettings");
            string3 = WebSettings.getDefaultUserAgent((Context)context);
            if (bl2) {
                object.edit().putString(string2, string3).apply();
                object = "Persisting user agent.";
                zze.zza((String)object);
            }
        }
        return string3;
    }
}

