/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class B91
extends LP1$c
implements gw2_0 {
    public wr1_1 n;
    public x91 o;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object r1(B91 var0, f80_0 var1_1) {
        block9: {
            block8: {
                block7: {
                    block5: {
                        block6: {
                            var0.getClass();
                            var2_2 = var1_1 instanceof z91;
                            if (!var2_2) ** GOTO lbl-1000
                            var3_3 = var1_1;
                            var3_3 = (z91)var1_1;
                            var4_4 = var3_3.e;
                            var5_5 = -1 << -1;
                            var6_6 = var4_4 & var5_5;
                            if (var6_6 != 0) {
                                var3_3.e = var4_4 -= var5_5;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_3 = new z91((B91)var0, (f80_0)var1_1);
                            }
                            var1_1 = var3_3.c;
                            var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var5_5 = var3_3.e;
                            var6_6 = 1;
                            if (var5_5 == 0) break block5;
                            if (var5_5 != var6_6) break block6;
                            var0 = var3_3.b;
                            var3_3 = var3_3.a;
                            vl2_2.b(var1_1);
                            var1_1 = var0;
                            var0 = var3_3;
                            break block7;
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var1_1);
                    var1_1 = var0.o;
                    if (var1_1 != null) break block8;
                    var1_1 = new x91();
                    var8_8 = var0.n;
                    var3_3.a = var0;
                    var3_3.b = var1_1;
                    var3_3.e = var6_6;
                    if ((var3_3 = var8_8.a((kj1)var1_1, (f80_0)var3_3)) == var7_7 /* !! */ ) break block9;
                }
                var0.o = var1_1;
            }
            var7_7 /* !! */  = Unit.a;
        }
        return var7_7 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object s1(B91 var0, f80_0 var1_1) {
        block9: {
            block8: {
                block7: {
                    block5: {
                        block6: {
                            var0.getClass();
                            var2_2 = var1_1 instanceof A91;
                            if (!var2_2) ** GOTO lbl-1000
                            var3_3 = var1_1;
                            var3_3 = (A91)var1_1;
                            var4_4 = var3_3.d;
                            var5_5 = -1 << -1;
                            var6_6 = var4_4 & var5_5;
                            if (var6_6 != 0) {
                                var3_3.d = var4_4 -= var5_5;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_3 = new A91((B91)var0, (f80_0)var1_1);
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
                    var1_1 = var0.o;
                    if (var1_1 == null) break block8;
                    var8_8 = new y91((x91)var1_1);
                    var1_1 = var0.n;
                    var3_3.a = var0;
                    var3_3.d = var6_6;
                    if ((var1_1 = var1_1.a(var8_8, var3_3)) == var7_7 /* !! */ ) break block9;
                }
                var1_1 = null;
                var0.o = null;
            }
            var7_7 /* !! */  = Unit.a;
        }
        return var7_7 /* !! */ ;
    }

    public final void A0() {
        this.t1();
    }

    public final void F0() {
        this.A0();
    }

    public final void G(mv2_0 object, Nv2 object2, long l2) {
        Nv2 nv2 = Nv2.Main;
        if (object2 == nv2) {
            int n3 = ((mv2_0)object).d;
            int n4 = Pv2.a(n3, 4);
            int n7 = 3;
            if (n4 != 0) {
                object = this.f1();
                object2 = new B91$a(this, null);
                Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
            } else {
                n4 = 5;
                if ((n3 = (int)(Pv2.a(n3, n4) ? 1 : 0)) != 0) {
                    object = this.f1();
                    object2 = new B91$b(this, null);
                    Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
                }
            }
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
        this.t1();
    }

    public final void t1() {
        x91 x912 = this.o;
        if (x912 != null) {
            y91 y912 = new y91(x912);
            this.n.c(y912);
            x912 = null;
            this.o = null;
        }
    }
}

