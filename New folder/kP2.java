/*
 * Decompiled with CFR 0.152.
 */
public final class kP2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public kP2(float f5, float f6, float f7, float f8) {
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
    }

    public final boolean equals(Object object) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof kP2;
        if (!object2) {
            return false;
        }
        object = (kP2)object;
        float f12 = this.a;
        float f14 = ((kP2)object).a;
        float f15 = f12 - f14;
        object2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (!(object2 || (object2 = (f11 = (f14 = this.b) - (f12 = ((kP2)object).b)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) || (object2 = (f8 = (f14 = this.c) - (f12 = ((kP2)object).c)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) || (f7 = (f6 = (f14 = this.d) - (f5 = ((kP2)object).d)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) != false)) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        return Float.floatToIntBits(this.d) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RippleAlpha(draggedAlpha=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", focusedAlpha=");
        f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", hoveredAlpha=");
        f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", pressedAlpha=");
        f5 = this.d;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

