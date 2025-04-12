/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$InternalEntry;
import com.google.common.collect.MapMakerInternalMap$Segment;
import com.google.common.collect.MapMakerInternalMap$WriteThroughEntry;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class MapMakerInternalMap$HashIterator
implements Iterator {
    MapMakerInternalMap$Segment currentSegment;
    AtomicReferenceArray currentTable;
    MapMakerInternalMap$WriteThroughEntry lastReturned;
    MapMakerInternalMap$InternalEntry nextEntry;
    MapMakerInternalMap$WriteThroughEntry nextExternal;
    int nextSegmentIndex;
    int nextTableIndex;
    final /* synthetic */ MapMakerInternalMap this$0;

    public MapMakerInternalMap$HashIterator(MapMakerInternalMap mapMakerInternalMap) {
        int n3;
        this.this$0 = mapMakerInternalMap;
        this.nextSegmentIndex = n3 = mapMakerInternalMap.segments.length + -1;
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
            MapMakerInternalMap$Segment[] mapMakerInternalMap$SegmentArray = this.this$0.segments;
            this.nextSegmentIndex = n4 = n3 + -1;
            serializable = mapMakerInternalMap$SegmentArray[n3];
            this.currentSegment = serializable;
            n3 = ((MapMakerInternalMap$Segment)serializable).count;
            if (n3 == 0) continue;
            serializable = this.currentSegment.table;
            this.currentTable = serializable;
            this.nextTableIndex = n3 = ((AtomicReferenceArray)serializable).length() + -1;
            n3 = (int)(this.nextInTable() ? 1 : 0);
            if (n3 == 0) continue;
        }
    }

    public boolean advanceTo(MapMakerInternalMap$InternalEntry object) {
        Throwable throwable2;
        block9: {
            block8: {
                Object object2;
                try {
                    object2 = object.getKey();
                }
                catch (Throwable throwable2) {}
                Object object3 = this.this$0;
                object = ((MapMakerInternalMap)object3).getLiveValue((MapMakerInternalMap$InternalEntry)object);
                if (object == null) break block8;
                MapMakerInternalMap mapMakerInternalMap = this.this$0;
                object3 = new MapMakerInternalMap$WriteThroughEntry(mapMakerInternalMap, object2, object);
                this.nextExternal = object3;
                this.currentSegment.postReadCleanup();
                return true;
                break block9;
            }
            this.currentSegment.postReadCleanup();
            return false;
        }
        this.currentSegment.postReadCleanup();
        throw throwable2;
    }

    public boolean hasNext() {
        boolean bl2;
        MapMakerInternalMap$WriteThroughEntry mapMakerInternalMap$WriteThroughEntry = this.nextExternal;
        if (mapMakerInternalMap$WriteThroughEntry != null) {
            bl2 = true;
        } else {
            bl2 = false;
            mapMakerInternalMap$WriteThroughEntry = null;
        }
        return bl2;
    }

    public abstract Object next();

    public MapMakerInternalMap$WriteThroughEntry nextEntry() {
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
        MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry = this.nextEntry;
        if (mapMakerInternalMap$InternalEntry != null) {
            while ((mapMakerInternalMap$InternalEntry = (this.nextEntry = (mapMakerInternalMap$InternalEntry = mapMakerInternalMap$InternalEntry.getNext()))) != null) {
                boolean bl2 = this.advanceTo(mapMakerInternalMap$InternalEntry);
                if (bl2) {
                    return true;
                }
                mapMakerInternalMap$InternalEntry = this.nextEntry;
            }
        }
        return false;
    }

    public boolean nextInTable() {
        int n3;
        while ((n3 = this.nextTableIndex) >= 0) {
            MapMakerInternalMap$InternalEntry mapMakerInternalMap$InternalEntry;
            int n4;
            AtomicReferenceArray atomicReferenceArray = this.currentTable;
            this.nextTableIndex = n4 = n3 + -1;
            this.nextEntry = mapMakerInternalMap$InternalEntry = (MapMakerInternalMap$InternalEntry)atomicReferenceArray.get(n3);
            if (mapMakerInternalMap$InternalEntry == null || (n3 = (int)(this.advanceTo(mapMakerInternalMap$InternalEntry) ? 1 : 0)) == 0 && (n3 = (int)(this.nextInChain() ? 1 : 0)) == 0) continue;
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
        CollectPreconditions.checkRemove(bl2);
        object = this.this$0;
        Object object2 = this.lastReturned.getKey();
        ((MapMakerInternalMap)object).remove(object2);
        this.lastReturned = null;
    }
}

