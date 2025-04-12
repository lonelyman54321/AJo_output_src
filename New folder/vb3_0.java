/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vb3
 */
public final class vb3_0
implements fi0_0 {
    public final fi0_0 a;
    public final long b;

    public vb3_0(il0_0 il0_02, long l2) {
        this.a = il0_02;
        long l3 = il0_02.d;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 >= 0) {
            l4 = 1;
        } else {
            l4 = 0;
            il0_02 = null;
        }
        ct3.a((boolean)l4);
        this.b = l2;
    }

    public final boolean b(byte[] byArray, int n3, int n4, boolean bl2) {
        return this.a.b(byArray, n3, n4, bl2);
    }

    public final void d() {
        this.a.d();
    }

    public final boolean e(byte[] byArray, int n3, int n4, boolean bl2) {
        return this.a.e(byArray, n3, n4, bl2);
    }

    public final void f(int n3, byte[] byArray, int n4) {
        this.a.f(n3, byArray, n4);
    }

    public final long getLength() {
        long l2 = this.a.getLength();
        long l3 = this.b;
        return l2 - l3;
    }

    public final long getPosition() {
        long l2 = this.a.getPosition();
        long l3 = this.b;
        return l2 - l3;
    }

    public final long h() {
        long l2 = this.a.h();
        long l3 = this.b;
        return l2 - l3;
    }

    public final void i(int n3) {
        this.a.i(n3);
    }

    public final void j(int n3) {
        this.a.j(n3);
    }

    public final int read(byte[] byArray, int n3, int n4) {
        return this.a.read(byArray, n3, n4);
    }

    public final void readFully(byte[] byArray, int n3, int n4) {
        this.a.readFully(byArray, n3, n4);
    }
}

