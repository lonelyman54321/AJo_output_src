/*
 * Decompiled with CFR 0.152.
 */
public final class qn2$f
extends qn2 {
    public final float c;
    public final float d;

    public qn2$f(float f5, float f6) {
        super(3, false, false);
        this.c = f5;
        this.d = f6;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof qn2$f;
        if (n3 == 0) {
            return false;
        }
        object = (qn2$f)object;
        float f5 = this.c;
        float f6 = ((qn2$f)object).c;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.d;
        float f7 = ((qn2$f)object).d;
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
        StringBuilder stringBuilder = new StringBuilder("MoveTo(x=");
        float f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", y=");
        f5 = this.d;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

