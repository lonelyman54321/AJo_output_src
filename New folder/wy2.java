/*
 * Decompiled with CFR 0.152.
 */
public final class wy2 {
    public final IR1 a;
    public final IR1 b;
    public long c;
    public long d;

    public wy2() {
        IR1 iR1;
        int n3 = 6;
        this.a = iR1 = new IR1(n3);
        this.b = iR1 = new IR1(n3);
    }

    public static final long a(wy2 wy22, long l2, long l3) {
        wy22.getClass();
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false) {
            l4 = 4;
            l3 /= l4;
            l7 = 3;
            long l8 = l7;
            l2 = l2 / l4 + (l3 *= l8);
        }
        return l2;
    }
}

