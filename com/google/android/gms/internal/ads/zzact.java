/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import java.nio.ByteBuffer;

public final class zzact {
    public static final /* synthetic */ int zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;
    private static final int[] zze;
    private static final int[] zzf;
    private static final int[] zzg;

    static {
        int[] nArray;
        int[] nArray2;
        zzb = new int[]{1, 2, 3, 6};
        zzc = new int[]{48000, 44100, 32000};
        zzd = new int[]{24000, 22050, 16000};
        int[] nArray3 = nArray2 = new int[8];
        int[] nArray4 = nArray2;
        nArray3[0] = 2;
        nArray4[1] = 1;
        nArray3[2] = 2;
        nArray4[3] = 3;
        nArray3[4] = 3;
        nArray4[5] = 4;
        nArray3[6] = 4;
        nArray4[7] = 5;
        zze = nArray2;
        int n3 = 19;
        int[] nArray5 = nArray = new int[n3];
        int[] nArray6 = nArray;
        nArray5[0] = 32;
        nArray6[1] = 40;
        nArray5[2] = 48;
        nArray6[3] = 56;
        nArray5[4] = 64;
        nArray6[5] = 80;
        nArray5[6] = 96;
        nArray6[7] = 112;
        nArray5[8] = 128;
        nArray6[9] = 160;
        nArray5[10] = 192;
        nArray6[11] = 224;
        nArray5[12] = 256;
        nArray6[13] = 320;
        nArray5[14] = 384;
        nArray6[15] = 448;
        nArray5[16] = 512;
        nArray6[17] = 576;
        nArray6[18] = 640;
        zzf = nArray;
        int[] nArray7 = nArray2 = new int[n3];
        int[] nArray8 = nArray2;
        nArray7[0] = 69;
        nArray8[1] = 87;
        nArray7[2] = 104;
        nArray8[3] = 121;
        nArray7[4] = 139;
        nArray8[5] = 174;
        nArray7[6] = 208;
        nArray8[7] = 243;
        nArray7[8] = 278;
        nArray8[9] = 348;
        nArray7[10] = 417;
        nArray8[11] = 487;
        nArray7[12] = 557;
        nArray8[13] = 696;
        nArray7[14] = 835;
        nArray8[15] = 975;
        nArray7[16] = 1114;
        nArray8[17] = 1253;
        nArray8[18] = 1393;
        zzg = nArray2;
    }

    public static int zza(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.position() + 5;
        n3 = byteBuffer.get(n3) & 0xF8;
        int n4 = 3;
        int n7 = 10;
        if ((n3 >>= n4) > n7) {
            n3 = byteBuffer.position() + 4;
            if ((n3 = (byteBuffer.get(n3) & 0xC0) >> 6) != n4) {
                n3 = byteBuffer.position() + 4;
                int n8 = byteBuffer.get(n3) & 0x30;
                n4 = n8 >> 4;
            }
            return zzb[n4] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = 6;
        if (n3 < n4) {
            return -1;
        }
        n3 = byArray[5] & 0xF8;
        int n7 = 3;
        int n8 = 10;
        if ((n3 >>= n7) > n8) {
            n3 = byArray[2] & 7;
            int n10 = byArray[n7];
            n10 = (n10 & 0xFF | (n3 <<= 8)) + 1;
            return n10 + n10;
        }
        int n14 = byArray[4];
        n3 = (n14 & 0xC0) >> n4;
        return zzact.zzf(n3, n14 &= 0x3F);
    }

    public static zzan zzc(zzfu object, String string2, String string3, zzae zzae2) {
        zzft zzft2 = new zzft();
        zzft2.zzi((zzfu)object);
        int n3 = zzft2.zzd(2);
        n3 = zzc[n3];
        zzft2.zzm(8);
        int[] nArray = zze;
        int n4 = zzft2.zzd(3);
        int n7 = nArray[n4];
        n4 = zzft2.zzd(1);
        if (n4 != 0) {
            ++n7;
        }
        n4 = zzft2.zzd(5);
        n4 = zzf[n4] * 1000;
        zzft2.zze();
        int n8 = zzft2.zzb();
        ((zzfu)object).zzK(n8);
        object = new zzal();
        ((zzal)object).zzK(string2);
        ((zzal)object).zzX("audio/ac3");
        ((zzal)object).zzy(n7);
        ((zzal)object).zzY(n3);
        ((zzal)object).zzE(zzae2);
        ((zzal)object).zzO(string3);
        ((zzal)object).zzx(n4);
        ((zzal)object).zzS(n4);
        return ((zzal)object).zzad();
    }

    /*
     * Unable to fully structure code
     */
    public static zzan zzd(zzfu var0, String var1_1, String var2_2, zzae var3_3) {
        var4_4 = new zzft();
        var4_4.zzi((zzfu)var0);
        var5_5 = var4_4.zzd(13) * 1000;
        var6_6 = 3;
        var4_4.zzm(var6_6);
        var7_7 = var4_4.zzd(2);
        var7_7 = zzact.zzc[var7_7];
        var4_4.zzm(10);
        var8_8 = zzact.zze;
        var9_9 = var4_4.zzd(var6_6);
        var10_10 = var8_8[var9_9];
        var9_9 = 1;
        var11_11 = var4_4.zzd(var9_9);
        if (var11_11 != 0) {
            ++var10_10;
        }
        var4_4.zzm(var6_6);
        var6_6 = var4_4.zzd(4);
        var4_4.zzm(var9_9);
        if (var6_6 > 0) {
            var4_4.zzm(6);
            var6_6 = var4_4.zzd(var9_9);
            if (var6_6 != 0) {
                var10_10 += 2;
            }
            var4_4.zzm(var9_9);
        }
        if ((var6_6 = var4_4.zza()) <= (var11_11 = 7)) ** GOTO lbl-1000
        var4_4.zzm(var11_11);
        var6_6 = var4_4.zzd(var9_9);
        if (var6_6 != 0) {
            var12_12 = "audio/eac3-joc";
        } else lbl-1000:
        // 2 sources

        {
            var12_12 = "audio/eac3";
        }
        var4_4.zze();
        var13_13 = var4_4.zzb();
        var0.zzK(var13_13);
        var0 = new zzal();
        var0.zzK(var1_1);
        var0.zzX(var12_12);
        var0.zzy(var10_10);
        var0.zzY(var7_7);
        var0.zzE(var3_3);
        var0.zzO(var2_2);
        var0.zzS(var5_5);
        return var0.zzad();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzacs zze(zzft var0) {
        block63: {
            block61: {
                block62: {
                    var1_1 = var0;
                    var2_2 = var0.zzc();
                    var0.zzm(40);
                    var3_3 = 5;
                    var4_4 = var0.zzd(var3_3);
                    var0.zzk(var2_2);
                    var2_2 = -1;
                    var5_5 = 8;
                    var6_6 = 6;
                    var7_7 = 3;
                    var8_8 = 1;
                    var9_9 = 2;
                    var10_10 = 10;
                    if (var4_4 <= var10_10) break block61;
                    var4_4 = 16;
                    var0.zzm(var4_4);
                    var11_11 = var0.zzd(var9_9);
                    if (var11_11 != 0) {
                        if (var11_11 != var8_8) {
                            if (var11_11 == var9_9) {
                                var2_2 = 2;
                            }
                        } else {
                            var2_2 = 1;
                        }
                    } else {
                        var2_2 = 0;
                    }
                    var1_1.zzm(var7_7);
                    var11_11 = var1_1.zzd(11) + var8_8;
                    var12_13 = var1_1.zzd(var9_9);
                    if (var12_13 == var7_7) {
                        var13_14 = zzact.zzd;
                        var14_15 = var1_1.zzd(var9_9);
                        var15_16 = var13_14[var14_15];
                        var14_15 = 3;
                        var16_18 = 6;
                    } else {
                        var15_16 = var1_1.zzd(var9_9);
                        var17_20 = zzact.zzb;
                        var14_15 = var17_20[var15_16];
                        var18_21 = zzact.zzc;
                        var16_18 = var18_21[var12_13];
                        var19_22 = var14_15;
                        var14_15 = var15_16;
                        var15_16 = var16_18;
                        var16_18 = var19_22;
                    }
                    var11_11 += var11_11;
                    var20_23 = var16_18 * 32;
                    var21_24 = var11_11 * var15_16 / var20_23;
                    var20_23 = var1_1.zzd(var7_7);
                    var22_25 = var0.zzo();
                    var23_26 = zzact.zze;
                    var24_27 = var23_26[var20_23] + var22_25;
                    var1_1.zzm(var10_10);
                    var10_10 = (int)var0.zzo();
                    if (var10_10 != 0) {
                        var1_1.zzm(var5_5);
                    }
                    if (var20_23 == 0) {
                        var1_1.zzm(var3_3);
                        var10_10 = (int)var0.zzo();
                        if (var10_10 != 0) {
                            var1_1.zzm(var5_5);
                        }
                        var10_10 = 0;
                        var25_29 = null;
                        var20_23 = 0;
                    } else {
                        var10_10 = var20_23;
                    }
                    if (var2_2 == var8_8) {
                        var26_31 = var0.zzo();
                        if (var26_31 != 0) {
                            var1_1.zzm(var4_4);
                        }
                        var4_4 = 1;
                    } else {
                        var4_4 = var2_2;
                    }
                    var26_31 = var0.zzo();
                    var27_32 = 4;
                    if (var26_31 == 0) break block62;
                    if (var10_10 > var9_9) {
                        var1_1.zzm(var9_9);
                    }
                    if ((var26_31 = var10_10 & 1) != 0 && var10_10 > var9_9) {
                        var1_1.zzm(var6_6);
                    }
                    if ((var26_31 = var10_10 & 4) != 0) {
                        var1_1.zzm(var6_6);
                    }
                    if (var22_25 != 0 && (var22_25 = (int)var0.zzo()) != 0) {
                        var1_1.zzm(var3_3);
                    }
                    if (var4_4 != 0) break block62;
                    var4_4 = (int)var0.zzo();
                    if (var4_4 != 0) {
                        var1_1.zzm(var6_6);
                    }
                    if (var10_10 == 0 && (var4_4 = (int)var0.zzo()) != 0) {
                        var1_1.zzm(var6_6);
                    }
                    if ((var4_4 = (int)var0.zzo()) != 0) {
                        var1_1.zzm(var6_6);
                    }
                    if ((var4_4 = var1_1.zzd(var9_9)) == var8_8) {
                        var1_1.zzm(var3_3);
                    } else if (var4_4 == var9_9) {
                        var4_4 = 12;
                        var1_1.zzm(var4_4);
                    } else if (var4_4 == var7_7) {
                        var4_4 = var1_1.zzd(var3_3);
                        var22_25 = (int)var0.zzo();
                        if (var22_25 != 0) {
                            var1_1.zzm(var3_3);
                            var22_25 = (int)var0.zzo();
                            if (var22_25 != 0) {
                                var1_1.zzm(var27_32);
                            }
                            if ((var22_25 = (int)var0.zzo()) != 0) {
                                var1_1.zzm(var27_32);
                            }
                            if ((var22_25 = (int)var0.zzo()) != 0) {
                                var1_1.zzm(var27_32);
                            }
                            if ((var22_25 = (int)var0.zzo()) != 0) {
                                var1_1.zzm(var27_32);
                            }
                            if ((var22_25 = (int)var0.zzo()) != 0) {
                                var1_1.zzm(var27_32);
                            }
                            if ((var22_25 = (int)var0.zzo()) != 0) {
                                var1_1.zzm(var27_32);
                            }
                            if ((var22_25 = (int)var0.zzo()) != 0) {
                                var1_1.zzm(var27_32);
                            }
                            if ((var22_25 = (int)var0.zzo()) != 0) {
                                var22_25 = (int)var0.zzo();
                                if (var22_25 != 0) {
                                    var1_1.zzm(var27_32);
                                }
                                if ((var22_25 = (int)var0.zzo()) != 0) {
                                    var1_1.zzm(var27_32);
                                }
                            }
                        }
                        if ((var22_25 = (int)var0.zzo()) != 0) {
                            var1_1.zzm(var3_3);
                            var22_25 = (int)var0.zzo();
                            if (var22_25 != 0) {
                                var1_1.zzm(7);
                                var8_8 = (int)var0.zzo();
                                if (var8_8 != 0) {
                                    var1_1.zzm(var5_5);
                                }
                            }
                        }
                        var4_4 = (var4_4 + var9_9) * 8;
                        var1_1.zzm(var4_4);
                        var0.zze();
                    }
                    if (var10_10 < var9_9) {
                        var4_4 = (int)var0.zzo();
                        var8_8 = 14;
                        if (var4_4 != 0) {
                            var1_1.zzm(var8_8);
                        }
                        if (var20_23 == 0 && (var4_4 = (int)var0.zzo()) != 0) {
                            var1_1.zzm(var8_8);
                        }
                    }
                    if ((var4_4 = (int)var0.zzo()) == 0) ** GOTO lbl157
                    if (var14_15 == 0) {
                        var1_1.zzm(var3_3);
                        var4_4 = 0;
                        var28_33 = null;
                        var14_15 = 0;
                        var17_20 = null;
                    } else {
                        var28_34 = null;
                        for (var4_4 = 0; var4_4 < var16_18; ++var4_4) {
                            var8_8 = (int)var0.zzo();
                            if (var8_8 == 0) continue;
                            var1_1.zzm(var3_3);
                        }
lbl157:
                        // 2 sources

                        var4_4 = 0;
                        var28_34 = null;
                    }
                }
                if ((var8_8 = (int)var0.zzo()) != 0) {
                    var1_1.zzm(var3_3);
                    if (var10_10 == var9_9) {
                        var1_1.zzm(var27_32);
                        var10_10 = 2;
                    }
                    if (var10_10 >= var6_6) {
                        var1_1.zzm(var9_9);
                    }
                    if ((var3_3 = (int)var0.zzo()) != 0) {
                        var1_1.zzm(var5_5);
                    }
                    if (var10_10 == 0 && (var3_3 = (int)var0.zzo()) != 0) {
                        var1_1.zzm(var5_5);
                    }
                    if (var12_13 < var7_7) {
                        var0.zzl();
                    }
                }
                if (var4_4 == 0 && var14_15 != var7_7) {
                    var0.zzl();
                }
                if (var4_4 == var9_9 && (var14_15 == var7_7 || (var3_3 = (int)var0.zzo()) != 0)) {
                    var1_1.zzm(var6_6);
                }
                var1_1 = (var3_3 = (int)var0.zzo()) != 0 && (var3_3 = var1_1.zzd(var6_6)) == (var4_4 = 1) && (var29_36 = var1_1.zzd(var5_5)) == var4_4 ? "audio/eac3-joc" : "audio/eac3";
                var30_38 = var1_1;
                var31_39 = var2_2;
                var32_40 = var11_11;
                var33_41 = var15_16;
                var34_42 = var16_18 *= 256;
                var35_43 = var21_24;
                var36_44 = var24_27;
                break block63;
            }
            var0.zzm(32);
            var3_3 = var0.zzd(var9_9);
            if (var3_3 == var7_7) {
                var4_4 = 0;
                var28_35 = null;
            } else {
                var28_35 = "audio/ac3";
            }
            var6_6 = var1_1.zzd(var6_6);
            var8_8 = var6_6 / 2;
            var25_30 = zzact.zzf;
            var8_8 = var25_30[var8_8] * 1000;
            var11_12 = zzact.zzf(var3_3, var6_6);
            var1_1.zzm(var5_5);
            var5_5 = var1_1.zzd(var7_7);
            var6_6 = var5_5 & 1;
            if (var6_6 != 0 && var5_5 != (var6_6 = 1)) {
                var1_1.zzm(var9_9);
            }
            if ((var6_6 = var5_5 & 4) != 0) {
                var1_1.zzm(var9_9);
            }
            if (var5_5 == var9_9) {
                var1_1.zzm(var9_9);
            }
            if (var3_3 < var7_7) {
                var37_45 = zzact.zzc;
                var15_17 = var3_3 = var37_45[var3_3];
            } else {
                var15_17 = -1;
            }
            var29_37 = var0.zzo();
            var38_46 = zzact.zze;
            var3_3 = var38_46[var5_5];
            var24_28 = var3_3 + var29_37;
            var16_19 = 1536;
            var30_38 = var28_35;
            var35_43 = var8_8;
            var32_40 = var11_12;
            var33_41 = var15_17;
            var36_44 = var24_28;
            var31_39 = -1;
            var34_42 = 1536;
        }
        var1_1 = new zzacs((String)var30_38, var31_39, var36_44, var33_41, var32_40, var34_42, var35_43, null);
        return var1_1;
    }

    private static int zzf(int n3, int n4) {
        int n7;
        int n8;
        if (n3 >= 0 && n3 < (n8 = 3) && n4 >= 0 && (n8 = n4 >> 1) < (n7 = 19)) {
            int[] nArray = zzc;
            n7 = 44100;
            if ((n3 = nArray[n3]) == n7) {
                n3 = zzg[n8];
                return (n3 += (n4 &= 1)) + n3;
            }
            int[] nArray2 = zzf;
            n4 = nArray2[n8];
            n8 = 32000;
            if (n3 == n8) {
                return n4 * 6;
            }
            return n4 * 4;
        }
        return -1;
    }
}

