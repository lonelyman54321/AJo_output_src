/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from wT0
 */
public final class wt0_2
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ Ref$IntRef b;

    public wt0_2(fs0_2 fs0_22, Ref$IntRef ref$IntRef) {
        this.a = fs0_22;
        this.b = ref$IntRef;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block7: {
            block6: {
                block4: {
                    block5: {
                        var3_3 = var2_2 instanceof wT0$a;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (wT0$a)var2_2;
                        var5_5 = var4_4.c;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.c = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new wT0$a(this, (f80_0)var2_2);
                        }
                        var2_2 = var4_4.a;
                        var8_8 = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.c;
                        var7_7 = 1;
                        if (var6_6 == 0) break block4;
                        if (var6_6 != var7_7) break block5;
                        vl2_2.b(var2_2);
                        break block6;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var2_2);
                var9_9 = this.b;
                var10_10 = var9_9.element;
                var9_9.element = var11_11 = var10_10 + 1;
                if (var10_10 >= 0) {
                    var2_2 = new IndexedValue(var10_10, var1_1);
                    var4_4.c = var7_7;
                    var1_1 = this.a.emit(var2_2, var4_4);
                    if (var1_1 == var8_8) {
                        return var8_8;
                    } else {
                        ** GOTO lbl35
                    }
                }
                break block7;
            }
            return Unit.a;
        }
        var1_1 = new ArithmeticException("Index overflow has happened");
        throw var1_1;
    }
}

