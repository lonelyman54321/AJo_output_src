/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$StrongEntry;
import com.google.common.cache.ReferenceEntry;

final class LocalCache$StrongAccessEntry
extends LocalCache$StrongEntry {
    volatile long accessTime = Long.MAX_VALUE;
    ReferenceEntry nextAccess;
    ReferenceEntry previousAccess;

    public LocalCache$StrongAccessEntry(Object object, int n3, ReferenceEntry referenceEntry) {
        super(object, n3, referenceEntry);
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

