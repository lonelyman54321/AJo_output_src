/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.LocalCache$WriteThroughEntry;
import com.google.common.cache.ReferenceEntry;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class LocalCache$HashIterator
implements Iterator {
    LocalCache$Segment currentSegment;
    AtomicReferenceArray currentTable;
    LocalCache$WriteThroughEntry lastReturned;
    ReferenceEntry nextEntry;
    LocalCache$WriteThroughEntry nextExternal;
    int nextSegmentIndex;
    int nextTableIndex;
    final /* synthetic */ LocalCache this$0;

    public LocalCache$HashIterator(LocalCache localCache) {
        int n3;
        this.this$0 = localCache;
        this.nextSegmentIndex = n3 = localCache.segments.length + -1;
        this.nextTableIndex = -1;
        this.advance();
    }

    public final void advance() {
        Serializable serializable = null;
        this.nextExternal = null;
        int n3 = this.nextInChain();
        if (n3 != 0) {
            return;
        }
        n3 = this.nextInTable();
        if (n3 != 0) {
            return;
        }
        while ((n3 = this.nextSegmentIndex) >= 0) {
            int n4;
            LocalCache$Segment[] localCache$SegmentArray = this.this$0.segments;
            this.nextSegmentIndex = n4 = n3 + -1;
            serializable = localCache$SegmentArray[n3];
            this.currentSegment = serializable;
            n3 = ((LocalCache$Segment)serializable).count;
            if (n3 == 0) continue;
            serializable = this.currentSegment.table;
            this.currentTable = serializable;
            this.nextTableIndex = n3 = ((AtomicReferenceArray)serializable).length() + -1;
            n3 = (int)(this.nextInTable() ? 1 : 0);
            if (n3 == 0) continue;
        }
    }

    public boolean advanceTo(ReferenceEntry object) {
        Throwable throwable2;
        block12: {
            block11: {
                Object object2;
                try {
                    object2 = this.this$0;
                }
                catch (Throwable throwable2) {}
                object2 = ((LocalCache)object2).ticker;
                long l2 = ((Ticker)object2).read();
                Object object3 = object.getKey();
                LocalCache localCache = this.this$0;
                object = localCache.getLiveValue((ReferenceEntry)object, l2);
                if (object == null) break block11;
                LocalCache localCache2 = this.this$0;
                object2 = new LocalCache$WriteThroughEntry(localCache2, object3, object);
                this.nextExternal = object2;
                this.currentSegment.postReadCleanup();
                return true;
                break block12;
            }
            this.currentSegment.postReadCleanup();
            return false;
        }
        this.currentSegment.postReadCleanup();
        throw throwable2;
    }

    public boolean hasNext() {
        boolean bl2;
        LocalCache$WriteThroughEntry localCache$WriteThroughEntry = this.nextExternal;
        if (localCache$WriteThroughEntry != null) {
            bl2 = true;
        } else {
            bl2 = false;
            localCache$WriteThroughEntry = null;
        }
        return bl2;
    }

    public abstract Object next();

    public LocalCache$WriteThroughEntry nextEntry() {
        Object object = this.nextExternal;
        if (object != null) {
            this.lastReturned = object;
            this.advance();
            return this.lastReturned;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public boolean nextInChain() {
        ReferenceEntry referenceEntry = this.nextEntry;
        if (referenceEntry != null) {
            while ((referenceEntry = (this.nextEntry = (referenceEntry = referenceEntry.getNext()))) != null) {
                boolean bl2 = this.advanceTo(referenceEntry);
                if (bl2) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }
        return false;
    }

    public boolean nextInTable() {
        int n3;
        while ((n3 = this.nextTableIndex) >= 0) {
            ReferenceEntry referenceEntry;
            int n4;
            AtomicReferenceArray atomicReferenceArray = this.currentTable;
            this.nextTableIndex = n4 = n3 + -1;
            this.nextEntry = referenceEntry = (ReferenceEntry)atomicReferenceArray.get(n3);
            if (referenceEntry == null || (n3 = (int)(this.advanceTo(referenceEntry) ? 1 : 0)) == 0 && (n3 = (int)(this.nextInChain() ? 1 : 0)) == 0) continue;
            return true;
        }
        return false;
    }

    public void remove() {
        boolean bl2;
        Object object = this.lastReturned;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2);
        object = this.this$0;
        Object object2 = this.lastReturned.getKey();
        ((LocalCache)object).remove(object2);
        this.lastReturned = null;
    }
}

