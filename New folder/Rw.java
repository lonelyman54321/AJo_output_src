/*
 * Decompiled with CFR 0.152.
 */
public final class Rw {
    public final float a;

    public /* synthetic */ Rw(float f5) {
        this.a = f5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Rw;
        boolean bl3 = false;
        if (bl2) {
            object = (Rw)object;
            float f5 = this.a;
            float f6 = ((Rw)object).a;
            int n3 = Float.compare(f5, f6);
            if (n3 == 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaselineShift(multiplier=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

