/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class Re {
    public final Function1 a;
    public final Function0 b;
    public final Gl c;
    public final Function1 d;
    public final xj1 e;
    public final Ne f;
    public final ParcelableSnapshotMutableState g;
    public final mp0 h;
    public final mp0 i;
    public final ParcelableSnapshotMutableFloatState j;
    public final ParcelableSnapshotMutableFloatState k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public final Ke n;

    public Re(Object object, yu0$a_0 object2, Yu0$b yu0$b, Gl gl, Function1 function1) {
        this.a = object2;
        this.b = yu0$b;
        this.c = gl;
        this.d = function1;
        this.e = object2 = new xj1();
        this.f = object2 = new Ne(this);
        this.g = object = J83.g(object);
        object = new Pe(this, 0);
        this.h = object = J83.e((Function0)object);
        object = new le_0(this);
        this.i = object = J83.e((Function0)object);
        this.j = object = tp1_0.e(0.0f / 0.0f);
        J83.l();
        object = qi_2.b;
        object2 = new oe_0(this);
        J83.d((I83)object, (Function0)object2);
        this.k = object = tp1_0.e(0.0f);
        this.l = object = J83.g(null);
        object2 = fh1_2.f();
        object = new RG1((Map)object2);
        this.m = object = J83.g(object);
        this.n = object = new Ke(this);
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(aS1 var1_1, me_0 var2_3, f80_0 var3_6) {
        block24: {
            block23: {
                var4_7 = var3_6 instanceof ge_1;
                if (var4_7 == 0) ** GOTO lbl-1000
                var5_8 = var3_6;
                var5_8 = (ge_1)var3_6;
                var6_9 = var5_8.d;
                var7_10 = -1 << -1;
                var8_11 = var6_9 & var7_10;
                if (var8_11 != 0) {
                    var5_8.d = var6_9 -= var7_10;
                } else lbl-1000:
                // 2 sources

                {
                    var5_8 = new ge_1(this, (f80_0)var3_6);
                }
                var3_6 = var5_8.b;
                var9_12 = j90_0.COROUTINE_SUSPENDED;
                var7_10 = var5_8.d;
                var8_11 = 0x3F000000;
                var10_13 = 0.5f;
                var11_14 = 1;
                if (var7_10 != 0) {
                    if (var7_10 == var11_14) {
                        var1_1 = var5_8.a;
                        try {
                            vl2_2.b(var3_6);
                            break block23;
                        }
                        catch (Throwable var2_4) {
                            break block24;
                        }
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var3_6);
                var3_6 = this.e;
                var12_15 = new he_0((me_0)var2_3, this, null);
                var5_8.a = this;
                var5_8.d = var11_14;
                try {
                    var3_6.getClass();
                }
                catch (Throwable var1_2) {
                    ** continue;
                }
                var2_3 = new yj1((aS1)var1_1, (xj1)var3_6, var12_15, null);
                var1_1 = kotlinx.coroutines.d.c((Function2)var2_3, (f80_0)var5_8);
                if (var1_1 == var9_12) {
                    return var9_12;
                }
                var1_1 = this;
            }
            var2_3 = var1_1.d();
            var3_6 = var1_1.j;
            var13_16 = var3_6.c();
            var2_3 = var2_3.b(var13_16);
            if (var2_3 != null) {
                var14_18 = var3_6.c();
                var5_8 = var1_1.d();
                var13_16 = var5_8.e(var2_3);
                cfr_temp_0 = (var14_18 = Math.abs(var14_18 - var13_16)) - var10_13;
                var15_19 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                if (var15_19 <= 0 && (var15_19 = (float)(var3_6 = (Boolean)var1_1.d.invoke(var2_3)).booleanValue()) != false) {
                    var1_1.f(var2_3);
                }
            }
            return Unit.a;
lbl63:
            // 1 sources

            while (true) {
                var2_3 = var1_2;
                break;
            }
lbl67:
            // 2 sources

            while (true) {
                var1_1 = this;
                break block24;
                break;
            }
            catch (Throwable var2_5) {
                ** continue;
            }
        }
        var3_6 = var1_1.d();
        var5_8 = var1_1.j;
        var16_20 = var5_8.c();
        var3_6 = var3_6.b(var16_20);
        if (var3_6 != null) {
            var13_17 = var5_8.c();
            var9_12 = var1_1.d();
            var16_20 = var9_12.e(var3_6);
            cfr_temp_1 = (var13_17 = Math.abs(var13_17 - var16_20)) - var10_13;
            var4_7 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
            if (var4_7 <= 0 && (var4_7 = (int)(var5_8 = (Boolean)var1_1.d.invoke(var3_6)).booleanValue()) != 0) {
                var1_1.f(var3_6);
            }
        }
        throw var2_3;
    }

    /*
     * Unable to fully structure code
     */
    public final Object b(Object var1_1, aS1 var2_3, De$a var3_6, f80_0 var4_7) {
        block25: {
            block24: {
                block22: {
                    block21: {
                        var5_8 = var4_7 instanceof ie_1;
                        if (!var5_8) ** GOTO lbl-1000
                        var6_9 = var4_7;
                        var6_9 = (ie_1)var4_7;
                        var7_10 = var6_9.d;
                        var8_11 = -1 << -1;
                        var9_12 = var7_10 & var8_11;
                        if (var9_12 != 0) {
                            var6_9.d = var7_10 -= var8_11;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var6_9 = new ie_1(this, (f80_0)var4_7);
                        }
                        var4_7 = var6_9.b;
                        var10_13 = j90_0.COROUTINE_SUSPENDED;
                        var8_11 = var6_9.d;
                        var9_12 = 0;
                        var11_14 = 0.5f;
                        var12_15 = 1;
                        if (var8_11 != 0) {
                            if (var8_11 == var12_15) {
                                var1_1 = var6_9.a;
                                try {
                                    vl2_2.b(var4_7);
                                    break block21;
                                }
                                catch (Throwable var2_4) {
                                    break block22;
                                }
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        vl2_2.b(var4_7);
                        var4_7 = this.d();
                        var13_16 = var4_7.c(var1_1);
                        if (var13_16 == 0) break block24;
                        var4_7 = this.e;
                        var14_17 = new je_1(this, var1_1, (De$a)var3_6, null);
                        var6_9.a = this;
                        var6_9.d = var12_15;
                        try {
                            var4_7.getClass();
                        }
                        catch (Throwable var1_2) {
                            ** continue;
                        }
                        var1_1 = new yj1((aS1)var2_3, (xj1)var4_7, var14_17, null);
                        var1_1 = kotlinx.coroutines.d.c((Function2)var1_1, (f80_0)var6_9);
                        if (var1_1 == var10_13) {
                            return var10_13;
                        }
                        var1_1 = this;
                    }
                    var1_1.g(null);
                    var2_3 = var1_1.d();
                    var3_6 = var1_1.j;
                    var15_18 = var3_6.c();
                    var2_3 = var2_3.b(var15_18);
                    if (var2_3 == null) break block25;
                    var16_20 = var3_6.c();
                    var4_7 = var1_1.d();
                    var15_18 = var4_7.e(var2_3);
                    cfr_temp_0 = (var16_20 = Math.abs(var16_20 - var15_18)) - var11_14;
                    var17_21 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                    if (var17_21 > 0 || (var17_21 = (float)(var3_6 = (Boolean)var1_1.d.invoke(var2_3)).booleanValue()) == false) break block25;
                    var1_1.f(var2_3);
                    break block25;
lbl67:
                    // 1 sources

                    while (true) {
                        var2_3 = var1_2;
                        break;
                    }
lbl72:
                    // 2 sources

                    while (true) {
                        var1_1 = this;
                        break block22;
                        break;
                    }
                    catch (Throwable var2_5) {
                        ** continue;
                    }
                }
                var1_1.g(null);
                var3_6 = var1_1.d();
                var4_7 = var1_1.j;
                var18_22 = var4_7.c();
                var3_6 = var3_6.b(var18_22);
                if (var3_6 != null) {
                    var15_19 = var4_7.c();
                    var6_9 = var1_1.d();
                    var18_22 = var6_9.e(var3_6);
                    cfr_temp_1 = (var15_19 = Math.abs(var15_19 - var18_22)) - var11_14;
                    var13_16 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                    if (var13_16 <= 0 && (var13_16 = (int)(var4_7 = (Boolean)var1_1.d.invoke(var3_6)).booleanValue()) != 0) {
                        var1_1.f(var3_6);
                    }
                }
                throw var2_3;
            }
            this.f(var1_1);
        }
        return Unit.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object c(float f5, float f6, Object object) {
        Object object2;
        boolean bl2;
        Object object3 = this.d();
        float f7 = object3.e(object);
        Number number = (Number)this.b.invoke();
        float f8 = number.floatValue();
        float f11 = f7 == f5 ? 0 : (f7 < f5 ? -1 : 1);
        if (f11 == false || (bl2 = Float.isNaN(f7))) return object;
        Function1 function1 = this.a;
        if (f11 < 0) {
            f11 = 1.0f;
            float f12 = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1);
            if (f12 >= 0) {
                object = object3.a(f5, (boolean)f11);
                Intrinsics.checkNotNull(object);
                return object;
            } else {
                object2 = object3.a(f5, (boolean)f11);
                Intrinsics.checkNotNull(object2);
                object3 = Float.valueOf(Math.abs(object3.e(object2) - f7));
                object3 = (Number)function1.invoke(object3);
                float f14 = Math.abs(Math.abs(((Number)object3).floatValue()) + f7);
                float f15 = f5 == f14 ? 0 : (f5 < f14 ? -1 : 1);
                if (f15 >= 0) return object2;
            }
            return object;
        } else {
            f8 = -f8;
            f11 = 0.0f;
            float f16 = f6 == f8 ? 0 : (f6 < f8 ? -1 : 1);
            if (f16 <= 0) {
                object = object3.a(f5, false);
                Intrinsics.checkNotNull(object);
                return object;
            } else {
                object2 = object3.a(f5, false);
                Intrinsics.checkNotNull(object2);
                float f17 = object3.e(object2);
                object3 = Float.valueOf(Math.abs(f7 - f17));
                object3 = (Number)function1.invoke(object3);
                f17 = Math.abs(((Number)object3).floatValue());
                f17 = Math.abs(f7 - f17);
                f7 = 0.0f;
                float f18 = f5 - 0.0f;
                float f19 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                if (f19 < 0) {
                    float f20 = (f5 = Math.abs(f5)) - f17;
                    float f22 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                    if (f22 >= 0) return object2;
                    return object;
                } else {
                    float f23 = f5 == f17 ? 0 : (f5 > f17 ? 1 : -1);
                    if (f23 <= 0) return object2;
                }
            }
        }
        return object;
    }

    public final Xs0 d() {
        return (Xs0)this.m.getValue();
    }

    public final float e() {
        Object object = this.j;
        float f5 = ((D83)object).c();
        boolean bl2 = Float.isNaN(f5) ^ true;
        if (bl2) {
            return ((D83)object).c();
        }
        String string2 = "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void f(Object object) {
        this.g.setValue(object);
    }

    public final void g(Object object) {
        this.l.setValue(object);
    }
}

