/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from ZS0
 */
public final class zs0_2 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(qn3_0 var0, gx0_2 var1_2, Throwable var2_3, f80_0 var3_4) {
        block7: {
            var4_5 = var3_4 instanceof ws0_2;
            if (!var4_5) ** GOTO lbl-1000
            var5_6 = var3_4;
            var5_6 = (ws0_2)var3_4;
            var6_7 = var5_6.c;
            var7_8 = -1 << -1;
            var8_9 = var6_7 & var7_8;
            if (var8_9 != 0) {
                var5_6.c = var6_7 -= var7_8;
            } else lbl-1000:
            // 2 sources

            {
                var5_6 = new h80_0((f80_0)var3_4);
            }
            var3_4 = var5_6.b;
            var9_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
            var7_8 = var5_6.c;
            var8_9 = 1;
            if (var7_8 != 0) {
                if (var7_8 != var8_9) {
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                var2_3 = var5_6.a;
                try {
                    vl2_2.b(var3_4);
                    return Unit.a;
                }
                catch (Throwable var0_1) {
                    break block7;
                }
            }
            vl2_2.b(var3_4);
            {
                var5_6.a = var2_3;
                var5_6.c = var8_9;
                var0 = var1_2.invoke(var0, var2_3, var5_6);
                if (var0 != var9_10 /* !! */ ) return Unit.a;
                return var9_10 /* !! */ ;
            }
        }
        if (var2_3 == null) throw var0_1;
        if (var2_3 == var0_1) throw var0_1;
        yc0_2.a(var0_1, var2_3);
        throw var0_1;
    }
}

