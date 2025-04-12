/*
 * Decompiled with CFR 0.152.
 */
public final class zs3 {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public zs3() {
        byte[] byArray = new byte[10];
        this.a = byArray;
    }

    public final void a(wp3 wp32, wp3$a wp3$a) {
        int n3 = this.c;
        if (n3 > 0) {
            long l2 = this.d;
            int n4 = this.e;
            int n7 = this.f;
            int n8 = this.g;
            wp32.a(l2, n4, n7, n8, wp3$a);
            wp32 = null;
            this.c = 0;
        }
    }

    public final void b(wp3 wp32, long l2, int n3, int n4, int n7, wp3$a wp3$a) {
        int n8;
        int n10 = this.g;
        int n14 = n4 + n7;
        n10 = n10 <= n14 ? 1 : 0;
        String string2 = "TrueHD chunk samples must be contiguous in the sample queue.";
        ct3.g(n10 != 0, string2);
        n10 = this.b;
        if (n10 == 0) {
            return;
        }
        n10 = this.c;
        this.c = n14 = n10 + 1;
        if (n10 == 0) {
            this.d = l2;
            this.e = n3;
            this.f = 0;
        }
        this.f = n8 = this.f + n4;
        this.g = n7;
        n8 = 16;
        if (n14 >= n8) {
            this.a(wp32, wp3$a);
        }
    }

    public final void c(fi0_0 fi0_02) {
        int n3;
        int n4;
        int n7 = this.b;
        if (n7 != 0) {
            return;
        }
        byte[] byArray = this.a;
        int n8 = 0;
        fi0_02.f(0, byArray, 10);
        fi0_02.d();
        int n10 = 4;
        n7 = byArray[n10];
        int n14 = -8;
        if (n7 == n14 && (n7 = byArray[5]) == (n14 = 114) && (n7 = byArray[6]) == (n14 = 111) && (n4 = (n14 = byArray[n7 = 7]) & 0xFE) == (n3 = 186)) {
            n8 = n14 & 0xFF;
            n8 = n8 == (n14 = 187) ? 9 : 8;
            byte by2 = byArray[n8];
            n10 = by2 >> 4 & n7;
            n7 = 40;
            n8 = n7 << n10;
        }
        if (n8 == 0) {
            return;
        }
        this.b = true;
    }
}

