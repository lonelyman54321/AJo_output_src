/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.Hashing;
import java.util.Arrays;

final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 0x3FFFFFFF;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET;

    private CompactHashing() {
    }

    public static Object createTable(int n3) {
        int n4 = 2;
        if (n3 >= n4 && n3 <= (n4 = 0x40000000) && (n4 = Integer.highestOneBit(n3)) == n3) {
            n4 = 256;
            if (n3 <= n4) {
                return new byte[n3];
            }
            n4 = 65536;
            if (n3 <= n4) {
                return new short[n3];
            }
            return new int[n3];
        }
        String string2 = hj0_0.a(n3, "must be power of 2 between 2^1 and 2^30: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static int getHashPrefix(int n3, int n4) {
        return n3 & (n4 ^= 0xFFFFFFFF);
    }

    public static int getNext(int n3, int n4) {
        return n3 & n4;
    }

    public static int maskCombine(int n3, int n4, int n7) {
        int n8 = ~n7;
        return (n3 &= n8) | (n4 &= n7);
    }

    public static int newCapacity(int n3) {
        int n4 = 32;
        n4 = n3 < n4 ? 4 : 2;
        return (n3 + 1) * n4;
    }

    public static int remove(Object object, Object object2, int n3, Object object3, int[] nArray, Object[] objectArray, Object[] objectArray2) {
        int n4 = Hashing.smearedHash(object);
        int n7 = n4 & n3;
        int n8 = CompactHashing.tableGet(object3, n7);
        int n10 = -1;
        if (n8 == 0) {
            return n10;
        }
        n4 = CompactHashing.getHashPrefix(n4, n3);
        int n14 = -1;
        while (true) {
            Object object4;
            int n15;
            int n16;
            if ((n16 = CompactHashing.getHashPrefix(n15 = nArray[n8 += -1], n3)) == n4 && (n16 = (int)(Objects.equal(object, object4 = objectArray[n8]) ? 1 : 0)) != 0 && (objectArray2 == null || (n16 = (int)(Objects.equal(object2, object4 = objectArray2[n8]) ? 1 : 0)) != 0)) {
                int n17 = CompactHashing.getNext(n15, n3);
                if (n14 == n10) {
                    CompactHashing.tableSet(object3, n7, n17);
                } else {
                    int n18 = nArray[n14];
                    nArray[n14] = n17 = CompactHashing.maskCombine(n18, n17, n3);
                }
                return n8;
            }
            n14 = CompactHashing.getNext(n15, n3);
            if (n14 == 0) {
                return n10;
            }
            int n19 = n14;
            n14 = n8;
            n8 = n19;
        }
    }

    public static void tableClear(Object object) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            object = (byte[])object;
            Arrays.fill((byte[])object, (byte)0);
        } else {
            bl2 = object instanceof short[];
            if (bl2) {
                object = (short[])object;
                Arrays.fill((short[])object, (short)0);
            } else {
                object = (int[])object;
                Arrays.fill((int[])object, 0);
            }
        }
    }

    public static int tableGet(Object object, int n3) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            return ((byte[])object)[n3] & 0xFF;
        }
        bl2 = object instanceof short[];
        if (bl2) {
            return ((short[])object)[n3] & (char)-1;
        }
        return ((int[])object)[n3];
    }

    public static void tableSet(Object object, int n3, int n4) {
        boolean bl2 = object instanceof byte[];
        if (bl2) {
            object = (byte[])object;
            n4 = (byte)n4;
            object[n3] = n4;
        } else {
            bl2 = object instanceof short[];
            if (bl2) {
                object = (short[])object;
                n4 = (short)n4;
                object[n3] = n4;
            } else {
                object = (int[])object;
                object[n3] = n4;
            }
        }
    }

    public static int tableSize(int n3) {
        n3 = Hashing.closedTableSize(n3 + 1, 1.0);
        return Math.max(4, n3);
    }
}

