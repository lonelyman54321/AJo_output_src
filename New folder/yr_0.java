/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from yR
 */
public final class yr_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final j90_0 a(sg2_0 var1_1, Function2 var2_2, f80_0 var3_3) {
        var4_4 = var3_3 instanceof tr_0;
        if (!var4_4) ** GOTO lbl-1000
        var5_5 = var3_3;
        var5_5 = (tr_0)var3_3;
        var6_6 = var5_5.c;
        var7_7 = -1 << -1;
        var8_8 = var6_6 & var7_7;
        if (var8_8 != 0) {
            var5_5.c = var6_6 -= var7_7;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = new tr_0(this, (f80_0)var3_3);
        }
        var3_3 = var5_5.a;
        var9_9 = j90_0.COROUTINE_SUSPENDED;
        var7_7 = var5_5.c;
        var8_8 = 1;
        if (var7_7 != 0) {
            if (var7_7 != var8_8) {
                var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1 /* !! */ ;
            }
            vl2_2.b(var3_3);
        } else {
            vl2_2.b(var3_3);
            var7_7 = 0;
            var3_3 = new xr_1(var2_2, this, null);
            var5_5.c = var8_8;
            var1_1 /* !! */  = wt2_0.b((sg2_0)var1_1 /* !! */ , null, (Function2)var3_3, var5_5);
            if (var1_1 /* !! */  == var9_9) {
                return var9_9;
            }
        }
        var1_1 /* !! */  = new KotlinNothingValueException();
        throw var1_1 /* !! */ ;
    }
}

