/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzma;
import com.google.android.gms.internal.vision.zzma$zzd;
import sun.misc.Unsafe;

final class zzma$zzc
extends zzma$zzd {
    public zzma$zzc(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte zza(Object object, long l2) {
        boolean bl2 = zzma.zza;
        if (bl2) {
            return zzma.zzg(object, l2);
        }
        return zzma.zzh(object, l2);
    }

    public final void zza(Object object, long l2, byte by2) {
        boolean bl2 = zzma.zza;
        if (bl2) {
            zzma.zza(object, l2, by2);
            return;
        }
        zzma.zzb(object, l2, by2);
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
        boolean bl3 = zzma.zza;
        if (bl3) {
            zzma.zzb(object, l2, bl2);
            return;
        }
        zzma.zzc(object, l2, bl2);
    }

    public final boolean zzb(Object object, long l2) {
        boolean bl2 = zzma.zza;
        if (bl2) {
            return zzma.zzi(object, l2);
        }
        return zzma.zzj(object, l2);
    }

    public final float zzc(Object object, long l2) {
        return Float.intBitsToFloat(this.zze(object, l2));
    }

    public final double zzd(Object object, long l2) {
        return Double.longBitsToDouble(this.zzf(object, l2));
    }
}

