/*
 * Decompiled with CFR 0.152.
 */
public final class s31 {
    public static final long a(Vt1 vt1, aG2 aG22, aG2 aG23, int n3) {
        long l2;
        long l3 = s31.d(vt1, aG22, n3);
        int n4 = mm3.b(l3);
        if (n4 != 0) {
            l2 = mm3.b;
        } else {
            l2 = s31.d(vt1, aG23, n3);
            int n7 = mm3.b(l2);
            if (n7 != 0) {
                l2 = mm3.b;
            } else {
                long l4 = l3 >> 32;
                n3 = (int)l4;
                n7 = Math.min(n3, n3);
                l3 = 0xFFFFFFFFL;
                n4 = (int)(l2 & l3);
                int n8 = Math.max(n4, n4);
                l2 = nm3.a(n7, n8);
            }
        }
        return l2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b(Tl3 object, int n3) {
        uk2_0 uk2_02;
        void var1_3;
        int n4 = ((Tl3)object).f((int)var1_3);
        int n7 = ((Tl3)object).i(n4);
        boolean bl2 = false;
        boolean bl3 = true;
        if (var1_3 != n7 && var1_3 != (n4 = ((Tl3)object).e(n4, false))) {
            uk2_0 uk2_03;
            uk2_0 uk2_04 = ((Tl3)object).a((int)var1_3);
            if (uk2_04 == (uk2_03 = ((Tl3)object).a((int)(var1_3 -= bl3)))) return bl2;
            return true;
        }
        uk2_0 uk2_05 = ((Tl3)object).j((int)var1_3);
        if (uk2_05 == (uk2_02 = ((Tl3)object).a((int)var1_3))) return bl2;
        return true;
    }

    public static final int c(RQ1 rQ1, long l2, NC3 nC3) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        float f14;
        if (nC3 != null) {
            f14 = nC3.g();
        } else {
            f14 = 0.0f;
            nC3 = null;
        }
        float f15 = e72.e(l2);
        int n3 = rQ1.c(f15);
        float f16 = e72.e(l2);
        float f17 = rQ1.d(n3) - f14;
        int n4 = -1;
        float f18 = f16 == f17 ? 0 : (f16 < f17 ? -1 : 1);
        if (f18 >= 0 && (f18 = (f12 = (f16 = e72.e(l2)) - (f17 = rQ1.b(n3) + f14)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) <= 0 && (f18 = (f11 = (f16 = e72.d(l2)) - (f17 = -f14)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) >= 0 && (f8 = (f7 = (f6 = e72.d(l2)) - (f5 = rQ1.d + f14)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) <= 0) {
            return n3;
        }
        return n4;
    }

    public static final long d(Vt1 object, aG2 aG22, int n3) {
        long l2;
        Object object2 = ((Vt1)object).d();
        object2 = object2 != null && (object2 = ((Ul3)object2).a) != null ? ((Tl3)object2).b : null;
        object = ((Vt1)object).c();
        pn_2 pn_22 = ul3$a.b;
        if (object2 != null && object != null) {
            long l3 = object.n(0L);
            object = aG22.i(l3);
            l2 = ((RQ1)object2).f((aG2)object, n3, pn_22);
        } else {
            l2 = mm3.b;
        }
        return l2;
    }

    public static final boolean e(int n3) {
        int n4;
        n3 = (n3 = Character.getType(n3)) != (n4 = 23) && n3 != (n4 = 20) && n3 != (n4 = 22) && n3 != (n4 = 30) && n3 != (n4 = 29) && n3 != (n4 = 24) && n3 != (n4 = 21) ? 0 : 1;
        return n3 != 0;
    }

    public static final boolean f(int n3) {
        int n4 = Character.isWhitespace(n3);
        n3 = n4 == 0 && n3 != (n4 = 160) ? 0 : 1;
        return n3 != 0;
    }

    public static final boolean g(int n3) {
        int n4;
        int n7 = s31.f(n3);
        n3 = n7 != 0 && (n7 = Character.getType(n3)) != (n4 = 14) && n7 != (n4 = 13) && n3 != (n7 = 10) ? 1 : 0;
        return n3 != 0;
    }
}

