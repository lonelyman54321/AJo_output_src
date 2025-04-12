/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzmi;
import com.google.android.gms.internal.vision.zzmk;
import com.google.android.gms.internal.vision.zzmm;
import com.google.android.gms.internal.vision.zzmn;
import com.google.android.gms.internal.vision.zzmo;
import com.google.android.gms.internal.vision.zzmp;

public class zzml
extends Enum {
    public static final /* enum */ zzml zza;
    public static final /* enum */ zzml zzb;
    public static final /* enum */ zzml zzc;
    public static final /* enum */ zzml zzd;
    public static final /* enum */ zzml zze;
    public static final /* enum */ zzml zzf;
    public static final /* enum */ zzml zzg;
    public static final /* enum */ zzml zzh;
    public static final /* enum */ zzml zzi;
    public static final /* enum */ zzml zzj;
    public static final /* enum */ zzml zzk;
    public static final /* enum */ zzml zzl;
    public static final /* enum */ zzml zzm;
    public static final /* enum */ zzml zzn;
    public static final /* enum */ zzml zzo;
    public static final /* enum */ zzml zzp;
    public static final /* enum */ zzml zzq;
    public static final /* enum */ zzml zzr;
    private static final /* synthetic */ zzml[] zzu;
    private final zzmo zzs;
    private final int zzt;

    static {
        zzml zzml2;
        zzml zzml3;
        zzml zzml4;
        zzml zzml5;
        zzml zzml6;
        zzml zzml7;
        Enum enum_ = zzmo.zzd;
        int n3 = 1;
        zza = zzml7 = new zzml("DOUBLE", 0, (zzmo)enum_, n3);
        Enum enum_2 = zzmo.zzc;
        int n4 = 5;
        zzb = enum_ = new zzml("FLOAT", n3, (zzmo)enum_2, n4);
        zzml[] zzmlArray = zzmo.zzb;
        int n7 = 2;
        zzc = enum_2 = new zzml("INT64", n7, (zzmo)zzmlArray, 0);
        int n8 = 3;
        zzd = zzml6 = new zzml("UINT64", n8, (zzmo)zzmlArray, 0);
        zzmo zzmo2 = zzmo.zza;
        zze = zzml5 = new zzml("INT32", 4, zzmo2, 0);
        zzf = zzml4 = new zzml("FIXED64", n4, (zzmo)zzmlArray, n3);
        zzg = zzml3 = new zzml("FIXED32", 6, zzmo2, n4);
        Enum enum_3 = zzmo.zze;
        zzh = zzml2 = new zzml("BOOL", 7, (zzmo)enum_3, 0);
        zzmo zzmo3 = zzmo.zzf;
        zzi = enum_3 = new zzmk(zzmo3, n7);
        zzmo3 = zzmo.zzi;
        Enum enum_4 = new zzmn(zzmo3, n8);
        zzj = enum_4;
        zzmn zzmn2 = enum_4;
        int n10 = 2;
        zzml zzml8 = new zzmm(zzmo3, n10);
        zzk = zzml8;
        Enum enum_5 = zzmo.zzg;
        zzmm zzmm2 = zzml8;
        zzml zzml9 = new zzmp((zzmo)enum_5, n10);
        zzl = zzml9;
        enum_4 = new zzml("UINT32", 12, zzmo2, 0);
        zzm = enum_4;
        zzml zzml10 = enum_4;
        enum_4 = zzmo.zzh;
        zzmp zzmp2 = zzml9;
        zzml8 = new zzml("ENUM", 13, (zzmo)enum_4, 0);
        zzn = zzml8;
        zzo = enum_4 = new zzml("SFIXED32", 14, zzmo2, 5);
        Enum enum_6 = enum_4;
        zzml9 = new zzml("SFIXED64", 15, (zzmo)zzmlArray, 1);
        zzp = zzml9;
        zzq = enum_4 = new zzml("SINT32", 16, zzmo2, 0);
        int n14 = 17;
        zzr = enum_5 = new zzml("SINT64", n14, (zzmo)zzmlArray, 0);
        zzmlArray = new zzml[18];
        zzmlArray[0] = zzml7;
        zzmlArray[1] = enum_;
        zzmlArray[2] = enum_2;
        zzmlArray[3] = zzml6;
        zzmlArray[4] = zzml5;
        zzmlArray[5] = zzml4;
        zzmlArray[6] = zzml3;
        zzmlArray[7] = zzml2;
        zzmlArray[8] = enum_3;
        zzmlArray[9] = zzmn2;
        zzmlArray[10] = zzmm2;
        zzmlArray[11] = zzmp2;
        zzmlArray[12] = zzml10;
        zzmlArray[13] = zzml8;
        zzmlArray[14] = enum_6;
        zzmlArray[15] = zzml9;
        zzmlArray[16] = enum_4;
        zzmlArray[n14] = enum_5;
        zzu = zzmlArray;
    }

    /*
     * WARNING - void declaration
     */
    private zzml() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzs = var3_2;
        this.zzt = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ zzml(zzmo zzmo2, int n3, zzmi zzmi2) {
        this((String)var1_-1, n3, (zzmo)((Object)zzmi2), (int)var4_3);
        void var4_3;
        void var1_-1;
    }

    public static zzml[] values() {
        return (zzml[])zzu.clone();
    }

    public final zzmo zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}

