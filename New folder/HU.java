/*
 * Decompiled with CFR 0.152.
 */
public final class HU {
    public final wp3 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long[] l;
    public int[] m;

    public HU(int n3, int n4, long l2, int n7, wp3 wp32) {
        int n8 = 2;
        int n10 = 1;
        if (n4 != n10 && n4 != n8) {
            n10 = 0;
        }
        ct3.a(n10 != 0);
        this.d = l2;
        this.e = n7;
        this.a = wp32;
        int n14 = n4 == n8 ? 1667497984 : 1651965952;
        int n15 = n3 / 10;
        n3 = n3 % 10 + 48 << 8;
        this.b = n14 |= (n3 |= (n15 += 48));
        if (n4 == n8) {
            n4 = 1650720768;
            n3 |= n4;
        } else {
            n3 = -1;
        }
        this.c = n3;
        this.k = -1;
        n3 = 512;
        long[] lArray = new long[n3];
        this.l = lArray;
        int[] nArray = new int[n3];
        this.m = nArray;
    }

    public final fx2_0 a(int n3) {
        long l2 = this.m[n3];
        long l3 = this.d;
        long l4 = 1;
        l3 *= l4;
        l4 = this.e;
        l3 = l3 / l4 * l2;
        l4 = this.l[n3];
        fx2_0 fx2_02 = new fx2_0(l3, l4);
        return fx2_02;
    }

    public final dX2$a b(long l2) {
        int n3 = this.j;
        if (n3 == 0) {
            long l3 = this.k;
            fx2_0 fx2_02 = new fx2_0(0L, l3);
            dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
            return dX2$a;
        }
        long l4 = this.d;
        int n4 = 1;
        long l7 = n4;
        l4 *= l7;
        Object object = this.m;
        Object object2 = this.m;
        int n7 = this.e;
        l7 = n7;
        int n8 = (int)(l2 /= (l4 /= l7));
        int n10 = gz3.c(object2, n8, n4 != 0, n4 != 0);
        n3 = object[n10];
        if (n3 == n8) {
            object2 = this.a(n10);
            dX2$a dX2$a = new dX2$a((fx2_0)object2, (fx2_0)object2);
            return dX2$a;
        }
        fx2_0 fx2_03 = this.a(n10);
        object = this.l;
        n3 = ((int[])object).length;
        if ((n10 += n4) < n3) {
            object = new dX2$a;
            object2 = this.a(n10);
            object(fx2_03, (fx2_0)object2);
            return object;
        }
        object2 = new dX2$a;
        object2(fx2_03, fx2_03);
        return object2;
    }
}

