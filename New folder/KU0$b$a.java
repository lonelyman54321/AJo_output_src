/*
 * Decompiled with CFR 0.152.
 */
import androidx.slidingpanelayout.widget.a;
import kotlin.Unit;

public final class KU0$b$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ a b;

    public KU0$b$a(fs0_2 fs0_22, a a2) {
        this.a = fs0_22;
        this.b = a2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block9: {
            block10: {
                block6: {
                    block7: {
                        block8: {
                            var3_3 = var2_2 instanceof KU0$b$a$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (KU0$b$a$a)var2_2;
                            var5_5 = var4_4.b;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.b = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new KU0$b$a$a(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.a;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.b;
                            var7_7 = 1;
                            if (var6_6 == 0) break block7;
                            if (var6_6 != var7_7) break block8;
                            vl2_2.b(var2_2);
                            break block9;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    vl2_2.b(var2_2);
                    var1_1 = (gH3)var1_1;
                    var2_2 = this.b;
                    var2_2.getClass();
                    var1_1 = ((Iterable)var1_1.a).iterator();
                    do {
                        var9_9 = var1_1.hasNext();
                        var6_6 = 0;
                        var10_10 = null;
                        if (!var9_9) break block6;
                        var11_11 = var2_2 = var1_1.next();
                    } while (!(var12_12 = (var11_11 = (pr0)var2_2) instanceof JU0));
                    break block10;
                }
                var9_9 = false;
                var2_2 = null;
            }
            var13_13 = var2_2 instanceof JU0;
            if (var13_13) {
                var10_10 = var2_2;
                var10_10 = (JU0)var2_2;
            }
            if (var10_10 != null) {
                var4_4.b = var7_7;
                var1_1 = this.a.emit(var10_10, var4_4);
                if (var1_1 == var8_8) {
                    return var8_8;
                }
            }
        }
        return Unit.a;
    }
}

