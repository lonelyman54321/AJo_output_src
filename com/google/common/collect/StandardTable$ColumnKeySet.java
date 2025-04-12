/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$1;
import com.google.common.collect.StandardTable$TableSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class StandardTable$ColumnKeySet
extends StandardTable$TableSet {
    final /* synthetic */ StandardTable this$0;

    private StandardTable$ColumnKeySet(StandardTable standardTable) {
        this.this$0 = standardTable;
        super(standardTable, null);
    }

    public /* synthetic */ StandardTable$ColumnKeySet(StandardTable standardTable, StandardTable$1 standardTable$1) {
        this(standardTable);
    }

    public boolean contains(Object object) {
        return this.this$0.containsColumn(object);
    }

    public Iterator iterator() {
        return this.this$0.createColumnKeyIterator();
    }

    public boolean remove(Object object) {
        boolean bl2;
        boolean bl3 = false;
        if (object == null) {
            return false;
        }
        Iterator iterator = this.this$0.backingMap.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Map map2 = (Map)iterator.next();
            Set set = map2.keySet();
            boolean bl4 = set.remove(object);
            if (!bl4) continue;
            bl3 = map2.isEmpty();
            if (bl3) {
                iterator.remove();
            }
            bl3 = true;
        }
        return bl3;
    }

    public boolean removeAll(Collection collection) {
        boolean bl2;
        Preconditions.checkNotNull(collection);
        Iterator iterator = this.this$0.backingMap.values().iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Map map2 = (Map)iterator.next();
            Iterator iterator2 = map2.keySet().iterator();
            boolean bl4 = Iterators.removeAll(iterator2, collection);
            if (!bl4) continue;
            bl3 = map2.isEmpty();
            if (bl3) {
                iterator.remove();
            }
            bl3 = true;
        }
        return bl3;
    }

    public boolean retainAll(Collection collection) {
        boolean bl2;
        Preconditions.checkNotNull(collection);
        Iterator iterator = this.this$0.backingMap.values().iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            Map map2 = (Map)iterator.next();
            Set set = map2.keySet();
            boolean bl4 = set.retainAll(collection);
            if (!bl4) continue;
            bl3 = map2.isEmpty();
            if (bl3) {
                iterator.remove();
            }
            bl3 = true;
        }
        return bl3;
    }

    public int size() {
        return Iterators.size(this.iterator());
    }
}

