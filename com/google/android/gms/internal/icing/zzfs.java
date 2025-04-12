/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzft;

public final class zzfs
extends Enum {
    public static final /* enum */ zzfs zza;
    public static final /* enum */ zzfs zzb;
    public static final /* enum */ zzfs zzc;
    public static final /* enum */ zzfs zzd;
    public static final /* enum */ zzfs zze;
    public static final /* enum */ zzfs zzf;
    public static final /* enum */ zzfs zzg;
    public static final /* enum */ zzfs zzh;
    public static final /* enum */ zzfs zzi;
    public static final /* enum */ zzfs zzj;
    public static final /* enum */ zzfs zzk;
    public static final /* enum */ zzfs zzl;
    public static final /* enum */ zzfs zzm;
    public static final /* enum */ zzfs zzn;
    public static final /* enum */ zzfs zzo;
    public static final /* enum */ zzfs zzp;
    public static final /* enum */ zzfs zzq;
    public static final /* enum */ zzfs zzr;
    private static final /* synthetic */ zzfs[] zzt;
    private final zzft zzs;

    static {
        zzfs zzfs2;
        zzfs zzfs3;
        zzfs zzfs4;
        zzfs zzfs5;
        zzfs zzfs6;
        zzfs zzfs7;
        zzfs zzfs8;
        zzfs zzfs9;
        Enum enum_ = zzft.zzd;
        int n3 = 1;
        zza = zzfs9 = new zzfs("DOUBLE", 0, (zzft)enum_, n3);
        Enum enum_2 = zzft.zzc;
        int n4 = 5;
        zzb = enum_ = new zzfs("FLOAT", n3, (zzft)enum_2, n4);
        zzfs[] zzfsArray = zzft.zzb;
        int n7 = 2;
        zzc = enum_2 = new zzfs("INT64", n7, (zzft)zzfsArray, 0);
        int n8 = 3;
        zzd = zzfs8 = new zzfs("UINT64", n8, (zzft)zzfsArray, 0);
        zzft zzft2 = zzft.zza;
        zze = zzfs7 = new zzfs("INT32", 4, zzft2, 0);
        zzf = zzfs6 = new zzfs("FIXED64", n4, (zzft)zzfsArray, n3);
        zzg = zzfs5 = new zzfs("FIXED32", 6, zzft2, n4);
        Enum enum_3 = zzft.zze;
        zzh = zzfs4 = new zzfs("BOOL", 7, (zzft)enum_3, 0);
        zzft zzft3 = zzft.zzf;
        zzi = enum_3 = new zzfs("STRING", 8, zzft3, n7);
        zzft3 = zzft.zzi;
        Enum enum_4 = new zzfs("GROUP", 9, zzft3, n8);
        zzj = enum_4;
        zzfs zzfs10 = enum_4;
        int n10 = 2;
        zzk = zzfs3 = new zzfs("MESSAGE", 10, zzft3, n10);
        Enum enum_5 = zzft.zzg;
        zzfs zzfs11 = zzfs3;
        zzl = zzfs2 = new zzfs("BYTES", 11, (zzft)enum_5, n10);
        enum_4 = new zzfs("UINT32", 12, zzft2, 0);
        zzm = enum_4;
        zzfs zzfs12 = enum_4;
        enum_4 = zzft.zzh;
        zzfs zzfs13 = zzfs2;
        zzn = zzfs3 = new zzfs("ENUM", 13, (zzft)enum_4, 0);
        zzo = enum_4 = new zzfs("SFIXED32", 14, zzft2, 5);
        Enum enum_6 = enum_4;
        zzp = zzfs2 = new zzfs("SFIXED64", 15, (zzft)zzfsArray, 1);
        zzq = enum_4 = new zzfs("SINT32", 16, zzft2, 0);
        int n14 = 17;
        zzr = enum_5 = new zzfs("SINT64", n14, (zzft)zzfsArray, 0);
        zzfsArray = new zzfs[18];
        zzfsArray[0] = zzfs9;
        zzfsArray[1] = enum_;
        zzfsArray[2] = enum_2;
        zzfsArray[3] = zzfs8;
        zzfsArray[4] = zzfs7;
        zzfsArray[5] = zzfs6;
        zzfsArray[6] = zzfs5;
        zzfsArray[7] = zzfs4;
        zzfsArray[8] = enum_3;
        zzfsArray[9] = zzfs10;
        zzfsArray[10] = zzfs11;
        zzfsArray[11] = zzfs13;
        zzfsArray[12] = zzfs12;
        zzfsArray[13] = zzfs3;
        zzfsArray[14] = enum_6;
        zzfsArray[15] = zzfs2;
        zzfsArray[16] = enum_4;
        zzfsArray[n14] = enum_5;
        zzt = zzfsArray;
    }

    /*
     * WARNING - void declaration
     */
    private zzfs() {
        void var3_2;
        void var1_-1;
        this.zzs = var3_2;
    }

    public static zzfs[] values() {
        return (zzfs[])zzt.clone();
    }

    public final zzft zza() {
        return this.zzs;
    }
}

