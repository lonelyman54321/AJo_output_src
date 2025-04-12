/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class b92
extends LP1$c
implements xp1_1 {
    public Function1 n;
    public final boolean o;
    public long p;

    public b92(Function1 function1) {
        long l2;
        this.n = function1;
        this.o = true;
        int n3 = -1 << -1;
        this.p = l2 = dj1.a(n3, n3);
    }

    public final boolean g1() {
        return this.o;
    }

    public final /* synthetic */ void o0(zp1 zp12) {
    }

    public final void x(long l2) {
        long l3 = this.p;
        boolean bl2 = bj1.b(l3, l2);
        if (!bl2) {
            Function1 function1 = this.n;
            bj1 bj12 = new bj1(l2);
            function1.invoke(bj12);
            this.p = l2;
        }
    }
}

