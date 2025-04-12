/*
 * Decompiled with CFR 0.152.
 */
public final class qn2$k
extends qn2 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public qn2$k(float f5, float f6, float f7, float f8, float f11, float f12) {
        super(2, true, false);
        this.c = f5;
        this.d = f6;
        this.e = f7;
        this.f = f8;
        this.g = f11;
        this.h = f12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof qn2$k;
        if (n3 == 0) {
            return false;
        }
        object = (qn2$k)object;
        float f5 = this.c;
        float f6 = ((qn2$k)object).c;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        f5 = ((qn2$k)object).d;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.e;
        f5 = ((qn2$k)object).e;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.f;
        f5 = ((qn2$k)object).f;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.g;
        f5 = ((qn2$k)object).g;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.h;
        float f7 = ((qn2$k)object).h;
        int n4 = Float.compare(f6, f7);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.c);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.d, n3, n4);
        n3 = UR0.a(this.e, n3, n4);
        n3 = UR0.a(this.f, n3, n4);
        n3 = UR0.a(this.g, n3, n4);
        return Float.floatToIntBits(this.h) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RelativeCurveTo(dx1=");
        float f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", dy1=");
        f5 = this.d;
        stringBuilder.append(f5);
        stringBuilder.append(", dx2=");
        f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(", dy2=");
        f5 = this.f;
        stringBuilder.append(f5);
        stringBuilder.append(", dx3=");
        f5 = this.g;
        stringBuilder.append(f5);
        stringBuilder.append(", dy3=");
        f5 = this.h;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

