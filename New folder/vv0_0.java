/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vV0
 */
public final class vv0_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ru_0 var0, f80_0 var1_1) {
        block10: {
            block7: {
                block8: {
                    block9: {
                        var2_2 = var1_1 /* !! */  instanceof vV0$a;
                        if (!var2_2) ** GOTO lbl-1000
                        var3_3 = var1_1 /* !! */ ;
                        var3_3 = (vV0$a)var1_1 /* !! */ ;
                        var4_4 = var3_3.c;
                        var5_5 = -1 << -1;
                        var6_6 = var4_4 & var5_5;
                        if (var6_6 != 0) {
                            var3_3.c = var4_4 -= var5_5;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_3 = new h80_0((f80_0)var1_1 /* !! */ );
                        }
                        var1_1 /* !! */  = var3_3.b;
                        var7_7 = j90_0.COROUTINE_SUSPENDED;
                        var5_5 = var3_3.c;
                        var6_6 = 1;
                        if (var5_5 == 0) break block8;
                        if (var5_5 != var6_6) break block9;
                        var0 = var3_3.a;
                        vl2_2.b(var1_1 /* !! */ );
                        ** GOTO lbl-1000
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var1_1 /* !! */ );
                var1_1 /* !! */  = var0.p0().a;
                var5_5 = var1_1 /* !! */ .size();
                for (var8_8 = 0; var8_8 < var5_5; ++var8_8) {
                    var9_9 = (aw2_0)var1_1 /* !! */ .get(var8_8);
                    var10_10 = var9_9.d;
                    if (!var10_10) continue;
                    var11_11 = 1;
                    break block7;
                }
                var11_11 = 0;
                var1_1 /* !! */  = null;
            }
            if ((var11_11 ^= var6_6) == 0) {
                block1: while (true) {
                    var1_1 /* !! */  = Nv2.Final;
                    var3_3.a = var0;
                    var3_3.c = var6_6;
                    if ((var1_1 /* !! */  = var0.x0((Nv2)var1_1 /* !! */ , var3_3)) == var7_7) {
                        return var7_7;
                    } else {
                        ** GOTO lbl-1000
                    }
                    break;
                }
            }
            break block10;
lbl-1000:
            // 3 sources

            {
                var1_1 /* !! */  = ((mv2_0)var1_1 /* !! */ ).a;
                var5_5 = var1_1 /* !! */ .size();
                for (var8_8 = 0; var8_8 < var5_5; ++var8_8) {
                    var9_9 = (aw2_0)var1_1 /* !! */ .get(var8_8);
                    var10_10 = var9_9.d;
                    if (var10_10) continue block1;
                }
            }
        }
        return Unit.a;
    }

    public static final Object b(hw2_0 object, Function2 object2, f80_0 f80_02) {
        CoroutineContext coroutineContext = f80_02.getContext();
        vV0$b vV0$b = new vV0$b(null, coroutineContext, (Function2)object2);
        if ((object = object.d0(vV0$b, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

