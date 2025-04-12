/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Gl0
 */
public final class gl0_0
implements sy0_1 {
    public static final gl0_0 a;

    static {
        gl0_0 gl0_02;
        a = gl0_02 = new Object();
    }

    public final long a(long l2, float f5, b30_0 b30_02, int n3) {
        n3 = -1687113661;
        float f6 = -1.9909288E-22f;
        b30_02.K(n3);
        Object object = mz_0.a;
        object = (lZ)b30_02.j((H30)object);
        float f7 = 0.0f;
        int n4 = Float.compare(f5, f7);
        if (n4 > 0 && (n3 = (int)(((lZ)object).i() ? 1 : 0)) == 0) {
            b30_02.K(1169013963);
            object = ty0_0.a;
            f6 = 1.0f;
            double d2 = Math.log(f5 + f6);
            f5 = (float)d2 * 4.5f + 2.0f;
            n3 = 1120403456;
            f6 = 100.0f;
            long l3 = OX.b(mz_0.b(l2, b30_02), f5 /= f6);
            l2 = zx_0.f(l3, l2);
            b30_02.E();
        } else {
            int n7 = 1169152471;
            f5 = 5627.23f;
            b30_02.K(n7);
            b30_02.E();
        }
        b30_02.E();
        return l2;
    }
}

