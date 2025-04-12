/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$1;
import com.google.common.collect.StandardTable$Column;
import com.google.common.collect.StandardTable$Column$EntrySetIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class StandardTable$Column$EntrySet
extends Sets$ImprovedAbstractSet {
    final /* synthetic */ StandardTable$Column this$1;

    private StandardTable$Column$EntrySet(StandardTable$Column column) {
        this.this$1 = column;
    }

    public /* synthetic */ StandardTable$Column$EntrySet(StandardTable$Column column, StandardTable$1 standardTable$1) {
        this(column);
    }

    public void clear() {
        StandardTable$Column standardTable$Column = this.this$1;
        Predicate predicate = Predicates.alwaysTrue();
        standardTable$Column.removeFromColumnIf(predicate);
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            object = (Map.Entry)object;
            StandardTable standardTable = this.this$1.this$0;
            Object k2 = object.getKey();
            Object object2 = this.this$1.columnKey;
            object = object.getValue();
            return StandardTable.access$300(standardTable, k2, object2, object);
        }
        return false;
    }

    public boolean isEmpty() {
        Object object = this.this$1;
        StandardTable standardTable = ((StandardTable$Column)object).this$0;
        object = ((StandardTable$Column)object).columnKey;
        return standardTable.containsColumn(object) ^ true;
    }

    public Iterator iterator() {
        StandardTable$Column standardTable$Column = this.this$1;
        StandardTable$Column$EntrySetIterator standardTable$Column$EntrySetIterator = new StandardTable$Column$EntrySetIterator(standardTable$Column, null);
        return standardTable$Column$EntrySetIterator;
    }

    public boolean remove(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            object = (Map.Entry)object;
            StandardTable standardTable = this.this$1.this$0;
            Object k2 = object.getKey();
            Object object2 = this.this$1.columnKey;
            object = object.getValue();
            return StandardTable.access$400(standardTable, k2, object2, object);
        }
        return false;
    }

    public boolean retainAll(Collection object) {
        StandardTable$Column standardTable$Column = this.this$1;
        object = Predicates.not(Predicates.in((Collection)object));
        return standardTable$Column.removeFromColumnIf((Predicate)object);
    }

    public int size() {
        boolean bl2;
        Iterator iterator = this.this$1.this$0.backingMap.values().iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            Object object;
            Map map2 = (Map)iterator.next();
            bl2 = map2.containsKey(object = this.this$1.columnKey);
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }
}

