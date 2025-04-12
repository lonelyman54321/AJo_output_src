/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgrl {
    public static final zzgrl zza;
    public static final zzgrl zzb;
    public static final zzgrl zzc;
    public static final zzgrl zzd;
    private final String zze;

    static {
        zzgrl zzgrl2;
        zza = zzgrl2 = new zzgrl("TINK");
        zzb = zzgrl2 = new zzgrl("CRUNCHY");
        zzc = zzgrl2 = new zzgrl("LEGACY");
        zzd = zzgrl2 = new zzgrl("NO_PREFIX");
    }

    private zzgrl(String string2) {
        this.zze = string2;
    }

    public final String toString() {
        return this.zze;
    }
}

