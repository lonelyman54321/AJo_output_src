/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgll {
    public static final zzgll zza;
    public static final zzgll zzb;
    public static final zzgll zzc;
    public static final zzgll zzd;
    public static final zzgll zze;
    public static final zzgll zzf;
    private final String zzg;

    static {
        zzgll zzgll2;
        zza = zzgll2 = new zzgll("ASSUME_AES_GCM");
        zzb = zzgll2 = new zzgll("ASSUME_XCHACHA20POLY1305");
        zzc = zzgll2 = new zzgll("ASSUME_CHACHA20POLY1305");
        zzd = zzgll2 = new zzgll("ASSUME_AES_CTR_HMAC");
        zze = zzgll2 = new zzgll("ASSUME_AES_EAX");
        zzf = zzgll2 = new zzgll("ASSUME_AES_GCM_SIV");
    }

    private zzgll(String string2) {
        this.zzg = string2;
    }

    public final String toString() {
        return this.zzg;
    }
}

