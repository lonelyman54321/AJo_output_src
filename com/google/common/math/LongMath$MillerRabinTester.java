/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.LongMath$1;
import com.google.common.math.LongMath$MillerRabinTester$1;
import com.google.common.math.LongMath$MillerRabinTester$2;

abstract class LongMath$MillerRabinTester
extends Enum {
    private static final /* synthetic */ LongMath$MillerRabinTester[] $VALUES;
    public static final /* enum */ LongMath$MillerRabinTester LARGE;
    public static final /* enum */ LongMath$MillerRabinTester SMALL;

    private static /* synthetic */ LongMath$MillerRabinTester[] $values() {
        LongMath$MillerRabinTester longMath$MillerRabinTester = SMALL;
        longMath$MillerRabinTester = LARGE;
        LongMath$MillerRabinTester[] longMath$MillerRabinTesterArray = new LongMath$MillerRabinTester[]{longMath$MillerRabinTester, longMath$MillerRabinTester};
        return longMath$MillerRabinTesterArray;
    }

    static {
        LongMath$MillerRabinTester longMath$MillerRabinTester = new LongMath$MillerRabinTester$1();
        SMALL = longMath$MillerRabinTester;
        longMath$MillerRabinTester = new LongMath$MillerRabinTester$2();
        LARGE = longMath$MillerRabinTester;
        $VALUES = LongMath$MillerRabinTester.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LongMath$MillerRabinTester() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ LongMath$MillerRabinTester(LongMath$1 longMath$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    private long powMod(long l2, long l3, long l4) {
        long l7;
        long l8;
        Object object;
        long l12;
        long l14 = l12 = 1L;
        while ((object = (l8 = l3 - (l7 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
            long l15 = l3 & l12;
            long l16 = l15 - l7;
            object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object != false) {
                l7 = l2;
                l15 = l4;
                l14 = this.mulMod(l14, l2, l4);
            }
            l2 = this.squareMod(l2, l4);
            object = 1;
            l3 >>= object;
        }
        return l14;
    }

    public static boolean test(long l2, long l3) {
        long l4 = 3037000499L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        LongMath$MillerRabinTester longMath$MillerRabinTester = object <= 0 ? SMALL : LARGE;
        return longMath$MillerRabinTester.testWitness(l2, l3);
    }

    private boolean testWitness(long l2, long l3) {
        long l4;
        long l7 = l3;
        long l8 = 1L;
        long l12 = l3 - l8;
        int n3 = Long.numberOfTrailingZeros(l12);
        long l14 = l12 >> n3;
        long l15 = l2 % l3;
        long l16 = 0L;
        int n4 = 1;
        Object object = l15 == l16 ? 0 : (l15 < l16 ? -1 : 1);
        if (object == false) {
            return n4 != 0;
        }
        l16 = l3;
        long l17 = this.powMod(l15, l14, l3);
        long l18 = l17 - l8;
        Object object2 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
        if (object2 == false) {
            return n4 != 0;
        }
        object2 = 0;
        int n7 = 0;
        while ((l4 = l17 == l12 ? 0 : (l17 < l12 ? -1 : 1)) != false) {
            if ((n7 += n4) == n3) {
                return false;
            }
            l17 = this.squareMod(l17, l7);
        }
        return n4 != 0;
    }

    public static LongMath$MillerRabinTester valueOf(String string2) {
        return Enum.valueOf(LongMath$MillerRabinTester.class, string2);
    }

    public static LongMath$MillerRabinTester[] values() {
        return (LongMath$MillerRabinTester[])$VALUES.clone();
    }

    public abstract long mulMod(long var1, long var3, long var5);

    public abstract long squareMod(long var1, long var3);
}

