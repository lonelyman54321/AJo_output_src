/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$AbstractReferenceEntry;
import com.google.common.cache.LocalCache$AccessQueue;
import com.google.common.cache.ReferenceEntry;

class LocalCache$AccessQueue$1
extends LocalCache$AbstractReferenceEntry {
    ReferenceEntry nextAccess = this;
    ReferenceEntry previousAccess = this;

    public LocalCache$AccessQueue$1(LocalCache$AccessQueue localCache$AccessQueue) {
    }

    public long getAccessTime() {
        return Long.MAX_VALUE;
    }

    public ReferenceEntry getNextInAccessQueue() {
        return this.nextAccess;
    }

    public ReferenceEntry getPreviousInAccessQueue() {
        return this.previousAccess;
    }

    public void setAccessTime(long l2) {
    }

    public void setNextInAccessQueue(ReferenceEntry referenceEntry) {
        this.nextAccess = referenceEntry;
    }

    public void setPreviousInAccessQueue(ReferenceEntry referenceEntry) {
        this.previousAccess = referenceEntry;
    }
}

