/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzjp;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzkg$zzf;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzlr;
import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzmc;
import com.google.android.gms.internal.measurement.zzmd;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmx;
import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zznl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzkg
extends zzio {
    private static Map zzc;
    protected zzmx zzb;
    private int zzd = -1;

    static {
        ConcurrentHashMap concurrentHashMap;
        zzc = concurrentHashMap = new ConcurrentHashMap();
    }

    public zzkg() {
        zzmx zzmx2;
        this.zzb = zzmx2 = zzmx.zzc();
    }

    private final int zza() {
        return zzma.zza().zza(this).zzb(this);
    }

    public static zzkg zza(Class serializable) {
        boolean bl2;
        Object object;
        Object object2 = (zzkg)zzc.get(serializable);
        if (object2 == null) {
            try {
                object2 = serializable.getName();
            }
            catch (ClassNotFoundException classNotFoundException) {
                object2 = new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw object2;
            }
            object = serializable.getClassLoader();
            bl2 = true;
            Class.forName((String)object2, bl2, (ClassLoader)object);
            object2 = (zzkg)zzc.get(serializable);
        }
        if (object2 == null) {
            object2 = (zzkg)zzmz.zza(serializable);
            int n3 = zzkg$zzf.zzf;
            bl2 = false;
            if ((object2 = (zzkg)((zzkg)object2).zza(n3, null, null)) != null) {
                object = zzc;
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static zzkm zza(zzkm zzkm2) {
        int n3 = zzkm2.size() << 1;
        return zzkm2.zza(n3);
    }

    public static zzkn zza(zzkn zzkn2) {
        int n3 = zzkn2.size() << 1;
        return zzkn2.zzc(n3);
    }

    public static Object zza(zzlm zzlm2, String string2, Object[] objectArray) {
        zzmc zzmc2 = new zzmc(zzlm2, string2, objectArray);
        return zzmc2;
    }

    public static Object zza(Method object, Object object2, Object ... objectArray) {
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

    public static void zza(Class clazz, zzkg zzkg2) {
        zzkg2.zzcp();
        zzc.put(clazz, zzkg2);
    }

    public static /* synthetic */ boolean zza(zzkg zzkg2, boolean bl2) {
        return zzkg.zzb(zzkg2, false);
    }

    private final int zzb(zzme zzme2) {
        if (zzme2 == null) {
            return zzma.zza().zza(this).zza(this);
        }
        return zzme2.zza(this);
    }

    private static final boolean zzb(zzkg zzkg2, boolean bl2) {
        byte by2;
        int n3 = zzkg$zzf.zza;
        Object object = (Byte)zzkg2.zza(n3, null, null);
        byte by4 = (Byte)object;
        if (by4 == (by2 = 1)) {
            return by2 != 0;
        }
        if (!by4) {
            return false;
        }
        object = zzma.zza().zza(zzkg2);
        boolean bl3 = object.zze(zzkg2);
        if (bl2) {
            zzkg zzkg3;
            int n4 = zzkg$zzf.zzb;
            if (bl3) {
                zzkg3 = zzkg2;
            } else {
                by2 = 0;
                zzkg3 = null;
            }
            zzkg2.zza(n4, zzkg3, null);
        }
        return bl3;
    }

    public static zzkk zzcj() {
        return zzkh.zzd();
    }

    public static zzkn zzck() {
        return zzlb.zzd();
    }

    public static zzkm zzcl() {
        return zzmd.zzd();
    }

    public boolean equals(Object object) {
        Class<?> clazz;
        if (this == object) {
            return true;
        }
        zzme zzme2 = null;
        if (object == null) {
            return false;
        }
        Class<?> clazz2 = this.getClass();
        if (clazz2 != (clazz = object.getClass())) {
            return false;
        }
        zzme2 = zzma.zza().zza(this);
        object = (zzkg)object;
        return zzme2.zzb(this, object);
    }

    public int hashCode() {
        int n3 = this.zzcq();
        if (n3 != 0) {
            return this.zza();
        }
        n3 = this.zza;
        if (n3 == 0) {
            this.zza = n3 = this.zza();
        }
        return this.zza;
    }

    public final boolean j_() {
        return zzkg.zzb(this, true);
    }

    public String toString() {
        String string2 = super.toString();
        return zzlr.zza(this, string2);
    }

    public final int zza(zzme object) {
        int n3;
        int n4 = this.zzcq();
        if (n4 != 0) {
            int n7 = this.zzb((zzme)object);
            if (n7 >= 0) {
                return n7;
            }
            object = hj0_0.a(n7, "serialized size must be non-negative, was ");
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        n4 = this.zzcc();
        if (n4 != (n3 = -1 >>> 1)) {
            return this.zzcc();
        }
        int n8 = this.zzb((zzme)object);
        this.zzc(n8);
        return n8;
    }

    public final zzkg$zza zza(zzkg zzkg2) {
        return this.zzcg().zza(zzkg2);
    }

    public abstract Object zza(int var1, Object var2, Object var3);

    public final void zza(zzjn object) {
        zzme zzme2 = zzma.zza().zza(this);
        object = zzjp.zza((zzjn)object);
        zzme2.zza((Object)this, (zznl)object);
    }

    public final /* synthetic */ zzlm zzal() {
        int n3 = zzkg$zzf.zzf;
        return (zzkg)this.zza(n3, null, null);
    }

    public final void zzc(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzd & -1 << -1;
            this.zzd = n3 = n3 & -1 >>> 1 | n4;
            return;
        }
        String string2 = hj0_0.a(n3, "serialized size must be non-negative, was ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int zzcc() {
        return this.zzd & -1 >>> 1;
    }

    public final int zzcf() {
        return this.zza((zzme)null);
    }

    public final zzkg$zza zzcg() {
        int n3 = zzkg$zzf.zze;
        return (zzkg$zza)this.zza(n3, null, null);
    }

    public final zzkg$zza zzch() {
        int n3 = zzkg$zzf.zze;
        return ((zzkg$zza)this.zza(n3, null, null)).zza(this);
    }

    public final zzkg zzci() {
        int n3 = zzkg$zzf.zzd;
        return (zzkg)this.zza(n3, null, null);
    }

    public final /* synthetic */ zzlp zzcm() {
        int n3 = zzkg$zzf.zze;
        return (zzkg$zza)this.zza(n3, null, null);
    }

    public final /* synthetic */ zzlp zzcn() {
        int n3 = zzkg$zzf.zze;
        return ((zzkg$zza)this.zza(n3, null, null)).zza(this);
    }

    public final void zzco() {
        zzma.zza().zza(this).zzd(this);
        this.zzcp();
    }

    public final void zzcp() {
        int n3;
        this.zzd = n3 = this.zzd & -1 >>> 1;
    }

    public final boolean zzcq() {
        int n3 = this.zzd;
        int n4 = -1 << -1;
        return (n3 &= n4) != 0;
    }
}

