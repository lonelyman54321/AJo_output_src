/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 */
package com.google.android.gms.internal.ads;

import android.graphics.Point;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzzd;
import java.util.List;

public final class zzyh
implements zzyz {
    public final /* synthetic */ zzys zza;
    public final /* synthetic */ int[] zzb;

    public /* synthetic */ zzyh(zzys zzys2, int[] nArray) {
        this.zza = zzys2;
        this.zzb = nArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final List zza(int var1_1, zzde var2_2, int[] var3_3) {
        block15: {
            block14: {
                var4_4 = var2_2;
                var5_5 = this.zza;
                var6_6 = this.zzb;
                var7_7 = var6_6[var1_1];
                var8_8 = var5_5.zzl;
                var9_9 = var5_5.zzm;
                var10_10 = var5_5.zzn;
                var11_11 = -1 >>> 1;
                if (var8_8 == var11_11) break block14;
                if (var9_9 == var11_11) break block15;
                var13_13 = -1 >>> 1;
                for (var12_12 = 0; var12_12 < (var14_14 = var4_4.zzb); var12_12 += var14_14) {
                    block16: {
                        var15_15 = var4_4.zzb(var12_12);
                        var16_16 = var15_15.zzs;
                        if (var16_16 <= 0 || (var17_17 = var15_15.zzt) <= 0) break block16;
                        if (!var10_10) ** GOTO lbl-1000
                        if (var16_16 <= var17_17) {
                            var18_18 = 0;
                            var19_19 = 0.0f;
                        } else {
                            var18_18 = 1;
                            var19_19 = 1.4E-45f;
                        }
                        var11_11 = var8_8 <= var9_9 ? 0 : 1;
                        if (var18_18 != var11_11) {
                            var18_18 = var8_8;
                            var11_11 = var9_9;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var11_11 = var8_8;
                            var18_18 = var9_9;
                        }
                        var20_20 = var16_16 * var18_18;
                        var21_21 = var17_17 * var11_11;
                        if (var20_20 >= var21_21) {
                            var20_20 = zzgd.zza;
                            var21_21 = (var21_21 + var16_16 + -1) / var16_16;
                            var22_22 /* !! */  = new Point(var11_11, var21_21);
                        } else {
                            var21_21 = zzgd.zza;
                            var20_20 = (var20_20 + var17_17 + -1) / var17_17;
                            var23_23 = new Point(var20_20, var18_18);
                            var22_22 /* !! */  = var23_23;
                        }
                        var16_16 = var15_15.zzs;
                        var14_14 = var15_15.zzt;
                        var21_21 = var16_16 * var14_14;
                        var24_24 = var22_22 /* !! */ .x;
                        var18_18 = 1065017672;
                        var19_19 = 0.98f;
                        var20_20 = (int)(var24_24 *= var19_19);
                        if (var16_16 >= var20_20 && var14_14 >= (var16_16 = (int)(var25_25 = (float)var22_22 /* !! */ .y * var19_19)) && var21_21 < var13_13) {
                            var13_13 = var21_21;
                        }
                    }
                    var14_14 = 1;
                    var11_11 = -1 >>> 1;
                }
                var11_11 = var13_13;
                break block15;
            }
            var11_11 = -1 >>> 1;
        }
        var26_26 = new zzgaz();
        var24_24 = 0.0f;
        for (var20_20 = 0; var20_20 < (var8_8 = var4_4.zzb); var20_20 += var8_8) {
            var6_6 = var4_4.zzb(var20_20);
            var8_8 = var6_6.zza();
            var18_18 = -1 >>> 1;
            var19_19 = 0.0f / 0.0f;
            if (var11_11 != var18_18) {
                var17_17 = -1;
                if (var8_8 != var17_17 && var8_8 <= var11_11) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var27_27 = 1;
                        break;
                    }
                } else {
                    var27_27 = 0;
                }
            } else {
                var17_17 = -1;
                ** continue;
            }
            var14_14 = var3_3[var20_20];
            var6_6 = var23_23;
            var9_9 = var1_1;
            var12_12 = var20_20;
            var16_16 = var7_7;
            var17_17 = var27_27;
            var23_23 = new zzzd(var1_1, var2_2, var20_20, var5_5, var14_14, var7_7, (boolean)var27_27);
            var26_26.zzf(var23_23);
            var8_8 = 1;
        }
        return var26_26.zzi();
    }
}

