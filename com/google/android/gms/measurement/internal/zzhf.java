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

public final class zzhf {
    private final String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final /* synthetic */ zzha zze;

    public zzhf(zzha zzha2, String string2, long l2) {
        this.zze = zzha2;
        Preconditions.checkNotEmpty(string2);
        this.zza = string2;
        this.zzb = l2;
    }

    public final long zza() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            long l2;
            this.zzc = bl2 = true;
            SharedPreferences sharedPreferences2 = this.zze.zzg();
            String string2 = this.zza;
            long l3 = this.zzb;
            this.zzd = l2 = sharedPreferences2.getLong(string2, l3);
        }
        return this.zzd;
    }

    public final void zza(long l2) {
        SharedPreferences.Editor editor = this.zze.zzg().edit();
        String string2 = this.zza;
        editor.putLong(string2, l2);
        editor.apply();
        this.zzd = l2;
    }
}

