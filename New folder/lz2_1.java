/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.i$a;

/*
 * Renamed from Lz2
 */
public final class lz2_1 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(pz2_2 var0, Function0 var1_2, f80_0 var2_3) {
        block10: {
            block9: {
                block11: {
                    var3_4 = var2_3 instanceof Lz2$a;
                    if (!var3_4) ** GOTO lbl-1000
                    var4_5 = var2_3;
                    var4_5 = (Lz2$a)var2_3;
                    var5_6 = var4_5.d;
                    var6_7 = -1 << -1;
                    var7_8 = var5_6 & var6_7;
                    if (var7_8 != 0) {
                        var4_5.d = var5_6 -= var6_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_5 = new h80_0((f80_0)var2_3);
                    }
                    var2_3 = var4_5.c;
                    var8_9 = j90_0.COROUTINE_SUSPENDED;
                    var6_7 = var4_5.d;
                    var7_8 = 1;
                    if (var6_7 != 0) {
                        if (var6_7 != var7_8) {
                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var0;
                        }
                        var1_2 = var4_5.b;
                        try {
                            vl2_2.b(var2_3);
                            break block9;
                        }
                        catch (Throwable var0_1) {
                            break block10;
                        }
                    }
                    vl2_2.b(var2_3);
                    var2_3 = var4_5.getContext();
                    var9_10 = i$a.a;
                    var2_3 = var2_3.get((CoroutineContext$a)var9_10);
                    if (var2_3 == var0) ** GOTO lbl-1000
                    var1_2 = "awaitClose() can only be invoked from the producer context".toString();
                    var0 = new IllegalStateException((String)var1_2);
                    throw var0;
lbl-1000:
                    // 1 sources

                    {
                        var4_5.a = var0;
                        var4_5.b = var1_2;
                        var4_5.d = var7_8;
                        var9_10 = zj1_2.b(var4_5);
                        var2_3 = new CancellableContinuationImpl(var7_8, (f80_0)var9_10);
                        var2_3.r();
                        var9_10 = new Lz2$b((CancellableContinuationImpl)var2_3);
                        var0.i((Lz2$b)var9_10);
                        var0 = var2_3.q();
                        if (var0 != var8_9) break block11;
                        var2_3 = "frame";
                    }
                    {
                        Intrinsics.checkNotNullParameter(var4_5, (String)var2_3);
                    }
                }
                if (var0 == var8_9) {
                    return var8_9;
                }
            }
            var1_2.invoke();
            return Unit.a;
        }
        var1_2.invoke();
        throw var0_1;
    }
}

