/*
 * Decompiled with CFR 0.152.
 */
public final class s00
implements zP2 {
    public static final s00 a;

    static {
        s00 s002;
        a = s002 = new Object();
    }

    public final kP2 a(b30_0 b30_02) {
        double d2;
        double d5;
        double d7;
        double d9;
        int n3 = 112776173;
        float f5 = 6.9524504E-35f;
        b30_02.K(n3);
        Object object = w60_0.a;
        object = (OX)b30_02.j((H30)object);
        long l2 = ((OX)object).a;
        Object object2 = mz_0.a;
        object2 = (lZ)b30_02.j((H30)object2);
        boolean bl2 = ((lZ)object2).i();
        object = bl2 ? ((d9 = (d7 = (d5 = (double)(f5 = zx_0.h(l2))) - (d2 = 0.5)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) > 0 ? vp2_0.e : vp2_0.f) : vp2_0.g;
        b30_02.E();
        return object;
    }

    public final long b(b30_0 b30_02) {
        double d2;
        double d5;
        double d7;
        double d9;
        int n3 = -1599906584;
        b30_02.K(n3);
        Object object = w60_0.a;
        object = (OX)b30_02.j((H30)object);
        long l2 = ((OX)object).a;
        Object object2 = mz_0.a;
        object2 = (lZ)b30_02.j((H30)object2);
        boolean bl2 = ((lZ)object2).i();
        float f5 = zx_0.h(l2);
        if (!bl2 && (d9 = (d7 = (d5 = (double)f5) - (d2 = 0.5)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
            l2 = OX.f;
        }
        b30_02.E();
        return l2;
    }
}

