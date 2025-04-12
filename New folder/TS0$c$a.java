/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class TS0$c$a
implements fs0_2 {
    public final /* synthetic */ pz2_2 a;

    public TS0$c$a(pz2_2 pz2_22) {
        this.a = pz2_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof TS0$c$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (TS0$c$a$a)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new TS0$c$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
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
            if (var1_1 == null) {
                var1_1 = k52_0.a;
            }
            var4_4.c = var7_7;
            var2_2 = this.a;
            if ((var1_1 = var2_2.o(var4_4, var1_1)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

