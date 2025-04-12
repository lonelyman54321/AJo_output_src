/*
 * Decompiled with CFR 0.152.
 */
public final class D61 {
    public static final long a(float f5, boolean bl2) {
        int n3 = Float.floatToIntBits(f5);
        long l2 = n3;
        long l3 = bl2 ? 1L : 0L;
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }
}

