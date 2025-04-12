/*
 * Decompiled with CFR 0.152.
 */
public final class Pf3$a
implements Comparable {
    public final long a;
    public final byte[] b;

    public Pf3$a(byte[] byArray, long l2) {
        this.a = l2;
        this.b = byArray;
    }

    public final int compareTo(Object object) {
        object = (Pf3$a)object;
        long l2 = this.a;
        long l3 = ((Pf3$a)object).a;
        return Long.compare(l2, l3);
    }
}

