/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;

public final class zzmr {
    public static final zzmr zza;
    public static final zzmr zzb;
    public static final zzmr zzc;
    public static final zzmr zzd;
    public static final zzmr zze;
    public final long zzf;
    public final long zzg;

    static {
        zzmr zzmr2;
        zzmr zzmr3;
        long l2 = 0L;
        zza = zzmr3 = new zzmr(l2, l2);
        long l3 = Long.MAX_VALUE;
        zzb = zzmr2 = new zzmr(l3, l3);
        zzc = zzmr2 = new zzmr(l3, l2);
        zzd = zzmr2 = new zzmr(l2, l3);
        zze = zzmr3;
    }

    public zzmr(long l2, long l3) {
        boolean bl2 = false;
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        l7 = l7 >= 0 ? (long)1 : (long)0;
        zzeq.zzd((boolean)l7);
        l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 >= 0) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zzf = l2;
        this.zzg = l3;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzmr> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzmr.class) == (clazz = object.getClass())) {
            long l2;
            long l3;
            object = (zzmr)object;
            long l4 = this.zzf;
            long l7 = ((zzmr)object).zzf;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 == false && (l3 = (l2 = (l4 = this.zzg) - (l7 = ((zzmr)object).zzg)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (int)this.zzf;
        long l2 = this.zzg;
        int n4 = (int)l2;
        return (n3 *= 31) + n4;
    }
}

