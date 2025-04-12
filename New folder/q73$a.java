/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class q73$a {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List a(q73 var0, int var1_1, q73 var2_2, boolean var3_3, boolean var4_4, boolean var5_5) {
        var6_6 = var0;
        var7_7 = var1_1;
        var8_8 = var2_2;
        var9_9 = var0.q(var1_1);
        var10_10 = var1_1 + var9_9;
        var11_11 = var0.b;
        var12_12 = var0.p(var1_1);
        var13_13 = var0.f(var11_11, var12_12);
        var14_14 = var0.b;
        var15_15 = var0.p(var10_10);
        var12_12 = var0.f(var14_14, var15_15);
        var15_15 = var12_12 - var13_13;
        var16_16 = 1;
        if (var1_1 < 0) ** GOTO lbl-1000
        var17_17 = var0.b;
        var18_18 = var0.p(var1_1) * 5 + var16_16;
        var19_19 = var17_17[var18_18];
        var18_18 = 0xC000000;
        if ((var19_19 &= var18_18) != 0) {
            var19_19 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var19_19 = 0;
            var17_17 = null;
        }
        var8_8.s(var9_9);
        var18_18 = var8_8.t;
        var8_8.t(var15_15, var18_18);
        var18_18 = var6_6.g;
        if (var18_18 < var10_10) {
            var6_6.w(var10_10);
        }
        if ((var18_18 = var6_6.k) < var12_12) {
            var6_6.x(var12_12, var10_10);
        }
        var20_20 = var8_8.b;
        var21_21 = var8_8.t;
        var22_22 /* !! */  = var6_6.b;
        var23_23 = var21_21 * 5;
        var24_24 = var7_7 * 5;
        var25_25 = var10_10 * 5;
        rp_1.f(var23_23, var24_24, var25_25, var22_22 /* !! */ , var20_20);
        var26_26 = var8_8.c;
        var27_27 = var8_8.i;
        var28_28 /* !! */  = var6_6.c;
        rp_1.i(var28_28 /* !! */ , var27_27, (Object[])var26_26, var13_13, var12_12);
        var12_12 = var8_8.v;
        var20_20[var23_23 += 2] = var12_12;
        var23_23 = var21_21 - var7_7;
        var24_24 = var21_21 + var9_9;
        var29_29 = var8_8.f(var20_20, var21_21);
        var29_29 = var27_27 - var29_29;
        var30_30 = var8_8.m;
        var16_16 = var8_8.l;
        var25_25 = ((Object[])var26_26).length;
        var31_31 = var19_19;
        var19_19 = var30_30;
        var30_30 = var27_27;
        for (var27_27 = var21_21; var27_27 < var24_24; ++var27_27) {
            if (var27_27 != var21_21) {
                var32_32 = var27_27 * 5 + 2;
                var20_20[var32_32] = var33_33 = var20_20[var32_32] + var23_23;
            }
            var32_32 = var8_8.f(var20_20, var27_27);
            var33_33 = var24_24;
            var24_24 = var32_32 + var29_29;
            if (var19_19 < var27_27) {
                var32_32 = var21_21;
                var21_21 = 0;
                var34_34 = null;
            } else {
                var32_32 = var21_21;
                var21_21 = var8_8.k;
            }
            var21_21 = q73.h(var24_24, var21_21, var16_16, var25_25);
            var24_24 = var27_27 * 5 + 4;
            var20_20[var24_24] = var21_21;
            if (var27_27 == var19_19) {
                ++var19_19;
            }
            var21_21 = var32_32;
            var24_24 = var33_33;
        }
        var32_32 = var21_21;
        var33_33 = var24_24;
        var8_8.m = var19_19;
        var35_35 = var6_6.d;
        var25_25 = var0.n();
        var16_16 = n73.i((ArrayList)var35_35, var7_7, var25_25);
        if (var16_16 < (var10_10 = n73.i((ArrayList)(var26_26 = var6_6.d), var10_10, var19_19 = var0.n()))) {
            var26_26 = var6_6.d;
            var17_17 = new ArrayList;
            var21_21 = var10_10 - var16_16;
            var17_17(var21_21);
            for (var21_21 = var16_16; var21_21 < var10_10; ++var21_21) {
                var22_22 /* !! */  = (int[])((Ae)var26_26.get(var21_21));
                var22_22 /* !! */ .a = var24_24 = var22_22 /* !! */ .a + var23_23;
                var17_17.add(var22_22 /* !! */ );
            }
            var34_34 = var8_8.d;
            var27_27 = var8_8.t;
            var23_23 = var2_2.n();
            var21_21 = n73.i(var34_34, var27_27, var23_23);
            var22_22 /* !! */  = (int[])var8_8.d;
            var22_22 /* !! */ .addAll(var21_21, var17_17);
            var36_36 = var26_26.subList(var16_16, var10_10);
            var36_36.clear();
        } else {
            var17_17 = mz0_2.a;
        }
        var36_36 = var17_17;
        var36_36 = (Collection)var17_17;
        var10_10 = (int)var36_36.isEmpty();
        var16_16 = 1;
        if ((var10_10 ^= var16_16) != 0) {
            var36_36 = var6_6.e;
            var35_35 = var8_8.e;
            if (var36_36 != null && var35_35 != null) {
                var25_25 = var17_17.size();
                var34_34 = null;
                for (var21_21 = 0; var21_21 < var25_25; ++var21_21) {
                    var22_22 /* !! */  = (int[])((Ae)var17_17.get(var21_21));
                    var37_37 = (Q11)var36_36.get(var22_22 /* !! */ );
                    if (var37_37 == null) continue;
                    var36_36.remove(var22_22 /* !! */ );
                    var35_35.put(var22_22 /* !! */ , var37_37);
                }
            }
        }
        var10_10 = var8_8.v;
        var35_35 = var8_8.K(var12_12);
        if (var35_35 != null) {
            block33: {
                ++var10_10;
                var25_25 = var8_8.t;
                var27_27 = -1;
                while (var10_10 < var25_25) {
                    var22_22 /* !! */  = var8_8.b;
                    var38_38 = n73.e(var22_22 /* !! */ , var10_10) + var10_10;
                    var27_27 = var10_10;
                    var10_10 = var38_38;
                }
                var36_36 = var35_35.a;
                if (var36_36 == null) {
                    var35_35.a = var36_36 = new ArrayList();
                }
                if (var27_27 >= 0 && (var35_35 = var8_8.N(var27_27)) != null) {
                    var27_27 = var36_36.size();
                    var37_37 = null;
                    for (var23_23 = 0; var23_23 < var27_27; ++var23_23) {
                        var28_28 /* !! */  = var36_36.get(var23_23);
                        var29_29 = (int)Intrinsics.areEqual(var28_28 /* !! */ , var35_35);
                        if (var29_29 == 0 && ((var21_21 = var28_28 /* !! */  instanceof Q11) == 0 || (var21_21 = (int)(var28_28 /* !! */  = (Q11)var28_28 /* !! */ ).a((Ae)var35_35)) == 0)) {
                            continue;
                        }
                        var21_21 = var23_23;
                        break block33;
                    }
                    var21_21 = -1;
                } else {
                    var21_21 = 0;
                    var34_34 = null;
                }
            }
            var35_35 = var8_8.b(var25_25);
            var36_36.add(var21_21, var35_35);
        }
        var36_36 = var6_6.b;
        var10_10 = var6_6.A((int[])var36_36, var7_7);
        if (!var5_5) {
            var9_9 = 1;
            var25_25 = 0;
            var26_26 = null;
        } else if (var3_3) {
            if (var10_10 >= 0) {
                var25_25 = 1;
            } else {
                var25_25 = 0;
                var26_26 = null;
            }
            if (var25_25 != 0) {
                var0.L();
                var9_9 = var6_6.t;
                var6_6.a(var10_10 -= var9_9);
                var0.L();
            }
            var9_9 = var6_6.t;
            var6_6.a(var7_7 -= var9_9);
            var7_7 = (int)var0.D();
            if (var25_25 != 0) {
                var0.H();
                var0.i();
                var0.H();
                var0.i();
            }
            var25_25 = var7_7;
            var9_9 = 1;
        } else {
            var25_25 = (int)var6_6.E(var7_7, var9_9);
            var9_9 = 1;
            var6_6.F(var13_13, var15_15, var7_7 -= var9_9);
        }
        var39_39 = var25_25 ^ 1;
        if (var39_39 != 0) {
            var39_39 = var8_8.o;
            var7_7 = var32_32;
            var10_10 = (int)n73.h(var20_20, var32_32);
            var16_16 = var10_10 != 0 ? 1 : n73.j(var20_20, var32_32);
            var8_8.o = var39_39 += var16_16;
            if (var4_4) {
                var21_21 = var33_33;
                var8_8.t = var33_33;
                var8_8.i = var27_27 = var30_30 + var15_15;
            }
            if (var31_31 != 0) {
                var8_8.Q(var12_12);
            }
            return var17_17;
        }
        p30_0.c("Unexpectedly removed anchors");
        throw null;
    }
}

