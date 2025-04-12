/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfd;
import com.google.android.gms.internal.clearcut.zzfd$zzd;
import sun.misc.Unsafe;

final class zzfd$zzc
extends zzfd$zzd {
    public zzfd$zzc(Unsafe unsafe) {
        super(unsafe);
    }

    public final void zza(long l2, byte by2) {
        this.zzqa.putByte(l2, by2);
    }

    public final void zza(Object object, long l2, double d2) {
        this.zzqa.putDouble(object, l2, d2);
    }

    public final void zza(Object object, long l2, float f5) {
        this.zzqa.putFloat(object, l2, f5);
    }

    public final void zza(Object object, long l2, boolean bl2) {
        this.zzqa.putBoolean(object, l2, bl2);
    }

    public final void zza(byte[] byArray, long l2, long l3, long l4) {
        Unsafe unsafe = this.zzqa;
        long l7 = zzfd.zzej() + l2;
        unsafe.copyMemory(byArray, l7, null, l3, l4);
    }

    public final void zze(Object object, long l2, byte by2) {
        this.zzqa.putByte(object, l2, by2);
    }

    public final boolean zzl(Object object, long l2) {
        return this.zzqa.getBoolean(object, l2);
    }

    public final float zzm(Object object, long l2) {
        return this.zzqa.getFloat(object, l2);
    }

    public final double zzn(Object object, long l2) {
        return this.zzqa.getDouble(object, l2);
    }

    public final byte zzx(Object object, long l2) {
        return this.zzqa.getByte(object, l2);
    }
}

