/*
 * Decompiled with CFR 0.152.
 */
public final class qn2$q
extends qn2 {
    public final float c;
    public final float d;

    public qn2$q(float f5, float f6) {
        boolean bl2 = true;
        super((int)(bl2 ? 1 : 0), false, bl2);
        this.c = f5;
        this.d = f6;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof qn2$q;
        if (n3 == 0) {
            return false;
        }
        object = (qn2$q)object;
        float f5 = this.c;
        float f6 = ((qn2$q)object).c;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        float f7 = ((qn2$q)object).d;
        int n4 = Float.compare(f6, f7);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.c) * 31;
        return Float.floatToIntBits(this.d) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        float f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", dy=");
        f5 = this.d;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

