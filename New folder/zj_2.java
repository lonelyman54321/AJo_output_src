/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ZJ
 */
public final class zj_2
extends jr_2 {
    public final Function2 e;

    public zj_2(Function2 function2, CoroutineContext coroutineContext, int n3, he_2 he_22) {
        super(function2, coroutineContext, n3, he_22);
        this.e = function2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object g(pz2_2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof ZJ$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (ZJ$a)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new ZJ$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var1_1 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var4_4.a = var1_1;
            var4_4.d = var7_7;
            var2_2 = super.g((pz2_2)var1_1, var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        var9_9 = var1_1.r();
        if (var9_9) {
            return Unit.a;
        }
        var1_1 = new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        throw var1_1;
    }

    public final ir_2 h(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        Function2 function2 = this.e;
        zj_2 zj_22 = new zj_2(function2, coroutineContext, n3, he_22);
        return zj_22;
    }
}

