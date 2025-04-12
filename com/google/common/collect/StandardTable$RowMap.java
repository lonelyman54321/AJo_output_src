/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Maps$ViewCachingAbstractMap;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$RowMap$EntrySet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class StandardTable$RowMap
extends Maps$ViewCachingAbstractMap {
    final /* synthetic */ StandardTable this$0;

    public StandardTable$RowMap(StandardTable standardTable) {
        this.this$0 = standardTable;
    }

    public boolean containsKey(Object object) {
        return this.this$0.containsRow(object);
    }

    public Set createEntrySet() {
        StandardTable$RowMap$EntrySet standardTable$RowMap$EntrySet = new StandardTable$RowMap$EntrySet(this);
        return standardTable$RowMap$EntrySet;
    }

    public Map get(Object object) {
        StandardTable standardTable = this.this$0;
        boolean bl2 = standardTable.containsRow(object);
        if (bl2) {
            standardTable = this.this$0;
            Objects.requireNonNull(object);
            object = standardTable.row(object);
        } else {
            object = null;
        }
        return object;
    }

    public Map remove(Object object) {
        if (object == null) {
            object = null;
        } else {
            Map map2 = this.this$0.backingMap;
            object = (Map)map2.remove(object);
        }
        return object;
    }
}

