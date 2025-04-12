/*
 * Decompiled with CFR 0.152.
 */
public final class SX2 {
    public static final MX2 a(p63 object, DA dA) {
        boolean bl2;
        le0_0 le0_02 = ((p63)object).b();
        Object object2 = le0_0.CROSSED;
        boolean bl3 = true;
        if (le0_02 == object2) {
            bl2 = true;
        } else {
            bl2 = false;
            le0_02 = null;
        }
        KX2 kX2 = ((p63)object).e;
        int n3 = ((p63)object).b;
        MX2$a mX2$a = SX2.c(kX2, bl2, bl3, n3, dA);
        int n4 = ((p63)object).c;
        object = SX2.c(kX2, bl2, false, n4, dA);
        object2 = new MX2(mX2$a, (MX2$a)object, bl2);
        return object2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final MX2$a b(p63 object, KX2 kX2, MX2$a object2) {
        qx2_0 qx2_02;
        int n3;
        int n4 = ((p63)object).a;
        int n7 = n4 != 0 ? kX2.c : kX2.d;
        int n8 = n4 != 0 ? ((p63)object).b : ((p63)object).c;
        if (n8 != (n3 = kX2.b)) {
            return kX2.a(n7);
        }
        et1_2 et1_22 = et1_2.NONE;
        RX2 rX2 = new RX2(kX2, n7);
        rq1_2 rq1_22 = yr1_2.a(et1_22, rX2);
        int n10 = kX2.c;
        int n14 = kX2.d;
        int n15 = n4 != 0 ? n14 : n10;
        qx2_0 qx2_03 = qx2_02;
        Object object3 = kX2;
        int n16 = n7;
        Object object4 = object;
        qx2_02 = new qx2_0(kX2, n7, n15, (p63)object, rq1_22);
        object = yr1_2.a(et1_22, qx2_02);
        long l2 = kX2.a;
        long l3 = ((MX2$a)object2).c;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            object2 = object = object.getValue();
            return (MX2$a)object;
        }
        n8 = kX2.e;
        if (n7 == n8) return object2;
        object3 = kX2.f;
        n16 = ((Tl3)object3).f(n8);
        Number number = (Number)rq1_22.getValue();
        n15 = number.intValue();
        if (n15 != n16) {
            object2 = object = object.getValue();
            return (MX2$a)object;
        }
        int n17 = ((MX2$a)object2).b;
        long l8 = ((Tl3)object3).l(n17);
        n15 = -1;
        if (n8 != n15) {
            void var22_26;
            if (n7 == n8) return kX2.a(n7);
            if (n10 < n14) {
                le0_0 le0_02 = le0_0.NOT_CROSSED;
            } else if (n10 > n14) {
                le0_0 le0_03 = le0_0.CROSSED;
            } else {
                le0_0 le0_04 = le0_0.COLLAPSED;
            }
            le0_0 le0_05 = le0_0.CROSSED;
            if (var22_26 == le0_05) {
                n15 = 1;
            } else {
                n15 = 0;
                Object var22_27 = null;
            }
            if ((n4 ^= n15) != 0) {
                if (n7 >= n8) return kX2.a(n7);
            } else if (n7 <= n8) return kX2.a(n7);
        }
        n4 = mm3.c;
        long l12 = l8 >> 32;
        n4 = (int)l12;
        if (n17 != n4) {
            l12 = 0xFFFFFFFFL;
            l3 = l8 & l12;
            n4 = (int)l3;
            if (n17 != n4) return kX2.a(n7);
        }
        object2 = object = object.getValue();
        return (MX2$a)object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final MX2$a c(KX2 kX2, boolean bl2, boolean bl3, int n3, DA dA) {
        long l2;
        void var4_9;
        void var3_8;
        void var2_6;
        int n4 = var2_6 != false ? kX2.c : kX2.d;
        int n7 = kX2.b;
        if (var3_8 != n7) {
            return kX2.a(n4);
        }
        long l3 = var4_9.a(kX2, n4);
        int n8 = bl2 ^ var2_6;
        if (n8 != 0) {
            int n14 = mm3.c;
            n14 = 32;
            l2 = l3 >> n14;
        } else {
            int n15 = mm3.c;
            l2 = 0xFFFFFFFFL & l3;
        }
        int n16 = (int)l2;
        return kX2.a(n16);
    }

    public static final MX2$a d(MX2$a mX2$a, KX2 object, int n3) {
        object = object.f.a(n3);
        long l2 = mX2$a.c;
        mX2$a = new MX2$a((uk2_0)((Object)object), n3, l2);
        return mX2$a;
    }
}

