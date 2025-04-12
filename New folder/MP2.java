/*
 * Decompiled with CFR 0.152.
 */
public final class MP2 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public MP2(float f5, float f6, int n3, long l2) {
        this.a = f5;
        this.b = f6;
        this.c = l2;
        this.d = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3 = object instanceof MP2;
        if (n3 == 0) return 0 != 0;
        object = (MP2)object;
        float f5 = ((MP2)object).a;
        float f6 = this.a;
        float f7 = f5 - f6;
        n3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (n3 != 0) return 0 != 0;
        f5 = ((MP2)object).b;
        f6 = this.b;
        float f8 = f5 - f6;
        n3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (n3 != 0) return 0 != 0;
        long l2 = ((MP2)object).c;
        long l3 = this.c;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) return 0 != 0;
        int n4 = ((MP2)object).d;
        n3 = this.d;
        if (n4 != n3) return 0 != 0;
        return 1 != 0;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        n3 = UR0.a(this.b, n3, 31);
        long l2 = this.c;
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        n3 = (n3 + n4) * 31;
        int n7 = this.d;
        return n3 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(",horizontalScrollPixels=");
        f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(",uptimeMillis=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(",deviceId=");
        int n3 = this.d;
        return tu.a(stringBuilder, n3, ')');
    }
}

