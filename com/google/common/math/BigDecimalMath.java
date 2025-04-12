/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.BigDecimalMath$BigDecimalToDoubleRounder;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMath {
    private BigDecimalMath() {
    }

    public static double roundToDouble(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return BigDecimalMath$BigDecimalToDoubleRounder.INSTANCE.roundToDouble(bigDecimal, roundingMode);
    }
}

