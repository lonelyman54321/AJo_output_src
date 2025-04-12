/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgix {
    public static final zzgix zza;
    public static final zzgix zzb;
    public static final zzgix zzc;
    public static final zzgix zzd;
    public static final zzgix zze;
    private final String zzf;

    static {
        zzgix zzgix2;
        zza = zzgix2 = new zzgix("SHA1");
        zzb = zzgix2 = new zzgix("SHA224");
        zzc = zzgix2 = new zzgix("SHA256");
        zzd = zzgix2 = new zzgix("SHA384");
        zze = zzgix2 = new zzgix("SHA512");
    }

    private zzgix(String string2) {
        this.zzf = string2;
    }

    public final String toString() {
        return this.zzf;
    }
}

