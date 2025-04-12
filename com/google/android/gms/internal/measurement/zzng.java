/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zznf;
import com.google.android.gms.internal.measurement.zznh;
import com.google.android.gms.internal.measurement.zzni;
import com.google.android.gms.internal.measurement.zznj;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznm;

public class zzng
extends Enum {
    public static final /* enum */ zzng zza;
    public static final /* enum */ zzng zzb;
    public static final /* enum */ zzng zzc;
    public static final /* enum */ zzng zzd;
    public static final /* enum */ zzng zze;
    public static final /* enum */ zzng zzf;
    public static final /* enum */ zzng zzg;
    public static final /* enum */ zzng zzh;
    public static final /* enum */ zzng zzi;
    public static final /* enum */ zzng zzj;
    public static final /* enum */ zzng zzk;
    public static final /* enum */ zzng zzl;
    public static final /* enum */ zzng zzm;
    public static final /* enum */ zzng zzn;
    public static final /* enum */ zzng zzo;
    public static final /* enum */ zzng zzp;
    public static final /* enum */ zzng zzq;
    public static final /* enum */ zzng zzr;
    private static final /* synthetic */ zzng[] zzs;
    private final zznj zzt;
    private final int zzu;

    static {
        zzng zzng2;
        zzng zzng3;
        zznf zznf2;
        zzng zzng4;
        zzng zzng5;
        zzng zzng6;
        zzng zzng7;
        zzng zzng8;
        zzng zzng9;
        Enum enum_ = zznj.zzd;
        int n3 = 1;
        zza = zzng9 = new zzng("DOUBLE", 0, (zznj)enum_, n3);
        Enum enum_2 = zznj.zzc;
        int n4 = 5;
        zzb = enum_ = new zzng("FLOAT", n3, (zznj)enum_2, n4);
        zzng[] zzngArray = zznj.zzb;
        zzc = enum_2 = new zzng("INT64", 2, (zznj)zzngArray, 0);
        zzd = zzng8 = new zzng("UINT64", 3, (zznj)zzngArray, 0);
        Enum enum_3 = zznj.zza;
        zze = zzng7 = new zzng("INT32", 4, (zznj)enum_3, 0);
        zzf = zzng6 = new zzng("FIXED64", n4, (zznj)zzngArray, n3);
        zzg = zzng5 = new zzng("FIXED32", 6, (zznj)enum_3, n4);
        Enum enum_4 = zznj.zze;
        zzh = zzng4 = new zzng("BOOL", 7, (zznj)enum_4, 0);
        zznj zznj2 = zznj.zzf;
        int n7 = 2;
        Enum enum_5 = zznf2;
        zznf2 = new zznf("STRING", 8, zznj2, n7, null);
        zzi = zznf2;
        zznj2 = zznj.zzi;
        Enum enum_6 = enum_4;
        zzj = enum_4 = new zzni("GROUP", 9, zznj2, 3, null);
        enum_5 = enum_6;
        zzk = enum_6 = new zznh("MESSAGE", 10, zznj2, n7, null);
        zznj zznj3 = zznj.zzg;
        Enum enum_7 = enum_5;
        zzl = enum_5 = new zznk("BYTES", 11, zznj3, 2, null);
        Enum enum_8 = new zzng("UINT32", 12, (zznj)enum_3, 0);
        zzm = enum_8;
        zzng zzng10 = enum_8;
        enum_8 = zznj.zzh;
        enum_7 = enum_4;
        zzn = zzng3 = new zzng("ENUM", 13, (zznj)enum_8, 0);
        zzo = enum_4 = new zzng("SFIXED32", 14, (zznj)enum_3, 5);
        Enum enum_9 = enum_4;
        zzp = zzng2 = new zzng("SFIXED64", 15, (zznj)zzngArray, 1);
        zzq = enum_4 = new zzng("SINT32", 16, (zznj)enum_3, 0);
        n4 = 17;
        zzr = enum_3 = new zzng("SINT64", n4, (zznj)zzngArray, 0);
        zzngArray = new zzng[18];
        zzngArray[0] = zzng9;
        zzngArray[1] = enum_;
        zzngArray[2] = enum_2;
        zzngArray[3] = zzng8;
        zzngArray[4] = zzng7;
        zzngArray[5] = zzng6;
        zzngArray[6] = zzng5;
        zzngArray[7] = zzng4;
        zzngArray[8] = zznf2;
        zzngArray[9] = enum_7;
        zzngArray[10] = enum_6;
        zzngArray[11] = enum_5;
        zzngArray[12] = zzng10;
        zzngArray[13] = zzng3;
        zzngArray[14] = enum_9;
        zzngArray[15] = zzng2;
        zzngArray[16] = enum_4;
        zzngArray[n4] = enum_3;
        zzs = zzngArray;
    }

    /*
     * WARNING - void declaration
     */
    private zzng() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzt = var3_2;
        this.zzu = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ zzng(zznj zznj2, int n3, zznm zznm2) {
        this((String)var1_-1, n3, (zznj)((Object)zznm2), (int)var4_3);
        void var4_3;
        void var1_-1;
    }

    public static zzng[] values() {
        return (zzng[])zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zznj zzb() {
        return this.zzt;
    }
}

