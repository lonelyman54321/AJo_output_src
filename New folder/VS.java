/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.selection.f;
import androidx.compose.material.MinimumInteractiveModifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;

public final class VS {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        float f5;
        a = 24;
        b = f5 = (float)2;
        c = 20;
        d = f5;
        e = f5;
    }

    /*
     * WARNING - void declaration
     */
    public static final void a(boolean bl2, Function1 function1, LP1 lP1, boolean n3, wr1_1 wr1_12, RS rS, b30_0 b30_02, int n4) {
        Object object;
        Object object2;
        Object object3;
        wr1_1 wr1_13;
        boolean bl3;
        int n7;
        int n8;
        boolean bl32 = bl2;
        Function1 function12 = function1;
        int n10 = n4;
        int n14 = -2118660998;
        Object object4 = b30_02.g(n14);
        int n15 = n4 & 6;
        int n16 = 4;
        if (n15 == 0) {
            n15 = (int)(((j30_0)object4).a(bl2) ? 1 : 0);
            n15 = n15 != 0 ? 4 : 2;
            n15 |= n10;
        } else {
            n15 = n4;
        }
        int n17 = n10 & 0x30;
        int n18 = 32;
        if (n17 == 0) {
            n17 = (int)(((j30_0)object4).x(function12) ? 1 : 0);
            n17 = n17 != 0 ? 32 : 16;
            n15 |= n17;
        }
        if ((n17 = n10 & 0x180) == 0) {
            void var17_20;
            boolean n84 = ((j30_0)object4).J(lP1);
            if (n84) {
                int n19 = 256;
            } else {
                int n20 = 128;
            }
            n15 |= var17_20;
        }
        n15 |= 0x6C00;
        int n21 = 0x30000 & n10;
        if (n21 == 0) {
            void var17_25;
            boolean bl4 = ((j30_0)object4).J(rS);
            if (bl4) {
                int n22 = 131072;
            } else {
                int n24 = 65536;
            }
            n15 |= var17_25;
        }
        if ((n8 = 0x12493 & n15) == (n7 = 74898) && (bl3 = ((j30_0)object4).h())) {
            ((j30_0)object4).D();
            n16 = n3;
            wr1_13 = wr1_12;
        } else {
            int n25;
            boolean bl5;
            ((j30_0)object4).r0();
            int n26 = n10 & 1;
            n7 = 1;
            int n27 = 0;
            if (n26 != 0 && !(bl5 = ((j30_0)object4).c0())) {
                ((j30_0)object4).D();
                n25 = n3;
                wr1_13 = wr1_12;
            } else {
                wr1_13 = null;
                n25 = 1;
            }
            ((j30_0)object4).U();
            object3 = bl32 ? ao3.On : ao3.Off;
            if (function12 != null) {
                b30$a$a b30$a$a;
                ((j30_0)object4).K(-1450357672);
                n27 = n15 & 0x70;
                if (n27 == n18) {
                    n18 = 1;
                } else {
                    n18 = 0;
                    object2 = null;
                }
                n27 = n15 & 0xE;
                if (n27 != n16) {
                    n7 = 0;
                    object = null;
                }
                n16 = n18 | n7;
                object2 = ((j30_0)object4).v();
                if (n16 != 0 || object2 == (b30$a$a = b30$a.a)) {
                    object2 = new ts_0(function12, bl32);
                    ((j30_0)object4).o(object2);
                }
                object2 = (Function0)object2;
                ((j30_0)object4).T(false);
                object = object2;
            } else {
                n16 = -1450319884;
                ((j30_0)object4).K(n16);
                ((j30_0)object4).T(false);
                n7 = 0;
                object = null;
            }
            VS.c((ao3)((Object)object3), (Function0)object, lP1, n25 != 0, wr1_13, rS, (b30_0)object4, n15 &= 0x7FF80);
            n16 = n25;
        }
        object3 = ((j30_0)object4).X();
        if (object3 != null) {
            object4 = object;
            bl32 = bl2;
            function12 = function1;
            object2 = rS;
            n10 = n4;
            object = new us_0(bl2, function1, lP1, n16 != 0, wr1_13, rS, n4);
            object3.d = object;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void b(boolean var0, ao3 var1_1, LP1 var2_2, RS var3_3, b30_0 var4_4, int var5_5) {
        block23: {
            block22: {
                var6_6 = var0;
                var7_7 = var1_1;
                var8_8 = var2_2;
                var9_9 = var3_3;
                var10_10 = var5_5;
                var11_11 = -2118895727;
                var12_12 = var4_4;
                var13_13 = var4_4.g(var11_11);
                var14_14 = var5_5 & 6;
                var15_15 = 2;
                if (var14_14 == 0) {
                    var14_14 = (int)var13_13.a(var0);
                    if (var14_14 != 0) {
                        var14_14 = 4;
                        var16_16 = 5.6E-45f;
                    } else {
                        var14_14 = 2;
                        var16_16 = 2.8E-45f;
                    }
                    var14_14 |= var10_10;
                } else {
                    var14_14 = var5_5;
                }
                var17_17 = var10_10 & 48;
                if (var17_17 == 0) {
                    var17_17 = (int)var13_13.J((Object)var7_7);
                    var17_17 = var17_17 != 0 ? 32 : 16;
                    var14_14 |= var17_17;
                }
                if ((var17_17 = var10_10 & 384) == 0) {
                    var17_17 = (int)var13_13.J(var8_8);
                    var17_17 = var17_17 != 0 ? 256 : 128;
                    var14_14 |= var17_17;
                }
                if ((var17_17 = var10_10 & 3072) == 0) {
                    var17_17 = (int)var13_13.J(var9_9);
                    var17_17 = var17_17 != 0 ? 2048 : 1024;
                    var14_14 |= var17_17;
                }
                if ((var17_17 = var14_14 & 1171) != (var18_18 = 1170) || (var17_17 = (int)var13_13.h()) == 0) break block22;
                var13_13.D();
                break block23;
            }
            var19_19 = 3;
            var14_14 = var14_14 >> var19_19 & 14;
            var20_20 = null;
            var21_21 = yr3.d((Object)var7_7, null, (b30_0)var13_13, var14_14, var15_15);
            var12_12 = FloatCompanionObject.INSTANCE;
            var22_22 = ya3_0.a;
            var23_23 = var21_21.a;
            var12_12 = (ao3)var23_23.a();
            var17_17 = -1798345588;
            var13_13.K(var17_17);
            var24_24 = VS$e.$EnumSwitchMapping$0;
            var14_14 = var12_12.ordinal();
            var14_14 = var24_24[var14_14];
            var25_25 = 1;
            var26_26 = 0.0f;
            if (var14_14 == var25_25) ** GOTO lbl-1000
            if (var14_14 != var15_15) {
                ** if (var14_14 != var19_19) goto lbl-1000
            }
            ** GOTO lbl63
lbl-1000:
            // 2 sources

            {
                var14_14 = 1065353216;
                var16_16 = 1.0f;
                ** GOTO lbl66
            }
lbl-1000:
            // 1 sources

            {
                var13_13 = new NoWhenBranchMatchedException();
                throw var13_13;
lbl63:
                // 1 sources

                var14_14 = 0;
                var16_16 = 0.0f;
                var12_12 = null;
            }
lbl66:
            // 2 sources

            var27_27 = null;
            var13_13.T(false);
            var28_28 = Float.valueOf(var16_16);
            var29_29 = var21_21.d;
            var12_12 = (ao3)var29_29.getValue();
            var13_13.K(var17_17);
            var14_14 = var12_12.ordinal();
            var14_14 = var24_24[var14_14];
            if (var14_14 == var25_25) ** GOTO lbl-1000
            if (var14_14 != var15_15) {
                ** if (var14_14 != var19_19) goto lbl-1000
            }
            ** GOTO lbl83
lbl-1000:
            // 2 sources

            {
                var14_14 = 1065353216;
                var16_16 = 1.0f;
                ** GOTO lbl86
            }
lbl-1000:
            // 1 sources

            {
                var13_13 = new NoWhenBranchMatchedException();
                throw var13_13;
lbl83:
                // 1 sources

                var14_14 = 0;
                var16_16 = 0.0f;
                var12_12 = null;
            }
lbl86:
            // 2 sources

            var13_13.T(false);
            var30_30 = Float.valueOf(var16_16);
            var12_12 = var21_21.f();
            var20_20 = 0;
            var27_27 = var12_12 = VS$d.c.invoke(var12_12, var13_13, var20_20);
            var27_27 = (un0_0)var12_12;
            var12_12 = var21_21;
            var20_20 = var28_28;
            var28_28 = var30_30;
            var30_30 = var29_29;
            var29_29 = var27_27;
            var27_27 = var22_22;
            var19_19 = 1;
            var31_31 = var13_13;
            var32_32 = var23_23;
            var33_33 = 0;
            var23_23 = yr3.b((gr3)var21_21, var20_20, var28_28, (un0_0)var29_29, var22_22, (b30_0)var13_13, 0);
            var12_12 = (ao3)var32_32.a();
            var17_17 = -2098942571;
            var13_13.K(var17_17);
            var14_14 = var12_12.ordinal();
            var14_14 = var24_24[var14_14];
            if (var14_14 != var19_19 && var14_14 != var15_15) {
                var18_18 = 3;
                if (var14_14 == var18_18) {
                    var14_14 = 1065353216;
                    var16_16 = 1.0f;
lbl113:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_13 = new NoWhenBranchMatchedException();
                throw var13_13;
            }
            var14_14 = 0;
            var16_16 = 0.0f;
            var12_12 = null;
            ** while (true)
            var25_25 = 0;
            var31_31 = null;
            var13_13.T(false);
            var28_28 = Float.valueOf(var16_16);
            var12_12 = (ao3)var30_30.getValue();
            var13_13.K(var17_17);
            var14_14 = var12_12.ordinal();
            var14_14 = var24_24[var14_14];
            if (var14_14 != var19_19 && var14_14 != var15_15) {
                var17_17 = 3;
                if (var14_14 == var17_17) {
                    var26_26 = 1.0f;
                } else {
                    var13_13 = new NoWhenBranchMatchedException();
                    throw var13_13;
                }
            }
            var13_13.T(false);
            var29_29 = Float.valueOf(var26_26);
            var12_12 = var21_21.f();
            var20_20 = 0;
            var27_27 = var12_12 = VS$c.c.invoke(var12_12, var13_13, var20_20);
            var27_27 = (un0_0)var12_12;
            var12_12 = var21_21;
            var20_20 = var28_28;
            var28_28 = var29_29;
            var29_29 = var27_27;
            var27_27 = var22_22;
            var19_19 = 0;
            var31_31 = var13_13;
            var21_21 = var23_23;
            var33_33 = 0;
            var23_23 = null;
            var12_12 = yr3.b((gr3)var12_12, var20_20, var28_28, (un0_0)var29_29, var22_22, (b30_0)var13_13, 0);
            var20_20 = var13_13.v();
            var28_28 = b30$a.a;
            if (var20_20 == var28_28) {
                var20_20 = new qs_1(0);
                var13_13.o(var20_20);
            }
            var34_34 = var20_20;
            var34_34 = (qs_1)var20_20;
            var20_20 = var9_9.c(var7_7, (b30_0)var13_13);
            var29_29 = var9_9.b(var6_6, var7_7, (b30_0)var13_13);
            var27_27 = var9_9.a(var6_6, var7_7, (b30_0)var13_13);
            var31_31 = Nc$a.e;
            var31_31 = j.f(j.n(var8_8, (Gx)var31_31, var15_15));
            var33_33 = var13_13.J(var29_29);
            var15_15 = (int)var13_13.J(var27_27);
            var33_33 |= var15_15;
            var15_15 = (int)var13_13.J(var20_20);
            var33_33 |= var15_15;
            var15_15 = (int)var13_13.J(var21_21);
            var33_33 |= var15_15;
            var15_15 = (int)var13_13.J(var12_12);
            var35_35 = var13_13.v();
            if ((var33_33 |= var15_15) != 0 || var35_35 == var28_28) {
                var35_35 = new VS$a((qs_1)var34_34, (ib3_0)var29_29, (ib3_0)var27_27, (ib3_0)var20_20, (gr3$d)var21_21, (gr3$d)var12_12);
                var13_13.o(var35_35);
            }
            var35_35 = (Function1)var35_35;
            AL.a((LP1)var31_31, (Function1)var35_35, (b30_0)var13_13, 0);
        }
        var12_12 = var13_13.X();
        if (var12_12 != null) {
            var13_13 = var20_20;
            var6_6 = var0;
            var7_7 = var1_1;
            var8_8 = var2_2;
            var9_9 = var3_3;
            var10_10 = var5_5;
            var20_20 = new VS$b(var0, var1_1, var2_2, var3_3, var5_5);
            var12_12.d = var20_20;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void c(ao3 ao32, Function0 function0, LP1 lP1, boolean bl2, wr1_1 wr1_12, RS rS, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = function0;
        LP1 lP12 = lP1;
        int n7 = n3;
        int n8 = 1;
        float f5 = 4.7540195E34f;
        Object object6 = b30_02.g(2031255194);
        int n10 = n3 & 6;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object6).J((Object)ao32) ? 1 : 0);
            if (n10 != 0) {
                n10 = 4;
                f5 = 5.6E-45f;
            } else {
                n10 = 2;
                f5 = 2.8E-45f;
            }
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n7 & 0x30;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object6).x(object5) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n14 = n7 & 0x180) == 0) {
            n14 = (int)(((j30_0)object6).J(lP12) ? 1 : 0);
            n14 = n14 != 0 ? 256 : 128;
            n10 |= n14;
        }
        if ((n14 = n7 & 0xC00) == 0) {
            n14 = (int)(((j30_0)object6).a(bl2) ? 1 : 0);
            n14 = n14 != 0 ? 2048 : 1024;
            n10 |= n14;
        }
        if ((n14 = n7 & 0x6000) == 0) {
            void var16_19;
            boolean n4 = ((j30_0)object6).J(wr1_12);
            if (n4) {
                int n15 = 16384;
            } else {
                int n16 = 8192;
            }
            n10 |= var16_19;
        }
        int n17 = 0x30000 & n7;
        Object object7 = rS;
        if (n17 == 0) {
            void var16_24;
            boolean bl3 = ((j30_0)object6).J(rS);
            if (bl3) {
                int n18 = 131072;
            } else {
                int n19 = 65536;
            }
            n10 |= var16_24;
        }
        int n20 = n10;
        f5 = 1.04956E-40f;
        int n21 = 74898;
        if ((n10 &= 0x12493) == n21 && (n10 = (int)(((j30_0)object6).h() ? 1 : 0)) != 0) {
            ((j30_0)object6).D();
            object7 = object6;
        } else {
            LP1 lP13;
            Object object8;
            int n22;
            ((j30_0)object6).r0();
            n10 = n7 & 1;
            LP1 lP14 = LP1$a.b;
            if (n10 != 0 && (n10 = (int)(((j30_0)object6).c0() ? 1 : 0)) == 0) {
                ((j30_0)object6).D();
            }
            ((j30_0)object6).U();
            n10 = 0;
            f5 = 0.0f;
            object4 = null;
            if (object5 != null) {
                ((j30_0)object6).K(1923882473);
                float f6 = a;
                long l2 = 0L;
                boolean bl4 = false;
                n22 = 54;
                int n24 = 4;
                object8 = object6;
                object3 = vp2_0.a(false, f6, l2, (b30_0)object6, n22, n24);
                object2 = new CP2(n8);
                object = ao32;
                lP13 = null;
                object4 = wr1_12;
                object7 = object6;
                object6 = function0;
                object = f.a(ao32, wr1_12, (Lg1)object3, bl2, (CP2)object2, function0);
                ((j30_0)object8).T(false);
            } else {
                object7 = object6;
                lP13 = null;
                n8 = 1924298803;
                ((j30_0)object6).K(n8);
                ((j30_0)object6).T(false);
                object = lP14;
            }
            if (object5 != null) {
                object4 = lj1.a;
                lP14 = MinimumInteractiveModifier.b;
            }
            object4 = lP14;
            object4 = lP12.then(lP14);
            object = object4.then((LP1)object);
            f5 = b;
            lP13 = h.e((LP1)object, f5);
            n8 = n20 >> 9 & 0xE;
            n10 = n20 << 3 & 0x70;
            n8 |= n10;
            n10 = n20 >> 6 & 0x1C00;
            n22 = n8 | n10;
            boolean bl5 = bl2;
            object2 = ao32;
            object8 = object7;
            VS.b(bl2, ao32, lP13, rS, (b30_0)object7, n22);
        }
        object3 = ((j30_0)object7).X();
        if (object3 != null) {
            object = object2;
            object4 = ao32;
            object6 = wr1_12;
            object5 = rS;
            object2 = new ws_0(ao32, function0, lP1, bl2, wr1_12, rS, n3);
            ((CF2)object3).d = object2;
        }
    }
}

