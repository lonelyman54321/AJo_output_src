/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps$IteratorBasedAbstractMap;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$Row$1;
import com.google.common.collect.StandardTable$Row$2;
import java.util.Iterator;
import java.util.Map;

class StandardTable$Row
extends Maps$IteratorBasedAbstractMap {
    Map backingRowMap;
    final Object rowKey;
    final /* synthetic */ StandardTable this$0;

    public StandardTable$Row(StandardTable object, Object object2) {
        this.this$0 = object;
        this.rowKey = object = Preconditions.checkNotNull(object2);
    }

    public void clear() {
        this.updateBackingRowMapField();
        Map map2 = this.backingRowMap;
        if (map2 != null) {
            map2.clear();
        }
        this.maintainEmptyInvariant();
    }

    public Map computeBackingRowMap() {
        Map map2 = this.this$0.backingMap;
        Object object = this.rowKey;
        return (Map)map2.get(object);
    }

    public boolean containsKey(Object object) {
        boolean bl2;
        Map map2;
        this.updateBackingRowMapField();
        if (object != null && (map2 = this.backingRowMap) != null && (bl2 = Maps.safeContainsKey(map2, object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Iterator entryIterator() {
        this.updateBackingRowMapField();
        Object object = this.backingRowMap;
        if (object == null) {
            return Iterators.emptyModifiableIterator();
        }
        object = object.entrySet().iterator();
        StandardTable$Row$1 standardTable$Row$1 = new StandardTable$Row$1(this, (Iterator)object);
        return standardTable$Row$1;
    }

    public Object get(Object object) {
        Map map2;
        this.updateBackingRowMapField();
        object = object != null && (map2 = this.backingRowMap) != null ? Maps.safeGet(map2, object) : null;
        return object;
    }

    public void maintainEmptyInvariant() {
        boolean bl2;
        this.updateBackingRowMapField();
        Map map2 = this.backingRowMap;
        if (map2 != null && (bl2 = map2.isEmpty())) {
            map2 = this.this$0.backingMap;
            Object object = this.rowKey;
            map2.remove(object);
            bl2 = false;
            map2 = null;
            this.backingRowMap = null;
        }
    }

    public Object put(Object object, Object object2) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        Object object3 = this.backingRowMap;
        if (object3 != null && !(bl2 = object3.isEmpty())) {
            return this.backingRowMap.put(object, object2);
        }
        object3 = this.this$0;
        Object object4 = this.rowKey;
        return ((StandardTable)object3).put(object4, object, object2);
    }

    public Object remove(Object object) {
        this.updateBackingRowMapField();
        Map map2 = this.backingRowMap;
        if (map2 == null) {
            return null;
        }
        object = Maps.safeRemove(map2, object);
        this.maintainEmptyInvariant();
        return object;
    }

    public int size() {
        int n3;
        this.updateBackingRowMapField();
        Map map2 = this.backingRowMap;
        if (map2 == null) {
            n3 = 0;
            map2 = null;
        } else {
            n3 = map2.size();
        }
        return n3;
    }

    public final void updateBackingRowMapField() {
        Object object;
        boolean bl2;
        Map map2 = this.backingRowMap;
        if (map2 == null || (bl2 = map2.isEmpty()) && (bl2 = (map2 = this.this$0.backingMap).containsKey(object = this.rowKey))) {
            this.backingRowMap = map2 = this.computeBackingRowMap();
        }
    }

    public Map.Entry wrapEntry(Map.Entry entry) {
        StandardTable$Row$2 standardTable$Row$2 = new StandardTable$Row$2(this, entry);
        return standardTable$Row$2;
    }
}

