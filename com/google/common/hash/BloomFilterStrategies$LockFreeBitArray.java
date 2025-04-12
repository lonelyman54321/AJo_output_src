/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.LongAddable;
import com.google.common.hash.LongAddables;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

final class BloomFilterStrategies$LockFreeBitArray {
    private static final int LONG_ADDRESSABLE_BITS = 6;
    private final LongAddable bitCount;
    final AtomicLongArray data;

    public BloomFilterStrategies$LockFreeBitArray(long l2) {
        LongAddable longAddable;
        AtomicLongArray atomicLongArray;
        boolean bl2;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            atomicLongArray = null;
        }
        Preconditions.checkArgument(bl2, "data length is zero!");
        RoundingMode roundingMode = RoundingMode.CEILING;
        int n3 = Ints.checkedCast(LongMath.divide(l2, 64, roundingMode));
        this.data = atomicLongArray = new AtomicLongArray(n3);
        this.bitCount = longAddable = LongAddables.create();
    }

    public BloomFilterStrategies$LockFreeBitArray(long[] lArray) {
        Object object;
        int n3 = lArray.length;
        int n4 = 0;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        String string2 = "data length is zero!";
        Preconditions.checkArgument(n3 != 0, string2);
        object = new AtomicLongArray(lArray);
        this.data = object;
        this.bitCount = object = LongAddables.create();
        n3 = lArray.length;
        long l2 = 0L;
        while (n4 < n3) {
            int n7 = Long.bitCount(lArray[n4]);
            long l3 = n7;
            l2 += l3;
            ++n4;
        }
        this.bitCount.add(l2);
    }

    public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
        int n3 = atomicLongArray.length();
        long[] lArray = new long[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            long l2;
            lArray[i3] = l2 = atomicLongArray.get(i3);
        }
        return lArray;
    }

    public long bitCount() {
        return this.bitCount.sum();
    }

    public long bitSize() {
        return (long)this.data.length() * (long)64;
    }

    public BloomFilterStrategies$LockFreeBitArray copy() {
        long[] lArray = BloomFilterStrategies$LockFreeBitArray.toPlainArray(this.data);
        BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray = new BloomFilterStrategies$LockFreeBitArray(lArray);
        return bloomFilterStrategies$LockFreeBitArray;
    }

    public int dataLength() {
        return this.data.length();
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof BloomFilterStrategies$LockFreeBitArray;
        if (bl2) {
            object = (BloomFilterStrategies$LockFreeBitArray)object;
            long[] lArray = BloomFilterStrategies$LockFreeBitArray.toPlainArray(this.data);
            object = BloomFilterStrategies$LockFreeBitArray.toPlainArray(((BloomFilterStrategies$LockFreeBitArray)object).data);
            return Arrays.equals(lArray, (long[])object);
        }
        return false;
    }

    public boolean get(long l2) {
        AtomicLongArray atomicLongArray = this.data;
        int n3 = 6;
        long l3 = l2 >>> n3;
        int n4 = (int)l3;
        long l4 = atomicLongArray.get(n4);
        long l7 = 1L;
        int n7 = (int)l2;
        long l8 = (l2 = l7 << n7 & l4) - (l4 = 0L);
        n4 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
        boolean bl2 = n4 != 0;
        return bl2;
    }

    public int hashCode() {
        return Arrays.hashCode(BloomFilterStrategies$LockFreeBitArray.toPlainArray(this.data));
    }

    public void putAll(BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray) {
        AtomicLongArray atomicLongArray = this.data;
        int n3 = atomicLongArray.length();
        AtomicLongArray atomicLongArray2 = bloomFilterStrategies$LockFreeBitArray.data;
        int n4 = atomicLongArray2.length();
        int n7 = 0;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            atomicLongArray = null;
        }
        atomicLongArray2 = this.data;
        n4 = atomicLongArray2.length();
        AtomicLongArray atomicLongArray3 = bloomFilterStrategies$LockFreeBitArray.data;
        int n8 = atomicLongArray3.length();
        String string2 = "BitArrays must be of equal length (%s != %s)";
        Preconditions.checkArgument(n3 != 0, string2, n4, n8);
        while (n7 < (n3 = (atomicLongArray = this.data).length())) {
            atomicLongArray = bloomFilterStrategies$LockFreeBitArray.data;
            long l2 = atomicLongArray.get(n7);
            this.putData(n7, l2);
            ++n7;
        }
    }

    public void putData(int n3, long l2) {
        long l3;
        AtomicLongArray atomicLongArray;
        long l4;
        long l7;
        long l8;
        while ((l8 = (l7 = (l4 = (atomicLongArray = this.data).get(n3)) - (l3 = l4 | l2)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            AtomicLongArray atomicLongArray2 = this.data;
            l8 = (long)atomicLongArray2.compareAndSet(n3, l4, l3);
            if (l8 == false) continue;
            n3 = Long.bitCount(l3);
            int n4 = Long.bitCount(l4);
            LongAddable longAddable = this.bitCount;
            long l12 = n3 -= n4;
            longAddable.add(l12);
            break;
        }
    }

    public boolean set(long l2) {
        long l3;
        long l4;
        AtomicLongArray atomicLongArray;
        long l7;
        int n3 = this.get(l2);
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(l2 >>> 6);
        long l8 = 1L;
        int n4 = (int)l2;
        l2 = l8 << n4;
        do {
            AtomicLongArray atomicLongArray2;
            long l12;
            if ((l7 = (l12 = (l4 = (atomicLongArray2 = this.data).get(n3)) - (l3 = l4 | l2)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) continue;
            return false;
        } while ((l7 = (long)(atomicLongArray = this.data).compareAndSet(n3, l4, l3)) == false);
        this.bitCount.increment();
        return true;
    }
}

