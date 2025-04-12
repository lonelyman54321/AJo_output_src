/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzma$zzd;
import sun.misc.Unsafe;

final class zzma$zzb
extends zzma$zzd {
    public zzma$zzb(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte zza(Object object, long l2) {
        return this.zza.getByte(object, l2);
    }

    public final void zza(Object object, long l2, byte by2) {
        this.zza.putByte(object, l2, by2);
    }

    public final void zza(Object object, long l2, double d2) {
        this.zza.putDouble(object, l2, d2);
    }

    public final void zza(Object object, long l2, float f5) {
        this.zza.putFloat(object, l2, f5);
    }

    public final void zza(Object object, long l2, boolean bl2) {
        this.zza.putBoolean(object, l2, bl2);
    }

    public final boolean zzb(Object object, long l2) {
        return this.zza.getBoolean(object, l2);
    }

    public final float zzc(Object object, long l2) {
        return this.zza.getFloat(object, l2);
    }

    public final double zzd(Object object, long l2) {
        return this.zza.getDouble(object, l2);
    }
}

