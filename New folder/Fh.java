/*
 * Decompiled with CFR 0.152.
 */
public final class Fh {
    public static final int a(tv0_0 tv0_02, int n3) {
        tv0_0 tv0_03 = tv0_0.g;
        int n4 = tv0_02.a(tv0_03);
        int n7 = 0;
        tv0_03 = null;
        int n8 = 1;
        if (n4 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            tv0_02 = null;
        }
        n3 = nV0.a(n3, n8) ? 1 : 0;
        if (n3 != 0 && n4 != 0) {
            n7 = 3;
        } else if (n4 != 0) {
            n7 = 1;
        } else if (n3 != 0) {
            n7 = 2;
        }
        return n7;
    }
}

