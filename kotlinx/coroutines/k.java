/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutCoroutine;
import kotlinx.coroutines.k$a;

public final class k {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(TimeoutCoroutine timeoutCoroutine, Function2 object) {
        gh3_2 gh3_22;
        boolean bl2;
        int n3;
        Object object2;
        Object object3;
        block7: {
            Throwable throwable2;
            block8: {
                object3 = bo0_2.b(timeoutCoroutine.d.getContext());
                long l2 = timeoutCoroutine.e;
                CoroutineContext coroutineContext = timeoutCoroutine.c;
                object3 = object3.H(l2, timeoutCoroutine, coroutineContext);
                object2 = new or0_2((fr0_1)object3);
                mm0.f(timeoutCoroutine, (cl1_2)object2);
                n3 = object instanceof xv_1;
                if (n3 == 0) {
                    try {
                        object = zj1_2.c((Function2)object, timeoutCoroutine, timeoutCoroutine);
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                n3 = 2;
                object = TypeIntrinsics.beforeCheckcastToFunctionOfArity(object, n3);
                object = (Function2)object;
                object = object.invoke(timeoutCoroutine, timeoutCoroutine);
                break block7;
            }
            bl2 = false;
            object2 = null;
            object = object3 = new m00_0(throwable2, false);
        }
        object3 = j90_0.COROUTINE_SUSPENDED;
        if (object == object3) {
            return object3;
        }
        object2 = timeoutCoroutine.m0(object);
        if (object2 == (gh3_22 = y61.b)) {
            return object3;
        }
        n3 = object2 instanceof m00_0;
        if (n3 != 0) {
            object2 = (m00_0)object2;
            object3 = ((m00_0)object2).a;
            bl2 = object3 instanceof TimeoutCancellationException;
            if (!bl2) throw (Throwable)object3;
            object2 = object3;
            object2 = ((TimeoutCancellationException)object3).a;
            if (object2 != timeoutCoroutine) throw (Throwable)object3;
            boolean bl3 = object instanceof m00_0;
            if (bl3) throw ((m00_0)object).a;
            return object;
        } else {
            object = y61.b(object2);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object b(long var0, Function2 var2_1, f80_0 var3_2) {
        block21: {
            block20: {
                block22: {
                    var4_3 = var3_2 instanceof k$a;
                    if (!var4_3) ** GOTO lbl-1000
                    var5_4 = var3_2;
                    var5_4 = (k$a)var3_2;
                    var6_5 = var5_4.d;
                    var7_6 = -1 << -1;
                    var8_7 = var6_5 & var7_6;
                    if (var8_7 != 0) {
                        var5_4.d = var6_5 -= var7_6;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_4 = new h80_0((f80_0)var3_2);
                    }
                    var3_2 = var5_4.c;
                    var9_8 = j90_0.COROUTINE_SUSPENDED;
                    var7_6 = var5_4.d;
                    var8_7 = 0;
                    var10_9 = 1;
                    if (var7_6 != 0) {
                        if (var7_6 == var10_9) {
                            var11_10 = var5_4.b;
                            try {
                                vl2_2.b(var3_2);
                                break block20;
                            }
                            catch (TimeoutCancellationException var12_14) {
                                break block21;
                            }
                        }
                        var11_11 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var11_11;
                    }
                    vl2_2.b(var3_2);
                    var13_17 = 0L;
                    var15_18 = var0 == var13_17 ? 0 : (var0 < var13_17 ? -1 : 1);
                    if (var15_18 <= 0) {
                        return null;
                    }
                    var3_2 = new Ref$ObjectRef();
                    try {
                        var5_4.a = var2_1;
                    }
                    catch (TimeoutCancellationException var12_16) {
                        ** continue;
                    }
                    var5_4.b = var3_2;
                    var5_4.d = var10_9;
                    var16_19 = new TimeoutCoroutine(var0, (k$a)var5_4);
                    var3_2.element = var16_19;
                    var11_12 = k.a(var16_19, (Function2)var2_1);
                    if (var11_12 != var9_8) break block22;
                    var12_15 = "frame";
                    try {
                        Intrinsics.checkNotNullParameter(var5_4, (String)var12_15);
                    }
                    catch (TimeoutCancellationException var11_13) {
                        ** continue;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        var12_15 = var11_13;
                        break;
                    }
lbl58:
                    // 2 sources

                    while (true) {
                        var11_10 = var3_2;
                        break block21;
                        break;
                    }
                }
                if (var11_12 == var9_8) {
                    return var9_8;
                }
                var3_2 = var11_12;
            }
            return var3_2;
        }
        var2_1 = var12_15.a;
        var11_10 = var11_10.element;
        if (var2_1 == var11_10) {
            return null;
        }
        throw var12_15;
    }
}

