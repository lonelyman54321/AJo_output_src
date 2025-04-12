/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfzz;
import com.google.android.gms.internal.ads.zzgau;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbd;
import com.google.android.gms.internal.ads.zzgbe;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgcq;
import com.google.android.gms.internal.ads.zzgcr;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.Arrays;
import java.util.Objects;

final class zzgct
extends zzgbf {
    static final zzgbf zza;
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    static {
        Object[] objectArray = new Object[]{};
        zzgct zzgct2 = new zzgct(null, objectArray, 0);
        zza = zzgct2;
    }

    private zzgct(Object object, Object[] objectArray, int n3) {
        this.zzc = object;
        this.zzb = objectArray;
        this.zzd = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzgct zzj(int var0, Object[] var1_1, zzgbe var2_2) {
        block28: {
            block34: {
                block29: {
                    block33: {
                        var3_3 = var0;
                        var4_4 = var1_1;
                        var5_5 = var2_2;
                        if (var0 == 0) {
                            return (zzgct)zzgct.zza;
                        }
                        var6_6 = 0;
                        var7_7 /* !! */  = null;
                        var8_8 = 1;
                        if (var0 == var8_8) {
                            var9_9 = var1_1[0];
                            Objects.requireNonNull(var9_9);
                            var5_5 = var1_1[var8_8];
                            Objects.requireNonNull(var5_5);
                            zzfzz.zzb(var9_9, var5_5);
                            var9_9 = new zzgct(null, var1_1, var8_8);
                            return var9_9;
                        }
                        var10_11 = var1_1.length >> var8_8;
                        var11_12 = "index";
                        zzfyg.zzb(var0, var10_11, (String)var11_12);
                        var10_11 = zzgbh.zzh(var0);
                        if (var0 == var8_8) {
                            var9_10 = var1_1[0];
                            Objects.requireNonNull(var9_10);
                            var12_13 = var1_1[var8_8];
                            Objects.requireNonNull(var12_13);
                            zzfzz.zzb(var9_10, var12_13);
                            var3_3 = 1;
lbl33:
                            // 3 sources

                            while (true) {
                                var8_8 = 2;
                                var13_16 = 1;
                                break block28;
                                break;
                            }
                        }
                        var14_17 = var10_11 + -1;
                        var15_18 = 128;
                        var16_19 = 3;
                        var17_20 = -1;
                        if (var10_11 > var15_18) break block29;
                        var12_14 /* !! */  = new byte[var10_11];
                        Arrays.fill(var12_14 /* !! */ , (byte)var17_20);
                        var18_21 = null;
                        var17_20 = 0;
                        var19_24 = null;
                        block1: for (var15_18 = 0; var15_18 < var3_3; ++var15_18) {
                            var20_27 = var17_20 + var17_20;
                            var21_29 = var15_18 + var15_18;
                            var22_32 = var4_4[var21_29];
                            Objects.requireNonNull(var22_32);
                            var23_34 = var4_4[var21_29 ^= var8_8];
                            Objects.requireNonNull(var23_34);
                            zzfzz.zzb(var22_32, var23_34);
                            var24_36 = zzgau.zza(var22_32.hashCode());
                            while (true) {
                                block32: {
                                    block31: {
                                        block30: {
                                            var13_16 = var12_14 /* !! */ [var24_36 &= var14_17];
                                            var8_8 = 255;
                                            if ((var13_16 &= var8_8) != var8_8) break block30;
                                            var12_14 /* !! */ [var24_36] = var8_8 = (int)((byte)var20_27);
                                            if (var17_20 < var15_18) {
                                                var4_4[var20_27] = var22_32;
                                                var8_8 = var20_27 ^ 1;
                                                var4_4[var8_8] = var23_34;
                                            }
                                            ++var17_20;
                                            break block31;
                                        }
                                        var25_39 /* !! */  = (short[])var4_4[var13_16];
                                        var8_8 = (int)var22_32.equals(var25_39 /* !! */ );
                                        if (var8_8 == 0) break block32;
                                        var6_6 = var13_16 ^ 1;
                                        var25_39 /* !! */  = (short[])new zzgbd;
                                        var11_12 = var4_4[var6_6];
                                        Objects.requireNonNull(var11_12);
                                        var25_39 /* !! */ (var22_32, var23_34, var11_12);
                                        var4_4[var6_6] = var23_34;
                                        var7_7 /* !! */  = var25_39 /* !! */ ;
                                    }
                                    var8_8 = 1;
                                    continue block1;
                                }
                                ++var24_36;
                                var8_8 = 1;
                            }
                        }
                        if (var17_20 != var3_3) break block33;
                        var7_7 /* !! */  = var12_14 /* !! */ ;
                        ** GOTO lbl33
                    }
                    var25_39 /* !! */  = (short[])new Object[var16_19];
                    var25_39 /* !! */ [0] = (short)var12_14 /* !! */ ;
                    var12_14 /* !! */  = (byte[])var17_20;
                    var13_16 = 1;
                    var25_39 /* !! */ [var13_16] = (short)var12_14 /* !! */ ;
                    var10_11 = 2;
                    var25_39 /* !! */ [var10_11] = (short)var7_7 /* !! */ ;
lbl99:
                    // 3 sources

                    while (true) {
                        var7_7 /* !! */  = var25_39 /* !! */ ;
                        ** continue;
                        break;
                    }
                }
                var8_8 = 32768;
                if (var10_11 > var8_8) break block34;
                var25_39 /* !! */  = new short[var10_11];
                Arrays.fill(var25_39 /* !! */ , (short)var17_20);
                var12_15 = null;
                var13_16 = 0;
                var11_12 = null;
                block4: for (var10_11 = 0; var10_11 < var3_3; ++var10_11) {
                    var15_18 = var13_16 + var13_16;
                    var17_20 = var10_11 + var10_11;
                    var26_40 = var4_4[var17_20];
                    Objects.requireNonNull(var26_40);
                    var19_25 = var4_4[var17_20 ^= 1];
                    Objects.requireNonNull(var19_25);
                    zzfzz.zzb(var26_40, var19_25);
                    var21_30 = zzgau.zza(var26_40.hashCode());
                    while (true) {
                        if ((var27_42 = (short)var25_39 /* !! */ [var21_30 &= var14_17]) == (var24_37 = (char)-1)) {
                            var25_39 /* !! */ [var21_30] = var27_42 = (short)var15_18;
                            if (var13_16 < var10_11) {
                                var4_4[var15_18] = var26_40;
                                var4_4[var15_18 ^= 1] = var19_25;
                            }
                            ++var13_16;
                            continue block4;
                        }
                        var28_43 = var4_4[var27_42];
                        var24_37 = (char)var26_40.equals(var28_43);
                        if (var24_37 != '\u0000') {
                            var6_6 = var27_42 ^ 1;
                            var23_35 = var4_4[var6_6];
                            Objects.requireNonNull(var23_35);
                            var18_22 = new zzgbd(var26_40, var19_25, var23_35);
                            var4_4[var6_6] = var19_25;
                            var7_7 /* !! */  = var18_22;
                            continue block4;
                        }
                        ++var21_30;
                    }
                }
                if (var13_16 == var3_3) ** GOTO lbl99
                var12_15 = new Object[var16_19];
                var12_15[0] = var25_39 /* !! */ ;
                var25_39 /* !! */  = (short[])var13_16;
                var13_16 = 1;
                var12_15[var13_16] = var25_39 /* !! */ ;
                var8_8 = 2;
                var12_15[var8_8] = var7_7 /* !! */ ;
lbl150:
                // 2 sources

                while (true) {
                    var7_7 /* !! */  = var12_15;
                    break block28;
                    break;
                }
            }
            var13_16 = 1;
            var25_39 /* !! */  = (short[])new int[var10_11];
            Arrays.fill((int[])var25_39 /* !! */ , var17_20);
            var12_15 = null;
            var15_18 = 0;
            var18_23 = null;
            block7: for (var10_11 = 0; var10_11 < var3_3; ++var10_11) {
                var20_28 = var15_18 + var15_18;
                var21_31 = var10_11 + var10_11;
                var22_33 = var4_4[var21_31];
                Objects.requireNonNull(var22_33);
                var11_12 = var4_4[var21_31 ^= var13_16];
                Objects.requireNonNull(var11_12);
                zzfzz.zzb(var22_33, var11_12);
                var21_31 = zzgau.zza(var22_33.hashCode());
                while (true) {
                    block37: {
                        block36: {
                            block35: {
                                if ((var24_38 = var25_39 /* !! */ [var21_31 &= var14_17]) != var17_20) break block35;
                                var25_39 /* !! */ [var21_31] = var20_28;
                                if (var15_18 < var10_11) {
                                    var4_4[var20_28] = var22_33;
                                    var4_4[var20_28 ^= 1] = var11_12;
                                }
                                ++var15_18;
                                break block36;
                            }
                            var19_26 = var4_4[var24_38];
                            var17_20 = (int)var22_33.equals(var19_26);
                            if (var17_20 == 0) break block37;
                            var6_6 = var24_38 ^ 1;
                            var26_41 = var4_4[var6_6];
                            Objects.requireNonNull(var26_41);
                            var19_26 = new zzgbd(var22_33, var11_12, var26_41);
                            var4_4[var6_6] = var11_12;
                            var7_7 /* !! */  = var19_26;
                        }
                        var13_16 = 1;
                        var17_20 = -1;
                        continue block7;
                    }
                    ++var21_31;
                    var17_20 = -1;
                }
            }
            if (var15_18 != var3_3) ** break;
            ** while (true)
            var12_15 = new Object[var16_19];
            var12_15[0] = var25_39 /* !! */ ;
            var25_39 /* !! */  = (short[])var15_18;
            var13_16 = 1;
            var12_15[var13_16] = var25_39 /* !! */ ;
            var8_8 = 2;
            var12_15[var8_8] = var7_7 /* !! */ ;
            ** while (true)
        }
        var10_11 = var7_7 /* !! */  instanceof Object[];
        if (var10_11 != 0) {
            var7_7 /* !! */  = var7_7 /* !! */ ;
            var9_10 = (zzgbd)var7_7 /* !! */ [var8_8];
            if (var5_5 != null) {
                var5_5.zzc = var9_10;
                var9_10 = var7_7 /* !! */ [0];
                var5_5 = (Integer)var7_7 /* !! */ [var13_16];
                var29_44 = var5_5.intValue();
                var6_6 = var29_44 + var29_44;
                var4_4 = Arrays.copyOf(var4_4, var6_6);
                var7_7 /* !! */  = var9_10;
                var3_3 = var29_44;
            } else {
                throw var9_10.zza();
            }
        }
        var5_5 = new zzgct(var7_7 /* !! */ , var4_4, var3_3);
        return var5_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object get(Object var1_1) {
        block12: {
            block10: {
                block9: {
                    block8: {
                        if (var1_1 != null) break block8;
lbl2:
                        // 6 sources

                        while (true) {
                            var2_2 = false;
                            var1_1 = null;
                            ** GOTO lbl74
                            break;
                        }
                    }
                    var3_6 = this.zzd;
                    var4_7 = this.zzb;
                    var5_8 = 1;
                    if (var3_6 != var5_8) break block9;
                    var3_6 = 0;
                    var6_9 = var4_7[0];
                    Objects.requireNonNull(var6_9);
                    var2_2 = var6_9.equals(var1_1);
                    if (!var2_2) ** GOTO lbl2
                    var1_1 = var4_7[var5_8];
                    Objects.requireNonNull(var1_1);
                    ** GOTO lbl74
                }
                var6_10 = this.zzc;
                if (var6_10 == null) ** GOTO lbl2
                var7_11 = var6_10 instanceof byte[];
                var8_12 = -1;
                if (var7_11 == 0) break block10;
                var9_13 = var6_10;
                var9_13 = (byte[])var6_10;
                var10_15 = ((Object)var9_13).length + -1;
                var3_6 = zzgau.zza(var1_1.hashCode());
                while (true) {
                    block11: {
                        var8_12 = (char)var9_13[var3_6 &= var10_15];
                        var11_18 = 255;
                        if ((var8_12 &= var11_18) == var11_18) ** GOTO lbl2
                        var12_21 = var4_7[var8_12];
                        var11_18 = (int)var1_1.equals(var12_21);
                        if (var11_18 == 0) break block11;
                        var2_3 = var8_12 ^ 1;
                        var1_1 = var4_7[var2_3];
                        ** GOTO lbl74
                    }
                    ++var3_6;
                }
            }
            var7_11 = var6_10 instanceof short[];
            if (var7_11 == 0) break block12;
            var9_14 = var6_10;
            var9_14 = (short[])var6_10;
            var10_16 = ((Object)var9_14).length + -1;
            var3_6 = zzgau.zza(var1_1.hashCode());
            while (true) {
                block13: {
                    if ((var8_12 = (char)((char)var9_14[var3_6 &= var10_16])) == (var11_19 = (char)-1)) ** GOTO lbl2
                    var12_22 = var4_7[var8_12];
                    var11_19 = (char)var1_1.equals(var12_22);
                    if (var11_19 == '\u0000') break block13;
                    var2_4 = var8_12 ^ 1;
                    var1_1 = var4_7[var2_4];
                    ** GOTO lbl74
                }
                ++var3_6;
            }
        }
        var6_10 = (int[])var6_10;
        var7_11 = ((Object)var6_10).length + var8_12;
        var10_17 = zzgau.zza(var1_1.hashCode());
        while (true) {
            block14: {
                if ((var11_20 = var6_10[var10_17 &= var7_11]) != var8_12) ** break;
                ** continue;
                var13_23 = var4_7[var11_20];
                var14_24 = var1_1.equals(var13_23);
                if (!var14_24) break block14;
                var2_5 = var11_20 ^ 1;
                var1_1 = var4_7[var2_5];
lbl74:
                // 5 sources

                if (var1_1 == null) {
                    return null;
                }
                return var1_1;
            }
            ++var10_17;
        }
    }

    public final int size() {
        return this.zzd;
    }

    public final zzgax zza() {
        int n3 = this.zzd;
        Object[] objectArray = this.zzb;
        zzgcs zzgcs2 = new zzgcs(objectArray, 1, n3);
        return zzgcs2;
    }

    public final zzgbh zzf() {
        int n3 = this.zzd;
        Object[] objectArray = this.zzb;
        zzgcq zzgcq2 = new zzgcq(this, objectArray, 0, n3);
        return zzgcq2;
    }

    public final zzgbh zzg() {
        int n3 = this.zzd;
        Object[] objectArray = this.zzb;
        zzgcs zzgcs2 = new zzgcs(objectArray, 0, n3);
        zzgcr zzgcr2 = new zzgcr(this, zzgcs2);
        return zzgcr2;
    }
}

