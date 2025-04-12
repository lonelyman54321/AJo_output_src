/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.BloomFilterStrategies;
import com.google.common.hash.BloomFilterStrategies$LockFreeBitArray;
import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

final class BloomFilterStrategies$1
extends BloomFilterStrategies {
    public boolean mightContain(Object object, Funnel funnel, int n3, BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray) {
        long l2 = bloomFilterStrategies$LockFreeBitArray.bitSize();
        HashFunction hashFunction = Hashing.murmur3_128();
        object = hashFunction.hashObject(object, funnel);
        long l3 = ((HashCode)object).asLong();
        int n4 = (int)l3;
        int n7 = (int)(l3 >>>= 32);
        boolean bl2 = true;
        for (int i3 = 1; i3 <= n3; ++i3) {
            long l4;
            int n8 = i3 * n7 + n4;
            if (n8 < 0) {
                n8 ^= 0xFFFFFFFF;
            }
            if ((n8 = (int)(bloomFilterStrategies$LockFreeBitArray.get(l4 = (long)n8 % l2) ? 1 : 0)) != 0) continue;
            return false;
        }
        return bl2;
    }

    public boolean put(Object object, Funnel funnel, int n3, BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray) {
        long l2 = bloomFilterStrategies$LockFreeBitArray.bitSize();
        HashFunction hashFunction = Hashing.murmur3_128();
        long l3 = hashFunction.hashObject(object, funnel).asLong();
        int n4 = (int)l3;
        int n7 = (int)(l3 >>>= 32);
        int n8 = 0;
        object = null;
        for (int i3 = 1; i3 <= n3; ++i3) {
            int n10 = i3 * n7 + n4;
            if (n10 < 0) {
                n10 ^= 0xFFFFFFFF;
            }
            long l4 = (long)n10 % l2;
            n10 = (int)(bloomFilterStrategies$LockFreeBitArray.set(l4) ? 1 : 0);
            n8 |= n10;
        }
        return n8 != 0;
    }
}

