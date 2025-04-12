/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class QZ1$c$b
implements fs0_2 {
    public final /* synthetic */ qz1_2 a;

    public QZ1$c$b(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(DataCallback var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof QZ1$c$b$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (QZ1$c$b$a)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new QZ1$c$b$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var1_1 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.a.D;
            var4_4.a = this;
            var4_4.d = var7_7;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
            var1_1 = this;
        }
        var1_1 = var1_1.a.c;
        var2_2 = Boolean.FALSE;
        var1_1.setValue(var2_2);
        return Unit.a;
    }
}

