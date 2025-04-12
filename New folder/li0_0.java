/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from li0
 */
public final class li0_0 {
    public long a;
    public float b;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof li0_0;
        if (!object2) {
            return false;
        }
        object = (li0_0)object;
        long l2 = this.a;
        long l3 = ((li0_0)object).a;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((li0_0)object).b;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 ^ l3) * 31;
        return Float.floatToIntBits(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataPointAtTime(time=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", dataPoint=");
        float f5 = this.b;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

