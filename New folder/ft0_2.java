/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from fT0
 */
public final class ft0_2
implements fs0_2 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fs0_2 c;

    public ft0_2(Ref$IntRef ref$IntRef, int n3, fs0_2 fs0_22) {
        this.a = ref$IntRef;
        this.b = n3;
        this.c = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block7: {
            block6: {
                block4: {
                    block5: {
                        var3_3 = var2_2 instanceof fT0$a;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (fT0$a)var2_2;
                        var5_5 = var4_4.c;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.c = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new fT0$a(this, (f80_0)var2_2);
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
                var2_2 = this.a;
                var6_6 = var2_2.element;
                var9_9 = this.b;
                if (var6_6 >= var9_9) {
                    var4_4.c = var7_7;
                    var2_2 = this.c;
                    if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                        return var8_8;
                    } else {
                        ** GOTO lbl34
                    }
                }
                break block7;
            }
            return Unit.a;
        }
        var2_2.element = var6_6 += var7_7;
        return Unit.a;
    }
}

