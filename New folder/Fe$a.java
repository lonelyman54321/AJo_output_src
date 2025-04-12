/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.material.AnchoredDragFinishedSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.i;

public final class Fe$a
implements fs0_2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ Function2 c;

    public Fe$a(Ref$ObjectRef ref$ObjectRef, i90_0 i90_02, Function2 function2) {
        this.a = ref$ObjectRef;
        this.b = i90_02;
        this.c = function2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof Fe$a$b;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (Fe$a$b)var2_2;
        var5_5 = var4_4.f;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.f = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new Fe$a$b(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.d;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.f;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl24
        if (var6_6 == var7_7) {
            var1_1 = var4_4.b;
            var4_4 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl24:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = (i)this.a.element;
            if (var2_2 != null) {
                var9_9 /* !! */  = new AnchoredDragFinishedSignal();
                var2_2.d(var9_9 /* !! */ );
                var4_4.a = this;
                var4_4.b = var1_1;
                var4_4.c = var2_2;
                var4_4.f = var7_7;
                var2_2 = var2_2.I0((f80_0)var4_4);
                if (var2_2 == var8_8) {
                    return var8_8;
                }
            }
            var4_4 = this;
        }
        var2_2 = var4_4.a;
        var8_8 = l90_0.UNDISPATCHED;
        var10_10 = var4_4.c;
        var4_4 = var4_4.b;
        var9_9 /* !! */  = new Fe$a$a(var10_10, var1_1, (i90_0)var4_4, null);
        var2_2.element = var1_1 = Ae3.d((i90_0)var4_4, null, (l90_0)var8_8, (Function2)var9_9 /* !! */ , var7_7);
        return Unit.a;
    }
}

