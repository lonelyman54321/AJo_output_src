/*
 * Decompiled with CFR 0.152.
 */
public final class Ub1$a {
    public final Ub1$a[] a;
    public final int b;
    public final int c;

    public Ub1$a() {
        Ub1$a[] ub1$aArray = new Ub1$a[256];
        this.a = ub1$aArray;
        this.b = 0;
        this.c = 0;
    }

    public Ub1$a(int n3, int n4) {
        this.a = null;
        this.b = n3;
        n3 = n4 & 7;
        if (n3 == 0) {
            n3 = 8;
        }
        this.c = n3;
    }
}

