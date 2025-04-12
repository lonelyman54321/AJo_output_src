/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from WJ3
 */
public final class wj3_1 {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static final String a(int var0, byte[] var1_1, int var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = 4;
        var7_7 = 3;
        var8_8 = 2;
        var9_9 = 1;
        var10_10 = "<this>";
        Intrinsics.checkNotNullParameter(var1_1, (String)var10_10);
        if (var0 < 0 || var2_2 > (var11_11 = var1_1.length) || var0 > var2_2) {
            var21_23 = new StringBuilder("size=");
            var22_24 = var4_4.length;
            m10.a(var21_23, var22_24, " beginIndex=", var3_3, " endIndex=");
            var21_23.append(var5_5);
            var23_25 = var21_23.toString();
            var19_20 = new IndexOutOfBoundsException(var23_25);
            throw var19_20;
        }
        var11_11 = var2_2 - var0;
        var10_10 = new char[var11_11];
        var12_12 = 0;
        while (true) {
            block25: {
                block38: {
                    block28: {
                        block32: {
                            block30: {
                                block33: {
                                    block31: {
                                        block34: {
                                            block35: {
                                                block37: {
                                                    block36: {
                                                        block29: {
                                                            block26: {
                                                                block27: {
                                                                    block23: {
                                                                        block22: {
                                                                            block24: {
                                                                                block21: {
                                                                                    if (var3_3 >= var5_5) {
                                                                                        return b.g((char[])var10_10, 0, var12_12);
                                                                                    }
                                                                                    var13_13 = var4_4[var3_3];
                                                                                    if (var13_13 < 0) break block21;
                                                                                    var13_13 = var13_13;
                                                                                    var14_14 = var12_12 + 1;
                                                                                    var10_10[var12_12] = var13_13;
                                                                                    var3_3 += var9_9;
                                                                                    while (var3_3 < var5_5 && (var12_12 = var4_4[var3_3]) >= 0) {
                                                                                        var3_3 += var9_9;
                                                                                        var12_12 = (char)var12_12;
                                                                                        var13_13 = var14_14 + 1;
                                                                                        var10_10[var14_14] = var12_12;
                                                                                        var14_14 = var13_13;
                                                                                    }
                                                                                    break block22;
                                                                                }
                                                                                var14_14 = var13_13 >> 5;
                                                                                var15_15 = -2;
                                                                                var16_16 = 128;
                                                                                var17_17 = (char)-3;
                                                                                if (var14_14 != var15_15) break block23;
                                                                                var14_14 = var3_3 + 1;
                                                                                if (var5_5 > var14_14) break block24;
                                                                                var13_13 = var17_17;
                                                                                var14_14 = var12_12 + 1;
                                                                                var10_10[var12_12] = var13_13;
                                                                                ** GOTO lbl69
                                                                            }
                                                                            var15_15 = (var14_14 = var4_4[var14_14]) & 192;
                                                                            if (var15_15 == var16_16) {
                                                                                if ((var13_13 = (int)(var13_13 << 6 ^ (var14_14 ^= 3968))) < var16_16) {
                                                                                    var13_13 = var17_17;
                                                                                    var14_14 = var12_12 + 1;
                                                                                    var10_10[var12_12] = var13_13;
                                                                                } else {
                                                                                    var13_13 = (char)var13_13;
                                                                                    var14_14 = var12_12 + 1;
                                                                                    var10_10[var12_12] = var13_13;
                                                                                }
                                                                                var12_12 = 2;
                                                                            } else {
                                                                                var13_13 = var17_17;
                                                                                var14_14 = var12_12 + 1;
                                                                                var10_10[var12_12] = var13_13;
lbl69:
                                                                                // 2 sources

                                                                                var12_12 = 1;
                                                                            }
                                                                            var3_3 += var12_12;
                                                                        }
                                                                        var12_12 = var14_14;
                                                                        break block25;
                                                                    }
                                                                    var14_14 = var13_13 >> 4;
                                                                    var18_18 = 57344;
                                                                    var6_6 = 55296;
                                                                    if (var14_14 != var15_15) break block26;
                                                                    var14_14 = var3_3 + 2;
                                                                    if (var5_5 > var14_14) break block27;
                                                                    var6_6 = var17_17;
                                                                    var13_13 = var12_12 + 1;
                                                                    var10_10[var12_12] = var6_6;
                                                                    var19_19 = Unit.a;
                                                                    var6_6 = var3_3 + 1;
                                                                    if (var5_5 <= var6_6 || (var6_6 = var4_4[var6_6] & 192) != var16_16) ** GOTO lbl125
                                                                    ** GOTO lbl119
                                                                }
                                                                var15_15 = var3_3 + 1;
                                                                var20_21 = (var15_15 = var4_4[var15_15]) & 192;
                                                                if (var20_21 == var16_16) {
                                                                    var20_21 = var4_4[var14_14];
                                                                    if ((var14_14 = var20_21 & 192) == var16_16) {
                                                                        var20_21 ^= -123008;
                                                                        var14_14 = var15_15 << 6;
                                                                        var20_21 ^= var14_14;
                                                                        var13_13 = var13_13 << 12;
                                                                        if ((var20_21 ^= var13_13) < (var13_13 = 2048)) {
                                                                            var6_6 = var17_17;
                                                                            var20_21 = var12_12 + 1;
                                                                            var10_10[var12_12] = var6_6;
                                                                        } else if (var6_6 <= var20_21 && var20_21 < var18_18) {
                                                                            var6_6 = var17_17;
                                                                            var20_21 = var12_12 + 1;
                                                                            var10_10[var12_12] = var6_6;
                                                                        } else {
                                                                            var6_6 = (char)var20_21;
                                                                            var20_21 = var12_12 + 1;
                                                                            var10_10[var12_12] = var6_6;
                                                                        }
                                                                        var19_19 = Unit.a;
                                                                        var13_13 = var20_21;
                                                                        var6_6 = 3;
                                                                    } else {
                                                                        var6_6 = var17_17;
                                                                        var13_13 = var12_12 + 1;
                                                                        var10_10[var12_12] = var6_6;
                                                                        var19_19 = Unit.a;
lbl119:
                                                                        // 2 sources

                                                                        var6_6 = 2;
                                                                    }
                                                                } else {
                                                                    var6_6 = var17_17;
                                                                    var13_13 = var12_12 + 1;
                                                                    var10_10[var12_12] = var6_6;
                                                                    var19_19 = Unit.a;
lbl125:
                                                                    // 2 sources

                                                                    var6_6 = 1;
                                                                }
                                                                var3_3 += var6_6;
                                                                var12_12 = var13_13;
                                                                break block25;
                                                            }
                                                            var20_21 = var13_13 >> 3;
                                                            if (var20_21 != var15_15) break block28;
                                                            var20_21 = var3_3 + 3;
                                                            if (var5_5 > var20_21) break block29;
                                                            var6_6 = var12_12 + 1;
                                                            var10_10[var12_12] = var17_17;
                                                            var20_21 = var3_3 + 1;
                                                            if (var5_5 <= var20_21 || (var20_21 = var4_4[var20_21] & 192) != var16_16) break block30;
                                                            var20_21 = var3_3 + 2;
                                                            if (var5_5 <= var20_21 || (var20_21 = var4_4[var20_21] & 192) != var16_16) break block31;
                                                            break block32;
                                                        }
                                                        var14_14 = var3_3 + 1;
                                                        var15_15 = (var14_14 = var4_4[var14_14]) & 192;
                                                        if (var15_15 != var16_16) break block33;
                                                        var15_15 = var3_3 + 2;
                                                        var7_7 = (var15_15 = var4_4[var15_15]) & 192;
                                                        if (var7_7 != var16_16) break block34;
                                                        var7_7 = var4_4[var20_21];
                                                        if ((var20_21 = var7_7 & 192) != var16_16) break block35;
                                                        var7_7 ^= 3678080;
                                                        var20_21 = var15_15 << 6;
                                                        var7_7 ^= var20_21;
                                                        var20_21 = var14_14 << 12;
                                                        var7_7 ^= var20_21;
                                                        var20_21 = var13_13 << 18;
                                                        if ((var7_7 ^= var20_21) <= (var20_21 = 0x10FFFF)) break block36;
                                                        var6_6 = var12_12 + 1;
                                                        var10_10[var12_12] = var17_17;
                                                        ** GOTO lbl172
                                                    }
                                                    if (var6_6 > var7_7 || var7_7 >= var18_18) break block37;
                                                    var6_6 = var12_12 + 1;
                                                    var10_10[var12_12] = var17_17;
                                                    ** GOTO lbl172
                                                }
                                                var6_6 = 65536;
                                                if (var7_7 < var6_6) {
                                                    var6_6 = var12_12 + 1;
                                                    var10_10[var12_12] = var17_17;
lbl172:
                                                    // 3 sources

                                                    var21_22 = Unit.a;
                                                } else {
                                                    if (var7_7 != var17_17) {
                                                        var6_6 = (char)((var7_7 >>> 10) + 55232);
                                                        var20_21 = var12_12 + 1;
                                                        var10_10[var12_12] = var6_6;
                                                        var6_6 = var7_7 & 1023;
                                                        var7_7 = 56320;
                                                        var6_6 = (char)(var6_6 + var7_7);
                                                        var12_12 += var8_8;
                                                        var10_10[var20_21] = var6_6;
                                                    } else {
                                                        var6_6 = var12_12 + 1;
                                                        var10_10[var12_12] = var17_17;
                                                        var12_12 = var6_6;
                                                    }
                                                    var19_19 = Unit.a;
                                                    var6_6 = var12_12;
                                                }
                                                var7_7 = 4;
                                                break block32;
                                            }
                                            var6_6 = var12_12 + 1;
                                            var10_10[var12_12] = var17_17;
                                            var21_22 = Unit.a;
                                            var7_7 = 3;
                                            break block32;
                                        }
                                        var6_6 = var12_12 + 1;
                                        var10_10[var12_12] = var17_17;
                                        var21_22 = Unit.a;
                                    }
                                    var7_7 = 2;
                                    break block32;
                                }
                                var6_6 = var12_12 + 1;
                                var10_10[var12_12] = var17_17;
                                var21_22 = Unit.a;
                            }
                            var7_7 = 1;
                        }
                        var3_3 += var7_7;
                        break block38;
                    }
                    var6_6 = var12_12 + 1;
                    var10_10[var12_12] = var17_17;
                    var3_3 += var9_9;
                }
                var12_12 = var6_6;
            }
            var6_6 = 4;
            var7_7 = 3;
        }
    }
}

