/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.InlineMarker;

/*
 * Renamed from XS0
 */
public final class xs0_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ gx0_2 b;

    public xs0_2(es0_2 es0_22, gx0_2 gx0_22) {
        this.a = es0_22;
        this.b = gx0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_5) {
        var3_7 = var2_5 instanceof XS0$a;
        if (var3_7 == 0) ** GOTO lbl-1000
        var4_8 = var2_5;
        var4_8 = (XS0$a)var2_5;
        var5_9 = var4_8.b;
        var6_10 = -1 << -1;
        var7_11 = var5_9 & var6_10;
        if (var7_11 != 0) {
            var4_8.b = var5_9 -= var6_10;
        } else lbl-1000:
        // 2 sources

        {
            var4_8 = new XS0$a(this, (f80_0)var2_5);
        }
        var2_5 = var4_8.a;
        var8_12 = j90_0.COROUTINE_SUSPENDED;
        var6_10 = var4_8.b;
        var7_11 = 3;
        var9_13 = 2;
        var10_14 = 1;
        if (var6_10 == 0) ** GOTO lbl40
        if (var6_10 != var10_14) {
            if (var6_10 != var9_13) {
                if (var6_10 == var7_11) {
                    var1_1 = (yr2_2)var4_8.d;
                    try {
                        vl2_2.b(var2_5);
                        break block27;
                    }
                    catch (Throwable var2_6) {
                        break block28;
                    }
                }
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            var1_1 = (Throwable)var4_8.d;
            vl2_2.b(var2_5);
        } else {
            block30: {
                block28: {
                    block27: {
                        block29: {
                            var1_1 = var4_8.e;
                            var11_15 = (xs0_2)var4_8.d;
                            try {
                                vl2_2.b(var2_5);
                                break block29;
                            }
                            catch (Throwable var1_2) {
                                break block30;
                            }
lbl40:
                            // 1 sources

                            vl2_2.b(var2_5);
                            var2_5 = this.a;
                            var4_8.d = this;
                            var4_8.e = var1_1;
                            var4_8.b = var10_14;
                            var2_5 = var2_5.collect((fs0_2)var1_1, var4_8);
                            if (var2_5 == var8_12) {
                                return var8_12;
                            }
                            var11_15 = this;
                        }
                        var12_16 = var4_8.getContext();
                        var2_5 = new yr2_2((fs0_2)var1_1, var12_16);
                        var1_1 = var11_15.b;
                        var4_8.d = var2_5;
                        var4_8.e = null;
                        var4_8.b = var7_11;
                        var6_10 = 6;
                        InlineMarker.mark(var6_10);
                        var1_1 = var1_1.invoke(var2_5, null, var4_8);
                        var3_7 = 7;
                        try {
                            InlineMarker.mark(var3_7);
                            if (var1_1 == var8_12) {
                                return var8_12;
                            }
                            var1_1 = var2_5;
                        }
                        catch (Throwable var1_3) {
                            var13_17 = var2_5;
                            var2_5 = var1_3;
                            var1_1 = var13_17;
                        }
                    }
                    var1_1.releaseIntercepted();
                    return Unit.a;
                }
                var1_1.releaseIntercepted();
                throw var2_5;
                catch (Throwable var1_4) {
                    var11_15 = this;
                }
            }
            var2_5 = new qn3_0((Throwable)var1_1);
            var11_15 = var11_15.b;
            var4_8.d = var1_1;
            var4_8.e = null;
            var4_8.b = var9_13;
            var2_5 = zs0_2.a((qn3_0)var2_5, (gx0_2)var11_15, (Throwable)var1_1, var4_8);
            if (var2_5 == var8_12) {
                return var8_12;
            }
        }
        throw var1_1;
    }
}

