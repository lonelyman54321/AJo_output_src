/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmz;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzmz$zzc {
    Unsafe zza;

    public zzmz$zzc(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object var1, long var2);

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

    public final boolean zza() {
        Object object;
        int n3 = 3;
        int n4 = 2;
        boolean bl2 = true;
        Object object2 = Class.class;
        Class<Object> clazz = Object.class;
        Object object3 = this.zza;
        if (object3 == null) {
            return false;
        }
        try {
            object3 = object3.getClass();
            object = "objectFieldOffset";
        }
        catch (Throwable throwable) {
            zzmz.zza(throwable);
            return false;
        }
        Class[] classArray = new Class[bl2];
        Class clazz2 = Field.class;
        classArray[0] = clazz2;
        ((Class)object3).getMethod((String)object, classArray);
        object = "arrayBaseOffset";
        classArray = new Class[bl2];
        classArray[0] = object2;
        ((Class)object3).getMethod((String)object, classArray);
        object = "arrayIndexScale";
        classArray = new Class[bl2];
        classArray[0] = object2;
        ((Class)object3).getMethod((String)object, classArray);
        object2 = "getInt";
        object = Long.TYPE;
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putInt";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = object;
        clazz2 = Integer.TYPE;
        classArray[n4] = clazz2;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getLong";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putLong";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = object;
        classArray[n4] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getObject";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putObject";
        Class[] classArray2 = new Class[n3];
        classArray2[0] = clazz;
        classArray2[bl2] = object;
        classArray2[n4] = clazz;
        ((Class)object3).getMethod((String)object2, classArray2);
        return bl2;
    }

    public abstract float zzb(Object var1, long var2);

    public final boolean zzb() {
        String string2;
        boolean bl2 = true;
        Object object = this.zza;
        if (object == null) {
            return false;
        }
        try {
            object = object.getClass();
            string2 = "objectFieldOffset";
        }
        catch (Throwable throwable) {
            zzmz.zza(throwable);
            return false;
        }
        Class[] classArray = new Class[bl2];
        Class clazz = Field.class;
        classArray[0] = clazz;
        ((Class)object).getMethod(string2, classArray);
        string2 = "getLong";
        int n3 = 2;
        classArray = new Class[n3];
        clazz = Object.class;
        classArray[0] = clazz;
        clazz = Long.TYPE;
        classArray[bl2] = clazz;
        ((Class)object).getMethod(string2, classArray);
        object = zzmz.zza();
        if (object == null) {
            return false;
        }
        return bl2;
    }

    public abstract boolean zzc(Object var1, long var2);

    public final int zzd(Object object, long l2) {
        return this.zza.getInt(object, l2);
    }

    public final long zze(Object object, long l2) {
        return this.zza.getLong(object, l2);
    }
}

