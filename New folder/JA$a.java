/*
 * Decompiled with CFR 0.152.
 */
public final class JA$a {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final Xm2 f;
    public final Xm2 g;
    public int h;
    public int i;

    public JA$a(Xm2 xm2, Xm2 xm22, boolean bl2) {
        this.g = xm2;
        this.f = xm22;
        this.e = bl2;
        int n3 = 12;
        xm22.I(n3);
        int n4 = xm22.A();
        this.a = n4;
        xm2.I(n3);
        n4 = xm2.A();
        this.i = n4;
        int n7 = xm2.i();
        n4 = 1;
        if (n7 != n4) {
            n4 = 0;
            xm22 = null;
        }
        s70_0.a("first_chunk must be 1", n4 != 0);
        this.b = -1;
    }

    public final boolean a() {
        int n3 = this.b;
        int n4 = 1;
        this.b = n3 += n4;
        int n7 = this.a;
        if (n3 == n7) {
            return false;
        }
        n3 = this.e ? 1 : 0;
        Xm2 xm2 = this.f;
        long l2 = n3 != 0 ? xm2.B() : xm2.y();
        this.d = l2;
        n3 = this.b;
        n7 = this.h;
        if (n3 == n7) {
            Xm2 xm22 = this.g;
            this.c = n7 = xm22.A();
            xm22.J(4);
            this.i = n7 = this.i - n4;
            n3 = n7 > 0 ? xm22.A() - n4 : -1;
            this.h = n3;
        }
        return n4 != 0;
    }
}

