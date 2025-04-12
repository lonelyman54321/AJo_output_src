/*
 * Decompiled with CFR 0.152.
 */
public final class Ti1 {
    public static final /* synthetic */ int a;

    public static final long a(int n3, int n4) {
        long l2 = (long)n3 << 32;
        return (long)n4 & 0xFFFFFFFFL | l2;
    }

    public static final long b(long l2) {
        int n3 = Math.round(e72.d(l2));
        int n4 = Math.round(e72.e(l2));
        long l3 = (long)n3 << 32;
        return (long)n4 & 0xFFFFFFFFL | l3;
    }
}

