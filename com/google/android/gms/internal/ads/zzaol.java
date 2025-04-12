/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaor;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgp;
import com.google.android.gms.internal.ads.zzgq;
import com.google.android.gms.internal.ads.zzgr;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzaol
implements zzaoc {
    private final zzapd zza;
    private final zzaor zzb;
    private final zzaor zzc;
    private final zzaor zzd;
    private long zze;
    private final boolean[] zzf;
    private String zzg;
    private zzafa zzh;
    private zzaok zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private final zzfu zzm;

    public zzaol(zzapd object, boolean bl2, boolean bl3) {
        this.zza = object;
        object = new boolean[3];
        this.zzf = (boolean[])object;
        int n3 = 128;
        this.zzb = object = new zzaor(7, n3);
        this.zzc = object = new zzaor(8, n3);
        this.zzd = object = new zzaor(6, n3);
        this.zzk = -9223372036854775807L;
        this.zzm = object = new zzfu();
    }

    private final void zzf(byte[] byArray, int n3, int n4) {
        boolean bl2 = this.zzj;
        if (!bl2) {
            this.zzb.zza(byArray, n3, n4);
            zzaor zzaor2 = this.zzc;
            zzaor2.zza(byArray, n3, n4);
        }
        this.zzd.zza(byArray, n3, n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(zzfu var1_1) {
        var2_2 = this;
        var3_3 = this.zzh;
        zzeq.zzb(var3_3);
        var4_4 = zzgd.zza;
        var4_4 = var1_1.zzd();
        var5_5 = var1_1.zze();
        var6_6 = var1_1.zzM();
        var7_7 = this.zze;
        var9_8 = var1_1.zzb();
        var10_9 = var9_8;
        this.zze = var7_7 += var10_9;
        var12_10 = this.zzh;
        var13_11 = var1_1.zzb();
        var12_10.zzq(var1_1, var13_11);
        while ((var14_12 = zzgr.zza(var6_6, var4_4, var5_5, (boolean[])(var12_10 = (Object)var2_2.zzf))) != var5_5) {
            var13_11 = var14_12 + 3;
            var15_13 = var6_6[var13_11] & 31;
            var9_8 = var14_12 - var4_4;
            if (var9_8 > 0) {
                var2_2.zzf(var6_6, var4_4, var14_12);
            }
            var4_4 = var5_5 - var14_12;
            var16_14 = var2_2.zze;
            var18_15 = var4_4;
            var20_16 = var16_14 - var18_15;
            var9_8 = var9_8 < 0 ? -var9_8 : 0;
            var18_15 = var2_2.zzk;
            var22_17 = var2_2.zzj;
            var23_18 = 4;
            if (var22_17) {
                while (true) {
                    var24_19 = var5_5;
                    var25_20 = var13_11;
                    break;
                }
            } else {
                var2_2.zzb.zzd(var9_8);
                var26_21 = var2_2.zzc;
                var26_21.zzd(var9_8);
                var22_17 = var2_2.zzj;
                if (!var22_17) {
                    if (!(var22_17 = (var26_21 = var2_2.zzb).zze()) || !(var22_17 = (var26_21 = var2_2.zzc).zze())) ** continue;
                    var26_21 = new ArrayList();
                    var27_22 = var2_2.zzb;
                    var28_23 = var27_22.zza;
                    var29_24 = var27_22.zzb;
                    var27_22 = Arrays.copyOf((byte[])var28_23, var29_24);
                    var26_21.add(var27_22);
                    var27_22 = var2_2.zzc;
                    var28_23 = var27_22.zza;
                    var29_24 = var27_22.zzb;
                    var27_22 = Arrays.copyOf((byte[])var28_23, var29_24);
                    var26_21.add(var27_22);
                    var27_22 = var2_2.zzb;
                    var28_23 = var27_22.zza;
                    var29_24 = var27_22.zzb;
                    var27_22 = zzgr.zze((byte[])var28_23, var23_18, var29_24);
                    var28_23 = var2_2.zzc;
                    var12_10 = var28_23.zza;
                    var30_25 = var28_23.zzb;
                    var12_10 = zzgr.zzd((byte[])var12_10, var23_18, var30_25);
                    var30_25 = var27_22.zza;
                    var23_18 = var27_22.zzb;
                    var25_20 = var13_11;
                    var13_11 = var27_22.zzc;
                    var31_26 /* !! */  = (byte[])zzes.zza(var30_25, var23_18, var13_11);
                    var32_27 = var2_2.zzh;
                    var28_23 = new zzal;
                    var28_23();
                    var24_19 = var5_5;
                    var33_28 = var2_2.zzg;
                    var28_23.zzK((String)var33_28);
                    var28_23.zzX("video/avc");
                    var28_23.zzz((String)var31_26 /* !! */ );
                    var5_5 = var27_22.zze;
                    var28_23.zzac(var5_5);
                    var5_5 = var27_22.zzf;
                    var28_23.zzI(var5_5);
                    var33_28 = new zzr();
                    var13_11 = var27_22.zzj;
                    var33_28.zzc(var13_11);
                    var13_11 = var27_22.zzk;
                    var33_28.zzb(var13_11);
                    var13_11 = var27_22.zzl;
                    var33_28.zzd(var13_11);
                    var13_11 = var27_22.zzh + 8;
                    var33_28.zzf(var13_11);
                    var13_11 = var27_22.zzi + 8;
                    var33_28.zza(var13_11);
                    var33_28 = var33_28.zzg();
                    var28_23.zzA((zzt)var33_28);
                    var34_29 = var27_22.zzg;
                    var28_23.zzT(var34_29);
                    var28_23.zzL((List)var26_21);
                    var33_28 = var28_23.zzad();
                    var32_27.zzl((zzan)var33_28);
                    var5_5 = 1;
                    var34_29 = 1.4E-45f;
                    var2_2.zzj = var5_5;
                    var2_2.zzi.zzb((zzgq)var27_22);
                    var2_2.zzi.zza((zzgp)var12_10);
                    var2_2.zzb.zzb();
                    var33_28 = var2_2.zzc;
                    var33_28.zzb();
                } else {
                    var24_19 = var5_5;
                    var25_20 = var13_11;
                    var33_28 = var2_2.zzb;
                    var14_12 = var33_28.zze();
                    if (var14_12 != 0) {
                        var12_10 = var33_28.zza;
                        var5_5 = var33_28.zzb;
                        var13_11 = 4;
                        var33_28 = zzgr.zze((byte[])var12_10, var13_11, var5_5);
                        var12_10 = var2_2.zzi;
                        var12_10.zzb((zzgq)var33_28);
                        var33_28 = var2_2.zzb;
                        var33_28.zzb();
                    } else {
                        var13_11 = 4;
                        var33_28 = var2_2.zzc;
                        var14_12 = var33_28.zze();
                        if (var14_12 != 0) {
                            var12_10 = var33_28.zza;
                            var5_5 = var33_28.zzb;
                            var33_28 = zzgr.zzd((byte[])var12_10, var13_11, var5_5);
                            var12_10 = var2_2.zzi;
                            var12_10.zza((zzgp)var33_28);
                            var33_28 = var2_2.zzc;
                            var33_28.zzb();
                        }
                    }
                }
            }
            var33_28 = var2_2.zzd;
            var5_5 = (int)var33_28.zzd(var9_8);
            if (var5_5 != 0) {
                var33_28 = var2_2.zzd;
                var12_10 = var33_28.zza;
                var5_5 = var33_28.zzb;
                var5_5 = zzgr.zzb((byte[])var12_10, var5_5);
                var12_10 = var2_2.zzm;
                var31_26 /* !! */  = var2_2.zzd.zza;
                var12_10.zzI(var31_26 /* !! */ , var5_5);
                var33_28 = var2_2.zzm;
                var14_12 = 4;
                var33_28.zzK(var14_12);
                var33_28 = var2_2.zza;
                var12_10 = var2_2.zzm;
                var33_28.zza(var18_15, (zzfu)var12_10);
            }
            if ((var4_4 = (int)(var33_28 = var2_2.zzi).zze(var20_16, var4_4, (boolean)(var14_12 = (int)var2_2.zzj))) != 0) {
                var4_4 = 0;
                var3_3 = null;
                var2_2.zzl = false;
            }
            var18_15 = var2_2.zzk;
            var4_4 = (int)var2_2.zzj;
            if (var4_4 == 0) {
                var2_2.zzb.zzc(var15_13);
                var3_3 = var2_2.zzc;
                var3_3.zzc(var15_13);
            }
            var3_3 = var2_2.zzd;
            var3_3.zzc(var15_13);
            var26_21 = var2_2.zzi;
            var23_18 = (int)var2_2.zzl;
            var26_21.zzd(var20_16, var15_13, var18_15, (boolean)var23_18);
            var4_4 = var25_20;
            var5_5 = var24_19;
        }
        var2_2.zzf(var6_6, var4_4, var5_5);
    }

    public final void zzb(zzadx zzadx2, zzapo zzapo2) {
        zzaok zzaok2;
        zzapo2.zzc();
        Object object = zzapo2.zzb();
        this.zzg = object;
        int n3 = zzapo2.zza();
        this.zzh = object = zzadx2.zzw(n3, 2);
        this.zzi = zzaok2 = new zzaok((zzafa)object, false, false);
        this.zza.zzb(zzadx2, zzapo2);
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzk = l2;
        int n4 = n3 & 2;
        int n7 = this.zzl;
        n4 = n4 != 0 ? 1 : 0;
        this.zzl = n4 |= n7;
    }

    public final void zze() {
        long l2;
        this.zze = 0L;
        this.zzl = false;
        this.zzk = l2 = -9223372036854775807L;
        zzgr.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaok zzaok2 = this.zzi;
        if (zzaok2 != null) {
            zzaok2.zzc();
        }
    }
}

