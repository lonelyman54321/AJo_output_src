/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.m;

/*
 * Renamed from Tr
 */
public final class tr_1
implements ur_2 {
    /*
     * Unable to fully structure code
     */
    public static final Object b(f80_0 var0) {
        block11: {
            block13: {
                block12: {
                    block10: {
                        var1_2 = var0.getContext();
                        mm0.c((CoroutineContext)var1_2);
                        var2_3 = zj1_2.b(var0);
                        var3_4 = var2_3 instanceof DispatchedContinuation;
                        var2_3 = var3_4 != false ? (DispatchedContinuation)var2_3 : null;
                        if (var2_3 != null) break block10;
                        var1_2 = Unit.a;
                        break block11;
                    }
                    var4_5 = var2_3.d;
                    var5_7 = dr0_2.c((c)var4_5, (CoroutineContext)var1_2);
                    var6_8 = true;
                    if (!var5_7) break block12;
                    var7_9 = Unit.a;
                    var2_3.f = var7_9;
                    var2_3.c = var6_8;
                    var4_5.K0((CoroutineContext)var1_2, (Runnable)var2_3);
                    break block13;
                }
                var7_10 = new m();
                var1_2 = var1_2.plus(var7_10);
                var8_11 = Unit.a;
                var2_3.f = var8_11;
                var2_3.c = var6_8;
                var4_5.K0((CoroutineContext)var1_2, (Runnable)var2_3);
                var9_12 = var7_10.a;
                if (!var9_12) break block13;
                var1_2 = cn3_0.a();
                var4_5 = var1_2.d;
                var3_4 = var4_5 != null ? var4_5.isEmpty() : true;
                if (var3_4) ** GOTO lbl48
                var3_4 = var1_2.Q0();
                if (var3_4) {
                    var2_3.f = var8_11;
                    var2_3.c = var6_8;
                    var1_2.O0((DispatchedTask)var2_3);
                    var1_2 = j90_0.COROUTINE_SUSPENDED;
                } else {
                    var1_2.P0(var6_8);
                    try {
                        var2_3.run();
                        while (var3_4 = var1_2.S0()) {
                        }
                    }
                    catch (Throwable var4_6) {
                        var2_3.g(var4_6);
                    }
lbl48:
                    // 3 sources

                    var1_2 = Unit.a;
                }
                break block11;
                {
                    finally {
                        var1_2.N0(var6_8);
                    }
                }
            }
            var1_2 = j90_0.COROUTINE_SUSPENDED;
        }
        var2_3 = j90_0.COROUTINE_SUSPENDED;
        if (var1_2 == var2_3) {
            var4_5 = "frame";
            Intrinsics.checkNotNullParameter(var0, (String)var4_5);
        }
        if (var1_2 == var2_3) {
            return var1_2;
        }
        return Unit.a;
    }

    public void a(wp2_2 wp2_22, cl2_2 cl2_22) {
        Intrinsics.checkNotNullParameter(cl2_22, "response");
    }
}

