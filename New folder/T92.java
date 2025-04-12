/*
 * Decompiled with CFR 0.152.
 */
public final class T92 {
    public static final boolean[] a = new boolean[3];

    public static void a(Z50 z50, Eu1 eu1, Y50 y50) {
        int n3;
        int n4;
        y50.q = n4 = -1;
        y50.r = n4;
        Object object = z50.W;
        int n7 = 0;
        Y50$b y50$b = null;
        object = object[0];
        Object object2 = Y50$b.WRAP_CONTENT;
        int n8 = 2;
        if (object != object2 && (object = y50.W[0]) == (y50$b = Y50$b.MATCH_PARENT)) {
            k93_0 k93_02;
            object = y50.L;
            n7 = object.g;
            n3 = z50.v();
            v50_0 v50_02 = y50.N;
            int n10 = v50_02.g;
            n3 -= n10;
            object.i = k93_02 = eu1.k(object);
            v50_02.i = k93_02 = eu1.k(v50_02);
            object = object.i;
            eu1.d((k93_0)object, n7);
            object = v50_02.i;
            eu1.d((k93_0)object, n3);
            y50.q = n8;
            y50.c0 = n7;
            y50.Y = n3 -= n7;
            n4 = y50.f0;
            if (n3 < n4) {
                y50.Y = n4;
            }
        }
        object = z50.W;
        n7 = 1;
        if ((object = object[n7]) != object2 && (object = y50.W[n7]) == (y50$b = Y50$b.MATCH_PARENT)) {
            int n14;
            k93_0 k93_03;
            object = y50.M;
            n7 = object.g;
            int n15 = z50.p();
            object2 = y50.O;
            n3 = ((v50_0)object2).g;
            n15 -= n3;
            object.i = k93_03 = eu1.k(object);
            ((v50_0)object2).i = k93_03 = eu1.k(object2);
            object = object.i;
            eu1.d((k93_0)object, n7);
            object = ((v50_0)object2).i;
            eu1.d((k93_0)object, n15);
            n4 = y50.e0;
            if (n4 > 0 || (n4 = y50.k0) == (n14 = 8)) {
                object = y50.P;
                object2 = eu1.k(object);
                object.i = object2;
                object = object.i;
                n14 = y50.e0 + n7;
                eu1.d((k93_0)object, n14);
            }
            y50.r = n8;
            y50.d0 = n7;
            y50.Z = n15 -= n7;
            int n16 = y50.g0;
            if (n15 < n16) {
                y50.Z = n16;
            }
        }
    }

    public static final boolean b(int n3, int n4) {
        n3 = (n3 &= n4) == n4 ? 1 : 0;
        return n3 != 0;
    }
}

