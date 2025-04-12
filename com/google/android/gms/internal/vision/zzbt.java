/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.internal.vision;

import android.content.SharedPreferences;
import com.google.android.gms.internal.vision.zzbq;

final class zzbt
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final zzbq zza;

    public zzbt(zzbq zzbq2) {
        this.zza = zzbq2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String string2) {
        this.zza.zza(sharedPreferences2, string2);
    }
}

