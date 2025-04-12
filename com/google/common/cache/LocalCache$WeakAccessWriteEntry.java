/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$WeakEntry;
import com.google.common.cache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

final class LocalCache$WeakAccessWriteEntry
extends LocalCache$WeakEntry {
    volatile long accessTime;
    ReferenceEntry nextAccess;
    ReferenceEntry nextWrite;
    ReferenceEntry previousAccess;
    ReferenceEntry previousWrite;
    volatile long writeTime;

    public LocalCache$WeakAccessWriteEntry(ReferenceQueue object, Object object2, int n3, ReferenceEntry referenceEntry) {
        super((ReferenceQueue)object, object2, n3, referenceEntry);
        ReferenceEntry referenceEntry2;
        long l2;
        this.accessTime = l2 = Long.MAX_VALUE;
        this.nextAccess = referenceEntry2 = LocalCache.nullEntry();
        this.previousAccess = referenceEntry2 = LocalCache.nullEntry();
        this.writeTime = l2;
        this.nextWrite = object = LocalCache.nullEntry();
        this.previousWrite = object = LocalCache.nullEntry();
    }

    public long getAccessTime() {
        return this.accessTime;
    }

    public ReferenceEntry getNextInAccessQueue() {
        return this.nextAccess;
    }

    public ReferenceEntry getNextInWriteQueue() {
        return this.nextWrite;
    }

    public ReferenceEntry getPreviousInAccessQueue() {
        return this.previousAccess;
    }

    public ReferenceEntry getPreviousInWriteQueue() {
        return this.previousWrite;
    }

    public long getWriteTime() {
        return this.writeTime;
    }

    public void setAccessTime(long l2) {
        this.accessTime = l2;
    }

    public void setNextInAccessQueue(ReferenceEntry referenceEntry) {
        this.nextAccess = referenceEntry;
    }

    public void setNextInWriteQueue(ReferenceEntry referenceEntry) {
        this.nextWrite = referenceEntry;
    }

    public void setPreviousInAccessQueue(ReferenceEntry referenceEntry) {
        this.previousAccess = referenceEntry;
    }

    public void setPreviousInWriteQueue(ReferenceEntry referenceEntry) {
        this.previousWrite = referenceEntry;
    }

    public void setWriteTime(long l2) {
        this.writeTime = l2;
    }
}

