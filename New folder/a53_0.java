/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from A53
 */
public final class a53_0
implements x53_0,
i90_0,
fz2_1 {
    public final fz2_1 a;
    public final /* synthetic */ i90_0 b;

    public a53_0(i90_0 i90_02, le_2 le_22) {
        Intrinsics.checkNotNullParameter(i90_02, "scope");
        Intrinsics.checkNotNullParameter(le_22, "channel");
        this.a = le_22;
        this.b = i90_02;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object h(xk2$b$c var1_1, f80_0 var2_2) {
        block11: {
            block12: {
                block10: {
                    block13: {
                        var3_4 = var2_2 instanceof y53_0;
                        if (!var3_4) ** GOTO lbl-1000
                        var4_5 = var2_2;
                        var4_5 = (y53_0)var2_2;
                        var5_6 = var4_5.e;
                        var6_7 = -1 << -1;
                        var7_8 = var5_6 & var6_7;
                        if (var7_8 != 0) {
                            var4_5.e = var5_6 -= var6_7;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_5 = new y53_0(this, (f80_0)var2_2);
                        }
                        var2_2 = var4_5.c;
                        var8_9 = j90_0.COROUTINE_SUSPENDED;
                        var6_7 = var4_5.e;
                        var7_8 = 1;
                        if (var6_7 != 0) {
                            if (var6_7 != var7_8) {
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var1_1 = var4_5.a;
                            try {
                                vl2_2.b(var2_2);
                                break block10;
                            }
                            catch (Throwable var2_3) {
                                break block11;
                            }
                        }
                        vl2_2.b(var2_2);
                        {
                            var2_2 = this.b;
                            var2_2 = var2_2.getCoroutineContext();
                            var9_10 = i$a.a;
                            var2_2 = var2_2.get((CoroutineContext$a)var9_10);
                            if (var2_2 == null) break block12;
                            var2_2 = (i)var2_2;
                            var4_5.a = var1_1;
                            var4_5.b = var2_2;
                            var4_5.e = var7_8;
                            var10_11 = zj1_2.b((f80_0)var4_5);
                            var9_10 = new CancellableContinuationImpl(var7_8, var10_11);
                            var9_10.r();
                            var11_12 = new z53_0((CancellableContinuationImpl)var9_10);
                            var2_2.G(var11_12);
                            var2_2 = var9_10.q();
                            if (var2_2 != var8_9) break block13;
                            var9_10 = "frame";
                        }
                        {
                            Intrinsics.checkNotNullParameter(var4_5, (String)var9_10);
                        }
                    }
                    if (var2_2 == var8_9) {
                        return var8_9;
                    }
                }
                var1_1.invoke();
                return Unit.a;
            }
            var2_2 = "Internal error, context should have a job.";
            {
                var2_2 = var2_2.toString();
                var4_5 = new IllegalStateException((String)var2_2);
                throw var4_5;
            }
        }
        var1_1.invoke();
        throw var2_3;
    }

    public final Object j(Object object) {
        return this.a.j(object);
    }

    public final Object o(f80_0 f80_02, Object object) {
        return this.a.o(f80_02, object);
    }

    public final boolean q(Throwable throwable) {
        return this.a.q(throwable);
    }
}

