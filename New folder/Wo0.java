/*
 * Decompiled with CFR 0.152.
 */
public final class Wo0
implements Vo0 {
    public final float a;
    public final float b;

    public Wo0(float f5, float f6) {
        this.a = f5;
        this.b = f6;
    }

    public final float D0(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final float E0(float f5) {
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final /* synthetic */ float H(long l2) {
        return mv0_0.a(l2, this);
    }

    public final float H0() {
        return this.b;
    }

    public final float J0(float f5) {
        return this.getDensity() * f5;
    }

    public final long O(float f5) {
        f5 = this.E0(f5);
        return this.e(f5);
    }

    public final int O0(long l2) {
        return Math.round(this.h0(l2));
    }

    public final /* synthetic */ long Z0(long l2) {
        return Uo0.d(l2, this);
    }

    public final /* synthetic */ long e(float f5) {
        return mv0_0.b(f5, this);
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Wo0;
        if (n3 == 0) {
            return false;
        }
        object = (Wo0)object;
        float f5 = this.a;
        float f6 = ((Wo0)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.b;
        float f7 = ((Wo0)object).b;
        int n4 = Float.compare(f6, f7);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final float getDensity() {
        return this.a;
    }

    public final /* synthetic */ float h0(long l2) {
        return Uo0.c(l2, this);
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        return Float.floatToIntBits(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DensityImpl(density=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", fontScale=");
        f5 = this.b;
        return yh_0.a(stringBuilder, f5, ')');
    }

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }
}

