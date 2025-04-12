/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.f;

/*
 * Renamed from r83
 */
public final class r83_0 {
    public static final float a = 400;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(kU2$b$a var0, float var1_1, il_0 var2_2, vi0_0 var3_3, j83$b var4_4, f80_0 var5_5) {
        block10: {
            block9: {
                block7: {
                    block8: {
                        var6_6 = var5_5 instanceof n83;
                        if (!var6_6) ** GOTO lbl-1000
                        var7_7 = var5_5;
                        var7_7 = (n83)var5_5;
                        var8_8 = var7_7.e;
                        var9_9 = -1 << -1;
                        var10_10 = -0.0f;
                        var11_11 = var8_8 & var9_9;
                        if (var11_11 != 0) {
                            var7_7.e = var8_8 -= var9_9;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var7_7 = new h80_0((f80_0)var5_5);
                        }
                        var5_5 = var7_7.d;
                        var12_12 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var9_9 = var7_7.e;
                        var11_11 = 1;
                        if (var9_9 == 0) break block7;
                        if (var9_9 != var11_11) break block8;
                        var1_1 = var7_7.a;
                        var0 = var7_7.c;
                        var2_2 = var7_7.b;
                        vl2_2.b(var5_5);
                        break block9;
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var5_5);
                var5_5 = new Ref$FloatRef();
                var13_13 = (Number)var2_2.d();
                var10_10 = var13_13.floatValue();
                var14_14 = null;
                cfr_temp_0 = var10_10 - 0.0f;
                var9_9 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                if (var9_9 == 0) {
                    var9_9 = 1;
                    var10_10 = 1.4E-45f;
                } else {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var13_13 = null;
                }
                var9_9 ^= var11_11;
                var14_14 = new o83(var1_1, (Ref$FloatRef)var5_5, (kU2$b$a)var0, var4_4);
                var7_7.b = var2_2;
                var7_7.c = var5_5;
                var7_7.a = var1_1;
                var7_7.e = var11_11;
                var0 = mg3_0.d(var2_2, var3_3, (boolean)var9_9, var14_14, var7_7);
                if (var0 == var12_12 /* !! */ ) break block10;
                var0 = var5_5;
            }
            var15_15 = var0.element;
            var0 = new Float(var1_1 -= var15_15);
            var12_12 /* !! */  = new rl_1((Float)var0, var2_2);
        }
        return var12_12 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(kU2$b$a var0, float var1_1, float var2_2, il_0 var3_3, Gl var4_4, Function1 var5_5, f80_0 var6_6) {
        block11: {
            block10: {
                block8: {
                    block9: {
                        var7_7 = var6_6 instanceof p83;
                        if (var7_7) {
                            var8_8 /* !! */  = var6_6;
                            var8_8 /* !! */  = (p83)var6_6;
                            var9_9 = var8_8 /* !! */ .f;
                            var10_10 = -1 << -1;
                            var11_11 = var9_9 & var10_10;
                            if (var11_11 != 0) {
                                var8_8 /* !! */ .f = var9_9 -= var10_10;
lbl10:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                        }
                        var8_8 /* !! */  = new h80_0((f80_0)var6_6);
                        ** while (true)
                        var12_12 = var8_8 /* !! */ ;
                        var6_6 = var8_8 /* !! */ .e;
                        var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var9_9 = var12_12.f;
                        var10_10 = 1;
                        if (var9_9 == 0) break block8;
                        if (var9_9 != var10_10) break block9;
                        var13_13 = var12_12.b;
                        var1_1 = var12_12.a;
                        var14_14 = var12_12.d;
                        var3_3 = var12_12.c;
                        vl2_2.b(var6_6);
                        break block10;
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var6_6);
                var6_6 = new Ref$FloatRef();
                var15_15 = ((Number)var3_3.d()).floatValue();
                var16_16 = new Float(var1_1);
                var17_17 = (Number)var3_3.d();
                var18_18 = var17_17.floatValue();
                cfr_temp_0 = var18_18 - 0.0f;
                var9_9 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                if (var9_9 == 0) {
                    var9_9 = 1;
                    var18_18 = 1.4E-45f;
                } else {
                    var9_9 = 0;
                    var18_18 = 0.0f;
                    var17_17 = null;
                }
                var19_19 = var9_9 ^ 1;
                var20_20 = new q83_0(var2_2, (Ref$FloatRef)var6_6, (kU2$b$a)var0, var5_5);
                var12_12.c = var3_3;
                var12_12.d = var6_6;
                var12_12.a = var1_1;
                var12_12.b = var15_15;
                var12_12.f = var10_10;
                var17_17 = var3_3;
                var21_21 = var16_16;
                var16_16 = var4_4;
                var0 = mg3_0.e(var3_3, var21_21, (Gl)var4_4, var19_19, var20_20, var12_12);
                if (var0 == var8_8 /* !! */ ) break block11;
                var14_14 = var6_6;
                var13_13 = var15_15;
            }
            var4_4 = (Number)var3_3.d();
            var22_22 = var4_4.floatValue();
            var13_13 = r83_0.c(var22_22, var13_13);
            var2_2 = var14_14.element;
            var14_14 = new Float(var1_1 -= var2_2);
            var23_23 = 29;
            var1_1 = 4.1E-44f;
            var0 = jl_0.b(var3_3, 0.0f, var13_13, var23_23);
            var8_8 /* !! */  = new rl_1((Float)var14_14, (il_0)var0);
        }
        return var8_8 /* !! */ ;
    }

    public static final float c(float f5, float f6) {
        Object object = 0;
        float f7 = f6 - 0.0f;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 == false) {
            return 0.0f;
        }
        float f8 = f6 - 0.0f;
        object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        f5 = object > 0 ? f.c(f5, f6) : f.a(f5, f6);
        return f5;
    }
}

