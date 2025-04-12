/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import java.io.Serializable;
import java.lang.constant.Constable;

public final class zzjm
extends Enum {
    public static final /* enum */ zzjm zza;
    public static final /* enum */ zzjm zzb;
    public static final /* enum */ zzjm zzc;
    public static final /* enum */ zzjm zzd;
    public static final /* enum */ zzjm zze;
    public static final /* enum */ zzjm zzf;
    public static final /* enum */ zzjm zzg;
    public static final /* enum */ zzjm zzh;
    public static final /* enum */ zzjm zzi;
    public static final /* enum */ zzjm zzj;
    private static final /* synthetic */ zzjm[] zzn;
    private final Class zzk;
    private final Class zzl;
    private final Object zzm;

    static {
        zzjm zzjm2;
        zzjm zzjm3;
        zzjm zzjm4;
        zzjm zzjm5;
        zzjm zzjm6;
        zzjm[] zzjmArray;
        zzjm[] zzjmArray2 = zzjmArray;
        zzjmArray = new zzjm("VOID", 0, Void.class, Void.class, null);
        zza = zzjmArray;
        Object object = Integer.TYPE;
        Serializable serializable = 0;
        zzjm[] zzjmArray3 = zzjmArray2;
        Class<Constable> clazz = object;
        zzjmArray2 = new zzjm("INT", 1, object, Integer.class, (Object)serializable);
        zzb = zzjmArray2;
        Class<Number> clazz2 = Long.TYPE;
        Number number = 0L;
        zzjm zzjm7 = zzjm6;
        zzc = zzjm6 = new zzjm("LONG", 2, clazz2, Long.class, (Object)number);
        clazz = Float.TYPE;
        serializable = Float.valueOf(0.0f);
        zzjmArray3 = zzjm5;
        zzd = zzjm5 = new zzjm("FLOAT", 3, clazz, Float.class, (Object)serializable);
        clazz2 = Double.TYPE;
        number = 0.0;
        zzjm7 = zzjm4;
        zze = zzjm4 = new zzjm("DOUBLE", 4, clazz2, Double.class, (Object)number);
        clazz = Boolean.TYPE;
        serializable = Boolean.FALSE;
        zzjmArray3 = zzjm7;
        zzf = zzjm7 = new zzjm("BOOLEAN", 5, clazz, Boolean.class, (Object)serializable);
        zzjm zzjm8 = zzjm3;
        zzg = zzjm3 = new zzjm("STRING", 6, String.class, String.class, (Object)"");
        serializable = zzht.zza;
        zzjmArray3 = zzjm8;
        zzh = zzjm8 = new zzjm("BYTE_STRING", 7, zzht.class, zzht.class, (Object)serializable);
        zzjmArray3 = zzjm2;
        clazz = object;
        zzi = zzjm2 = new zzjm("ENUM", 8, object, Integer.class, null);
        object = new Object("MESSAGE", 9, Object.class, Object.class, null);
        zzj = object;
        zzjmArray3 = new zzjm[]{zzjmArray, zzjmArray2, zzjm6, zzjm5, zzjm4, zzjm7, zzjm3, zzjm8, zzjm2, object};
        zzn = zzjmArray3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzjm(Object object) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.zzk = object;
        this.zzl = var4_2;
        this.zzm = var5_3;
    }

    public static zzjm[] values() {
        return (zzjm[])zzn.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

