/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;

/*
 * Renamed from YS0
 */
public final class ys0_2
implements es0_2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ es0_2 b;

    public ys0_2(es0_2 es0_22, Function2 function2) {
        this.a = function2;
        this.b = es0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_3) {
        block18: {
            var3_5 = var2_3 instanceof YS0$a;
            if (!var3_5) ** GOTO lbl-1000
            var4_6 = var2_3;
            var4_6 = (YS0$a)var2_3;
            var5_7 = var4_6.b;
            var6_8 = -1 << -1;
            var7_9 = var5_7 & var6_8;
            if (var7_9 != 0) {
                var4_6.b = var5_7 -= var6_8;
            } else lbl-1000:
            // 2 sources

            {
                var4_6 = new YS0$a(this, (f80_0)var2_3);
            }
            var2_3 = var4_6.a;
            var8_10 = j90_0.COROUTINE_SUSPENDED;
            var6_8 = var4_6.b;
            var7_9 = 2;
            var9_11 = 1;
            if (var6_8 == 0) ** GOTO lbl32
            if (var6_8 == var9_11) ** GOTO lbl24
            if (var6_8 == var7_9) {
                vl2_2.b(var2_3);
            } else {
                block17: {
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
lbl24:
                    // 1 sources

                    var1_1 = var4_6.f;
                    var10_12 = var4_6.e;
                    var11_13 = var4_6.d;
                    try {
                        vl2_2.b(var2_3);
                        break block17;
                    }
                    catch (Throwable var2_4) {
                        break block18;
                    }
lbl32:
                    // 1 sources

                    vl2_2.b(var2_3);
                    var10_12 = var4_6.getContext();
                    var2_3 = new yr2_2((fs0_2)var1_1, (CoroutineContext)var10_12);
                    var10_12 = this.a;
                    var4_6.d = this;
                    var4_6.e = var1_1;
                    var4_6.f = var2_3;
                    var4_6.b = var9_11;
                    var9_11 = 6;
                    InlineMarker.mark(var9_11);
                    var10_12 = var10_12.invoke(var2_3, var4_6);
                    var9_11 = 7;
                    InlineMarker.mark(var9_11);
                    if (var10_12 == var8_10) {
                        return var8_10;
                    }
                    var11_13 = this;
                    var10_12 = var1_1;
                    var1_1 = var2_3;
                }
                var1_1.releaseIntercepted();
                var1_1 = var11_13.b;
                var2_3 = null;
                var4_6.d = null;
                var4_6.e = null;
                var4_6.f = null;
                var4_6.b = var7_9;
                var1_1 = var1_1.collect((fs0_2)var10_12, var4_6);
                if (var1_1 == var8_10) {
                    return var8_10;
                }
            }
            return Unit.a;
            catch (Throwable var1_2) {
                var12_14 = var2_3;
                var2_3 = var1_2;
                var1_1 = var12_14;
            }
        }
        var1_1.releaseIntercepted();
        throw var2_3;
    }
}

