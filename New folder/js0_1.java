/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Js0
 */
public final class js0_1
extends LP1$c
implements yr3_0,
Es0 {
    public final Function1 n;
    public final Hs0 o;
    public Es0 p;
    public ls0_0 q;

    public js0_1(Function1 object) {
        this.n = object;
        this.o = object = Hs0.a;
    }

    public final void C(cs0_0 cs0_02) {
        ls0_0 ls0_02 = this.q;
        if (ls0_02 == null) {
            ls0_02 = this.p;
            if (ls0_02 != null) {
                ls0_02.C(cs0_02);
            }
        } else {
            ls0_02.C(cs0_02);
        }
    }

    public final void I(cs0_0 object) {
        Xr3 xr3;
        js0$a_1 js0$a_1 = new js0$a_1((cs0_0)object);
        if ((object = js0$a_1.invoke(this)) == (xr3 = Xr3.ContinueTraversal)) {
            Zr3.d(this, js0$a_1);
        }
    }

    public final void K0(cs0_0 cs0_02) {
        ls0_0 ls0_02 = this.q;
        if (ls0_02 != null) {
            ls0_02.K0(cs0_02);
        }
        if ((ls0_02 = this.p) != null) {
            ls0_02.K0(cs0_02);
        }
        this.p = null;
    }

    /*
     * Unable to fully structure code
     */
    public final void R0(cs0_0 var1_1) {
        var2_2 = this.p;
        if (var2_2 == null) ** GOTO lbl-1000
        var3_3 = var1_1.a;
        var4_4 = var3_3.getX();
        var5_5 = var3_3.getY();
        var6_6 = h72.a(var4_4, var5_5);
        var8_7 = Ks0.a((Es0)var2_2, var6_6);
        var9_8 = true;
        var4_4 = 1.4E-45f;
        if (var8_7 == var9_8) {
            var3_3 = var2_2;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = this.a;
            var8_7 = var3_3.m;
            if (!var8_7) {
                var8_7 = false;
                var5_5 = 0.0f;
                var3_3 = null;
            } else {
                var3_3 = new Ref$ObjectRef();
                var10_9 = new Js0$b((Ref$ObjectRef)var3_3, this, var1_1);
                Zr3.d(this, (Function1)var10_9);
                var3_3 = (yr3_0)var3_3.element;
            }
            var3_3 = (Es0)var3_3;
        }
        if (var3_3 != null && var2_2 == null) {
            var3_3.C(var1_1);
            var3_3.R0(var1_1);
            var2_2 = this.q;
            if (var2_2 != null) {
                var2_2.K0(var1_1);
            }
        } else if (var3_3 == null && var2_2 != null) {
            var10_9 = this.q;
            if (var10_9 != null) {
                var10_9.C(var1_1);
                var10_9.R0(var1_1);
            }
            var2_2.K0(var1_1);
        } else {
            var9_8 = Intrinsics.areEqual(var3_3, var2_2);
            if (!var9_8) {
                if (var3_3 != null) {
                    var3_3.C(var1_1);
                    var3_3.R0(var1_1);
                }
                if (var2_2 != null) {
                    var2_2.K0(var1_1);
                }
            } else if (var3_3 != null) {
                var3_3.R0(var1_1);
            } else {
                var2_2 = this.q;
                if (var2_2 != null) {
                    var2_2.R0(var1_1);
                }
            }
        }
        this.p = var3_3;
    }

    public final void b0(cs0_0 cs0_02) {
        ls0_0 ls0_02 = this.q;
        if (ls0_02 == null) {
            ls0_02 = this.p;
            if (ls0_02 != null) {
                ls0_02.b0(cs0_02);
            }
        } else {
            ls0_02.b0(cs0_02);
        }
    }

    public final boolean k0(cs0_0 cs0_02) {
        boolean bl2;
        ls0_0 ls0_02 = this.p;
        if (ls0_02 == null) {
            ls0_02 = this.q;
            if (ls0_02 != null) {
                bl2 = ls0_02.k0(cs0_02);
            } else {
                bl2 = false;
                cs0_02 = null;
            }
        } else {
            bl2 = ls0_02.k0(cs0_02);
        }
        return bl2;
    }

    public final void k1() {
        this.q = null;
        this.p = null;
    }

    public final Object v() {
        return this.o;
    }
}

