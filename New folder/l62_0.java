/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from L62
 */
public final class l62_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(bg2_2 var0, if_1 var1_1, f80_0 var2_2) {
        block22: {
            block13: {
                block21: {
                    block18: {
                        block20: {
                            block19: {
                                block14: {
                                    block15: {
                                        block16: {
                                            block17: {
                                                var3_3 = var2_2 instanceof j62_0;
                                                if (!var3_3) ** GOTO lbl-1000
                                                var4_4 = var2_2;
                                                var4_4 = (j62_0)var2_2;
                                                var5_5 = var4_4.d;
                                                var6_6 = -1 << -1;
                                                var7_7 = var5_5 & var6_6;
                                                if (var7_7 != 0) {
                                                    var4_4.d = var5_5 -= var6_6;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var4_4 = new h80_0((f80_0)var2_2);
                                                }
                                                var2_2 = var4_4.c;
                                                var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                var6_6 = var4_4.d;
                                                var7_7 = 2;
                                                var9_9 = 4;
                                                var10_10 = 3;
                                                var11_11 = 1;
                                                if (var6_6 == 0) break block14;
                                                if (var6_6 == var11_11) break block15;
                                                if (var6_6 == var7_7) break block16;
                                                if (var6_6 != var10_10) break block17;
                                                var0 = (bg2$b_0)var4_4.a;
                                                vl2_2.b(var2_2);
                                                break block18;
                                            }
                                            if (var6_6 != var9_9) {
                                                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                throw var0;
                                            }
                                        }
                                        var0 = var4_4.a;
                                        vl2_2.b(var2_2);
                                        break block13;
                                    }
                                    var1_1 = var4_4.b;
                                    var0 = var4_4.a;
                                    vl2_2.b(var2_2);
                                    break block19;
                                }
                                vl2_2.b(var2_2);
                                var12_12 = var0 instanceof bg2$a_0;
                                var6_6 = 0;
                                var13_13 = null;
                                if (var12_12) {
                                    var2_2 = var0;
                                    var2_2 = ((bg2$a_0)var0).e();
                                    var4_4.a = var0;
                                    var4_4.b = var1_1;
                                    var4_4.d = var11_11;
                                    var14_14 = kf_1.a;
                                    var9_9 = ((Object)var2_2).length;
                                    if ((var2_2 = kf_1.b((gf_2)var1_1, (byte[])var2_2, 0, var9_9, (f80_0)var4_4)) == var8_8 /* !! */ ) {
                                        return var8_8 /* !! */ ;
                                    } else {
                                        ** GOTO lbl55
                                    }
                                }
                                break block20;
                            }
                            var4_4.a = var0;
                            var4_4.b = null;
                            var4_4.d = var7_7;
                            var1_1 = var1_1.c((f80_0)var4_4);
                            if (var1_1 == var8_8 /* !! */ ) {
                                return var8_8 /* !! */ ;
                            }
                            break block13;
                        }
                        var12_12 = var0 instanceof bg2$d_0;
                        if (var12_12) {
                            var2_2 = new if_1(false);
                            var4_4 = var0;
                            var4_4 = ((bg2$d_0)var0).e();
                            rf_1.a((uf_1)var4_4, (if_1)var1_1, (if_1)var2_2);
                            var1_1 = new ox1_2((bg2_2)var0, (uf_1)var2_2);
lbl71:
                            // 2 sources

                            while (true) {
                                var0 = var1_1;
                                break block13;
                                break;
                            }
                        }
                        var12_12 = var0 instanceof bg2$e_0;
                        if (var12_12) {
                            var2_2 = new if_1(false);
                            var4_4 = var0;
                            var4_4 = (bg2$e_0)var0;
                            var8_8 /* !! */  = e01_0.a;
                            var13_13 = ir0_2.a;
                            var14_15 = new k62_0((bg2$e_0)var4_4, null);
                            var4_4 = kf_1.e((i90_0)var8_8 /* !! */ , (CoroutineContext)var13_13, (Function2)var14_15, (int)var7_7).a;
                            rf_1.a((uf_1)var4_4, (if_1)var1_1, (if_1)var2_2);
                            var1_1 = new ox1_2((bg2_2)var0, (uf_1)var2_2);
                            ** continue;
                        }
                        var12_12 = var0 instanceof bg2$b_0;
                        if (var12_12) {
                            var0 = (bg2$b_0)var0;
                            var0.getClass();
                            var4_4.a = var0;
                            var4_4.d = var10_10;
                            var2_2 = l62_0.a(null, (if_1)var1_1, (f80_0)var4_4);
                            if (var2_2 == var8_8 /* !! */ ) {
                                return var8_8 /* !! */ ;
                            } else {
                                ** GOTO lbl97
                            }
                        }
                        break block21;
                    }
                    var2_2 = (bg2_2)var2_2;
                    var0 = var0.e();
                    break block13;
                }
                var12_12 = var0 instanceof bg2$c_0;
                if (var12_12) {
                    var4_4.a = (bg2_2)var0;
                    var4_4.d = var9_9;
                    if ((var1_1 = var1_1.c((f80_0)var4_4)) == var8_8 /* !! */ ) {
                        return var8_8 /* !! */ ;
                    } else {
                        ** GOTO lbl109
                    }
                }
                break block22;
            }
            return var0;
        }
        var0 = new NoWhenBranchMatchedException();
        throw var0;
    }
}

