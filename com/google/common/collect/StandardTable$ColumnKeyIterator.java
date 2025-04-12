/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$1;
import java.util.Iterator;
import java.util.Map;

class StandardTable$ColumnKeyIterator
extends AbstractIterator {
    Iterator entryIterator;
    final Iterator mapIterator;
    final Map seen;
    final /* synthetic */ StandardTable this$0;

    private StandardTable$ColumnKeyIterator(StandardTable object) {
        Map map2;
        this.this$0 = object;
        this.seen = map2 = (Map)((StandardTable)object).factory.get();
        this.mapIterator = object = ((StandardTable)object).backingMap.values().iterator();
        this.entryIterator = object = Iterators.emptyIterator();
    }

    public /* synthetic */ StandardTable$ColumnKeyIterator(StandardTable standardTable, StandardTable$1 standardTable$1) {
        this(standardTable);
    }

    public Object computeNext() {
        while (true) {
            Object object;
            boolean bl2;
            if (bl2 = (object = this.entryIterator).hasNext()) {
                Map map2 = this.seen;
                object = (Map.Entry)this.entryIterator.next();
                Object k2 = object.getKey();
                boolean bl3 = map2.containsKey(k2);
                if (bl3) continue;
                map2 = this.seen;
                k2 = object.getKey();
                Object v4 = object.getValue();
                map2.put(k2, v4);
                return object.getKey();
            }
            object = this.mapIterator;
            bl2 = object.hasNext();
            if (!bl2) break;
            this.entryIterator = object = ((Map)this.mapIterator.next()).entrySet().iterator();
        }
        return this.endOfData();
    }
}

