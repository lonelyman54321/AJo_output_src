/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzfyw;

public final class zzbej
implements zzfyw {
    public final /* synthetic */ SharedPreferences zza;

    public /* synthetic */ zzbej(SharedPreferences sharedPreferences2) {
        this.zza = sharedPreferences2;
    }

    public final Object zza() {
        return this.zza.getString("app_settings_json", "{}");
    }
}

