/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class wn2
implements yp1_2 {
    public final yp1_2 a;
    public final lp1_0 b;

    public wn2(yp1_2 object) {
        this.a = object;
        this.b = object = new lp1_0();
    }

    /*
     * Unable to fully structure code
     */
    public final Object R(Function1 var1_1, f80_0 var2_3) {
        block15: {
            block16: {
                block12: {
                    block13: {
                        block14: {
                            var3_4 = var2_3 instanceof wn2$a;
                            if (!var3_4) ** GOTO lbl-1000
                            var4_5 = var2_3;
                            var4_5 = (wn2$a)var2_3;
                            var5_6 = var4_5.e;
                            var6_7 = -1 << -1;
                            var7_8 = var5_6 & var6_7;
                            if (var7_8 != 0) {
                                var4_5.e = var5_6 -= var6_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_5 = new wn2$a(this, (f80_0)var2_3);
                            }
                            var2_3 = var4_5.c;
                            var8_9 = j90_0.COROUTINE_SUSPENDED;
                            var6_7 = var4_5.e;
                            var7_8 = 2;
                            var9_10 = 1;
                            if (var6_7 == 0) break block12;
                            if (var6_7 == var9_10) break block13;
                            if (var6_7 != var7_8) break block14;
                            vl2_2.b(var2_3);
                            break block15;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var4_5.b;
                    var10_11 = var4_5.a;
                    vl2_2.b(var2_3);
                    break block16;
                }
                vl2_2.b(var2_3);
                var2_3 = this.b;
                var4_5.a = this;
                var10_11 = var1_1;
                var4_5.b = var10_11 = (Function1)var1_1;
                var4_5.e = var9_10;
                var6_7 = (int)var2_3.a();
                if (var6_7 != 0) {
                    var2_3 = Unit.a;
                } else {
                    block11: {
                        var11_12 = zj1_2.b(var4_5);
                        var10_11 = new CancellableContinuationImpl(var9_10, (f80_0)var11_12);
                        var10_11.r();
                        var12_13 = var2_3.a;
                        synchronized (var12_13) {
                            var11_12 = var2_3.b;
                            var11_12.add(var10_11);
                            // MONITOREXIT @DISABLED, blocks:[1, 2, 9] lbl48 : MonitorExitStatement: MONITOREXIT : var12_13
                            var12_13 = new kp1_2((lp1_0)var2_3, (CancellableContinuationImpl)var10_11);
                            var10_11.x((Function1)var12_13);
                            var2_3 = var10_11.q();
                            if (var2_3 != var8_9) break block11;
                            var10_11 = "frame";
                        }
                        Intrinsics.checkNotNullParameter(var4_5, (String)var10_11);
                    }
                    if (var2_3 != var8_9) {
                        var2_3 = Unit.a;
                    }
                }
                if (var2_3 == var8_9) {
                    return var8_9;
                }
                var10_11 = this;
            }
            var2_3 = var10_11.a;
            var6_7 = 0;
            var10_11 = null;
            var4_5.a = null;
            var4_5.b = null;
            var4_5.e = var7_8;
            var2_3 = var2_3.R((Function1)var1_1, var4_5);
            if (var2_3 == var8_9) {
                return var8_9;
            }
        }
        return var2_3;
        {
            catch (Throwable var1_2) {
                throw var1_2;
            }
        }
    }

    public final Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public final CoroutineContext$a getKey() {
        return YP1$a.a;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }
}

