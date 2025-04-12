/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzyx;
import java.io.Serializable;
import java.lang.constant.Constable;

public final class zzacr
extends Enum {
    public static final /* enum */ zzacr zza;
    public static final /* enum */ zzacr zzb;
    public static final /* enum */ zzacr zzc;
    public static final /* enum */ zzacr zzd;
    public static final /* enum */ zzacr zze;
    public static final /* enum */ zzacr zzf;
    public static final /* enum */ zzacr zzg;
    public static final /* enum */ zzacr zzh;
    public static final /* enum */ zzacr zzi;
    public static final /* enum */ zzacr zzj;
    private static final /* synthetic */ zzacr[] zzk;
    private final Class zzl;

    static {
        zzacr zzacr2;
        zzacr zzacr3;
        zzacr zzacr4;
        zzacr zzacr5;
        zzacr zzacr6;
        zzacr[] zzacrArray;
        zzacr[] zzacrArray2 = zzacrArray;
        zzacrArray = new zzacr("VOID", 0, Void.class, Void.class, null);
        zza = zzacrArray;
        Object object = Integer.TYPE;
        Serializable serializable = 0;
        zzacr[] zzacrArray3 = zzacrArray2;
        Class<Constable> clazz = object;
        zzacrArray2 = new zzacr("INT", 1, object, Integer.class, (Object)serializable);
        zzb = zzacrArray2;
        Class<Number> clazz2 = Long.TYPE;
        Number number = 0L;
        zzacr zzacr7 = zzacr6;
        zzc = zzacr6 = new zzacr("LONG", 2, clazz2, Long.class, (Object)number);
        clazz = Float.TYPE;
        serializable = Float.valueOf(0.0f);
        zzacrArray3 = zzacr5;
        zzd = zzacr5 = new zzacr("FLOAT", 3, clazz, Float.class, (Object)serializable);
        clazz2 = Double.TYPE;
        number = 0.0;
        zzacr7 = zzacr4;
        zze = zzacr4 = new zzacr("DOUBLE", 4, clazz2, Double.class, (Object)number);
        clazz = Boolean.TYPE;
        serializable = Boolean.FALSE;
        zzacrArray3 = zzacr7;
        zzf = zzacr7 = new zzacr("BOOLEAN", 5, clazz, Boolean.class, (Object)serializable);
        zzacr zzacr8 = zzacr3;
        zzg = zzacr3 = new zzacr("STRING", 6, String.class, String.class, (Object)"");
        serializable = zzyx.zzb;
        zzacrArray3 = zzacr8;
        zzh = zzacr8 = new zzacr("BYTE_STRING", 7, zzyx.class, zzyx.class, (Object)serializable);
        zzacrArray3 = zzacr2;
        clazz = object;
        zzi = zzacr2 = new zzacr("ENUM", 8, object, Integer.class, null);
        object = new Object("MESSAGE", 9, Object.class, Object.class, null);
        zzj = object;
        zzacrArray3 = new zzacr[]{zzacrArray, zzacrArray2, zzacr6, zzacr5, zzacr4, zzacr7, zzacr3, zzacr8, zzacr2, object};
        zzk = zzacrArray3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzacr(Object object) {
        void var4_3;
        void var1_-1;
        this.zzl = var4_3;
    }

    public static zzacr[] values() {
        return (zzacr[])zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

