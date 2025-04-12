/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$NamedFastMatcher;
import java.util.BitSet;

final class SmallCharMatcher
extends CharMatcher$NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] cArray, long l2, boolean bl2, String string2) {
        super(string2);
        this.table = cArray;
        this.filter = l2;
        this.containsZero = bl2;
    }

    private boolean checkFilter(int n3) {
        long l2 = this.filter >> n3;
        long l3 = 1L;
        long l4 = l3 - (l2 &= l3);
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public static int chooseTableSize(int n3) {
        double d2;
        double d5;
        double d7;
        double d9;
        int n4 = 1;
        if (n3 == n4) {
            return 2;
        }
        int n7 = Integer.highestOneBit(n3 + -1);
        n4 = n7 << 1;
        while ((d9 = (d7 = (d5 = (double)n4 * 0.5) - (d2 = (double)n3)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
            n4 <<= 1;
        }
        return n4;
    }

    public static CharMatcher from(BitSet object, String string2) {
        int n3;
        int n4 = ((BitSet)object).cardinality();
        boolean bl2 = ((BitSet)object).get(0);
        n4 = SmallCharMatcher.chooseTableSize(n4);
        char[] cArray = new char[n4];
        n4 += -1;
        int n7 = ((BitSet)object).nextSetBit(0);
        long l2 = 0L;
        block0: while (n7 != (n3 = -1)) {
            long l3 = 1L << n7 | l2;
            n3 = SmallCharMatcher.smear(n7);
            while (true) {
                char c2;
                if ((c2 = cArray[n3 &= n4]) == '\u0000') {
                    cArray[n3] = c2 = (char)n7;
                    ++n7;
                    n7 = ((BitSet)object).nextSetBit(n7);
                    l2 = l3;
                    continue block0;
                }
                ++n3;
            }
        }
        object = new SmallCharMatcher(cArray, l2, bl2, string2);
        return object;
    }

    public static int smear(int n3) {
        return Integer.rotateLeft(n3 * -862048943, 15) * 461845907;
    }

    public boolean matches(char c2) {
        int n3;
        if (c2 == '\u0000') {
            return this.containsZero;
        }
        int n4 = this.checkFilter(c2);
        if (n4 == 0) {
            return false;
        }
        char[] cArray = this.table;
        n4 = cArray.length;
        int n7 = 1;
        int n8 = n3 = SmallCharMatcher.smear(c2) & (n4 -= n7);
        do {
            char[] cArray2;
            char c3;
            if ((c3 = (cArray2 = this.table)[n8]) == '\u0000') {
                return false;
            }
            if (c3 != c2) continue;
            return n7 != 0;
        } while ((n8 = n8 + 1 & n4) != n3);
        return false;
    }

    public void setBits(BitSet bitSet) {
        boolean bl2 = this.containsZero;
        int n3 = 0;
        if (bl2) {
            bitSet.set(0);
        }
        char[] cArray = this.table;
        int n4 = cArray.length;
        while (n3 < n4) {
            char c2 = cArray[n3];
            if (c2 != '\u0000') {
                bitSet.set(c2);
            }
            ++n3;
        }
    }
}

