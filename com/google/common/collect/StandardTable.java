/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractTable;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable$CellIterator;
import com.google.common.collect.StandardTable$Column;
import com.google.common.collect.StandardTable$ColumnKeyIterator;
import com.google.common.collect.StandardTable$ColumnKeySet;
import com.google.common.collect.StandardTable$ColumnMap;
import com.google.common.collect.StandardTable$Row;
import com.google.common.collect.StandardTable$RowMap;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class StandardTable
extends AbstractTable
implements Serializable {
    private static final long serialVersionUID;
    final Map backingMap;
    private transient Set columnKeySet;
    private transient StandardTable$ColumnMap columnMap;
    final Supplier factory;
    private transient Map rowMap;

    public StandardTable(Map map2, Supplier supplier) {
        this.backingMap = map2;
        this.factory = supplier;
    }

    public static /* synthetic */ boolean access$300(StandardTable standardTable, Object object, Object object2, Object object3) {
        return standardTable.containsMapping(object, object2, object3);
    }

    public static /* synthetic */ boolean access$400(StandardTable standardTable, Object object, Object object2, Object object3) {
        return standardTable.removeMapping(object, object2, object3);
    }

    public static /* synthetic */ Map access$900(StandardTable standardTable, Object object) {
        return standardTable.removeColumn(object);
    }

    private boolean containsMapping(Object object, Object object2, Object object3) {
        boolean bl2;
        if (object3 != null && (bl2 = object3.equals(object = this.get(object, object2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private Map getOrCreate(Object object) {
        Map map2 = (Map)this.backingMap.get(object);
        if (map2 == null) {
            map2 = (Map)this.factory.get();
            Map map3 = this.backingMap;
            map3.put(object, map2);
        }
        return map2;
    }

    private Map removeColumn(Object object) {
        boolean bl2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator iterator = this.backingMap.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object v4 = ((Map)entry.getValue()).remove(object);
            if (v4 == null) continue;
            Object k2 = entry.getKey();
            linkedHashMap.put(k2, v4);
            bl2 = (entry = (Map)entry.getValue()).isEmpty();
            if (!bl2) continue;
            iterator.remove();
        }
        return linkedHashMap;
    }

    private boolean removeMapping(Object object, Object object2, Object object3) {
        boolean bl2 = this.containsMapping(object, object2, object3);
        if (bl2) {
            this.remove(object, object2);
            return true;
        }
        return false;
    }

    public Iterator cellIterator() {
        StandardTable$CellIterator standardTable$CellIterator = new StandardTable$CellIterator(this, null);
        return standardTable$CellIterator;
    }

    public Set cellSet() {
        return super.cellSet();
    }

    public void clear() {
        this.backingMap.clear();
    }

    public Map column(Object object) {
        StandardTable$Column standardTable$Column = new StandardTable$Column(this, object);
        return standardTable$Column;
    }

    public Set columnKeySet() {
        Set set = this.columnKeySet;
        if (set == null) {
            this.columnKeySet = set = new StandardTable$ColumnKeySet(this, null);
        }
        return set;
    }

    public Map columnMap() {
        StandardTable$ColumnMap standardTable$ColumnMap = this.columnMap;
        if (standardTable$ColumnMap == null) {
            this.columnMap = standardTable$ColumnMap = new StandardTable$ColumnMap(this, null);
        }
        return standardTable$ColumnMap;
    }

    public boolean contains(Object object, Object object2) {
        boolean bl2;
        if (object != null && object2 != null && (bl2 = super.contains(object, object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean containsColumn(Object object) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        Iterator iterator = this.backingMap.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Map map2 = (Map)iterator.next();
            bl2 = Maps.safeContainsKey(map2, object);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public boolean containsRow(Object object) {
        Map map2;
        boolean bl2;
        if (object != null && (bl2 = Maps.safeContainsKey(map2 = this.backingMap, object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean containsValue(Object object) {
        boolean bl2;
        if (object != null && (bl2 = super.containsValue(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Iterator createColumnKeyIterator() {
        StandardTable$ColumnKeyIterator standardTable$ColumnKeyIterator = new StandardTable$ColumnKeyIterator(this, null);
        return standardTable$ColumnKeyIterator;
    }

    public Map createRowMap() {
        StandardTable$RowMap standardTable$RowMap = new StandardTable$RowMap(this);
        return standardTable$RowMap;
    }

    public Object get(Object object, Object object2) {
        object = object != null && object2 != null ? super.get(object, object2) : null;
        return object;
    }

    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    public Object put(Object object, Object object2, Object object3) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        Preconditions.checkNotNull(object3);
        return this.getOrCreate(object).put(object2, object3);
    }

    public Object remove(Object object, Object object2) {
        boolean bl2 = false;
        Map map2 = null;
        if (object != null && object2 != null) {
            Map map3 = (Map)Maps.safeGet(this.backingMap, object);
            if (map3 == null) {
                return null;
            }
            object2 = map3.remove(object2);
            bl2 = map3.isEmpty();
            if (bl2) {
                map2 = this.backingMap;
                map2.remove(object);
            }
            return object2;
        }
        return null;
    }

    public Map row(Object object) {
        StandardTable$Row standardTable$Row = new StandardTable$Row(this, object);
        return standardTable$Row;
    }

    public Set rowKeySet() {
        return this.rowMap().keySet();
    }

    public Map rowMap() {
        Map map2 = this.rowMap;
        if (map2 == null) {
            this.rowMap = map2 = this.createRowMap();
        }
        return map2;
    }

    public int size() {
        int n3;
        Iterator iterator = this.backingMap.values().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Map map2 = (Map)iterator.next();
            n3 = map2.size();
            n4 += n3;
        }
        return n4;
    }

    public Collection values() {
        return super.values();
    }
}

