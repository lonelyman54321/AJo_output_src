/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;

public final class No1$d$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ k70_0 b;
    public final /* synthetic */ Charset c;
    public final /* synthetic */ at3_0 d;
    public final /* synthetic */ Object e;

    public No1$d$a(fs0_2 fs0_22, k70_0 k70_02, Charset charset, at3_0 at3_02, Object object) {
        this.a = fs0_22;
        this.b = k70_02;
        this.c = charset;
        this.d = at3_02;
        this.e = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var3_3 = var2_2 instanceof No1$d$a$a;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (No1$d$a$a)var2_2;
                            var5_5 = var4_4.b;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.b = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new No1$d$a$a(this, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.a;
                            var8_8 = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.b;
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
                    var1_1 = var4_4.c;
                    vl2_2.b(var2_2);
                    break block8;
                }
                vl2_2.b(var2_2);
                var1_1 = (oo1_2)var1_1;
                var4_4.c = var2_2 = this.a;
                var4_4.b = var9_9;
                var10_10 = this.d;
                var11_11 = this.e;
                var12_12 = this.b;
                var13_13 = this.c;
                var1_1 = var1_1.b(var12_12, var13_13, var10_10, var11_11);
                if (var1_1 == var8_8) {
                    return var8_8;
                }
                var14_14 = var2_2;
                var2_2 = var1_1;
                var1_1 = var14_14;
            }
            var6_6 = 0;
            var10_10 = null;
            var4_4.c = null;
            var4_4.b = var7_7;
            var1_1 = var1_1.emit(var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

