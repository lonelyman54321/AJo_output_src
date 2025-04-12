/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;

public final class PW0$b {
    public final wp3 a;
    public final pp3 b;
    public final Xm2 c;
    public Bp3 d;
    public Tm0 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final Xm2 j;
    public final Xm2 k;
    public boolean l;

    public PW0$b(wp3 wp32, Bp3 object, Tm0 tm0) {
        this.a = wp32;
        this.d = object;
        this.e = tm0;
        Object object2 = new pp3();
        this.b = object2;
        this.c = object2 = new Xm2();
        this.j = object2 = new Xm2(1);
        this.k = object2 = new Xm2();
        this.d = object;
        this.e = tm0;
        object = ((Bp3)object).a.g;
        wp32.d((d)object);
        this.e();
    }

    public final int a() {
        int n3;
        int n4 = this.l;
        if (n4 == 0) {
            int[] nArray = this.d.g;
            n3 = this.f;
            n4 = nArray[n3];
        } else {
            boolean[] blArray = this.b.j;
            n3 = this.f;
            n4 = blArray[n3];
            if (n4 != 0) {
                n4 = 1;
            } else {
                n4 = 0;
                blArray = null;
            }
        }
        op3 op32 = this.b();
        if (op32 != null) {
            n3 = 0x40000000;
            n4 |= n3;
        }
        return n4;
    }

    public final op3 b() {
        boolean bl2 = this.l;
        op3[] op3Array = null;
        if (!bl2) {
            return null;
        }
        Object object = this.b;
        Tm0 tm0 = object.a;
        int n3 = tm0.a;
        object = object.m;
        if (object == null) {
            object = this.d.a.l;
            if (object == null) {
                bl2 = false;
                object = null;
            } else {
                object = object[n3];
            }
        }
        if (object != null && (n3 = (int)(object.a ? 1 : 0)) != 0) {
            op3Array = object;
        }
        return op3Array;
    }

    public final boolean c() {
        int n3 = this.f;
        int n4 = 1;
        this.f = n3 += n4;
        n3 = this.l ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        this.g = n3 = this.g + n4;
        int[] nArray = this.b.g;
        int n7 = this.h;
        int n8 = nArray[n7];
        if (n3 == n8) {
            this.h = n7 += n4;
            this.g = 0;
            return false;
        }
        return n4 != 0;
    }

    public final int d(int n3, int n4) {
        Xm2 xm2;
        int n7;
        boolean[] blArray;
        Xm2 xm22;
        int n8 = 8;
        Object object = this.b();
        byte by2 = 0;
        if (object == null) {
            return 0;
        }
        Object object2 = this.b;
        int n10 = ((op3)object).d;
        if (n10 != 0) {
            object = ((pp3)object2).n;
        } else {
            n10 = gz3.a;
            object = ((op3)object).e;
            n10 = ((Object)object).length;
            xm22 = this.k;
            xm22.G(n10, (byte[])object);
            n10 = ((Object)object).length;
            object = xm22;
        }
        int n14 = this.f;
        int n15 = ((pp3)object2).k;
        int n16 = 1;
        if (n15 != 0 && (n14 = (blArray = ((pp3)object2).l)[n14]) != 0) {
            n14 = 1;
        } else {
            n14 = 0;
            xm22 = null;
        }
        if (n14 == 0 && n4 == 0) {
            n15 = 0;
            blArray = null;
        } else {
            n15 = 1;
        }
        Xm2 xm23 = this.j;
        Object object3 = xm23.a;
        if (n15 != 0) {
            n7 = 128;
        } else {
            n7 = 0;
            xm2 = null;
        }
        object3[0] = n7 = (int)((byte)(n7 | n10));
        xm23.I(0);
        object3 = this.a;
        object3.b(xm23, n16, n16);
        object3.b((Xm2)object, n10, n16);
        if (n15 == 0) {
            return n10 + n16;
        }
        int n17 = 6;
        n15 = 3;
        int n18 = 2;
        xm2 = this.c;
        if (n14 == 0) {
            xm2.F(n8);
            object2 = xm2.a;
            object2[0] = false;
            object2[n16] = n16;
            by2 = (byte)0;
            object2[n18] = by2;
            n4 = (byte)(n4 & 0xFF);
            object2[n15] = n4;
            n4 = (byte)(n3 >> 24 & 0xFF);
            object2[4] = n4;
            n4 = (byte)(n3 >> 16 & 0xFF);
            object2[5] = n4;
            n4 = (byte)(n3 >> 8 & 0xFF);
            object2[n17] = n4;
            n3 = (byte)(n3 & 0xFF);
            object2[7] = n3;
            object3.b(xm2, n8, n16);
            return n10 + 9;
        }
        Xm2 xm24 = ((pp3)object2).n;
        int n19 = xm24.C();
        n14 = -2;
        xm24.J(n14);
        n19 = n19 * 6 + n18;
        if (n4 != 0) {
            xm2.F(n19);
            object = xm2.a;
            xm24.g(0, (byte[])object, n19);
            n3 = (object[n18] & 0xFF) << n8;
            by2 = (byte)(object[n15] & 0xFF);
            n3 = (n3 | by2) + n4;
            n4 = (byte)(n3 >> 8 & 0xFF);
            object[n18] = n4;
            n3 = (byte)(n3 & 0xFF);
            object[n15] = n3;
        } else {
            xm2 = xm24;
        }
        object3.b(xm2, n19, n16);
        return n10 + n16 + n19;
    }

    public final void e() {
        pp3 pp32 = this.b;
        pp32.d = 0;
        pp32.p = 0L;
        pp32.q = false;
        pp32.k = false;
        pp32.o = false;
        pp32.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}

