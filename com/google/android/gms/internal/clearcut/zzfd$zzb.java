/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  libcore.io.Memory
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfd;
import com.google.android.gms.internal.clearcut.zzfd$zzd;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzfd$zzb
extends zzfd$zzd {
    public zzfd$zzb(Unsafe unsafe) {
        super(unsafe);
    }

    public final void zza(long l2, byte by2) {
        Memory.pokeByte((long)l2, (byte)by2);
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
        boolean bl3 = zzfd.zzah();
        if (bl3) {
            zzfd.zzd(object, l2, bl2);
            return;
        }
        zzfd.zze(object, l2, bl2);
    }

    public final void zza(byte[] byArray, long l2, long l3, long l4) {
        int n3 = (int)l2;
        int n4 = (int)l4;
        Memory.pokeByteArray((long)l3, (byte[])byArray, (int)n3, (int)n4);
    }

    public final void zze(Object object, long l2, byte by2) {
        boolean bl2 = zzfd.zzah();
        if (bl2) {
            zzfd.zzc(object, l2, by2);
            return;
        }
        zzfd.zzd(object, l2, by2);
    }

    public final boolean zzl(Object object, long l2) {
        boolean bl2 = zzfd.zzah();
        if (bl2) {
            return zzfd.zzv(object, l2);
        }
        return zzfd.zzw(object, l2);
    }

    public final float zzm(Object object, long l2) {
        return Float.intBitsToFloat(this.zzj(object, l2));
    }

    public final double zzn(Object object, long l2) {
        return Double.longBitsToDouble(this.zzk(object, l2));
    }

    public final byte zzx(Object object, long l2) {
        boolean bl2 = zzfd.zzah();
        if (bl2) {
            return zzfd.zzt(object, l2);
        }
        return zzfd.zzu(object, l2);
    }
}

