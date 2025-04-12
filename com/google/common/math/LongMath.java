/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.DoubleUtils;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath$1;
import com.google.common.math.LongMath$MillerRabinTester;
import com.google.common.math.MathPreconditions;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;

public final class LongMath {
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;
    static final long MAX_SIGNED_POWER_OF_TWO = 0x4000000000000000L;
    private static final int SIEVE_30 = -545925251;
    static final int[] biggestBinomials;
    static final int[] biggestSimpleBinomials;
    static final long[] factorials;
    static final long[] halfPowersOf10;
    static final byte[] maxLog10ForLeadingZeros;
    private static final long[][] millerRabinBaseSets;
    static final long[] powersOf10;

    static {
        long[] lArray;
        long[] lArray2;
        long[] lArray3;
        long[] lArray4;
        long[] lArray5;
        Object[] objectArray;
        Object[] objectArray2;
        int n3 = 19;
        int n4 = 7;
        int n7 = 6;
        int n8 = 5;
        int n10 = 4;
        int n14 = 3;
        int n15 = 2;
        byte[] byArray = objectArray2 = new byte[64];
        byte[] byArray2 = objectArray2;
        byArray[0] = 19;
        byArray2[1] = 18;
        byArray[2] = 18;
        byArray2[3] = 18;
        byArray[4] = 18;
        byArray2[5] = 17;
        byArray[6] = 17;
        byArray2[7] = 17;
        byArray[8] = 16;
        byArray2[9] = 16;
        byArray[10] = 16;
        byArray2[11] = 15;
        byArray[12] = 15;
        byArray2[13] = 15;
        byArray[14] = 15;
        byArray2[15] = 14;
        byArray[16] = 14;
        byArray2[17] = 14;
        byArray[18] = 13;
        byArray2[19] = 13;
        byArray[20] = 13;
        byArray2[21] = 12;
        byArray[22] = 12;
        byArray2[23] = 12;
        byArray[24] = 12;
        byArray2[25] = 11;
        byArray[26] = 11;
        byArray2[27] = 11;
        byArray[28] = 10;
        byArray2[29] = 10;
        byArray[30] = 10;
        byArray2[31] = 9;
        byArray[32] = 9;
        byArray2[33] = 9;
        byArray[34] = 9;
        byArray2[35] = 8;
        byArray[36] = 8;
        byArray2[37] = 8;
        byArray[38] = 7;
        byArray2[39] = 7;
        byArray[40] = 7;
        byArray2[41] = 6;
        byArray[42] = 6;
        byArray2[43] = 6;
        byArray[44] = 6;
        byArray2[45] = 5;
        byArray[46] = 5;
        byArray2[47] = 5;
        byArray[48] = 4;
        byArray2[49] = 4;
        byArray[50] = 4;
        byArray2[51] = 3;
        byArray[52] = 3;
        byArray2[53] = 3;
        byArray[54] = 3;
        byArray2[55] = 2;
        byArray[56] = 2;
        byArray2[57] = 2;
        byArray[58] = 1;
        byArray2[59] = 1;
        byArray[60] = 1;
        byArray2[61] = 0;
        byArray[62] = 0;
        byArray2[63] = 0;
        maxLog10ForLeadingZeros = objectArray2;
        Object[] objectArray3 = objectArray2 = (Object[])new long[n3];
        Object[] objectArray4 = objectArray2;
        objectArray3[0] = (byte)1L;
        objectArray4[1] = (byte)10;
        objectArray3[2] = (byte)100;
        objectArray4[3] = (byte)1000L;
        objectArray3[4] = (byte)10000L;
        objectArray4[5] = (byte)100000L;
        objectArray3[6] = (byte)1000000L;
        objectArray4[7] = (byte)10000000L;
        objectArray3[8] = (byte)100000000L;
        objectArray4[9] = (byte)1000000000L;
        objectArray3[10] = (byte)10000000000L;
        objectArray4[11] = (byte)100000000000L;
        objectArray3[12] = (byte)1000000000000L;
        objectArray4[13] = (byte)10000000000000L;
        objectArray3[14] = (byte)100000000000000L;
        objectArray4[15] = (byte)1000000000000000L;
        objectArray3[16] = (byte)10000000000000000L;
        objectArray4[17] = (byte)100000000000000000L;
        objectArray4[18] = (byte)1000000000000000000L;
        powersOf10 = objectArray2;
        long[] lArray6 = objectArray = new long[n3];
        long[] lArray7 = objectArray;
        lArray6[0] = 3;
        lArray7[1] = 31;
        lArray6[2] = 316L;
        lArray7[3] = 3162L;
        lArray6[4] = 31622L;
        lArray7[5] = 316227L;
        lArray6[6] = 3162277L;
        lArray7[7] = 31622776L;
        lArray6[8] = 316227766L;
        lArray7[9] = 3162277660L;
        lArray6[10] = 31622776601L;
        lArray7[11] = 316227766016L;
        lArray6[12] = 3162277660168L;
        lArray7[13] = 31622776601683L;
        lArray6[14] = 316227766016837L;
        lArray7[15] = 3162277660168379L;
        lArray6[16] = 31622776601683793L;
        lArray7[17] = 316227766016837933L;
        lArray7[18] = 3162277660168379331L;
        halfPowersOf10 = objectArray;
        long[] lArray8 = objectArray = new long[21];
        long[] lArray9 = objectArray;
        lArray8[0] = 1L;
        lArray9[1] = 1L;
        lArray8[2] = 2;
        lArray9[3] = 6;
        lArray8[4] = 24;
        lArray9[5] = 120;
        lArray8[6] = 720L;
        lArray9[7] = 5040L;
        lArray8[8] = 40320L;
        lArray9[9] = 362880L;
        lArray8[10] = 3628800L;
        lArray9[11] = 39916800L;
        lArray8[12] = 479001600L;
        lArray9[13] = 6227020800L;
        lArray8[14] = 87178291200L;
        lArray9[15] = 1307674368000L;
        lArray8[16] = 20922789888000L;
        lArray9[17] = 355687428096000L;
        lArray8[18] = 6402373705728000L;
        lArray9[19] = 121645100408832000L;
        lArray9[20] = 2432902008176640000L;
        factorials = objectArray;
        Object[] objectArray5 = objectArray = (Object[])new int[34];
        Object[] objectArray6 = objectArray;
        objectArray5[0] = -1 >>> 1;
        objectArray6[1] = -1 >>> 1;
        objectArray5[2] = -1 >>> 1;
        objectArray6[3] = 3810779;
        objectArray5[4] = 121977;
        objectArray6[5] = 16175;
        objectArray5[6] = 4337;
        objectArray6[7] = 1733;
        objectArray5[8] = 887;
        objectArray6[9] = 534;
        objectArray5[10] = 361;
        objectArray6[11] = 265;
        objectArray5[12] = 206;
        objectArray6[13] = 169;
        objectArray5[14] = 143;
        objectArray6[15] = 125;
        objectArray5[16] = 111;
        objectArray6[17] = 101;
        objectArray5[18] = 94;
        objectArray6[19] = 88;
        objectArray5[20] = 83;
        objectArray6[21] = 79;
        objectArray5[22] = 76;
        objectArray6[23] = 74;
        objectArray5[24] = 72;
        objectArray6[25] = 70;
        objectArray5[26] = 69;
        objectArray6[27] = 68;
        objectArray5[28] = 67;
        objectArray6[29] = 67;
        objectArray5[30] = 66;
        objectArray6[31] = 66;
        objectArray5[32] = 66;
        objectArray6[33] = 66;
        biggestBinomials = (int[])objectArray;
        Object[] objectArray7 = objectArray = (Object[])new int[31];
        Object[] objectArray8 = objectArray;
        objectArray7[0] = -1 >>> 1;
        objectArray8[1] = -1 >>> 1;
        objectArray7[2] = -1 >>> 1;
        objectArray8[3] = 2642246;
        objectArray7[4] = 86251;
        objectArray8[5] = 11724;
        objectArray7[6] = 3218;
        objectArray8[7] = 1313;
        objectArray7[8] = 684;
        objectArray8[9] = 419;
        objectArray7[10] = 287;
        objectArray8[11] = 214;
        objectArray7[12] = 169;
        objectArray8[13] = 139;
        objectArray7[14] = 119;
        objectArray8[15] = 105;
        objectArray7[16] = 95;
        objectArray8[17] = 87;
        objectArray7[18] = 81;
        objectArray8[19] = 76;
        objectArray7[20] = 73;
        objectArray8[21] = 70;
        objectArray7[22] = 68;
        objectArray8[23] = 66;
        objectArray7[24] = 64;
        objectArray8[25] = 63;
        objectArray7[26] = 62;
        objectArray8[27] = 62;
        objectArray7[28] = 61;
        objectArray8[29] = 61;
        objectArray8[30] = 61;
        biggestSimpleBinomials = (int[])objectArray;
        objectArray = new long[n15];
        objectArray[0] = 291830L;
        objectArray[1] = 126401071349994536L;
        Object[] objectArray9 = objectArray2 = (Object[])new long[n14];
        objectArray2[0] = (byte)885594168L;
        objectArray9[1] = (byte)725270293939359937L;
        objectArray9[2] = (byte)3569819667048198375L;
        long[] lArray10 = lArray5 = new long[n10];
        long[] lArray11 = lArray5;
        lArray10[0] = 273919523040L;
        lArray11[1] = 15;
        lArray10[2] = 7363882082L;
        lArray11[3] = 992620450144556L;
        long[] lArray12 = lArray4 = new long[n8];
        long[] lArray13 = lArray4;
        lArray12[0] = 47636622961200L;
        lArray13[1] = 2;
        lArray12[2] = 2570940L;
        lArray13[3] = 211991001L;
        lArray13[4] = 3749873356L;
        long[] lArray14 = lArray3 = new long[n7];
        long[] lArray15 = lArray3;
        lArray14[0] = 7999252175582850L;
        lArray15[1] = 2;
        lArray14[2] = 4130806001517L;
        lArray15[3] = 149795463772692060L;
        lArray14[4] = 186635894390467037L;
        lArray15[5] = 3967304179347715805L;
        long[] lArray16 = lArray2 = new long[n4];
        long[] lArray17 = lArray2;
        lArray16[0] = 585226005592931976L;
        lArray17[1] = 2;
        lArray16[2] = 123635709730000L;
        lArray17[3] = 9233062284813009L;
        lArray16[4] = 43835965440333360L;
        lArray17[5] = 761179012939631437L;
        lArray17[6] = 1263739024124850375L;
        long[] lArray18 = lArray = new long[8];
        long[] lArray19 = lArray;
        lArray18[0] = Long.MAX_VALUE;
        lArray19[1] = 2;
        lArray18[2] = 325L;
        lArray19[3] = 9375L;
        lArray18[4] = 28178L;
        lArray19[5] = 450775L;
        lArray18[6] = 9780504L;
        lArray19[7] = 1795265022L;
        long[][] lArrayArray = new long[n4][];
        lArrayArray[0] = objectArray;
        lArrayArray[1] = objectArray2;
        lArrayArray[n15] = lArray5;
        lArrayArray[n14] = lArray4;
        lArrayArray[n10] = lArray3;
        lArrayArray[n8] = lArray2;
        lArrayArray[n7] = lArray;
        millerRabinBaseSets = lArrayArray;
    }

    private LongMath() {
    }

    public static long binomial(int n3, int n4) {
        MathPreconditions.checkNonNegative("n", n3);
        Object object = "k";
        MathPreconditions.checkNonNegative((String)object, n4);
        Object object2 = 1;
        int n7 = n4 <= n3 ? 1 : 0;
        String string2 = "k (%s) > n (%s)";
        Preconditions.checkArgument(n7 != 0, string2, n4, n3);
        n7 = n3 >> 1;
        if (n4 > n7) {
            n4 = n3 - n4;
        }
        long l2 = 1L;
        if (n4 != 0) {
            if (n4 != object2) {
                object = factorials;
                int n8 = ((Object)object).length;
                if (n3 < n8) {
                    l2 = (long)object[n3];
                    reference var9_8 = object[n4];
                    Object object3 = object[n3 -= n4];
                    return l2 / (var9_8 *= object3);
                }
                object = biggestBinomials;
                n8 = ((Object)object).length;
                if (n4 < n8 && n3 <= (object2 = (Object)object[n4])) {
                    object = biggestSimpleBinomials;
                    n8 = ((Object)object).length;
                    if (n4 < n8 && n3 <= (object2 = (Object)object[n4])) {
                        object2 = n3 + -1;
                        l2 = n3;
                        for (int i3 = 2; i3 <= n4; ++i3) {
                            long l3 = object2;
                            l2 *= l3;
                            l3 = i3;
                            l2 /= l3;
                            object2 += -1;
                        }
                        return l2;
                    }
                    long l4 = n3;
                    object = RoundingMode.CEILING;
                    object2 = LongMath.log2(l4, (RoundingMode)((Object)object));
                    n3 += -1;
                    Object object4 = object2;
                    long l7 = l4;
                    int n10 = 2;
                    l4 = l2;
                    while (n10 <= n4) {
                        Object object5 = 63;
                        if ((object4 += object2) < object5) {
                            long l8 = n3;
                            l7 *= l8;
                            l8 = n10;
                            l4 *= l8;
                        } else {
                            l2 = LongMath.multiplyFraction(l2, l7, l4);
                            l7 = n3;
                            l4 = n10;
                            object4 = object2;
                        }
                        ++n10;
                        n3 += -1;
                    }
                    return LongMath.multiplyFraction(l2, l7, l4);
                }
                return Long.MAX_VALUE;
            }
            return n3;
        }
        return l2;
    }

    public static long ceilingPowerOfTwo(long l2) {
        Object object = "x";
        MathPreconditions.checkPositive((String)object, l2);
        long l3 = 0x4000000000000000L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 <= 0) {
            l3 = 1L;
            int n3 = -Long.numberOfLeadingZeros(l2 - l3);
            return l3 << n3;
        }
        String string2 = Ov2.a(l2, "ceilingPowerOfTwo(", ") is not representable as a long");
        object = new ArithmeticException(string2);
        throw object;
    }

    public static long checkedAdd(long l2, long l3) {
        long l4 = l2 + l3;
        long l7 = l2 ^ l3;
        boolean bl2 = false;
        long l8 = 0L;
        long l12 = l7 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        boolean bl3 = object < 0;
        long l14 = l2 ^ l4;
        long l15 = l14 - l8;
        Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object2 >= 0) {
            bl2 = true;
        }
        MathPreconditions.checkNoOverflow(bl3 | bl2, "checkedAdd", l2, l3);
        return l4;
    }

    public static long checkedMultiply(long l2, long l3) {
        long l4;
        long l7;
        long l8 = l2;
        long l12 = l3;
        int n3 = Long.numberOfLeadingZeros(l2);
        int n4 = Long.numberOfLeadingZeros(l2 ^ (long)-1) + n3;
        n3 = Long.numberOfLeadingZeros(l3) + n4;
        long l14 = l3 ^ (long)-1;
        n4 = Long.numberOfLeadingZeros(l14) + n3;
        if (n4 > (n3 = 65)) {
            return l2 * l3;
        }
        n3 = 64;
        n3 = n4 >= n3 ? 1 : 0;
        String string2 = "checkedMultiply";
        MathPreconditions.checkNoOverflow(n3 != 0, string2, l2, l3);
        long l15 = 0L;
        long l16 = l8 == l15 ? 0 : (l8 < l15 ? -1 : 1);
        n3 = l16 >= 0 ? 1 : 0;
        l14 = Long.MIN_VALUE;
        long l17 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1);
        if (l17 != false) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        string2 = "checkedMultiply";
        MathPreconditions.checkNoOverflow((n3 |= n4) != 0, string2, l2, l3);
        long l18 = l8 * l12;
        n3 = l16 != false && (l7 = (l4 = (l15 = l18 / l8) - l12) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false ? 0 : 1;
        MathPreconditions.checkNoOverflow(n3 != 0, "checkedMultiply", l2, l3);
        return l18;
    }

    public static long checkedPow(long l2, int n3) {
        String string2;
        int n4;
        Object object = "exponent";
        MathPreconditions.checkNonNegative((String)object, n3);
        long l3 = -2;
        int n7 = 1;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        long l7 = 2;
        long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (l8 <= 0) {
            l8 = 1;
        } else {
            l8 = 0;
            string2 = null;
        }
        l7 = 1L;
        if ((n4 &= l8) != 0) {
            n4 = (int)l2;
            l8 = -2;
            long l12 = -1;
            if (n4 != l8) {
                l8 = -1;
                if (n4 != l8) {
                    if (n4 != 0) {
                        if (n4 != n7) {
                            l8 = 2;
                            if (n4 == l8) {
                                n4 = 63;
                                if (n3 < n4) {
                                    n4 = 1;
                                } else {
                                    n4 = 0;
                                    object = null;
                                }
                                long l14 = n3;
                                long l15 = l2;
                                MathPreconditions.checkNoOverflow(n4 != 0, "checkedPow", l2, l14);
                                return l7 << n3;
                            }
                            object = new AssertionError();
                            throw object;
                        }
                        return l7;
                    }
                    if (n3 != 0) {
                        l7 = 0L;
                    }
                    return l7;
                }
                n4 = n3 & 1;
                if (n4 != 0) {
                    l7 = l12;
                }
                return l7;
            }
            n4 = 64;
            if (n3 < n4) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            string2 = "checkedPow";
            long l16 = n3;
            long l17 = l2;
            MathPreconditions.checkNoOverflow(n4 != 0, string2, l2, l16);
            n4 = n3 & 1;
            l3 = n4 == 0 ? l7 << n3 : l12 << n3;
            return l3;
        }
        long l18 = l2;
        int n8 = n3;
        while (n8 != 0) {
            if (n8 != n7) {
                n4 = n8 & 1;
                l3 = n4 != 0 ? LongMath.checkedMultiply(l7, l18) : l7;
                int n10 = n8 >> 1;
                if (n10 > 0) {
                    long l19;
                    long l20 = -3037000499L;
                    long l21 = l20 - l18;
                    Object object2 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                    n8 = object2 <= 0 && (object2 = (l19 = l18 - (l20 = 3037000499L)) == 0L ? 0 : (l19 < 0L ? -1 : 1)) <= 0 ? 1 : 0;
                    String string3 = "checkedPow";
                    long l22 = n10;
                    MathPreconditions.checkNoOverflow(n8 != 0, string3, l18, l22);
                    l18 *= l18;
                }
                l7 = l3;
                n8 = n10;
                continue;
            }
            return LongMath.checkedMultiply(l7, l18);
        }
        return l7;
    }

    public static long checkedSubtract(long l2, long l3) {
        long l4 = l2 - l3;
        long l7 = l2 ^ l3;
        boolean bl2 = false;
        long l8 = 0L;
        long l12 = l7 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        boolean bl3 = object >= 0;
        long l14 = l2 ^ l4;
        long l15 = l14 - l8;
        Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object2 >= 0) {
            bl2 = true;
        }
        MathPreconditions.checkNoOverflow(bl3 | bl2, "checkedSubtract", l2, l3);
        return l4;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static long divide(long l2, long l3, RoundingMode roundingMode) {
        Preconditions.checkNotNull((Object)roundingMode);
        long l4 = l2 / l3;
        long l7 = l3 * l4;
        l7 = l2 - l7;
        long l8 = 0L;
        long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (l12 == false) {
            return l4;
        }
        l2 = (l2 ^ l3) >> 63;
        int n3 = (int)l2;
        int n4 = 1;
        n3 |= n4;
        int[] nArray = LongMath$1.$SwitchMap$java$math$RoundingMode;
        int n7 = roundingMode.ordinal();
        int n8 = nArray[n7];
        int n10 = 0;
        block8: do {
            switch (n10 == 0 ? n8 : n10) {
                default: {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                case 6: 
                case 7: 
                case 8: {
                    l7 = Math.abs(l7);
                    l3 = Math.abs(l3) - l7;
                    long l14 = (l7 -= l3) - l8;
                    n4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (n4 == 0) {
                        n10 = 4;
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        if (roundingMode == roundingMode2) continue block8;
                        roundingMode2 = RoundingMode.HALF_EVEN;
                        if (roundingMode != roundingMode2) return l4;
                        l3 = 1L & l4;
                        long l15 = l3 - l8;
                        n4 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                        if (n4 == 0) return l4;
                        n10 = 4;
                        continue block8;
                    }
                    if (n4 <= 0) return l4;
                    n10 = 4;
                    continue block8;
                }
                case 5: {
                    if (n3 <= 0) return l4;
                    n10 = 4;
                    continue block8;
                }
                case 3: {
                    if (n3 >= 0) return l4;
                }
                case 4: {
                    l2 = n3;
                    return l4 += l2;
                }
                case 1: {
                    if (l12 != false) {
                        n4 = 0;
                        Object var17_14 = null;
                    }
                    MathPreconditions.checkRoundingUnnecessary(n4 != 0);
                    return l4;
                }
                case 2: 
            }
            return l4;
        } while (true);
        return l4;
    }

    public static long factorial(int n3) {
        MathPreconditions.checkNonNegative("n", n3);
        long[] lArray = factorials;
        int n4 = lArray.length;
        long l2 = n3 < n4 ? lArray[n3] : Long.MAX_VALUE;
        return l2;
    }

    public static boolean fitsInInt(long l2) {
        int n3 = (int)l2;
        long l3 = n3;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static long floorPowerOfTwo(long l2) {
        MathPreconditions.checkPositive("x", l2);
        int n3 = Long.numberOfLeadingZeros(l2);
        n3 = 63 - n3;
        return 1L << n3;
    }

    public static long gcd(long l2, long l3) {
        MathPreconditions.checkNonNegative("a", l2);
        String string2 = "b";
        MathPreconditions.checkNonNegative(string2, l3);
        long l4 = 0L;
        Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object == false) {
            return l3;
        }
        object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object == false) {
            return l2;
        }
        int n3 = Long.numberOfTrailingZeros(l2);
        l2 >>= n3;
        int n4 = Long.numberOfTrailingZeros(l3);
        l3 >>= n4;
        while ((object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) != false) {
            long l7 = (l2 -= l3) >> 63 & l2;
            l2 = l2 - l7 - l7;
            l3 += l7;
            object = Long.numberOfTrailingZeros(l2);
            l2 >>= object;
        }
        int n7 = Math.min(n3, n4);
        return l2 << n7;
    }

    public static boolean isPowerOfTwo(long l2) {
        long l3;
        long l4;
        long l7;
        int n3 = 0;
        long l8 = 0L;
        long l12 = l2 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        object = object > 0 ? (Object)1 : (Object)0;
        if ((l7 = (l4 = (l2 &= (l3 = l2 - 1L)) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            n3 = 1;
        }
        return (object & n3) != 0;
    }

    public static boolean isPrime(long l2) {
        long l3;
        long l4;
        long l7 = 2;
        boolean bl2 = false;
        Object object = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (object < 0) {
            MathPreconditions.checkNonNegative("n", l2);
            return false;
        }
        l7 = 66;
        long l8 = 0L;
        int n3 = 1;
        Object object2 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (object2 < 0) {
            int n4 = (int)l2 + -2;
            l2 = 722865708377213483L >> n4;
            l7 = 1L;
            long l12 = (l2 &= l7) - l8;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 != false) {
                bl2 = true;
            }
            return bl2;
        }
        l7 = l2 % (long)30;
        int n7 = (int)l7;
        int n8 = n3 << n7;
        n7 = -545925251;
        if ((n8 &= n7) != 0) {
            return false;
        }
        l7 = l2 % (long)7;
        long l14 = l7 - l8;
        object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object2 != false && (object2 = (l4 = (l7 = l2 % (long)11) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false && (object2 = (l3 = (l7 = l2 % (long)13) - l8) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            l7 = 289L;
            long l15 = l2 - l7;
            object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object < 0) {
                return n3 != 0;
            }
            long[][] lArray = millerRabinBaseSets;
            n7 = lArray.length;
            for (object = (Object)0; object < n7; ++object) {
                long[] lArray2 = lArray[object];
                long l16 = lArray2[0];
                long l17 = l2 - l16;
                Object object4 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                if (object4 > 0) continue;
                for (n8 = 1; n8 < (n7 = lArray2.length); ++n8) {
                    l16 = lArray2[n8];
                    n7 = (int)(LongMath$MillerRabinTester.test(l16, l2) ? 1 : 0);
                    if (n7 != 0) continue;
                    return false;
                }
                return n3 != 0;
            }
            AssertionError assertionError = new AssertionError();
            throw assertionError;
        }
        return false;
    }

    public static int lessThanBranchFree(long l2, long l3) {
        return (int)((l2 - l3 ^ (long)-1 ^ (long)-1) >>> 63);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int log10(long l2, RoundingMode object) {
        String string2 = "x";
        MathPreconditions.checkPositive(string2, l2);
        int n3 = LongMath.log10Floor(l2);
        long l3 = powersOf10[n3];
        int[] nArray = LongMath$1.$SwitchMap$java$math$RoundingMode;
        int n4 = ((Enum)object).ordinal();
        n4 = nArray[n4];
        switch (n4) {
            default: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 6: 
            case 7: 
            case 8: {
                long[] lArray = halfPowersOf10;
                long l4 = lArray[n3];
                int n7 = LongMath.lessThanBranchFree(l4, l2);
                return n7 + n3;
            }
            case 4: 
            case 5: {
                int n7 = LongMath.lessThanBranchFree(l3, l2);
                return n7 + n3;
            }
            case 1: {
                boolean bl2;
                n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                if (n4 == 0) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    Object var9_9 = null;
                }
                MathPreconditions.checkRoundingUnnecessary(bl2);
            }
            case 2: 
            case 3: 
        }
        return n3;
    }

    public static int log10Floor(long l2) {
        byte[] byArray = maxLog10ForLeadingZeros;
        int n3 = Long.numberOfLeadingZeros(l2);
        byte by2 = byArray[n3];
        long l3 = powersOf10[by2];
        int n4 = LongMath.lessThanBranchFree(l2, l3);
        return by2 - n4;
    }

    public static int log2(long l2, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", l2);
        int[] nArray = LongMath$1.$SwitchMap$java$math$RoundingMode;
        int n3 = roundingMode.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                AssertionError assertionError = new AssertionError((Object)"impossible");
                throw assertionError;
            }
            case 6: 
            case 7: 
            case 8: {
                n3 = Long.numberOfLeadingZeros(l2);
                long l3 = -5402926248376769404L >>> n3;
                n3 = 63 - n3;
                return LongMath.lessThanBranchFree(l3, l2) + n3;
            }
            case 4: 
            case 5: {
                int n4 = Long.numberOfLeadingZeros(l2 - 1L);
                return 64 - n4;
            }
            case 1: {
                n3 = (int)(LongMath.isPowerOfTwo(l2) ? 1 : 0);
                MathPreconditions.checkRoundingUnnecessary(n3 != 0);
            }
            case 2: 
            case 3: 
        }
        int n7 = Long.numberOfLeadingZeros(l2);
        return 63 - n7;
    }

    public static long mean(long l2, long l3) {
        long l4 = l2 & l3;
        l2 = (l2 ^ l3) >> 1;
        return l4 + l2;
    }

    public static int mod(long l2, int n3) {
        long l3 = n3;
        return (int)LongMath.mod(l2, l3);
    }

    public static long mod(long l2, long l3) {
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            long l8 = (l2 %= l3) - l4;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object < 0) {
                l2 += l3;
            }
            return l2;
        }
        ArithmeticException arithmeticException = new ArithmeticException("Modulus must be positive");
        throw arithmeticException;
    }

    public static long multiplyFraction(long l2, long l3, long l4) {
        long l7 = 1L;
        long l8 = l2 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return l3 / l4;
        }
        l7 = LongMath.gcd(l2, l4);
        return l3 / (l4 /= l7) * (l2 /= l7);
    }

    public static long pow(long l2, int n3) {
        long l3;
        String string2 = "exponent";
        MathPreconditions.checkNonNegative(string2, n3);
        long l4 = -2;
        int n4 = 1;
        long l7 = 1L;
        double d2 = Double.MIN_VALUE;
        long l8 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        if (l8 <= 0 && (l8 = (l3 = l2 - (l4 = (long)2)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
            int n7 = (int)l2;
            int n8 = -2;
            int n10 = 64;
            long l12 = 0L;
            double d5 = 0.0;
            if (n7 != n8) {
                n8 = -1;
                if (n7 != n8) {
                    if (n7 != 0) {
                        if (n7 != n4) {
                            n8 = 2;
                            if (n7 == n8) {
                                if (n3 < n10) {
                                    l12 = l7 << n3;
                                }
                                return l12;
                            }
                            AssertionError assertionError = new AssertionError();
                            throw assertionError;
                        }
                        return l7;
                    }
                    if (n3 != 0) {
                        l7 = l12;
                        d2 = d5;
                    }
                    return l7;
                }
                n8 = n3 & 1;
                if (n8 != 0) {
                    l7 = -1;
                    d2 = 0.0 / 0.0;
                }
                return l7;
            }
            if (n3 < n10) {
                n8 = n3 & 1;
                l2 = n8 == 0 ? l7 << n3 : -(l7 << n3);
                return l2;
            }
            return l12;
        }
        l4 = l7;
        while (n3 != 0) {
            if (n3 != n4) {
                long l14;
                l8 = n3 & 1;
                if (l8 == false) {
                    l14 = l7;
                    double d7 = d2;
                } else {
                    l14 = l2;
                }
                l4 *= l14;
                l2 *= l2;
                n3 >>= 1;
                continue;
            }
            l4 *= l2;
            break;
        }
        return l4;
    }

    public static double roundToDouble(long l2, RoundingMode roundingMode) {
        boolean bl2;
        long l3 = l2;
        double d2 = l2;
        long l4 = (long)d2;
        long l7 = Long.MAX_VALUE;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        object = object == false ? (Object)-1 : (Object)Longs.compare(l2, l4);
        int[] nArray = LongMath$1.$SwitchMap$java$math$RoundingMode;
        int n3 = roundingMode.ordinal();
        n3 = nArray[n3];
        String string2 = "impossible";
        switch (n3) {
            default: {
                AssertionError assertionError = new AssertionError((Object)string2);
                throw assertionError;
            }
            case 6: 
            case 7: 
            case 8: {
                long l12;
                double d5;
                if (object >= 0) {
                    d5 = Math.nextUp(d2);
                    double d7 = Math.ceil(d5);
                    l12 = (long)d7;
                } else {
                    double d9 = DoubleUtils.nextDown(d2);
                    long l14 = (long)Math.floor(d9);
                    long l15 = l4;
                    l4 = l14;
                    d5 = d2;
                    d2 = d9;
                    l12 = l15;
                }
                l4 = l3 - l4;
                long l16 = l12 - l3;
                long l17 = 1L;
                object = l12 == l7 ? 0 : (l12 < l7 ? -1 : 1);
                if (object == false) {
                    l16 += l17;
                }
                l7 = l16;
                int n4 = Longs.compare(l4, l16);
                if (n4 < 0) {
                    return d2;
                }
                if (n4 > 0) {
                    return d5;
                }
                n4 = roundingMode.ordinal();
                int n7 = 6;
                if ((n4 = nArray[n4]) != n7) {
                    n7 = 7;
                    if (n4 != n7) {
                        int n8 = 8;
                        if (n4 == n8) {
                            l3 = DoubleUtils.getSignificand(d2) & l17;
                            long l18 = l3 - (l4 = 0L);
                            Object object2 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                            if (object2 != false) {
                                d2 = d5;
                            }
                            return d2;
                        }
                        AssertionError assertionError = new AssertionError((Object)string2);
                        throw assertionError;
                    }
                    l4 = 0L;
                    long l19 = l3 - l4;
                    Object object3 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                    if (object3 >= 0) {
                        d2 = d5;
                    }
                    return d2;
                }
                l4 = 0L;
                long l20 = l3 - l4;
                Object object4 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                if (object4 < 0) {
                    d2 = d5;
                }
                return d2;
            }
            case 5: {
                if (object > 0) {
                    d2 = Math.nextUp(d2);
                }
                return d2;
            }
            case 4: {
                l4 = 0L;
                long l21 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l21 >= 0) {
                    if (object > 0) {
                        d2 = Math.nextUp(d2);
                    }
                    return d2;
                }
                if (object < 0) {
                    d2 = DoubleUtils.nextDown(d2);
                }
                return d2;
            }
            case 3: {
                if (object < 0) {
                    d2 = DoubleUtils.nextDown(d2);
                }
                return d2;
            }
            case 2: {
                l4 = 0L;
                long l22 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l22 >= 0) {
                    if (object < 0) {
                        d2 = DoubleUtils.nextDown(d2);
                    }
                    return d2;
                }
                if (object > 0) {
                    d2 = Math.nextUp(d2);
                }
                return d2;
            }
            case 1: 
        }
        if (object == false) {
            bl2 = true;
        } else {
            bl2 = false;
            Object var15_12 = null;
        }
        MathPreconditions.checkRoundingUnnecessary(bl2);
        return d2;
    }

    public static long saturatedAdd(long l2, long l3) {
        boolean bl2;
        long l4 = l2 + l3;
        boolean bl3 = false;
        long l7 = 0L;
        long l8 = (l3 ^= l2) - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        boolean bl4 = object < 0;
        long l12 = (l2 ^= l4) - l7;
        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 >= 0) {
            bl3 = true;
        }
        if (bl2 = bl4 | bl3) {
            return l4;
        }
        return (l4 >>> 63 ^ 1L) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long l2, long l3) {
        long l4;
        int n3 = Long.numberOfLeadingZeros(l2);
        int n4 = Long.numberOfLeadingZeros(l2 ^ (long)-1) + n3;
        n3 = Long.numberOfLeadingZeros(l3) + n4;
        long l7 = l3 ^ (long)-1;
        n4 = Long.numberOfLeadingZeros(l7) + n3;
        if (n4 > (n3 = 65)) {
            return l2 * l3;
        }
        long l8 = (l2 ^ l3) >>> 63;
        long l12 = Long.MAX_VALUE;
        l8 += l12;
        n3 = 64;
        int n7 = 0;
        n3 = n4 < n3 ? 1 : 0;
        long l14 = 0L;
        n4 = (int)(l2 == l14 ? 0 : (l2 < l14 ? -1 : 1));
        int n8 = n4 < 0 ? 1 : 0;
        long l15 = Long.MIN_VALUE;
        long l16 = l3 - l15;
        Object object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object == false) {
            n7 = 1;
        }
        if ((n3 |= (n7 &= n8)) != 0) {
            return l8;
        }
        l12 = l2 * l3;
        if (n4 != 0 && (n3 = (int)((l4 = (l2 = l12 / l2) - l3) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0) {
            return l8;
        }
        return l12;
    }

    public static long saturatedPow(long l2, int n3) {
        int n4;
        String string2 = "exponent";
        MathPreconditions.checkNonNegative(string2, n3);
        long l3 = -2;
        int n7 = 1;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        long l7 = 2;
        long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        l8 = l8 <= 0 ? (long)1 : (long)0;
        n4 &= l8;
        l8 = 63;
        l7 = Long.MAX_VALUE;
        long l12 = 1L;
        if (n4 != 0) {
            int n8 = (int)l2;
            int n10 = -2;
            long l14 = -1;
            if (n8 != n10) {
                n10 = -1;
                if (n8 != n10) {
                    if (n8 != 0) {
                        if (n8 != n7) {
                            n10 = 2;
                            if (n8 == n10) {
                                if (n3 >= l8) {
                                    return l7;
                                }
                                return l12 << n3;
                            }
                            AssertionError assertionError = new AssertionError();
                            throw assertionError;
                        }
                        return l12;
                    }
                    if (n3 != 0) {
                        l12 = 0L;
                    }
                    return l12;
                }
                n10 = n3 & 1;
                if (n10 != 0) {
                    l12 = l14;
                }
                return l12;
            }
            n10 = 64;
            if (n3 >= n10) {
                return (long)(n3 & 1) + l7;
            }
            n10 = n3 & 1;
            l2 = n10 == 0 ? l12 << n3 : l14 << n3;
            return l2;
        }
        l3 = l2 >>> l8;
        int n14 = n3 & 1;
        long l15 = n14;
        l3 = (l3 & l15) + l7;
        while (n3 != 0) {
            if (n3 != n7) {
                l4 = n3 & 1;
                if (l4 != false) {
                    l12 = l7 = LongMath.saturatedMultiply(l12, l2);
                }
                if ((n3 >>= 1) <= 0) continue;
                l7 = -3037000499L;
                long l16 = l7 - l2;
                n14 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                l4 = n14 > 0 ? (long)1 : (long)0;
                l15 = 3037000499L;
                long l17 = l2 == l15 ? 0 : (l2 < l15 ? -1 : 1);
                if ((l4 = (long)(l4 | (l17 = l17 > 0 ? (long)1 : (long)0))) != false) {
                    return l3;
                }
                l2 *= l2;
                continue;
            }
            return LongMath.saturatedMultiply(l12, l2);
        }
        return l12;
    }

    public static long saturatedSubtract(long l2, long l3) {
        boolean bl2;
        long l4 = l2 - l3;
        boolean bl3 = false;
        long l7 = 0L;
        long l8 = (l3 ^= l2) - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        boolean bl4 = object >= 0;
        long l12 = (l2 ^= l4) - l7;
        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 >= 0) {
            bl3 = true;
        }
        if (bl2 = bl4 | bl3) {
            return l4;
        }
        return (l4 >>> 63 ^ 1L) + Long.MAX_VALUE;
    }

    public static long sqrt(long l2, RoundingMode roundingMode) {
        String string2 = "x";
        MathPreconditions.checkNonNegative(string2, l2);
        boolean bl2 = LongMath.fitsInInt(l2);
        if (bl2) {
            return IntMath.sqrt((int)l2, roundingMode);
        }
        double d2 = Math.sqrt(l2);
        long l3 = (long)d2;
        long l4 = l3 * l3;
        int[] nArray = LongMath$1.$SwitchMap$java$math$RoundingMode;
        int n3 = roundingMode.ordinal();
        n3 = nArray[n3];
        long l7 = 1L;
        boolean bl3 = false;
        switch (n3) {
            default: {
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            case 6: 
            case 7: 
            case 8: {
                n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
                if (n3 < 0) {
                    bl3 = true;
                }
                l4 = (long)bl3;
                l2 = LongMath.lessThanBranchFree((l3 -= l4) * l3 + l3, l2);
                return l3 + l2;
            }
            case 4: 
            case 5: {
                n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
                if (n3 > 0) {
                    l3 += l7;
                }
                return l3;
            }
            case 2: 
            case 3: {
                n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
                if (n3 < 0) {
                    l3 -= l7;
                }
                return l3;
            }
            case 1: 
        }
        n3 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
        if (n3 == 0) {
            bl3 = true;
        }
        MathPreconditions.checkRoundingUnnecessary(bl3);
        return l3;
    }
}

