/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class HH3$c$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public HH3$c$a(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof HH3$c$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (HH3$c$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new HH3$c$a$a(this, (f80_0)var2_2);
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
            var1_1 = ((AppDataBase)var1_1).recentlyViewedDao().fetchCloset();
            var9_9 = ih3_1.a;
            var2_2 = ih3_1.b;
            var2_2.clear();
            Intrinsics.checkNotNull(var1_1);
            var1_1 = ((Iterable)var1_1).iterator();
            while (var9_9 = var1_1.hasNext()) {
                var2_2 = (String)var1_1.next();
                if (var2_2 == null || (var6_6 = var2_2.length()) == 0) continue;
                var6_6 = (int)ih3_1.a;
                var10_10 = ih3_1.b;
                var10_10.add(var2_2);
            }
            var1_1 = Unit.a;
            var4_4.b = var7_7;
            var2_2 = this.a;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

