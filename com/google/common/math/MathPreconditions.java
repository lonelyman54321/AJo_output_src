/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import java.math.BigInteger;
import java.math.RoundingMode;

final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean bl2, double d2, RoundingMode roundingMode) {
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("rounded value is out of range for input ");
        stringBuilder.append(d2);
        stringBuilder.append(" and rounding mode ");
        stringBuilder.append((Object)roundingMode);
        String string2 = stringBuilder.toString();
        ArithmeticException arithmeticException = new ArithmeticException(string2);
        throw arithmeticException;
    }

    public static void checkNoOverflow(boolean bl2, String charSequence, int n3, int n4) {
        if (bl2) {
            return;
        }
        charSequence = oe3_0.a(n3, "overflow: ", charSequence, "(", ", ");
        charSequence = g30.a(n4, ")", (StringBuilder)charSequence);
        ArithmeticException arithmeticException = new ArithmeticException((String)charSequence);
        throw arithmeticException;
    }

    public static void checkNoOverflow(boolean bl2, String string2, long l2, long l3) {
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("overflow: ");
        stringBuilder.append(string2);
        stringBuilder.append("(");
        stringBuilder.append(l2);
        stringBuilder.append(", ");
        stringBuilder.append(l3);
        stringBuilder.append(")");
        string2 = stringBuilder.toString();
        ArithmeticException arithmeticException = new ArithmeticException(string2);
        throw arithmeticException;
    }

    public static double checkNonNegative(String string2, double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object >= 0) {
            return d2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(d2);
        stringBuilder.append(") must be >= 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static int checkNonNegative(String string2, int n3) {
        if (n3 >= 0) {
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(n3);
        stringBuilder.append(") must be >= 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static long checkNonNegative(String string2, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(l2);
        stringBuilder.append(") must be >= 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static BigInteger checkNonNegative(String string2, BigInteger bigInteger) {
        int n3 = bigInteger.signum();
        if (n3 >= 0) {
            return bigInteger;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(bigInteger);
        stringBuilder.append(") must be >= 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static int checkPositive(String string2, int n3) {
        if (n3 > 0) {
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(n3);
        stringBuilder.append(") must be > 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static long checkPositive(String string2, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return l2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(l2);
        stringBuilder.append(") must be > 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static BigInteger checkPositive(String string2, BigInteger bigInteger) {
        int n3 = bigInteger.signum();
        if (n3 > 0) {
            return bigInteger;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(bigInteger);
        stringBuilder.append(") must be > 0");
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkRoundingUnnecessary(boolean bl2) {
        if (bl2) {
            return;
        }
        ArithmeticException arithmeticException = new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        throw arithmeticException;
    }
}

