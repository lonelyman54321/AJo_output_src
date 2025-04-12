/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzho;

public final class zzhn
extends Enum {
    public static final /* enum */ zzhn zza;
    public static final /* enum */ zzhn zzb;
    public static final /* enum */ zzhn zzc;
    public static final /* enum */ zzhn zzd;
    public static final /* enum */ zzhn zze;
    public static final /* enum */ zzhn zzf;
    public static final /* enum */ zzhn zzg;
    public static final /* enum */ zzhn zzh;
    public static final /* enum */ zzhn zzi;
    public static final /* enum */ zzhn zzj;
    public static final /* enum */ zzhn zzk;
    public static final /* enum */ zzhn zzl;
    public static final /* enum */ zzhn zzm;
    public static final /* enum */ zzhn zzn;
    public static final /* enum */ zzhn zzo;
    public static final /* enum */ zzhn zzp;
    public static final /* enum */ zzhn zzq;
    public static final /* enum */ zzhn zzr;
    private static final /* synthetic */ zzhn[] zzs;
    private final zzho zzt;

    static {
        zzhn zzhn2;
        zzhn zzhn3;
        zzhn zzhn4;
        zzhn zzhn5;
        zzhn zzhn6;
        zzhn zzhn7;
        zzhn zzhn8;
        zzhn zzhn9;
        Enum enum_ = zzho.zzd;
        int n3 = 1;
        zza = zzhn9 = new zzhn("DOUBLE", 0, (zzho)enum_, n3);
        Enum enum_2 = zzho.zzc;
        int n4 = 5;
        zzb = enum_ = new zzhn("FLOAT", n3, (zzho)enum_2, n4);
        zzhn[] zzhnArray = zzho.zzb;
        int n7 = 2;
        zzc = enum_2 = new zzhn("INT64", n7, (zzho)zzhnArray, 0);
        int n8 = 3;
        zzd = zzhn8 = new zzhn("UINT64", n8, (zzho)zzhnArray, 0);
        zzho zzho2 = zzho.zza;
        zze = zzhn7 = new zzhn("INT32", 4, zzho2, 0);
        zzf = zzhn6 = new zzhn("FIXED64", n4, (zzho)zzhnArray, n3);
        zzg = zzhn5 = new zzhn("FIXED32", 6, zzho2, n4);
        Enum enum_3 = zzho.zze;
        zzh = zzhn4 = new zzhn("BOOL", 7, (zzho)enum_3, 0);
        zzho zzho3 = zzho.zzf;
        zzi = enum_3 = new zzhn("STRING", 8, zzho3, n7);
        zzho3 = zzho.zzi;
        Enum enum_4 = new zzhn("GROUP", 9, zzho3, n8);
        zzj = enum_4;
        zzhn zzhn10 = enum_4;
        int n10 = 2;
        zzk = zzhn3 = new zzhn("MESSAGE", 10, zzho3, n10);
        Enum enum_5 = zzho.zzg;
        zzhn zzhn11 = zzhn3;
        zzl = zzhn2 = new zzhn("BYTES", 11, (zzho)enum_5, n10);
        enum_4 = new zzhn("UINT32", 12, zzho2, 0);
        zzm = enum_4;
        zzhn zzhn12 = enum_4;
        enum_4 = zzho.zzh;
        zzhn zzhn13 = zzhn2;
        zzn = zzhn3 = new zzhn("ENUM", 13, (zzho)enum_4, 0);
        zzo = enum_4 = new zzhn("SFIXED32", 14, zzho2, 5);
        Enum enum_6 = enum_4;
        zzp = zzhn2 = new zzhn("SFIXED64", 15, (zzho)zzhnArray, 1);
        zzq = enum_4 = new zzhn("SINT32", 16, zzho2, 0);
        int n14 = 17;
        zzr = enum_5 = new zzhn("SINT64", n14, (zzho)zzhnArray, 0);
        zzhnArray = new zzhn[18];
        zzhnArray[0] = zzhn9;
        zzhnArray[1] = enum_;
        zzhnArray[2] = enum_2;
        zzhnArray[3] = zzhn8;
        zzhnArray[4] = zzhn7;
        zzhnArray[5] = zzhn6;
        zzhnArray[6] = zzhn5;
        zzhnArray[7] = zzhn4;
        zzhnArray[8] = enum_3;
        zzhnArray[9] = zzhn10;
        zzhnArray[10] = zzhn11;
        zzhnArray[11] = zzhn13;
        zzhnArray[12] = zzhn12;
        zzhnArray[13] = zzhn3;
        zzhnArray[14] = enum_6;
        zzhnArray[15] = zzhn2;
        zzhnArray[16] = enum_4;
        zzhnArray[n14] = enum_5;
        zzs = zzhnArray;
    }

    /*
     * WARNING - void declaration
     */
    private zzhn() {
        void var3_2;
        void var1_-1;
        this.zzt = var3_2;
    }

    public static zzhn[] values() {
        return (zzhn[])zzs.clone();
    }

    public final zzho zza() {
        return this.zzt;
    }
}

