/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzhh {
    final Unsafe zza;

    public zzhh(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object var1, long var2);

    public abstract float zzb(Object var1, long var2);

    public abstract void zzc(Object var1, long var2, boolean var4);

    public abstract void zzd(Object var1, long var2, double var4);

    public abstract void zze(Object var1, long var2, float var4);

    public abstract boolean zzf(Object var1, long var2);

    public final int zzg(Class clazz) {
        return this.zza.arrayBaseOffset(clazz);
    }

    public final int zzh(Class clazz) {
        return this.zza.arrayIndexScale(clazz);
    }

    public final int zzi(Object object, long l2) {
        return this.zza.getInt(object, l2);
    }

    public final long zzj(Object object, long l2) {
        return this.zza.getLong(object, l2);
    }

    public final long zzk(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzl(Object object, long l2) {
        return this.zza.getObject(object, l2);
    }

    public final void zzm(Object object, long l2, int n3) {
        this.zza.putInt(object, l2, n3);
    }

    public final void zzn(Object object, long l2, long l3) {
        this.zza.putLong(object, l2, l3);
    }

    public final void zzo(Object object, long l2, Object object2) {
        this.zza.putObject(object, l2, object2);
    }
}

