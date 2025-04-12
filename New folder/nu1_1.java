/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from nU1
 */
public final class nu1_1
extends v83_0 {
    public final Function1 e;
    public final v83_0 f;

    public nu1_1(int n3, y83 y832, Function1 function1, v83_0 v83_02) {
        super(n3, y832);
        this.e = function1;
        this.f = v83_02;
        v83_02.k();
    }

    public final void c() {
        int n3 = this.c;
        if (n3 == 0) {
            n3 = this.b;
            v83_0 v83_02 = this.f;
            int n4 = v83_02.d();
            if (n3 != n4) {
                this.a();
            }
            v83_02.l();
            super.c();
        }
    }

    public final Function1 f() {
        return this.e;
    }

    public final boolean g() {
        return true;
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
    }

    public final void n(pb3_0 object) {
        object = A83.a;
        String string2 = "Cannot modify a state object in a read-only snapshot".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final v83_0 t(Function1 function1) {
        int n3 = this.b;
        y83 y832 = this.a;
        Function1 function12 = this.e;
        function1 = A83.l(function1, function12, true);
        v83_0 v83_02 = this.f;
        nu1_1 nu1_12 = new nu1_1(n3, y832, function1, v83_02);
        return nu1_12;
    }
}

