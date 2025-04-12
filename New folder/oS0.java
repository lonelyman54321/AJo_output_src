/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

public final class oS0
implements YR0 {
    public final int a;
    public final int b;
    public final cx0_0 c;
    public final long d;
    public final long e;

    public oS0(int n3, int n4, cx0_0 cx0_02) {
        long l2;
        this.a = n3;
        this.b = n4;
        this.c = cx0_02;
        long l3 = n3;
        long l4 = 1000000L;
        this.d = l3 *= l4;
        this.e = l2 = (long)n4 * l4;
    }

    public final JA3 b(Vs3 object) {
        object = new OA3(this);
        return object;
    }

    public final float c(float f5, float f6, float f7) {
        long l2 = this.f(f5, f6, f7);
        return this.e(l2, f5, f6, f7);
    }

    public final float d(long l2, float f5, float f6, float f7) {
        float f8;
        float f11;
        long l3 = this.e;
        long l4 = l2 - l3;
        long l7 = 0L;
        long l8 = this.d;
        l2 = f.i(l4, l7, l8);
        int n3 = this.a;
        float f12 = 1.0f;
        if (n3 == 0) {
            f11 = 1.0f;
        } else {
            f11 = l2;
            long l12 = this.d;
            f8 = l12;
            f11 /= f8;
        }
        int n4 = 0;
        f8 = 0.0f;
        float f14 = f11 - 0.0f;
        n3 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
        if (n3 < 0) {
            f11 = 0.0f;
        }
        if ((n4 = f11 == f12 ? 0 : (f11 > f12 ? 1 : -1)) <= 0) {
            f12 = f11;
        }
        f11 = this.c.a(f12);
        f8 = (1.0f - f11) * f5;
        return f6 * f11 + f8;
    }

    public final float e(long l2, float f5, float f6, float f7) {
        long l3 = this.e;
        long l4 = l2 - l3;
        long l7 = 0L;
        long l8 = this.d;
        long l12 = (l4 = f.i(l4, l7, l8)) - (l3 = 0L);
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object < 0) {
            return 0.0f;
        }
        if (object == false) {
            return f7;
        }
        long l14 = l4 - 1000000L;
        float f8 = this.d(l14, f5, f6, f7);
        l14 = l4;
        return (this.d(l4, f5, f6, f7) - f8) * 1000.0f;
    }

    public final long f(float f5, float f6, float f7) {
        int n3 = this.b;
        int n4 = this.a;
        return (long)(n3 + n4) * 1000000L;
    }
}

