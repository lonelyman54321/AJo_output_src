/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class xm3 {
    public static final xm3 d;
    public final S93 a;
    public final ym2_0 b;
    public final ct2_0 c;

    static {
        xm3 xm32;
        d = xm32 = new xm3(0L, 0L, null, null, 0L, null, 0, 0L, 0xFFFFFF);
    }

    public xm3(long l2, long l3, tv0_0 tv0_02, av0_0 av0_02, long l4, Jj3 jj3, int n3, long l7, int n4) {
        S93 s93;
        long l8;
        long l12;
        int n7 = n4;
        int n8 = n4 & 1;
        long l14 = n8 != 0 ? (l12 = OX.l) : l2;
        n8 = n7 & 2;
        long l15 = n8 != 0 ? (l12 = Dm3.c) : l3;
        n8 = n7 & 4;
        tv0_0 tv0_03 = n8 != 0 ? null : tv0_02;
        n8 = n7 & 0x20;
        av0_0 av0_03 = n8 != 0 ? null : av0_02;
        n8 = n7 & 0x80;
        long l16 = n8 != 0 ? (l8 = Dm3.c) : l4;
        long l17 = OX.l;
        n8 = n7 & 0x1000;
        Jj3 jj32 = n8 != 0 ? null : jj3;
        n8 = 0x8000 & n7;
        n8 = n8 != 0 ? -1 << -1 : n3;
        int n10 = 131072;
        long l18 = (n7 &= n10) != 0 ? (l8 = Dm3.c) : l7;
        Object object = s93;
        s93 = new S93(l14, l15, tv0_03, null, null, (RU0)av0_03, null, l16, null, null, null, l17, jj32, null, null, null);
        int n14 = -1 << -1;
        n3 = -1 << -1;
        object = new ym2_0(n8, n14, l18, null, null, null, 0, n3, null);
        this(s93, (ym2_0)object, null);
    }

    public xm3(long l2, long l3, tv0_0 tv0_02, nV0 nV02, RU0 rU0, String string2, long l4, b13_0 b13_02, long l7, int n3) {
        S93 s93;
        long l8;
        int n4 = n3;
        int n7 = n3 & 1;
        long l12 = n7 != 0 ? (l8 = OX.l) : l2;
        n7 = n4 & 2;
        long l14 = n7 != 0 ? (l8 = Dm3.c) : l3;
        n7 = n4 & 4;
        tv0_0 tv0_03 = n7 != 0 ? null : tv0_02;
        n7 = n4 & 8;
        nV0 nV03 = n7 != 0 ? null : nV02;
        n7 = n4 & 0x20;
        RU0 rU02 = n7 != 0 ? null : rU0;
        n7 = n4 & 0x40;
        String string3 = n7 != 0 ? null : string2;
        n7 = n4 & 0x80;
        long l15 = n7 != 0 ? Dm3.c : l4;
        long l16 = OX.l;
        n7 = n4 & 0x2000;
        b13_0 b13_03 = n7 != 0 ? null : b13_02;
        n7 = 65536;
        long l17 = (n4 &= n7) != 0 ? Dm3.c : l7;
        Object object = s93;
        s93 = new S93(l12, l14, tv0_03, nV03, null, rU02, string3, l15, null, null, null, l16, null, b13_03, null, null);
        int n8 = -1 << -1;
        int n10 = -1 << -1;
        object = new ym2_0(n8, n8, l17, null, null, null, 0, n10, null);
        this(s93, (ym2_0)object, null);
    }

    public xm3(S93 s93, ym2_0 ym2_02) {
        Object object = s93.o;
        ot2_1 ot2_12 = ym2_02.e;
        if (object == null && ot2_12 == null) {
            object = null;
        } else {
            ct2_0 ct2_02 = new ct2_0((st2_1)object, ot2_12);
            object = ct2_02;
        }
        this(s93, ym2_02, (ct2_0)object);
    }

    public xm3(S93 s93, ym2_0 ym2_02, ct2_0 ct2_02) {
        this.a = s93;
        this.b = ym2_02;
        this.c = ct2_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static xm3 a(xm3 object, long l2, long l3, tv0_0 tv0_02, RU0 rU0, long l4, int n3, long l7, ct2_0 ct2_02, yu1_1 object2, int n4) {
        xm3 xm32;
        long l8;
        long l12;
        int n7;
        int n8;
        iw1 iw12;
        long l14;
        RU0 rU02;
        Object object3;
        long l15;
        Object object4;
        long l16;
        Object object5;
        Object object6 = object;
        int n10 = n4;
        int n14 = n4 & 1;
        if (n14 != 0) {
            object5 = ((xm3)object).a.a;
            l16 = object5.a();
        } else {
            l16 = l2;
        }
        int n15 = n10 & 2;
        if (n15 != 0) {
            long l17;
            object4 = ((xm3)object6).a;
            l15 = l17 = ((S93)object4).b;
        } else {
            l15 = l3;
        }
        n15 = n10 & 4;
        Object object7 = n15 != 0 ? (object4 = ((xm3)object6).a.c) : tv0_02;
        object4 = ((xm3)object6).a;
        nV0 nV02 = ((S93)object4).d;
        oV0 oV02 = ((S93)object4).e;
        int n16 = n10 & 0x20;
        if (n16 != 0) {
            object3 = ((S93)object4).f;
            rU02 = object3;
        } else {
            rU02 = rU0;
        }
        String string2 = ((S93)object4).g;
        n16 = n10 & 0x80;
        long l18 = n16 != 0 ? (l14 = ((S93)object4).h) : l4;
        object3 = ((S93)object4).i;
        Object object8 = ((S93)object4).j;
        Object object9 = ((S93)object4).k;
        Object object10 = string2;
        l2 = l18;
        long l19 = ((S93)object4).l;
        Object object11 = object3;
        Jj3 jj3 = ((S93)object4).m;
        b13_0 b13_02 = ((S93)object4).n;
        object3 = ((S93)object4).p;
        int n17 = n10 & 0x8000;
        if (n17 != 0) {
            iw12 = object9;
            object9 = ((xm3)object6).b;
            n7 = n8 = ((ym2_0)object9).a;
        } else {
            iw12 = object9;
            n7 = n3;
        }
        object9 = ((xm3)object6).b;
        Object object12 = object3;
        n16 = ((ym2_0)object9).b;
        int n18 = n10 & 0x20000;
        if (n18 != 0) {
            l12 = l19;
            l8 = l19 = ((ym2_0)object9).c;
        } else {
            l12 = l19;
            l8 = l7;
        }
        vl3_0 vl3_02 = ((ym2_0)object9).d;
        int n19 = 0x80000 & n10;
        object6 = n19 != 0 ? ((xm3)object6).c : ct2_02;
        n19 = 0x100000;
        Object object13 = (n10 &= n19) != 0 ? ((ym2_0)object9).f : object2;
        n19 = ((ym2_0)object9).g;
        object = object13;
        n10 = ((ym2_0)object9).h;
        object9 = ((ym2_0)object9).i;
        int n20 = n10;
        Object object14 = object9;
        object9 = ((S93)object4).a;
        Object object15 = object8;
        long l20 = object9.a();
        n8 = (int)(OX.c(l16, l20) ? 1 : 0);
        if (n8 != 0) {
            object8 = object5 = ((S93)object4).a;
        } else {
            l20 = 16;
            long l21 = l16 - l20;
            n15 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1));
            object4 = n15 != 0 ? new gz_1(l16) : sl3$a.a;
            object8 = object4;
        }
        n14 = 0;
        object5 = null;
        Object object16 = object6 != null ? ((ct2_0)object6).a : null;
        object4 = iw12;
        Object object17 = object14;
        object9 = object13;
        object14 = object15;
        int n21 = n19;
        string2 = object10;
        vl3_0 vl3_03 = vl3_02;
        l18 = l2;
        object10 = object11;
        object11 = object15;
        object15 = object16;
        object13 = new S93((sl3_0)object8, l15, (tv0_0)object7, nV02, oV02, rU02, string2, l2, (Rw)object10, (tl3_0)object14, iw12, l12, jj3, b13_02, (st2_1)object16, (Qt0)object12);
        if (object6 != null) {
            object5 = ((ct2_0)object6).b;
        }
        object2 = object17;
        object16 = new ym2_0(n7, n16, l8, vl3_03, (ot2_1)object5, (yu1_1)object, n21, n20, (im3_0)object17);
        object5 = xm32;
        return new xm3((S93)object13, (ym2_0)object16, (ct2_0)object6);
    }

    public static xm3 e(xm3 xm32, long l2, long l3, tv0_0 tv0_02, nV0 nV02, RU0 rU0, long l4, Jj3 jj3, int n3, long l7, int n4) {
        long l8;
        long l12;
        xm3 xm33 = xm32;
        int n7 = n4;
        int n8 = n4 & 1;
        long l14 = n8 != 0 ? (l12 = OX.l) : l2;
        n8 = n7 & 2;
        long l15 = n8 != 0 ? (l12 = Dm3.c) : l3;
        n8 = n7 & 4;
        Object object = null;
        tv0_0 tv0_03 = n8 != 0 ? null : tv0_02;
        n8 = n7 & 8;
        nV0 nV03 = n8 != 0 ? null : nV02;
        n8 = n7 & 0x20;
        RU0 rU02 = n8 != 0 ? null : rU0;
        n8 = n7 & 0x80;
        long l16 = n8 != 0 ? (l8 = Dm3.c) : l4;
        long l17 = OX.l;
        n8 = n7 & 0x1000;
        Jj3 jj32 = n8 != 0 ? null : jj3;
        n8 = 0x8000 & n7;
        n8 = n8 != 0 ? -1 << -1 : n3;
        int n10 = 131072;
        long l18 = (n7 &= n10) != 0 ? (l8 = Dm3.c) : l7;
        S93 s93 = U93.a(xm33.a, l14, null, 0.0f / 0.0f, l15, tv0_03, nV03, null, rU02, null, l16, null, null, null, l17, jj32, null, null, null);
        ym2_0 ym2_02 = xm33.b;
        int n14 = -1 << -1;
        int n15 = -1 << -1;
        nV02 = null;
        rU0 = null;
        n3 = 0;
        ym2_0 ym2_03 = zm2_1.a(ym2_02, n8, n14, l18, null, null, null, 0, n15, null);
        object = xm33.a;
        if (object != s93 || (object = xm33.b) != ym2_03) {
            xm33 = new xm3(s93, ym2_03);
        }
        return xm33;
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(xm3 object) {
        boolean bl2;
        Object object2;
        ym2_0 ym2_02;
        boolean bl3;
        if (!(this == object || (bl3 = Intrinsics.areEqual(ym2_02 = this.b, object2 = ((xm3)object).b)) && (bl2 = ((S93)(object2 = this.a)).a((S93)(object = ((xm3)object).a))))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final xm3 d(xm3 object) {
        xm3 xm32;
        boolean bl2;
        if (object != null && !(bl2 = Intrinsics.areEqual(object, xm32 = d))) {
            S93 s93 = this.a;
            Object object2 = ((xm3)object).a;
            s93 = s93.c((S93)object2);
            object2 = this.b;
            object = ((xm3)object).b;
            object = ((ym2_0)object2).a((ym2_0)object);
            xm32 = new xm3(s93, (ym2_0)object);
            return xm32;
        }
        return this;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof xm3;
        if (!bl3) {
            return false;
        }
        object = (xm3)object;
        Object object2 = this.a;
        Object object3 = ((xm3)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((xm3)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object = ((xm3)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        ym2_0 ym2_02 = this.b;
        int n4 = (ym2_02.hashCode() + n3) * 31;
        ct2_0 ct2_02 = this.c;
        if (ct2_02 != null) {
            n3 = ct2_02.hashCode();
        } else {
            n3 = 0;
            ct2_02 = null;
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextStyle(color=");
        Object object = OX.i(this.b());
        stringBuilder.append(object);
        stringBuilder.append(", brush=");
        object = this.a;
        Object object2 = ((S93)object).a.d();
        stringBuilder.append(object2);
        stringBuilder.append(", alpha=");
        float f5 = ((S93)object).a.getAlpha();
        stringBuilder.append(f5);
        stringBuilder.append(", fontSize=");
        object2 = Dm3.e(((S93)object).b);
        stringBuilder.append(object2);
        stringBuilder.append(", fontWeight=");
        object2 = ((S93)object).c;
        stringBuilder.append(object2);
        stringBuilder.append(", fontStyle=");
        object2 = ((S93)object).d;
        stringBuilder.append(object2);
        stringBuilder.append(", fontSynthesis=");
        object2 = ((S93)object).e;
        stringBuilder.append(object2);
        stringBuilder.append(", fontFamily=");
        object2 = ((S93)object).f;
        stringBuilder.append(object2);
        stringBuilder.append(", fontFeatureSettings=");
        object2 = ((S93)object).g;
        stringBuilder.append((String)object2);
        stringBuilder.append(", letterSpacing=");
        object2 = Dm3.e(((S93)object).h);
        stringBuilder.append(object2);
        stringBuilder.append(", baselineShift=");
        object2 = ((S93)object).i;
        stringBuilder.append(object2);
        stringBuilder.append(", textGeometricTransform=");
        object2 = ((S93)object).j;
        stringBuilder.append(object2);
        stringBuilder.append(", localeList=");
        object2 = ((S93)object).k;
        stringBuilder.append(object2);
        stringBuilder.append(", background=");
        object2 = OX.i(((S93)object).l);
        stringBuilder.append(object2);
        stringBuilder.append(", textDecoration=");
        object2 = ((S93)object).m;
        stringBuilder.append(object2);
        stringBuilder.append(", shadow=");
        object2 = ((S93)object).n;
        stringBuilder.append(object2);
        stringBuilder.append(", drawStyle=");
        object = ((S93)object).p;
        stringBuilder.append(object);
        stringBuilder.append(", textAlign=");
        object = this.b;
        object2 = Cj3.b(((ym2_0)object).a);
        stringBuilder.append(object2);
        stringBuilder.append(", textDirection=");
        object2 = Pj3.b(((ym2_0)object).b);
        stringBuilder.append(object2);
        stringBuilder.append(", lineHeight=");
        object2 = Dm3.e(((ym2_0)object).c);
        stringBuilder.append(object2);
        stringBuilder.append(", textIndent=");
        object2 = ((ym2_0)object).d;
        stringBuilder.append(object2);
        stringBuilder.append(", platformStyle=");
        object2 = this.c;
        stringBuilder.append(object2);
        stringBuilder.append(", lineHeightStyle=");
        object2 = ((ym2_0)object).f;
        stringBuilder.append(object2);
        stringBuilder.append(", lineBreak=");
        object2 = wu1_1.a(((ym2_0)object).g);
        stringBuilder.append(object2);
        stringBuilder.append(", hyphens=");
        object2 = gc1_1.b(((ym2_0)object).h);
        stringBuilder.append(object2);
        stringBuilder.append(", textMotion=");
        object = ((ym2_0)object).i;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

