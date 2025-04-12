/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.BigIntegerMath$1;
import com.google.common.math.BigIntegerMath$BigIntegerToDoubleRounder;
import com.google.common.math.DoubleMath;
import com.google.common.math.DoubleUtils;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.common.math.MathPreconditions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public final class BigIntegerMath {
    private static final double LN_10 = 0.0;
    private static final double LN_2 = 0.0;
    static final BigInteger SQRT2_PRECOMPUTED_BITS;
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;

    static {
        BigInteger bigInteger;
        SQRT2_PRECOMPUTED_BITS = bigInteger = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
        LN_10 = Math.log(10.0);
        LN_2 = Math.log(2.0);
    }

    private BigIntegerMath() {
    }

    public static BigInteger binomial(int n3, int n4) {
        int n7;
        Object object;
        int n8;
        MathPreconditions.checkNonNegative("n", n3);
        String string2 = "k";
        MathPreconditions.checkNonNegative(string2, n4);
        int n10 = 1;
        if (n4 <= n3) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        Object object2 = "k (%s) > n (%s)";
        Preconditions.checkArgument(n8 != 0, (String)object2, n4, n3);
        n8 = n3 >> 1;
        if (n4 > n8) {
            n4 = n3 - n4;
        }
        if (n4 < (n7 = ((int[])(object = LongMath.biggestBinomials)).length) && n3 <= (n8 = object[n4])) {
            return BigInteger.valueOf(LongMath.binomial(n3, n4));
        }
        object = BigInteger.ONE;
        long l2 = n3;
        RoundingMode roundingMode = RoundingMode.CEILING;
        int n14 = LongMath.log2(l2, roundingMode);
        long l3 = 1L;
        block0: while (true) {
            int n15 = n14;
            while (n10 < n4) {
                int n16 = n3 - n10;
                ++n10;
                int n17 = 63;
                if ((n15 += n14) >= n17) {
                    object2 = BigInteger.valueOf(l2);
                    object = ((BigInteger)object).multiply((BigInteger)object2);
                    object2 = BigInteger.valueOf(l3);
                    object = ((BigInteger)object).divide((BigInteger)object2);
                    l2 = n16;
                    l3 = n10;
                    continue block0;
                }
                long l4 = n16;
                l2 *= l4;
                l4 = n10;
                l3 *= l4;
            }
            break;
        }
        BigInteger bigInteger = BigInteger.valueOf(l2);
        bigInteger = ((BigInteger)object).multiply(bigInteger);
        BigInteger bigInteger2 = BigInteger.valueOf(l3);
        return bigInteger.divide(bigInteger2);
    }

    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
        BigInteger bigInteger2 = BigInteger.ZERO;
        RoundingMode roundingMode = RoundingMode.CEILING;
        int n3 = BigIntegerMath.log2(bigInteger, roundingMode);
        return bigInteger2.setBit(n3);
    }

    public static BigInteger divide(BigInteger number, BigInteger bigInteger, RoundingMode roundingMode) {
        BigDecimal bigDecimal = new BigDecimal((BigInteger)number);
        number = new BigDecimal(bigInteger);
        return bigDecimal.divide((BigDecimal)number, 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger factorial(int n3) {
        long l2;
        int n4 = n3;
        MathPreconditions.checkNonNegative("n", n3);
        long[] lArray = LongMath.factorials;
        int n7 = lArray.length;
        if (n3 < n7) {
            return BigInteger.valueOf(lArray[n3]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        int n8 = IntMath.log2(n3, roundingMode) * n3;
        int n10 = 64;
        n7 = IntMath.divide(n8, n10, roundingMode);
        ArrayList<BigInteger> arrayList = new ArrayList<BigInteger>(n7);
        n7 = lArray.length;
        int n14 = n7 + -1;
        long l3 = lArray[n14];
        int n15 = Long.numberOfTrailingZeros(l3);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int n16 = LongMath.log2(l3 >>= n15, roundingMode2);
        int n17 = 1;
        n16 += n17;
        long l4 = n7;
        n7 = LongMath.log2(l4, roundingMode2);
        int n18 = n7 + 1;
        n7 = n17 << n7;
        while (true) {
            long l7 = n4;
            l2 = 1L;
            Object object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (object > 0) break;
            l7 = (long)n7 & l4;
            long l8 = 0L;
            long l12 = l7 - l8;
            Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 != false) {
                n7 <<= 1;
                ++n18;
            }
            int n19 = Long.numberOfTrailingZeros(l4);
            l8 = l4 >> n19;
            n15 += n19;
            if ((n19 = n18 - n19 + n16) >= n10) {
                BigInteger bigInteger = BigInteger.valueOf(l3);
                arrayList.add(bigInteger);
                l3 = l2;
            }
            RoundingMode roundingMode3 = RoundingMode.FLOOR;
            n16 = LongMath.log2(l3 *= l8, roundingMode3) + n17;
            l4 += l2;
        }
        n4 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
        if (n4 > 0) {
            BigInteger bigInteger = BigInteger.valueOf(l3);
            arrayList.add(bigInteger);
        }
        return BigIntegerMath.listProduct(arrayList).shiftLeft(n15);
    }

    public static boolean fitsInLong(BigInteger bigInteger) {
        int n3;
        int n4 = bigInteger.bitLength();
        if (n4 <= (n3 = 63)) {
            n4 = 1;
        } else {
            n4 = 0;
            bigInteger = null;
        }
        return n4 != 0;
    }

    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
        BigInteger bigInteger2 = BigInteger.ZERO;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int n3 = BigIntegerMath.log2(bigInteger, roundingMode);
        return bigInteger2.setBit(n3);
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
        int n3;
        block3: {
            block2: {
                Preconditions.checkNotNull(bigInteger);
                int n4 = bigInteger.signum();
                if (n4 <= 0) break block2;
                n4 = bigInteger.getLowestSetBit();
                int n7 = bigInteger.bitLength();
                n3 = 1;
                if (n4 == (n7 -= n3)) break block3;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public static BigInteger listProduct(List list) {
        int n3 = list.size();
        return BigIntegerMath.listProduct(list, 0, n3);
    }

    public static BigInteger listProduct(List object, int n3, int n4) {
        int n7 = n4 - n3;
        if (n7 != 0) {
            int n8 = 1;
            if (n7 != n8) {
                int n10 = 2;
                if (n7 != n10) {
                    int n14 = 3;
                    if (n7 != n14) {
                        n7 = n4 + n3 >>> n8;
                        BigInteger bigInteger = BigIntegerMath.listProduct((List)object, n3, n7);
                        object = BigIntegerMath.listProduct((List)object, n7, n4);
                        return bigInteger.multiply((BigInteger)object);
                    }
                    BigInteger bigInteger = (BigInteger)object.get(n3);
                    n7 = n3 + 1;
                    BigInteger bigInteger2 = (BigInteger)object.get(n7);
                    bigInteger = bigInteger.multiply(bigInteger2);
                    object = (BigInteger)object.get(n3 += n10);
                    return bigInteger.multiply((BigInteger)object);
                }
                BigInteger bigInteger = (BigInteger)object.get(n3);
                object = (BigInteger)object.get(n3 += n8);
                return bigInteger.multiply((BigInteger)object);
            }
            return (BigInteger)object.get(n3);
        }
        return BigInteger.ONE;
    }

    public static int log10(BigInteger object, RoundingMode object2) {
        int n3;
        Object object3 = "x";
        MathPreconditions.checkPositive(object3, (BigInteger)object);
        int n4 = BigIntegerMath.fitsInLong((BigInteger)object);
        if (n4 != 0) {
            return LongMath.log10(((BigInteger)object).longValue(), (RoundingMode)((Object)object2));
        }
        object3 = RoundingMode.FLOOR;
        double d2 = BigIntegerMath.log2((BigInteger)object, (RoundingMode)((Object)object3));
        double d5 = LN_2;
        d2 *= d5;
        BigInteger bigInteger = BigInteger.TEN;
        d5 = LN_10;
        n4 = (int)(d2 /= d5);
        BigInteger bigInteger2 = bigInteger.pow(n4);
        int n7 = bigInteger2.compareTo((BigInteger)object);
        if (n7 > 0) {
            do {
                n4 += -1;
            } while ((n3 = (bigInteger2 = bigInteger2.divide(bigInteger = BigInteger.TEN)).compareTo((BigInteger)object)) > 0);
        } else {
            bigInteger = bigInteger.multiply(bigInteger2);
            int n8 = bigInteger.compareTo((BigInteger)object);
            int n10 = n7;
            n7 = n8;
            while (n7 <= 0) {
                ++n4;
                bigInteger2 = BigInteger.TEN.multiply(bigInteger);
                n10 = bigInteger2.compareTo((BigInteger)object);
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = bigInteger;
                bigInteger = bigInteger3;
                int n14 = n10;
                n10 = n7;
                n7 = n14;
            }
            n3 = n10;
        }
        int[] nArray = BigIntegerMath$1.$SwitchMap$java$math$RoundingMode;
        int n15 = ((Enum)object2).ordinal();
        n15 = nArray[n15];
        switch (n15) {
            default: {
                object = new AssertionError();
                throw object;
            }
            case 6: 
            case 7: 
            case 8: {
                n15 = 2;
                object = ((BigInteger)object).pow(n15);
                object2 = bigInteger2.pow(n15);
                bigInteger = BigInteger.TEN;
                object2 = ((BigInteger)object2).multiply(bigInteger);
                int n16 = ((BigInteger)object).compareTo((BigInteger)object2);
                if (n16 > 0) {
                    ++n4;
                }
                return n4;
            }
            case 4: 
            case 5: {
                boolean bl2 = bigInteger2.equals(object);
                if (!bl2) {
                    ++n4;
                }
                return n4;
            }
            case 1: {
                boolean bl3;
                if (n3 == 0) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object = null;
                }
                MathPreconditions.checkRoundingUnnecessary(bl3);
            }
            case 2: 
            case 3: 
        }
        return n4;
    }

    public static int log2(BigInteger object, RoundingMode object2) {
        BigInteger bigInteger = (BigInteger)Preconditions.checkNotNull(object);
        String string2 = "x";
        MathPreconditions.checkPositive(string2, bigInteger);
        int n3 = ((BigInteger)object).bitLength();
        int n4 = n3 + -1;
        int[] nArray = BigIntegerMath$1.$SwitchMap$java$math$RoundingMode;
        int n7 = ((Enum)object2).ordinal();
        n7 = nArray[n7];
        switch (n7) {
            default: {
                object = new AssertionError();
                throw object;
            }
            case 6: 
            case 7: 
            case 8: {
                n7 = 256;
                if (n4 < n7) {
                    object2 = SQRT2_PRECOMPUTED_BITS;
                    int n8 = 256 - n4;
                    int n10 = ((BigInteger)object).compareTo((BigInteger)(object2 = ((BigInteger)object2).shiftRight(n8)));
                    if (n10 <= 0) {
                        return n4;
                    }
                    return n3;
                }
                int n14 = ((BigInteger)(object = ((BigInteger)object).pow(2))).bitLength() + -1;
                if (n14 < (n7 = n4 * 2 + 1)) {
                    n3 = n4;
                }
                return n3;
            }
            case 4: 
            case 5: {
                boolean bl2 = BigIntegerMath.isPowerOfTwo((BigInteger)object);
                if (bl2) {
                    n3 = n4;
                }
                return n3;
            }
            case 1: {
                boolean bl3 = BigIntegerMath.isPowerOfTwo((BigInteger)object);
                MathPreconditions.checkRoundingUnnecessary(bl3);
            }
            case 2: 
            case 3: 
        }
        return n4;
    }

    public static double roundToDouble(BigInteger bigInteger, RoundingMode roundingMode) {
        return BigIntegerMath$BigIntegerToDoubleRounder.INSTANCE.roundToDouble(bigInteger, roundingMode);
    }

    public static BigInteger sqrt(BigInteger object, RoundingMode object2) {
        Object object3 = "x";
        MathPreconditions.checkNonNegative((String)object3, (BigInteger)object);
        boolean bl2 = BigIntegerMath.fitsInLong((BigInteger)object);
        if (bl2) {
            return BigInteger.valueOf(LongMath.sqrt(((BigInteger)object).longValue(), (RoundingMode)((Object)object2)));
        }
        object3 = BigIntegerMath.sqrtFloor((BigInteger)object);
        int[] nArray = BigIntegerMath$1.$SwitchMap$java$math$RoundingMode;
        int n3 = ((Enum)object2).ordinal();
        n3 = nArray[n3];
        int n4 = 2;
        switch (n3) {
            default: {
                object = new AssertionError();
                throw object;
            }
            case 6: 
            case 7: 
            case 8: {
                object2 = ((BigInteger)object3).pow(n4).add((BigInteger)object3);
                int n7 = ((BigInteger)object2).compareTo((BigInteger)object);
                if (n7 < 0) {
                    object = BigInteger.ONE;
                    object3 = ((BigInteger)object3).add((BigInteger)object);
                }
                return object3;
            }
            case 4: 
            case 5: {
                boolean bl3;
                n3 = ((BigInteger)object3).intValue();
                n3 *= n3;
                int n8 = ((BigInteger)object).intValue();
                if (n3 != n8 || !(bl3 = ((BigInteger)(object2 = ((BigInteger)object3).pow(n4))).equals(object))) {
                    object = BigInteger.ONE;
                    object3 = ((BigInteger)object3).add((BigInteger)object);
                }
                return object3;
            }
            case 1: {
                object2 = ((BigInteger)object3).pow(n4);
                boolean bl4 = ((BigInteger)object2).equals(object);
                MathPreconditions.checkRoundingUnnecessary(bl4);
            }
            case 2: 
            case 3: 
        }
        return object3;
    }

    private static BigInteger sqrtApproxWithDoubles(BigInteger object) {
        double d2 = Math.sqrt(DoubleUtils.bigToDouble(object));
        object = RoundingMode.HALF_EVEN;
        return DoubleMath.roundToBigInteger(d2, (RoundingMode)((Object)object));
    }

    private static BigInteger sqrtFloor(BigInteger bigInteger) {
        Object object;
        Object object2 = RoundingMode.FLOOR;
        int n3 = BigIntegerMath.log2(bigInteger, (RoundingMode)((Object)object2));
        int n4 = 1023;
        int n7 = 1;
        if (n3 < n4) {
            object2 = BigIntegerMath.sqrtApproxWithDoubles(bigInteger);
        } else {
            n3 = n3 + -52 & 0xFFFFFFFE;
            object = BigIntegerMath.sqrtApproxWithDoubles(bigInteger.shiftRight(n3));
            object2 = ((BigInteger)object).shiftLeft(n3 >>= n7);
        }
        object = bigInteger.divide((BigInteger)object2);
        object = ((BigInteger)object2).add((BigInteger)object).shiftRight(n7);
        boolean n8 = ((BigInteger)object2).equals(object);
        if (n8) {
            return object2;
        }
        while (true) {
            object2 = bigInteger.divide((BigInteger)object);
            int n10 = ((BigInteger)(object2 = ((BigInteger)object).add((BigInteger)object2).shiftRight(n7))).compareTo((BigInteger)object);
            if (n10 >= 0) {
                return object;
            }
            object = object2;
        }
    }
}

