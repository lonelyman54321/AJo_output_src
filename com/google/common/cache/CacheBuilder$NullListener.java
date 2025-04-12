/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

final class CacheBuilder$NullListener
extends Enum
implements RemovalListener {
    private static final /* synthetic */ CacheBuilder$NullListener[] $VALUES;
    public static final /* enum */ CacheBuilder$NullListener INSTANCE;

    private static /* synthetic */ CacheBuilder$NullListener[] $values() {
        CacheBuilder$NullListener cacheBuilder$NullListener = INSTANCE;
        CacheBuilder$NullListener[] cacheBuilder$NullListenerArray = new CacheBuilder$NullListener[]{cacheBuilder$NullListener};
        return cacheBuilder$NullListenerArray;
    }

    static {
        CacheBuilder$NullListener cacheBuilder$NullListener;
        INSTANCE = cacheBuilder$NullListener = new CacheBuilder$NullListener("INSTANCE", 0);
        $VALUES = CacheBuilder$NullListener.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CacheBuilder$NullListener() {
        void var2_-1;
        void var1_-1;
    }

    public static CacheBuilder$NullListener valueOf(String string2) {
        return Enum.valueOf(CacheBuilder$NullListener.class, string2);
    }

    public static CacheBuilder$NullListener[] values() {
        return (CacheBuilder$NullListener[])$VALUES.clone();
    }

    public void onRemoval(RemovalNotification removalNotification) {
    }
}

