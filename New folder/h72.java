/*
 * Decompiled with CFR 0.152.
 */
public final class h72 {
    public static final long a(float f5, float f6) {
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }

    public static final boolean b(long l2) {
        long l3 = 9187343241974906880L;
        l2 = l2 & l3 ^ l3;
        l3 = l2 - 0x100000001L;
        long l4 = (l2 = (l2 ^ (long)-1) & l3 & 0x8000000080000000L) - (l3 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static final boolean c(long l2) {
        long l3 = 9205357640488583168L;
        long l4 = (l2 &= 0x7FFFFFFF7FFFFFFFL) - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        return bl2;
    }

    public static final boolean d(long l2) {
        long l3 = 9205357640488583168L;
        long l4 = (l2 &= 0x7FFFFFFF7FFFFFFFL) - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }
}

