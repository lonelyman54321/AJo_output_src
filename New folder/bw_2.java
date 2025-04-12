/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bW
 */
public final class bw_2
implements cw_2 {
    public final float a;
    public final float b;

    public bw_2() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public final boolean a(Comparable object, Comparable object2) {
        float f5;
        float f6 = ((Number)(object = (Number)object)).floatValue();
        float f7 = f6 - (f5 = ((Number)(object2 = (Number)object2)).floatValue());
        Object object3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object3 <= 0) {
            object3 = true;
            f6 = Float.MIN_VALUE;
        } else {
            object3 = false;
            f6 = 0.0f;
            object = null;
        }
        return (boolean)object3;
    }

    public final Comparable c() {
        return Float.valueOf(this.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof bw_2;
        if (!bl2) return false;
        boolean bl3 = this.isEmpty();
        if (bl3) {
            Object object2 = object;
            object2 = (bw_2)object;
            boolean bl4 = ((bw_2)object2).isEmpty();
            if (bl4) return true;
        }
        object = (bw_2)object;
        float f5 = this.a;
        float f6 = ((bw_2)object).a;
        float f7 = f5 - f6;
        Object object3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object3 != false) return false;
        f6 = this.b;
        float f8 = ((bw_2)object).b;
        float f11 = f6 - f8;
        Object object4 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object4) return false;
        return true;
    }

    public final Comparable getStart() {
        return Float.valueOf(this.a);
    }

    public final int hashCode() {
        int n3 = this.isEmpty();
        if (n3 != 0) {
            n3 = -1;
            float f5 = 0.0f / 0.0f;
        } else {
            float f6 = this.a;
            n3 = Float.floatToIntBits(f6) * 31;
            float f7 = this.b;
            int n4 = Float.floatToIntBits(f7);
            n3 += n4;
        }
        return n3;
    }

    public final boolean isEmpty() {
        float f5 = this.a;
        float f6 = this.b;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append("..");
        f5 = this.b;
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }
}

