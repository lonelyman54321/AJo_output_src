/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;

public final class vT0$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ Function2 b;

    public vT0$a(fs0_2 fs0_22, Function2 function2) {
        this.a = fs0_22;
        this.b = function2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var3_3 = var2_2 instanceof vT0$a$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (vT0$a$a)var2_2;
                            var5_5 = var4_4.b;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.b = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new vT0$a$a(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.a;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.b;
                            var7_7 = 2;
                            var9_9 = 1;
                            if (var6_6 == 0) break block4;
                            if (var6_6 == var9_9) break block5;
                            if (var6_6 != var7_7) break block6;
                            vl2_2.b(var2_2);
                            break block7;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var4_4.e;
                    var10_10 = var4_4.d;
                    vl2_2.b(var2_2);
                    break block8;
                }
                vl2_2.b(var2_2);
                var4_4.d = var1_1;
                var4_4.e = var2_2 = this.a;
                var4_4.b = var9_9;
                var6_6 = 6;
                InlineMarker.mark(var6_6);
                var10_10 = this.b.invoke(var1_1, var4_4);
                var9_9 = 7;
                InlineMarker.mark(var9_9);
                if (var10_10 == var8_8) {
                    return var8_8;
                }
                var10_10 = var1_1;
                var1_1 = var2_2;
            }
            var2_2 = null;
            var4_4.d = null;
            var4_4.e = null;
            var4_4.b = var7_7;
            var1_1 = var1_1.emit(var10_10, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

