/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;

/*
 * Renamed from Zh3
 */
public final class zh3_1 {
    public static final zh3_1 a;
    public static final float b;
    public static final float c;

    static {
        zh3_1 zh3_12;
        a = zh3_12 = new Object();
        b = 1.0f;
        c = 2;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(LP1 var1_1, float var2_2, long var3_3, b30_0 var5_4, int var6_5, int var7_6) {
        block23: {
            block19: {
                block22: {
                    block21: {
                        block20: {
                            var8_7 = var6_5;
                            var9_8 = 462890063;
                            var10_9 = var5_4;
                            var11_10 = var5_4.g(var9_8);
                            var12_11 = var7_6 & 1;
                            if (var12_11 != 0) {
                                var14_13 = var13_12 = var6_5 | 6;
                                var15_14 = var1_1;
                            } else {
                                var13_12 = var6_5 & 14;
                                if (var13_12 == 0) {
                                    var15_14 = var1_1;
                                    var14_13 = (int)var11_10.J(var1_1);
                                    if (var14_13 != 0) {
                                        var14_13 = 4;
                                        var16_15 = 5.6E-45f;
                                    } else {
                                        var14_13 = 2;
                                        var16_15 = 2.8E-45f;
                                    }
                                    var14_13 |= var8_7;
                                } else {
                                    var15_14 = var1_1;
                                    var14_13 = var6_5;
                                }
                            }
                            var17_16 = var8_7 & 112;
                            if (var17_16 != 0) break block19;
                            var17_16 = var7_6 & 2;
                            if (var17_16 != 0) break block20;
                            var18_17 = var2_2;
                            var19_18 = (int)var11_10.b(var2_2);
                            if (var19_18 == 0) break block21;
                            var19_18 = 32;
                            break block22;
                        }
                        var18_17 = var2_2;
                    }
                    var19_18 = 16;
                }
                var14_13 |= var19_18;
                break block23;
            }
            var18_17 = var2_2;
        }
        var19_18 = var8_7 & 896;
        if (var19_18 == 0) {
            var19_18 = var7_6 & 4;
            var20_19 = var3_3;
            var19_18 = var19_18 == 0 && (var19_18 = (int)var11_10.d(var3_3)) != 0 ? 256 : 128;
            var14_13 |= var19_18;
        } else {
            var20_19 = var3_3;
        }
        var19_18 = var8_7 & 7168;
        if (var19_18 == 0) {
            var19_18 = (int)var11_10.J(this);
            var19_18 = var19_18 != 0 ? 2048 : 1024;
            var14_13 |= var19_18;
        }
        if ((var19_18 = var14_13 & 5851) == (var22_20 = 1170) && (var19_18 = (int)var11_10.h()) != 0) {
            var11_10.D();
            var16_15 = var18_17;
            var23_21 = var20_19;
        } else {
            var11_10.r0();
            var19_18 = var8_7 & 1;
            if (var19_18 != 0 && (var19_18 = (int)var11_10.c0()) == 0) {
                var11_10.D();
                var12_11 = var7_6 & 2;
                if (var12_11 != 0) {
                    var14_13 &= -113;
                }
                if ((var12_11 = var7_6 & 4) != 0) {
                    var14_13 &= -897;
                }
                var10_9 = var15_14;
                var25_22 = var18_17;
                while (true) {
                    var23_21 = var20_19;
                    break;
                }
            } else {
                var10_9 = var12_11 != 0 ? LP1$a.b : var15_14;
                var13_12 = var7_6 & 2;
                if (var13_12 != 0) {
                    var14_13 &= -113;
                    var25_22 = zh3_1.b;
                } else {
                    var25_22 = var18_17;
                }
                if ((var17_16 = var7_6 & 4) == 0) ** continue;
                var26_23 = w60_0.a;
                var26_23 = (OX)var11_10.j((H30)var26_23);
                var23_21 = var26_23.a;
                var27_24 = 1039516303;
                var28_25 = 0.12f;
                var23_21 = OX.b(var23_21, var28_25);
                var14_13 &= -897;
            }
            var11_10.U();
            var27_24 = var14_13 & 14;
            var29_26 = var14_13 >> 3 & 112;
            var14_13 = var14_13 << 3 & 896;
            var30_27 = (var27_24 |= var29_26) | var14_13;
            var31_28 = 8;
            Rr0.a((LP1)var10_9, var23_21, var25_22, 0.0f, (b30_0)var11_10, var30_27, var31_28);
            var16_15 = var25_22;
            var15_14 = var10_9;
        }
        var32_29 = var11_10.X();
        if (var32_29 != null) {
            var11_10 = var33_30;
            var10_9 = this;
            var8_7 = var6_5;
            var27_24 = var7_6;
            var33_30 = new xh3_2(this, (LP1)var15_14, var16_15, var23_21, var6_5, var7_6);
            var32_29.d = var33_30;
        }
    }

    public final void b(LP1 lP1, float f5, long l2, b30_0 b30_02, int n3, int n4) {
        int n7;
        long l3;
        float f6;
        int n8;
        float f7;
        int n10;
        Object object;
        int n14;
        block20: {
            block16: {
                block19: {
                    block18: {
                        block17: {
                            int n15;
                            block15: {
                                block11: {
                                    block14: {
                                        block13: {
                                            block12: {
                                                n14 = n3;
                                                int n16 = -1322812859;
                                                object = b30_02.g(n16);
                                                n10 = n3 & 0xE;
                                                if (n10 == 0) {
                                                    n10 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                                                    if (n10 != 0) {
                                                        n10 = 4;
                                                        f7 = 5.6E-45f;
                                                    } else {
                                                        n10 = 2;
                                                        f7 = 2.8E-45f;
                                                    }
                                                    n10 |= n14;
                                                } else {
                                                    n10 = n3;
                                                }
                                                n8 = n14 & 0x70;
                                                if (n8 != 0) break block11;
                                                n8 = n4 & 2;
                                                if (n8 != 0) break block12;
                                                f6 = f5;
                                                n15 = (int)(((j30_0)object).b(f5) ? 1 : 0);
                                                if (n15 == 0) break block13;
                                                n15 = 32;
                                                break block14;
                                            }
                                            f6 = f5;
                                        }
                                        n15 = 16;
                                    }
                                    n10 |= n15;
                                    break block15;
                                }
                                f6 = f5;
                            }
                            n15 = n14 & 0x380;
                            if (n15 != 0) break block16;
                            n15 = n4 & 4;
                            if (n15 != 0) break block17;
                            l3 = l2;
                            n7 = (int)(((j30_0)object).d(l2) ? 1 : 0);
                            if (n7 == 0) break block18;
                            n7 = 256;
                            break block19;
                        }
                        l3 = l2;
                    }
                    n7 = 128;
                }
                n10 |= n7;
                break block20;
            }
            l3 = l2;
        }
        n7 = n14 & 0x1C00;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(this) ? 1 : 0);
            n7 = n7 != 0 ? 2048 : 1024;
            n10 |= n7;
        }
        if ((n10 &= 0x16DB) == (n7 = 1170) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object2;
            ((j30_0)object).r0();
            n10 = n14 & 1;
            if (n10 != 0 && (n10 = (int)(((j30_0)object).c0() ? 1 : 0)) == 0) {
                ((j30_0)object).D();
                f7 = f6;
            } else {
                n10 = n4 & 2;
                f7 = n10 != 0 ? c : f6;
                n8 = n4 & 4;
                if (n8 != 0) {
                    long l4;
                    object2 = w60_0.a;
                    object2 = (OX)((j30_0)object).j((H30)object2);
                    l3 = l4 = ((OX)object2).a;
                }
            }
            ((j30_0)object).U();
            n8 = 1065353216;
            object2 = j.d(j.c(lP1, 1.0f), f7);
            fG2$a fG2$a = fg2_1.a;
            object2 = androidx.compose.foundation.a.b((LP1)object2, l3, fG2$a);
            n7 = 0;
            fG2$a = null;
            HA.a((LP1)object2, (b30_0)object, 0);
            f6 = f7;
        }
        CF2 cF2 = ((j30_0)object).X();
        if (cF2 != null) {
            yh3_2 yh3_22;
            object = yh3_22;
            n14 = n3;
            n7 = n4;
            yh3_22 = new yh3_2(this, lP1, f6, l3, n3, n4);
            cF2.d = yh3_22;
        }
    }
}

