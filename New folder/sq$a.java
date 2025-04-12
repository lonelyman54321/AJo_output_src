/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class sq$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public sq$a(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof sq$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (sq$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = -0.0f;
        var8_8 = var5_5 & var6_6;
        if (var8_8 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new sq$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var9_9 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
        var8_8 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var8_8) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var1_1 = (C63)var1_1;
            var10_10 = var1_1.a;
            var12_11 = 9205357640488583168L;
            var14_12 = 2.247117487993712E307;
            var6_6 = (int)(var10_10 == var12_11 ? 0 : (var10_10 < var12_11 ? -1 : 1));
            if (var6_6 == 0) {
                var1_1 = B63.c;
            } else {
                var16_13 = Lz3.b;
                var7_7 = C63.d(var10_10);
                var14_12 = var7_7;
                cfr_temp_0 = var14_12 - (var17_14 = 0.5);
                var6_6 = (int)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                if (var6_6 >= 0 && (var6_6 = (int)((cfr_temp_1 = (var14_12 = (double)(var7_7 = C63.b(var10_10))) - var17_14) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1))) >= 0) {
                    var19_15 = C63.d(var10_10);
                    var20_16 = Float.isInfinite(var19_15);
                    if (!var20_16 && (var21_17 = Float.isNaN(var19_15)) == 0) {
                        var19_15 = C63.d(var10_10);
                        var21_17 = ok1_1.b(var19_15);
                        var22_18 /* !! */  = new wq0$a(var21_17);
                    } else {
                        var22_18 /* !! */  = wq0$b.a;
                    }
                    var19_15 = C63.b(var10_10);
                    var23_19 = Float.isInfinite(var19_15);
                    if (!var23_19 && (var21_17 = (int)Float.isNaN(var19_15)) == 0) {
                        var24_20 = C63.b(var10_10);
                        var25_22 = ok1_1.b(var24_20);
                        var2_2 = new wq0$a(var25_22);
                    } else {
                        var2_2 = wq0$b.a;
                    }
                    var1_1 = var16_13 = new B63(var22_18 /* !! */ , (wq0)var2_2);
                } else {
                    var25_23 = false;
                    var24_21 = 0.0f;
                    var1_1 = null;
                }
            }
            if (var1_1 != null) {
                var4_4.b = var8_8;
                var2_2 = this.a;
                if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var9_9) {
                    return var9_9;
                }
            }
        }
        return Unit.a;
    }
}

