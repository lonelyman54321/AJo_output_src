/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from hT0
 */
public final class ht0_2
implements fs0_2 {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ fs0_2 b;
    public final /* synthetic */ Function2 c;

    public ht0_2(Ref$BooleanRef ref$BooleanRef, fs0_2 fs0_22, Function2 function2) {
        this.a = ref$BooleanRef;
        this.b = fs0_22;
        this.c = function2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block15: {
            block11: {
                block12: {
                    block14: {
                        block13: {
                            block7: {
                                block8: {
                                    block9: {
                                        block10: {
                                            var3_3 = var2_2 instanceof hT0$a;
                                            if (!var3_3) ** GOTO lbl-1000
                                            var4_4 = var2_2;
                                            var4_4 = (hT0$a)var2_2;
                                            var5_5 = var4_4.e;
                                            var6_6 = -1 << -1;
                                            var7_7 = var5_5 & var6_6;
                                            if (var7_7 != 0) {
                                                var4_4.e = var5_5 -= var6_6;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var4_4 = new hT0$a(this, (f80_0)var2_2);
                                            }
                                            var2_2 = var4_4.c;
                                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                                            var6_6 = var4_4.e;
                                            var7_7 = 3;
                                            var9_9 = 2;
                                            var10_10 = 1;
                                            if (var6_6 == 0) break block7;
                                            if (var6_6 == var10_10) break block8;
                                            if (var6_6 == var9_9) break block9;
                                            if (var6_6 != var7_7) break block10;
                                            vl2_2.b(var2_2);
                                            break block11;
                                        }
                                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw var1_1;
                                    }
                                    var1_1 = var4_4.b;
                                    var11_11 = var4_4.a;
                                    vl2_2.b(var2_2);
                                    break block12;
                                }
                                vl2_2.b(var2_2);
                                break block13;
                            }
                            vl2_2.b(var2_2);
                            var2_2 = this.a;
                            var12_12 = var2_2.element;
                            if (var12_12) {
                                var4_4.e = var10_10;
                                var2_2 = this.b;
                                if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                                    return var8_8;
                                } else {
                                    ** GOTO lbl45
                                }
                            }
                            break block14;
                        }
                        return Unit.a;
                    }
                    var4_4.a = this;
                    var4_4.b = var1_1;
                    var4_4.e = var9_9;
                    var2_2 = this.c.invoke(var1_1, var4_4);
                    if (var2_2 == var8_8) {
                        return var8_8;
                    }
                    var11_11 = this;
                }
                var2_2 = (Boolean)var2_2;
                var12_12 = var2_2.booleanValue();
                if (!var12_12) {
                    var11_11.a.element = var10_10;
                    var12_12 = false;
                    var4_4.a = null;
                    var4_4.b = null;
                    var4_4.e = var7_7;
                    var2_2 = var11_11.b;
                    if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                        return var8_8;
                    } else {
                        ** GOTO lbl68
                    }
                }
                break block15;
            }
            return Unit.a;
        }
        return Unit.a;
    }
}

