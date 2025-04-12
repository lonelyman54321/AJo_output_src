/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zzig;

public final class zzij
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private /* synthetic */ zzig zza;

    public /* synthetic */ zzij(zzig zzig2) {
        this.zza = zzig2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String string2) {
        zzig.zza(this.zza, sharedPreferences2, string2);
    }
}

