/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.i;
import kotlin.jvm.functions.Function1;

public final class B20
extends ut1_0 {
    public final A20 g;
    public final hx0_2 h;
    public Function1 i;
    public Function1 j;
    public Function1 k;
    public Function1 l;
    public Function1 m;

    public B20(A20 a20, String string2, u10 u102) {
        super(a20, string2);
        this.g = a20;
        this.h = u102;
    }

    public final i a() {
        Function1 function1;
        A20$a a20$a = (A20$a)super.a();
        a20$a.l = function1 = this.i;
        a20$a.m = function1 = this.j;
        a20$a.n = function1 = this.k;
        a20$a.o = function1 = this.l;
        a20$a.p = function1 = this.m;
        return a20$a;
    }

    public final i b() {
        A20 a20 = this.g;
        hx0_2 hx0_22 = this.h;
        A20$a a20$a = new A20$a(a20, hx0_22);
        return a20$a;
    }
}

