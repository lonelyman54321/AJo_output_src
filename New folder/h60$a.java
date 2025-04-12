/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class h60$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public h60$a(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof h60$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (h60$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new h60$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var1_1 = (c60)var1_1;
            var9_9 = var1_1.a;
            var6_6 = (int)c60.l(var9_9);
            if (var6_6 != 0) {
                var11_10 = false;
                var1_1 = null;
            } else {
                var6_6 = (int)c60.e(var9_9);
                if (var6_6 != 0) {
                    var6_6 = c60.i(var9_9);
                    var12_12 /* !! */  = new wq0$a(var6_6);
                } else {
                    var12_12 /* !! */  = wq0$b.a;
                }
                var6_6 = (int)c60.d(var9_9);
                if (var6_6 != 0) {
                    var11_11 = c60.h(var9_9);
                    var2_2 = new wq0$a(var11_11);
                } else {
                    var2_2 = wq0$b.a;
                }
                var1_1 = new B63(var12_12 /* !! */ , (wq0)var2_2);
            }
            if (var1_1 != null) {
                var4_4.b = var7_7;
                var2_2 = this.a;
                if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                    return var8_8;
                }
            }
        }
        return Unit.a;
    }
}

