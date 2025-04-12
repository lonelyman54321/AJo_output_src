/*
 * Decompiled with CFR 0.152.
 */
public final class SS {
    public static wl0_0 a(long l2, long l3, b30_0 b30_02, int n3, int n4) {
        long l4;
        Object object;
        long l7;
        Object object2;
        b30_0 b30_03 = b30_02;
        int n7 = n4 & 1;
        if (n7 != 0) {
            object2 = mz_0.a;
            object2 = (lZ)b30_02.j((H30)object2);
            l7 = ((lZ)object2).g();
        } else {
            l7 = l2;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            object = mz_0.a;
            object = (lZ)b30_03.j((H30)object);
            long l8 = ((lZ)object).e();
            float f5 = 0.6f;
            l4 = l8 = OX.b(l8, f5);
        } else {
            l4 = l3;
        }
        object = mz_0.a;
        lZ lZ2 = (lZ)b30_03.j((H30)object);
        long l12 = lZ2.h();
        Object object3 = (lZ)b30_03.j((H30)object);
        long l14 = ((lZ)object3).e();
        nw0_1 nw0_12 = w60_0.a;
        OX oX = (OX)b30_03.j(nw0_12);
        long l15 = oX.a;
        lZ lZ3 = (lZ)b30_03.j((H30)object);
        int n10 = lZ3.i();
        if (n10 != 0) {
            zx_0.h(l15);
        } else {
            zx_0.h(l15);
        }
        float f6 = 0.38f;
        long l16 = OX.b(l14, f6);
        object3 = (OX)b30_03.j(nw0_12);
        l14 = ((OX)object3).a;
        object = (lZ)b30_03.j((H30)object);
        n8 = ((lZ)object).i() ? 1 : 0;
        if (n8 != 0) {
            zx_0.h(l14);
        } else {
            zx_0.h(l14);
        }
        long l17 = OX.b(l7, f6);
        n8 = n3 & 0xE ^ 6;
        int n14 = 1;
        int n15 = 4;
        if (n8 > n15 && (n8 = (int)(b30_03.d(l7) ? 1 : 0)) != 0 || (n8 = n3 & 6) == n15) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        n15 = n3 & 0x70 ^ 0x30;
        n10 = 32;
        if ((n15 <= n10 || (n15 = (int)(b30_03.d(l4) ? 1 : 0)) == 0) && (n15 = n3 & 0x30) != n10) {
            n14 = 0;
            object3 = null;
        }
        n8 |= n14;
        n14 = b30_03.d(l12) ? 1 : 0;
        n8 |= n14;
        n14 = b30_03.d(l16) ? 1 : 0;
        n8 |= n14;
        n14 = b30_03.d(l17) ? 1 : 0;
        object3 = b30_02.v();
        if ((n8 |= n14) != 0 || object3 == (object = b30$a.a)) {
            n8 = 0;
            l14 = OX.b(l12, 0.0f);
            long l18 = OX.b(l7, 0.0f);
            long l19 = OX.b(l16, 0.0f);
            long l20 = l16;
            l16 = l19;
            long l21 = l17;
            l17 = l7;
            long l22 = l4;
            l4 = l20;
            l19 = l21;
            object2 = object = new wl0_0(l12, l14, l7, l18, l20, l16, l21, l7, l22, l20, l21);
            b30_03.o(object);
            object3 = object;
        }
        return (wl0_0)object3;
    }
}

