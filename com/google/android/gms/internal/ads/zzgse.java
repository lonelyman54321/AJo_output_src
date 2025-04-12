/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgse {
    public static final zzgse zza;
    public static final zzgse zzb;
    public static final zzgse zzc;
    public static final zzgse zzd;
    private final String zze;

    static {
        zzgse zzgse2;
        zza = zzgse2 = new zzgse("TINK");
        zzb = zzgse2 = new zzgse("CRUNCHY");
        zzc = zzgse2 = new zzgse("LEGACY");
        zzd = zzgse2 = new zzgse("NO_PREFIX");
    }

    private zzgse(String string2) {
        this.zze = string2;
    }

    public final String toString() {
        return this.zze;
    }
}

