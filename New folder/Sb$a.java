/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ajiocash.ActivePoints;
import kotlin.Unit;

public final class Sb$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public Sb$a(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = this;
        var4_4 = var2_2;
        var5_5 = var2_2 instanceof Sb$a$a;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var2_2;
        var6_6 = (Sb$a$a)var2_2;
        var7_7 = var6_6.b;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.b = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new Sb$a$a(var3_3, (f80_0)var4_4);
        }
        var4_4 = var6_6.a;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.b;
        var9_9 = 1;
        if (var8_8 == 0) ** GOTO lbl24
        if (var8_8 == var9_9) {
            vl2_2.b(var4_4);
        } else {
            var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var4_4;
lbl24:
            // 1 sources

            vl2_2.b(var4_4);
            var4_4 = var1_1;
            var4_4 = (Ml2)var1_1;
            var11_11 = zj3_0.SOURCE_COMPLETE;
            var13_13 = (char)-1;
            var12_12 = new ActivePoints(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var13_13, null);
            var4_4 = Wl2.a((Ml2)var4_4, (zj3_0)var11_11, var12_12);
            var6_6.b = var8_8 = 1;
            var11_11 = var3_3.a;
            var4_4 = var11_11.emit(var4_4, var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

