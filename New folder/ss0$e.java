/*
 * Decompiled with CFR 0.152.
 */
public final class ss0$e
extends ss0 {
    public final ss0$g a(int n3, int n4, int n7, int n8) {
        n3 = (int)(ss0.g ? 1 : 0);
        if (n3 != 0) {
            return ss0$g.QUALITY;
        }
        return ss0$g.MEMORY;
    }

    public final float b(int n3, int n4, int n7, int n8) {
        boolean bl2 = ss0.g;
        if (bl2) {
            float f5 = n7;
            float f6 = n3;
            f5 /= f6;
            f6 = n8;
            float f7 = n4;
            return Math.min(f5, f6 /= f7);
        }
        n3 /= n7;
        n3 = Math.max(n4 /= n8, n3);
        n4 = 1065353216;
        float f8 = 1.0f;
        if (n3 != 0) {
            n3 = Integer.highestOneBit(n3);
            float f11 = n3;
            f8 /= f11;
        }
        return f8;
    }
}

