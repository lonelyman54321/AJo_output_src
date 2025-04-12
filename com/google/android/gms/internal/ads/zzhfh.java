/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;

public final class zzhfh
extends Enum {
    public static final /* enum */ zzhfh zza;
    public static final /* enum */ zzhfh zzb;
    public static final /* enum */ zzhfh zzc;
    public static final /* enum */ zzhfh zzd;
    public static final /* enum */ zzhfh zze;
    public static final /* enum */ zzhfh zzf;
    public static final /* enum */ zzhfh zzg;
    public static final /* enum */ zzhfh zzh;
    public static final /* enum */ zzhfh zzi;
    private static final /* synthetic */ zzhfh[] zzj;
    private final Object zzk;

    static {
        zzhfh zzhfh2;
        zzhfh zzhfh3;
        zzhfh zzhfh4;
        Object object = 0;
        zza = zzhfh4 = new zzhfh("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new zzhfh("LONG", n3, object2);
        zzb = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new zzhfh("FLOAT", n4, object3);
        zzc = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new zzhfh("DOUBLE", n7, object4);
        zzd = object3;
        Object object5 = Boolean.FALSE;
        object4 = new zzhfh("BOOLEAN", 4, object5);
        zze = object4;
        object5 = new zzhfh("STRING", 5, (Object)"");
        zzf = object5;
        Object object6 = zzhac.zzb;
        zzg = zzhfh3 = new zzhfh("BYTE_STRING", 6, object6);
        object6 = new zzhfh("ENUM", 7, null);
        zzh = object6;
        int n8 = 8;
        zzi = zzhfh2 = new zzhfh("MESSAGE", n8, null);
        zzhfh[] zzhfhArray = new zzhfh[9];
        zzhfhArray[0] = zzhfh4;
        zzhfhArray[n3] = object;
        zzhfhArray[n4] = object2;
        zzhfhArray[n7] = object3;
        zzhfhArray[4] = object4;
        zzhfhArray[5] = object5;
        zzhfhArray[6] = zzhfh3;
        zzhfhArray[7] = object6;
        zzhfhArray[n8] = zzhfh2;
        zzj = zzhfhArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhfh() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzk = var3_2;
    }

    public static zzhfh[] values() {
        return (zzhfh[])zzj.clone();
    }
}

