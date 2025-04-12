/*
 * Decompiled with CFR 0.152.
 */
public final class Ch1 {
    public static final long a;
    public static final /* synthetic */ int b;

    static {
        float f5 = 0.0f / 0.0f;
        a = Ch1.a(f5, f5);
    }

    public static long a(float f5, float f6) {
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }
}

