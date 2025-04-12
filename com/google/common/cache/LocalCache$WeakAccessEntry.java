/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$WeakEntry;
import com.google.common.cache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

final class LocalCache$WeakAccessEntry
extends LocalCache$WeakEntry {
    volatile long accessTime = Long.MAX_VALUE;
    ReferenceEntry nextAccess;
    ReferenceEntry previousAccess;

    public LocalCache$WeakAccessEntry(ReferenceQueue object, Object object2, int n3, ReferenceEntry referenceEntry) {
        super((ReferenceQueue)object, object2, n3, referenceEntry);
        this.nextAccess = object = LocalCache.nullEntry();
        this.previousAccess = object = LocalCache.nullEntry();
    }

    public long getAccessTime() {
        return this.accessTime;
    }

    public ReferenceEntry getNextInAccessQueue() {
        return this.nextAccess;
    }

    public ReferenceEntry getPreviousInAccessQueue() {
        return this.previousAccess;
    }

    public void setAccessTime(long l2) {
        this.accessTime = l2;
    }

    public void setNextInAccessQueue(ReferenceEntry referenceEntry) {
        this.nextAccess = referenceEntry;
    }

    public void setPreviousInAccessQueue(ReferenceEntry referenceEntry) {
        this.previousAccess = referenceEntry;
    }
}

