/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class S93 {
    public final sl3_0 a;
    public final long b;
    public final tv0_0 c;
    public final nV0 d;
    public final oV0 e;
    public final RU0 f;
    public final String g;
    public final long h;
    public final Rw i;
    public final tl3_0 j;
    public final iw1 k;
    public final long l;
    public final Jj3 m;
    public final b13_0 n;
    public final st2_1 o;
    public final Qt0 p;

    public S93(long l2, long l3, tv0_0 tv0_02, nV0 nV02, oV0 oV02, RU0 rU0, String string2, long l4, Rw rw, tl3_0 tl3_02, iw1 iw12, long l7, Jj3 jj3, b13_0 b13_02, int n3) {
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
        n7 = n4 & 0x10;
        oV0 oV03 = n7 != 0 ? null : oV02;
        n7 = n4 & 0x20;
        RU0 rU02 = n7 != 0 ? null : rU0;
        n7 = n4 & 0x40;
        String string3 = n7 != 0 ? null : string2;
        n7 = n4 & 0x80;
        long l15 = n7 != 0 ? Dm3.c : l4;
        n7 = n4 & 0x100;
        Rw rw4 = n7 != 0 ? null : rw;
        n7 = n4 & 0x200;
        tl3_0 tl3_03 = n7 != 0 ? null : tl3_02;
        n7 = n4 & 0x400;
        iw1 iw13 = n7 != 0 ? null : iw12;
        n7 = n4 & 0x800;
        long l16 = n7 != 0 ? OX.l : l7;
        n7 = n4 & 0x1000;
        Jj3 jj32 = n7 != 0 ? null : jj3;
        b13_0 b13_03 = (n4 &= 0x2000) != 0 ? null : b13_02;
        this(l12, l14, tv0_03, nV03, oV03, rU02, string3, l15, rw4, tl3_03, iw13, l16, jj32, b13_03, null, null);
    }

    public S93(long l2, long l3, tv0_0 tv0_02, nV0 nV02, oV0 oV02, RU0 rU0, String string2, long l4, Rw rw, tl3_0 tl3_02, iw1 iw12, long l7, Jj3 jj3, b13_0 b13_02, st2_1 st2_12, Qt0 qt0) {
        long l8 = 16;
        long l12 = l2 - l8;
        long l14 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        sl3_0 sl3_02 = l14 != false ? new gz_1(l2) : sl3$a.a;
        this(sl3_02, l3, tv0_02, nV02, oV02, rU0, string2, l4, rw, tl3_02, iw12, l7, jj3, b13_02, st2_12, qt0);
    }

    public S93(sl3_0 sl3_02, long l2, tv0_0 tv0_02, nV0 nV02, oV0 oV02, RU0 rU0, String string2, long l3, Rw rw, tl3_0 tl3_02, iw1 iw12, long l4, Jj3 jj3, b13_0 b13_02, st2_1 st2_12, Qt0 qt0) {
        this.a = sl3_02;
        this.b = l2;
        this.c = tv0_02;
        this.d = nV02;
        this.e = oV02;
        this.f = rU0;
        this.g = string2;
        this.h = l3;
        this.i = rw;
        this.j = tl3_02;
        this.k = iw12;
        this.l = l4;
        this.m = jj3;
        this.n = b13_02;
        this.o = st2_12;
        this.p = qt0;
    }

    public final boolean a(S93 object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        long l2 = this.b;
        long l3 = ((S93)object).b;
        boolean bl3 = Dm3.a(l2, l3);
        if (!bl3) {
            return false;
        }
        Object object2 = this.c;
        Object object3 = ((S93)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((S93)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((S93)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object3 = ((S93)object).f;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.g;
        object3 = ((S93)object).g;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        l2 = this.h;
        long l4 = ((S93)object).h;
        bl3 = Dm3.a(l2, l4);
        if (!bl3) {
            return false;
        }
        object2 = this.i;
        object3 = ((S93)object).i;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.j;
        object3 = ((S93)object).j;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.k;
        object3 = ((S93)object).k;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        l2 = this.l;
        l4 = ((S93)object).l;
        bl3 = OX.c(l2, l4);
        if (!bl3) {
            return false;
        }
        object2 = this.o;
        object = ((S93)object).o;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final boolean b(S93 object) {
        Object object2 = ((S93)object).a;
        boolean bl2 = Intrinsics.areEqual(this.a, object2);
        if (!bl2) {
            return false;
        }
        object2 = this.m;
        Object object3 = ((S93)object).m;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            return false;
        }
        object2 = this.n;
        object3 = ((S93)object).n;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) {
            return false;
        }
        object2 = this.p;
        object = ((S93)object).p;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        return bl3;
    }

    public final S93 c(S93 s93) {
        Object object = s93;
        if (s93 == null) {
            return this;
        }
        Object object2 = s93.a;
        long l2 = object2.a();
        ZD zD = object2.d();
        float f5 = object2.getAlpha();
        Jj3 jj3 = s93.m;
        b13_0 b13_02 = s93.n;
        long l3 = s93.b;
        tv0_0 tv0_02 = s93.c;
        nV0 nV02 = s93.d;
        oV0 oV02 = s93.e;
        RU0 rU0 = s93.f;
        String string2 = s93.g;
        long l4 = s93.h;
        Rw rw = s93.i;
        tl3_0 tl3_02 = s93.j;
        iw1 iw12 = s93.k;
        long l7 = s93.l;
        st2_1 st2_12 = s93.o;
        object = s93.p;
        object2 = this;
        return U93.a(this, l2, zD, f5, l3, tv0_02, nV02, oV02, rU0, string2, l4, rw, tl3_02, iw12, l7, jj3, b13_02, st2_12, (Qt0)object);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof S93;
        if (!bl4) {
            return false;
        }
        bl4 = this.a((S93)(object = (S93)object));
        if (!bl4 || !(bl2 = this.b((S93)object))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        float f5;
        Object object = this.a;
        long l2 = object.a();
        int n3 = OX.m;
        int n4 = mt3_0.a(l2);
        int n7 = 31;
        n4 *= 31;
        ZD zD = object.d();
        int n8 = 0;
        if (zD != null) {
            n3 = zD.hashCode();
        } else {
            n3 = 0;
            zD = null;
        }
        n4 = (n4 + n3) * 31;
        float f6 = object.getAlpha();
        int n10 = (Float.floatToIntBits(f6) + n4) * 31;
        long l3 = this.b;
        n4 = (Dm3.d(l3) + n10) * 31;
        object = this.c;
        if (object != null) {
            n10 = ((tv0_0)object).a;
        } else {
            n10 = 0;
            f6 = 0.0f;
            object = null;
        }
        n4 = (n4 + n10) * 31;
        object = this.d;
        if (object != null) {
            n10 = ((nV0)object).a;
        } else {
            n10 = 0;
            f6 = 0.0f;
            object = null;
        }
        n4 = (n4 + n10) * 31;
        object = this.e;
        if (object != null) {
            n10 = ((oV0)object).a;
        } else {
            n10 = 0;
            f6 = 0.0f;
            object = null;
        }
        n4 = (n4 + n10) * 31;
        object = this.f;
        if (object != null) {
            n10 = object.hashCode();
        } else {
            n10 = 0;
            f6 = 0.0f;
            object = null;
        }
        n4 = (n4 + n10) * 31;
        object = this.g;
        if (object != null) {
            n10 = ((String)object).hashCode();
        } else {
            n10 = 0;
            f6 = 0.0f;
            object = null;
        }
        n4 = (n4 + n10) * 31;
        l3 = this.h;
        n10 = (Dm3.d(l3) + n4) * 31;
        Object object2 = this.i;
        if (object2 != null) {
            f5 = ((Rw)object2).a;
            n4 = Float.floatToIntBits(f5);
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        n10 = (n10 + n4) * 31;
        object2 = this.j;
        if (object2 != null) {
            n4 = ((tl3_0)object2).hashCode();
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        n10 = (n10 + n4) * 31;
        object2 = this.k;
        if (object2 != null) {
            object2 = ((iw1)object2).a;
            n4 = object2.hashCode();
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        n10 = (n10 + n4) * 31;
        l3 = this.l;
        n10 = D70.a(n10, n7, l3);
        object2 = this.m;
        if (object2 != null) {
            n4 = ((Jj3)object2).a;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        n10 = (n10 + n4) * 31;
        object2 = this.n;
        if (object2 != null) {
            n4 = ((b13_0)object2).hashCode();
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        n10 = (n10 + n4) * 31;
        object2 = this.o;
        if (object2 != null) {
            n4 = object2.hashCode();
        } else {
            n4 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        n10 = (n10 + n4) * 31;
        object2 = this.p;
        if (object2 != null) {
            n8 = object2.hashCode();
        }
        return n10 + n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SpanStyle(color=");
        Object object = this.a;
        Object object2 = OX.i(object.a());
        stringBuilder.append(object2);
        stringBuilder.append(", brush=");
        object2 = object.d();
        stringBuilder.append(object2);
        stringBuilder.append(", alpha=");
        float f5 = object.getAlpha();
        stringBuilder.append(f5);
        stringBuilder.append(", fontSize=");
        object = Dm3.e(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", fontWeight=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", fontStyle=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", fontSynthesis=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", fontFamily=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", fontFeatureSettings=");
        object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append(", letterSpacing=");
        object = Dm3.e(this.h);
        stringBuilder.append(object);
        stringBuilder.append(", baselineShift=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", textGeometricTransform=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", localeList=");
        object = this.k;
        stringBuilder.append(object);
        stringBuilder.append(", background=");
        object = OX.i(this.l);
        stringBuilder.append(object);
        stringBuilder.append(", textDecoration=");
        object = this.m;
        stringBuilder.append(object);
        stringBuilder.append(", shadow=");
        object = this.n;
        stringBuilder.append(object);
        stringBuilder.append(", platformStyle=");
        object = this.o;
        stringBuilder.append(object);
        stringBuilder.append(", drawStyle=");
        object = this.p;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

