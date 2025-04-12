/*
 * Decompiled with CFR 0.152.
 */
public final class s90 {
    public static final long a(float f5, float f6) {
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        l3 = l3 & 0xFFFFFFFFL | (l2 <<= 32);
        return l3;
    }
}

