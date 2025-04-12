/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgdo;
import com.google.android.gms.internal.ads.zzgdq;
import com.google.android.gms.internal.ads.zzgdv;
import java.math.RoundingMode;

public final class zzgdp {
    static {
        Math.log(2.0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static long zza(double var0, RoundingMode var2_1) {
        block16: {
            var3_2 = zzgdq.zza(var0);
            if (var3_2 == 0) break block16;
            var4_3 /* !! */  = zzgdo.zza;
            var5_4 = var2_1.ordinal();
            var3_2 = var4_3 /* !! */ [var5_4];
            var5_4 = 1;
            var6_5 = 0L;
            var8_6 = 0.0;
            var10_7 = 4602678819172646912L;
            var12_8 = 0.5;
            block0 : switch (var3_2) {
                default: {
                    var14_9 = new AssertionError();
                    throw var14_9;
                }
                case 8: {
                    var8_6 = Math.rint(var0);
                    var15_12 = Math.abs(var0 - var8_6);
                    var3_2 = (int)(var15_12 == var12_8 ? 0 : (var15_12 > var12_8 ? 1 : -1));
                    if (var3_2 != 0) break;
                    ** GOTO lbl62
                }
                case 7: {
                    var8_6 = Math.rint(var0);
                    var15_12 = Math.abs(var0 - var8_6);
                    var3_2 = (int)(var15_12 == var12_8 ? 0 : (var15_12 > var12_8 ? 1 : -1));
                    if (var3_2 != 0) break;
                    var8_6 = Math.copySign(var12_8, var0) + var0;
                    break;
                }
                case 6: {
                    var8_6 = Math.rint(var0);
                    break;
                }
                case 5: {
                    var3_2 = (int)zzgdp.zzb(var0);
                    if (var3_2 == 0) {
                        var10_7 = (long)var0;
                        var3_2 = (int)(var0 == var8_6 ? 0 : (var0 > var8_6 ? 1 : -1));
                        var3_2 = var3_2 > 0 ? 1 : -1;
                        var6_5 = var3_2;
                        var8_6 = var10_7 += var6_5;
                        break;
                    }
                    ** GOTO lbl62
                }
                case 3: {
                    var3_2 = (int)(var0 == var8_6 ? 0 : (var0 > var8_6 ? 1 : -1));
                    if (var3_2 > 0 && (var3_2 = (int)zzgdp.zzb(var0)) == 0) {
                        var6_5 = (long)var0;
                        var10_7 = 1L;
                        var12_8 = 4.9E-324;
lbl47:
                        // 2 sources

                        while (true) {
                            var8_6 = var6_5 += var10_7;
                            break block0;
                            break;
                        }
                    }
                    ** GOTO lbl62
                }
                case 2: {
                    var3_2 = (int)(var0 == var8_6 ? 0 : (var0 > var8_6 ? 1 : -1));
                    if (var3_2 < 0 && (var3_2 = (int)zzgdp.zzb(var0)) == 0) {
                        var6_5 = (long)var0;
                        var10_7 = -1;
                        var12_8 = 0.0 / 0.0;
                        ** continue;
                    }
                    ** GOTO lbl62
                }
                case 1: {
                    var3_2 = (int)zzgdp.zzb(var0);
                    zzgdv.zzb((boolean)var3_2);
                }
lbl62:
                // 6 sources

                case 4: {
                    var8_6 = var0;
                }
            }
            var10_7 = -4332462841530417152L;
            var12_8 = -9.223372036854776E18 - var8_6;
            var15_12 = 1.0;
            var3_2 = 0;
            var4_3 /* !! */  = null;
            var17_13 /* !! */  = (double)(var12_8 == var15_12 ? 0 : (var12_8 < var15_12 ? -1 : 1));
            var18_14 = var17_13 /* !! */  < 0 ? 1 : 0;
            var19_15 = 9.223372036854776E18;
            cfr_temp_0 = var8_6 - var19_15;
            var21_16 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
            if (var21_16 /* !! */  >= 0) {
                var5_4 = 0;
                var22_17 = null;
            }
            var3_2 = var18_14 & var5_4;
            if (var3_2 != 0) {
                return (long)var8_6;
            }
            var4_3 /* !! */  = (int[])new ArithmeticException;
            var2_1 = String.valueOf((Object)var2_1);
            var22_17 = new StringBuilder("rounded value is out of range for input ");
            var22_17.append(var0);
            var22_17.append(" and rounding mode ");
            var22_17.append((String)var2_1);
            var14_10 = var22_17.toString();
            var4_3 /* !! */ (var14_10);
            throw var4_3 /* !! */ ;
        }
        var14_11 = new ArithmeticException("input is infinite or NaN");
        throw var14_11;
    }

    public static boolean zzb(double d2) {
        boolean bl2 = zzgdq.zza(d2);
        boolean bl3 = false;
        if (bl2) {
            double d5 = 0.0;
            bl2 = true;
            Object object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
            if (object != false) {
                int n3 = zzgdq.zza(d2);
                String string2 = "not a normal value";
                zzfyg.zzf(n3 != 0, string2);
                n3 = Math.getExponent(d2);
                long l2 = Double.doubleToRawLongBits(d2);
                long l3 = 0xFFFFFFFFFFFFFL;
                l2 &= l3;
                int n4 = -1023;
                if (n3 == n4) {
                    l2 += l2;
                } else {
                    l3 = 0x10000000000000L;
                    l2 |= l3;
                }
                n3 = Long.numberOfTrailingZeros(l2);
                n3 = 52 - n3;
                int n7 = Math.getExponent(d2);
                if (n3 <= n7) {
                    return bl2;
                }
            } else {
                bl3 = true;
            }
        }
        return bl3;
    }
}

