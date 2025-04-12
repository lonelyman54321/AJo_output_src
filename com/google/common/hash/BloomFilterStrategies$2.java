/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.BloomFilterStrategies;
import com.google.common.hash.BloomFilterStrategies$LockFreeBitArray;
import com.google.common.hash.Funnel;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Longs;

final class BloomFilterStrategies$2
extends BloomFilterStrategies {
    private long lowerEight(byte[] byArray) {
        byte by2 = byArray[7];
        byte by4 = byArray[6];
        byte by5 = byArray[5];
        byte by6 = byArray[4];
        byte by7 = byArray[3];
        byte by8 = byArray[2];
        byte by9 = byArray[1];
        byte by10 = byArray[0];
        return Longs.fromBytes(by2, by4, by5, by6, by7, by8, by9, by10);
    }

    private long upperEight(byte[] byArray) {
        byte by2 = byArray[15];
        byte by4 = byArray[14];
        byte by5 = byArray[13];
        byte by6 = byArray[12];
        byte by7 = byArray[11];
        byte by8 = byArray[10];
        byte by9 = byArray[9];
        byte by10 = byArray[8];
        return Longs.fromBytes(by2, by4, by5, by6, by7, by8, by9, by10);
    }

    public boolean mightContain(Object object, Funnel funnel, int n3, BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray) {
        long l2 = bloomFilterStrategies$LockFreeBitArray.bitSize();
        HashFunction hashFunction = Hashing.murmur3_128();
        object = hashFunction.hashObject(object, funnel).getBytesInternal();
        long l3 = this.lowerEight((byte[])object);
        long l4 = this.upperEight((byte[])object);
        for (int i3 = 0; i3 < n3; ++i3) {
            long l7 = (Long.MAX_VALUE & l3) % l2;
            boolean bl2 = bloomFilterStrategies$LockFreeBitArray.get(l7);
            if (!bl2) {
                return false;
            }
            l3 += l4;
        }
        return true;
    }

    public boolean put(Object object, Funnel funnel, int n3, BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray) {
        long l2 = bloomFilterStrategies$LockFreeBitArray.bitSize();
        HashFunction hashFunction = Hashing.murmur3_128();
        object = hashFunction.hashObject(object, funnel).getBytesInternal();
        long l3 = this.lowerEight((byte[])object);
        long l4 = this.upperEight((byte[])object);
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            long l7 = (Long.MAX_VALUE & l3) % l2;
            boolean bl3 = bloomFilterStrategies$LockFreeBitArray.set(l7);
            bl2 |= bl3;
            l3 += l4;
        }
        return bl2;
    }
}

