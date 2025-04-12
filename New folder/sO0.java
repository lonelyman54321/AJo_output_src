/*
 * Decompiled with CFR 0.152.
 */
public final class sO0
implements i70_0 {
    public final float a;

    public sO0() {
        this.a = 1.0f;
    }

    public final long a(long l2, long l3) {
        float f5 = this.a;
        return ZS2.a(f5, f5);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof sO0;
        if (!bl3) {
            return false;
        }
        object = (sO0)object;
        float f5 = this.a;
        float f6 = ((sO0)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("FixedScale(value=");
        float f5 = this.a;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

