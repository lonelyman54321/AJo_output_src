/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class LocalCache$WeakEntry
extends WeakReference
implements ReferenceEntry {
    final int hash;
    final ReferenceEntry next;
    volatile LocalCache$ValueReference valueReference;

    public LocalCache$WeakEntry(ReferenceQueue object, Object object2, int n3, ReferenceEntry referenceEntry) {
        super(object2, object);
        this.valueReference = object = LocalCache.unset();
        this.hash = n3;
        this.next = referenceEntry;
    }

    public long getAccessTime() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int getHash() {
        return this.hash;
    }

    public Object getKey() {
        return this.get();
    }

    public ReferenceEntry getNext() {
        return this.next;
    }

    public ReferenceEntry getNextInAccessQueue() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public ReferenceEntry getNextInWriteQueue() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public ReferenceEntry getPreviousInAccessQueue() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public ReferenceEntry getPreviousInWriteQueue() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public LocalCache$ValueReference getValueReference() {
        return this.valueReference;
    }

    public long getWriteTime() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void setAccessTime(long l2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void setNextInAccessQueue(ReferenceEntry object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public void setNextInWriteQueue(ReferenceEntry object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public void setPreviousInAccessQueue(ReferenceEntry object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public void setPreviousInWriteQueue(ReferenceEntry object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public void setValueReference(LocalCache$ValueReference localCache$ValueReference) {
        this.valueReference = localCache$ValueReference;
    }

    public void setWriteTime(long l2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

