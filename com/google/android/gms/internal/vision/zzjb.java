/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzhn;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzil;
import com.google.android.gms.internal.vision.zzim;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzjb$zzb;
import com.google.android.gms.internal.vision.zzjb$zze;
import com.google.android.gms.internal.vision.zzjb$zzf;
import com.google.android.gms.internal.vision.zzjb$zzg;
import com.google.android.gms.internal.vision.zzjd;
import com.google.android.gms.internal.vision.zzjh;
import com.google.android.gms.internal.vision.zzjj;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkn;
import com.google.android.gms.internal.vision.zzkp;
import com.google.android.gms.internal.vision.zzky;
import com.google.android.gms.internal.vision.zzla;
import com.google.android.gms.internal.vision.zzlb;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzlv;
import com.google.android.gms.internal.vision.zzlx;
import com.google.android.gms.internal.vision.zzma;
import com.google.android.gms.internal.vision.zzml;
import com.google.android.gms.internal.vision.zzmr;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzjb
extends zzhf {
    private static Map zzd;
    protected zzlx zzb;
    private int zzc;

    static {
        ConcurrentHashMap concurrentHashMap;
        zzd = concurrentHashMap = new ConcurrentHashMap();
    }

    public zzjb() {
        zzlx zzlx2;
        this.zzb = zzlx2 = zzlx.zza();
        this.zzc = -1;
    }

    public static /* synthetic */ zzjb$zze zza(zzim zzim2) {
        return zzjb.zzb(zzim2);
    }

    public static zzjb$zze zza(zzkk zzkk2, zzkk zzkk3, zzjh object, int n3, zzml zzml2, boolean bl2, Class clazz) {
        List list = Collections.emptyList();
        zzjb$zzf zzjb$zzf = new zzjb$zzf(null, 202056002, zzml2, true, false);
        object = new zzjb$zze(zzkk2, list, zzkk3, zzjb$zzf, clazz);
        return object;
    }

    private static zzjb zza(zzjb zzjb2) {
        boolean bl2;
        if (zzjb2 != null && !(bl2 = zzjb2.zzk())) {
            Object object = new zzlv(zzjb2);
            object = ((Throwable)object).getMessage();
            zzjk zzjk2 = new zzjk((String)object);
            throw zzjk2.zza(zzjb2);
        }
        return zzjb2;
    }

    public static zzjb zza(zzjb zzjb2, byte[] byArray) {
        int n3 = byArray.length;
        zzio zzio2 = zzio.zzb();
        return zzjb.zza(zzjb.zza(zzjb2, byArray, 0, n3, zzio2));
    }

    private static zzjb zza(zzjb zzjb2, byte[] object, int n3, int n4, zzio zzio2) {
        Object object2;
        block11: {
            n3 = zzjb$zzg.zzd;
            zzjb2 = (zzjb)zzjb2.zza(n3, null, null);
            object2 = zzky.zza();
            object2 = ((zzky)object2).zza(zzjb2);
            zzhn zzhn2 = new zzhn(zzio2);
            object2.zza(zzjb2, (byte[])object, 0, n4, zzhn2);
            object2.zzc(zzjb2);
            int n7 = zzjb2.zza;
            if (n7 != 0) break block11;
            return zzjb2;
        }
        object = new RuntimeException;
        try {
            object();
            throw object;
        }
        catch (IOException iOException) {
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw zzjk.zza().zza(zzjb2);
        }
        object2 = iOException.getCause();
        n3 = object2 instanceof zzjk;
        if (n3 != 0) {
            throw (zzjk)iOException.getCause();
        }
        String string2 = iOException.getMessage();
        object2 = new zzjk(string2);
        throw ((zzjk)object2).zza(zzjb2);
    }

    public static zzjb zza(zzjb zzjb2, byte[] byArray, zzio zzio2) {
        int n3 = byArray.length;
        return zzjb.zza(zzjb.zza(zzjb2, byArray, 0, n3, zzio2));
    }

    public static zzjb zza(Class serializable) {
        boolean bl2;
        Object object;
        Object object2 = (zzjb)zzd.get(serializable);
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
            object2 = (zzjb)zzd.get(serializable);
        }
        if (object2 == null) {
            object2 = (zzjb)zzma.zza(serializable);
            int n3 = zzjb$zzg.zzf;
            bl2 = false;
            if ((object2 = (zzjb)((zzjb)object2).zza(n3, null, null)) != null) {
                object = zzd;
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static zzjl zza(zzjl zzjl2) {
        int n3 = zzjl2.size();
        n3 = n3 == 0 ? 10 : (n3 <<= 1);
        return zzjl2.zza(n3);
    }

    public static Object zza(zzkk zzkk2, String string2, Object[] objectArray) {
        zzla zzla2 = new zzla(zzkk2, string2, objectArray);
        return zzla2;
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

    public static void zza(Class clazz, zzjb zzjb2) {
        zzd.put(clazz, zzjb2);
    }

    public static final boolean zza(zzjb zzjb2, boolean bl2) {
        byte by2;
        int n3 = zzjb$zzg.zza;
        Object object = (Byte)zzjb2.zza(n3, null, null);
        byte by4 = (Byte)object;
        if (by4 == (by2 = 1)) {
            return by2 != 0;
        }
        if (!by4) {
            return false;
        }
        object = zzky.zza().zza(zzjb2);
        boolean bl3 = object.zzd(zzjb2);
        if (bl2) {
            zzjb zzjb3;
            int n4 = zzjb$zzg.zzb;
            if (bl3) {
                zzjb3 = zzjb2;
            } else {
                by2 = 0;
                zzjb3 = null;
            }
            zzjb2.zza(n4, zzjb3, null);
        }
        return bl3;
    }

    private static zzjb$zze zzb(zzim zzim2) {
        return (zzjb$zze)zzim2;
    }

    public static zzjj zzn() {
        return zzjd.zzd();
    }

    public static zzjl zzo() {
        return zzlb.zzd();
    }

    public boolean equals(Object object) {
        Class<?> clazz;
        if (this == object) {
            return true;
        }
        zzlc zzlc2 = null;
        if (object == null) {
            return false;
        }
        Class<?> clazz2 = this.getClass();
        if (clazz2 != (clazz = object.getClass())) {
            return false;
        }
        zzlc2 = zzky.zza().zza(this);
        object = (zzjb)object;
        return zzlc2.zza((Object)this, object);
    }

    public int hashCode() {
        int n3 = this.zza;
        if (n3 != 0) {
            return n3;
        }
        this.zza = n3 = zzky.zza().zza(this).zza(this);
        return n3;
    }

    public String toString() {
        String string2 = super.toString();
        return zzkp.zza(this, string2);
    }

    public abstract Object zza(int var1, Object var2, Object var3);

    public final void zza(zzii object) {
        zzlc zzlc2 = zzky.zza().zza(this);
        object = zzil.zza((zzii)object);
        zzlc2.zza((Object)this, (zzmr)object);
    }

    public final void zzb(int n3) {
        this.zzc = n3;
    }

    public final int zzi() {
        return this.zzc;
    }

    public final zzjb$zzb zzj() {
        int n3 = zzjb$zzg.zze;
        return (zzjb$zzb)this.zza(n3, null, null);
    }

    public final boolean zzk() {
        return zzjb.zza(this, true);
    }

    public final zzjb$zzb zzl() {
        int n3 = zzjb$zzg.zze;
        zzjb$zzb zzjb$zzb = (zzjb$zzb)this.zza(n3, null, null);
        zzjb$zzb.zza(this);
        return zzjb$zzb;
    }

    public final int zzm() {
        int n3 = this.zzc;
        int n4 = -1;
        if (n3 == n4) {
            zzlc zzlc2 = zzky.zza().zza(this);
            this.zzc = n3 = zzlc2.zzb(this);
        }
        return this.zzc;
    }

    public final /* synthetic */ zzkn zzp() {
        int n3 = zzjb$zzg.zze;
        zzjb$zzb zzjb$zzb = (zzjb$zzb)this.zza(n3, null, null);
        zzjb$zzb.zza(this);
        return zzjb$zzb;
    }

    public final /* synthetic */ zzkn zzq() {
        int n3 = zzjb$zzg.zze;
        return (zzjb$zzb)this.zza(n3, null, null);
    }

    public final /* synthetic */ zzkk zzr() {
        int n3 = zzjb$zzg.zzf;
        return (zzjb)this.zza(n3, null, null);
    }
}

