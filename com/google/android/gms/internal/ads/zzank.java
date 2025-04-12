/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 */
package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.google.android.gms.internal.ads.zzeg;

final class zzank {
    public long zza;
    public long zzb;
    public CharSequence zzc;
    public int zzd;
    public float zze;
    public int zzf;
    public int zzg;
    public float zzh;
    public int zzi;
    public float zzj;
    public int zzk;

    public zzank() {
        int n3;
        float f5;
        long l2;
        this.zza = l2 = 0L;
        this.zzb = l2;
        this.zzd = 2;
        this.zze = f5 = -3.4028235E38f;
        this.zzf = 1;
        this.zzg = 0;
        this.zzh = f5;
        this.zzi = n3 = -1 << -1;
        this.zzj = 1.0f;
        this.zzk = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzeg zza() {
        block29: {
            block27: {
                block28: {
                    block25: {
                        block26: {
                            var1_1 = this.zzh;
                            var2_2 = 0;
                            var3_3 = 0.0f;
                            var4_4 = null;
                            var5_5 = 0x3F000000;
                            var6_6 = 0.5f;
                            var7_7 = 5;
                            var8_8 = 7.0E-45f;
                            var9_9 = 4;
                            var10_10 = 1.0f;
                            var11_11 = -3.4028235E38f;
                            cfr_temp_0 = var1_1 - var11_11;
                            var12_12 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var12_12 /* !! */  == false) {
                                var13_13 = this.zzd;
                                if (var13_13 != var9_9) {
                                    if (var13_13 != var7_7) {
                                        var13_13 = 0x3F000000;
                                        var1_1 = 0.5f;
                                    } else {
                                        var13_13 = 1065353216;
                                        var1_1 = 1.0f;
                                    }
                                } else {
                                    var13_13 = 0;
                                    var1_1 = 0.0f;
                                    var14_14 = null;
                                }
                            }
                            var12_12 /* !! */  = this.zzi;
                            var15_15 = -1 << -1;
                            var16_16 = 3;
                            var17_17 = 2;
                            var18_18 = 1;
                            if (var12_12 /* !! */  != var15_15) break block25;
                            var12_12 /* !! */  = this.zzd;
                            if (var12_12 /* !! */  == var18_18) break block26;
                            if (var12_12 /* !! */  == var16_16) ** GOTO lbl-1000
                            if (var12_12 /* !! */  != var9_9) {
                                ** if (var12_12 /* !! */  == var7_7) goto lbl-1000
lbl-1000:
                                // 1 sources

                                {
                                    var12_12 /* !! */  = (float)true;
                                    ** GOTO lbl45
                                }
                            }
                            break block26;
lbl-1000:
                            // 2 sources

                            {
                                var12_12 /* !! */  = 2;
                            }
                            break block25;
                        }
                        var12_12 /* !! */  = (float)false;
                    }
                    var19_19 = new zzeg();
                    var20_20 = this.zzd;
                    if (var20_20 == var18_18) break block27;
                    if (var20_20 == var17_17) break block28;
                    if (var20_20 == var16_16) ** GOTO lbl-1000
                    if (var20_20 != var9_9) {
                        ** if (var20_20 == var7_7) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var21_21 = "WebvttCueParser";
                            w12_0.a((int)var20_20, (String)"Unknown textAlignment: ", (String)var21_21);
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var22_22 = null;
                            ** GOTO lbl67
                        }
                    }
                    break block27;
lbl-1000:
                    // 2 sources

                    {
                        var22_22 = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    break block29;
                }
                var22_22 = Layout.Alignment.ALIGN_CENTER;
                break block29;
            }
            var22_22 = Layout.Alignment.ALIGN_NORMAL;
        }
        var19_19.zzm(var22_22);
        var8_8 = this.zze;
        var9_9 = this.zzf;
        var16_16 = (int)(var8_8 == var11_11 ? 0 : (var8_8 > var11_11 ? 1 : -1));
        if (var16_16 != 0 && var9_9 == 0 && ((var2_2 = (cfr_temp_1 = var8_8 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)) < 0 || (var2_2 = (int)(var8_8 == var10_10 ? 0 : (var8_8 > var10_10 ? 1 : -1))) > 0)) lbl-1000:
        // 2 sources

        {
            while (true) {
                var11_11 = 1.0f;
                break;
            }
        } else if (var16_16 == 0) {
            if (var9_9 == 0) {
                ** continue;
            }
        } else {
            var11_11 = var8_8;
        }
        var19_19.zze(var11_11, var9_9);
        var2_2 = this.zzg;
        var19_19.zzf(var2_2);
        var19_19.zzh(var1_1);
        var19_19.zzi((int)var12_12 /* !! */ );
        var3_3 = this.zzj;
        if (var12_12 /* !! */  != false) {
            if (var12_12 /* !! */  != var18_18) {
                if (var12_12 /* !! */  != var17_17) {
                    var4_4 = String.valueOf((int)var12_12 /* !! */ );
                    var14_14 = new IllegalStateException(var4_4);
                    throw var14_14;
                }
            } else {
                var5_5 = (int)(var1_1 == var6_6 ? 0 : (var1_1 < var6_6 ? -1 : 1));
                if (var5_5 <= 0) {
                    var1_1 += var1_1;
                } else {
                    var10_10 -= var1_1;
                    var1_1 = var10_10 + var10_10;
                }
            }
        } else {
            var1_1 = var10_10 - var1_1;
        }
        var1_1 = Math.min(var3_3, var1_1);
        var19_19.zzk(var1_1);
        var13_13 = this.zzk;
        var19_19.zzo(var13_13);
        var14_14 = this.zzc;
        if (var14_14 != null) {
            var19_19.zzl((CharSequence)var14_14);
        }
        return var19_19;
    }
}

