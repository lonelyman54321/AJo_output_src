/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vB2
 */
public final class vb2_1 {
    public static final int a(int n3, int n4, int n7) {
        block14: {
            block13: {
                block12: {
                    if (n7 <= 0) break block12;
                    if (n3 < n4) {
                        int n8 = n4 % n7;
                        if (n8 < 0) {
                            n8 += n7;
                        }
                        if ((n3 %= n7) < 0) {
                            n3 += n7;
                        }
                        n8 = (n8 - n3) % n7;
                        if (n8 < 0) {
                            n8 += n7;
                        }
                        n4 -= n8;
                    }
                    break block13;
                }
                if (n7 >= 0) break block14;
                if (n3 > n4) {
                    if ((n3 %= (n7 = -n7)) < 0) {
                        n3 += n7;
                    }
                    int n10 = n4 % n7;
                    if (n10 < 0) {
                        n10 += n7;
                    }
                    n3 = (n3 - n10) % n7;
                    if (n3 < 0) {
                        n3 += n7;
                    }
                    n4 += n3;
                }
            }
            return n4;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Step is zero.");
        throw illegalArgumentException;
    }
}

