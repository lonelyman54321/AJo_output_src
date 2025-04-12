/*
 * Decompiled with CFR 0.152.
 */
public final class JL {
    public static final void a(LP1 lP1, i13 i132, long l2, nz nz4, float f5, u10 u102, b30_0 b30_02, int n3, int n4) {
        float f6;
        nz nz5;
        long l3;
        Object object;
        b30_0 b30_03 = b30_02;
        int n7 = n4 & 1;
        LP1 lP12 = n7 != 0 ? LP1$a.b : lP1;
        int n8 = n4 & 2;
        if (n8 != 0) {
            object = B13.a;
            object = ((A13)b30_03.j((H30)object)).b;
        } else {
            object = i132;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            Object object2 = mz_0.a;
            object2 = (lZ)b30_03.j((H30)object2);
            l3 = ((lZ)object2).h();
        } else {
            l3 = l2;
        }
        long l4 = mz_0.b(l3, b30_03);
        int n14 = n4 & 0x10;
        if (n14 != 0) {
            n14 = 0;
            nz5 = null;
        } else {
            nz5 = nz4;
        }
        int n15 = n4 & 0x20;
        if (n15 != 0) {
            n15 = 1;
            f6 = n15;
        } else {
            f6 = f5;
        }
        int n16 = n3 & 0x3FFFFE;
        b30_03 = b30_02;
        jg3_0.a(lP12, (i13)object, l3, l4, nz5, f6, u102, b30_02, n16, 0);
    }
}

