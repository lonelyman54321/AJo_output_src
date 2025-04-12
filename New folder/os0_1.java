/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from OS0
 */
public final class os0_1
implements es0_2 {
    public final /* synthetic */ Object[] a;

    public os0_1(Object[] objectArray) {
        this.a = objectArray;
    }

    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof OS0$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (OS0$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new OS0$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl27
        if (var6_6 == var7_7) {
            var9_9 = var4_4.g;
            var6_6 = var4_4.f;
            var10_10 = var4_4.e;
            var11_11 = var4_4.d;
            vl2_2.b(var2_2);
            var2_2 = var10_10;
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl27:
            // 1 sources

            vl2_2.b(var2_2);
            var12_12 = this.a.length;
            var11_11 = this;
            var2_2 = var1_1;
            var9_9 = var12_12;
        }
        for (var6_6 = 0; var6_6 < var9_9; var6_6 += var7_7) {
            var10_10 = var11_11.a[var6_6];
            var4_4.d = var11_11;
            var4_4.e = var2_2;
            var4_4.f = var6_6;
            var4_4.g = var9_9;
            var4_4.b = var7_7;
            if ((var10_10 = var2_2.emit(var10_10, var4_4)) != var8_8) continue;
            return var8_8;
        }
        return Unit.a;
    }
}

