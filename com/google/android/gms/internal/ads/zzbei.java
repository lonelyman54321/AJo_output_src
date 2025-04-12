/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.zzm;

public final class zzbei {
    public static final SharedPreferences zza(Context context) {
        String string2 = "google_ads_flags";
        try {
            return context.getSharedPreferences(string2, 0);
        }
        catch (IllegalStateException illegalStateException) {
            zzm.zzk("", illegalStateException);
            return null;
        }
    }
}

