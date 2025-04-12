/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractTable$1;
import com.google.common.collect.AbstractTable$CellSet;
import com.google.common.collect.AbstractTable$Values;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Table$Cell;
import com.google.common.collect.Tables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class AbstractTable
implements Table {
    private transient Set cellSet;
    private transient Collection values;

    public abstract Iterator cellIterator();

    public Set cellSet() {
        Set set = this.cellSet;
        if (set == null) {
            this.cellSet = set = this.createCellSet();
        }
        return set;
    }

    public void clear() {
        Iterators.clear(this.cellSet().iterator());
    }

    public Set columnKeySet() {
        return this.columnMap().keySet();
    }

    public boolean contains(Object object, Object object2) {
        boolean bl2;
        Map map2 = this.rowMap();
        object = (Map)Maps.safeGet(map2, object);
        if (object != null && (bl2 = Maps.safeContainsKey((Map)object, object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean containsColumn(Object object) {
        return Maps.safeContainsKey(this.columnMap(), object);
    }

    public boolean containsRow(Object object) {
        return Maps.safeContainsKey(this.rowMap(), object);
    }

    public boolean containsValue(Object object) {
        boolean bl2;
        Iterator iterator = this.rowMap().values().iterator();
        while (bl2 = iterator.hasNext()) {
            Map map2 = (Map)iterator.next();
            bl2 = map2.containsValue(object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public Set createCellSet() {
        AbstractTable$CellSet abstractTable$CellSet = new AbstractTable$CellSet(this);
        return abstractTable$CellSet;
    }

    public Collection createValues() {
        AbstractTable$Values abstractTable$Values = new AbstractTable$Values(this);
        return abstractTable$Values;
    }

    public boolean equals(Object object) {
        return Tables.equalsImpl(this, object);
    }

    public Object get(Object object, Object object2) {
        Map map2 = this.rowMap();
        object = (Map)Maps.safeGet(map2, object);
        object = object == null ? null : Maps.safeGet((Map)object, object2);
        return object;
    }

    public int hashCode() {
        return this.cellSet().hashCode();
    }

    public boolean isEmpty() {
        int n3 = this.size();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public Object put(Object object, Object object2, Object object3) {
        return this.row(object).put(object2, object3);
    }

    public void putAll(Table object) {
        boolean bl2;
        object = object.cellSet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Table$Cell)object.next();
            Object object3 = object2.getRowKey();
            Object object4 = object2.getColumnKey();
            object2 = object2.getValue();
            this.put(object3, object4, object2);
        }
    }

    public Object remove(Object object, Object object2) {
        Map map2 = this.rowMap();
        object = (Map)Maps.safeGet(map2, object);
        object = object == null ? null : Maps.safeRemove((Map)object, object2);
        return object;
    }

    public Set rowKeySet() {
        return this.rowMap().keySet();
    }

    public String toString() {
        return this.rowMap().toString();
    }

    public Collection values() {
        Collection collection = this.values;
        if (collection == null) {
            this.values = collection = this.createValues();
        }
        return collection;
    }

    public Iterator valuesIterator() {
        Iterator iterator = this.cellSet().iterator();
        AbstractTable$1 abstractTable$1 = new AbstractTable$1(this, iterator);
        return abstractTable$1;
    }
}

