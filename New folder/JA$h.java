/*
 * Decompiled with CFR 0.152.
 */
public final class JA$h
implements JA$d {
    public final Xm2 a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public JA$h(zQ1$b object) {
        int n3;
        int n4;
        this.a = object = ((zQ1$b)object).b;
        ((Xm2)object).I(12);
        this.c = n4 = ((Xm2)object).A() & 0xFF;
        this.b = n3 = ((Xm2)object).A();
    }

    public final int a() {
        int n3 = 8;
        Xm2 xm2 = this.a;
        int n4 = this.c;
        if (n4 == n3) {
            return xm2.w();
        }
        n3 = 16;
        if (n4 == n3) {
            return xm2.C();
        }
        n3 = this.d;
        this.d = n4 = n3 + 1;
        if ((n3 %= 2) == 0) {
            this.e = n3 = xm2.w();
            return (n3 & 0xF0) >> 4;
        }
        return this.e & 0xF;
    }

    public final int b() {
        return -1;
    }

    public final int c() {
        return this.b;
    }
}

