/*
 * Decompiled with CFR 0.152.
 */
public final class VR0$a {
    public final float a;
    public final float b;
    public final long c;

    public VR0$a(float f5, float f6, long l2) {
        this.a = f5;
        this.b = f6;
        this.c = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof VR0$a;
        if (n3 == 0) {
            return false;
        }
        object = (VR0$a)object;
        float f5 = this.a;
        float f6 = ((VR0$a)object).a;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.b;
        f5 = ((VR0$a)object).b;
        n3 = Float.compare(f6, f5);
        if (n3 != 0) {
            return false;
        }
        long l2 = this.c;
        long l3 = ((VR0$a)object).c;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.a) * 31;
        n3 = UR0.a(this.b, n3, 31);
        long l2 = this.c;
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlingInfo(initialVelocity=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", distance=");
        f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", duration=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

