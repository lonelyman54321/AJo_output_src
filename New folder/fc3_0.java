/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Fc3
 */
public final class fc3_0
implements dc3_0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public float l;
    public float m;
    public float n;

    public final float a() {
        float f5;
        boolean bl2 = this.k;
        if (bl2) {
            f5 = this.n;
            f5 = -this.c(f5);
        } else {
            f5 = this.n;
            f5 = this.c(f5);
        }
        return f5;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        void var3_7;
        float f5;
        float f6 = this.a();
        float f7 = f6 - (f5 = 1.0E-5f);
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            f6 = this.i;
            float f8 = this.m;
            float f11 = (f6 = Math.abs(f6 - f8)) - f5;
            Object object2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                return (boolean)var3_7;
            }
        }
        boolean bl2 = false;
        return (boolean)var3_7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float c(float f5) {
        float f6;
        float f7;
        float f8 = this.d;
        float f11 = f5 - f8;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object <= 0) {
            f7 = this.a;
            f6 = this.b;
            return (f6 - f7) * f5 / f8 + f7;
        }
        int n3 = this.j;
        int n4 = 1;
        f6 = Float.MIN_VALUE;
        if (n3 == n4) {
            return 0.0f;
        }
        float f12 = (f5 -= f8) - (f8 = this.e);
        Object object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            f7 = this.b;
            f6 = this.c;
            return (f6 - f7) * f5 / f8 + f7;
        }
        int n7 = 2;
        f6 = 2.8E-45f;
        if (n3 == n7) {
            return 0.0f;
        }
        float f14 = (f5 -= f8) - (f8 = this.f);
        Object object3 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object3 >= 0) return 0.0f;
        float f15 = this.c;
        f5 = f5 * f15 / f8;
        return f15 - f5;
    }

    public final void d(float f5, float f6, float f7, float f8, float f11) {
        this.i = f6;
        float f12 = f5 - 0.0f;
        Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object == false) {
            f5 = 1.0E-4f;
        }
        float f14 = f5 / f7;
        float f15 = f14 * f5;
        float f16 = 2.0f;
        f15 /= f16;
        int n3 = 3;
        int n4 = 2;
        float f17 = f5 - 0.0f;
        Object object2 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            f11 = -f5 / f7 * f5 / f16;
            double d2 = Math.sqrt((f6 - f11) * f7);
            float f18 = (f11 = (float)d2) - f8;
            object = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
            if (object < 0) {
                this.j = n4;
                this.a = f5;
                this.b = f11;
                this.c = 0.0f;
                this.d = f8 = (f11 - f5) / f7;
                this.e = f7 = f11 / f7;
                this.g = f5 = (f5 + f11) * f8 / f16;
                this.h = f6;
                this.i = f6;
                return;
            }
            this.j = n3;
            this.a = f5;
            this.b = f8;
            this.c = f8;
            this.d = f11 = (f8 - f5) / f7;
            this.f = f7 = f8 / f7;
            f5 = (f5 + f8) * f11 / f16;
            f7 = f7 * f8 / f16;
            this.e = f11 = (f6 - f5 - f7) / f8;
            this.g = f5;
            this.h = f5 = f6 - f7;
            this.i = f6;
            return;
        }
        object2 = f15 == f6 ? 0 : (f15 > f6 ? 1 : -1);
        if (object2 >= 0) {
            f16 = f16 * f6 / f5;
            this.j = 1;
            this.a = f5;
            this.b = 0.0f;
            this.g = f6;
            this.d = f16;
            return;
        }
        float f19 = (f15 = f6 - f15) / f5;
        float f20 = f19 + f14;
        float f22 = f20 - f11;
        Object object3 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
        if (object3 < 0) {
            this.j = n4;
            this.a = f5;
            this.b = f5;
            this.c = 0.0f;
            this.g = f15;
            this.h = f6;
            this.d = f19;
            this.e = f14;
            return;
        }
        f11 = f7 * f6;
        double d5 = Math.sqrt(f5 * f5 / f16 + f11);
        f11 = (float)d5;
        this.d = f14 = (f11 - f5) / f7;
        this.e = f15 = f11 / f7;
        object2 = f11 == f8 ? 0 : (f11 < f8 ? -1 : 1);
        if (object2 < 0) {
            this.j = n4;
            this.a = f5;
            this.b = f11;
            this.c = 0.0f;
            this.d = f14;
            this.e = f15;
            this.g = f5 = (f5 + f11) * f14 / f16;
            this.h = f6;
            return;
        }
        this.j = n3;
        this.a = f5;
        this.b = f8;
        this.c = f8;
        this.d = f11 = (f8 - f5) / f7;
        this.f = f7 = f8 / f7;
        f5 = (f5 + f8) * f11 / f16;
        f7 = f7 * f8 / f16;
        this.e = f11 = (f6 - f5 - f7) / f8;
        this.g = f5;
        this.h = f5 = f6 - f7;
        this.i = f6;
    }

    public final float getInterpolation(float f5) {
        float f6;
        float f7 = this.d;
        float f8 = 2.0f;
        Object object = f5 == f7 ? 0 : (f5 < f7 ? -1 : 1);
        if (object <= 0) {
            float f11 = this.a;
            float f12 = f11 * f5;
            f6 = (this.b - f11) * f5 * f5;
            f6 = f6 / (f7 *= f8) + f12;
        } else {
            object = this.j;
            Object object2 = 1;
            float f14 = Float.MIN_VALUE;
            if (object == object2) {
                f6 = this.g;
            } else {
                f14 = this.e;
                float f15 = (f7 = f5 - f7) - f14;
                Object object3 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                if (object3 < 0) {
                    float f16 = this.g;
                    f6 = this.b;
                    float f17 = f6 * f7 + f16;
                    f16 = (this.c - f6) * f7 * f7;
                    f6 = (f16 /= (f14 *= f8)) + f17;
                } else {
                    object3 = 2;
                    f6 = 2.8E-45f;
                    if (object == object3) {
                        f6 = this.h;
                    } else {
                        float f18 = this.f;
                        float f19 = (f7 -= f14) - f18;
                        object2 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                        if (object2 <= 0) {
                            f14 = this.h;
                            f6 = this.c * f7;
                            f14 += f6;
                            f6 *= f7;
                            f6 /= (f18 *= f8);
                            f6 = f14 - f6;
                        } else {
                            f6 = this.i;
                        }
                    }
                }
            }
        }
        this.m = f6;
        this.n = f5;
        boolean bl2 = this.k;
        f5 = bl2 ? this.l - f6 : this.l + f6;
        return f5;
    }
}

