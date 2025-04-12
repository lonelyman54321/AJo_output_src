/*
 * Decompiled with CFR 0.152.
 */
public final class LF3$c
implements Comparable {
    public final int a;
    public final IF3 b;

    public LF3$c(int n3, IF3 iF3) {
        this.a = n3;
        this.b = iF3;
    }

    public final int compareTo(Object object) {
        object = (LF3$c)object;
        int n3 = this.a;
        int n4 = ((LF3$c)object).a;
        return Integer.compare(n3, n4);
    }
}

