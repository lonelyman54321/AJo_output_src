/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhh;
import com.google.android.gms.internal.auth.zzhi;
import sun.misc.Unsafe;

final class zzhf
extends zzhh {
    public zzhf(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object object, long l2) {
        return Double.longBitsToDouble(this.zzj(object, l2));
    }

    public final float zzb(Object object, long l2) {
        return Float.intBitsToFloat(this.zzi(object, l2));
    }

    public final void zzc(Object object, long l2, boolean bl2) {
        boolean bl3 = zzhi.zza;
        if (bl3) {
            zzhi.zzi(object, l2, bl2);
            return;
        }
        zzhi.zzj(object, l2, bl2);
    }

    public final void zzd(Object object, long l2, double d2) {
        long l3 = Double.doubleToLongBits(d2);
        this.zzn(object, l2, l3);
    }

    public final void zze(Object object, long l2, float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.zzm(object, l2, n3);
    }

    public final boolean zzf(Object object, long l2) {
        boolean bl2 = zzhi.zza;
        if (bl2) {
            return zzhi.zzq(object, l2);
        }
        return zzhi.zzr(object, l2);
    }
}

