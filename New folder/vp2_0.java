/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vP2
 */
public final class vp2_0 {
    public static final vc3_1 a;
    public static final nw0_1 b;
    public static final yP2 c;
    public static final yP2 d;
    public static final kP2 e;
    public static final kP2 f;
    public static final kP2 g;

    static {
        vP2$b vP2$b = vP2$b.c;
        Object object = new H30(vP2$b);
        a = object;
        b = L30.c(vP2$a.c);
        long l2 = OX.l;
        float f5 = 0.0f / 0.0f;
        c = object = new yP2(true, f5, l2);
        d = object = new yP2(false, f5, l2);
        float f6 = 0.24f;
        float f7 = 0.08f;
        e = object = new kP2(0.16f, f6, f7, f6);
        float f8 = 0.12f;
        f6 = 0.04f;
        f = object = new kP2(f7, f8, f6, f8);
        g = object = new kP2(f7, f8, f6, 0.1f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Lg1 a(boolean bl2, float f5, long l2, b30_0 object, int n3, int n4) {
        yP2 yP22;
        int n7 = 1;
        int n8 = n4 & 1;
        if (n8 != 0) {
            bl2 = true;
        }
        n8 = n4 & 2;
        int n10 = 2143289344;
        float f6 = 0.0f / 0.0f;
        if (n8 != 0) {
            f5 = 0.0f / 0.0f;
        }
        if ((n4 &= (n8 = 4)) != 0) {
            l2 = OX.l;
        }
        Object object2 = a;
        n4 = (int)(((Boolean)(object2 = (Boolean)object.j((H30)object2))).booleanValue() ? 1 : 0);
        if (n4 != 0) {
            b30$a$a b30$a$a;
            object.K(96412190);
            object2 = wP2.a;
            object2 = new OX(l2);
            tr1_0 tr1_02 = J83.j(object2, (b30_0)object);
            int n14 = n3 & 0xE ^ 6;
            n4 = 0;
            object2 = null;
            if (n14 > n8 && (n14 = (int)(object.a(bl2) ? 1 : 0)) != 0 || (n14 = n3 & 6) == n8) {
                n14 = 1;
            } else {
                n14 = 0;
                b30$a$a = null;
            }
            n8 = n3 & 0x70 ^ 0x30;
            n10 = 32;
            f6 = 4.5E-44f;
            if ((n8 <= n10 || (n8 = (int)(object.b(f5) ? 1 : 0)) == 0) && (n3 &= 0x30) != n10) {
                n7 = 0;
            }
            yP22 = object.v();
            if ((n14 |= n7) != 0 || yP22 == (b30$a$a = b30$a.a)) {
                yP22 = new jP2(bl2, f5, tr1_02);
                object.o(yP22);
            }
        } else {
            n3 = 96503175;
            object.K(n3);
            object.E();
            boolean bl3 = xs0_0.a(f5, f6);
            object = new yP2(bl2, f5, l2);
            if (!bl3) return object;
            long l3 = OX.l;
            bl3 = OX.c(l2, l3);
            if (!bl3) return object;
            if (!bl2) return d;
            yP2 yP23 = c;
            return yP23;
        }
        yP22 = (pt2_2)((Object)yP22);
        object.E();
        return yP22;
    }
}

