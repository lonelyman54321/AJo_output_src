/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$c;
import androidx.compose.foundation.gestures.a$d;
import androidx.compose.foundation.gestures.b$a;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.gestures.d;
import androidx.compose.foundation.gestures.e;
import androidx.compose.foundation.gestures.f$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class b
extends mo0_0
implements gw2_0,
J30 {
    public pg2_0 p;
    public Function1 q;
    public boolean r;
    public wr1_1 s;
    public dr_2 t;
    public us0_0 u;
    public boolean v;
    public vg3_2 w;

    public b(Function1 function1, boolean bl2, wr1_1 wr1_12, pg2_0 pg2_02) {
        this.p = pg2_02;
        this.q = function1;
        this.r = bl2;
        this.s = wr1_12;
        new b$a(this);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object u1(b var0, f80_0 var1_1) {
        block9: {
            block8: {
                block7: {
                    block5: {
                        block6: {
                            var0.getClass();
                            var2_2 = var1_1 instanceof ss0_0;
                            if (!var2_2) ** GOTO lbl-1000
                            var3_3 = var1_1;
                            var3_3 = (ss0_0)var1_1;
                            var4_4 = var3_3.d;
                            var5_5 = -1 << -1;
                            var6_6 = var4_4 & var5_5;
                            if (var6_6 != 0) {
                                var3_3.d = var4_4 -= var5_5;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_3 = new ss0_0((b)var0, (f80_0)var1_1);
                            }
                            var1_1 = var3_3.b;
                            var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var5_5 = var3_3.d;
                            var6_6 = 1;
                            if (var5_5 == 0) break block5;
                            if (var5_5 != var6_6) break block6;
                            var0 = var3_3.a;
                            vl2_2.b(var1_1);
                            break block7;
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var1_1);
                    var1_1 = var0.u;
                    if (var1_1 == null) break block8;
                    var8_8 = var0.s;
                    if (var8_8 == null) break block7;
                    var9_9 = new ts0_0((us0_0)var1_1);
                    var3_3.a = var0;
                    var3_3.d = var6_6;
                    var1_1 = var8_8.a(var9_9, var3_3);
                    if (var1_1 == var7_7 /* !! */ ) break block9;
                }
                var1_1 = null;
                var0.u = null;
            }
            var10_10 = 0L;
            var0.A1(var10_10);
            var7_7 /* !! */  = Unit.a;
        }
        return var7_7 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object v1(b var0, a$c var1_1, f80_0 var2_2) {
        block10: {
            block11: {
                block8: {
                    block9: {
                        block5: {
                            block6: {
                                block7: {
                                    var0.getClass();
                                    var3_3 = var2_2 instanceof d;
                                    if (!var3_3) ** GOTO lbl-1000
                                    var4_4 = var2_2;
                                    var4_4 = (d)var2_2;
                                    var5_5 = var4_4.f;
                                    var6_6 = -1 << -1;
                                    var7_7 = var5_5 & var6_6;
                                    if (var7_7 != 0) {
                                        var4_4.f = var5_5 -= var6_6;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var4_4 = new d((b)var0, (f80_0)var2_2);
                                    }
                                    var2_2 = var4_4.d;
                                    var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var6_6 = var4_4.f;
                                    var7_7 = 2;
                                    var9_9 = 1;
                                    if (var6_6 == 0) break block5;
                                    if (var6_6 == var9_9) break block6;
                                    if (var6_6 != var7_7) break block7;
                                    var0 = var4_4.c;
                                    var1_1 = var4_4.b;
                                    var4_4 = var4_4.a;
                                    vl2_2.b(var2_2);
                                    break block8;
                                }
                                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var0;
                            }
                            var1_1 = var4_4.b;
                            var0 = var4_4.a;
                            vl2_2.b(var2_2);
                            break block9;
                        }
                        vl2_2.b(var2_2);
                        var2_2 = var0.u;
                        if (var2_2 == null || (var10_10 = var0.s) == null) break block9;
                        var11_11 = new ts0_0((us0_0)var2_2);
                        var4_4.a = var0;
                        var4_4.b = var1_1;
                        var4_4.f = var9_9;
                        var2_2 = var10_10.a(var11_11, (f80_0)var4_4);
                        if (var2_2 == var8_8 /* !! */ ) break block10;
                    }
                    var2_2 = new Object();
                    var10_10 = var0.s;
                    if (var10_10 == null) break block11;
                    var4_4.a = var0;
                    var4_4.b = var1_1;
                    var4_4.c = var2_2;
                    var4_4.f = var7_7;
                    if ((var4_4 = var10_10.a((kj1)var2_2, (f80_0)var4_4)) == var8_8 /* !! */ ) break block10;
                    var4_4 = var0;
                    var0 = var2_2;
                }
                var2_2 = var0;
                var0 = var4_4;
            }
            var0.u = var2_2;
            var12_12 = var1_1.a;
            var0.z1(var12_12);
            var8_8 /* !! */  = Unit.a;
        }
        return var8_8 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object w1(b var0, a$d var1_1, f80_0 var2_2) {
        block9: {
            block8: {
                block7: {
                    block5: {
                        block6: {
                            var0.getClass();
                            var3_3 = var2_2 instanceof e;
                            if (!var3_3) ** GOTO lbl-1000
                            var4_4 = var2_2;
                            var4_4 = (e)var2_2;
                            var5_5 = var4_4.e;
                            var6_6 = -1 << -1;
                            var7_7 = var5_5 & var6_6;
                            if (var7_7 != 0) {
                                var4_4.e = var5_5 -= var6_6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = new e((b)var0, (f80_0)var2_2);
                            }
                            var2_2 = var4_4.c;
                            var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var6_6 = var4_4.e;
                            var7_7 = 1;
                            if (var6_6 == 0) break block5;
                            if (var6_6 != var7_7) break block6;
                            var1_1 = var4_4.b;
                            var0 = var4_4.a;
                            vl2_2.b(var2_2);
                            break block7;
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var2_2);
                    var2_2 = var0.u;
                    if (var2_2 == null) break block8;
                    var9_9 = var0.s;
                    if (var9_9 == null) break block7;
                    var10_10 = new vs0_0((us0_0)var2_2);
                    var4_4.a = var0;
                    var4_4.b = var1_1;
                    var4_4.e = var7_7;
                    var2_2 = var9_9.a(var10_10, var4_4);
                    if (var2_2 == var8_8 /* !! */ ) break block9;
                }
                var2_2 = null;
                var0.u = null;
            }
            var11_11 = var1_1.a;
            var0.A1(var11_11);
            var8_8 /* !! */  = Unit.a;
        }
        return var8_8 /* !! */ ;
    }

    public final void A0() {
        vg3_2 vg3_22 = this.w;
        if (vg3_22 != null) {
            vg3_22.A0();
        }
    }

    public abstract void A1(long var1);

    public abstract boolean B1();

    public final void C1(Function1 object, boolean bl2, wr1_1 wr1_12, pg2_0 pg2_02, boolean bl3) {
        this.q = object;
        boolean bl4 = this.r;
        boolean bl5 = true;
        if (bl4 != bl2) {
            this.r = bl2;
            if (!bl2) {
                this.x1();
                object = this.w;
                if (object != null) {
                    this.s1((fo0)object);
                }
                bl4 = false;
                object = null;
                this.w = null;
            }
            bl3 = true;
        }
        if (!(bl4 = Intrinsics.areEqual(object = this.s, wr1_12))) {
            this.x1();
            this.s = wr1_12;
        }
        if ((object = this.p) != pg2_02) {
            this.p = pg2_02;
        } else {
            bl5 = bl3;
        }
        if (bl5 && (object = this.w) != null) {
            object.m0();
        }
    }

    public final void F0() {
        this.A0();
    }

    public void G(mv2_0 mv2_02, Nv2 nv2, long l2) {
        Object object;
        boolean bl2 = this.r;
        if (bl2 && (object = this.w) == null) {
            object = new c(this, null);
            Object object2 = tg3_0.a;
            object2 = new wg3_2(null, null, null, (Function2)object);
            this.r1((fo0)object2);
            this.w = object2;
        }
        if ((object = this.w) != null) {
            object.G(mv2_02, nv2, l2);
        }
    }

    public final /* synthetic */ void P() {
    }

    public final /* synthetic */ boolean Y0() {
        return false;
    }

    public final void a1() {
        this.A0();
    }

    public final void k1() {
        this.v = false;
        this.x1();
    }

    public final void x1() {
        us0_0 us0_02 = this.u;
        if (us0_02 != null) {
            wr1_1 wr1_12 = this.s;
            if (wr1_12 != null) {
                ts0_0 ts0_02 = new ts0_0(us0_02);
                wr1_12.c(ts0_02);
            }
            us0_02 = null;
            this.u = null;
        }
    }

    public abstract Object y1(f.a var1, f80_0 var2);

    public abstract void z1(long var1);
}

