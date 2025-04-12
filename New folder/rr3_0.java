/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Rr3
 */
public final class rr3_0
extends v83_0 {
    public final v83_0 e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    public rr3_0(v83_0 object, Function1 function1, boolean bl2) {
        long l2;
        y83 y832 = y83.e;
        super(0, y832);
        this.e = object;
        this.f = false;
        this.g = bl2;
        if (object == null || (object = ((v83_0)object).f()) == null) {
            object = ((f01_0)A83.j.get()).e;
        }
        this.h = object = A83.l(function1, (Function1)object, false);
        this.i = l2 = zn0_2.a();
    }

    public final void c() {
        v83_0 v83_02;
        this.c = true;
        boolean bl2 = this.g;
        if (bl2 && (v83_02 = this.e) != null) {
            v83_02.c();
        }
    }

    public final int d() {
        return this.u().d();
    }

    public final y83 e() {
        return this.u().e();
    }

    public final Function1 f() {
        return this.h;
    }

    public final boolean g() {
        return this.u().g();
    }

    public final Function1 i() {
        return null;
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
        this.u().m();
    }

    public final void n(pb3_0 pb3_02) {
        this.u().n(pb3_02);
    }

    public final v83_0 t(Function1 object) {
        Object object2 = this.h;
        boolean bl2 = true;
        object = A83.l((Function1)object, (Function1)object2, bl2);
        boolean bl3 = this.f;
        if (!bl3) {
            object2 = this.u().t(null);
            object = A83.h((v83_0)object2, (Function1)object, bl2);
        } else {
            object2 = this.u();
            object = ((v83_0)object2).t((Function1)object);
        }
        return object;
    }

    public final v83_0 u() {
        v83_0 v83_02 = this.e;
        if (v83_02 == null) {
            v83_02 = (v83_0)A83.j.get();
        }
        return v83_02;
    }
}

