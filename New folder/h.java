/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class h {
    /*
     * Unable to fully structure code
     */
    public static final Object a(i var0, f80_0 var1_1) {
        block22: {
            block21: {
                block23: {
                    var2_3 = var1_1 instanceof h$a;
                    if (!var2_3) ** GOTO lbl-1000
                    var3_4 = var1_1;
                    var3_4 = (h$a)var1_1;
                    var4_6 = var3_4.d;
                    var5_7 = -1 << -1;
                    var6_8 = var4_6 & var5_7;
                    if (var6_8 != 0) {
                        var3_4.d = var4_6 -= var5_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_4 = new h80_0((f80_0)var1_1);
                    }
                    var1_1 = var3_4.c;
                    var7_9 = j90_0.COROUTINE_SUSPENDED;
                    var5_7 = var3_4.d;
                    var6_8 = 1;
                    if (var5_7 != 0) {
                        if (var5_7 == var6_8) {
                            var0 = var3_4.b;
                            var3_4 = var3_4.a;
                            try {
                                vl2_2.b(var1_1);
                                break block21;
                            }
                            catch (Throwable var1_2) {
                                break block22;
                            }
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var1_1);
                    var1_1 = var0.b();
                    var8_10 = i$b.STARTED;
                    var9_11 = var1_1.isAtLeast((i$b)var8_10);
                    if (var9_11) {
                        return Unit.a;
                    }
                    var1_1 = new Ref$ObjectRef();
                    var3_4.a = var0;
                    var3_4.b = var1_1;
                    var3_4.d = var6_8;
                    var10_12 = zj1_2.b((f80_0)var3_4);
                    var8_10 = new CancellableContinuationImpl(var6_8, var10_12);
                    var8_10.r();
                    var11_13 = new h$b((bl_2)var8_10);
                    var1_1.element = var11_13;
                    Intrinsics.checkNotNull(var11_13);
                    var0.a((lu1)var11_13);
                    var8_10 = var8_10.q();
                    if (var8_10 != var7_9) break block23;
                    var11_13 = "frame";
                    try {
                        Intrinsics.checkNotNullParameter(var3_4, (String)var11_13);
                    }
                    catch (Throwable var3_5) {
                        ** continue;
                    }
lbl60:
                    // 1 sources

                    while (true) {
                        var12_14 = var3_5;
                        var3_4 = var0;
                        var0 = var1_1;
                        var1_1 = var12_14;
                        break block22;
                        break;
                    }
                }
                if (var8_10 == var7_9) {
                    return var7_9;
                }
                var3_4 = var0;
                var0 = var1_1;
            }
            var0 = (lu1)var0.element;
            if (var0 != null) {
                var3_4.c((lu1)var0);
            }
            return Unit.a;
        }
        var0 = (lu1)var0.element;
        if (var0 != null) {
            var3_4.c((lu1)var0);
        }
        throw var1_1;
    }
}

