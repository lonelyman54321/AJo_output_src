/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/*
 * Renamed from iT0
 */
public final class it0_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ Function2 b;

    public it0_2(es0_2 es0_22, rJ$a rJ$a) {
        this.a = es0_22;
        this.b = rJ$a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_2) {
        block18: {
            block16: {
                block17: {
                    var3_6 = var2_2 instanceof iT0$a;
                    if (!var3_6) ** GOTO lbl-1000
                    var4_7 = var2_2;
                    var4_7 = (iT0$a)var2_2;
                    var5_8 = var4_7.b;
                    var6_9 = -1 << -1;
                    var7_10 = var5_8 & var6_9;
                    if (var7_10 != 0) {
                        var4_7.b = var5_8 -= var6_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_7 = new iT0$a(this, (f80_0)var2_2);
                    }
                    var2_2 = var4_7.a;
                    var8_11 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var6_9 = var4_7.b;
                    var7_10 = 1;
                    if (var6_9 != 0) {
                        if (var6_9 == var7_10) {
                            var1_1 = var4_7.d;
                            try {
                                vl2_2.b(var2_2);
                                break block16;
                            }
                            catch (AbortFlowException var2_3) {
                                break block17;
                            }
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    vl2_2.b(var2_2);
                    var2_2 = this.a;
                    var10_13 = this.b;
                    var9_12 = new jt0_2((fs0_2)var1_1, var10_13);
                    var4_7.d = var9_12;
                    var4_7.b = var7_10;
                    try {
                        var1_1 = var2_2.collect(var9_12, var4_7);
                        if (var1_1 == var8_11 /* !! */ ) {
                            return var8_11 /* !! */ ;
                        }
                        break block16;
                    }
                    catch (AbortFlowException var2_4) {
                        var1_1 = var9_12;
                    }
                }
                var8_11 /* !! */  = var2_5.a;
                if (var8_11 /* !! */  != var1_1) break block18;
                var1_1 = var4_7.getContext();
                mm0.c((CoroutineContext)var1_1);
            }
            return Unit.a;
        }
        throw var2_5;
    }
}

