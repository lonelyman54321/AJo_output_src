/*
 * Decompiled with CFR 0.152.
 */
public final class WA3 {
    public final long a;

    public /* synthetic */ WA3(long l2) {
        this.a = l2;
    }

    public static long a(float f5, float f6, int n3, long l2) {
        long l3;
        int n4 = n3 & 1;
        int n7 = 32;
        if (n4 != 0) {
            l3 = l2 >> n7;
            int n8 = (int)l3;
            f5 = Float.intBitsToFloat(n8);
        }
        l3 = 0xFFFFFFFFL;
        if ((n3 &= 2) != 0) {
            long l4 = l2 & l3;
            n3 = (int)l4;
            f6 = Float.intBitsToFloat(n3);
        }
        long l7 = Float.floatToRawIntBits(f5);
        long l8 = Float.floatToRawIntBits(f6);
        return l8 & l3 | (l7 <<= n7);
    }

    public static final float b(long l2) {
        return Float.intBitsToFloat((int)(l2 >> 32));
    }

    public static final float c(long l2) {
        return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
    }

    public static final long d(long l2, long l3) {
        int n3 = 32;
        float f5 = Float.intBitsToFloat((int)(l2 >> n3));
        float f6 = Float.intBitsToFloat((int)(l3 >> n3));
        long l4 = 0xFFFFFFFFL;
        float f7 = Float.intBitsToFloat((int)(l2 & l4));
        float f8 = Float.intBitsToFloat((int)(l3 & l4));
        long l7 = Float.floatToRawIntBits(f5 -= f6);
        long l8 = Float.floatToRawIntBits(f7 -= f8);
        l2 = l7 << n3;
        l3 = l8 & l4;
        return l2 | l3;
    }

    public static final long e(long l2, long l3) {
        int n3 = 32;
        float f5 = Float.intBitsToFloat((int)(l2 >> n3));
        float f6 = Float.intBitsToFloat((int)(l3 >> n3)) + f5;
        long l4 = 0xFFFFFFFFL;
        float f7 = Float.intBitsToFloat((int)(l2 & l4));
        float f8 = Float.intBitsToFloat((int)(l3 & l4)) + f7;
        l3 = Float.floatToRawIntBits(f6);
        l2 = Float.floatToRawIntBits(f8);
        return l2 & l4 | (l3 <<= n3);
    }

    public static final long f(long l2, float f5) {
        int n3 = 32;
        float f6 = Float.intBitsToFloat((int)(l2 >> n3)) * f5;
        long l3 = 0xFFFFFFFFL;
        float f7 = Float.intBitsToFloat((int)(l2 & l3)) * f5;
        long l4 = Float.floatToRawIntBits(f6);
        long l7 = Float.floatToRawIntBits(f7);
        l2 = l4 << n3;
        long l8 = l7 & l3;
        return l2 | l8;
    }

    public static String g(long l2) {
        StringBuilder stringBuilder = new StringBuilder("(");
        float f5 = WA3.b(l2);
        stringBuilder.append(f5);
        stringBuilder.append(", ");
        float f6 = WA3.c(l2);
        stringBuilder.append(f6);
        stringBuilder.append(") px/sec");
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof WA3;
        boolean bl3 = false;
        if (bl2) {
            object = (WA3)object;
            long l2 = this.a;
            long l3 = ((WA3)object).a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final String toString() {
        return WA3.g(this.a);
    }
}

