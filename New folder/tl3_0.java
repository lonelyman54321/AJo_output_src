/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tl3
 */
public final class tl3_0 {
    public static final tl3_0 c;
    public final float a;
    public final float b;

    static {
        tl3_0 tl3_02;
        c = tl3_02 = new tl3_0(1.0f, 0.0f);
    }

    public tl3_0() {
        this(1.0f, 0.0f);
    }

    public tl3_0(float f5, float f6) {
        this.a = f5;
        this.b = f6;
    }

    public final boolean equals(Object object) {
        float f5;
        float f6;
        float f7;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof tl3_0;
        if (!object2) {
            return false;
        }
        object = (tl3_0)object;
        float f8 = this.a;
        float f11 = ((tl3_0)object).a;
        float f12 = f8 - f11;
        object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (!object2 && (f7 = (f6 = (f11 = this.b) - (f5 = ((tl3_0)object).b)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        return Float.floatToIntBits(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextGeometricTransform(scaleX=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", skewX=");
        f5 = this.b;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

