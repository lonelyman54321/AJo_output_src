/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath$1;
import com.google.common.math.LongMath;
import com.google.common.math.MathPreconditions;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;

public final class IntMath {
    static final int FLOOR_SQRT_MAX_INT = 46340;
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;
    static final int MAX_SIGNED_POWER_OF_TWO = 0x40000000;
    static int[] biggestBinomials;
    private static final int[] factorials;
    static final int[] halfPowersOf10;
    static final byte[] maxLog10ForLeadingZeros;
    static final int[] powersOf10;

    static {
        int[] nArray;
        Object[] objectArray;
        byte[] byArray = objectArray = new byte[33];
        byte[] byArray2 = objectArray;
        byArray[0] = 9;
        byArray2[1] = 9;
        byArray[2] = 9;
        byArray2[3] = 8;
        byArray[4] = 8;
        byArray2[5] = 8;
        byArray[6] = 7;
        byArray2[7] = 7;
        byArray[8] = 7;
        byArray2[9] = 6;
        byArray[10] = 6;
        byArray2[11] = 6;
        byArray[12] = 6;
        byArray2[13] = 5;
        byArray[14] = 5;
        byArray2[15] = 5;
        byArray[16] = 4;
        byArray2[17] = 4;
        byArray[18] = 4;
        byArray2[19] = 3;
        byArray[20] = 3;
        byArray2[21] = 3;
        byArray[22] = 3;
        byArray2[23] = 2;
        byArray[24] = 2;
        byArray2[25] = 2;
        byArray[26] = 1;
        byArray2[27] = 1;
        byArray[28] = 1;
        byArray2[29] = 0;
        byArray[30] = 0;
        byArray2[31] = 0;
        byArray2[32] = 0;
        maxLog10ForLeadingZeros = objectArray;
        int n3 = 10;
        int[] nArray2 = nArray = new int[n3];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 10;
        nArray2[2] = 100;
        nArray3[3] = 1000;
        nArray2[4] = 10000;
        nArray3[5] = 100000;
        nArray2[6] = 1000000;
        nArray3[7] = 10000000;
        nArray2[8] = 100000000;
        nArray3[9] = 1000000000;
        powersOf10 = nArray;
        Object[] objectArray2 = objectArray = (Object[])new int[n3];
        Object[] objectArray3 = objectArray;
        objectArray2[0] = 3;
        objectArray3[1] = 31;
        objectArray2[2] = 316;
        objectArray3[3] = 3162;
        objectArray2[4] = 31622;
        objectArray3[5] = 316227;
        objectArray2[6] = 3162277;
        objectArray3[7] = 31622776;
        objectArray2[8] = 316227766;
        objectArray3[9] = -1 >>> 1;
        halfPowersOf10 = objectArray;
        Object[] objectArray4 = objectArray = (Object[])new int[13];
        Object[] objectArray5 = objectArray;
        objectArray4[0] = 1;
        objectArray5[1] = 1;
        objectArray4[2] = 2;
        objectArray5[3] = 6;
        objectArray4[4] = 24;
        objectArray5[5] = 120;
        objectArray4[6] = 720;
        objectArray5[7] = 5040;
        objectArray4[8] = 40320;
        objectArray5[9] = 362880;
        objectArray4[10] = 3628800;
        objectArray5[11] = 39916800;
        objectArray5[12] = 479001600;
        factorials = objectArray;
        Object[] objectArray6 = objectArray = (Object[])new int[17];
        Object[] objectArray7 = objectArray;
        objectArray6[0] = -1 >>> 1;
        objectArray7[1] = -1 >>> 1;
        objectArray6[2] = 65536;
        objectArray7[3] = 2345;
        objectArray6[4] = 477;
        objectArray7[5] = 193;
        objectArray6[6] = 110;
        objectArray7[7] = 75;
        objectArray6[8] = 58;
        objectArray7[9] = 49;
        objectArray6[10] = 43;
        objectArray7[11] = 39;
        objectArray6[12] = 37;
        objectArray7[13] = 35;
        objectArray6[14] = 34;
        objectArray7[15] = 34;
        objectArray7[16] = 33;
        biggestBinomials = objectArray;
    }

    private IntMath() {
    }

    public static int binomial(int n3, int n4) {
        int n7;
        int[] nArray;
        int n8;
        MathPreconditions.checkNonNegative("n", n3);
        MathPreconditions.checkNonNegative("k", n4);
        int n10 = 0;
        int n14 = 1;
        if (n4 <= n3) {
            n8 = 1;
        } else {
            n8 = 0;
            nArray = null;
        }
        String string2 = "k (%s) > n (%s)";
        Preconditions.checkArgument(n8 != 0, string2, n4, n3);
        n8 = n3 >> 1;
        if (n4 > n8) {
            n4 = n3 - n4;
        }
        if (n4 < (n7 = (nArray = biggestBinomials).length) && n3 <= (n8 = nArray[n4])) {
            if (n4 != 0) {
                if (n4 != n14) {
                    long l2 = 1L;
                    while (n10 < n4) {
                        n7 = n3 - n10;
                        long l3 = n7;
                        l2 *= l3;
                        l3 = ++n10;
                        l2 /= l3;
                    }
                    n3 = (int)l2;
                }
                return n3;
            }
            return n14;
        }
        return -1 >>> 1;
    }

    public static int ceilingPowerOfTwo(int n3) {
        Object object = "x";
        MathPreconditions.checkPositive((String)object, n3);
        int n4 = 0x40000000;
        if (n3 <= n4) {
            n4 = 1;
            n3 = -Integer.numberOfLeadingZeros(n3 - n4);
            return n4 << n3;
        }
        String string2 = Gj0.b(n3, "ceilingPowerOfTwo(", ") not representable as an int");
        object = new ArithmeticException(string2);
        throw object;
    }

    public static int checkedAdd(int n3, int n4) {
        int n7;
        long l2;
        long l3;
        long l4;
        long l7 = n3;
        long l8 = n4;
        boolean bl2 = (l4 = (l3 = (l7 += l8) - (l2 = (long)(n7 = (int)l7))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false;
        MathPreconditions.checkNoOverflow(bl2, "checkedAdd", n3, n4);
        return n7;
    }

    public static int checkedMultiply(int n3, int n4) {
        int n7;
        long l2;
        long l3;
        long l4;
        long l7 = n3;
        long l8 = n4;
        boolean bl2 = (l4 = (l3 = (l7 *= l8) - (l2 = (long)(n7 = (int)l7))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false;
        MathPreconditions.checkNoOverflow(bl2, "checkedMultiply", n3, n4);
        return n7;
    }

    public static int checkedPow(int n3, int n4) {
        String string2 = "exponent";
        MathPreconditions.checkNonNegative(string2, n4);
        int n7 = -2;
        String string3 = "checkedPow";
        int n8 = -1;
        boolean bl2 = false;
        int n10 = 1;
        if (n3 != n7) {
            if (n3 != n8) {
                if (n3 != 0) {
                    if (n3 != n10) {
                        n7 = 2;
                        if (n3 != n7) {
                            n7 = 1;
                            while (n4 != 0) {
                                if (n4 != n10) {
                                    n8 = n4 & 1;
                                    if (n8 != 0) {
                                        n7 = IntMath.checkedMultiply(n7, n3);
                                    }
                                    if ((n4 >>= 1) <= 0) continue;
                                    n8 = -46340;
                                    n8 = n8 <= n3 ? 1 : 0;
                                    int n14 = 46340;
                                    n14 = n3 <= n14 ? 1 : 0;
                                    MathPreconditions.checkNoOverflow((n8 &= n14) != 0, string3, n3, n4);
                                    n3 *= n3;
                                    continue;
                                }
                                return IntMath.checkedMultiply(n7, n3);
                            }
                            return n7;
                        }
                        n7 = 31;
                        if (n4 < n7) {
                            bl2 = true;
                        }
                        MathPreconditions.checkNoOverflow(bl2, string3, n3, n4);
                        return n10 << n4;
                    }
                    return n10;
                }
                if (n4 == 0) {
                    bl2 = true;
                }
                return (int)(bl2 ? 1 : 0);
            }
            n3 = n4 & 1;
            if (n3 == 0) {
                n8 = 1;
            }
            return n8;
        }
        n7 = 32;
        if (n4 < n7) {
            bl2 = true;
        }
        MathPreconditions.checkNoOverflow(bl2, string3, n3, n4);
        n3 = n4 & 1;
        n3 = n3 == 0 ? n10 << n4 : n8 << n4;
        return n3;
    }

    public static int checkedSubtract(int n3, int n4) {
        int n7;
        long l2;
        long l3;
        long l4;
        long l7 = n3;
        long l8 = n4;
        boolean bl2 = (l4 = (l3 = (l7 -= l8) - (l2 = (long)(n7 = (int)l7))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false;
        MathPreconditions.checkNoOverflow(bl2, "checkedSubtract", n3, n4);
        return n7;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static int divide(int n3, int n4, RoundingMode roundingMode) {
        Preconditions.checkNotNull((Object)roundingMode);
        if (n4 == 0) {
            ArithmeticException arithmeticException = new ArithmeticException("/ by zero");
            throw arithmeticException;
        }
        int n7 = n3 / n4;
        int n8 = n4 * n7;
        if ((n8 = n3 - n8) == 0) {
            return n7;
        }
        n3 = (n3 ^ n4) >> 31;
        int n10 = 1;
        n3 |= n10;
        int[] nArray = IntMath$1.$SwitchMap$java$math$RoundingMode;
        int n14 = roundingMode.ordinal();
        int n15 = nArray[n14];
        n14 = 0;
        int n16 = 0;
        block8: do {
            switch (n16 == 0 ? n15 : n16) {
                default: {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                case 6: 
                case 7: 
                case 8: {
                    n8 = Math.abs(n8);
                    n4 = Math.abs(n4) - n8;
                    if ((n8 -= n4) == 0) {
                        n16 = 4;
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        if (roundingMode == roundingMode2) continue block8;
                        roundingMode2 = RoundingMode.HALF_EVEN;
                        if (roundingMode == roundingMode2) {
                            n4 = 1;
                        } else {
                            n4 = 0;
                            roundingMode2 = null;
                        }
                        int n17 = n7 & 1;
                        if (n17 == 0) {
                            n10 = 0;
                        }
                        if ((n4 &= n10) == 0) return n7;
                        n16 = 4;
                        continue block8;
                    }
                    if (n8 <= 0) return n7;
                    n16 = 4;
                    continue block8;
                }
                case 5: {
                    if (n3 <= 0) return n7;
                    n16 = 4;
                    continue block8;
                }
                case 3: {
                    if (n3 >= 0) return n7;
                }
                case 4: {
                    return n7 += n3;
                }
                case 1: {
                    if (n8 != 0) {
                        n10 = 0;
                    }
                    MathPreconditions.checkRoundingUnnecessary(n10 != 0);
                    return n7;
                }
                case 2: 
            }
            return n7;
        } while (true);
        return n7;
    }

    public static int factorial(int n3) {
        MathPreconditions.checkNonNegative("n", n3);
        int[] nArray = factorials;
        int n4 = nArray.length;
        n3 = n3 < n4 ? nArray[n3] : -1 >>> 1;
        return n3;
    }

    public static int floorPowerOfTwo(int n3) {
        MathPreconditions.checkPositive("x", n3);
        return Integer.highestOneBit(n3);
    }

    public static int gcd(int n3, int n4) {
        MathPreconditions.checkNonNegative("a", n3);
        String string2 = "b";
        MathPreconditions.checkNonNegative(string2, n4);
        if (n3 == 0) {
            return n4;
        }
        if (n4 == 0) {
            return n3;
        }
        int n7 = Integer.numberOfTrailingZeros(n3);
        n3 >>= n7;
        int n8 = Integer.numberOfTrailingZeros(n4);
        n4 >>= n8;
        while (n3 != n4) {
            int n10 = (n3 -= n4) >> 31 & n3;
            n3 = n3 - n10 - n10;
            n4 += n10;
            n10 = Integer.numberOfTrailingZeros(n3);
            n3 >>= n10;
        }
        n4 = Math.min(n7, n8);
        return n3 << n4;
    }

    public static boolean isPowerOfTwo(int n3) {
        int n4;
        boolean bl2 = false;
        boolean bl3 = n3 > 0;
        if ((n3 &= (n4 = n3 + -1)) == 0) {
            bl2 = true;
        }
        return bl3 & bl2;
    }

    public static boolean isPrime(int n3) {
        return LongMath.isPrime(n3);
    }

    public static int lessThanBranchFree(int n3, int n4) {
        return ~(~(n3 - n4)) >>> 31;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int log10(int n3, RoundingMode object) {
        String string2 = "x";
        MathPreconditions.checkPositive(string2, n3);
        int n4 = IntMath.log10Floor(n3);
        int[] nArray = powersOf10;
        int n7 = nArray[n4];
        int[] nArray2 = IntMath$1.$SwitchMap$java$math$RoundingMode;
        int n10 = ((Enum)object).ordinal();
        n10 = nArray2[n10];
        switch (n10) {
            default: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 6: 
            case 7: 
            case 8: {
                int[] nArray3 = halfPowersOf10;
                int n14 = nArray3[n4];
                n3 = IntMath.lessThanBranchFree(n14, n3);
                return n3 + n4;
            }
            case 4: 
            case 5: {
                n3 = IntMath.lessThanBranchFree(n7, n3);
                return n3 + n4;
            }
            case 1: {
                if (n3 == n7) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    Object var8_12 = null;
                }
                MathPreconditions.checkRoundingUnnecessary(n3 != 0);
            }
            case 2: 
            case 3: 
        }
        return n4;
    }

    private static int log10Floor(int n3) {
        byte[] byArray = maxLog10ForLeadingZeros;
        int n4 = Integer.numberOfLeadingZeros(n3);
        byte by2 = byArray[n4];
        n4 = powersOf10[by2];
        n3 = IntMath.lessThanBranchFree(n3, n4);
        return by2 - n3;
    }

    public static int log2(int n3, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", n3);
        int[] nArray = IntMath$1.$SwitchMap$java$math$RoundingMode;
        int n4 = roundingMode.ordinal();
        n4 = nArray[n4];
        switch (n4) {
            default: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 6: 
            case 7: 
            case 8: {
                n4 = Integer.numberOfLeadingZeros(n3);
                int n7 = -1257966797 >>> n4;
                n4 = 31 - n4;
                return IntMath.lessThanBranchFree(n7, n3) + n4;
            }
            case 4: 
            case 5: {
                n3 = Integer.numberOfLeadingZeros(n3 + -1);
                return 32 - n3;
            }
            case 1: {
                n4 = (int)(IntMath.isPowerOfTwo(n3) ? 1 : 0);
                MathPreconditions.checkRoundingUnnecessary(n4 != 0);
            }
            case 2: 
            case 3: 
        }
        n3 = Integer.numberOfLeadingZeros(n3);
        return 31 - n3;
    }

    public static int mean(int n3, int n4) {
        int n7 = n3 & n4;
        n3 = (n3 ^ n4) >> 1;
        return n7 + n3;
    }

    public static int mod(int n3, int n4) {
        if (n4 > 0) {
            if ((n3 %= n4) < 0) {
                n3 += n4;
            }
            return n3;
        }
        String string2 = Gj0.b(n4, "Modulus ", " must be > 0");
        ArithmeticException arithmeticException = new ArithmeticException(string2);
        throw arithmeticException;
    }

    public static int pow(int n3, int n4) {
        String string2 = "exponent";
        MathPreconditions.checkNonNegative(string2, n4);
        int n7 = -2;
        int n8 = 32;
        int n10 = 0;
        int n14 = 1;
        if (n3 != n7) {
            n7 = -1;
            if (n3 != n7) {
                if (n3 != 0) {
                    if (n3 != n14) {
                        n7 = 2;
                        if (n3 != n7) {
                            n7 = 1;
                            while (n4 != 0) {
                                if (n4 != n14) {
                                    n8 = n4 & 1;
                                    n8 = n8 == 0 ? 1 : n3;
                                    n7 *= n8;
                                    n3 *= n3;
                                    n4 >>= 1;
                                    continue;
                                }
                                return n3 * n7;
                            }
                            return n7;
                        }
                        if (n4 < n8) {
                            n10 = n14 << n4;
                        }
                        return n10;
                    }
                    return n14;
                }
                if (n4 == 0) {
                    n10 = 1;
                }
                return n10;
            }
            n3 = n4 & 1;
            if (n3 != 0) {
                n14 = -1;
            }
            return n14;
        }
        if (n4 < n8) {
            n3 = n4 & 1;
            n3 = n3 == 0 ? n14 << n4 : -(n14 << n4);
            return n3;
        }
        return 0;
    }

    public static int saturatedAdd(int n3, int n4) {
        long l2 = n3;
        long l3 = n4;
        return Ints.saturatedCast(l2 + l3);
    }

    public static int saturatedMultiply(int n3, int n4) {
        long l2 = n3;
        long l3 = n4;
        return Ints.saturatedCast(l2 * l3);
    }

    public static int saturatedPow(int n3, int n4) {
        String string2 = "exponent";
        MathPreconditions.checkNonNegative(string2, n4);
        int n7 = -2;
        int n8 = -1 >>> 1;
        int n10 = -1;
        int n14 = 1;
        if (n3 != n7) {
            if (n3 != n10) {
                n7 = 0;
                string2 = null;
                if (n3 != 0) {
                    if (n3 != n14) {
                        n10 = 2;
                        if (n3 != n10) {
                            n10 = n3 >>> 31;
                            int n15 = n4 & 1;
                            n10 = (n10 & n15) + n8;
                            n8 = 1;
                            while (n4 != 0) {
                                if (n4 != n14) {
                                    n15 = n4 & 1;
                                    if (n15 != 0) {
                                        n8 = IntMath.saturatedMultiply(n8, n3);
                                    }
                                    if ((n4 >>= 1) <= 0) continue;
                                    n15 = -46340;
                                    n15 = n15 > n3 ? 1 : 0;
                                    int n16 = 46340;
                                    if ((n15 |= (n16 = n3 > n16 ? 1 : 0)) != 0) {
                                        return n10;
                                    }
                                    n3 *= n3;
                                    continue;
                                }
                                return IntMath.saturatedMultiply(n8, n3);
                            }
                            return n8;
                        }
                        n3 = 31;
                        if (n4 >= n3) {
                            return n8;
                        }
                        return n14 << n4;
                    }
                    return n14;
                }
                if (n4 != 0) {
                    n14 = 0;
                }
                return n14;
            }
            n3 = n4 & 1;
            if (n3 == 0) {
                n10 = 1;
            }
            return n10;
        }
        n3 = 32;
        if (n4 >= n3) {
            return (n4 & 1) + n8;
        }
        n3 = n4 & 1;
        n3 = n3 == 0 ? n14 << n4 : n10 << n4;
        return n3;
    }

    public static int saturatedSubtract(int n3, int n4) {
        long l2 = n3;
        long l3 = n4;
        return Ints.saturatedCast(l2 - l3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int sqrt(int n3, RoundingMode roundingMode) {
        String string2 = "x";
        MathPreconditions.checkNonNegative(string2, n3);
        int n4 = IntMath.sqrtFloor(n3);
        int[] nArray = IntMath$1.$SwitchMap$java$math$RoundingMode;
        int n7 = roundingMode.ordinal();
        n7 = nArray[n7];
        switch (n7) {
            default: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 6: 
            case 7: 
            case 8: {
                n7 = n4 * n4 + n4;
                n3 = IntMath.lessThanBranchFree(n7, n3);
                return n3 + n4;
            }
            case 4: 
            case 5: {
                n7 = n4 * n4;
                n3 = IntMath.lessThanBranchFree(n7, n3);
                return n3 + n4;
            }
            case 1: {
                n7 = n4 * n4;
                if (n7 == n3) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    Object var6_7 = null;
                }
                MathPreconditions.checkRoundingUnnecessary(n3 != 0);
            }
            case 2: 
            case 3: 
        }
        return n4;
    }

    private static int sqrtFloor(int n3) {
        return (int)Math.sqrt(n3);
    }
}

