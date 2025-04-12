/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Ref$FloatRef;

public final class KT2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(dU2 var0, float var1_1, Qs3 var2_2, f80_0 var3_3) {
        var4_4 = var3_3 instanceof it2_2;
        if (!var4_4) ** GOTO lbl-1000
        var5_5 = var3_3;
        var5_5 = (it2_2)var3_3;
        var6_6 = var5_5.c;
        var7_7 = -1 << -1;
        var8_8 = var6_6 & var7_7;
        if (var8_8 != 0) {
            var5_5.c = var6_6 -= var7_7;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = new h80_0((f80_0)var3_3);
        }
        var3_3 = var5_5.b;
        var9_9 = j90_0.COROUTINE_SUSPENDED;
        var7_7 = var5_5.c;
        var8_8 = 1;
        if (var7_7 == 0) ** GOTO lbl23
        if (var7_7 == var8_8) {
            var0 = var5_5.a;
            vl2_2.b(var3_3);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl23:
            // 1 sources

            vl2_2.b(var3_3);
            var3_3 = new Ref$FloatRef();
            var10_10 = new jt2_1(var1_1, var2_2, (Ref$FloatRef)var3_3, null);
            var5_5.a = var3_3;
            var5_5.c = var8_8;
            var11_11 /* !! */  = aS1.Default;
            var0 = var0.a((aS1)var11_11 /* !! */ , var10_10, var5_5);
            if (var0 == var9_9) {
                return var9_9;
            }
            var0 = var3_3;
        }
        var12_12 = var0.element;
        var11_11 /* !! */  = new Float(var12_12);
        return var11_11 /* !! */ ;
    }
}

