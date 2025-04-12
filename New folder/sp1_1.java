/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sp1
 */
public final class sp1_1
extends w32_0 {
    public static final ei T;
    public rp1_1 P;
    public c60 Q;
    public xb1_0 R;
    public qp_0 S;

    static {
        ei ei2 = fi.a();
        long l2 = OX.h;
        ei2.f(l2);
        ei2.n(1.0f);
        ei2.m(1);
        T = ei2;
    }

    public sp1_1(xp1_0 object, rp1_1 rp1_12) {
        super((xp1_0)object);
        int n3;
        this.P = rp1_12;
        object = ((xp1_0)object).c;
        qp_0 qp_02 = null;
        if (object != null) {
            object = new sp1$a_0(this);
        } else {
            n3 = 0;
            object = null;
        }
        this.R = object;
        object = rp1_12.e();
        n3 = ((LP1$c)object).c & 0x200;
        if (n3 != 0) {
            object = "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode";
            Intrinsics.checkNotNull(rp1_12, (String)object);
            rp1_12 = (pp_1)rp1_12;
            qp_02 = new qp_0(this, (pp_1)rp1_12);
        }
        this.S = qp_02;
    }

    /*
     * Unable to fully structure code
     */
    public final void G1() {
        block6: {
            var1_1 = this.g;
            if (var1_1 != 0) {
                return;
            }
            this.u1();
            var2_2 = this.S;
            if (var2_2 == null) break block6;
            var3_3 = var2_2.b;
            var4_4 = this.R;
            Intrinsics.checkNotNull(var4_4);
            var4_4 = var4_4.p;
            var5_5 = var3_3.P0();
            if (var5_5 || (var1_1 = var2_2.c) != 0) ** GOTO lbl-1000
            var6_6 = this.c;
            var2_2 = this.R;
            var8_7 = 0;
            var9_8 = null;
            if (var2_2 != null) {
                var10_9 = var2_2.a;
                var1_1 = var2_2.b;
                var11_10 = dj1.a(var10_9, var1_1);
                var2_2 = new bj1(var11_10);
            } else {
                var1_1 = 0;
                var2_2 = null;
            }
            var1_1 = (int)bj1.a(var6_6, var2_2);
            if (var1_1 == 0) ** GOTO lbl-1000
            var2_2 = this.p;
            Intrinsics.checkNotNull(var2_2);
            var6_6 = var2_2.c;
            var2_2 = this.p;
            Intrinsics.checkNotNull(var2_2);
            var2_2 = var2_2.h1();
            if (var2_2 != null) {
                var8_7 = var2_2.a;
                var1_1 = var2_2.b;
                var13_11 = dj1.a(var8_7, var1_1);
                var9_8 = var2_2 = new bj1(var13_11);
            }
            if ((var1_1 = (int)bj1.a(var6_6, var9_8)) != 0) {
                var1_1 = 1;
            } else lbl-1000:
            // 3 sources

            {
                var1_1 = 0;
                var2_2 = null;
            }
            var3_3 = this.p;
            Intrinsics.checkNotNull(var3_3);
            var3_3.n = var1_1;
        }
        this.z0().j();
        var2_2 = this.p;
        Intrinsics.checkNotNull(var2_2);
        var2_2.n = false;
    }

    public final void H1(rp1_1 rp1_12) {
        fo0 fo02 = this.P;
        int n3 = Intrinsics.areEqual(rp1_12, fo02);
        if (n3 == 0) {
            fo02 = rp1_12.e();
            n3 = ((LP1$c)fo02).c & 0x200;
            if (n3 != 0) {
                Intrinsics.checkNotNull(rp1_12, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                fo02 = rp1_12;
                fo02 = (pp_1)rp1_12;
                qp_0 qp_02 = this.S;
                if (qp_02 != null) {
                    qp_02.b = fo02;
                } else {
                    qp_02 = new qp_0(this, (pp_1)fo02);
                }
                this.S = qp_02;
            } else {
                n3 = 0;
                fo02 = null;
                this.S = null;
            }
        }
        this.P = rp1_12;
    }

    public final int I(int n3) {
        Object object = this.S;
        if (object != null) {
            pp_1 pp_12 = ((qp_0)object).b;
            object = this.p;
            Intrinsics.checkNotNull(object);
            n3 = pp_12.c0();
        } else {
            object = this.P;
            w32_0 w32_02 = this.p;
            Intrinsics.checkNotNull(w32_02);
            n3 = object.minIntrinsicHeight(this, w32_02, n3);
        }
        return n3;
    }

    public final int N(int n3) {
        Object object = this.S;
        if (object != null) {
            pp_1 pp_12 = ((qp_0)object).b;
            object = this.p;
            Intrinsics.checkNotNull(object);
            n3 = pp_12.K();
        } else {
            object = this.P;
            w32_0 w32_02 = this.p;
            Intrinsics.checkNotNull(w32_02);
            n3 = object.minIntrinsicWidth(this, w32_02, n3);
        }
        return n3;
    }

    public final int P(int n3) {
        Object object = this.S;
        if (object != null) {
            pp_1 pp_12 = ((qp_0)object).b;
            object = this.p;
            Intrinsics.checkNotNull(object);
            n3 = pp_12.w0();
        } else {
            object = this.P;
            w32_0 w32_02 = this.p;
            Intrinsics.checkNotNull(w32_02);
            n3 = object.maxIntrinsicWidth(this, w32_02, n3);
        }
        return n3;
    }

    public final Ns2 Q(long l2) {
        Object object;
        block18: {
            Object object2;
            block15: {
                int n3;
                Object object3;
                boolean bl2;
                int n4;
                block17: {
                    block16: {
                        boolean bl3;
                        long l3;
                        long l4;
                        boolean bl4;
                        boolean bl5 = this.o;
                        if (bl5) {
                            object = this.Q;
                            if (object != null) {
                                l2 = ((c60)object).a;
                            } else {
                                String string2 = "Lookahead constraints cannot be null in approach pass.".toString();
                                object = new IllegalArgumentException(string2);
                                throw object;
                            }
                        }
                        this.n0(l2);
                        object2 = this.S;
                        if (object2 == null) break block15;
                        Object object4 = ((qp_0)object2).b;
                        Object object5 = ((qp_0)object2).a.R;
                        Intrinsics.checkNotNull(object5);
                        object5 = ((xb1_0)object5).z0();
                        object5.getWidth();
                        object5.getHeight();
                        n4 = object4.z0();
                        bl2 = true;
                        if (n4 == 0 && (bl4 = (object5 = this.Q) instanceof c60) && (n4 = (l4 = l2 - (l3 = ((c60)object5).a)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == 0) {
                            bl3 = false;
                            object = null;
                        } else {
                            bl3 = true;
                        }
                        ((qp_0)object2).c = bl3;
                        if (!bl3) {
                            object = this.p;
                            Intrinsics.checkNotNull(object);
                            ((w32_0)object).o = bl2;
                        }
                        Intrinsics.checkNotNull(this.p);
                        object = object4.L();
                        object3 = this.p;
                        Intrinsics.checkNotNull(object3);
                        ((w32_0)object3).o = false;
                        n3 = object.getWidth();
                        object4 = this.R;
                        Intrinsics.checkNotNull(object4);
                        int n7 = ((Ns2)object4).a;
                        if (n3 != n7) break block16;
                        n3 = object.getHeight();
                        object4 = this.R;
                        Intrinsics.checkNotNull(object4);
                        n7 = ((Ns2)object4).b;
                        if (n3 == n7) break block17;
                    }
                    bl2 = false;
                }
                n3 = (int)(((qp_0)object2).c ? 1 : 0);
                if (n3 == 0) {
                    object3 = this.p;
                    Intrinsics.checkNotNull(object3);
                    long l7 = ((Ns2)object3).c;
                    object3 = this.p;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((w32_0)object3).h1();
                    if (object3 != null) {
                        n4 = ((Ns2)object3).a;
                        n3 = ((Ns2)object3).b;
                        long l8 = dj1.a(n4, n3);
                        object3 = new bj1(l8);
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                    n3 = (int)(bj1.a(l7, object3) ? 1 : 0);
                    if (n3 != 0 && !bl2) {
                        object = object3 = new Sp1$b((bl1_0)object, this);
                    }
                }
                break block18;
            }
            object2 = this.P;
            w32_0 w32_02 = this.p;
            Intrinsics.checkNotNull(w32_02);
            object = object2.measure-3p2s80s(this, w32_02, l2);
        }
        this.y1((bl1_0)object);
        this.t1();
        return this;
    }

    public final void c1() {
        xb1_0 xb1_02 = this.R;
        if (xb1_02 == null) {
            this.R = xb1_02 = new sp1$a_0(this);
        }
    }

    public final xb1_0 h1() {
        return this.R;
    }

    public final void j0(long l2, float f5, W01 w01) {
        super.j0(l2, f5, w01);
        this.G1();
    }

    public final LP1$c j1() {
        return this.P.e();
    }

    public final void k0(long l2, float f5, Function1 function1) {
        super.k0(l2, f5, function1);
        this.G1();
    }

    public final int o0(Oc object) {
        Object object2 = this.R;
        int n3 = object2 != null ? ((object = (Integer)((LinkedHashMap)(object2 = ((xb1_0)object2).r)).get(object)) != null ? (Integer)object : -1 << -1) : tp1_0.a(this, (Oc)object);
        return n3;
    }

    public final int v(int n3) {
        Object object = this.S;
        if (object != null) {
            pp_1 pp_12 = ((qp_0)object).b;
            object = this.p;
            Intrinsics.checkNotNull(object);
            n3 = pp_12.E();
        } else {
            object = this.P;
            w32_0 w32_02 = this.p;
            Intrinsics.checkNotNull(w32_02);
            n3 = object.maxIntrinsicHeight(this, w32_02, n3);
        }
        return n3;
    }

    public final void v1(iL iL2, W01 object) {
        w32_0 w32_02 = this.p;
        Intrinsics.checkNotNull(w32_02);
        w32_02.Y0(iL2, (W01)object);
        object = aq1_0.a(this.m);
        boolean bl2 = object.getShowLayoutBounds();
        if (bl2) {
            object = T;
            this.a1(iL2, (ei)object);
        }
    }
}

