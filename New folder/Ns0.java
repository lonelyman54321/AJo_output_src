/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Ns0 {
    public static final float a;

    static {
        float f5 = (float)0.125;
        float f6 = 18;
        a = f5 / f6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ru_0 var0, long var1_1, f80_0 var3_2) {
        block16: {
            block17: {
                var4_3 = var1_1;
                var6_4 = var3_2;
                var7_5 = var3_2 instanceof Ns0$a;
                if (!var7_5) ** GOTO lbl-1000
                var8_6 = var3_2;
                var8_6 = (Ns0$a)var3_2;
                var9_7 = var8_6.d;
                var10_8 = -1 << -1;
                var11_9 = var9_7 & var10_8;
                if (var11_9) {
                    var8_6.d = var9_7 -= var10_8;
                } else lbl-1000:
                // 2 sources

                {
                    var8_6 = new h80_0((f80_0)var6_4);
                }
                var6_4 = var8_6.c;
                var12_10 = j90_0.COROUTINE_SUSPENDED;
                var10_8 = var8_6.d;
                var11_9 = 1;
                var13_11 = null;
                if (var10_8 == 0) break block16;
                if (var10_8 != var11_9) break block17;
                var14_12 = var8_6.b;
                var15_14 /* !! */  = var8_6.a;
                vl2_2.b(var6_4);
                var16_15 = var15_14 /* !! */ ;
                var15_14 /* !! */  = var14_12;
                var14_12 = var16_15;
                ** GOTO lbl50
            }
            var14_13 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var14_13;
        }
        vl2_2.b(var6_4);
        var6_4 = var0.p0();
        var17_16 = Ns0.d((mv2_0)var6_4, var4_3);
        if (var17_16) {
            return null;
        }
        var6_4 = new Ref$LongRef();
        var6_4.element = var4_3;
        var14_12 = var0;
        while (true) {
            block21: {
                block19: {
                    block20: {
                        block15: {
                            block18: {
                                block14: {
                                    var8_6.a = var14_12;
                                    var8_6.b = var6_4;
                                    var8_6.d = var11_9;
                                    var15_14 /* !! */  = Nv2.Main;
                                    if ((var15_14 /* !! */  = var14_12.x0((Nv2)var15_14 /* !! */ , var8_6)) == var12_10) {
                                        return var12_10;
                                    }
                                    var16_15 = var6_4;
                                    var6_4 = var15_14 /* !! */ ;
                                    var15_14 /* !! */  = var16_15;
lbl50:
                                    // 2 sources

                                    var6_4 = (mv2_0)var6_4;
                                    var18_17 = var6_4.a;
                                    var19_18 = var18_17.size();
                                    var20_19 = 0;
                                    var22_21 = null;
                                    for (var21_20 = 0; var21_20 < var19_18; ++var21_20) {
                                        var24_23 = var23_22 = (aw2_0)var18_17.get(var21_20);
                                        var24_23 = var23_22;
                                        var25_24 = var24_23.a;
                                        var27_25 = var15_14 /* !! */ .element;
                                        var29_26 = Yv2.a(var25_24, var27_25);
                                        if (!var29_26) {
                                            continue;
                                        }
                                        break block14;
                                    }
                                    var23_22 = null;
                                }
                                var23_22 = var23_22;
                                if (var23_22 != null) break block18;
                                var23_22 = null;
                                break block19;
                            }
                            var10_8 = (int)si0_2.c(var23_22);
                            if (var10_8 == 0) break block20;
                            var6_4 = var6_4.a;
                            var10_8 = var6_4.size();
                            while (var20_19 < var10_8) {
                                var30_27 /* !! */  = var6_4.get(var20_19);
                                var22_21 = (aw2_0)var30_27 /* !! */ ;
                                var22_21 = (aw2_0)var30_27 /* !! */ ;
                                var21_20 = (int)var22_21.d;
                                if (var21_20 == 0) {
                                    ++var20_19;
                                    continue;
                                }
                                break block15;
                            }
                            var19_18 = 0;
                            var30_27 /* !! */  = null;
                        }
                        var30_27 /* !! */  = (aw2_0)var30_27 /* !! */ ;
                        if (var30_27 /* !! */  == null) break block19;
                        var15_14 /* !! */ .element = var31_28 = var30_27 /* !! */ .a;
                        break block21;
                    }
                    var31_28 = si0_2.g(var23_22, (boolean)var11_9);
                    var17_16 = e72.b(var31_28, var25_24 = 0L) ^ var11_9;
                    if (!var17_16) break block21;
                }
                if (var23_22 != null && !(var33_29 = var23_22.b())) {
                    var13_11 = var23_22;
                }
                return var13_11;
            }
            var6_4 = var15_14 /* !! */ ;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final Object b(ru_0 var0, long var1_1, f80_0 var3_2) {
        block18: {
            block19: {
                block20: {
                    var4_3 = var3_2 instanceof Ns0$b;
                    if (!var4_3) ** GOTO lbl-1000
                    var5_4 = var3_2;
                    var5_4 = (Ns0$b)var3_2;
                    var6_5 = var5_4.d;
                    var7_6 = -1 << -1;
                    var8_7 = var6_5 & var7_6;
                    if (var8_7 != 0) {
                        var5_4.d = var6_5 -= var7_6;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_4 = new h80_0((f80_0)var3_2);
                    }
                    var3_2 = var5_4.c;
                    var9_8 = j90_0.COROUTINE_SUSPENDED;
                    var7_6 = var5_4.d;
                    var8_7 = 1;
                    var10_9 = null;
                    if (var7_6 != 0) {
                        if (var7_6 == var8_7) {
                            var0 = var5_4.b;
                            var11_10 = var5_4.a;
                            try {
                                vl2_2.b(var3_2);
                                break block18;
                            }
                            catch (PointerEventTimeoutCancellationException v0) {
                                break block19;
                            }
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var3_2);
                    var3_2 = var0.p0();
                    var12_11 = Ns0.d((mv2_0)var3_2, var1_1);
                    if (var12_11) {
                        return null;
                    }
                    var3_2 = var0.p0().a;
                    var7_6 = var3_2.size();
                    for (var13_12 = 0; var13_12 < var7_6; ++var13_12) {
                        var15_14 = var14_13 = (aw2_0)var3_2.get(var13_12);
                        var15_14 = var14_13;
                        var16_15 = var15_14.a;
                        var18_16 = Yv2.a(var16_15, var1_1);
                        if (!var18_16) {
                            continue;
                        }
                        break block20;
                    }
                    var14_13 = null;
                }
                var11_10 = var14_13;
                var11_10 = var14_13;
                if (var11_10 == null) {
                    return null;
                }
                var19_17 = new Ref$ObjectRef();
                var3_2 = new Ref$ObjectRef();
                var3_2.element = var11_10;
                var20_18 = var0.getViewConfiguration();
                var21_19 = var20_18.b();
                var20_18 = new Ns0$c((Ref$ObjectRef)var3_2, var19_17, null);
                var5_4.a = var11_10;
                var5_4.b = var19_17;
                var5_4.d = var8_7;
                try {
                    var0 = var0.u(var21_19, (Function2)var20_18, var5_4);
                    if (var0 == var9_8) {
                        return var9_8;
                    }
                    break block18;
                }
                catch (PointerEventTimeoutCancellationException v1) {
                    var0 = var19_17;
                }
            }
            var0 = (aw2_0)var0.element;
            var10_9 = var0 == null ? var11_10 : var0;
        }
        return var10_9;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object c(ru_0 var0, long var1_1, Function1 var3_2, f80_0 var4_3) {
        block6: {
            block7: {
                var5_4 = var4_3 instanceof Ns0$d;
                if (!var5_4) ** GOTO lbl-1000
                var6_5 = var4_3;
                var6_5 = (Ns0$d)var4_3;
                var7_6 = var6_5.d;
                var8_7 = -1 << -1;
                var9_8 = var7_6 & var8_7;
                if (var9_8 != 0) {
                    var6_5.d = var7_6 -= var8_7;
                } else lbl-1000:
                // 2 sources

                {
                    var6_5 = new h80_0((f80_0)var4_3);
                }
                var4_3 = var6_5.c;
                var10_9 = j90_0.COROUTINE_SUSPENDED;
                var8_7 = var6_5.d;
                var9_8 = 1;
                if (var8_7 == 0) break block6;
                if (var8_7 != var9_8) break block7;
                var0 = var6_5.b;
                var11_10 = var6_5.a;
                vl2_2.b(var4_3);
                var3_2 = var0;
                var0 = var11_10;
                ** GOTO lbl37
            }
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
        }
        vl2_2.b(var4_3);
        while (true) {
            var6_5.a = var0;
            var4_3 = var3_2;
            var6_5.b = var4_3 = var3_2;
            var6_5.d = var9_8;
            var4_3 = Ns0.a((ru_0)var0, var1_1, var6_5);
            if (var4_3 == var10_9) {
                return var10_9;
            }
lbl37:
            // 3 sources

            var4_3 = (aw2_0)var4_3;
            if (var4_3 == null) {
                return Boolean.FALSE;
            }
            var12_11 = si0_2.c((aw2_0)var4_3);
            if (var12_11) {
                return Boolean.TRUE;
            }
            var3_2.invoke(var4_3);
            var1_1 = var4_3.a;
        }
    }

    public static final boolean d(mv2_0 object, long l2) {
        boolean bl2;
        aw2_0 aw2_02;
        boolean bl3;
        block3: {
            object = ((mv2_0)object).a;
            int n3 = object.size();
            bl3 = false;
            for (int i3 = 0; i3 < n3; ++i3) {
                aw2_0 aw2_03 = aw2_02 = (aw2_0)object.get(i3);
                aw2_03 = aw2_02;
                long l3 = aw2_03.a;
                boolean bl4 = Yv2.a(l3, l2);
                if (!bl4) {
                    continue;
                }
                break block3;
            }
            aw2_02 = null;
        }
        aw2_02 = aw2_02;
        boolean bl5 = true;
        if (aw2_02 != null && (bl2 = aw2_02.d) == bl5) {
            bl3 = true;
        }
        return bl5 ^ bl3;
    }
}

