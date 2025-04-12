/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdp;
import com.google.android.gms.internal.auth.zzds;
import com.google.android.gms.internal.auth.zzek;
import com.google.android.gms.internal.auth.zzes;
import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzfv;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzfy;
import com.google.android.gms.internal.auth.zzge;
import com.google.android.gms.internal.auth.zzgf;
import com.google.android.gms.internal.auth.zzgg;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.gms.internal.auth.zzgz;
import com.google.android.gms.internal.auth.zzhi;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzeu
extends zzdp {
    private static final Map zzb;
    protected zzgz zzc;

    static {
        ConcurrentHashMap concurrentHashMap;
        zzb = concurrentHashMap = new ConcurrentHashMap();
    }

    public zzeu() {
        zzgz zzgz2;
        this.zzc = zzgz2 = zzgz.zza();
    }

    public static zzeu zza(Class serializable) {
        boolean bl2;
        Object object = zzb;
        Object object2 = (zzeu)object.get(serializable);
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
            object2 = (zzeu)object.get(serializable);
        }
        if (object2 == null) {
            object2 = (zzeu)zzhi.zze(serializable);
            int n3 = 6;
            bl2 = false;
            if ((object2 = (zzeu)((zzeu)object2).zzi(n3, null, null)) != null) {
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static zzeu zzb(zzeu zzeu2, byte[] object) {
        block5: {
            block6: {
                int n3 = ((byte[])object).length;
                Object object2 = zzek.zza;
                int n4 = 0;
                Class<?> clazz = null;
                if ((zzeu2 = zzeu.zzj(zzeu2, (byte[])object, 0, n3, (zzek)object2)) == null) break block5;
                byte by2 = 1;
                n3 = 0;
                object2 = (Byte)zzeu2.zzi(by2, null, null);
                byte by4 = (Byte)object2;
                if (by4 == by2) break block5;
                if (by4 == 0) break block6;
                object2 = zzge.zza();
                clazz = zzeu2.getClass();
                by4 = (byte)((object2 = ((zzge)object2).zzb(clazz)).zzi(zzeu2) ? 1 : 0);
                if (by2 != by4) {
                    by2 = 0;
                    object = null;
                } else {
                    object = zzeu2;
                }
                n4 = 2;
                zzeu2.zzi(n4, object, null);
                if (by4 != 0) break block5;
            }
            object = new zzgx;
            ((zzgx)object)(zzeu2);
            object = ((zzgx)object).zza();
            ((zzfa)object).zze(zzeu2);
            throw object;
        }
        return zzeu2;
    }

    public static zzey zzc() {
        return zzgf.zze();
    }

    public static Object zze(Method object, Object object2, Object ... objectArray) {
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

    public static Object zzf(zzfw zzfw2, String object, Object[] objectArray) {
        object = new zzgg(zzfw2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objectArray);
        return object;
    }

    public static void zzg(Class clazz, zzeu zzeu2) {
        zzb.put(clazz, zzeu2);
    }

    private static zzeu zzj(zzeu zzeu2, byte[] object, int n3, int n4, zzek zzek2) {
        zzfa zzfa22;
        block17: {
            zzgx zzgx22;
            block16: {
                Object object2;
                block14: {
                    n3 = 4;
                    Object object3 = null;
                    zzeu2 = (zzeu)zzeu2.zzi(n3, null, null);
                    object2 = zzge.zza();
                    object3 = zzeu2.getClass();
                    object2 = ((zzge)object2).zzb((Class)object3);
                    zzds zzds2 = new zzds(zzek2);
                    object3 = object2;
                    object2.zzg(zzeu2, (byte[])object, 0, n4, zzds2);
                    object2.zze(zzeu2);
                    int n7 = zzeu2.zza;
                    if (n7 != 0) break block14;
                    return zzeu2;
                }
                try {
                    object = new RuntimeException();
                    throw object;
                }
                catch (IOException iOException) {
                }
                catch (zzgx zzgx22) {
                    break block16;
                }
                catch (zzfa zzfa22) {
                    break block17;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    object = zzfa.zzf();
                    ((zzfa)object).zze(zzeu2);
                    throw object;
                }
                object2 = iOException.getCause();
                n3 = object2 instanceof zzfa;
                if (n3 != 0) {
                    throw (zzfa)iOException.getCause();
                }
                object2 = new zzfa(iOException);
                ((zzfa)object2).zze(zzeu2);
                throw object2;
            }
            zzfa zzfa3 = zzgx22.zza();
            zzfa3.zze(zzeu2);
            throw zzfa3;
        }
        zzfa22.zze(zzeu2);
        throw zzfa22;
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
        object2 = zzge.zza();
        clazz2 = this.getClass();
        object2 = ((zzge)object2).zzb(clazz2);
        object = (zzeu)object;
        return object2.zzh(this, object);
    }

    public final int hashCode() {
        int n3 = this.zza;
        if (n3 != 0) {
            return n3;
        }
        zzge zzge2 = zzge.zza();
        Class<?> clazz = this.getClass();
        this.zza = n3 = zzge2.zzb(clazz).zza(this);
        return n3;
    }

    public final String toString() {
        String string2 = super.toString();
        return zzfy.zza(this, string2);
    }

    public final /* synthetic */ zzfv zzd() {
        zzes zzes2 = (zzes)this.zzi(5, null, null);
        zzes2.zze(this);
        return zzes2;
    }

    public final /* synthetic */ zzfw zzh() {
        return (zzeu)this.zzi(6, null, null);
    }

    public abstract Object zzi(int var1, Object var2, Object var3);
}

