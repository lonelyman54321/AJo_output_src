/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class V50 {
    public static final /* synthetic */ int a;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("ConstraintTrkngWrkr"), "tagWithPrefix(\"ConstraintTrkngWrkr\")");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(MH3 var0, EI3 var1_1, f80_0 var2_2) {
        block8: {
            block7: {
                block5: {
                    block6: {
                        var3_3 = var2_2 instanceof t50_0;
                        if (!var3_3) ** GOTO lbl-1000
                        var4_4 = var2_2;
                        var4_4 = (t50_0)var2_2;
                        var5_5 = var4_4.b;
                        var6_6 = -1 << -1;
                        var7_7 = var5_5 & var6_6;
                        if (var7_7 != 0) {
                            var4_4.b = var5_5 -= var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new h80_0((f80_0)var2_2);
                        }
                        var2_2 = var4_4.a;
                        var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var6_6 = var4_4.b;
                        var7_7 = 1;
                        if (var6_6 == 0) break block5;
                        if (var6_6 != var7_7) break block6;
                        vl2_2.b(var2_2);
                        break block7;
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var2_2);
                var0 = var0.b((EI3)var1_1);
                var6_6 = 0;
                var2_2 = new U50((EI3)var1_1, null);
                var1_1 = new vt0_2((es0_2)var0, (Function2)var2_2);
                var0 = new S50((vt0_2)var1_1);
                var4_4.b = var7_7;
                var2_2 = ms0_1.j((es0_2)var0, var4_4);
                if (var2_2 == var8_8 /* !! */ ) break block8;
            }
            var2_2 = (k60$b)var2_2;
            var9_9 = var2_2.a;
            var8_8 /* !! */  = new Integer(var9_9);
        }
        return var8_8 /* !! */ ;
    }
}

