/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/*
 * Renamed from jT0
 */
public final class jt0_2
implements fs0_2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ fs0_2 b;

    public jt0_2(fs0_2 fs0_22, Function2 function2) {
        this.a = function2;
        this.b = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block10: {
            block11: {
                block7: {
                    block8: {
                        block9: {
                            var3_3 = var2_2 instanceof jT0$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (jT0$a)var2_2;
                            var5_5 = var4_4.c;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.c = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new jT0$a(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.b;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.c;
                            var7_7 = 2;
                            var9_9 = 1;
                            if (var6_6 == 0) break block7;
                            if (var6_6 == var9_9) break block8;
                            if (var6_6 != var7_7) break block9;
                            var1_1 = var4_4.a;
                            vl2_2.b(var2_2);
                            break block10;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var4_4.e;
                    var10_10 = var4_4.a;
                    vl2_2.b(var2_2);
                    var11_11 = var2_2;
                    var2_2 = var1_1;
                    var1_1 = var10_10;
                    var10_10 = var11_11;
                    break block11;
                }
                vl2_2.b(var2_2);
                var4_4.a = this;
                var4_4.e = var1_1;
                var4_4.c = var9_9;
                var12_12 = 6;
                InlineMarker.mark(var12_12);
                var2_2 = this.a.invoke(var1_1, var4_4);
                var6_6 = 7;
                InlineMarker.mark(var6_6);
                if (var2_2 == var8_8) {
                    return var8_8;
                }
                var10_10 = var2_2;
                var2_2 = var1_1;
                var1_1 = this;
            }
            var10_10 = (Boolean)var10_10;
            var6_6 = (int)var10_10.booleanValue();
            if (var6_6 != 0) {
                var10_10 = var1_1.b;
                var4_4.a = var1_1;
                var4_4.e = null;
                var4_4.c = var7_7;
                if ((var2_2 = var10_10.emit(var2_2, var4_4)) == var8_8) {
                    return var8_8;
                }
            } else {
                var9_9 = 0;
            }
        }
        if (var9_9 != 0) {
            return Unit.a;
        }
        var2_2 = new AbortFlowException((fs0_2)var1_1);
        throw var2_2;
    }
}

