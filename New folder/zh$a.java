/*
 * Decompiled with CFR 0.152.
 */
public final class zh$a {
    public final float a;
    public final float b;

    public zh$a(float f5, float f6) {
        this.a = f5;
        this.b = f6;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zh$a;
        if (n3 == 0) {
            return false;
        }
        object = (zh$a)object;
        float f5 = this.a;
        float f6 = ((zh$a)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.b;
        float f7 = ((zh$a)object).b;
        int n4 = Float.compare(f6, f7);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        return Float.floatToIntBits(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlingResult(distanceCoefficient=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", velocityCoefficient=");
        f5 = this.b;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

