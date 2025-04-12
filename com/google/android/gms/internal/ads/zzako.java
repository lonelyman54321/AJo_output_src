/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzake;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzfu;

final class zzako {
    private static final int[] zza;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[29];
        int[] nArray3 = nArray;
        nArray2[0] = 1769172845;
        nArray3[1] = 1769172786;
        nArray2[2] = 1769172787;
        nArray3[3] = 1769172788;
        nArray2[4] = 1769172789;
        nArray3[5] = 1769172790;
        nArray2[6] = 1769172793;
        nArray3[7] = 1635148593;
        nArray2[8] = 1752589105;
        nArray3[9] = 1751479857;
        nArray2[10] = 1635135537;
        nArray3[11] = 1836069937;
        nArray2[12] = 1836069938;
        nArray3[13] = 862401121;
        nArray2[14] = 862401122;
        nArray3[15] = 862417462;
        nArray2[16] = 0x33677336;
        nArray3[17] = 862414134;
        nArray2[18] = 0x33676736;
        nArray3[19] = 1295275552;
        nArray2[20] = 1295270176;
        nArray3[21] = 1714714144;
        nArray2[22] = 1801741417;
        nArray3[23] = 1295275600;
        nArray2[24] = 1903435808;
        nArray3[25] = 1297305174;
        nArray2[26] = 1684175153;
        nArray3[27] = 1769172332;
        nArray3[28] = 1885955686;
        zza = nArray;
    }

    public static zzaex zza(zzadv zzadv2) {
        return zzako.zzc(zzadv2, true, false);
    }

    public static zzaex zzb(zzadv zzadv2, boolean bl2) {
        return zzako.zzc(zzadv2, false, bl2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static zzaex zzc(zzadv var0, boolean var1_1, boolean var2_2) {
        var3_3 = var0;
        var4_4 = var2_2;
        var5_5 = var0.zzd();
        var7_6 = 4096L;
        var9_7 = -1;
        cfr_temp_0 = var5_5 - var9_7;
        var11_8 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
        if (var11_8 /* !! */  != false && (var12_9 = var5_5 == var7_6 ? 0 : (var5_5 < var7_6 ? -1 : 1)) <= 0) {
            var7_6 = var5_5;
        }
        var13_10 = new zzfu(64);
        var14_11 = (int)var7_6;
        var15_12 = 0;
        var16_13 = 0;
        var17_14 = 0;
        block0: while (var16_13 < var14_11) {
            var18_15 = 8;
            var13_10.zzH(var18_15);
            var19_16 = var13_10.zzM();
            var20_17 = 1;
            var21_18 = var3_3.zzm(var19_16, 0, var18_15, (boolean)var20_17);
            if (var21_18 == 0) break;
            var22_19 = var13_10.zzu();
            var21_18 = var13_10.zzg();
            var24_20 = 1L;
            cfr_temp_1 = var22_19 - var24_20;
            var26_21 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var26_21 /* !! */  == false) {
                var27_22 /* !! */  = var13_10.zzM();
                var3_3.zzh(var27_22 /* !! */ , var18_15, var18_15);
                var28_23 /* !! */  = 16;
                var13_10.zzJ((int)var28_23 /* !! */ );
                var22_19 = var13_10.zzt();
                var26_21 /* !! */  = var14_11;
                var9_7 = var22_19;
            } else {
                var29_24 = 0L;
                cfr_temp_2 = var22_19 - var29_24;
                var28_23 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                if (var28_23 /* !! */  == false && (var28_23 /* !! */  = (cfr_temp_3 = (var29_24 = var0.zzd()) - var9_7) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) != false) {
                    var22_19 = var0.zze();
                    var29_24 -= var22_19;
                    var22_19 = var29_24 + (long)8;
                }
                var26_21 /* !! */  = var14_11;
                var9_7 = var22_19;
                var28_23 /* !! */  = 8;
            }
            var7_6 = var28_23 /* !! */ ;
            var31_25 = var9_7 == var7_6 ? 0 : (var9_7 < var7_6 ? -1 : 1);
            if (var31_25 < 0) {
                var3_3 = new zzajx(var21_18, var9_7, (int)var28_23 /* !! */ );
                return var3_3;
            }
            var16_13 += var28_23 /* !! */ ;
            var28_23 /* !! */  = 1836019574;
            if (var21_18 == var28_23 /* !! */ ) {
                var15_12 = (int)var9_7;
                var14_11 = (int)(var26_21 /* !! */  + var15_12);
                if (var11_8 /* !! */  != false && (var15_12 = (int)((cfr_temp_4 = (var9_7 = (long)var14_11) - var5_5) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1))) > 0) {
                    var14_11 = (int)var5_5;
                }
                var15_12 = 0;
lbl59:
                // 2 sources

                while (true) {
                    var9_7 = -1;
                    continue block0;
                    break;
                }
            }
            var28_23 /* !! */  = 0x6D6F6F66;
            if (var21_18 == var28_23 /* !! */  || var21_18 == (var28_23 /* !! */  = (long)1836475768)) {
                var15_12 = 1;
                break;
            }
            var28_23 /* !! */  = 1835295092;
            if (var21_18 == var28_23 /* !! */ ) {
                var28_23 /* !! */  = 0;
                var27_22 /* !! */  = null;
            } else {
                var28_23 /* !! */  = 1;
            }
            var28_23 /* !! */  = var28_23 /* !! */  ^ var20_17;
            var17_14 |= var28_23 /* !! */ ;
            var28_23 /* !! */  = var21_18;
            var32_26 = (long)var16_13 + var9_7;
            var34_27 = var5_5;
            var20_17 = var26_21 /* !! */ ;
            var5_5 = var26_21 /* !! */ ;
            cfr_temp_5 = (var32_26 -= var7_6) - var5_5;
            var26_21 /* !! */  = cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
            if (var26_21 /* !! */  >= 0) {
                var15_12 = 0;
                break;
            }
            var36_28 = (int)(var9_7 -= var7_6);
            var16_13 += var36_28;
            var37_29 = 1718909296;
            if (var21_18 != var37_29) ** GOTO lbl118
            var15_12 = 8;
            if (var36_28 < var15_12) {
                var38_33 = var36_28;
                var40_34 = new zzajx(var37_29, var38_33, var15_12);
                return var40_34;
            }
            var13_10.zzH(var36_28);
            var41_30 = var13_10.zzM();
            var15_12 = 0;
            var3_3.zzh(var41_30, 0, var36_28);
            var36_28 = var13_10.zzg();
            var37_29 = zzako.zzd(var36_28, var4_4) | var17_14;
            var14_11 = 4;
            var13_10.zzL(var14_11);
            var42_31 = var13_10.zzb() / var14_11;
            if (var37_29 == 0 && var42_31 > 0) {
                var27_22 /* !! */  = (byte[])new int[var42_31];
                for (var14_11 = 0; var14_11 < var42_31; ++var14_11) {
                    var27_22 /* !! */ [var14_11] = var43_32 = var13_10.zzg();
                    if ((var43_32 = (int)zzako.zzd(var43_32, var4_4)) == 0) continue;
                    var37_29 = 1;
                    break;
                }
            } else {
                var28_23 /* !! */  = 0;
                var27_22 /* !! */  = null;
            }
            if (var37_29 != 0) {
                var17_14 = var37_29;
            } else {
                var3_3 = new zzakt(var36_28, var27_22 /* !! */ );
                return var3_3;
lbl118:
                // 1 sources

                var15_12 = 0;
                if (var36_28 != 0) {
                    var3_3.zzg(var36_28);
                }
            }
            var14_11 = var20_17;
            var5_5 = var34_27;
            ** continue;
        }
        if (var17_14 == 0) {
            return zzakk.zza;
        }
        if (var1_1 != var15_12) {
            var3_3 = var15_12 != 0 ? zzake.zza : zzake.zzb;
            return var3_3;
        }
        return null;
    }

    private static boolean zzd(int n3, boolean bl2) {
        int n4;
        int n7 = n3 >>> 8;
        int n8 = 3368816;
        boolean bl3 = true;
        if (n7 == n8) {
            return bl3;
        }
        n7 = 1751476579;
        if (n3 == n7) {
            if (!bl2) {
                n3 = 1751476579;
            } else {
                return bl3;
            }
        }
        int[] nArray = zza;
        n7 = 0;
        for (n8 = 0; n8 < (n4 = 29); ++n8) {
            n4 = nArray[n8];
            if (n4 != n3) continue;
            return bl3;
        }
        return false;
    }
}

