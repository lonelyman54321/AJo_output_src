/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.BloomFilter$Strategy;
import com.google.common.hash.BloomFilterStrategies$1;
import com.google.common.hash.BloomFilterStrategies$2;

abstract class BloomFilterStrategies
extends Enum
implements BloomFilter$Strategy {
    private static final /* synthetic */ BloomFilterStrategies[] $VALUES;
    public static final /* enum */ BloomFilterStrategies MURMUR128_MITZ_32;
    public static final /* enum */ BloomFilterStrategies MURMUR128_MITZ_64;

    private static /* synthetic */ BloomFilterStrategies[] $values() {
        BloomFilterStrategies bloomFilterStrategies = MURMUR128_MITZ_32;
        bloomFilterStrategies = MURMUR128_MITZ_64;
        BloomFilterStrategies[] bloomFilterStrategiesArray = new BloomFilterStrategies[]{bloomFilterStrategies, bloomFilterStrategies};
        return bloomFilterStrategiesArray;
    }

    static {
        BloomFilterStrategies bloomFilterStrategies = new BloomFilterStrategies$1();
        MURMUR128_MITZ_32 = bloomFilterStrategies;
        bloomFilterStrategies = new BloomFilterStrategies$2();
        MURMUR128_MITZ_64 = bloomFilterStrategies;
        $VALUES = BloomFilterStrategies.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BloomFilterStrategies() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ BloomFilterStrategies(BloomFilterStrategies$1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static BloomFilterStrategies valueOf(String string2) {
        return Enum.valueOf(BloomFilterStrategies.class, string2);
    }

    public static BloomFilterStrategies[] values() {
        return (BloomFilterStrategies[])$VALUES.clone();
    }
}

