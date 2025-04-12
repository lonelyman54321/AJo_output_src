/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps$Values;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$ColumnMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class StandardTable$ColumnMap$ColumnMapValues
extends Maps$Values {
    final /* synthetic */ StandardTable$ColumnMap this$1;

    public StandardTable$ColumnMap$ColumnMapValues(StandardTable$ColumnMap standardTable$ColumnMap) {
        this.this$1 = standardTable$ColumnMap;
        super(standardTable$ColumnMap);
    }

    public boolean remove(Object object) {
        boolean bl2;
        Iterator<Object> iterator = this.this$1.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Map map2 = (Map)entry.getValue();
            boolean bl3 = map2.equals(object);
            if (!bl3) continue;
            object = this.this$1.this$0;
            iterator = entry.getKey();
            StandardTable.access$900((StandardTable)object, iterator);
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        boolean bl2;
        Preconditions.checkNotNull(collection);
        Iterator iterator = Lists.newArrayList(this.this$1.this$0.columnKeySet().iterator()).iterator();
        boolean bl3 = false;
        StandardTable standardTable = null;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            Map map2 = this.this$1.this$0.column(e2);
            boolean bl4 = collection.contains(map2);
            if (!bl4) continue;
            standardTable = this.this$1.this$0;
            StandardTable.access$900(standardTable, e2);
            bl3 = true;
        }
        return bl3;
    }

    public boolean retainAll(Collection collection) {
        boolean bl2;
        Preconditions.checkNotNull(collection);
        Iterator iterator = Lists.newArrayList(this.this$1.this$0.columnKeySet().iterator()).iterator();
        boolean bl3 = false;
        StandardTable standardTable = null;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            Map map2 = this.this$1.this$0.column(e2);
            boolean bl4 = collection.contains(map2);
            if (bl4) continue;
            standardTable = this.this$1.this$0;
            StandardTable.access$900(standardTable, e2);
            bl3 = true;
        }
        return bl3;
    }
}

