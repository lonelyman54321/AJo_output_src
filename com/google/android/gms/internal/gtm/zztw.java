/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztd;
import com.google.android.gms.internal.gtm.zztg;
import com.google.android.gms.internal.gtm.zzth;
import com.google.android.gms.internal.gtm.zzti;
import com.google.android.gms.internal.gtm.zztm;
import com.google.android.gms.internal.gtm.zztn;
import com.google.android.gms.internal.gtm.zzto;
import com.google.android.gms.internal.gtm.zztp;
import com.google.android.gms.internal.gtm.zztt;
import com.google.android.gms.internal.gtm.zztu;
import com.google.android.gms.internal.gtm.zztv;
import java.util.Arrays;
import java.util.Objects;

final class zztw
extends zzto {
    final transient Object[] zza;
    private final transient Object zzb;

    private zztw(Object object, Object[] objectArray, int n3) {
        this.zzb = object;
        this.zza = objectArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zztw zzg(int var0, Object[] var1_1, zztn var2_2) {
        block21: {
            block22: {
                block20: {
                    var3_3 = var1_1;
                    var4_4 /* !! */  = "index";
                    var5_5 = 6;
                    zztd.zzb(var5_5, var5_5, (String)var4_4 /* !! */ );
                    var6_6 = zztp.zzf(var5_5);
                    var7_7 = var6_6 + -1;
                    var8_8 = 128;
                    var9_9 = 3;
                    var10_10 = 0;
                    var11_11 = null;
                    var12_12 = 1;
                    var13_13 = -1;
                    if (var6_6 > var8_8) break block20;
                    var4_4 /* !! */  = new byte[var6_6];
                    Arrays.fill((byte[])var4_4 /* !! */ , (byte)var13_13);
                    var13_13 = 0;
                    var14_14 = null;
                    block0: for (var8_8 = 0; var8_8 < var5_5; ++var8_8) {
                        var15_17 = var13_13 + var13_13;
                        var16_20 = var8_8 + var8_8;
                        var17_22 = var3_3[var16_20];
                        Objects.requireNonNull(var17_22);
                        var18_25 = var3_3[var16_20 ^= var12_12];
                        Objects.requireNonNull(var18_25);
                        zztg.zza(var17_22, var18_25);
                        var19_28 = zzth.zza(var17_22.hashCode());
                        while (true) {
                            var20_31 /* !! */  = var4_4 /* !! */ [var19_28 &= var7_7];
                            var21_34 = 255;
                            if ((var20_31 /* !! */  = (Object)(var20_31 /* !! */  & var21_34)) == var21_34) {
                                var21_34 = (byte)var15_17;
                                var4_4 /* !! */ [var19_28] = var21_34;
                                if (var13_13 < var8_8) {
                                    var3_3[var15_17] = var17_22;
                                    var21_34 = var15_17 ^ 1;
                                    var3_3[var21_34] = var18_25;
                                }
                                ++var13_13;
                                continue block0;
                            }
                            var22_37 = var3_3[var20_31 /* !! */ ];
                            var21_34 = (int)var17_22.equals(var22_37);
                            if (var21_34 != 0) {
                                var10_10 = var20_31 /* !! */  ^ 1;
                                var23_40 = var3_3[var10_10];
                                Objects.requireNonNull(var23_40);
                                var22_37 = new zztm(var17_22, var18_25, var23_40);
                                var3_3[var10_10] = var18_25;
                                var11_11 = var22_37;
                                continue block0;
                            }
                            ++var19_28;
                        }
                    }
                    if (var13_13 == var5_5) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var24_43 = var4_4 /* !! */ ;
                            var6_6 = 2;
                            ** GOTO lbl162
                            break;
                        }
                    } else {
                        var24_43 = new Object[var9_9];
                        var24_43[0] = var4_4 /* !! */ ;
                        var24_43[var12_12] = var4_4 /* !! */  = Integer.valueOf(var13_13);
                        var6_6 = 2;
                        var24_43[var6_6] = var11_11;
                    }
                    break block21;
                }
                var8_8 = 32768;
                if (var6_6 > var8_8) break block22;
                var4_4 /* !! */  = new short[var6_6];
                Arrays.fill((short[])var4_4 /* !! */ , (short)var13_13);
                var21_35 = 0;
                var22_38 = null;
                block3: for (var8_8 = 0; var8_8 < var5_5; ++var8_8) {
                    var13_13 = var21_35 + var21_35;
                    var15_18 = var8_8 + var8_8;
                    var18_26 = var3_3[var15_18];
                    Objects.requireNonNull(var18_26);
                    var23_41 = var3_3[var15_18 ^= var12_12];
                    Objects.requireNonNull(var23_41);
                    zztg.zza(var18_26, var23_41);
                    var25_44 = zzth.zza(var18_26.hashCode());
                    while (true) {
                        if ((var19_29 = (short)var4_4 /* !! */ [var25_44 &= var7_7]) == (var20_32 = (char)-1)) {
                            var19_29 = (short)var13_13;
                            var4_4 /* !! */ [var25_44] = var19_29;
                            if (var21_35 < var8_8) {
                                var3_3[var13_13] = var18_26;
                                var3_3[var13_13 ^= 1] = var23_41;
                            }
                            ++var21_35;
                            continue block3;
                        }
                        var26_45 = var3_3[var19_29];
                        var20_32 = (char)var18_26.equals(var26_45);
                        if (var20_32 != '\u0000') {
                            var10_10 = var19_29 ^ 1;
                            var17_23 = var3_3[var10_10];
                            Objects.requireNonNull(var17_23);
                            var14_15 = new zztm(var18_26, var23_41, var17_23);
                            var3_3[var10_10] = var23_41;
                            var11_11 = var14_15;
                            continue block3;
                        }
                        ++var25_44;
                    }
                }
                if (var21_35 == var5_5) ** GOTO lbl-1000
                var24_43 = new Object[var9_9];
                var24_43[0] = var4_4 /* !! */ ;
                var24_43[var12_12] = var4_4 /* !! */  = Integer.valueOf(var21_35);
                var6_6 = 2;
                var24_43[var6_6] = var11_11;
                break block21;
            }
            var4_4 /* !! */  = new int[var6_6];
            Arrays.fill((int[])var4_4 /* !! */ , var13_13);
            var21_36 = 0;
            var22_39 = null;
            block5: for (var8_8 = 0; var8_8 < var5_5; ++var8_8) {
                var15_19 = var21_36 + var21_36;
                var16_21 = var8_8 + var8_8;
                var17_24 = var3_3[var16_21];
                Objects.requireNonNull(var17_24);
                var18_27 = var3_3[var16_21 ^= var12_12];
                Objects.requireNonNull(var18_27);
                zztg.zza(var17_24, var18_27);
                var19_30 = zzth.zza(var17_24.hashCode());
                while (true) {
                    block25: {
                        block24: {
                            block23: {
                                if ((var20_33 = var4_4 /* !! */ [var19_30 &= var7_7]) != var13_13) break block23;
                                var4_4 /* !! */ [var19_30] = var15_19;
                                if (var21_36 < var8_8) {
                                    var3_3[var15_19] = var17_24;
                                    var3_3[var15_19 ^= 1] = var18_27;
                                }
                                ++var21_36;
                                break block24;
                            }
                            var14_16 = var3_3[var20_33];
                            var13_13 = (int)var17_24.equals(var14_16);
                            if (var13_13 == 0) break block25;
                            var10_10 = var20_33 ^ 1;
                            var23_42 = var3_3[var10_10];
                            Objects.requireNonNull(var23_42);
                            var14_16 = new zztm(var17_24, var18_27, var23_42);
                            var3_3[var10_10] = var18_27;
                            var11_11 = var14_16;
                        }
                        var13_13 = -1;
                        continue block5;
                    }
                    ++var19_30;
                    var13_13 = -1;
                }
            }
            if (var21_36 != var5_5) ** break;
            ** while (true)
            var24_43 = new Object[var9_9];
            var24_43[0] = var4_4 /* !! */ ;
            var24_43[var12_12] = var4_4 /* !! */  = Integer.valueOf(var21_36);
            var6_6 = 2;
            var24_43[var6_6] = var11_11;
        }
        var8_8 = var24_43 instanceof Object[];
        if (var8_8 == 0) {
            var4_4 /* !! */  = new zztw(var24_43, var3_3, var5_5);
            return var4_4 /* !! */ ;
        }
        throw ((zztm)var24_43[var6_6]).zza();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object get(Object var1_1) {
        block11: {
            block9: {
                block8: {
                    if (var1_1 != null) break block8;
lbl2:
                    // 4 sources

                    while (true) {
                        var2_2 = false;
                        var1_1 = null;
                        ** GOTO lbl59
                        break;
                    }
                }
                var3_6 = this.zza;
                var4_7 = this.zzb;
                var5_8 = var4_7 instanceof byte[];
                var6_9 = -1;
                if (var5_8 == 0) break block9;
                var7_10 = var4_7;
                var7_10 = (byte[])var4_7;
                var8_12 = ((Object)var7_10).length + -1;
                var9_15 = zzth.zza(var1_1.hashCode());
                while (true) {
                    block10: {
                        var6_9 = (char)var7_10[var9_15 &= var8_12];
                        var10_17 = 255;
                        if ((var6_9 &= var10_17) == var10_17) ** GOTO lbl2
                        var11_20 = var3_6[var6_9];
                        var10_17 = (int)var1_1.equals(var11_20);
                        if (var10_17 == 0) break block10;
                        var2_3 = var6_9 ^ 1;
                        var1_1 = var3_6[var2_3];
                        ** GOTO lbl59
                    }
                    ++var9_15;
                }
            }
            var5_8 = var4_7 instanceof short[];
            if (var5_8 == 0) break block11;
            var7_11 = var4_7;
            var7_11 = (short[])var4_7;
            var8_13 = ((Object)var7_11).length + -1;
            var9_16 = zzth.zza(var1_1.hashCode());
            while (true) {
                block12: {
                    if ((var6_9 = (char)((char)var7_11[var9_16 &= var8_13])) == (var10_18 = (char)-1)) ** GOTO lbl2
                    var11_21 = var3_6[var6_9];
                    var10_18 = (char)var1_1.equals(var11_21);
                    if (var10_18 == '\u0000') break block12;
                    var2_4 = var6_9 ^ 1;
                    var1_1 = var3_6[var2_4];
                    ** GOTO lbl59
                }
                ++var9_16;
            }
        }
        var4_7 = (int[])var4_7;
        var5_8 = ((Object)var4_7).length + var6_9;
        var8_14 = zzth.zza(var1_1.hashCode());
        while (true) {
            block13: {
                if ((var10_19 = var4_7[var8_14 &= var5_8]) != var6_9) ** break;
                ** continue;
                var12_22 = var3_6[var10_19];
                var13_23 = var1_1.equals(var12_22);
                if (!var13_23) break block13;
                var2_5 = var10_19 ^ 1;
                var1_1 = var3_6[var2_5];
lbl59:
                // 4 sources

                if (var1_1 == null) {
                    return null;
                }
                return var1_1;
            }
            ++var8_14;
        }
    }

    public final int size() {
        return 6;
    }

    public final zzti zza() {
        Object[] objectArray = this.zza;
        zztv zztv2 = new zztv(objectArray, 1, 6);
        return zztv2;
    }

    public final zztp zzd() {
        Object[] objectArray = this.zza;
        zztt zztt2 = new zztt(this, objectArray, 0, 6);
        return zztt2;
    }

    public final zztp zze() {
        Object object = this.zza;
        zztv zztv2 = new zztv((Object[])object, 0, 6);
        object = new zztu(this, zztv2);
        return object;
    }
}

