/*
 * Decompiled with CFR 0.152.
 */
public final class ss0$a
extends ss0 {
    public final ss0$g a(int n3, int n4, int n7, int n8) {
        return ss0$g.QUALITY;
    }

    public final float b(int n3, int n4, int n7, int n8) {
        n3 /= n7;
        n3 = Math.min(n4 /= n8, n3);
        n4 = 1065353216;
        float f5 = 1.0f;
        if (n3 != 0) {
            n3 = Integer.highestOneBit(n3);
            float f6 = n3;
            f5 /= f6;
        }
        return f5;
    }
}

