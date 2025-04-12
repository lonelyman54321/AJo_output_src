/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.Unit;

/*
 * Renamed from NS0
 */
public final class ns0_1
implements es0_2 {
    public final /* synthetic */ Iterable a;

    public ns0_1(Iterable iterable) {
        this.a = iterable;
    }

    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof ns0$a_0;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (ns0$a_0)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new ns0$a_0(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl25
        if (var6_6 == var7_7) {
            var1_1 = var4_4.e;
            var9_9 = var4_4.d;
            vl2_2.b(var2_2);
            var2_2 = var9_9;
        } else {
            var1_1 = new Iterator<T>("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl25:
            // 1 sources

            vl2_2.b(var2_2);
            var10_10 = this.a.iterator();
            var2_2 = var1_1;
            var1_1 = var10_10;
        }
        while ((var6_6 = (int)var1_1.hasNext()) != 0) {
            var9_9 = var1_1.next();
            var4_4.d = var2_2;
            var4_4.e = var1_1;
            var4_4.b = var7_7;
            if ((var9_9 = var2_2.emit(var9_9, var4_4)) != var8_8) continue;
            return var8_8;
        }
        return Unit.a;
    }
}

