/*
 * Decompiled with CFR 0.152.
 */
public final class nw3$c
extends nw3$e {
    public final boolean c(Object object, long l2) {
        boolean bl2 = nw3.h;
        boolean bl3 = false;
        if (bl2) {
            byte by2 = nw3.g(object, l2);
            if (by2 != 0) {
                bl3 = true;
            }
            return bl3;
        }
        byte by4 = nw3.h(object, l2);
        if (by4 != 0) {
            bl3 = true;
        }
        return bl3;
    }

    public final byte d(Object object, long l2) {
        boolean bl2 = nw3.h;
        if (bl2) {
            return nw3.g(object, l2);
        }
        return nw3.h(object, l2);
    }

    public final double e(Object object, long l2) {
        return Double.longBitsToDouble(this.h(object, l2));
    }

    public final float f(Object object, long l2) {
        return Float.intBitsToFloat(this.g(object, l2));
    }

    public final void k(Object object, long l2, boolean bl2) {
        boolean bl3 = nw3.h;
        if (bl3) {
            byte by2 = (byte)(bl2 ? 1 : 0);
            nw3.n(object, l2, by2);
        } else {
            byte by4 = (byte)(bl2 ? 1 : 0);
            nw3.o(object, l2, by4);
        }
    }

    public final void l(Object object, long l2, byte by2) {
        boolean bl2 = nw3.h;
        if (bl2) {
            nw3.n(object, l2, by2);
        } else {
            nw3.o(object, l2, by2);
        }
    }

    public final void m(Object object, long l2, double d2) {
        long l3 = Double.doubleToLongBits(d2);
        this.p(object, l2, l3);
    }

    public final void n(Object object, long l2, float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.o(object, l2, n3);
    }
}

