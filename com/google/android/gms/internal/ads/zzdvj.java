/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzdvk;

public final class zzdvj
implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ zzdvk zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdvj(zzdvk zzdvk2, String string2) {
        this.zza = zzdvk2;
        this.zzb = string2;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String string2) {
        zzdvk zzdvk2 = this.zza;
        String string3 = this.zzb;
        zzdvk2.zzd(string3, sharedPreferences2, string2);
    }
}

