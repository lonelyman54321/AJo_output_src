/*
 * Decompiled with CFR 0.152.
 */
public final class GE {
    public static final nk2_0 a;
    public static final float b;
    public static final float c;
    public static final nk2_0 d;

    static {
        nk2_0 nk2_02;
        nk2_0 nk2_03;
        float f5 = 16;
        float f6 = 8;
        a = nk2_03 = new nk2_0(f5, f6, f5, f6);
        b = 64;
        c = 36;
        d = nk2_02 = new nk2_0(f6, f6, f6, f6);
    }

    public static ol0 a(long l2, long l3, b30_0 b30_02, int n3, int n4) {
        long l4;
        long l7;
        lZ lZ2;
        Object object;
        n3 = n4 & 1;
        if (n3 != 0) {
            object = mz_0.a;
            object = (lZ)b30_02.j((H30)object);
            l2 = ((lZ)object).f();
        }
        long l8 = l2;
        long l12 = mz_0.b(l2, b30_02);
        int n7 = n4 & 4;
        if (n7 != 0) {
            object = mz_0.a;
            lZ2 = (lZ)b30_02.j((H30)object);
            l7 = lZ2.e();
            float f5 = 0.12f;
            l7 = OX.b(l7, f5);
            object = (lZ)b30_02.j((H30)object);
            l4 = ((lZ)object).h();
            l3 = zx_0.f(l7, l4);
        }
        long l14 = l3;
        object = mz_0.a;
        lZ2 = (lZ)b30_02.j((H30)object);
        l7 = lZ2.e();
        Object object2 = w60_0.a;
        object2 = (OX)b30_02.j((H30)object2);
        l4 = ((OX)object2).a;
        n7 = ((lZ)(object = (lZ)b30_02.j((H30)object))).i() ? 1 : 0;
        if (n7 != 0) {
            zx_0.h(l4);
        } else {
            zx_0.h(l4);
        }
        long l15 = OX.b(l7, 0.38f);
        object = new ol0(l8, l12, l14, l15);
        return object;
    }

    public static ol0 b(long l2, long l3, b30_0 b30_02, int n3) {
        Object object;
        int n4 = n3 & 1;
        if (n4 != 0) {
            object = mz_0.a;
            object = (lZ)b30_02.j((H30)object);
            l2 = ((lZ)object).h();
        }
        long l4 = l2;
        int n7 = n3 & 2;
        if (n7 != 0) {
            object = mz_0.a;
            object = (lZ)b30_02.j((H30)object);
            l3 = ((lZ)object).f();
        }
        long l7 = l3;
        object = mz_0.a;
        lZ lZ2 = (lZ)b30_02.j((H30)object);
        long l8 = lZ2.e();
        Object object2 = w60_0.a;
        object2 = (OX)b30_02.j((H30)object2);
        long l12 = ((OX)object2).a;
        n7 = ((lZ)(object = (lZ)b30_02.j((H30)object))).i() ? 1 : 0;
        if (n7 != 0) {
            zx_0.h(l12);
        } else {
            zx_0.h(l12);
        }
        long l14 = OX.b(l8, 0.38f);
        object = new ol0(l4, l7, l4, l14);
        return object;
    }
}

