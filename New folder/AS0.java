/*
 * Decompiled with CFR 0.152.
 */
public final class AS0 {
    public static final boolean a(float f5) {
        int n3;
        int n4 = Float.floatToRawIntBits(f5) & -1 >>> 1;
        if (n4 > (n3 = 2139095040)) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
        }
        return n4 != 0;
    }
}

