/*
 * Decompiled with CFR 0.152.
 */
public final class dt {
    public final int a;
    public final float b;

    public dt() {
        this.a = 0;
        this.b = 0.0f;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<dt> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = dt.class) == (clazz = object.getClass())) {
            float f5;
            float f6;
            int n3;
            object = (dt)object;
            int n4 = this.a;
            int n7 = ((dt)object).a;
            if (n4 != n7 || (n3 = Float.compare(f6 = ((dt)object).b, f5 = this.b)) != 0) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = (527 + n3) * 31;
        return Float.floatToIntBits(this.b) + n4;
    }
}

