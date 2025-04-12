/*
 * Decompiled with CFR 0.152.
 */
public final class L70 {
    /*
     * Enabled aggressive block sorting
     */
    public static final int a(int n3, int n4, int n7, boolean n8) {
        int n10;
        int n14;
        block9: {
            block8: {
                block7: {
                    int n15;
                    n14 = 0;
                    if (n4 >= n7) {
                        if (n8 == 0) return n7 - n4;
                        return n14;
                    }
                    n10 = n8 ^ 1;
                    if (!(n10 != 0 ? n4 <= n3 : (n15 = n7 - n4) > n3)) break block7;
                    if (n8 != 0) {
                        return n3;
                    }
                    break block8;
                }
                if (!(n8 != 0 ? n4 <= n3 : (n8 = n7 - n4) > n3)) break block9;
                if (n10 != 0) return n3;
            }
            n3 -= n4;
            return n3;
        }
        if (n10 != 0) return n14;
        return n7 - n4;
    }
}

