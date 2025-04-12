/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Jl2
 */
public final class jl2_0
implements TR0 {
    public final pi3_0 a;
    public final Cl2 b;

    public jl2_0(pi3_0 pi3_02, hm0_0 hm0_02) {
        this.a = pi3_02;
        this.b = hm0_02;
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(kU2$b$a var1_1, float var2_2, f80_0 var3_3) {
        var4_4 = var3_3 instanceof Hl2;
        if (!var4_4) ** GOTO lbl-1000
        var5_5 = var3_3;
        var5_5 = (Hl2)var3_3;
        var6_6 = var5_5.c;
        var7_7 = -1 << -1;
        var8_8 = var6_6 & var7_7;
        if (var8_8 != 0) {
            var5_5.c = var6_6 -= var7_7;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = new Hl2(this, (f80_0)var3_3);
        }
        var3_3 = var5_5.a;
        var9_9 = j90_0.COROUTINE_SUSPENDED;
        var7_7 = var5_5.c;
        var8_8 = 1;
        if (var7_7 == 0) ** GOTO lbl22
        if (var7_7 == var8_8) {
            vl2_2.b(var3_3);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var3_3);
            var3_3 = new Il2(this, (kU2$b$a)var1_1);
            var5_5.c = var8_8;
            var10_10 = this.a;
            var3_3 = var10_10.b((kU2$b$a)var1_1, var2_2, (Function1)var3_3, var5_5);
            if (var3_3 == var9_9) {
                return var9_9;
            }
        }
        var11_11 = ((Number)var3_3).floatValue();
        var12_12 = new Float(var11_11);
        return var12_12;
    }
}

