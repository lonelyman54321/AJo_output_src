/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;

public final class zznj
extends Enum {
    public static final /* enum */ zznj zza;
    public static final /* enum */ zznj zzb;
    public static final /* enum */ zznj zzc;
    public static final /* enum */ zznj zzd;
    public static final /* enum */ zznj zze;
    public static final /* enum */ zznj zzf;
    public static final /* enum */ zznj zzg;
    public static final /* enum */ zznj zzh;
    public static final /* enum */ zznj zzi;
    private static final /* synthetic */ zznj[] zzj;

    static {
        zznj zznj2;
        zznj zznj3;
        zznj zznj4;
        Object object = 0;
        zza = zznj4 = new zznj("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new zznj("LONG", n3, object2);
        zzb = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new zznj("FLOAT", n4, object3);
        zzc = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new zznj("DOUBLE", n7, object4);
        zzd = object3;
        Object object5 = Boolean.FALSE;
        object4 = new zznj("BOOLEAN", 4, object5);
        zze = object4;
        object5 = new zznj("STRING", 5, (Object)"");
        zzf = object5;
        Object object6 = zziy.zza;
        zzg = zznj3 = new zznj("BYTE_STRING", 6, object6);
        object6 = new zznj("ENUM", 7, null);
        zzh = object6;
        int n8 = 8;
        zzi = zznj2 = new zznj("MESSAGE", n8, null);
        zznj[] zznjArray = new zznj[9];
        zznjArray[0] = zznj4;
        zznjArray[n3] = object;
        zznjArray[n4] = object2;
        zznjArray[n7] = object3;
        zznjArray[4] = object4;
        zznjArray[5] = object5;
        zznjArray[6] = zznj3;
        zznjArray[7] = object6;
        zznjArray[n8] = zznj2;
        zzj = zznjArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zznj() {
        void var2_1;
        void var1_-1;
    }

    public static zznj[] values() {
        return (zznj[])zzj.clone();
    }
}

