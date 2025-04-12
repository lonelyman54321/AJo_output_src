/*
 * Decompiled with CFR 0.152.
 */
public final class Ul3 {
    public final Tl3 a;
    public zp1 b;
    public zp1 c;

    public Ul3(zp1 zp12, Tl3 tl3) {
        this.a = tl3;
        this.b = null;
        this.c = zp12;
    }

    public final long a(long l2) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        float f14;
        float f15;
        Object object = this.b;
        Object object2 = aG2.e;
        if (object != null) {
            boolean bl2 = object.e();
            if (bl2) {
                zp1 zp12 = this.c;
                if (zp12 != null) {
                    boolean bl3 = true;
                    f15 = Float.MIN_VALUE;
                    object = zp12.G((zp1)object, bl3);
                } else {
                    f14 = 0.0f;
                    f12 = 0.0f;
                    object = null;
                }
            } else {
                object = object2;
            }
            if (object != null) {
                object2 = object;
            }
        }
        if ((f14 = (f11 = (f12 = e72.d(l2)) - (f8 = ((aG2)object2).a)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) >= 0 && (f14 = (f7 = (f12 = e72.d(l2)) - (f8 = ((aG2)object2).c)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) <= 0) {
            f8 = e72.d(l2);
        }
        if ((f14 = (f6 = (f12 = e72.e(l2)) - (f15 = ((aG2)object2).b)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) >= 0 && (f14 = (f5 = (f12 = e72.e(l2)) - (f15 = ((aG2)object2).d)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) <= 0) {
            f15 = e72.e(l2);
        }
        return h72.a(f8, f15);
    }

    public final int b(long l2, boolean bl2) {
        if (bl2) {
            l2 = this.a(l2);
        }
        l2 = this.d(l2);
        return this.a.b.e(l2);
    }

    public final boolean c(long l2) {
        float f5;
        float f6;
        float f7;
        int n3;
        float f8;
        l2 = this.a(l2);
        l2 = this.d(l2);
        float f11 = e72.e(l2);
        Tl3 tl3 = this.a;
        RQ1 rQ1 = tl3.b;
        int n4 = rQ1.c(f11);
        float f12 = e72.d(l2);
        float f14 = f12 - (f8 = tl3.g(n4));
        Object object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (object >= 0 && (n3 = (f7 = (f6 = e72.d(l2)) - (f5 = tl3.h(n4))) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) <= 0) {
            n3 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f6 = 0.0f;
        }
        return n3 != 0;
    }

    public final long d(long l2) {
        zp1 zp12 = this.b;
        if (zp12 != null) {
            zp1 zp13;
            boolean bl2 = zp12.e();
            zp1 zp14 = null;
            if (!bl2) {
                zp12 = null;
            }
            if (zp12 != null && (zp13 = this.c) != null) {
                boolean bl3 = zp13.e();
                if (bl3) {
                    zp14 = zp13;
                }
                if (zp14 != null) {
                    l2 = zp12.F(zp14, l2);
                }
            }
        }
        return l2;
    }

    public final long e(long l2) {
        zp1 zp12 = this.b;
        if (zp12 != null) {
            zp1 zp13;
            boolean bl2 = zp12.e();
            zp1 zp14 = null;
            if (!bl2) {
                zp12 = null;
            }
            if (zp12 != null && (zp13 = this.c) != null) {
                boolean bl3 = zp13.e();
                if (bl3) {
                    zp14 = zp13;
                }
                if (zp14 != null) {
                    l2 = zp14.F(zp12, l2);
                }
            }
        }
        return l2;
    }
}

