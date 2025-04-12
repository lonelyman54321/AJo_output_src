/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$AbstractReferenceEntry;
import com.google.common.cache.LocalCache$WriteQueue;
import com.google.common.cache.ReferenceEntry;

class LocalCache$WriteQueue$1
extends LocalCache$AbstractReferenceEntry {
    ReferenceEntry nextWrite = this;
    ReferenceEntry previousWrite = this;

    public LocalCache$WriteQueue$1(LocalCache$WriteQueue localCache$WriteQueue) {
    }

    public ReferenceEntry getNextInWriteQueue() {
        return this.nextWrite;
    }

    public ReferenceEntry getPreviousInWriteQueue() {
        return this.previousWrite;
    }

    public long getWriteTime() {
        return Long.MAX_VALUE;
    }

    public void setNextInWriteQueue(ReferenceEntry referenceEntry) {
        this.nextWrite = referenceEntry;
    }

    public void setPreviousInWriteQueue(ReferenceEntry referenceEntry) {
        this.previousWrite = referenceEntry;
    }

    public void setWriteTime(long l2) {
    }
}

