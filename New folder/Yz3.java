/*
 * Decompiled with CFR 0.152.
 */
public final class Yz3
implements i72 {
    public final int a;
    public final int b;

    public Yz3(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final int a(int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = this.b)) {
            n4 = this.a;
            Zz3.c(n3, n4, n3);
        }
        return n3;
    }

    public final int b(int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = this.a)) {
            n4 = this.b;
            Zz3.b(n3, n4, n3);
        }
        return n3;
    }
}

