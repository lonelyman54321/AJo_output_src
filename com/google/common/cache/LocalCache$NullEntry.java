/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.ReferenceEntry;

final class LocalCache$NullEntry
extends Enum
implements ReferenceEntry {
    private static final /* synthetic */ LocalCache$NullEntry[] $VALUES;
    public static final /* enum */ LocalCache$NullEntry INSTANCE;

    private static /* synthetic */ LocalCache$NullEntry[] $values() {
        LocalCache$NullEntry localCache$NullEntry = INSTANCE;
        LocalCache$NullEntry[] localCache$NullEntryArray = new LocalCache$NullEntry[]{localCache$NullEntry};
        return localCache$NullEntryArray;
    }

    static {
        LocalCache$NullEntry localCache$NullEntry;
        INSTANCE = localCache$NullEntry = new LocalCache$NullEntry("INSTANCE", 0);
        $VALUES = LocalCache$NullEntry.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LocalCache$NullEntry() {
        void var2_-1;
        void var1_-1;
    }

    public static LocalCache$NullEntry valueOf(String string2) {
        return Enum.valueOf(LocalCache$NullEntry.class, string2);
    }

    public static LocalCache$NullEntry[] values() {
        return (LocalCache$NullEntry[])$VALUES.clone();
    }

    public long getAccessTime() {
        return 0L;
    }

    public int getHash() {
        return 0;
    }

    public Object getKey() {
        return null;
    }

    public ReferenceEntry getNext() {
        return null;
    }

    public ReferenceEntry getNextInAccessQueue() {
        return this;
    }

    public ReferenceEntry getNextInWriteQueue() {
        return this;
    }

    public ReferenceEntry getPreviousInAccessQueue() {
        return this;
    }

    public ReferenceEntry getPreviousInWriteQueue() {
        return this;
    }

    public LocalCache$ValueReference getValueReference() {
        return null;
    }

    public long getWriteTime() {
        return 0L;
    }

    public void setAccessTime(long l2) {
    }

    public void setNextInAccessQueue(ReferenceEntry referenceEntry) {
    }

    public void setNextInWriteQueue(ReferenceEntry referenceEntry) {
    }

    public void setPreviousInAccessQueue(ReferenceEntry referenceEntry) {
    }

    public void setPreviousInWriteQueue(ReferenceEntry referenceEntry) {
    }

    public void setValueReference(LocalCache$ValueReference localCache$ValueReference) {
    }

    public void setWriteTime(long l2) {
    }
}

