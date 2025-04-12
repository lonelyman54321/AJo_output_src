/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdi;

public final class zzdj {
    public static final zzdj zza;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    public final int zzb;

    static {
        zzdj zzdj2;
        zzdi zzdi2 = new zzdi();
        zza = zzdj2 = new zzdj(zzdi2);
        int n3 = 36;
        zzc = Integer.toString(1, n3);
        zzd = Integer.toString(2, n3);
        zze = Integer.toString(3, n3);
    }

    private zzdj(zzdi zzdi2) {
        this.zzb = 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzdj> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzdj.class) == (clazz = object.getClass())) {
            object = (zzdj)object;
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return 29791;
    }
}

