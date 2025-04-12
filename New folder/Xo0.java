/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Xo0
implements Vo0 {
    public final float a;
    public final float b;
    public final jV0 c;

    public Xo0(float f5, float f6, jV0 jV02) {
        this.a = f5;
        this.b = f6;
        this.c = jV02;
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

    public final float H(long l2) {
        long l3;
        long l4 = Dm3.b(l2);
        boolean bl2 = Fm3.a(l4, l3 = 0x100000000L);
        if (bl2) {
            jV0 jV02 = this.c;
            float f5 = Dm3.c(l2);
            return jV02.b(f5);
        }
        String string2 = "Only Sp can convert to Px".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
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

    public final long e(float f5) {
        f5 = this.c.a(f5);
        return Em3.i(0x100000000L, f5);
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Xo0;
        if (n3 == 0) {
            return false;
        }
        object = (Xo0)object;
        float f5 = this.a;
        float f6 = ((Xo0)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.b;
        f5 = ((Xo0)object).b;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        jV0 jV02 = this.c;
        object = ((Xo0)object).c;
        boolean bl3 = Intrinsics.areEqual(jV02, object);
        if (!bl3) {
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
        n3 = UR0.a(this.b, n3, 31);
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DensityWithConverter(density=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", fontScale=");
        f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", converter=");
        jV0 jV02 = this.c;
        stringBuilder.append(jV02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }
}

