/*
 * Decompiled with CFR 0.152.
 */
public final class IE3 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public IE3(byte[] byArray) {
        int n3;
        this.a = byArray;
        this.b = n3 = byArray.length;
    }

    public final boolean a() {
        byte[] byArray = this.a;
        int n3 = this.c;
        int n4 = byArray[n3] & 0xFF;
        n3 = this.d;
        n4 >>= n3;
        n3 = 1;
        if ((n4 &= n3) == n3) {
            n4 = 1;
        } else {
            n4 = 0;
            byArray = null;
        }
        this.c(n3);
        return n4;
    }

    public final int b(int n3) {
        int n4 = this.c;
        int n7 = this.d;
        n7 = 8 - n7;
        int n8 = n4 + 1;
        byte[] byArray = this.a;
        n4 = byArray[n4];
        int n10 = 255;
        n4 &= n10;
        int n14 = this.d;
        n4 >>= n14;
        n14 = 8 - n7;
        n14 = n10 >> n14;
        n4 &= n14;
        for (n7 = Math.min(n3, n7); n7 < n3; n7 += 8) {
            n14 = n8 + 1;
            n8 = (byArray[n8] & n10) << n7;
            n4 |= n8;
            n8 = n14;
        }
        n7 = 32 - n3;
        n7 = -1 >>> n7;
        this.c(n3);
        return n4 &= n7;
    }

    public final void c(int n3) {
        int n4;
        int n7 = n3 / 8;
        this.c = n4 = this.c + n7;
        int n8 = this.d;
        this.d = n3 = n3 - (n7 *= 8) + n8;
        n7 = 7;
        n8 = 1;
        if (n3 > n7) {
            this.c = n4 += n8;
            this.d = n3 += -8;
        }
        if ((n3 = this.c) < 0 || n3 >= (n7 = this.b) && (n3 != n7 || (n3 = this.d) != 0)) {
            n8 = 0;
        }
        ct3.f(n8 != 0);
    }
}

