/*
 * Decompiled with CFR 0.152.
 */
public final class ss0$b
extends ss0 {
    public final ss0$g a(int n3, int n4, int n7, int n8) {
        return ss0$g.MEMORY;
    }

    public final float b(int n3, int n4, int n7, int n8) {
        float f5 = n4;
        float f6 = n8;
        float f7 = n3;
        float f8 = n7;
        f7 /= f8;
        f7 = Math.max(f5 /= f6, f7);
        double d2 = Math.ceil(f7);
        n3 = (int)d2;
        n4 = Integer.highestOneBit(n3);
        n7 = 1;
        f8 = Float.MIN_VALUE;
        if ((n4 = Math.max(n7, n4)) >= n3) {
            n7 = 0;
            f8 = 0.0f;
        }
        f7 = n4 << n7;
        return 1.0f / f7;
    }
}

