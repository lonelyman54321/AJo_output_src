/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public final class eY2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ru_0 var0, f80_0 var1_1) {
        block4: {
            block5: {
                block6: {
                    var2_2 = var1_1 /* !! */  instanceof xx2_1;
                    if (!var2_2) ** GOTO lbl-1000
                    var3_3 = var1_1 /* !! */ ;
                    var3_3 = (xx2_1)var1_1 /* !! */ ;
                    var4_4 = var3_3.c;
                    var5_5 = -1 << -1;
                    var6_6 = var4_4 & var5_5;
                    if (var6_6 != 0) {
                        var3_3.c = var4_4 -= var5_5;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_3 = new h80_0((f80_0)var1_1 /* !! */ );
                    }
                    var1_1 /* !! */  = var3_3.b;
                    var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var5_5 = var3_3.c;
                    var6_6 = 1;
                    if (var5_5 == 0) break block5;
                    if (var5_5 != var6_6) break block6;
                    var0 = var3_3.a;
                    vl2_2.b(var1_1 /* !! */ );
                    ** GOTO lbl31
                }
                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var0;
            }
            vl2_2.b(var1_1 /* !! */ );
            block0: while (true) {
                var1_1 /* !! */  = Nv2.Main;
                var3_3.a = var0;
                var3_3.c = var6_6;
                if ((var1_1 /* !! */  = var0.x0((Nv2)var1_1 /* !! */ , var3_3)) == var7_7 /* !! */ ) break block4;
lbl31:
                // 2 sources

                var1_1 /* !! */  = (mv2_0)var1_1 /* !! */ ;
                var8_8 = var1_1 /* !! */ .a;
                var9_9 = var8_8.size();
                for (var10_10 = 0; var10_10 < var9_9; ++var10_10) {
                    var11_11 = (aw2_0)var8_8.get(var10_10);
                    var12_12 = si0_2.a(var11_11);
                    if (!var12_12) continue block0;
                }
                break;
            }
            var7_7 /* !! */  = var1_1 /* !! */ ;
        }
        return var7_7 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(ru_0 var0, sQ1 var1_1, KV var2_2, mv2_0 var3_3, f80_0 var4_4) {
        block19: {
            block18: {
                block17: {
                    block14: {
                        block15: {
                            block16: {
                                var5_5 = var0;
                                var6_6 = var1_1;
                                var7_7 = var2_2;
                                var8_8 = var3_3;
                                var9_9 = var4_4;
                                var10_10 = 1;
                                var11_11 = var4_4 instanceof yx2_1;
                                if (!var11_11) ** GOTO lbl-1000
                                var12_12 = var4_4;
                                var12_12 = (yx2_1)var4_4;
                                var13_13 = var12_12.d;
                                var14_14 = -1 << -1;
                                var15_15 = var13_13 & var14_14;
                                if (var15_15 != 0) {
                                    var12_12.d = var13_13 -= var14_14;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var12_12 = new h80_0((f80_0)var9_9);
                                }
                                var9_9 = var12_12.c;
                                var16_16 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                var14_14 = var12_12.d;
                                var15_15 = 2;
                                if (var14_14 == 0) break block14;
                                if (var14_14 == var10_10) break block15;
                                if (var14_14 != var15_15) break block16;
                                var5_5 = var12_12.b;
                                var6_6 = var12_12.a;
                                vl2_2.b(var9_9);
                                var18_18 = var6_6;
                                var6_6 = var5_5;
                                var5_5 = var18_18;
                                break block17;
                            }
                            var5_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var5_5;
                        }
                        var5_5 = var12_12.b;
                        var6_6 = var12_12.a;
                        vl2_2.b(var9_9);
                        var9_9 = (Boolean)var9_9;
                        var19_19 = var9_9.booleanValue();
                        if (var19_19 != 0) {
                            var6_6 = var6_6.p0().a;
                            var19_19 = var6_6.size();
                            for (var17_17 = 0; var17_17 < var19_19; var17_17 += var10_10) {
                                var8_8 = (aw2_0)var6_6.get(var17_17);
                                var20_21 = si0_2.b((aw2_0)var8_8);
                                if (!var20_21) continue;
                                var8_8.a();
                            }
                        }
                        var5_5.a();
                        break block18;
                    }
                    vl2_2.b(var9_9);
                    var9_9 = var7_7.c;
                    var21_23 = (aw2_0)var8_8.a.get(0);
                    if (var9_9 == null) ** GOTO lbl-1000
                    var22_24 = var21_23.b;
                    var24_25 = var9_9.b;
                    var26_26 = var7_7.a;
                    var27_27 = var26_26.a();
                    cfr_temp_0 = (var22_24 -= var24_25) - var27_27;
                    var29_28 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var29_28 /* !! */  >= 0) ** GOTO lbl-1000
                    var30_29 = Ns0.a;
                    var31_30 = lw2_0.a(var9_9.i, var15_15);
                    if (var31_30) {
                        var30_29 = var26_26.f();
                        var32_31 = Ns0.a;
                        var30_29 *= var32_31;
                    } else {
                        var30_29 = var26_26.f();
                    }
                    var33_32 = var9_9.c;
                    var27_27 = var21_23.c;
                    var33_32 = e72.h(var33_32, var27_27);
                    var35_33 = e72.c(var33_32);
                    var20_22 = var35_33 == var30_29 ? 0 : (var35_33 < var30_29 ? -1 : 1);
                    if (var20_22 < 0) {
                        var7_7.b = var20_22 = var7_7.b + var10_10;
                    } else lbl-1000:
                    // 3 sources

                    {
                        var7_7.b = var10_10;
                    }
                    var7_7.c = var21_23;
                    var8_8 = (aw2_0)var8_8.a.get(0);
                    var19_20 = var7_7.b;
                    var7_7 = var19_20 != var10_10 ? (var19_20 != var15_15 ? PX2$a.c : PX2$a.b) : PX2$a.a;
                    var22_24 = var8_8.c;
                    var20_22 = var6_6.c(var22_24, (PX2)var7_7);
                    if (var20_22 == 0) break block18;
                    var9_9 = new zx2_1((sQ1)var6_6, (PX2)var7_7);
                    var12_12.a = var5_5;
                    var12_12.b = var6_6;
                    var12_12.d = var15_15;
                    var36_34 = var8_8.a;
                    if ((var9_9 = Ns0.c((ru_0)var5_5, var36_34, (Function1)var9_9, var12_12)) == var16_16 /* !! */ ) break block19;
                }
                var9_9 = (Boolean)var9_9;
                var19_20 = var9_9.booleanValue();
                if (var19_20 != 0) {
                    var5_5 = var5_5.p0().a;
                    var19_20 = var5_5.size();
                    while (var17_17 < var19_20) {
                        var8_8 = (aw2_0)var5_5.get(var17_17);
                        var20_22 = si0_2.b((aw2_0)var8_8);
                        if (var20_22 != 0) {
                            var8_8.a();
                        }
                        var17_17 += var10_10;
                    }
                }
                var6_6.a();
            }
            var16_16 /* !! */  = Unit.a;
        }
        return var16_16 /* !! */ ;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object c(ru_0 var0, Sj3 var1_2, mv2_0 var2_3, f80_0 var3_4) {
        block17: {
            block18: {
                block19: {
                    var4_5 = 1;
                    var5_6 = var3_4 instanceof by2_2;
                    if (!var5_6) ** GOTO lbl-1000
                    var6_7 = var3_4;
                    var6_7 = (by2_2)var3_4;
                    var7_8 = var6_7.e;
                    var8_9 = -1 << -1;
                    var9_10 = -0.0f;
                    var10_11 = var7_8 & var8_9;
                    if (var10_11 != 0) {
                        var6_7.e = var7_8 -= var8_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_7 = new h80_0((f80_0)var3_4);
                    }
                    var3_4 = var6_7.d;
                    var11_12 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var8_9 = var6_7.e;
                    var10_11 = 0;
                    var12_13 = 2;
                    if (var8_9 == 0) break block18;
                    if (var8_9 == var4_5) break block19;
                    if (var8_9 != var12_13) {
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    var1_2 = var6_7.b;
                    var0 = var6_7.a;
                    try {
                        vl2_2.b(var3_4);
                        ** GOTO lbl-1000
                    }
                    catch (CancellationException var0_1) {
                        break block17;
                    }
                }
                var0 = var6_7.c;
                var1_2 = var6_7.b;
                var2_3 = var6_7.a;
                {
                    vl2_2.b(var3_4);
                    var13_14 = var2_3;
                    var2_3 = var0;
                    var0 = var13_14;
                    ** GOTO lbl-1000
                }
            }
            vl2_2.b(var3_4);
            {
                var2_3 = var2_3.a;
                var2_3 = CollectionsKt.L((List)var2_3);
                var2_3 = (aw2_0)var2_3;
                var14_15 = var2_3.a;
                var6_7.a = var0;
                var6_7.b = var1_2;
                var6_7.c = var2_3;
                var6_7.e = var4_5;
                var3_4 = Ns0.b((ru_0)var0, var14_15, var6_7);
                if (var3_4 != var11_12 /* !! */ ) ** GOTO lbl-1000
                return var11_12 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var3_4 = (aw2_0)var3_4;
                if (var3_4 == null) return Unit.a;
                var14_15 = var3_4.c;
                var16_16 = var0.getViewConfiguration();
                var17_17 = var2_3.i;
            }
            {
                var17_17 = (int)lw2_0.a(var17_17, var12_13);
                if (var17_17 == 0) ** GOTO lbl-1000
                var9_10 = var16_16.f();
                var18_18 = Ns0.a;
                var9_10 *= var18_18;
                ** GOTO lbl66
            }
lbl-1000:
            // 1 sources

            {
                var9_10 = var16_16.f();
lbl66:
                // 2 sources

                var19_19 = var2_3.c;
                var19_19 = e72.h(var19_19, var14_15);
                var21_20 = e72.c(var19_19);
            }
            var22_21 = (int)(var21_20 == var9_10 ? 0 : (var21_20 < var9_10 ? -1 : 1));
            if (var22_21 < 0) {
                var22_21 = 1;
                var21_20 = 1.4E-45f;
            } else {
                var22_21 = 0;
                var21_20 = 0.0f;
                var2_3 = null;
            }
            if (var22_21 == 0) return Unit.a;
            {
                var1_2.b(var14_15);
                var23_22 = var3_4.a;
                var16_16 = new cy2_1(var1_2);
                var6_7.a = var0;
                var6_7.b = var1_2;
                var6_7.c = null;
                var6_7.e = var12_13;
                var3_4 = Ns0.c((ru_0)var0, var23_22, (Function1)var16_16, var6_7);
                if (var3_4 != var11_12 /* !! */ ) ** GOTO lbl-1000
                return var11_12 /* !! */ ;
            }
lbl-1000:
            // 2 sources

            {
                var3_4 = (Boolean)var3_4;
                var22_21 = var3_4.booleanValue();
                if (var22_21 != 0) {
                    var0 = var0.p0();
                    var0 = var0.a;
                    var22_21 = var0.size();
                    while (var10_11 < var22_21) {
                        var3_4 = var0.get(var10_11);
                        var5_6 = si0_2.b((aw2_0)(var3_4 = (aw2_0)var3_4));
                        if (var5_6) {
                            var3_4.a();
                        }
                        var10_11 += var4_5;
                    }
                    var1_2.onStop();
                    return Unit.a;
                }
                var1_2.onCancel();
            }
            return Unit.a;
        }
        var1_2.onCancel();
        throw var0_1;
    }

    public static final boolean d(mv2_0 object) {
        boolean bl2;
        block2: {
            object = ((mv2_0)object).a;
            int n3 = object.size();
            bl2 = false;
            for (int i3 = 0; i3 < n3; ++i3) {
                aw2_0 aw2_02 = (aw2_0)object.get(i3);
                int n4 = aw2_02.i;
                int n7 = 2;
                if ((n4 = (int)(lw2_0.a(n4, n7) ? 1 : 0)) != 0) {
                    continue;
                }
                break block2;
            }
            bl2 = true;
        }
        return bl2;
    }
}

