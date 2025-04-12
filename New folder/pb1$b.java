/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class pb1$b
implements mz2_1 {
    public final int a;
    public final da1_2 b;
    public int c;
    public ea1_2 d;

    public pb1$b(int n3, da1_2 da1_22) {
        Intrinsics.checkNotNullParameter(da1_22, "client");
        this.a = n3;
        this.b = da1_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(db1_2 var1_1, f80_0 var2_2) {
        block12: {
            block11: {
                block9: {
                    block10: {
                        var3_3 = var2_2 instanceof pb1$b$a;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (pb1$b$a)var2_2;
                        var5_5 = var4_4.d;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.d = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new pb1$b$a(this, (f80_0)var2_2);
                        }
                        var2_2 = var4_4.b;
                        var8_8 = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.d;
                        var7_7 = 0;
                        var9_9 = null;
                        var10_10 = 1;
                        if (var6_6 == 0) break block9;
                        if (var6_6 != var10_10) break block10;
                        var1_1 = var4_4.a;
                        vl2_2.b(var2_2);
                        break block11;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var2_2);
                var2_2 = this.d;
                if (var2_2 != null) {
                    kotlinx.coroutines.d.b((i90_0)var2_2, null);
                }
                if ((var11_11 = this.c) >= (var6_6 = this.a)) break block12;
                this.c = var11_11 += var10_10;
                var2_2 = this.b.h;
                var12_12 = var1_1.d;
                var4_4.a = this;
                var4_4.d = var10_10;
                if ((var2_2 = var2_2.a(var1_1, var12_12, (f80_0)var4_4)) == var8_8) {
                    return var8_8;
                }
                var1_1 = this;
            }
            var3_3 = var2_2 instanceof ea1_2;
            if (var3_3) {
                var9_9 = var2_2;
                var9_9 = (ea1_2)var2_2;
            }
            if (var9_9 != null) {
                var1_1.d = var9_9;
                return var9_9;
            }
            var4_4 = new StringBuilder("Failed to execute send pipeline. Expected [HttpClientCall], but received ");
            var4_4.append(var2_2);
            var2_2 = var4_4.toString().toString();
            var1_1 = new IllegalStateException((String)var2_2);
            throw var1_1;
        }
        var2_2 = new StringBuilder("Max send count ");
        var2_2.append(var6_6);
        var2_2.append(" exceeded. Consider increasing the property maxSendCount if more is required.");
        var2_2 = var2_2.toString();
        Intrinsics.checkNotNullParameter(var2_2, "message");
        var1_1 = new IllegalStateException((String)var2_2);
        throw var1_1;
    }
}

