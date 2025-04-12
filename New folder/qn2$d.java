/*
 * Decompiled with CFR 0.152.
 */
public final class qn2$d
extends qn2 {
    public final float c;

    public qn2$d(float f5) {
        super(3, false, false);
        this.c = f5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof qn2$d;
        if (!bl3) {
            return false;
        }
        object = (qn2$d)object;
        float f5 = this.c;
        float f6 = ((qn2$d)object).c;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HorizontalTo(x=");
        float f5 = this.c;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

