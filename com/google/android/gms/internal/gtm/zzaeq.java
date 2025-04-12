/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaes;
import com.google.android.gms.internal.gtm.zzaet;
import sun.misc.Unsafe;

final class zzaeq
extends zzaes {
    public zzaeq(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object object, long l2) {
        return Double.longBitsToDouble(this.zza.getLong(object, l2));
    }

    public final float zzb(Object object, long l2) {
        return Float.intBitsToFloat(this.zza.getInt(object, l2));
    }

    public final void zzc(Object object, long l2, boolean bl2) {
        boolean bl3 = zzaet.zzb;
        if (bl3) {
            zzaet.zzi(object, l2, bl2);
            return;
        }
        zzaet.zzj(object, l2, bl2);
    }

    public final void zzd(Object object, long l2, byte by2) {
        boolean bl2 = zzaet.zzb;
        if (bl2) {
            zzaet.zzk(object, l2, by2);
            return;
        }
        zzaet.zzl(object, l2, by2);
    }

    public final void zze(Object object, long l2, double d2) {
        long l3 = Double.doubleToLongBits(d2);
        this.zza.putLong(object, l2, l3);
    }

    public final void zzf(Object object, long l2, float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.zza.putInt(object, l2, n3);
    }

    public final boolean zzg(Object object, long l2) {
        boolean bl2 = zzaet.zzb;
        if (bl2) {
            return zzaet.zzt(object, l2);
        }
        return zzaet.zzu(object, l2);
    }
}

