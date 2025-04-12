/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.entity.SharedWithMe;
import kotlin.Unit;

public final class W23$b$c$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ w23_0 b;

    public W23$b$c$a(fs0_2 fs0_22, w23_0 w23_02) {
        this.a = fs0_22;
        this.b = w23_02;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof W23$b$c$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (W23$b$c$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new W23$b$c$a$a(this, (f80_0)var2_2);
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
            var1_1 = (SharedWithMe)var1_1;
            this.b.getClass();
            w23_0.d((SharedWithMe)var1_1);
            var4_4.b = var7_7;
            var2_2 = this.a;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

