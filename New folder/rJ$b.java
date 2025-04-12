/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class rJ$b
implements fs0_2 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ fs0_2 b;

    public rJ$b(fs0_2 fs0_22, Ref$IntRef ref$IntRef) {
        this.a = ref$IntRef;
        this.b = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(IndexedValue var1_1, f80_0 var2_2) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        var3_3 = var2_2 instanceof rJ$b$a;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (rJ$b$a)var2_2;
                        var5_5 = var4_4.e;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.e = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new rJ$b$a(this, (f80_0)var2_2);
                        }
                        var2_2 = var4_4.c;
                        var8_8 = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.e;
                        var7_7 = 1;
                        if (var6_6 == 0) break block6;
                        if (var6_6 != var7_7) break block7;
                        var1_1 = var4_4.b;
                        var4_4 = var4_4.a;
                        vl2_2.b(var2_2);
                        break block8;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var2_2);
                Intrinsics.checkNotNull(var1_1);
                var9_9 = var1_1.a;
                var10_10 = this.a;
                var6_6 = var10_10.element;
                if (var9_9 <= var6_6) break block9;
                var4_4.a = this;
                var4_4.b = var1_1;
                var4_4.e = var7_7;
                var2_2 = this.b;
                var10_10 = var1_1.b;
                if ((var2_2 = var2_2.emit(var10_10, (f80_0)var4_4)) == var8_8) {
                    return var8_8;
                }
                var4_4 = this;
            }
            var2_2 = var4_4.a;
            var2_2.element = var11_11 = var1_1.a;
        }
        return Unit.a;
    }
}

