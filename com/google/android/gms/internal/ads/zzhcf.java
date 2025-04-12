/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import java.io.Serializable;
import java.lang.constant.Constable;

public final class zzhcf
extends Enum {
    public static final /* enum */ zzhcf zza;
    public static final /* enum */ zzhcf zzb;
    public static final /* enum */ zzhcf zzc;
    public static final /* enum */ zzhcf zzd;
    public static final /* enum */ zzhcf zze;
    public static final /* enum */ zzhcf zzf;
    public static final /* enum */ zzhcf zzg;
    public static final /* enum */ zzhcf zzh;
    public static final /* enum */ zzhcf zzi;
    public static final /* enum */ zzhcf zzj;
    private static final /* synthetic */ zzhcf[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzhcf zzhcf2;
        zzhcf zzhcf3;
        zzhcf zzhcf4;
        zzhcf zzhcf5;
        zzhcf zzhcf6;
        zzhcf[] zzhcfArray;
        zzhcf[] zzhcfArray2 = zzhcfArray;
        zzhcfArray = new zzhcf("VOID", 0, Void.class, Void.class, null);
        zza = zzhcfArray;
        Object object = Integer.TYPE;
        Serializable serializable = 0;
        zzhcf[] zzhcfArray3 = zzhcfArray2;
        Class<Constable> clazz = object;
        zzhcfArray2 = new zzhcf("INT", 1, object, Integer.class, (Object)serializable);
        zzb = zzhcfArray2;
        Class<Number> clazz2 = Long.TYPE;
        Number number = 0L;
        zzhcf zzhcf7 = zzhcf6;
        zzc = zzhcf6 = new zzhcf("LONG", 2, clazz2, Long.class, (Object)number);
        clazz = Float.TYPE;
        serializable = Float.valueOf(0.0f);
        zzhcfArray3 = zzhcf5;
        zzd = zzhcf5 = new zzhcf("FLOAT", 3, clazz, Float.class, (Object)serializable);
        clazz2 = Double.TYPE;
        number = 0.0;
        zzhcf7 = zzhcf4;
        zze = zzhcf4 = new zzhcf("DOUBLE", 4, clazz2, Double.class, (Object)number);
        clazz = Boolean.TYPE;
        serializable = Boolean.FALSE;
        zzhcfArray3 = zzhcf7;
        zzf = zzhcf7 = new zzhcf("BOOLEAN", 5, clazz, Boolean.class, (Object)serializable);
        zzhcf zzhcf8 = zzhcf3;
        zzg = zzhcf3 = new zzhcf("STRING", 6, String.class, String.class, (Object)"");
        serializable = zzhac.zzb;
        zzhcfArray3 = zzhcf8;
        zzh = zzhcf8 = new zzhcf("BYTE_STRING", 7, zzhac.class, zzhac.class, (Object)serializable);
        zzhcfArray3 = zzhcf2;
        clazz = object;
        zzi = zzhcf2 = new zzhcf("ENUM", 8, object, Integer.class, null);
        object = new Object("MESSAGE", 9, Object.class, Object.class, null);
        zzj = object;
        zzhcfArray3 = new zzhcf[]{zzhcfArray, zzhcfArray2, zzhcf6, zzhcf5, zzhcf4, zzhcf7, zzhcf3, zzhcf8, zzhcf2, object};
        zzk = zzhcfArray3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhcf(Object object) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.zzl = object;
        this.zzm = var4_2;
        this.zzn = var5_3;
    }

    public static zzhcf[] values() {
        return (zzhcf[])zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}

