/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

public final class l63$b {
    public final l63_0 a;
    public final boolean b;
    public final ks1_1 c;
    public i d;
    public int e;

    public l63$b(l63_0 object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "singleRunner");
        this.a = object;
        this.b = bl2;
        this.c = object = ls1_2.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(i var1_1, f80_0 var2_3) {
        block10: {
            block9: {
                var3_4 = var2_3 instanceof l63$b$a;
                if (!var3_4) ** GOTO lbl-1000
                var4_5 = var2_3;
                var4_5 = (l63$b$a)var2_3;
                var5_6 = var4_5.f;
                var6_7 = -1 << -1;
                var7_8 = var5_6 & var6_7;
                if (var7_8 != 0) {
                    var4_5.f = var5_6 -= var6_7;
                } else lbl-1000:
                // 2 sources

                {
                    var4_5 = new l63$b$a(this, (f80_0)var2_3);
                }
                var2_3 = var4_5.d;
                var8_9 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var6_7 = var4_5.f;
                var7_8 = 1;
                if (var6_7 != 0) {
                    if (var6_7 != var7_8) {
                        var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1 /* !! */ ;
                    }
                    var1_1 /* !! */  = var4_5.c;
                    var8_9 /* !! */  = var4_5.b;
                    var4_5 = var4_5.a;
                    vl2_2.b(var2_3);
                    var2_3 = var1_1 /* !! */ ;
                    var1_1 /* !! */  = var8_9 /* !! */ ;
                } else {
                    vl2_2.b(var2_3);
                    var4_5.a = this;
                    var4_5.b = var1_1 /* !! */ ;
                    var4_5.c = var2_3 = this.c;
                    var4_5.f = var7_8;
                    var4_5 = var2_3.d((f80_0)var4_5, null);
                    if (var4_5 == var8_9 /* !! */ ) {
                        return var8_9 /* !! */ ;
                    }
                    var4_5 = this;
                }
                try {
                    var8_9 /* !! */  = var4_5.d;
                    if (var1_1 /* !! */  != var8_9 /* !! */ ) break block9;
                }
                catch (Throwable var1_2) {
                    break block10;
                }
                var4_5.d = null;
            }
            var1_1 /* !! */  = Unit.a;
            var2_3.b(null);
            return Unit.a;
        }
        var2_3.b(null);
        throw var1_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(int var1_1, i var2_2, f80_0 var3_3) {
        block12: {
            block11: {
                block13: {
                    var4_4 = var3_3 instanceof l63$b$b;
                    if (!var4_4) ** GOTO lbl-1000
                    var5_5 = var3_3;
                    var5_5 = (l63$b$b)var3_3;
                    var6_6 = var5_5.g;
                    var7_7 = -1 << -1;
                    var8_8 = var6_6 & var7_7;
                    if (var8_8 != 0) {
                        var5_5.g = var6_6 -= var7_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_5 = new l63$b$b(this, (f80_0)var3_3);
                    }
                    var3_3 = var5_5.e;
                    var9_9 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var7_7 = var5_5.g;
                    var8_8 = 2;
                    var10_10 = 1;
                    if (var7_7 == 0) break block13;
                    if (var7_7 != var10_10) {
                        if (var7_7 != var8_8) {
                            var11_12 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var11_12;
                        }
                        var1_1 = var5_5.d;
                        var2_2 = var5_5.c;
                        var9_9 /* !! */  = var5_5.b;
                        var5_5 = var5_5.a;
                        try {
                            vl2_2.b(var3_3);
                            break block11;
                        }
                        catch (Throwable var11_11) {
                            break block12;
                        }
                    }
                    var1_1 = var5_5.d;
                    var2_2 = var5_5.c;
                    var12_14 /* !! */  = var5_5.b;
                    var13_15 = var5_5.a;
                    vl2_2.b(var3_3);
                    ** GOTO lbl-1000
                }
                vl2_2.b(var3_3);
                var5_5.a = this;
                var5_5.b = var2_2;
                var5_5.c = var3_3 = this.c;
                var5_5.d = var1_1;
                var5_5.g = var10_10;
                var12_14 /* !! */  = var3_3.d((f80_0)var5_5, null);
                if (var12_14 /* !! */  == var9_9 /* !! */ ) {
                    return var9_9 /* !! */ ;
                }
                var13_15 = this;
                var12_14 /* !! */  = var2_2;
                var2_2 = var3_3;
lbl-1000:
                // 2 sources

                {
                    block14: {
                        var3_3 = var13_15.d;
                        if (var3_3 == null || (var14_16 = var3_3.isActive()) == 0 || (var14_16 = var13_15.e) < var1_1 || var14_16 == var1_1 && (var14_16 = (int)var13_15.b) != 0) break block14;
                        var10_10 = 0;
                        ** GOTO lbl74
                    }
                    if (var3_3 != null) {
                        var16_18 = var13_15.a;
                        var15_17 = new l63$a(var16_18);
                        var3_3.d(var15_17);
                    }
                    if (var3_3 == null) ** GOTO lbl-1000
                    var5_5.a = var13_15;
                    var5_5.b = var12_14 /* !! */ ;
                    var5_5.c = var2_2;
                    var5_5.d = var1_1;
                    var5_5.g = var8_8;
                    if ((var3_3 = var3_3.I0((f80_0)var5_5)) == var9_9 /* !! */ ) {
                        return var9_9 /* !! */ ;
                    }
                    var9_9 /* !! */  = var12_14 /* !! */ ;
                    var5_5 = var13_15;
                }
            }
            var13_15 = var5_5;
            var12_14 /* !! */  = var9_9 /* !! */ ;
lbl-1000:
            // 2 sources

            {
                var13_15.d = var12_14 /* !! */ ;
                var13_15.e = var1_1;
lbl74:
                // 2 sources

                var11_13 = (boolean)var10_10;
                var2_2.b(null);
                return var11_13;
            }
        }
        var2_2.b(null);
        throw var11_11;
    }
}

