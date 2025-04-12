/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ec3
 */
public final class ec3_1
extends oq1_0 {
    public final fc3_0 a;
    public ya3_2 b;
    public dc3_0 c;

    public ec3_1() {
        fc3_0 fc3_02;
        fc3_02.k = false;
        this.a = fc3_02;
        this.c = fc3_02;
    }

    public final float a() {
        return this.c.a();
    }

    public final void b(float f5, float f6, float f7, float f8, float f11, float f12) {
        float f14;
        fc3_0 fc3_02 = this.a;
        this.c = fc3_02;
        fc3_02.l = f5;
        Object object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object > 0) {
            object = true;
            f14 = Float.MIN_VALUE;
        } else {
            object = false;
            f14 = 0.0f;
        }
        fc3_02.k = object;
        if (object != false) {
            f14 = -f7;
            float f15 = f5 - f6;
            fc3_02.d(f14, f15, f11, f12, f8);
        } else {
            float f16 = f6 - f5;
            f14 = f7;
            fc3_02.d(f7, f16, f11, f12, f8);
        }
    }

    public final float getInterpolation(float f5) {
        return this.c.getInterpolation(f5);
    }
}

