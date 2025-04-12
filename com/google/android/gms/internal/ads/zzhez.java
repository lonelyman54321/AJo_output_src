/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

abstract class zzhez {
    final Unsafe zza;

    public zzhez(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long var1);

    public abstract double zzb(Object var1, long var2);

    public abstract float zzc(Object var1, long var2);

    public abstract void zzd(long var1, byte[] var3, long var4, long var6);

    public abstract void zze(Object var1, long var2, boolean var4);

    public abstract void zzf(Object var1, long var2, byte var4);

    public abstract void zzg(Object var1, long var2, double var4);

    public abstract void zzh(Object var1, long var2, float var4);

    public abstract boolean zzi(Object var1, long var2);
}

