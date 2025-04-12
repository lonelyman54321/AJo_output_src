/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.DoubleMath;
import com.google.common.math.DoubleUtils;
import com.google.common.math.ToDoubleRounder;
import java.math.BigInteger;
import java.math.RoundingMode;

class BigIntegerMath$BigIntegerToDoubleRounder
extends ToDoubleRounder {
    static final BigIntegerMath$BigIntegerToDoubleRounder INSTANCE;

    static {
        BigIntegerMath$BigIntegerToDoubleRounder bigIntegerMath$BigIntegerToDoubleRounder;
        INSTANCE = bigIntegerMath$BigIntegerToDoubleRounder = new BigIntegerMath$BigIntegerToDoubleRounder();
    }

    private BigIntegerMath$BigIntegerToDoubleRounder() {
    }

    public BigInteger minus(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.subtract(bigInteger2);
    }

    public double roundToDoubleArbitrarily(BigInteger bigInteger) {
        return DoubleUtils.bigToDouble(bigInteger);
    }

    public int sign(BigInteger bigInteger) {
        return bigInteger.signum();
    }

    public BigInteger toX(double d2, RoundingMode roundingMode) {
        return DoubleMath.roundToBigInteger(d2, roundingMode);
    }
}

