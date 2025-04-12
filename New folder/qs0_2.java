/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/*
 * Renamed from QS0
 */
public final class qs0_2 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(fs0_2 var0, af2_2 var1_2, boolean var2_3, f80_0 var3_4) {
        block17: {
            block18: {
                block19: {
                    var4_6 = var3_4 instanceof QS0$a;
                    if (!var4_6) ** GOTO lbl-1000
                    var5_7 = var3_4;
                    var5_7 = (QS0$a)var3_4;
                    var6_8 = var5_7.f;
                    var7_9 = -1 << -1;
                    var8_10 = var6_8 & var7_9;
                    if (var8_10 != 0) {
                        var5_7.f = var6_8 -= var7_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_7 = new h80_0((f80_0)var3_4);
                    }
                    var3_4 = var5_7.e;
                    var9_11 = j90_0.COROUTINE_SUSPENDED;
                    var7_9 = var5_7.f;
                    var8_10 = 0;
                    var10_12 = null;
                    var11_13 = 2;
                    var12_14 = 1;
                    if (var7_9 == 0) break block18;
                    if (var7_9 == var12_14) break block19;
                    if (var7_9 != var11_13) {
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    var2_3 = var5_7.d;
                    var0 = var5_7.c;
                    var1_2 = var5_7.b;
                    var13_15 = var5_7.a;
                    try {
                        vl2_2.b(var3_4);
                    }
                    catch (Throwable var0_1) {
                        break block17;
                    }
                    while (true) {
                        var3_4 = var0;
                        var0 = var13_15;
                        ** GOTO lbl50
                        break;
                    }
                }
                var2_3 = var5_7.d;
                var0 = var5_7.c;
                var1_2 = var5_7.b;
                var13_15 = var5_7.a;
                {
                    vl2_2.b(var3_4);
                    ** GOTO lbl-1000
                }
            }
            vl2_2.b(var3_4);
            var14_16 = var0 instanceof qn3_0;
            if (!var14_16) ** GOTO lbl-1000
            throw ((qn3_0)var0).a;
lbl-1000:
            // 1 sources

            {
                var3_4 = var1_2.iterator();
lbl50:
                // 2 sources

                var5_7.a = var0;
                var5_7.b = var1_2;
                var5_7.c = var3_4;
                var5_7.d = var2_3;
                var5_7.f = var12_14;
                var13_15 = var3_4.b(var5_7);
                if (var13_15 == var9_11) {
                    return var9_11;
                }
                var15_17 = var13_15;
                var13_15 = var0;
                var0 = var3_4;
                var3_4 = var15_17;
            }
lbl-1000:
            // 2 sources

            {
                var3_4 = (Boolean)var3_4;
                var14_16 = var3_4.booleanValue();
                if (var14_16) {
                    var3_4 = var0.next();
                    var5_7.a = var13_15;
                    var5_7.b = var1_2;
                    var5_7.c = var0;
                    var5_7.d = var2_3;
                    var5_7.f = var11_13;
                    if ((var3_4 = var13_15.emit(var3_4, var5_7)) != var9_11) ** continue;
                    return var9_11;
                }
                if (var2_3) {
                    var1_2.d(null);
                }
                return Unit.a;
            }
        }
        try {
            throw var0_1;
        }
        catch (Throwable var3_5) {
            if (var2_3) {
                var2_3 = var0_1 instanceof CancellationException;
                if (var2_3) {
                    var10_12 = var0_1;
                    var10_12 = (CancellationException)var0_1;
                }
                if (var10_12 == null) {
                    var16_18 = "Channel was consumed, consumer had failed";
                    var10_12 = xc0_2.a(var16_18, var0_1);
                }
                var1_2.d((CancellationException)var10_12);
            }
            throw var3_5;
        }
    }
}

