/*
 * Decompiled with CFR 0.152.
 */
public final class Pj1
extends Uj1 {
    public Tj1 n;
    public boolean o;

    public final int maxIntrinsicHeight(Rj1 object, Qj1 qj1, int n3) {
        object = this.n;
        Tj1 tj1 = Tj1.Min;
        int n4 = object == tj1 ? qj1.I(n3) : qj1.v(n3);
        return n4;
    }

    public final int minIntrinsicHeight(Rj1 object, Qj1 qj1, int n3) {
        object = this.n;
        Tj1 tj1 = Tj1.Min;
        int n4 = object == tj1 ? qj1.I(n3) : qj1.v(n3);
        return n4;
    }

    public final long r1(xk1_0 xk1_02, long l2) {
        int n3;
        int n4;
        Tj1 tj1 = this.n;
        Tj1 tj12 = Tj1.Min;
        if (tj1 == tj12) {
            n4 = c60.i(l2);
            n3 = xk1_02.I(n4);
        } else {
            n4 = c60.i(l2);
            n3 = xk1_02.v(n4);
        }
        n4 = 0;
        StringBuilder stringBuilder = null;
        if (n3 < 0) {
            n3 = 0;
            xk1_02 = null;
        }
        if (n3 >= 0) {
            return f60.i(0, -1 >>> 1, n3, n3);
        }
        stringBuilder = new StringBuilder("height(");
        stringBuilder.append(n3);
        stringBuilder.append(") must be >= 0");
        hz0.a(stringBuilder.toString());
        throw null;
    }

    public final boolean s1() {
        return this.o;
    }
}

