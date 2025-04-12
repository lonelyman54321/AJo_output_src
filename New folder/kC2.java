/*
 * Decompiled with CFR 0.152.
 */
public final class kC2
implements t90_0 {
    public final float a;

    public kC2(float f5) {
        this.a = f5;
    }

    public final float a(long l2, Vo0 vo0) {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof kC2;
        if (!bl3) {
            return false;
        }
        object = (kC2)object;
        float f5 = this.a;
        float f6 = ((kC2)object).a;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CornerSize(size = ");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(".px)");
        return stringBuilder.toString();
    }
}

