/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Paint
 */
import android.graphics.Matrix;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

public final class Y01 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(Kt0 var0, W01 var1_1) {
        var2_2 = var1_1;
        var3_3 = var0.M0().a();
        var4_4 = var0.M0().b;
        var5_5 = var1_1.r;
        if (var5_5) ** GOTO lbl166
        var1_1.a();
        var6_6 = var1_1.a;
        var7_7 /* !! */  = var6_6.p();
        if (var7_7 /* !! */  == 0) {
            var1_1.e();
        }
lbl12:
        // 4 sources

        while (true) {
            var8_8 = var6_6.I();
            var9_9 = 1;
            var10_10 = 1.4E-45f;
            var11_11 = 0;
            var12_12 = 0.0f;
            var13_13 = null;
            cfr_temp_0 = var8_8 - 0.0f;
            var7_7 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var7_7 /* !! */  > 0) {
                var7_7 /* !! */  = 1;
                var8_8 = 1.4E-45f;
            } else {
                var7_7 /* !! */  = 0;
                var8_8 = 0.0f;
            }
            if (var7_7 /* !! */  != 0) {
                var3_3.j();
            }
            if (var15_15 = (var14_14 = (var13_13 = Nf.a(var3_3)).isHardwareAccelerated()) ^ true) {
                var13_13.save();
                var16_16 = var2_2.s;
                var18_17 = 32;
                var19_18 = (int)(var16_16 >> var18_17);
                var20_19 = var19_18;
                var21_20 = 0xFFFFFFFFL;
                var23_21 = (int)(var16_16 &= var21_20);
                var24_22 = var23_21;
                var25_23 = var2_2.t;
                var27_24 = var13_13;
                var28_25 = var25_23 >> var18_17;
                var11_11 = (int)var28_25;
                var10_10 = (float)var11_11 + var20_19;
                var30_26 = var25_23 & var21_20;
                var12_12 = (int)var30_26;
                var32_27 = var24_22 + var12_12;
                var12_12 = var6_6.getAlpha();
                var33_28 = var6_6.y();
                var34_29 = 1.0f;
                var14_14 = (int)(var12_12 == var34_29 ? 0 : (var12_12 < var34_29 ? -1 : 1));
                if (var14_14 >= 0) {
                    var34_29 = 4.2E-45f;
                    var14_14 = (int)zy_0.a(var33_28, 3);
                    if (var14_14 != 0) {
                        var14_14 = var6_6.a();
                        var18_17 = 1;
                        if ((var14_14 = (int)x30_0.a(var14_14, var18_17)) == 0) {
                            var13_13.save();
                            var35_30 = var24_22;
                            var10_10 = var20_19;
lbl62:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                    }
                }
                if ((var36_31 = var2_2.o) == null) {
                    var2_2.o = var36_31 = fi.a();
                }
                var36_31.b(var12_12);
                var36_31.d(var33_28);
                var36_31.l(null);
                var13_13 = var36_31.a;
                var36_31 = var27_24;
                var35_30 = var24_22;
                var24_22 = var20_19;
                var37_32 = var10_10;
                var10_10 = var20_19;
                var27_24.saveLayer(var20_19, var35_30, var37_32, var32_27, (Paint)var13_13);
                ** continue;
                var13_13 = var27_24;
                var27_24.translate(var10_10, var35_30);
                var38_33 = var6_6.x();
                var27_24.concat((Matrix)var38_33);
            }
            if ((var18_17 = var15_15 != false && (var9_9 = var2_2.v) != 0 ? 1 : 0) != 0) {
                var3_3.p();
                var38_33 = var1_1.c();
                var33_28 = var38_33 instanceof Cg2$b;
                if (var33_28 != 0) {
                    var38_33 = var38_33.a();
                    var33_28 = 1;
                    var35_30 = 1.4E-45f;
                    var3_3.d((aG2)var38_33, var33_28);
                } else {
                    var33_28 = var38_33 instanceof Cg2$c;
                    if (var33_28 != 0) {
                        var39_34 = var2_2.m;
                        if (var39_34 != null) {
                            var39_34.rewind();
                        } else {
                            var39_34 = ni.a();
                            var2_2.m = var39_34;
                        }
                        var38_33 = ((Cg2$c)var38_33).a;
                        fn2.a((gn2)var39_34, (NP2)var38_33);
                        var14_14 = 1;
                        var34_29 = 1.4E-45f;
                        var3_3.o((gn2)var39_34, var14_14);
                    } else {
                        var14_14 = 1;
                        var34_29 = 1.4E-45f;
                        var33_28 = var38_33 instanceof Cg2$a;
                        if (var33_28 != 0) {
                            var38_33 = ((Cg2$a)var38_33).a;
                            var3_3.o((gn2)var38_33, var14_14);
                        }
                    }
                }
            }
            if (var4_4 != null) {
                var4_4 = var4_4.q;
                var9_9 = var4_4.e;
                if (var9_9 != 0) {
                    var38_33 = var4_4.c;
                    if (var38_33 != null) {
                        Intrinsics.checkNotNull(var38_33);
                        var38_33.d(var2_2);
                    } else {
                        var38_33 = var4_4.a;
                        if (var38_33 != null) {
                            var38_33 = gt2_1.a();
                            var39_34 = var4_4.a;
                            Intrinsics.checkNotNull(var39_34);
                            var38_33.d(var39_34);
                            var38_33.d(var2_2);
                            var4_4.c = var38_33;
                            var4_4.a = null;
                        } else {
                            var4_4.a = var2_2;
                        }
                    }
                    var38_33 = var4_4.d;
                    if (var38_33 != null) {
                        Intrinsics.checkNotNull(var38_33);
                        var40_35 = var38_33.j(var2_2);
                        var9_9 = 1;
                        var10_10 = 1.4E-45f;
                        var33_28 = var40_35 ^ 1;
                    } else {
                        var9_9 = 1;
                        var10_10 = 1.4E-45f;
                        var39_34 = var4_4.b;
                        if (var39_34 != var2_2) {
                            var33_28 = 1;
                            var35_30 = 1.4E-45f;
                        } else {
                            var4_4.b = null;
                            var33_28 = 0;
                            var35_30 = 0.0f;
                            var39_34 = null;
                        }
                    }
                    if (var33_28 != 0) {
                        var2_2.p = var40_35 = var2_2.p + var9_9;
                    }
                } else {
                    var2_2 = new IllegalArgumentException("Only add dependencies during a tracking");
                    throw var2_2;
                }
            }
            var6_6.B(var3_3);
            if (var18_17 != 0) {
                var3_3.h();
            }
            if (var7_7 /* !! */  != 0) {
                var3_3.q();
            }
            if (var15_15) {
                var13_13.restore();
            }
lbl166:
            // 4 sources

            return;
        }
        catch (Throwable v0) {
            ** continue;
        }
    }
}

