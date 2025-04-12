/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.internal.zzju;

public final class zzkh
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private /* synthetic */ zzju zza;

    public /* synthetic */ zzkh(zzju zzju2) {
        this.zza = zzju2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String string2) {
        zzju.zza(this.zza, sharedPreferences2, string2);
    }
}

