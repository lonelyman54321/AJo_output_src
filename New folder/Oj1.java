/*
 * Decompiled with CFR 0.152.
 */
public final class Oj1
implements aa3_2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int b(int n3, WR1 wR1) {
        int n4 = wR1.c + -1;
        int n7 = 0;
        while (n7 < n4) {
            int n8 = (n4 - n7) / 2 + n7;
            Object[] objectArray = wR1.a;
            Nj1 nj1 = (Nj1)objectArray[n8];
            int n10 = nj1.a;
            if (n10 == n3) {
                return n8;
            }
            if (n10 < n3) {
                n7 = n8 + 1;
                Nj1 nj12 = (Nj1)objectArray[n7];
                int n14 = nj12.a;
                if (n3 >= n14) continue;
                return n8;
            }
            n4 = n8 + -1;
        }
        return n7;
    }

    public void a(ba3_2 ba3_22) {
    }
}

