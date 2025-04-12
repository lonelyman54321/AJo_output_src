/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import java.io.Serializable;
import java.lang.constant.Constable;

public final class zzkr
extends Enum {
    public static final /* enum */ zzkr zza;
    public static final /* enum */ zzkr zzb;
    public static final /* enum */ zzkr zzc;
    public static final /* enum */ zzkr zzd;
    public static final /* enum */ zzkr zze;
    public static final /* enum */ zzkr zzf;
    public static final /* enum */ zzkr zzg;
    public static final /* enum */ zzkr zzh;
    public static final /* enum */ zzkr zzi;
    public static final /* enum */ zzkr zzj;
    private static final /* synthetic */ zzkr[] zzk;
    private final Class zzl;

    static {
        zzkr zzkr2;
        zzkr zzkr3;
        zzkr zzkr4;
        zzkr zzkr5;
        zzkr zzkr6;
        zzkr[] zzkrArray;
        zzkr[] zzkrArray2 = zzkrArray;
        zzkrArray = new zzkr("VOID", 0, Void.class, Void.class, null);
        zza = zzkrArray;
        Object object = Integer.TYPE;
        Serializable serializable = 0;
        zzkr[] zzkrArray3 = zzkrArray2;
        Class<Constable> clazz = object;
        zzkrArray2 = new zzkr("INT", 1, object, Integer.class, (Object)serializable);
        zzb = zzkrArray2;
        Class<Number> clazz2 = Long.TYPE;
        Number number = 0L;
        zzkr zzkr7 = zzkr6;
        zzc = zzkr6 = new zzkr("LONG", 2, clazz2, Long.class, (Object)number);
        clazz = Float.TYPE;
        serializable = Float.valueOf(0.0f);
        zzkrArray3 = zzkr5;
        zzd = zzkr5 = new zzkr("FLOAT", 3, clazz, Float.class, (Object)serializable);
        clazz2 = Double.TYPE;
        number = 0.0;
        zzkr7 = zzkr4;
        zze = zzkr4 = new zzkr("DOUBLE", 4, clazz2, Double.class, (Object)number);
        clazz = Boolean.TYPE;
        serializable = Boolean.FALSE;
        zzkrArray3 = zzkr7;
        zzf = zzkr7 = new zzkr("BOOLEAN", 5, clazz, Boolean.class, (Object)serializable);
        zzkr zzkr8 = zzkr3;
        zzg = zzkr3 = new zzkr("STRING", 6, String.class, String.class, (Object)"");
        serializable = zziy.zza;
        zzkrArray3 = zzkr8;
        zzh = zzkr8 = new zzkr("BYTE_STRING", 7, zziy.class, zziy.class, (Object)serializable);
        zzkrArray3 = zzkr2;
        clazz = object;
        zzi = zzkr2 = new zzkr("ENUM", 8, object, Integer.class, null);
        object = new Object("MESSAGE", 9, Object.class, Object.class, null);
        zzj = object;
        zzkrArray3 = new zzkr[]{zzkrArray, zzkrArray2, zzkr6, zzkr5, zzkr4, zzkr7, zzkr3, zzkr8, zzkr2, object};
        zzk = zzkrArray3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzkr(Object object) {
        void var4_3;
        void var1_-1;
        this.zzl = var4_3;
    }

    public static zzkr[] values() {
        return (zzkr[])zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

