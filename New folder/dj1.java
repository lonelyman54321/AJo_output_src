/*
 * Decompiled with CFR 0.152.
 */
public final class dj1 {
    public static final long a(int n3, int n4) {
        long l2 = (long)n3 << 32;
        return (long)n4 & 0xFFFFFFFFL | l2;
    }

    public static final long b(long l2) {
        float f5 = (int)(l2 >> 32);
        float f6 = (int)(l2 & 0xFFFFFFFFL);
        return bo1_1.a(f5, f6);
    }
}

