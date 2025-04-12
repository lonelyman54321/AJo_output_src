/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.InlineMarker;

/*
 * Renamed from dT0
 */
public final class dt0_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ hx0_2 b;

    public dt0_1(es0_2 es0_22, Qv3 qv3) {
        this.a = es0_22;
        this.b = qv3;
    }

    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_2) {
        block13: {
            block10: {
                block11: {
                    block12: {
                        var3_3 = var2_2 instanceof dT0$a;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (dT0$a)var2_2;
                        var5_5 = var4_4.b;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.b = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new dT0$a(this, (f80_0)var2_2);
                        }
                        var2_2 = var4_4.a;
                        var8_8 = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.b;
                        var7_7 = 2;
                        var9_9 = 1;
                        if (var6_6 == 0) break block10;
                        if (var6_6 == var9_9) break block11;
                        if (var6_6 != var7_7) break block12;
                        var10_10 = var4_4.g;
                        var1_1 = var4_4.f;
                        var12_11 = var4_4.e;
                        var13_12 = var4_4.d;
                        vl2_2.b(var2_2);
                        break block13;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var10_10 = var4_4.g;
                var1_1 = var4_4.e;
                var12_11 = var4_4.d;
                vl2_2.b(var2_2);
                var13_12 = var12_11;
lbl35:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            vl2_2.b(var2_2);
            var10_10 = 0L;
            var2_2 = this;
lbl41:
            // 2 sources

            while (true) {
                var12_11 = var2_2.a;
                var4_4.d = var2_2;
                var4_4.e = var1_1;
                var13_12 = null;
                var4_4.f = null;
                var4_4.g = var10_10;
                var4_4.b = var9_9;
                if ((var12_11 = ms0_1.e(var4_4, (es0_2)var12_11, (fs0_2)var1_1)) == var8_8) {
                    return var8_8;
                }
                var13_12 = var2_2;
                var2_2 = var12_11;
                ** continue;
                break;
            }
            var12_11 = var1_1;
            var1_1 = var2_2;
            var1_1 = (Throwable)var2_2;
            if (var1_1 != null) {
                var2_2 = var13_12.b;
                var14_13 = new Long(var10_10);
                var4_4.d = var13_12;
                var4_4.e = var12_11;
                var4_4.f = var1_1;
                var4_4.g = var10_10;
                var4_4.b = var7_7;
                var15_14 = 6;
                InlineMarker.mark(var15_14);
                var2_2 = var2_2.invoke(var12_11, var1_1, var14_13, var4_4);
                var16_15 = 7;
                InlineMarker.mark(var16_15);
                if (var2_2 == var8_8) {
                    return var8_8;
                } else {
                    ** GOTO lbl73
                }
            }
            ** GOTO lbl83
        }
        var2_2 = (Boolean)var2_2;
        var17_16 = var2_2.booleanValue();
        if (var17_16) {
            var18_17 = 1L;
            var10_10 += var18_17;
            var2_2 = var13_12;
            var20_18 = true;
        } else {
            throw var1_1;
lbl83:
            // 1 sources

            var20_18 = false;
            var1_1 = null;
            var2_2 = var13_12;
        }
        if (!var20_18) {
            return Unit.a;
        }
        var1_1 = var12_11;
        ** while (true)
    }
}

