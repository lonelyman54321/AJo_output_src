/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class T80
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ ql3_0 d;
    public final /* synthetic */ i72 e;

    public T80(Vt1 vt1, ql3_0 ql3_02, i72 i722) {
        this.c = vt1;
        this.d = ql3_02;
        this.e = i722;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object var1_1) {
        block23: {
            block22: {
                var1_1 = (Kt0)var1_1;
                var2_2 = this.c;
                var3_3 = var2_2.d();
                if (var3_3 == null) return Unit.a;
                var1_1 = var1_1.M0().a();
                var4_5 = (mm3)var2_2.x.getValue();
                var5_6 = var4_5.a;
                var7_7 = (mm3)var2_2.y.getValue();
                var8_8 = var7_7.a;
                var10_9 = var2_2.w;
                var12_10 = mm3.b(var5_6);
                var2_2 = var2_2.v;
                var13_11 = this.e;
                var3_3 = var3_3.a;
                if (!var12_10) {
                    var2_2.f(var10_9);
                    var14_12 = mm3.e(var5_6);
                    var14_12 = var13_11.b(var14_12);
                    var15_13 = mm3.d(var5_6);
                    var15_13 = var13_11.b(var15_13);
                    if (var14_12 != var15_13) {
                        var4_5 = var3_3.k(var14_12, var15_13);
                        var1_1.m((gn2)var4_5, (fm2)var2_2);
                    }
                } else {
                    var15_13 = mm3.b(var8_8);
                    if (var15_13 == 0) {
                        var4_5 = var3_3.a.b;
                        var5_6 = var4_5.b();
                        var16_14 = new OX(var5_6);
                        var17_15 = 16;
                        cfr_temp_0 = var5_6 - var17_15;
                        var19_16 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var19_16 /* !! */  == false) {
                            var20_17 = 0;
                            var21_18 = 0.0f;
                            var16_14 = null;
                        }
                        var5_6 = var16_14 != null ? var16_14.a : OX.b;
                        var21_18 = OX.d(var5_6);
                        var22_19 = 0.2f;
                        var5_6 = OX.b(var5_6, var21_18 *= var22_19);
                        var2_2.f(var5_6);
                        var15_13 = mm3.e(var8_8);
                        var15_13 = var13_11.b(var15_13);
                        var23_20 = mm3.d(var8_8);
                        var23_20 = var13_11.b(var23_20);
                        if (var15_13 != var23_20) {
                            var4_5 = var3_3.k(var15_13, var23_20);
                            var1_1.m((gn2)var4_5, (fm2)var2_2);
                        }
                    } else {
                        var4_5 = this.d;
                        var24_22 = var4_5.b;
                        var23_21 = mm3.b(var24_22);
                        if (!var23_21) {
                            var2_2.f(var10_9);
                            var5_6 = var4_5.b;
                            var14_12 = mm3.e(var5_6);
                            var14_12 = var13_11.b(var14_12);
                            var15_13 = mm3.d(var5_6);
                            var15_13 = var13_11.b(var15_13);
                            if (var14_12 != var15_13) {
                                var4_5 = var3_3.k(var14_12, var15_13);
                                var1_1.m((gn2)var4_5, (fm2)var2_2);
                            }
                        }
                    }
                }
                var26_23 = var3_3.d();
                var15_13 = 1;
                var27_24 = 1.4E-45f;
                var28_25 = var3_3.a;
                if (var26_23 == 0) ** GOTO lbl-1000
                var26_23 = var28_25.f;
                var14_12 = 3;
                var29_26 = 4.2E-45f;
                if ((var26_23 = (int)km3.b(var26_23, var14_12)) == 0) {
                    var26_23 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var26_23 = 0;
                    var2_2 = null;
                }
                if (var26_23 != 0) {
                    var30_27 = var3_3.c;
                    var14_12 = (int)(var30_27 >> 32);
                    var29_26 = var14_12;
                    var17_15 = 0xFFFFFFFFL;
                    var20_17 = (int)(var30_27 &= var17_15);
                    var32_28 = var20_17;
                    var10_9 = 0L;
                    var8_8 = bo1_1.a(var29_26, var32_28);
                    var7_7 = cg2_0.d(var10_9, var8_8);
                    var1_1.p();
                    var1_1.d((aG2)var7_7, var15_13);
                }
                var4_5 = var28_25.b.a;
                var28_25 = var4_5.m;
                var7_7 = var4_5.a;
                if (var28_25 == null) {
                    var28_25 = Jj3.b;
                }
                var33_29 = var28_25;
                var28_25 = var4_5.n;
                if (var28_25 == null) {
                    var28_25 = b13_0.d;
                }
                var16_14 = var28_25;
                var4_5 = var4_5.p;
                if (var4_5 == null) {
                    var4_5 = rM0.a;
                }
                var34_30 = var4_5;
                try {
                    var35_31 = var7_7.d();
                    var4_5 = sl3$a.a;
                    if (var35_31 != null) {
                        if (var7_7 != var4_5) {
                            var36_32 = var27_24 = var7_7.getAlpha();
                        } else {
                            var15_13 = 1065353216;
                            var27_24 = 1.0f;
                            var36_32 = 1.0f;
                        }
                        var4_5 = var3_3.b;
                        var28_25 = var1_1;
                        var7_7 = var35_31;
                        var32_28 = var36_32;
                        RQ1.h((RQ1)var4_5, (iL)var1_1, var35_31, var36_32, (b13_0)var16_14, (Jj3)var33_29, (Qt0)var34_30);
                        break block22;
                    }
                    var5_6 = var7_7 != var4_5 ? var7_7.a() : OX.b;
                }
                catch (Throwable var3_4) {
                    break block23;
                }
                var8_8 = var5_6;
                var4_5 = var3_3.b;
                var28_25 = var1_1;
                RQ1.g((RQ1)var4_5, (iL)var1_1, var5_6, (b13_0)var16_14, (Jj3)var33_29, (Qt0)var34_30);
            }
            if (var26_23 == 0) return Unit.a;
            var1_1.h();
            return Unit.a;
        }
        if (var26_23 == 0) throw var3_4;
        var1_1.h();
        throw var3_4;
    }
}

