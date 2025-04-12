/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class ma1$a {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ma1_1 var0, eb1_2 var1_1, f80_0 var2_2) {
        block11: {
            block9: {
                block10: {
                    block6: {
                        block7: {
                            block8: {
                                var3_3 = var2_2 instanceof na1_2;
                                if (!var3_3) ** GOTO lbl-1000
                                var4_4 = var2_2;
                                var4_4 = (na1_2)var2_2;
                                var5_5 = var4_4.d;
                                var6_6 = -1 << -1;
                                var7_7 = var5_5 & var6_6;
                                if (var7_7) {
                                    var4_4.d = var5_5 -= var6_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new h80_0((f80_0)var2_2);
                                }
                                var2_2 = var4_4.c;
                                var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                var6_6 = var4_4.d;
                                var7_7 = 1;
                                var9_9 = 2;
                                if (var6_6 == 0) break block6;
                                if (var6_6 == var7_7) break block7;
                                if (var6_6 != var9_9) break block8;
                                vl2_2.b(var2_2);
                                break block9;
                            }
                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var0;
                        }
                        var1_1 = var4_4.b;
                        var0 = var4_4.a;
                        vl2_2.b(var2_2);
                        break block10;
                    }
                    vl2_2.b(var2_2);
                    var2_2 = var1_1.e;
                    var4_4.a = var0;
                    var4_4.b = var1_1;
                    var4_4.d = var7_7;
                    var10_10 = xa1_1.a;
                    var10_10 = new xl1_2((i)var2_2);
                    var2_2 = var0.getCoroutineContext().plus((CoroutineContext)var10_10);
                    var11_11 = xa1_1.a;
                    var2_2 = var2_2.plus((CoroutineContext)var11_11);
                    var11_11 = var4_4.getContext();
                    var12_12 = i$a.a;
                    var11_11 = (i)var11_11.get((CoroutineContext$a)var12_12);
                    if (var11_11 != null) {
                        var12_12 = new kz3_0((xl1_2)var10_10);
                        var13_13 = var11_11.u((boolean)var7_7, (boolean)var7_7, (Function1)var12_12);
                        var11_11 = new jz3_0(var13_13);
                        var10_10.G((Function1)var11_11);
                    }
                    if (var2_2 == var8_8 /* !! */ ) break block11;
                }
                var2_2 = (CoroutineContext)var2_2;
                var10_10 = new wo1_2((CoroutineContext)var2_2);
                var2_2 = var2_2.plus((CoroutineContext)var10_10);
                var7_7 = 0;
                var13_13 = null;
                var10_10 = new oa1_2((ma1_1)var0, var1_1, null);
                var0 = Ae3.a((i90_0)var0, (CoroutineContext)var2_2, (Function2)var10_10, var9_9);
                var4_4.a = null;
                var4_4.b = null;
                var4_4.d = var9_9;
                var2_2 = var0.D(var4_4);
                if (var2_2 == var8_8 /* !! */ ) break block11;
            }
            var8_8 /* !! */  = var2_2;
        }
        return var8_8 /* !! */ ;
    }
}

