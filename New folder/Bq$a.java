/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Bq$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ Cq b;

    public Bq$a(fs0_2 fs0_22, Cq cq2) {
        this.b = cq2;
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block11: {
            block14: {
                block12: {
                    block13: {
                        block7: {
                            block8: {
                                block9: {
                                    block10: {
                                        var3_3 = var2_2 instanceof Bq$a$a;
                                        if (!var3_3) ** GOTO lbl-1000
                                        var4_4 = var2_2;
                                        var4_4 = (Bq$a$a)var2_2;
                                        var5_5 = var4_4.b;
                                        var6_6 = -1 << -1;
                                        var7_7 = var5_5 & var6_6;
                                        if (var7_7 != 0) {
                                            var4_4.b = var5_5 -= var6_6;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var4_4 = new Bq$a$a(this, (f80_0)var2_2);
                                        }
                                        var2_2 = var4_4.a;
                                        var8_8 = j90_0.COROUTINE_SUSPENDED;
                                        var6_6 = var4_4.b;
                                        var7_7 = 3;
                                        var9_9 = 1;
                                        var10_10 = 2;
                                        if (var6_6 == 0) break block7;
                                        if (var6_6 == var9_9) break block8;
                                        if (var6_6 == var10_10) break block9;
                                        if (var6_6 != var7_7) break block10;
                                        vl2_2.b(var2_2);
                                        break block11;
                                    }
                                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var1_1;
                                }
                                var1_1 = (fs0_2)var4_4.e;
                                var11_11 = (wZ)var4_4.d;
                                vl2_2.b(var2_2);
                                break block12;
                            }
                            var1_1 = var4_4.f;
                            var11_11 = (wZ)var4_4.e;
                            var12_12 = (Bq$a)var4_4.d;
                            vl2_2.b(var2_2);
                            break block13;
                        }
                        vl2_2.b(var2_2);
                        var1_1 = (wZ)var1_1;
                        var2_2 = (Boolean)this.b.e.getValue();
                        var13_13 = var2_2.booleanValue();
                        var11_11 = this.a;
                        if (!var13_13) break block14;
                        var4_4.d = this;
                        var4_4.e = var1_1;
                        var4_4.f = var11_11;
                        var4_4.b = var9_9;
                        var2_2 = tr_1.b(var4_4);
                        if (var2_2 == var8_8) {
                            return var8_8;
                        }
                        var12_12 = this;
                        var14_14 = var11_11;
                        var11_11 = var1_1;
                        var1_1 = var14_14;
                    }
                    var2_2 = var12_12.b.e;
                    var12_12 = new qg3_2(var10_10, null);
                    var4_4.d = var11_11;
                    var4_4.e = var1_1;
                    var4_4.f = null;
                    var4_4.b = var10_10;
                    var2_2 = ms0_1.l((es0_2)var2_2, (Function2)var12_12, var4_4);
                    if (var2_2 == var8_8) {
                        return var8_8;
                    }
                }
                var14_14 = var11_11;
                var11_11 = var1_1;
                var1_1 = var14_14;
            }
            var4_4.d = null;
            var4_4.e = null;
            var4_4.b = var7_7;
            if ((var1_1 = var11_11.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

