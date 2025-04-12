/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from rx
 */
public final class rx_0
implements iv1_0 {
    public final iv1_0 a;
    public int b = 0;
    public int c;
    public int d;
    public Object e;

    public rx_0(iv1_0 iv1_02) {
        int n3;
        this.c = n3 = -1;
        this.d = n3;
        this.e = null;
        this.a = iv1_02;
    }

    public final void a(int n3, int n4) {
        int n7;
        int n8;
        int n10 = this.b;
        int n14 = 1;
        if (n10 == n14 && n3 >= (n10 = this.c) && n3 <= (n8 = n10 + (n7 = this.d))) {
            this.d = n7 += n4;
            this.c = n3 = Math.min(n3, n10);
            return;
        }
        this.e();
        this.c = n3;
        this.d = n4;
        this.b = n14;
    }

    public final void b(int n3, int n4) {
        int n7;
        int n8 = this.b;
        int n10 = 2;
        if (n8 == n10 && (n8 = this.c) >= n3 && n8 <= (n7 = n3 + n4)) {
            this.d = n8 = this.d + n4;
            this.c = n3;
            return;
        }
        this.e();
        this.c = n3;
        this.d = n4;
        this.b = n10;
    }

    public final void c(int n3, int n4, Object object) {
        Object object2;
        int n7;
        int n8;
        int n10 = this.b;
        int n14 = 3;
        if (n10 == n14 && n3 <= (n8 = (n10 = this.c) + (n7 = this.d)) && (n8 = n3 + n4) >= n10 && (object2 = this.e) == object) {
            this.c = n3 = Math.min(n3, n10);
            n3 = Math.max(n7 += n10, n8);
            n4 = this.c;
            this.d = n3 -= n4;
            return;
        }
        this.e();
        this.c = n3;
        this.d = n4;
        this.e = object;
        this.b = n14;
    }

    public final void d(int n3, int n4) {
        this.e();
        this.a.d(n3, n4);
    }

    public final void e() {
        int n3 = this.b;
        if (n3 == 0) {
            return;
        }
        int n4 = 1;
        iv1_0 iv1_02 = this.a;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    n3 = this.c;
                    n4 = this.d;
                    Object object = this.e;
                    iv1_02.c(n3, n4, object);
                }
            } else {
                n3 = this.c;
                n4 = this.d;
                iv1_02.b(n3, n4);
            }
        } else {
            n3 = this.c;
            n4 = this.d;
            iv1_02.a(n3, n4);
        }
        this.e = null;
        this.b = 0;
    }
}

