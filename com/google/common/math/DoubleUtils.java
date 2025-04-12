/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.BigInteger;

final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 0x7FF0000000000000L;
    static final long IMPLICIT_BIT = 0x10000000000000L;
    static final long ONE_BITS = 0x3FF0000000000000L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 0xFFFFFFFFFFFFFL;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    public static double bigToDouble(BigInteger bigInteger) {
        int n3;
        long l2;
        int n4;
        BigInteger bigInteger2 = bigInteger.abs();
        int n7 = bigInteger2.bitLength();
        int n8 = n7 + -1;
        if (n8 < (n4 = 63)) {
            return bigInteger.longValue();
        }
        n4 = 1023;
        if (n8 > n4) {
            return (double)bigInteger.signum() * (1.0 / 0.0);
        }
        n8 = n7 + -54;
        BigInteger bigInteger3 = bigInteger2.shiftRight(n8);
        long l3 = bigInteger3.longValue();
        int n10 = 1;
        long l4 = l3 >> n10;
        long l7 = 0xFFFFFFFFFFFFFL & l4;
        long l8 = 1L;
        long l12 = 0L;
        long l14 = (l3 &= l8) - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object != false && ((n10 = (int)((l2 = (l3 = l4 & l8) - l12) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0 || (n3 = bigInteger2.getLowestSetBit()) < n8)) {
            l7 += l8;
        }
        long l15 = ((long)(n7 + 1022) << 52) + l7;
        long l16 = (long)bigInteger.signum() & Long.MIN_VALUE;
        return Double.longBitsToDouble(l15 | l16);
    }

    public static double ensureNonNegative(double d2) {
        Preconditions.checkArgument(Double.isNaN(d2) ^ true);
        return Math.max(d2, 0.0);
    }

    public static long getSignificand(double d2) {
        int n3 = DoubleUtils.isFinite(d2);
        String string2 = "not a normal value";
        Preconditions.checkArgument(n3 != 0, string2);
        n3 = Math.getExponent(d2);
        long l2 = Double.doubleToRawLongBits(d2);
        long l3 = 0xFFFFFFFFFFFFFL;
        l2 &= l3;
        int n4 = -1023;
        if (n3 == n4) {
            n3 = 1;
            l2 <<= n3;
        } else {
            long l4 = 0x10000000000000L;
            l2 |= l4;
        }
        return l2;
    }

    public static boolean isFinite(double d2) {
        int n3;
        int n4 = Math.getExponent(d2);
        n4 = n4 <= (n3 = 1023) ? 1 : 0;
        return n4 != 0;
    }

    public static boolean isNormal(double d2) {
        int n3;
        int n4 = Math.getExponent(d2);
        n4 = n4 >= (n3 = -1022) ? 1 : 0;
        return n4 != 0;
    }

    public static double nextDown(double d2) {
        return -Math.nextUp(-d2);
    }

    public static double scaleNormalize(double d2) {
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) & 0xFFFFFFFFFFFFFL | 0x3FF0000000000000L);
    }
}

