/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class JS0$a
implements fs0_2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ gx0_2 b;
    public final /* synthetic */ fs0_2 c;

    public JS0$a(Ref$ObjectRef ref$ObjectRef, gx0_2 gx0_22, fs0_2 fs0_22) {
        this.a = ref$ObjectRef;
        this.b = gx0_22;
        this.c = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block9: {
            block6: {
                block7: {
                    block8: {
                        var3_3 = var2_2 instanceof JS0$a$a;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (JS0$a$a)var2_2;
                        var5_5 = var4_4.e;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.e = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new JS0$a$a(this, (f80_0)var2_2);
                        }
                        var2_2 = var4_4.c;
                        var8_8 = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.e;
                        var7_7 = 2;
                        var9_9 = 1;
                        if (var6_6 == 0) break block6;
                        if (var6_6 == var9_9) break block7;
                        if (var6_6 != var7_7) break block8;
                        vl2_2.b(var2_2);
                        break block9;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var1_1 = var4_4.b;
                var10_10 = var4_4.a;
                vl2_2.b(var2_2);
                ** GOTO lbl48
            }
            vl2_2.b(var2_2);
            var2_2 = this.a;
            var10_10 = var2_2.element;
            var11_11 = LS0.a;
            if (var10_10 == var11_11) {
                var10_10 = this;
            } else {
                var4_4.a = this;
                var4_4.b = var2_2;
                var4_4.e = var9_9;
                var12_12 = this.b;
                if ((var1_1 = var12_12.invoke(var10_10, var1_1, var4_4)) == var8_8) {
                    return var8_8;
                }
                var10_10 = this;
                var13_13 = var2_2;
                var2_2 = var1_1;
                var1_1 = var13_13;
lbl48:
                // 2 sources

                var13_13 = var2_2;
                var2_2 = var1_1;
                var1_1 = var13_13;
            }
            var2_2.element = var1_1;
            var1_1 = var10_10.c;
            var2_2 = var10_10.a.element;
            var6_6 = 0;
            var10_10 = null;
            var4_4.a = null;
            var4_4.b = null;
            var4_4.e = var7_7;
            var1_1 = var1_1.emit(var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

