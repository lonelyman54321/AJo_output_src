/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from M0
 */
public abstract class m0_0
implements es0_2 {
    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_3) {
        block16: {
            block15: {
                block17: {
                    var3_5 = var2_3 instanceof M0$a;
                    if (!var3_5) ** GOTO lbl-1000
                    var4_6 = var2_3;
                    var4_6 = (M0$a)var2_3;
                    var5_7 = var4_6.d;
                    var6_8 = -1 << -1;
                    var7_9 = var5_7 & var6_8;
                    if (var7_9 != 0) {
                        var4_6.d = var5_7 -= var6_8;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_6 = new M0$a(this, (f80_0)var2_3);
                    }
                    var2_3 = var4_6.b;
                    var8_10 = j90_0.COROUTINE_SUSPENDED;
                    var6_8 = var4_6.d;
                    var7_9 = 1;
                    if (var6_8 != 0) {
                        if (var6_8 == var7_9) {
                            var1_1 = var4_6.a;
                            try {
                                vl2_2.b(var2_3);
                                break block15;
                            }
                            catch (Throwable var2_4) {
                                break block16;
                            }
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    vl2_2.b(var2_3);
                    var9_11 = var4_6.getContext();
                    var2_3 = new yr2_2((fs0_2)var1_1, var9_11);
                    try {
                        var4_6.a = var2_3;
                    }
                    catch (Throwable var1_2) {
                        ** continue;
                    }
                    var4_6.d = var7_9;
                    var1_1 = this;
                    var1_1 = (br2_2)this;
                    var1_1 = var1_1.a;
                    var1_1 = var1_1.invoke(var2_3, var4_6);
                    if (var1_1 == var8_10) break block17;
                    var1_1 = Unit.a;
                }
                if (var1_1 == var8_10) {
                    return var8_10;
                }
                var1_1 = var2_3;
            }
            var1_1.releaseIntercepted();
            return Unit.a;
lbl52:
            // 1 sources

            while (true) {
                var10_12 = var2_3;
                var2_3 = var1_2;
                var1_1 = var10_12;
                break;
            }
        }
        var1_1.releaseIntercepted();
        throw var2_3;
    }
}

