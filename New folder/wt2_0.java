/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from wt2
 */
public final class wt2_0 {
    public static final vc3_1 a;

    static {
        vc3_1 vc3_12;
        wt2$a_0 wt2$a_0 = wt2$a_0.c;
        a = vc3_12 = new H30(wt2$a_0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final j90_0 a(vt2_1 var0, th_0 var1_1, f80_0 var2_2) {
        block7: {
            block6: {
                block5: {
                    var3_3 = var2_2 instanceof xt2_1;
                    if (!var3_3) ** GOTO lbl-1000
                    var4_4 = var2_2;
                    var4_4 = (xt2_1)var2_2;
                    var5_5 = var4_4.b;
                    var6_6 = -1 << -1;
                    var7_7 = var5_5 & var6_6;
                    if (var7_7 != 0) {
                        var4_4.b = var5_5 -= var6_6;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 = new h80_0((f80_0)var2_2);
                    }
                    var2_2 = var4_4.a;
                    var8_8 = j90_0.COROUTINE_SUSPENDED;
                    var6_6 = var4_4.b;
                    var7_7 = 1;
                    if (var6_6 == 0) break block5;
                    if (var6_6 != var7_7) {
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var2_2);
                    break block6;
                }
                vl2_2.b(var2_2);
                var2_2 = var0.e();
                var9_9 = var2_2.m;
                if (var9_9) {
                    var2_2 = go0.g((fo0)var0);
                    var0 = go0.f((fo0)var0).u;
                    var10_10 = wt2_0.a;
                    var0 = (yr_0)var0.a(var10_10);
                    var4_4.b = var7_7;
                    if ((var0 = wt2_0.b((sg2_0)var2_2, (yr_0)var0, (Function2)var1_1, var4_4)) == var8_8) {
                        return var8_8;
                    } else {
                        ** GOTO lbl35
                    }
                }
                break block7;
            }
            var0 = new KotlinNothingValueException();
            throw var0;
        }
        var1_1 = "establishTextInputSession called from an unattached node".toString();
        var0 = new IllegalArgumentException((String)var1_1);
        throw var0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final j90_0 b(sg2_0 var0, yr_0 var1_1, Function2 var2_2, f80_0 var3_3) {
        block8: {
            block10: {
                block9: {
                    block6: {
                        block7: {
                            var4_4 = var3_3 instanceof yt2_0;
                            if (!var4_4) ** GOTO lbl-1000
                            var5_5 = var3_3;
                            var5_5 = (yt2_0)var3_3;
                            var6_6 = var5_5.b;
                            var7_7 = -1 << -1;
                            var8_8 = var6_6 & var7_7;
                            if (var8_8 != 0) {
                                var5_5.b = var6_6 -= var7_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_5 = new h80_0((f80_0)var3_3);
                            }
                            var3_3 = var5_5.a;
                            var9_9 = j90_0.COROUTINE_SUSPENDED;
                            var7_7 = var5_5.b;
                            var8_8 = 2;
                            var10_10 = 1;
                            if (var7_7 == 0) break block6;
                            if (var7_7 == var10_10) break block7;
                            if (var7_7 != var8_8) {
                                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var0;
                            }
                            vl2_2.b(var3_3);
                            break block8;
                        }
                        vl2_2.b(var3_3);
                        break block9;
                    }
                    vl2_2.b(var3_3);
                    if (var1_1 == null) {
                        var5_5.b = var10_10;
                        if ((var0 = var0.q(var2_2, var5_5)) == var9_9) {
                            return var9_9;
                        } else {
                            ** GOTO lbl34
                        }
                    }
                    break block10;
                }
                var0 = new KotlinNothingValueException();
                throw var0;
            }
            var5_5.b = var8_8;
            if ((var0 = var1_1.a((sg2_0)var0, var2_2, var5_5)) == var9_9) {
                return var9_9;
            }
        }
        var0 = new KotlinNothingValueException();
        throw var0;
    }
}

