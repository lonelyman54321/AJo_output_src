/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.InlineMarker;

/*
 * Renamed from aT0
 */
public final class at0_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ gx0_2 b;

    public at0_1(es0_2 es0_22, gx0_2 gx0_22) {
        this.a = es0_22;
        this.b = gx0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_2) {
        block8: {
            block9: {
                block5: {
                    block6: {
                        block7: {
                            var3_3 = var2_2 instanceof aT0$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (aT0$a)var2_2;
                            var5_5 = var4_4.b;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.b = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new aT0$a(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.a;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.b;
                            var7_7 = 2;
                            var9_9 = 1;
                            if (var6_6 == 0) break block5;
                            if (var6_6 == var9_9) break block6;
                            if (var6_6 != var7_7) break block7;
                            vl2_2.b(var2_2);
                            break block8;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var4_4.e;
                    var10_10 = var4_4.d;
                    vl2_2.b(var2_2);
                    break block9;
                }
                vl2_2.b(var2_2);
                var4_4.d = this;
                var4_4.e = var1_1;
                var4_4.b = var9_9;
                var2_2 = this.a;
                var2_2 = ms0_1.e(var4_4, (es0_2)var2_2, (fs0_2)var1_1);
                if (var2_2 == var8_8) {
                    return var8_8;
                }
                var10_10 = this;
            }
            var2_2 = (Throwable)var2_2;
            if (var2_2 != null) {
                var10_10 = var10_10.b;
                var9_9 = 0;
                var4_4.d = null;
                var4_4.e = null;
                var4_4.b = var7_7;
                var7_7 = 6;
                InlineMarker.mark(var7_7);
                var1_1 = var10_10.invoke(var1_1, var2_2, var4_4);
                var11_11 = 7;
                InlineMarker.mark(var11_11);
                if (var1_1 == var8_8) {
                    return var8_8;
                }
            }
        }
        return Unit.a;
    }
}

