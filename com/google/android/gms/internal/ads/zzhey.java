/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  libcore.io.Memory
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhez;
import com.google.android.gms.internal.ads.zzhfa;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzhey
extends zzhez {
    public zzhey(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte zza(long l2) {
        return Memory.peekByte((long)l2);
    }

    public final double zzb(Object object, long l2) {
        return Double.longBitsToDouble(this.zza.getLong(object, l2));
    }

    public final float zzc(Object object, long l2) {
        return Float.intBitsToFloat(this.zza.getInt(object, l2));
    }

    public final void zzd(long l2, byte[] byArray, long l3, long l4) {
        int n3 = (int)l3;
        int n4 = (int)l4;
        Memory.peekByteArray((long)l2, (byte[])byArray, (int)n3, (int)n4);
    }

    public final void zze(Object object, long l2, boolean bl2) {
        boolean bl3 = zzhfa.zzb;
        if (bl3) {
            zzhfa.zzk(object, l2, bl2);
            return;
        }
        zzhfa.zzl(object, l2, bl2);
    }

    public final void zzf(Object object, long l2, byte by2) {
        boolean bl2 = zzhfa.zzb;
        if (bl2) {
            zzhfa.zzm(object, l2, by2);
            return;
        }
        zzhfa.zzn(object, l2, by2);
    }

    public final void zzg(Object object, long l2, double d2) {
        long l3 = Double.doubleToLongBits(d2);
        this.zza.putLong(object, l2, l3);
    }

    public final void zzh(Object object, long l2, float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.zza.putInt(object, l2, n3);
    }

    public final boolean zzi(Object object, long l2) {
        boolean bl2 = zzhfa.zzb;
        if (bl2) {
            return zzhfa.zzw(object, l2);
        }
        return zzhfa.zzx(object, l2);
    }
}

