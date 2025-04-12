/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class xk2$b$b$a
implements fs0_2 {
    public final /* synthetic */ Jv3 a;
    public final /* synthetic */ int b;

    public xk2$b$b$a(Jv3 jv3, int n3) {
        this.a = jv3;
        this.b = n3;
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
                            var3_3 = var2_2 instanceof xk2$b$b$a$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (xk2$b$b$a$a)var2_2;
                            var5_5 = var4_4.b;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.b = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new xk2$b$b$a$a(this, (f80_0)var2_2);
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
                    vl2_2.b(var2_2);
                    break block8;
                }
                vl2_2.b(var2_2);
                var4_4.b = var9_9;
                var2_2 = this.a;
                var6_6 = this.b;
                var1_1 = var2_2.a(var6_6, var1_1, var4_4);
                if (var1_1 == var8_8) {
                    return var8_8;
                }
            }
            var4_4.b = var7_7;
            var1_1 = tr_1.b(var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

