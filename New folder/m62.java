/*
 * Decompiled with CFR 0.152.
 */
public final class m62 {
    public static final Object[] a = new Object[0];
    public static final int[] b = new int[0];
    public static final Object[] c = new Object[0];

    public static final int a(int n3, int n4, int[] nArray) {
        n3 += -1;
        int n7 = 0;
        while (n7 <= n3) {
            int n8 = n7 + n3 >>> 1;
            int n10 = nArray[n8];
            if (n10 < n4) {
                n7 = n8 + 1;
                continue;
            }
            if (n10 > n4) {
                n3 = n8 + -1;
                continue;
            }
            return n8;
        }
        return ~n7;
    }
}

