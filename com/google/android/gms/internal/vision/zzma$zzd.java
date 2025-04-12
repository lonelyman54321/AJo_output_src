/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

abstract class zzma$zzd {
    Unsafe zza;

    public zzma$zzd(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(Object var1, long var2);

    public abstract void zza(Object var1, long var2, byte var4);

    public abstract void zza(Object var1, long var2, double var4);

    public abstract void zza(Object var1, long var2, float var4);

    public final void zza(Object object, long l2, int n3) {
        this.zza.putInt(object, l2, n3);
    }

    public final void zza(Object object, long l2, long l3) {
        this.zza.putLong(object, l2, l3);
    }

    public abstract void zza(Object var1, long var2, boolean var4);

    public abstract boolean zzb(Object var1, long var2);

    public abstract float zzc(Object var1, long var2);

    public abstract double zzd(Object var1, long var2);

    public final int zze(Object object, long l2) {
        return this.zza.getInt(object, l2);
    }

    public final long zzf(Object object, long l2) {
        return this.zza.getLong(object, l2);
    }
}

