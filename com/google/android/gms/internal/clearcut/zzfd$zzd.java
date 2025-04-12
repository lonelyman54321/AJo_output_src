/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzfd$zzd {
    Unsafe zzqa;

    public zzfd$zzd(Unsafe unsafe) {
        this.zzqa = unsafe;
    }

    public final long zza(Field field) {
        return this.zzqa.objectFieldOffset(field);
    }

    public abstract void zza(long var1, byte var3);

    public abstract void zza(Object var1, long var2, double var4);

    public abstract void zza(Object var1, long var2, float var4);

    public final void zza(Object object, long l2, int n3) {
        this.zzqa.putInt(object, l2, n3);
    }

    public final void zza(Object object, long l2, long l3) {
        this.zzqa.putLong(object, l2, l3);
    }

    public abstract void zza(Object var1, long var2, boolean var4);

    public abstract void zza(byte[] var1, long var2, long var4, long var6);

    public abstract void zze(Object var1, long var2, byte var4);

    public final int zzj(Object object, long l2) {
        return this.zzqa.getInt(object, l2);
    }

    public final long zzk(Object object, long l2) {
        return this.zzqa.getLong(object, l2);
    }

    public abstract boolean zzl(Object var1, long var2);

    public abstract float zzm(Object var1, long var2);

    public abstract double zzn(Object var1, long var2);

    public abstract byte zzx(Object var1, long var2);
}

