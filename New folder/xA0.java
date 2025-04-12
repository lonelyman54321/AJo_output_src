/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class xA0
extends up1_1 {
    public gr3 n;
    public gr3$a o;
    public gr3$a p;
    public gr3$a q;
    public yA0 r;
    public JE0 s;
    public Function0 t;
    public X01 u;
    public long v;
    public Nc w;
    public final xA0$i x;
    public final xA0$j y;

    public xA0(gr3 object, gr3$a gr3$a, gr3$a gr3$a2, gr3$a gr3$a3, yA0 yA02, JE0 jE0, Function0 function0, X01 x01) {
        long l2;
        this.n = object;
        this.o = gr3$a;
        this.p = gr3$a2;
        this.q = gr3$a3;
        this.r = yA02;
        this.s = jE0;
        this.t = function0;
        this.u = x01;
        this.v = l2 = ql_1.a;
        f60.b(0, 0, 15);
        this.x = object = new xA0$i(this);
        this.y = object = new xA0$j(this);
    }

    public final void j1() {
        long l2;
        this.v = l2 = ql_1.a;
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 xk1_02, long l2) {
        xA0 xA02 = this;
        dl1_1 dl1_13 = dl1_12;
        Object object = this.n.a.a();
        Object object2 = this.n.d.getValue();
        int n3 = 0;
        Object object3 = null;
        if (object == object2) {
            this.w = null;
        } else {
            object = this.w;
            if (object == null) {
                object = this.r1();
                if (object == null) {
                    object = Nc$a.a;
                }
                xA02.w = object;
            }
        }
        boolean n4 = dl1_12.W();
        long l3 = 0xFFFFFFFFL;
        int n7 = 32;
        if (n4) {
            long l4;
            object = xk1_02.Q(l2);
            n3 = ((Ns2)object).a;
            int n8 = ((Ns2)object).b;
            xA02.v = l4 = dj1.a(n3, n8);
            n3 = (int)(l4 >> n7);
            n7 = (int)(l3 & l4);
            xA0$b xA0$b = new xA0$b((Ns2)object);
            return cl1_0.a(dl1_13, n3, n7, xA0$b);
        }
        object = (Boolean)xA02.t.invoke();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            xA0$c xA0$c;
            long l7;
            Lambda lambda;
            object = xA02.u;
            cA0 cA02 = object.init();
            Ns2 ns2 = xk1_02.Q(l2);
            int n10 = ns2.a;
            int n14 = ns2.b;
            long l8 = dj1.a(n10, n14);
            long l12 = xA02.v;
            long l14 = ql_1.a;
            boolean bl3 = bj1.b(l12, l14) ^ true;
            l12 = bl3 ? xA02.v : l8;
            object = xA02.o;
            if (object != null) {
                object3 = new xA0$e(xA02, l12);
                lambda = xA02.x;
                object3 = ((gr3$a)object).a((Function1)((Object)lambda), (Function1)object3);
            }
            if (object3 != null) {
                object = (bj1)((gr3$a$a)object3).getValue();
                l8 = ((bj1)object).a;
            }
            l14 = l2;
            l8 = f60.e(l2, l8);
            object = xA02.p;
            if (object != null) {
                object3 = new xA0$g(xA02, l12);
                lambda = xA0$f.c;
                object = (Si1)((gr3$a)object).a((Function1)((Object)lambda), (Function1)object3).getValue();
                l7 = l14 = ((Si1)object).a;
            } else {
                l7 = 0L;
            }
            object = xA02.q;
            if (object != null) {
                object3 = new xA0$h(xA02, l12);
                lambda = xA02.y;
                object = (Si1)((gr3$a)object).a((Function1)((Object)lambda), (Function1)object3).getValue();
                l14 = ((Si1)object).a;
            } else {
                l14 = 0L;
            }
            object = xA02.w;
            if (object != null) {
                bp1_0 bp1_02 = bp1_0.Ltr;
                l3 = l14;
                l14 = object.a(l12, l8, bp1_02);
            } else {
                l3 = l14;
                l14 = 0L;
            }
            long l15 = Si1.d(l14, l3);
            n7 = (int)(l8 >> n7);
            int n15 = (int)(0xFFFFFFFFL & l8);
            lambda = xA0$c;
            l8 = l15;
            l12 = l7;
            xA0$c = new xA0$c(ns2, l15, l7, cA02);
            return cl1_0.a(dl1_13, n7, n15, xA0$c);
        }
        long l16 = l2;
        object = xk1_02.Q(l2);
        n7 = ((Ns2)object).a;
        n3 = ((Ns2)object).b;
        xA0$d xA0$d = new xA0$d((Ns2)object);
        return cl1_0.a(dl1_13, n7, n3, xA0$d);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Nc r1() {
        void var2_7;
        Object object;
        block7: {
            block6: {
                block5: {
                    object = this.n.f();
                    Xz0 xz0 = Xz0.PreEnter;
                    Xz0 xz02 = Xz0.Visible;
                    boolean bl2 = object.c((Object)xz0, (Object)xz02);
                    Object var2_3 = null;
                    if (!bl2) break block5;
                    object = this.r.a().c;
                    if (object == null || (object = ((BR)object).a) == null) {
                        object = this.s.a().c;
                        if (object == null) return var2_7;
                        Nc nc = ((BR)object).a;
                        return var2_7;
                    }
                    break block6;
                }
                object = this.s.a().c;
                if (object == null || (object = ((BR)object).a) == null) break block7;
            }
            Object object2 = object;
            return var2_7;
        }
        object = this.r.a().c;
        if (object == null) return var2_7;
        Nc nc = ((BR)object).a;
        return var2_7;
    }
}

