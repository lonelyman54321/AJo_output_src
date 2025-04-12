/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

public final class pU1 {
    public ru1_0 a;
    public Function0 b;
    public i90_0 c;

    public pU1() {
        pu1$a_0 pu1$a_0 = new pu1$a_0(this);
        this.b = pu1$a_0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(long var1_1, long var3_2, f80_0 var5_3) {
        block10: {
            block9: {
                block8: {
                    block6: {
                        block7: {
                            var6_4 = var5_3 instanceof pu1$b_0;
                            if (var6_4) {
                                var7_5 /* !! */  = var5_3;
                                var7_5 /* !! */  = (pu1$b_0)var5_3;
                                var8_6 = var7_5 /* !! */ .c;
                                var9_7 = -1 << -1;
                                var10_8 = var8_6 & var9_7;
                                if (var10_8 != 0) {
                                    var7_5 /* !! */ .c = var8_6 -= var9_7;
lbl10:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                            }
                            var7_5 /* !! */  = new pu1$b_0(this, (f80_0)var5_3);
                            ** while (true)
                            var11_9 = var7_5 /* !! */ ;
                            var5_3 = var7_5 /* !! */ .a;
                            var7_5 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var8_6 = var11_9.c;
                            var9_7 = 1;
                            if (var8_6 == 0) break block6;
                            if (var8_6 != var9_7) break block7;
                            vl2_2.b(var5_3);
                            break block8;
                        }
                        var12_10 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var12_10;
                    }
                    vl2_2.b(var5_3);
                    var5_3 = this.a;
                    var8_6 = 0;
                    var13_11 = null;
                    if (var5_3 != null && (var10_8 = (int)var5_3.m) != 0) {
                        var13_11 = var5_3 = Zr3.b((yr3_0)var5_3);
                        var13_11 = (ru1_0)var5_3;
                    }
                    if (var13_11 != null) {
                        var11_9.c = var9_7;
                        var5_3 = var13_11.onPostFling-RZ2iAVY(var1_1, var3_2, var11_9);
                        if (var5_3 == var7_5 /* !! */ ) {
                            return var7_5 /* !! */ ;
                        } else {
                            ** GOTO lbl40
                        }
                    }
                    break block9;
                }
                var5_3 = (WA3)var5_3;
                var1_1 = var5_3.a;
                break block10;
            }
            var1_1 = 0L;
        }
        var14_12 = new WA3(var1_1);
        return var14_12;
    }

    /*
     * Unable to fully structure code
     */
    public final Object b(long var1_1, f80_0 var3_2) {
        block9: {
            block8: {
                block7: {
                    block5: {
                        block6: {
                            var4_3 = var3_2 instanceof pU1$c;
                            if (!var4_3) ** GOTO lbl-1000
                            var5_4 = var3_2;
                            var5_4 = (pU1$c)var3_2;
                            var6_5 = var5_4.c;
                            var7_6 = -1 << -1;
                            var8_7 = var6_5 & var7_6;
                            if (var8_7 != 0) {
                                var5_4.c = var6_5 -= var7_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_4 = new pU1$c(this, (f80_0)var3_2);
                            }
                            var3_2 = var5_4.a;
                            var9_8 = j90_0.COROUTINE_SUSPENDED;
                            var7_6 = var5_4.c;
                            var8_7 = 1;
                            if (var7_6 == 0) break block5;
                            if (var7_6 != var8_7) break block6;
                            vl2_2.b(var3_2);
                            break block7;
                        }
                        var10_9 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var10_9;
                    }
                    vl2_2.b(var3_2);
                    var3_2 = this.a;
                    var7_6 = 0;
                    var11_10 = null;
                    if (var3_2 != null && (var12_11 = var3_2.m)) {
                        var11_10 = var3_2 = Zr3.b((yr3_0)var3_2);
                        var11_10 = (ru1_0)var3_2;
                    }
                    if (var11_10 != null) {
                        var5_4.c = var8_7;
                        var3_2 = var11_10.onPreFling-QWom1Mo(var1_1, var5_4);
                        if (var3_2 == var9_8) {
                            return var9_8;
                        } else {
                            ** GOTO lbl37
                        }
                    }
                    break block8;
                }
                var3_2 = (WA3)var3_2;
                var1_1 = var3_2.a;
                break block9;
            }
            var1_1 = 0L;
        }
        var3_2 = new WA3(var1_1);
        return var3_2;
    }

    public final i90_0 c() {
        Object object = (i90_0)this.b.invoke();
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        throw object;
    }
}

