/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Bu1
 */
public final class bu1_1
implements jV0 {
    public final float a;

    public bu1_1(float f5) {
        this.a = f5;
    }

    public final float a(float f5) {
        float f6 = this.a;
        return f5 / f6;
    }

    public final float b(float f5) {
        float f6 = this.a;
        return f5 * f6;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof bu1_1;
        if (!bl3) {
            return false;
        }
        object = (bu1_1)object;
        float f5 = this.a;
        float f6 = ((bu1_1)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("LinearFontScaleConverter(fontScale=");
        float f5 = this.a;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

