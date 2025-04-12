/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.Weigher;

final class CacheBuilder$OneWeigher
extends Enum
implements Weigher {
    private static final /* synthetic */ CacheBuilder$OneWeigher[] $VALUES;
    public static final /* enum */ CacheBuilder$OneWeigher INSTANCE;

    private static /* synthetic */ CacheBuilder$OneWeigher[] $values() {
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher = INSTANCE;
        CacheBuilder$OneWeigher[] cacheBuilder$OneWeigherArray = new CacheBuilder$OneWeigher[]{cacheBuilder$OneWeigher};
        return cacheBuilder$OneWeigherArray;
    }

    static {
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher;
        INSTANCE = cacheBuilder$OneWeigher = new CacheBuilder$OneWeigher("INSTANCE", 0);
        $VALUES = CacheBuilder$OneWeigher.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CacheBuilder$OneWeigher() {
        void var2_-1;
        void var1_-1;
    }

    public static CacheBuilder$OneWeigher valueOf(String string2) {
        return Enum.valueOf(CacheBuilder$OneWeigher.class, string2);
    }

    public static CacheBuilder$OneWeigher[] values() {
        return (CacheBuilder$OneWeigher[])$VALUES.clone();
    }

    public int weigh(Object object, Object object2) {
        return 1;
    }
}

