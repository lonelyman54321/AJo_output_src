/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.DoubleMath$1;
import com.google.common.math.DoubleUtils;
import com.google.common.math.MathPreconditions;
import com.google.common.primitives.Booleans;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

public final class DoubleMath {
    private static final double LN_2 = 0.0;
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18;
    static final double[] everySixteenthFactorial;

    static {
        double[] dArray;
        LN_2 = Math.log(2.0);
        double[] dArray2 = dArray = new double[11];
        double[] dArray3 = dArray;
        dArray2[0] = 1.0;
        dArray3[1] = 2.0922789888E13;
        dArray2[2] = 2.631308369336935E35;
        dArray3[3] = 1.2413915592536073E61;
        dArray2[4] = 1.2688693218588417E89;
        dArray3[5] = 7.156945704626381E118;
        dArray2[6] = 9.916779348709496E149;
        dArray3[7] = 1.974506857221074E182;
        dArray2[8] = 3.856204823625804E215;
        dArray3[9] = 5.5502938327393044E249;
        dArray3[10] = 4.7147236359920616E284;
        everySixteenthFactorial = dArray;
    }

    private DoubleMath() {
    }

    private static double checkFinite(double d2) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d2));
        return d2;
    }

    public static double factorial(int n3) {
        Object object;
        Object object2 = "n";
        MathPreconditions.checkNonNegative((String)object2, n3);
        int n4 = 170;
        if (n3 > n4) {
            return 1.0 / 0.0;
        }
        double d2 = 1.0;
        for (n4 = (n3 & 0xFFFFFFF0) + 1; n4 <= n3; ++n4) {
            object = n4;
            d2 *= object;
        }
        object2 = everySixteenthFactorial;
        object = object2[n3 >>= 4];
        return d2 * object;
    }

    public static int fuzzyCompare(double d2, double d5, double d7) {
        Object object = DoubleMath.fuzzyEquals(d2, d5, d7);
        if (object != 0) {
            return 0;
        }
        object = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object < 0) {
            return -1;
        }
        object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object > 0) {
            return 1;
        }
        boolean bl2 = Double.isNaN(d2);
        boolean bl3 = Double.isNaN(d5);
        return Booleans.compare(bl2, bl3);
    }

    public static boolean fuzzyEquals(double d2, double d5, double d7) {
        boolean bl2;
        double d9;
        String string2 = "tolerance";
        MathPreconditions.checkNonNegative(string2, d7);
        double d12 = d2 - d5;
        double d13 = 1.0;
        d12 = Math.copySign(d12, d13);
        double d14 = d12 == d7 ? 0 : (d12 < d7 ? -1 : 1);
        bl2 = d14 <= 0 || (d9 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1)) == false || (bl2 = Double.isNaN(d2)) && (bl2 = Double.isNaN(d5));
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isMathematicalInteger(double d2) {
        int n3 = DoubleUtils.isFinite(d2);
        if (n3 == 0) return 0 != 0;
        long l2 = 0L;
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object == false) return 1 != 0;
        l2 = DoubleUtils.getSignificand(d2);
        n3 = Long.numberOfTrailingZeros(l2);
        int n4 = Math.getExponent(d2);
        if ((n3 = 52 - n3) > n4) return 0 != 0;
        return 1 != 0;
    }

    public static boolean isPowerOfTwo(double d2) {
        boolean bl2;
        long l2 = 0L;
        double d5 = 0.0;
        boolean bl3 = false;
        Object object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object > 0 && (bl2 = DoubleUtils.isFinite(d2))) {
            long l3 = DoubleUtils.getSignificand(d2);
            l2 = l3 - 1L;
            l3 &= l2;
            l2 = 0L;
            d5 = 0.0;
            object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static double log2(double d2) {
        d2 = Math.log(d2);
        double d5 = LN_2;
        return d2 / d5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int log2(double var0, RoundingMode var2_1) {
        var3_2 = 0.0;
        var5_3 = false;
        var6_4 = true;
        var7_5 /* !! */  = (double)(var0 == var3_2 ? 0 : (var0 > var3_2 ? 1 : -1));
        var8_6 = var7_5 /* !! */  > 0 && (var8_6 = DoubleUtils.isFinite(var0)) != 0 ? 1 : 0;
        var9_7 = "x must be positive and finite";
        Preconditions.checkArgument((boolean)var8_6, var9_7);
        var8_6 = Math.getExponent(var0);
        var10_8 = DoubleUtils.isNormal(var0);
        if (!var10_8) {
            return DoubleMath.log2(var0 * 1.0, var2_1) + -52;
        }
        var9_7 = DoubleMath$1.$SwitchMap$java$math$RoundingMode;
        var11_9 /* !! */  = var2_1.ordinal();
        var11_9 /* !! */  = (int)var9_7[var11_9 /* !! */ ];
        block0 : switch (var11_9 /* !! */ ) {
            default: {
                var12_10 = new AssertionError();
                throw var12_10;
            }
            case 6: 
            case 7: 
            case 8: {
                var0 = DoubleUtils.scaleNormalize(var0);
                var0 *= var0;
                var13_11 = 2.0;
                var11_9 /* !! */  = (int)(var0 == var13_11 ? 0 : (var0 > var13_11 ? 1 : -1));
                if (var11_9 /* !! */  <= 0) break;
                var5_3 = true;
                break;
            }
            case 5: {
                if (var8_6 >= 0) {
                    var5_3 = true;
                }
                var15_12 = DoubleMath.isPowerOfTwo(var0);
lbl31:
                // 2 sources

                while (true) {
                    var5_3 &= (var15_12 ^= var6_4);
                    break block0;
                    break;
                }
            }
            case 4: {
                if (var8_6 < 0) {
                    var5_3 = true;
                }
                var15_12 = DoubleMath.isPowerOfTwo(var0);
                ** continue;
            }
            case 3: {
                var15_13 = DoubleMath.isPowerOfTwo(var0);
                var5_3 = var15_13 ^ true;
                break;
            }
            case 1: {
                var15_14 = DoubleMath.isPowerOfTwo(var0);
                MathPreconditions.checkRoundingUnnecessary(var15_14);
            }
            case 2: 
        }
        if (var5_3) {
            ++var8_6;
        }
        return var8_6;
    }

    public static double mean(Iterable iterable) {
        return DoubleMath.mean(iterable.iterator());
    }

    public static double mean(Iterator iterator) {
        boolean bl2;
        long l2;
        boolean bl3 = iterator.hasNext();
        String string2 = "Cannot take mean of 0 values";
        Preconditions.checkArgument(bl3, string2);
        Number number = (Number)iterator.next();
        double d2 = DoubleMath.checkFinite(number.doubleValue());
        long l3 = l2 = 1L;
        while (bl2 = iterator.hasNext()) {
            Number number2 = (Number)iterator.next();
            double d5 = DoubleMath.checkFinite(number2.doubleValue());
            d5 -= d2;
            double d7 = l3 += l2;
            d2 += (d5 /= d7);
        }
        return d2;
    }

    public static double mean(double ... dArray) {
        int n3;
        long l2;
        boolean bl2 = dArray.length;
        bl2 = bl2 > false;
        String string2 = "Cannot take mean of 0 values";
        Preconditions.checkArgument(bl2, string2);
        double d2 = DoubleMath.checkFinite(dArray[0]);
        long l3 = l2 = 1L;
        for (int i3 = 1; i3 < (n3 = dArray.length); ++i3) {
            DoubleMath.checkFinite(dArray[i3]);
            double d5 = dArray[i3] - d2;
            double d7 = l3 += l2;
            d2 += (d5 /= d7);
        }
        return d2;
    }

    public static double mean(int ... nArray) {
        int n3 = nArray.length;
        n3 = n3 > 0 ? 1 : 0;
        String string2 = "Cannot take mean of 0 values";
        Preconditions.checkArgument(n3 != 0, string2);
        long l2 = 0L;
        double d2 = 0.0;
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            n3 = nArray[i3];
            long l3 = n3;
            l2 += l3;
        }
        double d5 = l2;
        d2 = nArray.length;
        return d5 / d2;
    }

    public static double mean(long ... lArray) {
        int n3;
        long l2;
        boolean bl2 = lArray.length;
        bl2 = bl2 > false;
        String string2 = "Cannot take mean of 0 values";
        Preconditions.checkArgument(bl2, string2);
        long l3 = lArray[0];
        double d2 = l3;
        long l4 = l2 = 1L;
        for (int i3 = 1; i3 < (n3 = lArray.length); ++i3) {
            long l7 = lArray[i3];
            double d5 = (double)l7 - d2;
            double d7 = l4 += l2;
            d2 += (d5 /= d7);
        }
        return d2;
    }

    public static double roundIntermediate(double d2, RoundingMode roundingMode) {
        boolean bl2 = DoubleUtils.isFinite(d2);
        if (bl2) {
            int[] nArray = DoubleMath$1.$SwitchMap$java$math$RoundingMode;
            int n3 = roundingMode.ordinal();
            n3 = nArray[n3];
            long l2 = 1L;
            double d5 = Double.MIN_VALUE;
            double d7 = 0.0;
            double d9 = 0.5;
            switch (n3) {
                default: {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                case 8: {
                    d5 = Math.rint(d2);
                    d7 = Math.abs(d2 - d5);
                    n3 = (int)(d7 == d9 ? 0 : (d7 > d9 ? 1 : -1));
                    if (n3 == 0) {
                        return d2;
                    }
                    return d5;
                }
                case 7: {
                    d5 = Math.rint(d2);
                    d7 = Math.abs(d2 - d5);
                    n3 = (int)(d7 == d9 ? 0 : (d7 > d9 ? 1 : -1));
                    if (n3 == 0) {
                        d5 = Math.copySign(d9, d2) + d2;
                    }
                    return d5;
                }
                case 6: {
                    return Math.rint(d2);
                }
                case 5: {
                    n3 = (int)(DoubleMath.isMathematicalInteger(d2) ? 1 : 0);
                    if (n3 != 0) {
                        return d2;
                    }
                    l2 = (long)d2;
                    n3 = (int)(d2 == d7 ? 0 : (d2 > d7 ? 1 : -1));
                    int n4 = n3 > 0 ? 1 : -1;
                    long l3 = n4;
                    d2 = l2 += l3;
                }
                case 4: {
                    return d2;
                }
                case 3: {
                    n3 = (int)(d2 == d7 ? 0 : (d2 < d7 ? -1 : 1));
                    if (n3 > 0 && (n3 = (int)(DoubleMath.isMathematicalInteger(d2) ? 1 : 0)) == 0) {
                        long l4 = (long)d2 + l2;
                        d2 = l4;
                    }
                    return d2;
                }
                case 2: {
                    n3 = (int)(d2 == d7 ? 0 : (d2 > d7 ? 1 : -1));
                    if (n3 < 0 && (n3 = (int)(DoubleMath.isMathematicalInteger(d2) ? 1 : 0)) == 0) {
                        long l7 = (long)d2 - l2;
                        d2 = l7;
                    }
                    return d2;
                }
                case 1: 
            }
            MathPreconditions.checkRoundingUnnecessary(DoubleMath.isMathematicalInteger(d2));
            return d2;
        }
        ArithmeticException arithmeticException = new ArithmeticException("input is infinite or NaN");
        throw arithmeticException;
    }

    public static BigInteger roundToBigInteger(double d2, RoundingMode object) {
        BigInteger bigInteger;
        int n3;
        d2 = DoubleMath.roundIntermediate(d2, (RoundingMode)((Object)object));
        double d5 = -9.223372036854776E18 - d2;
        double d7 = 1.0;
        int n4 = 0;
        object = null;
        Object object2 = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
        if (object2 < 0) {
            n3 = 1;
        } else {
            n3 = 0;
            bigInteger = null;
        }
        double d9 = 9.223372036854776E18;
        double d12 = d2 == d9 ? 0 : (d2 < d9 ? -1 : 1);
        if (d12 < 0) {
            n4 = 1;
        }
        if ((n4 &= n3) != 0) {
            return BigInteger.valueOf((long)d2);
        }
        n4 = Math.getExponent(d2);
        bigInteger = BigInteger.valueOf(DoubleUtils.getSignificand(d2));
        object = bigInteger.shiftLeft(n4 += -52);
        d5 = 0.0;
        double d13 = d2 - d5;
        Object object3 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
        if (object3 < 0) {
            object = ((BigInteger)object).negate();
        }
        return object;
    }

    public static int roundToInt(double d2, RoundingMode roundingMode) {
        double d5 = DoubleMath.roundIntermediate(d2, roundingMode);
        double d7 = -2.147483649E9;
        boolean bl2 = false;
        Object object = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
        boolean bl3 = object > 0;
        double d9 = 2.147483648E9;
        double d12 = d5 - d9;
        Object object2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object2 < 0) {
            bl2 = true;
        }
        MathPreconditions.checkInRangeForRoundingInputs(bl3 & bl2, d2, roundingMode);
        return (int)d5;
    }

    public static long roundToLong(double d2, RoundingMode roundingMode) {
        double d5 = DoubleMath.roundIntermediate(d2, roundingMode);
        double d7 = -9.223372036854776E18 - d5;
        double d9 = 1.0;
        boolean bl2 = false;
        Object object = d7 == d9 ? 0 : (d7 < d9 ? -1 : 1);
        boolean bl3 = object < 0;
        double d12 = 9.223372036854776E18;
        double d13 = d5 - d12;
        Object object2 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
        if (object2 < 0) {
            bl2 = true;
        }
        MathPreconditions.checkInRangeForRoundingInputs(bl3 & bl2, d2, roundingMode);
        return (long)d5;
    }
}

