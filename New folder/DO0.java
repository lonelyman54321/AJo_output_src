/*
 * Decompiled with CFR 0.152.
 */
public final class DO0
implements dx2_1 {
    public final EO0 a;
    public final long b;

    public DO0(EO0 eO0, long l2) {
        this.a = eO0;
        this.b = l2;
    }

    public final dX2$a d(long l2) {
        int n3;
        Object object = this.a;
        ct3.h(((EO0)object).k);
        Object object2 = ((EO0)object).k;
        long[] lArray = ((EO0$a)object2).a;
        long l3 = (long)((EO0)object).e * l2;
        long l4 = 1000000L;
        long l7 = l3 / l4;
        long l8 = ((EO0)object).j - 1L;
        long l12 = 0L;
        l3 = gz3.i(l7, l12, l8);
        boolean bl2 = false;
        int n4 = gz3.d(lArray, l3, false);
        l7 = 0L;
        int n7 = -1;
        l12 = n4 == n7 ? l7 : lArray[n4];
        object2 = ((EO0$a)object2).b;
        if (n4 != n7) {
            l7 = (long)object2[n4];
        }
        l12 *= l4;
        int n8 = ((EO0)object).e;
        l8 = n8;
        l12 /= l8;
        l8 = this.b;
        fx2_0 fx2_02 = new fx2_0(l12, l7 += l8);
        bl2 = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1);
        if (bl2 && n4 != (n3 = lArray.length + -1)) {
            l2 = lArray[++n4];
            Object object3 = object2[n4];
            l2 *= l4;
            long l14 = n8;
            object = new fx2_0(l2 /= l14, l8 += object3);
            dX2$a dX2$a = new dX2$a(fx2_02, (fx2_0)object);
            return dX2$a;
        }
        dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
        return dX2$a;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.a.b();
    }
}

