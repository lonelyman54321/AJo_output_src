/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgb;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

final class zzapj
implements zzapb {
    final /* synthetic */ zzapk zza;
    private final zzft zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapj(zzapk object, int n3) {
        this.zza = object;
        int n4 = 5;
        byte[] byArray = new byte[n4];
        this.zzb = object = new zzft(byArray, n4);
        object = new SparseArray();
        this.zzc = object;
        object = new SparseIntArray();
        this.zzd = object;
        this.zze = n3;
    }

    /*
     * Unable to fully structure code
     */
    public final void zza(zzfu var1_1) {
        block31: {
            var2_2 = this;
            var3_3 = var1_1;
            var4_4 = var1_1.zzm();
            if (var4_4 != (var5_5 = 2)) break block31;
            var6_6 = (zzgb)zzapk.zzl(this.zza).get(0);
            var7_7 = var1_1.zzm() & 128;
            if (var7_7 == 0) break block31;
            var7_7 = 1;
            var1_1.zzL(var7_7);
            var8_8 = var1_1.zzq();
            var9_9 = 3;
            var1_1.zzL(var9_9);
            var10_10 = this.zzb;
            var1_1.zzF((zzft)var10_10, var5_5);
            this.zzb.zzm(var9_9);
            var10_10 = this.zza;
            var11_11 = this.zzb;
            var12_12 = 13;
            var13_13 = var11_11.zzd(var12_12);
            zzapk.zzm((zzapk)var10_10, var13_13);
            var10_10 = this.zzb;
            var1_1.zzF((zzft)var10_10, var5_5);
            var14_14 = this.zzb;
            var15_15 = 4;
            var14_14.zzm(var15_15);
            var14_14 = this.zzb;
            var13_13 = 12;
            var5_5 = var14_14.zzd(var13_13);
            var1_1.zzL(var5_5);
            this.zzc.clear();
            var14_14 = this.zzd;
            var14_14.clear();
            var5_5 = var1_1.zzb();
            while (var5_5 > 0) {
                var16_16 = var2_2.zzb;
                var17_17 = 5;
                var3_3.zzF(var16_16, var17_17);
                var16_16 = var2_2.zzb;
                var18_18 = var16_16.zzd(8);
                var16_16.zzm(var9_9);
                var16_16 = var2_2.zzb;
                var19_19 = var16_16.zzd(var12_12);
                var2_2.zzb.zzm(var15_15);
                var20_20 = var2_2.zzb;
                var21_21 = var20_20.zzd(var13_13);
                var22_22 = var1_1.zzd();
                var13_13 = var22_22 + var21_21;
                var23_23 = -1;
                var24_24 = null;
                var25_25 = null;
                var26_26 = -1;
                var27_27 = 0;
                while (true) {
                    block30: {
                        if ((var12_12 = var1_1.zzd()) >= var13_13) break;
                        var12_12 = var1_1.zzm();
                        var23_23 = var1_1.zzm();
                        var28_28 = var1_1.zzd();
                        var7_7 = var28_28 + var23_23;
                        if (var7_7 > var13_13) {
                            break;
                        }
                        var23_23 = 172;
                        var28_28 = 135;
                        if (var12_12 != var17_17) ** GOTO lbl99
                        var30_30 = var1_1.zzu();
                        cfr_temp_0 = var30_30 - (var32_31 = 1094921523L);
                        var12_12 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var12_12 == 0) {
                            while (true) {
                                var29_29 = var6_6;
                                var26_26 = 129;
                                break block30;
                                break;
                            }
                        }
                        var32_31 = 1161904947L;
                        cfr_temp_1 = var30_30 - var32_31;
                        var12_12 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var12_12 == 0) {
                            while (true) {
                                var29_29 = var6_6;
                                var26_26 = 135;
                                break block30;
                                break;
                            }
                        }
                        var32_31 = 1094921524L;
                        cfr_temp_2 = var30_30 - var32_31;
                        var12_12 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var12_12 == 0) {
                            while (true) {
                                var29_29 = var6_6;
                                var26_26 = 172;
                                break block30;
                                break;
                            }
                        }
                        var34_32 = 1212503619L;
                        cfr_temp_3 = var30_30 - var34_32;
                        var12_12 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                        if (var12_12 == 0) {
                            var12_12 = 36;
                            var29_29 = var6_6;
                            var26_26 = 36;
                        } else {
                            while (true) {
                                var29_29 = var6_6;
                                break block30;
                                break;
                            }
lbl99:
                            // 1 sources

                            if (var12_12 == (var17_17 = 106)) ** continue;
                            if (var12_12 == (var17_17 = 122)) ** continue;
                            var17_17 = 127;
                            if (var12_12 == var17_17) {
                                if ((var12_12 = var1_1.zzm()) == (var17_17 = 21)) ** continue;
                                var17_17 = 14;
                                if (var12_12 == var17_17) {
                                    var12_12 = 136;
                                    var29_29 = var6_6;
                                    var26_26 = 136;
                                } else {
                                    if (var12_12 != (var17_17 = 33)) ** continue;
                                    var12_12 = 139;
                                    var29_29 = var6_6;
                                    var26_26 = 139;
                                }
                            } else {
                                var17_17 = 123;
                                if (var12_12 == var17_17) {
                                    var12_12 = 138;
                                    var29_29 = var6_6;
                                    var26_26 = 138;
                                } else {
                                    var17_17 = 10;
                                    if (var12_12 == var17_17) {
                                        var36_33 = zzfxs.zzc;
                                        var36_33 = var3_3.zzA(var9_9, (Charset)var36_33).trim();
                                        var27_27 = var1_1.zzm();
                                        var29_29 = var6_6;
                                        var24_24 = var36_33;
                                    } else {
                                        var17_17 = 89;
                                        if (var12_12 == var17_17) {
                                            var36_33 = new ArrayList<Object>();
                                            while ((var17_17 = var1_1.zzd()) < var7_7) {
                                                var37_34 = zzfxs.zzc;
                                                var37_34 = var3_3.zzA(var9_9, (Charset)var37_34).trim();
                                                var9_9 = var1_1.zzm();
                                                var29_29 = var6_6;
                                                var6_6 = new byte[var15_15];
                                                var3_3.zzG((byte[])var6_6, 0, var15_15);
                                                var10_10 = new zzapl((String)var37_34, var9_9, (byte[])var6_6);
                                                var36_33.add(var10_10);
                                                var6_6 = var29_29;
                                                var9_9 = 3;
                                                var15_15 = 4;
                                            }
                                            var29_29 = var6_6;
                                            var25_25 = var36_33;
                                            var26_26 = 89;
                                        } else {
                                            var29_29 = var6_6;
                                            var4_4 = 111;
                                            if (var12_12 == var4_4) {
                                                var4_4 = 257;
                                                var26_26 = 257;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var4_4 = var1_1.zzd();
                    var3_3.zzL(var7_7 -= var4_4);
                    var6_6 = var29_29;
                    var7_7 = 1;
                    var9_9 = 3;
                    var15_15 = 4;
                    var17_17 = 5;
                }
                var29_29 = var6_6;
                var3_3.zzK(var13_13);
                var38_35 = var1_1.zzM();
                var39_36 = Arrays.copyOfRange((byte[])var38_35, var22_22, var13_13);
                var6_6 = new zzapm(var26_26, (String)var24_24, var27_27, var25_25, var39_36);
                var7_7 = 6;
                if (var18_18 == var7_7 || var18_18 == (var7_7 = 5)) {
                    var18_18 = var6_6.zza;
                }
                var5_5 -= (var21_21 += 5);
                var38_35 = zzapk.zzh(var2_2.zza);
                var7_7 = (int)var38_35.get(var19_19);
                if (var7_7 == 0) {
                    var6_6 = zzapk.zzk(var2_2.zza).zza(var18_18, (zzapm)var6_6);
                    var2_2.zzd.put(var19_19, var19_19);
                    var38_35 = var2_2.zzc;
                    var38_35.put(var19_19, var6_6);
                }
                var6_6 = var29_29;
                var7_7 = 1;
                var9_9 = 3;
                var15_15 = 4;
                var13_13 = 12;
                var12_12 = 13;
            }
            var29_29 = var6_6;
            var3_3 = var2_2.zzd;
            var40_37 = var3_3.size();
            var6_6 = null;
            for (var4_4 = 0; var4_4 < var40_37; ++var4_4) {
                var14_14 = var2_2.zzd;
                var38_35 = var2_2.zza;
                var9_9 = var14_14.keyAt(var4_4);
                var5_5 = var14_14.valueAt(var4_4);
                var38_35 = zzapk.zzh((zzapk)var38_35);
                var15_15 = 1;
                var38_35.put(var9_9, (boolean)var15_15);
                zzapk.zzi(var2_2.zza).put(var5_5, (boolean)var15_15);
                var38_35 = (zzapp)var2_2.zzc.valueAt(var4_4);
                if (var38_35 != null) {
                    var10_10 = zzapk.zzj(var2_2.zza);
                    var12_12 = 8192;
                    var11_11 = new zzapo(var8_8, var9_9, var12_12);
                    var41_38 = var29_29;
                    var38_35.zzb((zzgb)var29_29, (zzadx)var10_10, (zzapo)var11_11);
                    var10_10 = zzapk.zzg(var2_2.zza);
                    var10_10.put(var5_5, var38_35);
                } else {
                    var41_38 = var29_29;
                }
                var29_29 = var41_38;
            }
            var3_3 = var2_2.zza;
            var4_4 = var2_2.zze;
            zzapk.zzg((zzapk)var3_3).remove(var4_4);
            zzapk.zzn(var2_2.zza, 0);
            var3_3 = var2_2.zza;
            var4_4 = zzapk.zza((zzapk)var3_3);
            if (var4_4 == 0) {
                zzapk.zzj((zzapk)var3_3).zzD();
                var3_3 = var2_2.zza;
                var4_4 = 1;
                zzapk.zzo((zzapk)var3_3, (boolean)var4_4);
            }
        }
    }

    public final void zzb(zzgb zzgb2, zzadx zzadx2, zzapo zzapo2) {
    }
}

