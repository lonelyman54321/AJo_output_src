/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from cT0
 */
public final class ct0_1
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ Ref$ObjectRef b;

    public ct0_1(fs0_2 fs0_22, Ref$ObjectRef ref$ObjectRef) {
        this.a = fs0_22;
        this.b = ref$ObjectRef;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block12: {
            block11: {
                var3_6 = var2_2 instanceof cT0$a;
                if (!var3_6) ** GOTO lbl-1000
                var4_7 = var2_2;
                var4_7 = (cT0$a)var2_2;
                var5_8 = var4_7.d;
                var6_9 = -1 << -1;
                var7_10 = var5_8 & var6_9;
                if (var7_10 != 0) {
                    var4_7.d = var5_8 -= var6_9;
                } else lbl-1000:
                // 2 sources

                {
                    var4_7 = new cT0$a(this, (f80_0)var2_2);
                }
                var2_2 = var4_7.b;
                var8_11 = j90_0.COROUTINE_SUSPENDED;
                var6_9 = var4_7.d;
                var7_10 = 1;
                if (var6_9 != 0) {
                    if (var6_9 == var7_10) {
                        var1_1 = var4_7.a;
                        try {
                            vl2_2.b(var2_2);
                            break block11;
                        }
                        catch (Throwable var2_3) {
                            break block12;
                        }
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var2_2);
                var2_2 = this.a;
                var4_7.a = this;
                var4_7.d = var7_10;
                try {
                    var1_1 = var2_2.emit(var1_1, var4_7);
                    if (var1_1 != var8_11) break block11;
                    return var8_11;
                }
                catch (Throwable var2_4) {
                    var1_1 = this;
                }
            }
            return Unit.a;
        }
        var1_1.b.element = var2_5;
        throw var2_5;
    }
}

