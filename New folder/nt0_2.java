/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/*
 * Renamed from nT0
 */
public final class nt0_2
implements fs0_2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Ref$ObjectRef b;

    public nt0_2(Function2 function2, Ref$ObjectRef ref$ObjectRef) {
        this.a = function2;
        this.b = ref$ObjectRef;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof nT0$a;
        if (var3_3 == 0) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (nT0$a)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new nT0$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl24
        if (var6_6 == var7_7) {
            var1_1 = var4_4.e;
            var4_4 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl24:
            // 1 sources

            vl2_2.b(var2_2);
            var4_4.a = this;
            var4_4.e = var1_1;
            var4_4.c = var7_7;
            var9_9 = 6;
            InlineMarker.mark(var9_9);
            var2_2 = this.a.invoke(var1_1, var4_4);
            var3_3 = 7;
            InlineMarker.mark(var3_3);
            if (var2_2 == var8_8) {
                return var8_8;
            }
            var4_4 = this;
        }
        var2_2 = (Boolean)var2_2;
        var9_9 = (int)var2_2.booleanValue();
        if (var9_9 == 0) {
            return Unit.a;
        }
        var4_4.b.element = var1_1;
        var1_1 = new AbortFlowException((fs0_2)var4_4);
        throw var1_1;
    }
}

