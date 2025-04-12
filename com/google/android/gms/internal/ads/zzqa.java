/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzpz;

public final class zzqa {
    public static final zzqa zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    static {
        zzpy zzpy2 = new zzpy();
        zza = zzpy2.zzd();
    }

    public /* synthetic */ zzqa(zzpy zzpy2, zzpz zzpz2) {
        boolean bl2;
        boolean bl3;
        this.zzb = bl3 = zzpy.zze(zzpy2);
        this.zzc = bl3 = zzpy.zzf(zzpy2);
        this.zzd = bl2 = zzpy.zzg(zzpy2);
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzqa> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzqa.class) == (clazz = object.getClass())) {
            boolean bl3;
            object = (zzqa)object;
            boolean bl4 = this.zzb;
            boolean bl5 = ((zzqa)object).zzb;
            if (bl4 == bl5 && (bl4 = this.zzc) == (bl5 = ((zzqa)object).zzc) && (bl4 = this.zzd) == (bl3 = ((zzqa)object).zzd)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzb;
        int n4 = this.zzc;
        int n7 = n3 << 2;
        int n8 = n4 + n4 + n7;
        int n10 = this.zzd;
        return n8 + n10;
    }
}

