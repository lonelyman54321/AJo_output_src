/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

public final class c$a {
    public long a = 0L;
    public c$a b;

    public final void a(int n3) {
        int n4 = 64;
        if (n3 >= n4) {
            c$a c$a = this.b;
            if (c$a != null) {
                c$a.a(n3 -= n4);
            }
        } else {
            long l2 = this.a;
            long l3 = 1L << n3 ^ (long)-1;
            this.a = l2 &= l3;
        }
    }

    public final int b(int n3) {
        c$a c$a = this.b;
        int n4 = 64;
        long l2 = 1L;
        if (c$a == null) {
            if (n3 >= n4) {
                return Long.bitCount(this.a);
            }
            long l3 = this.a;
            long l4 = (l2 << n3) - l2;
            return Long.bitCount(l3 & l4);
        }
        if (n3 < n4) {
            long l7 = this.a;
            long l8 = (l2 << n3) - l2;
            return Long.bitCount(l7 & l8);
        }
        n3 -= n4;
        n3 = c$a.b(n3);
        return Long.bitCount(this.a) + n3;
    }

    public final void c() {
        c$a c$a = this.b;
        if (c$a == null) {
            this.b = c$a = new c$a();
        }
    }

    public final boolean d(int n3) {
        int n4 = 64;
        if (n3 >= n4) {
            this.c();
            c$a c$a = this.b;
            return c$a.d(n3 -= n4);
        }
        long l2 = this.a;
        long l3 = 1L << n3;
        long l4 = (l2 &= l3) - (l3 = 0L);
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final void e(int n3, boolean bl2) {
        int n4 = 64;
        if (n3 >= n4) {
            this.c();
            c$a c$a = this.b;
            c$a.e(n3 -= n4, bl2);
        } else {
            c$a c$a;
            long l2 = this.a;
            long l3 = Long.MIN_VALUE & l2;
            long l4 = 0L;
            int n7 = 1;
            Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            boolean bl3 = object != false;
            long l7 = 1L;
            long l8 = (l7 << n3) - l7;
            l7 = l2 & l8;
            this.a = l2 = (l2 & (l8 ^= (long)-1)) << n7 | l7;
            if (bl2) {
                this.h(n3);
            } else {
                this.a(n3);
            }
            if (bl3 || (c$a = this.b) != null) {
                this.c();
                c$a = this.b;
                c$a.e(0, bl3);
            }
        }
    }

    public final boolean f(int n3) {
        int n4 = 64;
        if (n3 >= n4) {
            this.c();
            c$a c$a = this.b;
            return c$a.f(n3 -= n4);
        }
        long l2 = 1L;
        long l3 = l2 << n3;
        long l4 = this.a;
        long l7 = l4 & l3;
        long l8 = 0L;
        n3 = 1;
        Object object = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        boolean bl2 = object != false;
        long l12 = l3 ^ (long)-1;
        this.a = l4 &= l12;
        l3 -= l2;
        l2 = l4 & l3;
        l3 = Long.rotateRight((l3 ^ (long)-1) & l4, n3);
        this.a = l2 |= l3;
        c$a c$a = this.b;
        if (c$a != null) {
            n3 = (int)(c$a.d(0) ? 1 : 0);
            if (n3 != 0) {
                n3 = 63;
                this.h(n3);
            }
            c$a = this.b;
            c$a.f(0);
        }
        return bl2;
    }

    public final void g() {
        long l2;
        this.a = l2 = 0L;
        c$a c$a = this.b;
        if (c$a != null) {
            c$a.g();
        }
    }

    public final void h(int n3) {
        int n4 = 64;
        if (n3 >= n4) {
            this.c();
            c$a c$a = this.b;
            c$a.h(n3 -= n4);
        } else {
            long l2 = this.a;
            long l3 = 1L << n3;
            this.a = l2 |= l3;
        }
    }

    public final String toString() {
        Object object = this.b;
        if (object == null) {
            long l2 = this.a;
            object = Long.toBinaryString(l2);
        } else {
            object = new StringBuilder();
            String string2 = this.b.toString();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("xx");
            long l3 = this.a;
            string2 = Long.toBinaryString(l3);
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
        }
        return object;
    }
}

