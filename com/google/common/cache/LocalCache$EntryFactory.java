/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$1;
import com.google.common.cache.LocalCache$EntryFactory$1;
import com.google.common.cache.LocalCache$EntryFactory$2;
import com.google.common.cache.LocalCache$EntryFactory$3;
import com.google.common.cache.LocalCache$EntryFactory$4;
import com.google.common.cache.LocalCache$EntryFactory$5;
import com.google.common.cache.LocalCache$EntryFactory$6;
import com.google.common.cache.LocalCache$EntryFactory$7;
import com.google.common.cache.LocalCache$EntryFactory$8;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.cache.ReferenceEntry;

abstract class LocalCache$EntryFactory
extends Enum {
    private static final /* synthetic */ LocalCache$EntryFactory[] $VALUES;
    static final int ACCESS_MASK = 1;
    public static final /* enum */ LocalCache$EntryFactory STRONG;
    public static final /* enum */ LocalCache$EntryFactory STRONG_ACCESS;
    public static final /* enum */ LocalCache$EntryFactory STRONG_ACCESS_WRITE;
    public static final /* enum */ LocalCache$EntryFactory STRONG_WRITE;
    public static final /* enum */ LocalCache$EntryFactory WEAK;
    public static final /* enum */ LocalCache$EntryFactory WEAK_ACCESS;
    public static final /* enum */ LocalCache$EntryFactory WEAK_ACCESS_WRITE;
    static final int WEAK_MASK = 4;
    public static final /* enum */ LocalCache$EntryFactory WEAK_WRITE;
    static final int WRITE_MASK = 2;
    static final LocalCache$EntryFactory[] factories;

    private static /* synthetic */ LocalCache$EntryFactory[] $values() {
        LocalCache$EntryFactory localCache$EntryFactory = STRONG;
        localCache$EntryFactory = STRONG_ACCESS;
        localCache$EntryFactory = STRONG_WRITE;
        localCache$EntryFactory = STRONG_ACCESS_WRITE;
        localCache$EntryFactory = WEAK;
        localCache$EntryFactory = WEAK_ACCESS;
        localCache$EntryFactory = WEAK_WRITE;
        localCache$EntryFactory = WEAK_ACCESS_WRITE;
        LocalCache$EntryFactory[] localCache$EntryFactoryArray = new LocalCache$EntryFactory[]{localCache$EntryFactory, localCache$EntryFactory, localCache$EntryFactory, localCache$EntryFactory, localCache$EntryFactory, localCache$EntryFactory, localCache$EntryFactory, localCache$EntryFactory};
        return localCache$EntryFactoryArray;
    }

    static {
        LocalCache$EntryFactory$1 localCache$EntryFactory$1 = new LocalCache$EntryFactory$1();
        STRONG = localCache$EntryFactory$1;
        int n3 = 1;
        LocalCache$EntryFactory$2 localCache$EntryFactory$2 = new LocalCache$EntryFactory$2();
        STRONG_ACCESS = localCache$EntryFactory$2;
        int n4 = 2;
        LocalCache$EntryFactory$3 localCache$EntryFactory$3 = new LocalCache$EntryFactory$3();
        STRONG_WRITE = localCache$EntryFactory$3;
        int n7 = 3;
        LocalCache$EntryFactory$4 localCache$EntryFactory$4 = new LocalCache$EntryFactory$4();
        STRONG_ACCESS_WRITE = localCache$EntryFactory$4;
        int n8 = 4;
        LocalCache$EntryFactory$5 localCache$EntryFactory$5 = new LocalCache$EntryFactory$5();
        WEAK = localCache$EntryFactory$5;
        int n10 = 5;
        LocalCache$EntryFactory$6 localCache$EntryFactory$6 = new LocalCache$EntryFactory$6();
        WEAK_ACCESS = localCache$EntryFactory$6;
        LocalCache$EntryFactory$7 localCache$EntryFactory$7 = new LocalCache$EntryFactory$7();
        WEAK_WRITE = localCache$EntryFactory$7;
        int n14 = 7;
        LocalCache$EntryFactory$8 localCache$EntryFactory$8 = new LocalCache$EntryFactory$8();
        WEAK_ACCESS_WRITE = localCache$EntryFactory$8;
        $VALUES = LocalCache$EntryFactory.$values();
        LocalCache$EntryFactory[] localCache$EntryFactoryArray = new LocalCache$EntryFactory[8];
        localCache$EntryFactoryArray[0] = localCache$EntryFactory$1;
        localCache$EntryFactoryArray[n3] = localCache$EntryFactory$2;
        localCache$EntryFactoryArray[n4] = localCache$EntryFactory$3;
        localCache$EntryFactoryArray[n7] = localCache$EntryFactory$4;
        localCache$EntryFactoryArray[n8] = localCache$EntryFactory$5;
        localCache$EntryFactoryArray[n10] = localCache$EntryFactory$6;
        localCache$EntryFactoryArray[6] = localCache$EntryFactory$7;
        localCache$EntryFactoryArray[n14] = localCache$EntryFactory$8;
        factories = localCache$EntryFactoryArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LocalCache$EntryFactory() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ LocalCache$EntryFactory(LocalCache.1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static LocalCache$EntryFactory getFactory(LocalCache$Strength localCache$Strength, boolean bl2, boolean bl3) {
        int n3;
        LocalCache$Strength localCache$Strength2 = LocalCache$Strength.WEAK;
        int n4 = 0;
        if (localCache$Strength == localCache$Strength2) {
            n3 = 4;
        } else {
            n3 = 0;
            localCache$Strength = null;
        }
        n3 |= bl2;
        if (bl3) {
            n4 = 2;
        }
        return factories[n3 |= n4];
    }

    public static LocalCache$EntryFactory valueOf(String string2) {
        return Enum.valueOf(LocalCache$EntryFactory.class, string2);
    }

    public static LocalCache$EntryFactory[] values() {
        return (LocalCache$EntryFactory[])$VALUES.clone();
    }

    public void copyAccessEntry(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        long l2 = referenceEntry.getAccessTime();
        referenceEntry2.setAccessTime(l2);
        LocalCache.connectAccessOrder(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
        ReferenceEntry referenceEntry3 = referenceEntry.getNextInAccessQueue();
        LocalCache.connectAccessOrder(referenceEntry2, referenceEntry3);
        LocalCache.nullifyAccessOrder(referenceEntry);
    }

    public ReferenceEntry copyEntry(LocalCache.Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object object) {
        int n3 = referenceEntry.getHash();
        return this.newEntry(segment, object, n3, referenceEntry2);
    }

    public void copyWriteEntry(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
        long l2 = referenceEntry.getWriteTime();
        referenceEntry2.setWriteTime(l2);
        LocalCache.connectWriteOrder(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
        ReferenceEntry referenceEntry3 = referenceEntry.getNextInWriteQueue();
        LocalCache.connectWriteOrder(referenceEntry2, referenceEntry3);
        LocalCache.nullifyWriteOrder(referenceEntry);
    }

    public abstract ReferenceEntry newEntry(LocalCache.Segment var1, Object var2, int var3, ReferenceEntry var4);
}

