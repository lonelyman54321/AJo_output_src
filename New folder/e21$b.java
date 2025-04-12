/*
 * Decompiled with CFR 0.152.
 */
public final class e21$b {
    public final wp3 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public e21$b(wp3 wp32) {
        this.a = wp32;
    }

    public final void a(int n3, byte[] byArray, int n4) {
        int n7 = this.c;
        if (n7 != 0) {
            n7 = n3 + 1;
            int n8 = this.f;
            if ((n7 -= n8) < n4) {
                n3 = (byArray[n7] & 0xC0) >> 6;
                byArray = null;
                n3 = n3 == 0 ? 1 : 0;
                this.d = n3;
                this.c = false;
            } else {
                this.f = n4 = n4 - n3 + n8;
            }
        }
    }

    public final void b(long l2, int n3, boolean n4) {
        long l3 = this.h;
        long l4 = -9223372036854775807L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        int n7 = object != false ? 1 : 0;
        ct3.f(n7 != 0);
        n7 = this.e;
        int n8 = 182;
        if (n7 == n8 && n4 != 0 && (n4 = (int)(this.b ? 1 : 0)) != 0) {
            l3 = this.g;
            l3 = l2 - l3;
            int n10 = (int)l3;
            int n14 = this.d;
            long l8 = this.h;
            wp3 wp32 = this.a;
            wp32.a(l8, n14, n10, n3, null);
        }
        if ((n3 = this.e) != (n4 = 179)) {
            this.g = l2;
        }
    }
}

