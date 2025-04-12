/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences$Editor
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzha;

public final class zzhh {
    private final String zza;
    private boolean zzb;
    private String zzc;
    private final /* synthetic */ zzha zzd;

    public zzhh(zzha zzha2, String string2, String string3) {
        this.zzd = zzha2;
        Preconditions.checkNotEmpty(string2);
        this.zza = string2;
    }

    public final String zza() {
        boolean bl2 = this.zzb;
        if (!bl2) {
            this.zzb = bl2 = true;
            Object object = this.zzd.zzg();
            String string2 = this.zza;
            object = object.getString(string2, null);
            this.zzc = object;
        }
        return this.zzc;
    }

    public final void zza(String string2) {
        SharedPreferences.Editor editor = this.zzd.zzg().edit();
        String string3 = this.zza;
        editor.putString(string3, string2);
        editor.apply();
        this.zzc = string2;
    }
}

