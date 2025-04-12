/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzha;

public final class zzhd {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final /* synthetic */ zzha zze;

    public zzhd(zzha zzha2, String string2, boolean bl2) {
        this.zze = zzha2;
        Preconditions.checkNotEmpty(string2);
        this.zza = string2;
        this.zzb = bl2;
    }

    public final void zza(boolean bl2) {
        SharedPreferences.Editor editor = this.zze.zzg().edit();
        String string2 = this.zza;
        editor.putBoolean(string2, bl2);
        editor.apply();
        this.zzd = bl2;
    }

    public final boolean zza() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            this.zzc = true;
            SharedPreferences sharedPreferences2 = this.zze.zzg();
            String string2 = this.zza;
            boolean bl3 = this.zzb;
            this.zzd = bl2 = sharedPreferences2.getBoolean(string2, bl3);
        }
        return this.zzd;
    }
}

