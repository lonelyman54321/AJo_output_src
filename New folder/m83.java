/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.i$b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

public final class m83
implements pi3_0 {
    public final s83_0 a;
    public final vi0_0 b;
    public final Gl c;
    public final i$b d;

    public m83(Al2 object, vi0_0 vi0_02, Gl gl) {
        this.a = object;
        this.b = vi0_02;
        this.c = gl;
        this.d = object = i.c;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object c(m83 var0, kU2$b$a var1_1, float var2_2, float var3_3, j83$b var4_4, f80_0 var5_5) {
        block11: {
            block14: {
                block12: {
                    block13: {
                        var0.getClass();
                        var6_6 = var5_5 instanceof l83;
                        if (var6_6) {
                            var7_7 /* !! */  = var5_5;
                            var7_7 /* !! */  = (l83)var5_5;
                            var8_8 = var7_7 /* !! */ .c;
                            var9_9 = -1 << -1;
                            var10_10 = -0.0f;
                            var11_11 = var8_8 & var9_9;
                            if (var11_11 != 0) {
                                var7_7 /* !! */ .c = var8_8 -= var9_9;
lbl13:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                        }
                        var7_7 /* !! */  = new l83((m83)var0, (f80_0)var5_5);
                        ** while (true)
                        var12_12 = var7_7 /* !! */ ;
                        var5_5 = var7_7 /* !! */ .a;
                        var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var8_8 = var12_12.c;
                        var9_9 = 1;
                        var10_10 = 1.4E-45f;
                        if (var8_8 == 0) break block12;
                        if (var8_8 != var9_9) break block13;
                        vl2_2.b(var5_5);
                        break block14;
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var5_5);
                var13_13 = Math.abs(var2_2);
                var8_8 = 0;
                var14_14 = 0.0f;
                var15_15 = null;
                cfr_temp_0 = var13_13 - 0.0f;
                var16_16 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                if (var16_16 == false || (var16_16 = (cfr_temp_1 = (var13_13 = Math.abs(var3_3)) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)) == false) {
                    var17_17 = 28;
                    var0 = jl_0.a(var2_2, var3_3, var17_17);
lbl41:
                    // 2 sources

                    while (true) {
                        var7_7 /* !! */  = var0;
                        break block11;
                        break;
                    }
                }
                var12_12.c = var9_9;
                var5_5 = FloatCompanionObject.INSTANCE;
                var5_5 = ya3_0.a;
                var5_5 = var0.b;
                var18_18 = var5_5.a();
                var19_19 = new kl_1(0.0f);
                var15_15 = new kl_1(var3_3);
                var15_15 = (kl_1)var18_18.c((Ol)var19_19, (Ol)var15_15);
                var14_14 = Math.abs(var15_15.a);
                cfr_temp_2 = var14_14 - (var10_10 = Math.abs(var2_2));
                var8_8 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                if (var8_8 >= 0) {
                    var15_15 = var0 = new xi0_1((vi0_0)var5_5);
                } else {
                    var0 = var0.c;
                    var15_15 = var5_5 = new mi3_1((Gl)var0);
                }
                var19_19 = new Float(var2_2);
                var20_20 = new Float(var3_3);
                var18_18 = var1_1;
                var5_5 = var15_15.a(var1_1, (Float)var19_19, var20_20, var4_4, (l83)var12_12);
                if (var5_5 == var7_7 /* !! */ ) break block11;
            }
            var5_5 = (rl_1)var5_5;
            var0 = var5_5.b;
            ** while (true)
        }
        return var7_7 /* !! */ ;
    }

    public final Object a(kU2$b$a kU2$b$a, float f5, f80_0 f80_02) {
        qi3$a_0 qi3$a_0 = Qi3.a;
        return this.b(kU2$b$a, f5, qi3$a_0, f80_02);
    }

    /*
     * Unable to fully structure code
     */
    public final Object b(kU2$b$a var1_1, float var2_2, Function1 var3_3, f80_0 var4_4) {
        var5_5 = var4_4 instanceof k83_0;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var4_4;
        var6_6 = (k83_0)var4_4;
        var7_7 = var6_6.c;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.c = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new k83_0(this, (f80_0)var4_4);
        }
        var4_4 = var6_6.a;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.c;
        var9_9 = 1;
        if (var8_8 == 0) ** GOTO lbl22
        if (var8_8 == var9_9) {
            vl2_2.b(var4_4);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var4_4);
            var6_6.c = var9_9;
            var4_4 = this.d((kU2$b$a)var1_1, var2_2, var3_3, var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        var4_4 = (rl_1)var4_4;
        var1_1 = (Number)var4_4.a;
        var11_11 = var1_1.floatValue();
        var2_2 = 0.0f;
        cfr_temp_0 = var11_11 - 0.0f;
        var12_12 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
        if (var12_12 != false) {
            var1_1 = (Number)var4_4.b.d();
            var2_2 = var1_1.floatValue();
        }
        var1_1 = new Float(var2_2);
        return var1_1;
    }

    /*
     * Unable to fully structure code
     */
    public final Object d(kU2$b$a var1_1, float var2_2, Function1 var3_3, f80_0 var4_4) {
        var5_5 = var4_4 instanceof i83_0;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var4_4;
        var6_6 = (i83_0)var4_4;
        var7_7 = var6_6.d;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.d = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new i83_0(this, (f80_0)var4_4);
        }
        var4_4 = var6_6.b;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.d;
        var9_9 = 1;
        if (var8_8 == 0) ** GOTO lbl24
        if (var8_8 == var9_9) {
            var3_3 = var1_1 = var6_6.a;
            var3_3 = (Function1)var1_1;
            vl2_2.b(var4_4);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl24:
            // 1 sources

            vl2_2.b(var4_4);
            var4_4 = this.d;
            var11_11 = new j83_0(this, var2_2, (Function1)var3_3, (kU2$b$a)var1_1, null);
            var1_1 = var3_3;
            var6_6.a = var1_1 = (Function1)var3_3;
            var6_6.d = var9_9;
            var4_4 = Ae3.g(var6_6, (CoroutineContext)var4_4, var11_11);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        var4_4 = (rl_1)var4_4;
        var1_1 = new Float(0.0f);
        var3_3.invoke(var1_1);
        return var4_4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof m83;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (m83)object;
            Object object2 = ((m83)object).c;
            Object object3 = this.c;
            bl2 = Intrinsics.areEqual(object2, object3);
            if (bl2 && (bl2 = Intrinsics.areEqual(object2 = ((m83)object).b, object3 = this.b)) && (bl4 = Intrinsics.areEqual(object = ((m83)object).a, object2 = this.a))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.c.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return this.a.hashCode() + n4;
    }
}

