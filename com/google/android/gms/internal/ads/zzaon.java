/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaom;
import com.google.android.gms.internal.ads.zzaor;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgr;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzt;
import java.util.Collections;
import java.util.List;

public final class zzaon
implements zzaoc {
    private final zzapd zza;
    private String zzb;
    private zzafa zzc;
    private zzaom zzd;
    private boolean zze;
    private final boolean[] zzf;
    private final zzaor zzg;
    private final zzaor zzh;
    private final zzaor zzi;
    private final zzaor zzj;
    private final zzaor zzk;
    private long zzl;
    private long zzm;
    private final zzfu zzn;

    public zzaon(zzapd object) {
        this.zza = object;
        object = new boolean[3];
        this.zzf = (boolean[])object;
        int n3 = 128;
        this.zzg = object = new zzaor(32, n3);
        this.zzh = object = new zzaor(33, n3);
        this.zzi = object = new zzaor(34, n3);
        this.zzj = object = new zzaor(39, n3);
        this.zzk = object = new zzaor(40, n3);
        this.zzm = -9223372036854775807L;
        this.zzn = object = new zzfu();
    }

    private final void zzf(byte[] byArray, int n3, int n4) {
        Object object = this.zzd;
        ((zzaom)object).zzb(byArray, n3, n4);
        boolean bl2 = this.zze;
        if (!bl2) {
            this.zzg.zza(byArray, n3, n4);
            this.zzh.zza(byArray, n3, n4);
            object = this.zzi;
            ((zzaor)object).zza(byArray, n3, n4);
        }
        this.zzj.zza(byArray, n3, n4);
        this.zzk.zza(byArray, n3, n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(zzfu var1_1) {
        var2_2 = this;
        var3_3 = this.zzc;
        zzeq.zzb(var3_3);
        var4_4 = zzgd.zza;
        block0: while ((var4_4 = var1_1.zzb()) > 0) {
            var4_4 = var1_1.zzd();
            var5_5 = var1_1.zze();
            var6_6 /* !! */  = var1_1.zzM();
            var7_7 = var2_2.zzl;
            var9_8 = var1_1.zzb();
            var10_9 = var9_8;
            var2_2.zzl = var7_7 += var10_9;
            var12_10 = var2_2.zzc;
            var13_11 = var1_1.zzb();
            var14_12 = var1_1;
            var12_10.zzq(var1_1, var13_11);
            while (var4_4 < var5_5) {
                block10: {
                    var12_10 = var2_2.zzf;
                    var15_13 = zzgr.zza(var6_6 /* !! */ , var4_4, var5_5, (boolean[])var12_10);
                    if (var15_13 == var5_5) break block10;
                    var13_11 = var15_13 + 3;
                    var16_14 = var6_6 /* !! */ [var13_11] & 126;
                    var17_15 = var15_13 - var4_4;
                    if (var17_15 > 0) {
                        var2_2.zzf(var6_6 /* !! */ , var4_4, var15_13);
                    }
                    var18_16 = var5_5 - var15_13;
                    var19_17 = var2_2.zzl;
                    var21_18 = var18_16;
                    var23_19 = var19_17 - var21_18;
                    if (var17_15 < 0) {
                        var15_13 = -var17_15;
                    } else {
                        var15_13 = 0;
                        var12_10 = null;
                    }
                    var25_20 = var2_2.zzm;
                    var27_21 = var2_2.zzd;
                    var28_22 = var2_2.zze;
                    var27_21.zza(var23_19, var18_16, (boolean)var28_22);
                    var29_23 = var2_2.zze;
                    if (var29_23 != 0) ** GOTO lbl-1000
                    var2_2.zzg.zzd(var15_13);
                    var2_2.zzh.zzd(var15_13);
                    var2_2.zzi.zzd(var15_13);
                    var27_21 = var2_2.zzg;
                    var30_24 = var27_21.zze();
                    if (var30_24 != 0 && (var32_26 = (var31_25 = var2_2.zzh).zze()) && (var34_28 = (var33_27 = var2_2.zzi).zze())) {
                        var3_3 = var2_2.zzc;
                        var35_29 = var13_11;
                        var36_30 = var2_2.zzb;
                        var9_8 = var27_21.zzb;
                        var37_31 = var5_5;
                        var5_5 = var31_25.zzb + var9_8;
                        var38_32 = var6_6 /* !! */ ;
                        var39_33 = var33_27.zzb;
                        var40_34 = new byte[var5_5 += var39_33];
                        var6_6 /* !! */  = var27_21.zza;
                        var41_35 = var18_16;
                        System.arraycopy(var6_6 /* !! */ , 0, var40_34, 0, var9_8);
                        var6_6 /* !! */  = var31_25.zza;
                        var9_8 = var27_21.zzb;
                        var42_36 = var23_19;
                        var44_37 = var31_25.zzb;
                        System.arraycopy(var6_6 /* !! */ , 0, var40_34, var9_8, var44_37);
                        var6_6 /* !! */  = var33_27.zza;
                        var9_8 = var27_21.zzb;
                        var44_37 = var31_25.zzb;
                        var9_8 += var44_37;
                        var44_37 = var33_27.zzb;
                        System.arraycopy(var6_6 /* !! */ , 0, var40_34, var9_8, var44_37);
                        var6_6 /* !! */  = var31_25.zza;
                        var9_8 = var31_25.zzb;
                        var6_6 /* !! */  = (byte[])zzgr.zzc(var6_6 /* !! */ , 5, var9_8);
                        var9_8 = var6_6 /* !! */ .zza;
                        var44_37 = (int)var6_6 /* !! */ .zzb;
                        var45_38 = var6_6 /* !! */ .zzc;
                        var18_16 = var6_6 /* !! */ .zzd;
                        var27_21 = var6_6 /* !! */ .zzg;
                        var28_22 = var6_6 /* !! */ .zzh;
                        var14_12 = zzes.zzb(var9_8, (boolean)var44_37, var45_38, var18_16, (int[])var27_21, var28_22);
                        var46_39 = new zzal();
                        var46_39.zzK((String)var36_30);
                        var46_39.zzX("video/hevc");
                        var46_39.zzz((String)var14_12);
                        var13_11 = var6_6 /* !! */ .zzi;
                        var46_39.zzac(var13_11);
                        var13_11 = var6_6 /* !! */ .zzj;
                        var46_39.zzI(var13_11);
                        var36_30 = new zzr();
                        var9_8 = var6_6 /* !! */ .zzl;
                        var36_30.zzc(var9_8);
                        var9_8 = var6_6 /* !! */ .zzm;
                        var36_30.zzb(var9_8);
                        var9_8 = var6_6 /* !! */ .zzn;
                        var36_30.zzd(var9_8);
                        var9_8 = var6_6 /* !! */ .zze + 8;
                        var36_30.zzf(var9_8);
                        var9_8 = var6_6 /* !! */ .zzf + 8;
                        var36_30.zza(var9_8);
                        var36_30 = var36_30.zzg();
                        var46_39.zzA((zzt)var36_30);
                        var47_40 = var6_6 /* !! */ .zzk;
                        var46_39.zzT(var47_40);
                        var40_34 = Collections.singletonList(var40_34);
                        var46_39.zzL((List)var40_34);
                        var40_34 = var46_39.zzad();
                        var3_3.zzl((zzan)var40_34);
                        var4_4 = 1;
                        var2_2.zze = var4_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var37_31 = var5_5;
                        var38_32 = var6_6 /* !! */ ;
                        var35_29 = var13_11;
                        var42_36 = var23_19;
                        var41_35 = var18_16;
                    }
                    var3_3 = var2_2.zzj;
                    var4_4 = (int)var3_3.zzd(var15_13);
                    if (var4_4 != 0) {
                        var3_3 = var2_2.zzj;
                        var40_34 = var3_3.zza;
                        var4_4 = var3_3.zzb;
                        var4_4 = zzgr.zzb((byte[])var40_34, var4_4);
                        var40_34 = var2_2.zzn;
                        var6_6 /* !! */  = var2_2.zzj.zza;
                        var40_34.zzI(var6_6 /* !! */ , var4_4);
                        var3_3 = var2_2.zzn;
                        var5_5 = 5;
                        var3_3.zzL(var5_5);
                        var3_3 = var2_2.zza;
                        var40_34 = var2_2.zzn;
                        var3_3.zza(var25_20, (zzfu)var40_34);
                    }
                    if ((var4_4 = (int)(var3_3 = var2_2.zzk).zzd(var15_13)) != 0) {
                        var3_3 = var2_2.zzk;
                        var40_34 = var3_3.zza;
                        var4_4 = var3_3.zzb;
                        var4_4 = zzgr.zzb((byte[])var40_34, var4_4);
                        var40_34 = var2_2.zzn;
                        var6_6 /* !! */  = var2_2.zzk.zza;
                        var40_34.zzI(var6_6 /* !! */ , var4_4);
                        var3_3 = var2_2.zzn;
                        var5_5 = 5;
                        var3_3.zzL(var5_5);
                        var3_3 = var2_2.zza;
                        var40_34 = var2_2.zzn;
                        var3_3.zza(var25_20, (zzfu)var40_34);
                    }
                    var4_4 = var16_14 >> 1;
                    var48_41 = var2_2.zzm;
                    var50_42 = var2_2.zzd;
                    var5_5 = (int)var2_2.zze;
                    var23_19 = var42_36;
                    var18_16 = var41_35;
                    var29_23 = var4_4;
                    var30_24 = var5_5;
                    var50_42.zzd(var42_36, var41_35, var4_4, var48_41, (boolean)var5_5);
                    var5_5 = (int)var2_2.zze;
                    if (var5_5 == 0) {
                        var2_2.zzg.zzc(var4_4);
                        var2_2.zzh.zzc(var4_4);
                        var40_34 = var2_2.zzi;
                        var40_34.zzc(var4_4);
                    }
                    var2_2.zzj.zzc(var4_4);
                    var40_34 = var2_2.zzk;
                    var40_34.zzc(var4_4);
                    var14_12 = var1_1;
                    var4_4 = var35_29;
                    var5_5 = var37_31;
                    var6_6 /* !! */  = var38_32;
                    continue;
                }
                var2_2.zzf(var6_6 /* !! */ , var4_4, var5_5);
                break block0;
            }
        }
    }

    public final void zzb(zzadx zzadx2, zzapo zzapo2) {
        zzaom zzaom2;
        zzapo2.zzc();
        Object object = zzapo2.zzb();
        this.zzb = object;
        int n3 = zzapo2.zza();
        this.zzc = object = zzadx2.zzw(n3, 2);
        this.zzd = zzaom2 = new zzaom((zzafa)object);
        this.zza.zzb(zzadx2, zzapo2);
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzm = l2;
    }

    public final void zze() {
        long l2;
        this.zzl = 0L;
        this.zzm = l2 = -9223372036854775807L;
        zzgr.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzaom zzaom2 = this.zzd;
        if (zzaom2 != null) {
            zzaom2.zzc();
        }
    }
}

