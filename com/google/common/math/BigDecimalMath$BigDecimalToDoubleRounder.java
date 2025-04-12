/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.ToDoubleRounder;
import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalMath$BigDecimalToDoubleRounder
extends ToDoubleRounder {
    static final BigDecimalMath$BigDecimalToDoubleRounder INSTANCE;

    static {
        BigDecimalMath$BigDecimalToDoubleRounder bigDecimalMath$BigDecimalToDoubleRounder;
        INSTANCE = bigDecimalMath$BigDecimalToDoubleRounder = new BigDecimalMath$BigDecimalToDoubleRounder();
    }

    private BigDecimalMath$BigDecimalToDoubleRounder() {
    }

    public BigDecimal minus(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.subtract(bigDecimal2);
    }

    public double roundToDoubleArbitrarily(BigDecimal bigDecimal) {
        return bigDecimal.doubleValue();
    }

    public int sign(BigDecimal bigDecimal) {
        return bigDecimal.signum();
    }

    public BigDecimal toX(double d2, RoundingMode object) {
        object = new BigDecimal(d2);
        return object;
    }
}

