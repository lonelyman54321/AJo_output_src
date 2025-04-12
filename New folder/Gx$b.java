/*
 * Decompiled with CFR 0.152.
 */
public final class Gx$b
implements Nc$c {
    public final float a;

    public Gx$b(float f5) {
        this.a = f5;
    }

    public final int a(int n3, int n4) {
        float f5 = (float)(n4 - n3) / 2.0f;
        float f6 = 1.0f;
        float f7 = this.a;
        return Math.round((f6 + f7) * f5);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Gx$b;
        if (!bl3) {
            return false;
        }
        object = (Gx$b)object;
        float f5 = this.a;
        float f6 = ((Gx$b)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("Vertical(bias=");
        float f5 = this.a;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

