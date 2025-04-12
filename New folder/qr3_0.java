/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Qr3
 */
public final class qr3_0
extends RR1 {
    public final RR1 o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    public qr3_0(RR1 object, Function1 function1, Function1 function12, boolean bl2, boolean bl3) {
        long l2;
        Function1 function13;
        y83 y832 = y83.e;
        if (object == null || (function13 = ((RR1)object).x()) == null) {
            function13 = ((f01_0)A83.j.get()).e;
        }
        function1 = A83.l(function1, function13, bl2);
        if (object == null || (function13 = ((RR1)object).i()) == null) {
            function13 = ((f01_0)A83.j.get()).f;
        }
        function12 = A83.b(function12, function13);
        super(0, y832, function1, function12);
        this.o = object;
        this.p = bl2;
        this.q = bl3;
        this.r = object = this.e;
        this.s = object = this.f;
        this.t = l2 = zn0_2.a();
    }

    public final void B(pr1_1 pr1_12) {
        R83.a();
        throw null;
    }

    public final RR1 C(Function1 object, Function1 function1) {
        Function1 function12 = this.r;
        boolean bl2 = true;
        Function1 function13 = A83.l((Function1)object, function12, bl2);
        object = this.s;
        Function1 function14 = A83.b(function1, (Function1)object);
        boolean bl3 = this.p;
        if (!bl3) {
            object = this.D();
            function1 = null;
            RR1 rR1 = ((RR1)object).C(null, function14);
            boolean bl4 = true;
            object = new qr3_0(rR1, function13, function14, false, bl4);
        } else {
            object = this.D().C(function13, function14);
        }
        return object;
    }

    public final RR1 D() {
        RR1 rR1 = this.o;
        if (rR1 == null) {
            rR1 = (RR1)A83.j.get();
        }
        return rR1;
    }

    public final void c() {
        RR1 rR1;
        this.c = true;
        boolean bl2 = this.q;
        if (bl2 && (rR1 = this.o) != null) {
            rR1.c();
        }
    }

    public final int d() {
        return this.D().d();
    }

    public final y83 e() {
        return this.D().e();
    }

    public final Function1 f() {
        return this.r;
    }

    public final boolean g() {
        return this.D().g();
    }

    public final int h() {
        return this.D().h();
    }

    public final Function1 i() {
        return this.s;
    }

    public final void k() {
        R83.a();
        throw null;
    }

    public final void l() {
        R83.a();
        throw null;
    }

    public final void m() {
        this.D().m();
    }

    public final void n(pb3_0 pb3_02) {
        this.D().n(pb3_02);
    }

    public final void q(int n3) {
        R83.a();
        throw null;
    }

    public final void r(y83 y832) {
        R83.a();
        throw null;
    }

    public final void s(int n3) {
        this.D().s(n3);
    }

    public final v83_0 t(Function1 object) {
        Object object2 = this.r;
        boolean bl2 = true;
        object = A83.l((Function1)object, (Function1)object2, bl2);
        boolean bl3 = this.p;
        if (!bl3) {
            object2 = this.D().t(null);
            object = A83.h((v83_0)object2, (Function1)object, bl2);
        } else {
            object2 = this.D();
            object = ((RR1)object2).t((Function1)object);
        }
        return object;
    }

    public final w83_0 v() {
        return this.D().v();
    }

    public final pr1_1 w() {
        return this.D().w();
    }

    public final Function1 x() {
        return this.r;
    }
}

