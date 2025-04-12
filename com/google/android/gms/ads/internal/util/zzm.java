/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzt;

public final class zzm
implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ zzt zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzm(zzt zzt2, Context context, String string2) {
        this.zza = zzt2;
        this.zzb = context;
        this.zzc = string2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String string2) {
        zzt zzt2 = this.zza;
        Context context = this.zzb;
        String string3 = this.zzc;
        zzt2.zzg(context, string3, sharedPreferences2, string2);
    }
}

