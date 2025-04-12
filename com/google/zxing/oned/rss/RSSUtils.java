/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss;

public final class RSSUtils {
    private RSSUtils() {
    }

    private static int combins(int n3, int n4) {
        int n7 = n3 - n4;
        if (n7 > n4) {
            int n8 = n7;
            n7 = n4;
            n4 = n8;
        }
        int n10 = 1;
        int n14 = 1;
        while (n3 > n4) {
            n10 *= n3;
            if (n14 <= n7) {
                n10 /= n14;
                ++n14;
            }
            n3 += -1;
        }
        while (n14 <= n7) {
            n10 /= n14;
            ++n14;
        }
        return n10;
    }

    public static int getRSSvalue(int[] nArray, int n3, boolean bl2) {
        int n4;
        int n7;
        int n8;
        int[] nArray2 = nArray;
        int n10 = n3;
        int n14 = nArray.length;
        int n15 = 0;
        for (n8 = 0; n8 < n14; ++n8) {
            n7 = nArray2[n8];
            n15 += n7;
        }
        n14 = nArray2.length;
        n7 = 0;
        int n16 = 0;
        for (n8 = 0; n8 < (n4 = n14 + -1); ++n8) {
            int n17;
            int n18 = 1;
            int n19 = n18 << n8;
            n16 |= n19;
            int n20 = 1;
            while (n20 < (n17 = nArray2[n8])) {
                int n21;
                int n22;
                n17 = n15 - n20;
                int n24 = n17 + -1;
                int n25 = n14 - n8;
                int n26 = n25 + -2;
                n24 = RSSUtils.combins(n24, n26);
                if (bl2 && n16 == 0 && (n18 = n17 - (n22 = n25 + -1)) >= n22) {
                    n22 = RSSUtils.combins(n17 - n25, n26);
                    n24 -= n22;
                }
                if ((n22 = n25 + -1) > (n18 = 1)) {
                    n22 = n17 - n26;
                    n26 = 0;
                    while (n22 > n10) {
                        int n27 = n17 - n22;
                        n21 = n27 + -1;
                        n18 = n25 + -3;
                        n21 = RSSUtils.combins(n21, n18);
                        n26 += n21;
                        n22 += -1;
                        nArray2 = nArray;
                        n18 = 1;
                    }
                    n21 = (n4 - n8) * n26;
                    n24 -= n21;
                } else if (n17 > n10) {
                    n24 += -1;
                }
                n7 += n24;
                ++n20;
                n21 = ~n19;
                n16 &= n21;
                n18 = 1;
                nArray2 = nArray;
            }
            n15 -= n20;
            nArray2 = nArray;
        }
        return n7;
    }
}

