/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.IndexedValue;

public final class sJ$a
implements fs0_2 {
    public final /* synthetic */ vJ a;

    public sJ$a(vJ vJ2) {
        this.a = vJ2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(IndexedValue var1_1, f80_0 var2_2) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var3_3 = var2_2 instanceof sJ$a$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (sJ$a$a)var2_2;
                            var5_5 = var4_4.e;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.e = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new sJ$a$a(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.c;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.e;
                            var7_7 = 2;
                            var9_9 = 1;
                            if (var6_6 == 0) break block4;
                            if (var6_6 == var9_9) break block5;
                            if (var6_6 != var7_7) break block6;
                            vl2_2.b(var2_2);
                            break block7;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var4_4.b;
                    var10_10 = var4_4.a;
                    vl2_2.b(var2_2);
                    break block8;
                }
                vl2_2.b(var2_2);
                var2_2 = this.a.b;
                var4_4.a = this;
                var4_4.b = var1_1;
                var4_4.e = var9_9;
                var2_2 = var2_2.emit(var1_1, var4_4);
                if (var2_2 == var8_8) {
                    return var8_8;
                }
                var10_10 = this;
            }
            var2_2 = var10_10.a.a;
            var6_6 = 0;
            var10_10 = null;
            var4_4.a = null;
            var4_4.b = null;
            var4_4.e = var7_7;
            var1_1 = var2_2.b((IndexedValue)var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

