/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzfm {
    final Unsafe zza;

    public zzfm(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object var1, long var2, byte var4);

    public abstract boolean zzb(Object var1, long var2);

    public abstract void zzc(Object var1, long var2, boolean var4);

    public abstract float zzd(Object var1, long var2);

    public abstract void zze(Object var1, long var2, float var4);

    public abstract double zzf(Object var1, long var2);

    public abstract void zzg(Object var1, long var2, double var4);

    public final long zzh(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final int zzi(Class clazz) {
        return this.zza.arrayBaseOffset(clazz);
    }

    public final int zzj(Class clazz) {
        return this.zza.arrayIndexScale(clazz);
    }

    public final int zzk(Object object, long l2) {
        return this.zza.getInt(object, l2);
    }

    public final void zzl(Object object, long l2, int n3) {
        this.zza.putInt(object, l2, n3);
    }

    public final long zzm(Object object, long l2) {
        return this.zza.getLong(object, l2);
    }

    public final void zzn(Object object, long l2, long l3) {
        this.zza.putLong(object, l2, l3);
    }

    public final Object zzo(Object object, long l2) {
        return this.zza.getObject(object, l2);
    }

    public final void zzp(Object object, long l2, Object object2) {
        this.zza.putObject(object, l2, object2);
    }
}

