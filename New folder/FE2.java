/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class FE2
extends v83_0 {
    public final Function1 e;
    public int f;

    public FE2(int n3, y83 y832, Function1 function1) {
        super(n3, y832);
        this.e = function1;
        this.f = 1;
    }

    public final void c() {
        boolean bl2 = this.c;
        if (!bl2) {
            this.l();
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
        int n3;
        this.f = n3 = this.f + 1;
    }

    public final void l() {
        int n3;
        this.f = n3 = this.f + -1;
        if (n3 == 0) {
            this.a();
        }
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
        A83.d(this);
        int n3 = this.b;
        y83 y832 = this.a;
        Function1 function12 = this.e;
        function1 = A83.l(function1, function12, true);
        nu1_1 nu1_12 = new nu1_1(n3, y832, function1, this);
        return nu1_12;
    }
}

