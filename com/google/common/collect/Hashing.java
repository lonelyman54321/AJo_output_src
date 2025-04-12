/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

final class Hashing {
    private static final long C1 = 3432918353L;
    private static final long C2 = 461845907L;
    private static final int MAX_TABLE_SIZE = 0x40000000;

    private Hashing() {
    }

    public static int closedTableSize(int n3, double d2) {
        int n4;
        double d5;
        int n7;
        if ((n3 = Math.max(n3, 2)) > (n7 = (int)(d2 *= (d5 = (double)(n4 = Integer.highestOneBit(n3)))))) {
            n3 = n4 << 1;
            if (n3 <= 0) {
                n3 = 0x40000000;
            }
            return n3;
        }
        return n4;
    }

    public static boolean needsResizing(int n3, int n4, double d2) {
        double d5 = n3;
        double d7 = n4;
        double d9 = d5 - (d2 *= d7);
        n3 = (n3 = (int)(d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1))) > 0 && n4 < (n3 = 0x40000000) ? 1 : 0;
        return n3 != 0;
    }

    public static int smear(int n3) {
        return (int)((long)Integer.rotateLeft((int)((long)n3 * 3432918353L), 15) * 461845907L);
    }

    public static int smearedHash(Object object) {
        int n3;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return Hashing.smear(n3);
    }
}

