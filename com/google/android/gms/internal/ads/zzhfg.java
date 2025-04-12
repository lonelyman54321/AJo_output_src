/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhfh;

public final class zzhfg
extends Enum {
    public static final /* enum */ zzhfg zza;
    public static final /* enum */ zzhfg zzb;
    public static final /* enum */ zzhfg zzc;
    public static final /* enum */ zzhfg zzd;
    public static final /* enum */ zzhfg zze;
    public static final /* enum */ zzhfg zzf;
    public static final /* enum */ zzhfg zzg;
    public static final /* enum */ zzhfg zzh;
    public static final /* enum */ zzhfg zzi;
    public static final /* enum */ zzhfg zzj;
    public static final /* enum */ zzhfg zzk;
    public static final /* enum */ zzhfg zzl;
    public static final /* enum */ zzhfg zzm;
    public static final /* enum */ zzhfg zzn;
    public static final /* enum */ zzhfg zzo;
    public static final /* enum */ zzhfg zzp;
    public static final /* enum */ zzhfg zzq;
    public static final /* enum */ zzhfg zzr;
    private static final /* synthetic */ zzhfg[] zzs;
    private final zzhfh zzt;

    static {
        zzhfg zzhfg2;
        zzhfg zzhfg3;
        zzhfg zzhfg4;
        zzhfg zzhfg5;
        zzhfg zzhfg6;
        zzhfg zzhfg7;
        zzhfg zzhfg8;
        zzhfg zzhfg9;
        zzhfg zzhfg10;
        Enum enum_ = zzhfh.zzd;
        int n3 = 1;
        zza = zzhfg10 = new zzhfg("DOUBLE", 0, (zzhfh)enum_, n3);
        Enum enum_2 = zzhfh.zzc;
        int n4 = 5;
        zzb = enum_ = new zzhfg("FLOAT", n3, (zzhfh)enum_2, n4);
        zzhfg[] zzhfgArray = zzhfh.zzb;
        int n7 = 2;
        zzc = enum_2 = new zzhfg("INT64", n7, (zzhfh)zzhfgArray, 0);
        int n8 = 3;
        zzd = zzhfg9 = new zzhfg("UINT64", n8, (zzhfh)zzhfgArray, 0);
        zzhfh zzhfh2 = zzhfh.zza;
        zze = zzhfg8 = new zzhfg("INT32", 4, zzhfh2, 0);
        zzf = zzhfg7 = new zzhfg("FIXED64", n4, (zzhfh)zzhfgArray, n3);
        zzg = zzhfg6 = new zzhfg("FIXED32", 6, zzhfh2, n4);
        Enum enum_3 = zzhfh.zze;
        zzh = zzhfg5 = new zzhfg("BOOL", 7, (zzhfh)enum_3, 0);
        Enum enum_4 = zzhfh.zzf;
        zzi = zzhfg4 = new zzhfg("STRING", 8, (zzhfh)enum_4, n7);
        enum_4 = zzhfh.zzi;
        zzj = zzhfg3 = new zzhfg("GROUP", 9, (zzhfh)enum_4, n8);
        zzhfg zzhfg11 = zzhfg3;
        int n10 = 2;
        zzk = enum_3 = new zzhfg("MESSAGE", 10, (zzhfh)enum_4, n10);
        Enum enum_5 = zzhfh.zzg;
        Enum enum_6 = enum_3;
        zzl = enum_4 = new zzhfg("BYTES", 11, (zzhfh)enum_5, n10);
        zzm = zzhfg3 = new zzhfg("UINT32", 12, zzhfh2, 0);
        enum_3 = zzhfh.zzh;
        zzhfg zzhfg12 = zzhfg3;
        Enum enum_7 = enum_4;
        zzn = enum_5 = new zzhfg("ENUM", 13, (zzhfh)enum_3, 0);
        zzo = zzhfg3 = new zzhfg("SFIXED32", 14, zzhfh2, 5);
        zzhfg zzhfg13 = zzhfg3;
        zzp = enum_4 = new zzhfg("SFIXED64", 15, (zzhfh)zzhfgArray, 1);
        zzq = zzhfg3 = new zzhfg("SINT32", 16, zzhfh2, 0);
        int n14 = 17;
        zzr = zzhfg2 = new zzhfg("SINT64", n14, (zzhfh)zzhfgArray, 0);
        zzhfgArray = new zzhfg[18];
        zzhfgArray[0] = zzhfg10;
        zzhfgArray[1] = enum_;
        zzhfgArray[2] = enum_2;
        zzhfgArray[3] = zzhfg9;
        zzhfgArray[4] = zzhfg8;
        zzhfgArray[5] = zzhfg7;
        zzhfgArray[6] = zzhfg6;
        zzhfgArray[7] = zzhfg5;
        zzhfgArray[8] = zzhfg4;
        zzhfgArray[9] = zzhfg11;
        zzhfgArray[10] = enum_6;
        zzhfgArray[11] = enum_7;
        zzhfgArray[12] = zzhfg12;
        zzhfgArray[13] = enum_5;
        zzhfgArray[14] = zzhfg13;
        zzhfgArray[15] = enum_4;
        zzhfgArray[16] = zzhfg3;
        zzhfgArray[n14] = zzhfg2;
        zzs = zzhfgArray;
    }

    /*
     * WARNING - void declaration
     */
    private zzhfg() {
        void var3_2;
        void var1_-1;
        this.zzt = var3_2;
    }

    public static zzhfg[] values() {
        return (zzhfg[])zzs.clone();
    }

    public final zzhfh zza() {
        return this.zzt;
    }
}

