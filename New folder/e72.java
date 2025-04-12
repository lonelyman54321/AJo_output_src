/*
 * Decompiled with CFR 0.152.
 */
public final class e72 {
    public final long a;

    public /* synthetic */ e72(long l2) {
        this.a = l2;
    }

    public static long a(int n3, long l2, float f5) {
        long l3;
        float f6;
        long l4;
        int n4 = n3 & 1;
        int n7 = 32;
        if (n4 != 0) {
            l4 = l2 >> n7;
            n4 = (int)l4;
            f6 = Float.intBitsToFloat(n4);
        } else {
            n4 = 0;
            f6 = 0.0f;
        }
        l4 = 0xFFFFFFFFL;
        if ((n3 &= 2) != 0) {
            l3 = l2 & l4;
            int n8 = (int)l3;
            f5 = Float.intBitsToFloat(n8);
        }
        l3 = Float.floatToRawIntBits(f6);
        long l7 = Float.floatToRawIntBits(f5);
        return (l3 <<= n7) | (l7 &= l4);
    }

    public static final boolean b(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static final float c(long l2) {
        float f5 = Float.intBitsToFloat((int)(l2 >> 32));
        float f6 = Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
        f5 *= f5;
        return (float)Math.sqrt(f6 * f6 + f5);
    }

    public static final float d(long l2) {
        return Float.intBitsToFloat((int)(l2 >> 32));
    }

    public static final float e(long l2) {
        return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
    }

    public static int f(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static final boolean g(long l2) {
        long l3 = (l2 &= 0x7FFFFFFF7FFFFFFFL) - 9187343246269874177L;
        l2 = (l2 ^ (long)-1) & l3;
        l3 = -9223372034707292160L;
        long l4 = (l2 &= l3) - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static final long h(long l2, long l3) {
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

    public static final long i(long l2, long l3) {
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

    public static final long j(long l2, float f5) {
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

    public static String k(long l2) {
        String string2;
        boolean bl2 = h72.c(l2);
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder("Offset(");
            float f5 = e72.d(l2);
            String string3 = jZ0.a(f5);
            stringBuilder.append(string3);
            string3 = ", ";
            stringBuilder.append(string3);
            string2 = jZ0.a(e72.e(l2));
            stringBuilder.append(string2);
            char c2 = ')';
            stringBuilder.append(c2);
            string2 = stringBuilder.toString();
        } else {
            string2 = "Offset.Unspecified";
        }
        return string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof e72;
        boolean bl3 = false;
        if (bl2) {
            object = (e72)object;
            long l2 = this.a;
            long l3 = ((e72)object).a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return e72.f(this.a);
    }

    public final String toString() {
        return e72.k(this.a);
    }
}

