/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zzmz$zzc;
import sun.misc.Unsafe;

final class zzmz$zza
extends zzmz$zzc {
    public zzmz$zza(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object object, long l2) {
        return Double.longBitsToDouble(this.zze(object, l2));
    }

    public final void zza(Object object, long l2, byte by2) {
        boolean bl2 = zzmz.zza;
        if (bl2) {
            zzmz.zza(object, l2, by2);
            return;
        }
        zzmz.zzb(object, l2, by2);
    }

    public final void zza(Object object, long l2, double d2) {
        long l3 = Double.doubleToLongBits(d2);
        this.zza(object, l2, l3);
    }

    public final void zza(Object object, long l2, float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.zza(object, l2, n3);
    }

    public final void zza(Object object, long l2, boolean bl2) {
        boolean bl3 = zzmz.zza;
        if (bl3) {
            zzmz.zza(object, l2, bl2);
            return;
        }
        zzmz.zzb(object, l2, bl2);
    }

    public final float zzb(Object object, long l2) {
        return Float.intBitsToFloat(this.zzd(object, l2));
    }

    public final boolean zzc(Object object, long l2) {
        boolean bl2 = zzmz.zza;
        if (bl2) {
            return zzmz.zzf(object, l2);
        }
        return zzmz.zzg(object, l2);
    }
}

