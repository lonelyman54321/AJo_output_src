/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaey;

public final class zzaex
extends Enum {
    public static final /* enum */ zzaex zza;
    public static final /* enum */ zzaex zzb;
    public static final /* enum */ zzaex zzc;
    public static final /* enum */ zzaex zzd;
    public static final /* enum */ zzaex zze;
    public static final /* enum */ zzaex zzf;
    public static final /* enum */ zzaex zzg;
    public static final /* enum */ zzaex zzh;
    public static final /* enum */ zzaex zzi;
    public static final /* enum */ zzaex zzj;
    public static final /* enum */ zzaex zzk;
    public static final /* enum */ zzaex zzl;
    public static final /* enum */ zzaex zzm;
    public static final /* enum */ zzaex zzn;
    public static final /* enum */ zzaex zzo;
    public static final /* enum */ zzaex zzp;
    public static final /* enum */ zzaex zzq;
    public static final /* enum */ zzaex zzr;
    private static final /* synthetic */ zzaex[] zzs;
    private final zzaey zzt;

    static {
        zzaex zzaex2;
        zzaex zzaex3;
        zzaex zzaex4;
        zzaex zzaex5;
        zzaex zzaex6;
        zzaex zzaex7;
        zzaex zzaex8;
        zzaex zzaex9;
        zzaex zzaex10;
        Enum enum_ = zzaey.zzd;
        int n3 = 1;
        zza = zzaex10 = new zzaex("DOUBLE", 0, (zzaey)enum_, n3);
        Enum enum_2 = zzaey.zzc;
        int n4 = 5;
        zzb = enum_ = new zzaex("FLOAT", n3, (zzaey)enum_2, n4);
        zzaex[] zzaexArray = zzaey.zzb;
        int n7 = 2;
        zzc = enum_2 = new zzaex("INT64", n7, (zzaey)zzaexArray, 0);
        int n8 = 3;
        zzd = zzaex9 = new zzaex("UINT64", n8, (zzaey)zzaexArray, 0);
        zzaey zzaey2 = zzaey.zza;
        zze = zzaex8 = new zzaex("INT32", 4, zzaey2, 0);
        zzf = zzaex7 = new zzaex("FIXED64", n4, (zzaey)zzaexArray, n3);
        zzg = zzaex6 = new zzaex("FIXED32", 6, zzaey2, n4);
        Enum enum_3 = zzaey.zze;
        zzh = zzaex5 = new zzaex("BOOL", 7, (zzaey)enum_3, 0);
        Enum enum_4 = zzaey.zzf;
        zzi = zzaex4 = new zzaex("STRING", 8, (zzaey)enum_4, n7);
        enum_4 = zzaey.zzi;
        zzj = zzaex3 = new zzaex("GROUP", 9, (zzaey)enum_4, n8);
        zzaex zzaex11 = zzaex3;
        int n10 = 2;
        zzk = enum_3 = new zzaex("MESSAGE", 10, (zzaey)enum_4, n10);
        Enum enum_5 = zzaey.zzg;
        Enum enum_6 = enum_3;
        zzl = enum_4 = new zzaex("BYTES", 11, (zzaey)enum_5, n10);
        zzm = zzaex3 = new zzaex("UINT32", 12, zzaey2, 0);
        enum_3 = zzaey.zzh;
        zzaex zzaex12 = zzaex3;
        Enum enum_7 = enum_4;
        zzn = enum_5 = new zzaex("ENUM", 13, (zzaey)enum_3, 0);
        zzo = zzaex3 = new zzaex("SFIXED32", 14, zzaey2, 5);
        zzaex zzaex13 = zzaex3;
        zzp = enum_4 = new zzaex("SFIXED64", 15, (zzaey)zzaexArray, 1);
        zzq = zzaex3 = new zzaex("SINT32", 16, zzaey2, 0);
        int n14 = 17;
        zzr = zzaex2 = new zzaex("SINT64", n14, (zzaey)zzaexArray, 0);
        zzaexArray = new zzaex[18];
        zzaexArray[0] = zzaex10;
        zzaexArray[1] = enum_;
        zzaexArray[2] = enum_2;
        zzaexArray[3] = zzaex9;
        zzaexArray[4] = zzaex8;
        zzaexArray[5] = zzaex7;
        zzaexArray[6] = zzaex6;
        zzaexArray[7] = zzaex5;
        zzaexArray[8] = zzaex4;
        zzaexArray[9] = zzaex11;
        zzaexArray[10] = enum_6;
        zzaexArray[11] = enum_7;
        zzaexArray[12] = zzaex12;
        zzaexArray[13] = enum_5;
        zzaexArray[14] = zzaex13;
        zzaexArray[15] = enum_4;
        zzaexArray[16] = zzaex3;
        zzaexArray[n14] = zzaex2;
        zzs = zzaexArray;
    }

    /*
     * WARNING - void declaration
     */
    private zzaex() {
        void var3_2;
        void var1_-1;
        this.zzt = var3_2;
    }

    public static zzaex[] values() {
        return (zzaex[])zzs.clone();
    }

    public final zzaey zza() {
        return this.zzt;
    }
}

