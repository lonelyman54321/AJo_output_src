/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class eI2 {
    public final int a;
    public final Function2 b;
    public float c;

    public eI2(int n3, k20_0 k20_02) {
        this.a = n3;
        this.b = k20_02;
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(float var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof eI2$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (eI2$a)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new eI2$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var9_9 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var9_10 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var9_10;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = new Float(var1_1);
            var4_4.a = this;
            var4_4.d = var7_7;
            var9_9 = this.b;
            var2_2 = var9_9.invoke(var2_2, var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
            var9_9 = this;
        }
        var10_11 = ((Number)var2_2).floatValue();
        var9_9.c = var11_12 = var9_9.c + var10_11;
        return Unit.a;
    }
}

