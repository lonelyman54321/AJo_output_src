/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Eq2
 */
public final class eq2_1
implements t90_0 {
    public final float a;

    public eq2_1(float f5) {
        this.a = f5;
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (f8 >= 0) {
            f8 = 1120403456;
            f6 = 100.0f;
            float f11 = f5 - f6;
            Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object <= 0) {
                return;
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The percent should be in the range of [0, 100]");
        throw illegalArgumentException;
    }

    public final float a(long l2, Vo0 vo0) {
        float f5 = C63.c(l2);
        return this.a / 100.0f * f5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof eq2_1;
        if (!bl3) {
            return false;
        }
        object = (eq2_1)object;
        float f5 = this.a;
        float f6 = ((eq2_1)object).a;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CornerSize(size = ");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append("%)");
        return stringBuilder.toString();
    }
}

