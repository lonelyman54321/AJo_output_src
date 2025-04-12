/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

abstract class zzaes {
    final Unsafe zza;

    public zzaes(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object var1, long var2);

    public abstract float zzb(Object var1, long var2);

    public abstract void zzc(Object var1, long var2, boolean var4);

    public abstract void zzd(Object var1, long var2, byte var4);

    public abstract void zze(Object var1, long var2, double var4);

    public abstract void zzf(Object var1, long var2, float var4);

    public abstract boolean zzg(Object var1, long var2);
}

