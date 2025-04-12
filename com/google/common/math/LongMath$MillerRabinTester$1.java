/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.LongMath$MillerRabinTester;

final class LongMath$MillerRabinTester$1
extends LongMath$MillerRabinTester {
    public long mulMod(long l2, long l3, long l4) {
        return l2 * l3 % l4;
    }

    public long squareMod(long l2, long l3) {
        return l2 * l2 % l3;
    }
}

