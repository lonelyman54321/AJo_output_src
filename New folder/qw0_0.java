/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

/*
 * Renamed from QW0
 */
public final class qw0_0
extends pv0_2 {
    public static final ff_2 c = ff$a_0.b("0021F904");
    public final ce_2 b;

    public qw0_0(se_1 se_12) {
        super(se_12);
        super();
        this.b = se_12;
    }

    public final boolean a(long l2) {
        long l3;
        long l4;
        ce_2 ce_22 = this.b;
        long l7 = ce_22.b;
        boolean bl2 = true;
        Object object = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
        if (object >= 0) {
            return bl2;
        }
        long l8 = super.a0(ce_22, l2 -= l7);
        if ((l4 = (l3 = l8 - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            bl2 = false;
        }
        return bl2;
    }

    public final long a0(ce_2 ce_22, long l2) {
        long l3;
        Object object;
        qw0_0 qw0_02 = this;
        ce_2 ce_23 = ce_22;
        long l4 = l2;
        this.a(l2);
        ce_2 ce_24 = this.b;
        long l7 = ce_24.b;
        long l8 = 0L;
        long l12 = -1;
        double d2 = 0.0 / 0.0;
        long l14 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (l14 == false) {
            Object object2 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            if (object2 != false) {
                l8 = l12;
            }
            return l8;
        }
        l7 = l8;
        while (true) {
            byte[] byArray;
            int n3;
            long l15;
            long l16;
            byte[] byArray2;
            byte by2;
            ce_2 ce_25;
            long l17;
            long l18;
            ff_2 ff_22 = c;
            long l19 = l12;
            while ((l18 = (l17 = (l19 = (ce_25 = qw0_02.b).p(by2 = (byArray2 = ff_22.a)[0], l16 = l19 + (l8 = 1L), l15 = Long.MAX_VALUE)) - l12) == 0L ? 0 : (l17 < 0L ? -1 : 1)) != false && ((n3 = qw0_02.a(l12 = (long)(byArray = ff_22.a).length)) == 0 || (n3 = ce_24.l(l19, ff_22)) == 0)) {
                l8 = 0L;
                l12 = -1;
                d2 = 0.0 / 0.0;
            }
            if (l18 == false) break;
            l12 = 4;
            l19 += l12;
            l12 = ce_24.a0(ce_23, l19);
            long l20 = 0L;
            l12 = f.b(l12, l20);
            l7 += l12;
            l12 = 5;
            d2 = 2.5E-323;
            n3 = qw0_02.a(l12);
            if (n3 != 0) {
                l12 = 4;
                d2 = 2.0E-323;
                n3 = ce_24.n(l12);
                if (n3 == 0) {
                    int n4;
                    l12 = 2;
                    d2 = 9.9E-324;
                    n3 = ce_24.n(l12);
                    n3 = (n3 & 0xFF) << 8;
                    object = ce_24.n(l8) & 0xFF | n3;
                    if (object < (n4 = 2)) {
                        n3 = ce_24.n(0L);
                        ce_23.U(n3);
                        object = 10;
                        ce_23.U((int)object);
                        ce_23.U(0);
                        l8 = 3;
                        ce_24.skip(l8);
                    }
                }
            }
            l8 = 0L;
            l12 = -1;
            d2 = 0.0 / 0.0;
        }
        object = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
        if (object < 0) {
            long l21 = ce_24.a0(ce_23, l4 -= l7);
            l3 = 0L;
            l21 = f.b(l21, l3);
            l7 += l21;
        } else {
            l3 = 0L;
        }
        long l22 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
        if (l22 == false) {
            l12 = -1;
            d2 = 0.0 / 0.0;
        } else {
            l12 = l7;
        }
        return l12;
    }
}

