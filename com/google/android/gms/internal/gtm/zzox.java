/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

public final class zzox {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final String zze;
    private final String zzf;

    public zzox(String string2, String string3, String string4, boolean bl2, String string5, String string6) {
        Preconditions.checkNotNull(string2);
        string6 = "";
        Preconditions.checkNotNull(string6);
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = bl2;
        this.zze = string5;
        this.zzf = string6;
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        String string2 = this.zzc;
        if (string2 != null) {
            String string3 = this.zza;
            String string4 = "_";
            string2 = n1.a(string2, string4, string3);
        } else {
            string2 = this.zza;
        }
        return string2;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzd;
    }
}

