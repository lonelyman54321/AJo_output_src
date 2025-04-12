/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgsd {
    public static final zzgsd zza;
    public static final zzgsd zzb;
    public static final zzgsd zzc;
    public static final zzgsd zzd;
    public static final zzgsd zze;
    private final String zzf;

    static {
        zzgsd zzgsd2;
        zza = zzgsd2 = new zzgsd("SHA1");
        zzb = zzgsd2 = new zzgsd("SHA224");
        zzc = zzgsd2 = new zzgsd("SHA256");
        zzd = zzgsd2 = new zzgsd("SHA384");
        zze = zzgsd2 = new zzgsd("SHA512");
    }

    private zzgsd(String string2) {
        this.zzf = string2;
    }

    public final String toString() {
        return this.zzf;
    }
}

