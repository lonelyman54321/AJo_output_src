/*
 * Decompiled with CFR 0.152.
 */
public final class yO0$a
implements Kx$f {
    public final EO0 a;
    public final int b;
    public final AO0$a c;

    public yO0$a(EO0 object, int n3) {
        this.a = object;
        this.b = n3;
        this.c = object = new Object();
    }

    public final Kx$e a(il0_0 il0_02, long l2) {
        Object object = il0_02;
        long l3 = il0_02.d;
        long l4 = this.c(il0_02);
        long l7 = il0_02.h();
        EO0 eO0 = this.a;
        int n3 = eO0.c;
        n3 = Math.max(6, n3);
        Object object2 = null;
        il0_02.l(n3, false);
        long l8 = this.c(il0_02);
        long l12 = il0_02.h();
        Object object3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        if (object3 <= 0 && (object3 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) > 0) {
            object2 = object;
            object = new Kx$e(0, -9223372036854775807L, l7);
            return object;
        }
        object3 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
        if (object3 <= 0) {
            object = new Kx$e(-2, l8, l12);
            return object;
        }
        object = object2;
        object2 = new Kx$e(-1, l4, l3);
        return object2;
    }

    public final /* synthetic */ void b() {
    }

    public final long c(il0_0 il0_02) {
        long l2;
        int n3;
        int n4;
        EO0 eO0;
        AO0$a aO0$a;
        long l3;
        long l4;
        long l7;
        yO0$a yO0$a = this;
        il0_0 il0_03 = il0_02;
        while (true) {
            int n7;
            l7 = il0_02.h();
            l4 = il0_03.c;
            l3 = 6;
            long l8 = l4 - l3;
            aO0$a = yO0$a.c;
            eO0 = yO0$a.a;
            Object object = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            if (object >= 0) break;
            l7 = il0_02.h();
            n4 = 2;
            byte[] byArray = new byte[n4];
            il0_03.b(byArray, 0, n4, false);
            object = (byArray[0] & 0xFF) << 8;
            int n8 = 1;
            int n10 = byArray[n8] & 0xFF;
            object = object | n10;
            n10 = yO0$a.b;
            if (object != n10) {
                il0_03.f = 0;
                l8 = il0_03.d;
                n7 = (int)(l7 -= l8);
                il0_03.l(n7, false);
                n3 = 0;
            } else {
                int n14;
                int n15;
                int n16 = 16;
                Xm2 xm2 = new Xm2(n16);
                byte[] byArray2 = xm2.a;
                System.arraycopy(byArray, 0, byArray2, 0, n4);
                byArray2 = xm2.a;
                for (n15 = 0; n15 < (n14 = 14); n15 += n4) {
                    n14 = n4 + n15;
                    n4 = 14 - n15;
                    if ((n4 = il0_03.n(n14, byArray2, n4)) == (n14 = -1)) break;
                    n4 = 2;
                }
                xm2.H(n15);
                il0_03.f = 0;
                l3 = il0_03.d;
                n7 = (int)(l7 -= l3);
                il0_03.l(n7, false);
                n3 = (int)(AO0.a(xm2, eO0, n10, aO0$a) ? 1 : 0);
            }
            if (n3 != 0) break;
            il0_03.l(n8, false);
        }
        if ((n4 = (int)((l2 = (l7 = il0_02.h()) - (l3 = l4 - (long)6)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) >= 0) {
            l7 = il0_02.h();
            n3 = (int)(l4 - l7);
            il0_03.l(n3, false);
            return eO0.j;
        }
        return aO0$a.a;
    }
}

