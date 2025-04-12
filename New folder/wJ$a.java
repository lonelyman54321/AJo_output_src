/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class wJ$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public wJ$a(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof wJ$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (wJ$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new wJ$a$a(this, (f80_0)var2_2);
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
            var1_1 = (ar1_0)var1_1;
            var9_9 = var1_1.c.e;
            var10_10 = new xq1_2((ar1_0)var1_1, null);
            var11_11 = new ys0_2((es0_2)var9_9, (Function2)var10_10);
            var9_9 = new yq1_2((ar1_0)var1_1, null);
            var10_10 = new xs0_2((es0_2)var11_11, (gx0_2)var9_9);
            var9_9 = var1_1.b;
            var12_12 = var9_9.b;
            var11_11 = new zq1_2((ar1_0)var1_1);
            var1_1 = var9_9.c;
            var2_2 = new Ml2((es0_2)var10_10, var12_12, (z61)var1_1, (Function0)var11_11);
            var4_4.b = var7_7;
            var1_1 = this.a.emit(var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

