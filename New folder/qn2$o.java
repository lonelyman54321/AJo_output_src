/*
 * Decompiled with CFR 0.152.
 */
public final class qn2$o
extends qn2 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public qn2$o(float f5, float f6, float f7, float f8) {
        boolean bl2 = true;
        super((int)(bl2 ? 1 : 0), false, bl2);
        this.c = f5;
        this.d = f6;
        this.e = f7;
        this.f = f8;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof qn2$o;
        if (n3 == 0) {
            return false;
        }
        object = (qn2$o)object;
        float f5 = this.c;
        float f6 = ((qn2$o)object).c;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        f5 = ((qn2$o)object).d;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.e;
        f5 = ((qn2$o)object).e;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        f6 = this.f;
        float f7 = ((qn2$o)object).f;
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
        return Float.floatToIntBits(this.f) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RelativeQuadTo(dx1=");
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
        return yh_0.a(stringBuilder, f5, ')');
    }
}

