/*
 * Decompiled with CFR 0.152.
 */
public final class YS2 {
    public static final long a;
    public static final /* synthetic */ int b;

    static {
        float f5 = 0.0f / 0.0f;
        a = ZS2.a(f5, f5);
    }

    public static final float a(long l2) {
        long l3 = a;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        if (bl2) {
            return Float.intBitsToFloat((int)(l2 >> 32));
        }
        bh1_1.c("ScaleFactor is unspecified");
        throw null;
    }

    public static final float b(long l2) {
        long l3 = a;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        if (bl2) {
            return Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
        }
        bh1_1.c("ScaleFactor is unspecified");
        throw null;
    }
}

