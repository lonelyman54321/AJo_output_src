/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zze;
import com.google.android.gms.internal.ads.zzi;
import com.google.android.gms.internal.ads.zzj;
import com.google.android.gms.internal.ads.zzn;

public final class zzk {
    public static final zzk zza;
    public static final zzn zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    private static final String zzg;
    private zzi zzh;

    static {
        zzk zzk2;
        Object object = zzk2;
        zza = zzk2 = new zzk(0, 0, 1, 1, 0, null);
        int n3 = 36;
        zzc = Integer.toString(0, n3);
        zzd = Integer.toString(1, n3);
        zze = Integer.toString(2, n3);
        zzf = Integer.toString(3, n3);
        zzg = Integer.toString(4, n3);
        zzb = object = new zze();
    }

    public /* synthetic */ zzk(int n3, int n4, int n7, int n8, int n10, zzj zzj2) {
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzk> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzk.class) == (clazz = object.getClass())) {
            object = (zzk)object;
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return 486696559;
    }

    public final zzi zza() {
        zzi zzi2 = this.zzh;
        if (zzi2 == null) {
            this.zzh = zzi2 = new zzi(this, null);
        }
        return this.zzh;
    }
}

