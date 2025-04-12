/*
 * Decompiled with CFR 0.152.
 */
public abstract class fE {
    public int a;

    public final void e(int n3) {
        int n4 = this.a;
        this.a = n3 |= n4;
    }

    public final boolean f(int n3) {
        int n4 = this.a & n3;
        n3 = n4 == n3 ? 1 : 0;
        return n3 != 0;
    }
}

