/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;

public final class o72 {
    public final p72 a;
    public final Xm2 b;
    public int c;
    public int d;
    public boolean e;

    public o72() {
        Object object = new p72();
        this.a = object;
        byte[] byArray = new byte[65025];
        this.b = object = new Xm2(byArray, 0);
        this.c = -1;
    }

    public final int a(int n3) {
        int n4;
        int n7;
        int n8 = 0;
        this.d = 0;
        do {
            int n10;
            n7 = this.d;
            n4 = n3 + n7;
            p72 p722 = this.a;
            int n14 = p722.c;
            if (n4 >= n14) break;
            int[] nArray = p722.f;
            this.d = n10 = n7 + 1;
            n7 += n3;
            n7 = nArray[n7];
            n8 += n7;
        } while (n7 == (n4 = 255));
        return n8;
    }

    public final boolean b(il0_0 il0_02) {
        int[] nArray;
        int n3;
        int n4 = 1;
        if (il0_02 != null) {
            n3 = 1;
        } else {
            n3 = 0;
            nArray = null;
        }
        ct3.f(n3 != 0);
        n3 = this.e;
        Xm2 xm2 = this.b;
        if (n3 != 0) {
            this.e = false;
            xm2.F(0);
        }
        while ((n3 = this.e) == 0) {
            int n7;
            n3 = this.c;
            p72 p722 = this.a;
            if (n3 < 0) {
                long l2 = -1;
                n3 = (int)(p722.b(il0_02, l2) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(p722.a(il0_02, n4 != 0) ? 1 : 0)) != 0) {
                    n3 = p722.d;
                    n7 = p722.a & n4;
                    if (n7 == n4 && (n7 = xm2.c) == 0) {
                        n7 = this.a(0);
                        n3 += n7;
                        n7 = this.d;
                    } else {
                        n7 = 0;
                    }
                    try {
                        il0_02.j(n3);
                        this.c = n7;
                    }
                    catch (EOFException eOFException) {}
                }
                return false;
            }
            n3 = this.c;
            n3 = this.a(n3);
            n7 = this.c;
            int n8 = this.d;
            n7 += n8;
            if (n3 > 0) {
                n8 = xm2.c + n3;
                xm2.b(n8);
                byte[] byArray = xm2.a;
                int n10 = xm2.c;
                try {
                    il0_02.e(byArray, n10, n3, false);
                    n8 = xm2.c + n3;
                    xm2.H(n8);
                    nArray = p722.f;
                    n8 = n7 + -1;
                }
                catch (EOFException eOFException) {
                    return false;
                }
                n3 = nArray[n8];
                n8 = 255;
                if (n3 != n8) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    nArray = null;
                }
                this.e = n3;
            }
            if (n7 == (n3 = p722.c)) {
                n7 = -1;
            }
            this.c = n7;
        }
        return n4 != 0;
    }
}

