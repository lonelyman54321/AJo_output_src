/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgo;
import com.google.android.gms.internal.ads.zzgp;
import com.google.android.gms.internal.ads.zzgq;
import com.google.android.gms.internal.ads.zzgs;
import com.google.android.gms.internal.ads.zzt;
import java.util.Arrays;

public final class zzgr {
    public static final byte[] zza;
    public static final float[] zzb;
    private static final Object zzc;
    private static int[] zzd;

    static {
        Object object;
        byte[] byArray = object = new byte[4];
        byte[] byArray2 = object;
        byArray[0] = 0;
        byArray2[1] = 0;
        byArray[2] = 0;
        byArray2[3] = 1;
        zza = object;
        Object[] objectArray = object = (Object)new float[17];
        Object[] objectArray2 = object;
        objectArray[0] = (byte)1.0f;
        objectArray2[1] = (byte)1.0f;
        objectArray[2] = (byte)1.0909091f;
        objectArray2[3] = (byte)0.90909094f;
        objectArray[4] = (byte)1.4545455f;
        objectArray2[5] = (byte)1.2121212f;
        objectArray[6] = (byte)2.1818182f;
        objectArray2[7] = (byte)1.8181819f;
        objectArray[8] = (byte)2.909091f;
        objectArray2[9] = (byte)2.4242425f;
        objectArray[10] = (byte)1.6363636f;
        objectArray2[11] = (byte)1.3636364f;
        objectArray[12] = (byte)1.939394f;
        objectArray2[13] = (byte)1.6161616f;
        objectArray[14] = (byte)1.3333334f;
        objectArray2[15] = (byte)1.5f;
        objectArray2[16] = (byte)2.0f;
        zzb = object;
        object = new Object;
        object();
        zzc = object;
        zzd = new int[10];
    }

    /*
     * Unable to fully structure code
     */
    public static int zza(byte[] var0, int var1_1, int var2_2, boolean[] var3_3) {
        block20: {
            block19: {
                block21: {
                    var4_4 = var2_2 - var1_1;
                    var5_5 = false;
                    var6_6 = 1;
                    var7_7 = var4_4 >= 0 ? 1 : 0;
                    zzeq.zzf((boolean)var7_7);
                    if (var4_4 == 0) {
                        return var2_2;
                    }
                    var7_7 = var3_3[0];
                    if (var7_7 != 0) {
                        zzgr.zzf(var3_3);
                        return var1_1 + -3;
                    }
                    if (var4_4 > var6_6 && (var7_7 = var3_3[var6_6]) != 0 && (var7_7 = var0[var1_1]) == var6_6) {
                        zzgr.zzf(var3_3);
                        return var1_1 + -2;
                    }
                    var7_7 = 2;
                    if (var4_4 > var7_7 && (var8_8 = var3_3[var7_7]) != 0 && (var8_8 = var0[var1_1]) == 0) {
                        var8_8 = var1_1 + 1;
                        if ((var8_8 = var0[var8_8]) == var6_6) {
                            zzgr.zzf(var3_3);
                            return var1_1 + -1;
                        }
                    }
                    var8_8 = var2_2 + -1;
                    var1_1 += var7_7;
                    while (var1_1 < var8_8) {
                        var9_9 = var0[var1_1];
                        var10_10 = var9_9 & 254;
                        if (var10_10 == 0) {
                            var10_10 = var1_1 + -2;
                            var11_11 = var0[var10_10];
                            if (var11_11 == 0) {
                                var1_1 += -1;
                                if ((var1_1 = var0[var1_1]) == 0 && var9_9 == var6_6) {
                                    zzgr.zzf(var3_3);
                                    return var10_10;
                                }
                            }
                            var1_1 = var10_10;
                        }
                        var1_1 += 3;
                    }
                    if (var4_4 > var7_7) {
                        var1_1 = var2_2 + -3;
                        if ((var1_1 = var0[var1_1]) == 0) {
                            var1_1 = var2_2 + -2;
                            if ((var1_1 = var0[var1_1]) == 0 && (var1_1 = var0[var8_8]) == var6_6) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var1_1 = 1;
                                    break block19;
                                    break;
                                }
                            }
                        }
lbl45:
                        // 7 sources

                        while (true) {
                            var1_1 = 0;
                            break block19;
                            break;
                        }
                    }
                    if (var4_4 != var7_7) break block21;
                    var1_1 = var3_3[var7_7];
                    if (var1_1 == 0) ** GOTO lbl45
                    var1_1 = var2_2 + -2;
                    if ((var1_1 = var0[var1_1]) != 0 || (var1_1 = var0[var8_8]) != var6_6) ** GOTO lbl45
                    ** GOTO lbl-1000
                }
                var1_1 = var3_3[var6_6];
                if (var1_1 != 0 && (var1_1 = var0[var8_8]) == var6_6) ** break;
                ** while (true)
                ** while (true)
            }
            var3_3[0] = var1_1;
            if (var4_4 > var6_6) {
                var1_1 = var2_2 + -2;
                if ((var1_1 = var0[var1_1]) == 0 && (var1_1 = var0[var8_8]) == 0) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 = 1;
                        break block20;
                        break;
                    }
                }
lbl67:
                // 3 sources

                while (true) {
                    var1_1 = 0;
                    break block20;
                    break;
                }
            }
            ** while ((var1_1 = var3_3[var7_7]) == 0 || (var1_1 = var0[var8_8]) != 0)
lbl71:
            // 1 sources

            ** while (true)
        }
        var3_3[var6_6] = var1_1;
        var12_12 = var0[var8_8];
        if (var12_12 == 0) {
            var5_5 = true;
        }
        var3_3[var7_7] = var5_5;
        return var2_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int zzb(byte[] byArray, int n3) {
        Object object = zzc;
        synchronized (object) {
            int n4 = 0;
            int n7 = 0;
            int n8 = 0;
            while (true) {
                int n10;
                int[] nArray;
                block12: {
                    int n14;
                    int n15;
                    if (n7 >= n3) {
                        n3 -= n8;
                        n15 = 0;
                        nArray = null;
                        n10 = 0;
                        for (n7 = 0; n7 < n8; n10 += 2, n15 += (n14 += 3), ++n7) {
                            int[] nArray2 = zzd;
                            n14 = nArray2[n7] - n15;
                            System.arraycopy(byArray, n15, byArray, n10, n14);
                            int n16 = (n10 += n14) + 1;
                            byArray[n10] = 0;
                            byArray[n16] = 0;
                            continue;
                        }
                        n4 = n3 - n10;
                        try {
                            System.arraycopy(byArray, n15, byArray, n10, n4);
                            return n3;
                        }
                        catch (Throwable throwable) {}
                        throw throwable;
                    }
                    while (n7 < (n15 = n3 + -2)) {
                        n15 = byArray[n7];
                        n10 = n7 + 1;
                        if (n15 == 0 && (n15 = byArray[n10]) == 0) {
                            n15 = n7 + 2;
                            n14 = 3;
                            if ((n15 = byArray[n15]) == n14) break block12;
                        }
                        n7 = n10;
                    }
                    n7 = n3;
                }
                if (n7 >= n3) continue;
                nArray = zzd;
                n10 = nArray.length;
                if (n10 <= n8) {
                    n10 += n10;
                    zzd = nArray = Arrays.copyOf(nArray, n10);
                }
                nArray = zzd;
                n10 = n8 + 1;
                nArray[n8] = n7;
                n7 += 3;
                n8 = n10;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzgo zzc(byte[] var0, int var1_1, int var2_2) {
        block54: {
            block53: {
                block52: {
                    var4_4 /* !! */  = var0;
                    var5_5 = var1_1;
                    var6_6 = var2_2;
                    var3_3 = new zzgs(var0, var1_1, var2_2);
                    var7_7 = 4;
                    var3_3.zze(var7_7);
                    var5_5 = 3;
                    var8_8 = 4.2E-45f;
                    var6_6 = var3_3.zza(var5_5);
                    var3_3.zzd();
                    var9_9 = 2;
                    var10_10 = 2.8E-45f;
                    var11_11 = var3_3.zza(var9_9);
                    var12_12 = var3_3.zzf();
                    var13_13 = 5;
                    var14_14 = var3_3.zza(var13_13);
                    var15_15 = 0;
                    var16_16 = null;
                    var17_17 = 0;
                    var18_18 /* !! */  = null;
                    while (true) {
                        var19_19 = 32;
                        var20_20 = 1;
                        if (var17_17 >= var19_19) break;
                        var19_19 = (int)var3_3.zzf();
                        if (var19_19 != 0) {
                            var19_19 = var20_20 << var17_17;
                            var15_15 |= var19_19;
                        }
                        ++var17_17;
                    }
                    var17_17 = 6;
                    var21_21 = new int[var17_17];
                    var19_19 = 0;
                    while (true) {
                        var22_22 = 8;
                        if (var19_19 >= var17_17) break;
                        var21_21[var19_19] = var22_22 = var3_3.zza(var22_22);
                        ++var19_19;
                    }
                    var23_23 = var3_3.zza(var22_22);
                    var13_13 = 0;
                    for (var19_19 = 0; var19_19 < var6_6; ++var19_19) {
                        var24_24 = var3_3.zzf();
                        if (var24_24 != 0) {
                            var13_13 += 89;
                        }
                        if ((var24_24 = var3_3.zzf()) == 0) continue;
                        var13_13 += 8;
                    }
                    var3_3.zze(var13_13);
                    if (var6_6 > 0) {
                        var13_13 = 8 - var6_6;
                        var13_13 += var13_13;
                        var3_3.zze(var13_13);
                    }
                    var24_24 = var3_3.zzc();
                    var13_13 = var3_3.zzc();
                    if (var13_13 == var5_5) {
                        var3_3.zzd();
                        var13_13 = 3;
                    }
                    var19_19 = var3_3.zzc();
                    var25_25 = var3_3.zzc();
                    var26_26 = var3_3.zzf();
                    if (var26_26 == 0) break block52;
                    var26_26 = var3_3.zzc();
                    var27_27 = var3_3.zzc();
                    var28_28 = var3_3.zzc();
                    var29_29 = var3_3.zzc();
                    if (var13_13 == var20_20) ** GOTO lbl70
                    if (var13_13 == var9_9) {
                        var13_13 = 2;
lbl70:
                        // 2 sources

                        var30_30 = 2;
                    } else {
                        var30_30 = 1;
                    }
                    var31_31 = var13_13 == var20_20 ? 2 : 1;
                    var26_26 = (var26_26 + var27_27) * var30_30;
                    var19_19 -= var26_26;
                    var28_28 = (var28_28 + var29_29) * var31_31;
                    var25_25 -= var28_28;
                }
                var32_32 = var19_19;
                var19_19 = var13_13;
                var13_13 = var25_25;
                var25_25 = var32_32;
                var26_26 = var3_3.zzc();
                var27_27 = var3_3.zzc();
                var28_28 = var3_3.zzc();
                var33_33 = var3_3.zzf();
                if (var20_20 != var33_33) {
                    var33_33 = var6_6;
                } else {
                    var33_33 = 0;
                    var34_34 /* !! */  = null;
                }
                while (var33_33 <= var6_6) {
                    var3_3.zzc();
                    var3_3.zzc();
                    var3_3.zzc();
                    ++var33_33;
                }
                var3_3.zzc();
                var3_3.zzc();
                var3_3.zzc();
                var3_3.zzc();
                var3_3.zzc();
                var3_3.zzc();
                var6_6 = (int)var3_3.zzf();
                if (var6_6 != 0 && (var6_6 = (int)var3_3.zzf()) != 0) {
                    var35_35 = 0.0f;
                    for (var6_6 = 0; var6_6 < var7_7; ++var6_6) {
                        var34_34 /* !! */  = null;
                        for (var33_33 = 0; var33_33 < var17_17; var33_33 += var7_7) {
                            var29_29 = (int)var3_3.zzf();
                            if (var29_29 == 0) {
                                var3_3.zzc();
                            } else {
                                var29_29 = var6_6 + var6_6 + 4;
                                var7_7 = var20_20 << var29_29;
                                var17_17 = 64;
                                var7_7 = Math.min(var17_17, var7_7);
                                if (var6_6 > var20_20) {
                                    var3_3.zzb();
                                }
                                var18_18 /* !! */  = null;
                                for (var17_17 = 0; var17_17 < var7_7; ++var17_17) {
                                    var3_3.zzb();
                                }
                            }
                            var7_7 = var6_6 == var5_5 ? 3 : 1;
                            var7_7 = 4;
                            var17_17 = 6;
                        }
                        var7_7 = 4;
                        var17_17 = 6;
                    }
                }
                var3_3.zze(var9_9);
                var7_7 = (int)var3_3.zzf();
                if (var7_7 != 0) {
                    var3_3.zze(var22_22);
                    var3_3.zzc();
                    var3_3.zzc();
                    var3_3.zzd();
                }
                var7_7 = var3_3.zzc();
                var35_35 = 0.0f;
                var34_34 /* !! */  = new int[]{};
                var18_18 /* !! */  = new int[]{};
                var29_29 = -1;
                var5_5 = -1;
                var8_8 = 0.0f / 0.0f;
                var22_22 = -1;
                for (var6_6 = 0; var6_6 < var7_7; ++var6_6) {
                    if (var6_6 != 0 && (var31_31 = (int)var3_3.zzf()) != 0) {
                        var9_9 = var5_5 + var22_22;
                        var36_36 = (int)var3_3.zzf();
                        var37_37 = var3_3.zzc() + 1;
                        var36_36 += var36_36;
                        var36_36 = 1 - var36_36;
                        var20_20 = var9_9 + 1;
                        var38_38 = var7_7;
                        var4_4 /* !! */  = (byte[])new boolean[var20_20];
                        var39_39 = var21_21;
                        var21_21 = null;
                        for (var40_40 = 0; var40_40 <= var9_9; ++var40_40) {
                            var41_41 = var3_3.zzf();
                            var4_4 /* !! */ [var40_40] = var41_41 == 0 ? (var41_41 = (int)var3_3.zzf()) : (var42_42 = 1);
                        }
                        var41_41 = var40_40 = var22_22 + -1;
                        var21_21 = new int[var20_20];
                        var43_43 = new int[var20_20];
                        var44_44 = 0;
                        while (true) {
                            var45_45 = var36_36 * var37_37;
                            if (var41_41 < 0) break;
                            var46_46 = var18_18 /* !! */ [var41_41] + var45_45;
                            if (var46_46 < 0) {
                                var45_45 = var5_5 + var41_41;
                                if ((var45_45 = var4_4 /* !! */ [var45_45]) != 0) {
                                    var45_45 = var44_44 + 1;
                                    var21_21[var44_44] = var46_46;
                                    var44_44 = var45_45;
                                }
                            }
                            var41_41 += -1;
                        }
                        if (var45_45 < 0 && (var36_36 = var4_4 /* !! */ [var9_9]) != 0) {
                            var36_36 = var44_44 + 1;
                            var21_21[var44_44] = var45_45;
                            var44_44 = var36_36;
                        }
                        var37_37 = var15_15;
                        var36_36 = var19_19;
                        var19_19 = var44_44;
                        var16_16 = null;
                        for (var15_15 = 0; var15_15 < var5_5; ++var15_15) {
                            var41_41 = var34_34 /* !! */ [var15_15] + var45_45;
                            if (var41_41 >= 0 || (var44_44 = var4_4 /* !! */ [var15_15]) == 0) continue;
                            var44_44 = var19_19 + 1;
                            var21_21[var19_19] = var41_41;
                            var19_19 = var44_44;
                        }
                        var16_16 = Arrays.copyOf(var21_21, var19_19);
                        var41_41 = 0;
                        for (var40_40 = var5_5 + -1; var40_40 >= 0; var40_40 += -1) {
                            var44_44 = var34_34 /* !! */ [var40_40] + var45_45;
                            if (var44_44 <= 0 || (var46_46 = var4_4 /* !! */ [var40_40]) == 0) continue;
                            var46_46 = var41_41 + 1;
                            var43_43[var41_41] = var44_44;
                            var41_41 = var46_46;
                        }
                        if (var45_45 > 0 && (var9_9 = var4_4 /* !! */ [var9_9]) != 0) {
                            var9_9 = var41_41 + 1;
                            var43_43[var41_41] = var45_45;
                            var41_41 = var9_9;
                        }
                        var9_9 = var41_41;
                        var34_34 /* !! */  = null;
                        for (var33_33 = 0; var33_33 < var22_22; ++var33_33) {
                            var40_40 = var18_18 /* !! */ [var33_33] + var45_45;
                            if (var40_40 <= 0) continue;
                            var41_41 = var5_5 + var33_33;
                            if ((var41_41 = var4_4 /* !! */ [var41_41]) == 0) continue;
                            var41_41 = var9_9 + 1;
                            var43_43[var9_9] = var40_40;
                            var9_9 = var41_41;
                        }
                        var4_4 /* !! */  = (byte[])Arrays.copyOf(var43_43, var9_9);
                        var18_18 /* !! */  = var4_4 /* !! */ ;
                        var22_22 = var9_9;
                        var34_34 /* !! */  = var16_16;
                        var5_5 = var19_19;
                    } else {
                        var38_38 = var7_7;
                        var37_37 = var15_15;
                        var36_36 = var19_19;
                        var39_39 = var21_21;
                        var7_7 = var3_3.zzc();
                        var5_5 = var3_3.zzc();
                        var47_47 = new int[var7_7];
                        var34_34 /* !! */  = null;
                        for (var33_33 = 0; var33_33 < var7_7; ++var33_33) {
                            if (var33_33 > 0) {
                                var15_15 = var33_33 + -1;
                                var15_15 = var47_47[var15_15];
                            } else {
                                var15_15 = 0;
                                var16_16 = null;
                            }
                            var17_17 = var3_3.zzc();
                            var19_19 = 1;
                            var47_47[var33_33] = var15_15 -= (var17_17 += var19_19);
                            var3_3.zzd();
                        }
                        var34_34 /* !! */  = new int[var5_5];
                        var16_16 = null;
                        for (var15_15 = 0; var15_15 < var5_5; ++var15_15) {
                            if (var15_15 > 0) {
                                var17_17 = var15_15 + -1;
                                var17_17 = var34_34 /* !! */ [var17_17];
                            } else {
                                var17_17 = 0;
                                var18_18 /* !! */  = null;
                            }
                            var19_19 = var3_3.zzc();
                            var20_20 = 1;
                            var34_34 /* !! */ [var15_15] = var19_19 = var19_19 + var20_20 + var17_17;
                            var3_3.zzd();
                        }
                        var22_22 = var5_5;
                        var18_18 /* !! */  = var34_34 /* !! */ ;
                        var5_5 = var7_7;
                        var34_34 /* !! */  = var47_47;
                    }
                    var19_19 = var36_36;
                    var15_15 = var37_37;
                    var7_7 = var38_38;
                    var21_21 = var39_39;
                    var9_9 = 2;
                    var10_10 = 2.8E-45f;
                    var20_20 = 1;
                }
                var37_37 = var15_15;
                var36_36 = var19_19;
                var39_39 = var21_21;
                var7_7 = (int)var3_3.zzf();
                if (var7_7 != 0) {
                    var7_7 = var3_3.zzc();
                    var34_34 /* !! */  = null;
                    for (var33_33 = 0; var33_33 < var7_7; ++var33_33) {
                        var5_5 = 5;
                        var8_8 = 7.0E-45f;
                        var6_6 = var28_28 + 5;
                        var3_3.zze(var6_6);
                    }
                }
                var7_7 = 2;
                var3_3.zze(var7_7);
                var5_5 = (int)var3_3.zzf();
                var6_6 = 1065353216;
                var35_35 = 1.0f;
                if (var5_5 == 0) break block53;
                var5_5 = (int)var3_3.zzf();
                if (var5_5 != 0) {
                    var9_9 = var3_3.zza(8);
                    var5_5 = 255;
                    var8_8 = 3.57E-43f;
                    if (var9_9 == var5_5) {
                        var5_5 = 16;
                        var8_8 = 2.2E-44f;
                        var9_9 = var3_3.zza(var5_5);
                        var5_5 = var3_3.zza(var5_5);
                        if (var9_9 != 0 && var5_5 != 0) {
                            var35_35 = var9_9;
                            var8_8 = var5_5;
                            var35_35 /= var8_8;
                        }
                    } else {
                        var5_5 = 17;
                        var8_8 = 2.4E-44f;
                        if (var9_9 < var5_5) {
                            var48_48 = zzgr.zzb;
                            var35_35 = (float)var48_48[var9_9];
                        } else {
                            var48_48 = "Unexpected aspect_ratio_idc value: ";
                            var34_34 /* !! */  = (int[])"NalUnitUtil";
                            w12_0.a(var9_9, (String)var48_48, (String)var34_34 /* !! */ );
                        }
                    }
                }
                if ((var5_5 = (int)var3_3.zzf()) != 0) {
                    var3_3.zzd();
                }
                if ((var5_5 = (int)var3_3.zzf()) == 0) ** GOTO lbl348
                var8_8 = 4.2E-45f;
                var3_3.zze(3);
                var5_5 = (int)var3_3.zzf();
                var9_9 = 1;
                var10_10 = 1.4E-45f;
                if (var9_9 != var5_5) {
                    var9_9 = 2;
                    var10_10 = 2.8E-45f;
                }
                if ((var7_7 = (int)var3_3.zzf()) != 0) {
                    var7_7 = 8;
                    var5_5 = var3_3.zza(var7_7);
                    var33_33 = var3_3.zza(var7_7);
                    var3_3.zze(var7_7);
                    var29_29 = zzt.zza(var5_5);
                    var5_5 = zzt.zzb(var33_33);
                    var7_7 = var29_29;
                    var29_29 = var9_9;
                } else {
                    var29_29 = var9_9;
lbl348:
                    // 2 sources

                    var7_7 = -1;
                    var5_5 = -1;
                    var8_8 = 0.0f / 0.0f;
                }
                var9_9 = (int)var3_3.zzf();
                if (var9_9 != 0) {
                    var3_3.zzc();
                    var3_3.zzc();
                }
                var3_3.zzd();
                var49_49 = (int)var3_3.zzf();
                if (var49_49 != 0) {
                    var13_13 += var13_13;
                }
                var28_28 = var5_5;
                var49_49 = var13_13;
                break block54;
            }
            var49_49 = var13_13;
            var7_7 = -1;
            var28_28 = -1;
        }
        var33_33 = var37_37;
        var15_15 = var36_36;
        var17_17 = var26_26;
        var19_19 = var27_27;
        var43_43 = var39_39;
        var40_40 = var23_23;
        var22_22 = var24_24;
        var23_23 = var25_25;
        var24_24 = var49_49;
        var26_26 = var7_7;
        var27_27 = var29_29;
        var48_48 = new zzgo(var11_11, var12_12, var14_14, var37_37, var36_36, var17_17, var19_19, var39_39, var40_40, var22_22, var25_25, var49_49, var35_35, var7_7, var29_29, var28_28);
        return var48_48;
    }

    public static zzgp zzd(byte[] byArray, int n3, int n4) {
        zzgs zzgs2 = new zzgs(byArray, 4, n4);
        int n7 = zzgs2.zzc();
        n4 = zzgs2.zzc();
        zzgs2.zzd();
        n3 = (int)(zzgs2.zzf() ? 1 : 0);
        zzgp zzgp2 = new zzgp(n7, n4, n3 != 0);
        return zzgp2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzgq zze(byte[] var0, int var1_1, int var2_2) {
        block34: {
            block33: {
                var4_4 = var1_1;
                var5_5 = var2_2;
                var3_3 = new zzgs(var0, var1_1, var2_2);
                var6_6 = 8;
                var4_4 = var3_3.zza(var6_6);
                var7_7 = var3_3.zza(var6_6);
                var8_8 = var3_3.zza(var6_6);
                var9_9 = var3_3.zzc();
                var5_5 = 100;
                var10_10 = 1.4E-43f;
                var11_11 = 3;
                var12_12 = 1;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 110;
                var10_10 = 1.54E-43f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 122;
                var10_10 = 1.71E-43f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 244;
                var10_10 = 3.42E-43f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 44;
                var10_10 = 6.2E-44f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 83;
                var10_10 = 1.16E-43f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 86;
                var10_10 = 1.2E-43f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 118;
                var10_10 = 1.65E-43f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 128;
                var10_10 = 1.8E-43f;
                if (var4_4 == var5_5) ** GOTO lbl48
                var5_5 = 138;
                var10_10 = 1.93E-43f;
                if (var4_4 != var5_5) {
                    var5_5 = 1;
                    var10_10 = 1.4E-45f;
                    var13_13 = 0;
                    var14_14 = 0;
                    var15_15 = false;
                } else {
                    var4_4 = 138;
lbl48:
                    // 10 sources

                    if ((var5_5 = var3_3.zzc()) == var11_11) {
                        var16_16 = var3_3.zzf();
                        var13_13 = 3;
                    } else {
                        var13_13 = var5_5;
                        var16_16 = 0;
                        var17_17 = 0.0f;
                    }
                    var14_14 = var3_3.zzc();
                    var15_15 = var3_3.zzc();
                    var3_3.zzd();
                    var18_18 = var3_3.zzf();
                    if (var18_18 != 0) {
                        var13_13 = var13_13 != var11_11 ? 8 : 12;
                        for (var18_18 = 0; var18_18 < var13_13; ++var18_18) {
                            var19_19 = (int)var3_3.zzf();
                            if (var19_19 != 0) {
                                var20_20 = 6;
                                var20_20 = var18_18 < var20_20 ? 16 : 64;
                                var19_19 = 8;
                                var21_21 = 8;
                                for (var6_6 = 0; var6_6 < var20_20; ++var6_6) {
                                    if (var19_19 != 0) {
                                        var19_19 = var11_11 = (var3_3.zzb() + var21_21 + 256) % 256;
                                    }
                                    if (var19_19 != 0) {
                                        var21_21 = var19_19;
                                    }
                                    var11_11 = 3;
                                }
                            }
                            var6_6 = 8;
                            var11_11 = 3;
                        }
                    }
                    var13_13 = var14_14;
                    var14_14 = var15_15;
                    var15_15 = (boolean)var16_16;
                }
                var19_19 = var3_3.zzc() + 4;
                var6_6 = var3_3.zzc();
                if (var6_6 == 0) {
                    var11_11 = var3_3.zzc() + 4;
                    var18_18 = var7_7;
                    var22_22 = var11_11;
lbl87:
                    // 2 sources

                    while (true) {
                        var23_23 = 0;
                        break;
                    }
                } else if (var6_6 == var12_12) {
                    var6_6 = (int)var3_3.zzf();
                    var3_3.zzb();
                    var3_3.zzb();
                    var11_11 = var3_3.zzc();
                    var24_24 = var11_11;
                    var18_18 = var7_7;
                    var16_16 = 0;
                    var17_17 = 0.0f;
                    while ((var22_22 = (int)((cfr_temp_0 = (var26_25 = (long)var16_16) - var24_24) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) < 0) {
                        var3_3.zzc();
                        ++var16_16;
                    }
                    var23_23 = var6_6;
                    var6_6 = 1;
                    var22_22 = 0;
                } else {
                    var18_18 = var7_7;
                    var22_22 = 0;
                    ** continue;
                }
                var11_11 = var3_3.zzc();
                var3_3.zzd();
                var28_26 = var3_3.zzc() + var12_12;
                var7_7 = var3_3.zzc() + var12_12;
                var29_27 = var3_3.zzf();
                var20_20 = 2 - var29_27;
                if (var29_27 == 0) {
                    var3_3.zzd();
                }
                var7_7 *= var20_20;
                var3_3.zzd();
                var17_17 = 2.2E-44f;
                var28_26 *= 16;
                var7_7 *= 16;
                var16_16 = (int)var3_3.zzf();
                var30_28 = 2;
                if (var16_16 != 0) {
                    var16_16 = var3_3.zzc();
                    var31_29 = var3_3.zzc();
                    var32_30 = var3_3.zzc();
                    var33_31 = var3_3.zzc();
                    if (var5_5 != 0) {
                        var12_12 = 3;
                        if (var5_5 == var12_12) {
                            var12_12 = 1;
                            var34_32 = 1;
                        } else {
                            var12_12 = 1;
                            var34_32 = 2;
                        }
                        var12_12 = var5_5 == var12_12 ? 2 : 1;
                        var20_20 *= var12_12;
                        var12_12 = var34_32;
                    }
                    var16_16 = (var16_16 + var31_29) * var12_12;
                    var28_26 -= var16_16;
                    var32_30 = (var32_30 + var33_31) * var20_20;
                    var7_7 -= var32_30;
                }
                var20_20 = var28_26;
                var12_12 = var7_7;
                var5_5 = (int)var3_3.zzf();
                var7_7 = -1;
                if (var5_5 == 0) ** GOTO lbl216
                var5_5 = (int)var3_3.zzf();
                if (var5_5 == 0) ** GOTO lbl-1000
                var16_16 = var3_3.zza(8);
                var5_5 = 255;
                var10_10 = 3.57E-43f;
                if (var16_16 == var5_5) {
                    var5_5 = 16;
                    var10_10 = 2.2E-44f;
                    var16_16 = var3_3.zza(var5_5);
                    var5_5 = var3_3.zza(var5_5);
                    ** if (var16_16 == 0 || var5_5 == 0) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        var35_33 = (float)var16_16;
                        var10_10 = (float)var5_5;
                        var35_33 /= var10_10;
                        ** GOTO lbl183
                    }
                }
                ** GOTO lbl173
lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var28_26 = 1065353216;
                        var35_33 = 1.0f;
                        break block33;
                        break;
                    }
lbl173:
                    // 1 sources

                    var5_5 = 17;
                    var10_10 = 2.4E-44f;
                    if (var16_16 < var5_5) {
                        var36_34 = zzgr.zzb;
                        var35_33 = (float)var36_34[var16_16];
                    } else {
                        var36_34 = "Unexpected aspect_ratio_idc value: ";
                        var37_35 = "NalUnitUtil";
                        w12_0.a(var16_16, (String)var36_34, var37_35);
                        ** continue;
                    }
                }
            }
            var5_5 = (int)var3_3.zzf();
            if (var5_5 != 0) {
                var3_3.zzd();
            }
            if ((var5_5 = (int)var3_3.zzf()) == 0) ** GOTO lbl211
            var10_10 = 4.2E-45f;
            var3_3.zze(3);
            var5_5 = (int)var3_3.zzf();
            var16_16 = 1;
            var17_17 = 1.4E-45f;
            if (var16_16 == var5_5) {
                var30_28 = 1;
            }
            var5_5 = (int)var3_3.zzf();
            if (var5_5 != 0) {
                var5_5 = 8;
                var10_10 = 1.1E-44f;
                var7_7 = var3_3.zza(var5_5);
                var16_16 = var3_3.zza(var5_5);
                var3_3.zze(var5_5);
                var38_36 = zzt.zza(var7_7);
                var31_29 = var5_5 = zzt.zzb(var16_16);
                var17_17 = var35_33;
            } else {
                var17_17 = var35_33;
                var38_36 = -1;
lbl208:
                // 2 sources

                while (true) {
                    var31_29 = -1;
                    break block34;
                    break;
                }
lbl211:
                // 1 sources

                var17_17 = var35_33;
                var38_36 = -1;
lbl213:
                // 2 sources

                while (true) {
                    var30_28 = -1;
                    ** continue;
                    break;
                }
lbl216:
                // 1 sources

                var38_36 = -1;
                var16_16 = 1065353216;
                var17_17 = 1.0f;
                ** continue;
            }
        }
        var36_34 = var39_37;
        var28_26 = var4_4;
        var7_7 = var18_18;
        var18_18 = var29_27;
        var21_21 = var6_6;
        var29_27 = var38_36;
        var39_37 = new zzgq(var4_4, var7_7, var8_8, var9_9, var11_11, var20_20, var12_12, var17_17, var13_13, var14_14, var15_15, (boolean)var18_18, var19_19, var6_6, var22_22, (boolean)var23_23, var38_36, var30_28, var31_29);
        return var39_37;
    }

    public static void zzf(boolean[] blArray) {
        blArray[0] = false;
        blArray[1] = false;
        blArray[2] = false;
    }
}

