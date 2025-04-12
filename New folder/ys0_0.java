/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ys0
 */
public final class ys0_0
implements t90_0 {
    public final float a;

    public ys0_0(float f5) {
        this.a = f5;
    }

    public final float a(long l2, Vo0 vo0) {
        float f5 = this.a;
        return vo0.J0(f5);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ys0_0;
        if (!bl3) {
            return false;
        }
        object = (ys0_0)object;
        float f5 = this.a;
        float f6 = ((ys0_0)object).a;
        boolean bl4 = xs0_0.a(f5, f6);
        if (!bl4) {
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
        stringBuilder.append(".dp)");
        return stringBuilder.toString();
    }
}

