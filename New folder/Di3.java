/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.d;

public final class Di3 {
    public static final Di3$a a;

    static {
        Di3$a di3$a;
        a = di3$a = new qg3_2(3, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ru_0 var0, f80_0 var1_1) {
        block5: {
            block6: {
                block7: {
                    var2_2 = var1_1 instanceof fi3_1;
                    if (!var2_2) ** GOTO lbl-1000
                    var3_3 = var1_1;
                    var3_3 = (fi3_1)var1_1;
                    var4_4 = var3_3.c;
                    var5_5 = -1 << -1;
                    var6_6 = var4_4 & var5_5;
                    if (var6_6 != 0) {
                        var3_3.c = var4_4 -= var5_5;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_3 = new h80_0((f80_0)var1_1);
                    }
                    var1_1 = var3_3.b;
                    var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var5_5 = var3_3.c;
                    var6_6 = 1;
                    if (var5_5 == 0) break block6;
                    if (var5_5 != var6_6) break block7;
                    var0 = var3_3.a;
                    vl2_2.b(var1_1);
                    ** GOTO lbl31
                }
                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var0;
            }
            vl2_2.b(var1_1);
            block0: while (true) {
                var3_3.a = var0;
                var3_3.c = var6_6;
                var1_1 = Nv2.Main;
                if ((var1_1 = var0.x0((Nv2)var1_1, var3_3)) == var7_7 /* !! */ ) break block5;
lbl31:
                // 2 sources

                var1_1 = (mv2_0)var1_1;
                var8_8 = var1_1.a;
                var9_9 = var8_8.size();
                var10_10 = 0;
                for (var11_11 = 0; var11_11 < var9_9; ++var11_11) {
                    var12_12 = (aw2_0)var8_8.get(var11_11);
                    var12_12.a();
                }
                var1_1 = var1_1.a;
                var5_5 = var1_1.size();
                while (var10_10 < var5_5) {
                    var13_13 = (aw2_0)var1_1.get(var10_10);
                    var9_9 = (int)var13_13.d;
                    if (var9_9 != 0) continue block0;
                    ++var10_10;
                }
                break;
            }
            var7_7 /* !! */  = Unit.a;
        }
        return var7_7 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(ru_0 var0, boolean var1_1, Nv2 var2_2, f80_0 var3_3) {
        block9: {
            block10: {
                var4_4 = var3_3 instanceof Di3$b;
                if (!var4_4) ** GOTO lbl-1000
                var5_5 = var3_3;
                var5_5 = (Di3$b)var3_3;
                var6_6 = var5_5.e;
                var7_7 = -1 << -1;
                var8_8 = var6_6 & var7_7;
                if (var8_8 != 0) {
                    var5_5.e = var6_6 -= var7_7;
                } else lbl-1000:
                // 2 sources

                {
                    var5_5 = new h80_0((f80_0)var3_3);
                }
                var3_3 = var5_5.d;
                var9_9 = j90_0.COROUTINE_SUSPENDED;
                var7_7 = var5_5.e;
                var8_8 = 1;
                if (var7_7 == 0) break block9;
                if (var7_7 != var8_8) break block10;
                var10_10 = var5_5.c;
                var11_11 = var5_5.b;
                var2_2 /* !! */  = var5_5.a;
                vl2_2.b(var3_3);
                var1_1 = var10_10;
                var0 /* !! */  = var2_2 /* !! */ ;
                var2_2 /* !! */  = var11_11;
                ** GOTO lbl39
            }
            var0 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0 /* !! */ ;
        }
        vl2_2.b(var3_3);
        block0: do {
            var5_5.a = var0 /* !! */ ;
            var5_5.b = var2_2 /* !! */ ;
            var5_5.c = var1_1;
            var5_5.e = var8_8;
            var3_3 = var0 /* !! */ .x0(var2_2 /* !! */ , var5_5);
            if (var3_3 == var9_9) {
                return var9_9;
            }
lbl39:
            // 3 sources

            var3_3 = (mv2_0)var3_3;
            var12_12 = var3_3.a;
            var13_13 = var12_12.size();
            for (var14_14 = 0; var14_14 < var13_13; ++var14_14) {
                var15_15 = (aw2_0)var12_12.get(var14_14);
                if (var1_1) {
                    var16_16 = var15_15.b();
                    if (!var16_16 && !(var16_16 = var15_15.h) && (var17_17 = var15_15.d)) {
                        var17_17 = true;
                    } else {
                        var17_17 = false;
                        var15_15 = null;
                    }
                } else {
                    var17_17 = si0_2.a(var15_15);
                }
                if (var17_17) continue;
                var7_7 = 0;
                var12_12 = null;
                continue block0;
            }
            var7_7 = 1;
        } while (var7_7 == 0);
        return var3_3.a.get(0);
    }

    public static /* synthetic */ Object c(ru_0 ru_02, f80_0 f80_02, int n3) {
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        Nv2 nv2 = Nv2.Main;
        return Di3.b(ru_02, n4 != 0, nv2, f80_02);
    }

    public static Object d(hw2_0 object, Function1 object2, f80_0 f80_02) {
        Di3$a di3$a = a;
        hi3_1 hi3_12 = new hi3_1((hw2_0)object, di3$a, null, null, (Function1)object2, null);
        if ((object = d.c(hi3_12, f80_02)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object e(ru_0 var0, Nv2 var1_1, f80_0 var2_2) {
        block13: {
            block14: {
                block12: {
                    block15: {
                        var3_3 /* !! */  = var2_2;
                        var4_4 = var2_2 instanceof Di3$c;
                        if (!var4_4) ** GOTO lbl-1000
                        var5_5 /* !! */  = var2_2;
                        var5_5 /* !! */  = (Di3$c)var2_2;
                        var6_6 = var5_5 /* !! */ .d;
                        var7_7 = -1 << -1;
                        var8_8 = var6_6 & var7_7;
                        if (var8_8 != 0) {
                            var5_5 /* !! */ .d = var6_6 -= var7_7;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_5 /* !! */  = new h80_0((f80_0)var3_3 /* !! */ );
                        }
                        var3_3 /* !! */  = var5_5 /* !! */ .c;
                        var9_9 = j90_0.COROUTINE_SUSPENDED;
                        var7_7 = var5_5 /* !! */ .d;
                        var8_8 = 1;
                        var10_10 = 2;
                        if (var7_7 == 0) break block15;
                        if (var7_7 != var8_8) {
                            if (var7_7 == var10_10) {
                                var11_11 /* !! */  = var5_5 /* !! */ .b;
                                var12_12 = var5_5 /* !! */ .a;
                                vl2_2.b(var3_3 /* !! */ );
                                while (true) {
                                    break block12;
                                    break;
                                }
                            }
                            var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var3_3 /* !! */ ;
                        }
                        var11_11 /* !! */  = var5_5 /* !! */ .b;
                        var12_12 = var5_5 /* !! */ .a;
                        vl2_2.b(var3_3 /* !! */ );
                        ** GOTO lbl50
                    }
                    vl2_2.b(var3_3 /* !! */ );
                    var3_3 /* !! */  = var0;
                    var11_11 /* !! */  = var5_5 /* !! */ ;
                    var5_5 /* !! */  = var1_1;
lbl37:
                    // 2 sources

                    while (true) {
                        var11_11 /* !! */ .a = var3_3 /* !! */ ;
                        var11_11 /* !! */ .b = var5_5 /* !! */ ;
                        var11_11 /* !! */ .d = var8_8;
                        var12_12 = var3_3 /* !! */ .x0((Nv2)var5_5 /* !! */ , (f80_0)var11_11 /* !! */ );
                        if (var12_12 == var9_9) {
                            return var9_9;
                        }
                        var13_13 /* !! */  = var12_12;
                        var12_12 = var3_3 /* !! */ ;
                        var3_3 /* !! */  = var13_13 /* !! */ ;
                        var14_14 /* !! */  = var11_11 /* !! */ ;
                        var11_11 /* !! */  = var5_5 /* !! */ ;
                        var5_5 /* !! */  = var14_14 /* !! */ ;
lbl50:
                        // 2 sources

                        var3_3 /* !! */  = (mv2_0)var3_3 /* !! */ ;
                        var15_15 = var3_3 /* !! */ .a;
                        var16_16 = var15_15.size();
                        var17_17 = 0;
lbl54:
                        // 2 sources

                        while (true) {
                            var18_18 = var3_3 /* !! */ .a;
                            if (var17_17 >= var16_16) break block13;
                            var19_19 = (aw2_0)var15_15.get(var17_17);
                            var20_20 = si0_2.b(var19_19);
                            if (!var20_20) {
                                var21_21 = var18_18.size();
                                var15_15 = null;
                                for (var22_22 = 0; var22_22 < var21_21; ++var22_22) {
                                    var23_23 = (aw2_0)var18_18.get(var22_22);
                                    var17_17 = (int)var23_23.b();
                                    if (var17_17 == 0 && (var10_10 = (int)si0_2.f(var23_23, var24_24 = var12_12.a(), var26_25 = var12_12.Z())) == 0) {
                                        var10_10 = 2;
                                        continue;
                                    }
                                    return null;
                                }
                                var3_3 /* !! */  = Nv2.Final;
                                var5_5 /* !! */ .a = var12_12;
                                var5_5 /* !! */ .b = var11_11 /* !! */ ;
                                var5_5 /* !! */ .d = var10_10 = 2;
                                if ((var3_3 /* !! */  = var12_12.x0((Nv2)var3_3 /* !! */ , var5_5 /* !! */ )) != var9_9) ** continue;
                                return var9_9;
                            }
                            break block14;
                            break;
                        }
                        break;
                    }
                }
                var13_13 /* !! */  = var11_11 /* !! */ ;
                var11_11 /* !! */  = var5_5 /* !! */ ;
                var5_5 /* !! */  = var13_13 /* !! */ ;
                var3_3 /* !! */  = ((mv2_0)var3_3 /* !! */ ).a;
                var28_26 = var3_3 /* !! */ .size();
                var15_15 = null;
                for (var22_22 = 0; var22_22 < var28_26; ++var22_22) {
                    var23_23 = (aw2_0)var3_3 /* !! */ .get(var22_22);
                    var16_16 = (int)var23_23.b();
                    if (var16_16 == 0) continue;
                    return null;
                }
                var3_3 /* !! */  = var12_12;
                ** while (true)
            }
            ++var17_17;
            ** while (true)
        }
        return var18_18.get(0);
    }
}

