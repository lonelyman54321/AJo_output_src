/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcf;
import java.io.Serializable;
import java.lang.constant.Constable;

public final class zzdk
extends Enum {
    public static final /* enum */ zzdk zza;
    public static final /* enum */ zzdk zzb;
    public static final /* enum */ zzdk zzc;
    public static final /* enum */ zzdk zzd;
    public static final /* enum */ zzdk zze;
    public static final /* enum */ zzdk zzf;
    public static final /* enum */ zzdk zzg;
    public static final /* enum */ zzdk zzh;
    public static final /* enum */ zzdk zzi;
    public static final /* enum */ zzdk zzj;
    private static final /* synthetic */ zzdk[] zzn;
    private final Class zzk;
    private final Class zzl;
    private final Object zzm;

    static {
        zzdk zzdk2;
        zzdk zzdk3;
        zzdk zzdk4;
        zzdk zzdk5;
        zzdk zzdk6;
        zzdk[] zzdkArray;
        zzdk[] zzdkArray2 = zzdkArray;
        zzdkArray = new zzdk("VOID", 0, Void.class, Void.class, null);
        zza = zzdkArray;
        Object object = Integer.TYPE;
        Serializable serializable = 0;
        zzdk[] zzdkArray3 = zzdkArray2;
        Class<Constable> clazz = object;
        zzdkArray2 = new zzdk("INT", 1, object, Integer.class, (Object)serializable);
        zzb = zzdkArray2;
        Class<Number> clazz2 = Long.TYPE;
        Number number = 0L;
        zzdk zzdk7 = zzdk6;
        zzc = zzdk6 = new zzdk("LONG", 2, clazz2, Long.class, (Object)number);
        clazz = Float.TYPE;
        serializable = Float.valueOf(0.0f);
        zzdkArray3 = zzdk5;
        zzd = zzdk5 = new zzdk("FLOAT", 3, clazz, Float.class, (Object)serializable);
        clazz2 = Double.TYPE;
        number = 0.0;
        zzdk7 = zzdk4;
        zze = zzdk4 = new zzdk("DOUBLE", 4, clazz2, Double.class, (Object)number);
        clazz = Boolean.TYPE;
        serializable = Boolean.FALSE;
        zzdkArray3 = zzdk7;
        zzf = zzdk7 = new zzdk("BOOLEAN", 5, clazz, Boolean.class, (Object)serializable);
        zzdk zzdk8 = zzdk3;
        zzg = zzdk3 = new zzdk("STRING", 6, String.class, String.class, (Object)"");
        serializable = zzcf.zzb;
        zzdkArray3 = zzdk8;
        zzh = zzdk8 = new zzdk("BYTE_STRING", 7, zzcf.class, zzcf.class, (Object)serializable);
        zzdkArray3 = zzdk2;
        clazz = object;
        zzi = zzdk2 = new zzdk("ENUM", 8, object, Integer.class, null);
        object = new Object("MESSAGE", 9, Object.class, Object.class, null);
        zzj = object;
        zzdkArray3 = new zzdk[]{zzdkArray, zzdkArray2, zzdk6, zzdk5, zzdk4, zzdk7, zzdk3, zzdk8, zzdk2, object};
        zzn = zzdkArray3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzdk(Object object) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.zzk = object;
        this.zzl = var4_2;
        this.zzm = var5_3;
    }

    public static zzdk[] values() {
        return (zzdk[])zzn.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

