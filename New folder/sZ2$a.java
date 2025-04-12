/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class sZ2$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ qZ2 b;

    public sZ2$a(fs0_2 fs0_22, qZ2 qZ22) {
        this.a = fs0_22;
        this.b = qZ22;
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
                            var3_3 = var2_2 instanceof sZ2$a$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (sZ2$a$a)var2_2;
                            var5_5 = var4_4.b;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.b = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new sZ2$a$a(this, (f80_0)var2_2);
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
                    var1_1 = var4_4.c;
                    vl2_2.b(var2_2);
                    break block8;
                }
                vl2_2.b(var2_2);
                var1_1 = (rk2_0)var1_1;
                var4_4.c = var2_2 = this.a;
                var4_4.b = var9_9;
                var10_10 = this.b;
                var1_1 = var10_10.a((rk2_0)var1_1, var4_4);
                if (var1_1 == var8_8) {
                    return var8_8;
                }
                var11_11 = var2_2;
                var2_2 = var1_1;
                var1_1 = var11_11;
            }
            var6_6 = 0;
            var10_10 = null;
            var4_4.c = null;
            var4_4.b = var7_7;
            var1_1 = var1_1.emit(var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

