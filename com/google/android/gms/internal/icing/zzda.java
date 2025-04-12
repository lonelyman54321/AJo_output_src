/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbs;
import com.google.android.gms.internal.icing.zzbv;
import com.google.android.gms.internal.icing.zzcm;
import com.google.android.gms.internal.icing.zzcn;
import com.google.android.gms.internal.icing.zzco;
import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzdc;
import com.google.android.gms.internal.icing.zzdd;
import com.google.android.gms.internal.icing.zzdf;
import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzdt;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzeg;
import com.google.android.gms.internal.icing.zzem;
import com.google.android.gms.internal.icing.zzen;
import com.google.android.gms.internal.icing.zzeo;
import com.google.android.gms.internal.icing.zzfe;
import com.google.android.gms.internal.icing.zzfn;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzda
extends zzbs {
    private static final Map zzb;
    protected zzfe zzc;
    protected int zzd;

    static {
        ConcurrentHashMap concurrentHashMap;
        zzb = concurrentHashMap = new ConcurrentHashMap();
    }

    public zzda() {
        zzfe zzfe2;
        this.zzc = zzfe2 = zzfe.zza();
        this.zzd = -1;
    }

    public static zzda zzp(Class serializable) {
        boolean bl2;
        Object object = zzb;
        Object object2 = (zzda)object.get(serializable);
        if (object2 == null) {
            try {
                object2 = serializable.getName();
            }
            catch (ClassNotFoundException classNotFoundException) {
                object = new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw object;
            }
            ClassLoader classLoader = serializable.getClassLoader();
            bl2 = true;
            Class.forName((String)object2, bl2, classLoader);
            object2 = (zzda)object.get(serializable);
        }
        if (object2 == null) {
            object2 = (zzda)zzfn.zzc(serializable);
            int n3 = 6;
            bl2 = false;
            if ((object2 = (zzda)((zzda)object2).zzf(n3, null, null)) != null) {
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static void zzq(Class clazz, zzda zzda2) {
        zzb.put(clazz, zzda2);
    }

    public static Object zzr(zzee zzee2, String string2, Object[] objectArray) {
        zzeo zzeo2 = new zzeo(zzee2, string2, objectArray);
        return zzeo2;
    }

    public static Object zzs(Method object, Object object2, Object ... objectArray) {
        try {
            return ((Method)object).invoke(object2, objectArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            boolean bl2 = object instanceof RuntimeException;
            if (!bl2) {
                bl2 = object instanceof Error;
                if (bl2) {
                    throw (Error)object;
                }
                object2 = new RuntimeException("Unexpected exception thrown by generated accessor method.", (Throwable)object);
                throw object2;
            }
            throw (RuntimeException)object;
        }
        catch (IllegalAccessException illegalAccessException) {
            object2 = new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
            throw object2;
        }
    }

    public static zzdf zzt() {
        return zzdt.zzd();
    }

    public static zzdd zzu() {
        return zzco.zzd();
    }

    public static zzdc zzv() {
        return zzbv.zzd();
    }

    public static zzdg zzw() {
        return zzen.zzd();
    }

    public static zzdg zzx(zzdg zzdg2) {
        int n3 = zzdg2.size();
        n3 = n3 == 0 ? 10 : (n3 += n3);
        return zzdg2.zze(n3);
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        if (this == object) {
            return true;
        }
        Object object2 = null;
        if (object == null) {
            return false;
        }
        Class<?> clazz2 = this.getClass();
        if (clazz2 != (clazz = object.getClass())) {
            return false;
        }
        object2 = zzem.zza();
        clazz2 = this.getClass();
        object2 = ((zzem)object2).zzb(clazz2);
        object = (zzda)object;
        return object2.zza(this, object);
    }

    public final int hashCode() {
        int n3 = this.zza;
        if (n3 != 0) {
            return n3;
        }
        zzem zzem2 = zzem.zza();
        Class<?> clazz = this.getClass();
        this.zza = n3 = zzem2.zzb(clazz).zzb(this);
        return n3;
    }

    public final String toString() {
        String string2 = super.toString();
        return zzeg.zza(this, string2);
    }

    public abstract Object zzf(int var1, Object var2, Object var3);

    public final int zzi() {
        return this.zzd;
    }

    public final void zzj(int n3) {
        this.zzd = n3;
    }

    public final zzcx zzl() {
        return (zzcx)this.zzf(5, null, null);
    }

    public final void zzn(zzcm object) {
        Object object2 = zzem.zza();
        Class<?> clazz = this.getClass();
        object2 = ((zzem)object2).zzb(clazz);
        object = zzcn.zza((zzcm)object);
        object2.zzi(this, (zzcn)object);
    }

    public final int zzo() {
        int n3 = this.zzd;
        int n4 = -1;
        if (n3 == n4) {
            Object object = zzem.zza();
            Class<?> clazz = this.getClass();
            object = ((zzem)object).zzb(clazz);
            this.zzd = n3 = object.zzd(this);
        }
        return n3;
    }
}

