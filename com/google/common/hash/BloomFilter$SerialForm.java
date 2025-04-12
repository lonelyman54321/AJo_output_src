/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.BloomFilter$Strategy;
import com.google.common.hash.BloomFilterStrategies$LockFreeBitArray;
import com.google.common.hash.Funnel;
import java.io.Serializable;

class BloomFilter$SerialForm
implements Serializable {
    private static final long serialVersionUID = 1L;
    final long[] data;
    final Funnel funnel;
    final int numHashFunctions;
    final BloomFilter$Strategy strategy;

    public BloomFilter$SerialForm(BloomFilter serializable) {
        int n3;
        Object object = BloomFilterStrategies$LockFreeBitArray.toPlainArray(BloomFilter.access$000((BloomFilter)serializable).data);
        this.data = object;
        this.numHashFunctions = n3 = BloomFilter.access$100(serializable);
        object = BloomFilter.access$200(serializable);
        this.funnel = object;
        serializable = BloomFilter.access$300(serializable);
        this.strategy = serializable;
    }

    public Object readResolve() {
        BloomFilter bloomFilter;
        Object object = this.data;
        BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray = new BloomFilterStrategies$LockFreeBitArray((long[])object);
        int n3 = this.numHashFunctions;
        Funnel funnel = this.funnel;
        BloomFilter$Strategy bloomFilter$Strategy = this.strategy;
        object = bloomFilter;
        bloomFilter = new BloomFilter(bloomFilterStrategies$LockFreeBitArray, n3, funnel, bloomFilter$Strategy, null);
        return bloomFilter;
    }
}

