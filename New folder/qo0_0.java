/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qo0
 */
public final class qo0_0
implements gy_1 {
    public final /* synthetic */ to0_1 a;

    public qo0_0(to0_1 to0_12) {
        this.a = to0_12;
    }

    public final long a() {
        Object object = this.a;
        Object object2 = ((to0_1)object).s;
        long l2 = object2.a();
        long l3 = 16;
        double d2 = 7.9E-323;
        Object object3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object3 == false) {
            long l4;
            object2 = vp2_0.b;
            if ((object2 = (pp2_0)K30.a((J30)object, (H30)object2)) == null || (object3 = (l4 = (l2 = ((pp2_0)object2).a) - l3) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                double d5;
                double d7;
                double d9;
                object2 = w60_0.a;
                object2 = (OX)K30.a((J30)object, (H30)object2);
                l2 = ((OX)object2).a;
                vc3_1 vc3_12 = mz_0.a;
                object = (lZ)K30.a((J30)object, vc3_12);
                boolean n3 = ((lZ)object).i();
                float f5 = zx_0.h(l2);
                if (!n3 && (d9 = (d7 = (d2 = (double)f5) - (d5 = 0.5)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
                    long l7;
                    l2 = l7 = OX.f;
                }
            }
        }
        return l2;
    }
}

