/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzfm;
import com.google.android.gms.internal.icing.zzfn;
import sun.misc.Unsafe;

final class zzfk
extends zzfm {
    public zzfk(Unsafe unsafe) {
        super(unsafe);
    }

    public final void zza(Object object, long l2, byte by2) {
        boolean bl2 = zzfn.zzb;
        if (bl2) {
            zzfn.zzt(object, l2, by2);
            return;
        }
        zzfn.zzu(object, l2, by2);
    }

    public final boolean zzb(Object object, long l2) {
        boolean bl2 = zzfn.zzb;
        if (bl2) {
            return zzfn.zzv(object, l2);
        }
        return zzfn.zzw(object, l2);
    }

    public final void zzc(Object object, long l2, boolean bl2) {
        boolean bl3 = zzfn.zzb;
        if (bl3) {
            zzfn.zzx(object, l2, bl2);
            return;
        }
        zzfn.zzy(object, l2, bl2);
    }

    public final float zzd(Object object, long l2) {
        return Float.intBitsToFloat(this.zzk(object, l2));
    }

    public final void zze(Object object, long l2, float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.zzl(object, l2, n3);
    }

    public final double zzf(Object object, long l2) {
        return Double.longBitsToDouble(this.zzm(object, l2));
    }

    public final void zzg(Object object, long l2, double d2) {
        long l3 = Double.doubleToLongBits(d2);
        this.zzn(object, l2, l3);
    }
}

