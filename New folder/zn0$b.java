/*
 * Decompiled with CFR 0.152.
 */
public final class zn0$b
extends zn0$h
implements Comparable {
    public final int e;
    public final int f;

    public zn0$b(int n3, qp3 qp32, int n4, zn0$d zn0$d, int n7) {
        super(n3, qp32, n4);
        n3 = (int)(zn0$d.O ? 1 : 0);
        this.e = n3 = (int)(tj2_0.d(n7, n3 != 0) ? 1 : 0);
        this.f = n3 = this.d.b();
    }

    public final int a() {
        return this.e;
    }

    public final int compareTo(Object object) {
        object = (zn0$b)object;
        int n3 = this.f;
        int n4 = ((zn0$b)object).f;
        return Integer.compare(n3, n4);
    }
}

