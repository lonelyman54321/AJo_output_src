/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.UnsignedLongs;
import java.math.BigInteger;

final class UnsignedLongs$ParseOverflowDetection {
    static final int[] maxSafeDigits;
    static final long[] maxValueDivs;
    static final int[] maxValueMods;

    static {
        int n3 = 37;
        maxValueDivs = new long[n3];
        maxValueMods = new int[n3];
        maxSafeDigits = new int[n3];
        String string2 = "10000000000000000";
        int n4 = 16;
        BigInteger bigInteger = new BigInteger(string2, n4);
        for (int i3 = 2; i3 <= (n4 = 36); ++i3) {
            long l2;
            Object[] objectArray = maxValueDivs;
            long l3 = i3;
            long l4 = -1;
            objectArray[i3] = l2 = UnsignedLongs.divide(l4, l3);
            objectArray = maxValueMods;
            l3 = UnsignedLongs.remainder(l4, l3);
            int n7 = (int)l3;
            objectArray[i3] = n7;
            objectArray = maxSafeDigits;
            String string3 = bigInteger.toString(i3);
            int n8 = string3.length() + -1;
            objectArray[i3] = n8;
        }
    }

    private UnsignedLongs$ParseOverflowDetection() {
    }

    public static boolean overflowInParse(long l2, int n3, int n4) {
        long l3 = 0L;
        boolean bl2 = true;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object >= 0) {
            long l4 = maxValueDivs[n4];
            long l7 = l2 - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 < 0) {
                return false;
            }
            object2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (object2 > 0) {
                return bl2;
            }
            int[] nArray = maxValueMods;
            int n7 = nArray[n4];
            if (n3 <= n7) {
                bl2 = false;
            }
        }
        return bl2;
    }
}

