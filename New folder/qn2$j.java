/*
 * Decompiled with CFR 0.152.
 */
public final class qn2$j
extends qn2 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public qn2$j(float f5, float f6, float f7, boolean bl2, boolean bl3, float f8, float f11) {
        super(3, false, false);
        this.c = f5;
        this.d = f6;
        this.e = f7;
        this.f = bl2;
        this.g = bl3;
        this.h = f8;
        this.i = f11;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof qn2$j;
        if (n3 == 0) {
            return false;
        }
        object = (qn2$j)object;
        float f5 = this.c;
        float f6 = ((qn2$j)object).c;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        f5 = ((qn2$j)object).d;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.e;
        f5 = ((qn2$j)object).e;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(this.f ? 1 : 0);
        int n4 = ((qn2$j)object).f;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.g ? 1 : 0);
        n4 = (int)(((qn2$j)object).g ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        f6 = this.h;
        f5 = ((qn2$j)object).h;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.i;
        float f7 = ((qn2$j)object).i;
        int n7 = Float.compare(f6, f7);
        if (n7 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5 = this.c;
        int n3 = Float.floatToIntBits(f5);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.d, n3, n4);
        n3 = UR0.a(this.e, n3, n4);
        int n7 = 1237;
        int n8 = this.f;
        n8 = n8 != 0 ? 1231 : 1237;
        n3 = (n3 + n8) * 31;
        n8 = (int)(this.g ? 1 : 0);
        if (n8 != 0) {
            n7 = 1231;
        }
        n3 = (n3 + n7) * 31;
        n3 = UR0.a(this.h, n3, n4);
        return Float.floatToIntBits(this.i) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        float f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", verticalEllipseRadius=");
        f5 = this.d;
        stringBuilder.append(f5);
        stringBuilder.append(", theta=");
        f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(", isMoreThanHalf=");
        boolean bl2 = this.f;
        stringBuilder.append(bl2);
        stringBuilder.append(", isPositiveArc=");
        bl2 = this.g;
        stringBuilder.append(bl2);
        stringBuilder.append(", arcStartDx=");
        f5 = this.h;
        stringBuilder.append(f5);
        stringBuilder.append(", arcStartDy=");
        f5 = this.i;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

