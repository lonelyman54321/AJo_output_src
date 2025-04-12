/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps$SortedKeySet;
import com.google.common.collect.StandardTable$Row;
import com.google.common.collect.TreeBasedTable;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.SortedSet;

class TreeBasedTable$TreeRow
extends StandardTable$Row
implements SortedMap {
    final Object lowerBound;
    final /* synthetic */ TreeBasedTable this$0;
    final Object upperBound;
    transient SortedMap wholeRow;

    public TreeBasedTable$TreeRow(TreeBasedTable treeBasedTable, Object object) {
        this(treeBasedTable, object, null, null);
    }

    public TreeBasedTable$TreeRow(TreeBasedTable treeBasedTable, Object object, Object object2, Object object3) {
        int n3;
        this.this$0 = treeBasedTable;
        super(treeBasedTable, object);
        this.lowerBound = object2;
        this.upperBound = object3;
        if (object2 != null && object3 != null && (n3 = this.compare(object2, object3)) > 0) {
            n3 = 0;
            treeBasedTable = null;
        } else {
            n3 = 1;
        }
        Preconditions.checkArgument(n3 != 0);
    }

    public Comparator comparator() {
        return this.this$0.columnComparator();
    }

    public int compare(Object object, Object object2) {
        return this.comparator().compare(object, object2);
    }

    public SortedMap computeBackingRowMap() {
        this.updateWholeRowField();
        SortedMap sortedMap = this.wholeRow;
        if (sortedMap != null) {
            Object object = this.lowerBound;
            if (object != null) {
                sortedMap = sortedMap.tailMap(object);
            }
            if ((object = this.upperBound) != null) {
                sortedMap = sortedMap.headMap(object);
            }
            return sortedMap;
        }
        return null;
    }

    public boolean containsKey(Object object) {
        boolean bl2;
        boolean bl3 = this.rangeContains(object);
        if (bl3 && (bl2 = super.containsKey(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Object firstKey() {
        this.updateBackingRowMapField();
        Object object = this.backingRowMap;
        if (object != null) {
            return ((SortedMap)object).firstKey();
        }
        object = new NoSuchElementException();
        throw object;
    }

    public SortedMap headMap(Object object) {
        Object object2 = Preconditions.checkNotNull(object);
        Preconditions.checkArgument(this.rangeContains(object2));
        TreeBasedTable treeBasedTable = this.this$0;
        Object object3 = this.rowKey;
        Object object4 = this.lowerBound;
        object2 = new TreeBasedTable$TreeRow(treeBasedTable, object3, object4, object);
        return object2;
    }

    public SortedSet keySet() {
        Maps$SortedKeySet maps$SortedKeySet = new Maps$SortedKeySet(this);
        return maps$SortedKeySet;
    }

    public Object lastKey() {
        this.updateBackingRowMapField();
        Object object = this.backingRowMap;
        if (object != null) {
            return ((SortedMap)object).lastKey();
        }
        object = new NoSuchElementException();
        throw object;
    }

    public void maintainEmptyInvariant() {
        boolean bl2;
        this.updateWholeRowField();
        Map map2 = this.wholeRow;
        if (map2 != null && (bl2 = map2.isEmpty())) {
            map2 = this.this$0.backingMap;
            Object object = this.rowKey;
            map2.remove(object);
            bl2 = false;
            map2 = null;
            this.wholeRow = null;
            this.backingRowMap = null;
        }
    }

    public Object put(Object object, Object object2) {
        Object object3 = Preconditions.checkNotNull(object);
        Preconditions.checkArgument(this.rangeContains(object3));
        return super.put(object, object2);
    }

    public boolean rangeContains(Object object) {
        int n3;
        int n4;
        Object object2;
        if (!(object == null || (object2 = this.lowerBound) != null && (n4 = this.compare(object2, object)) > 0 || (object2 = this.upperBound) != null && (n3 = this.compare(object2, object)) <= 0)) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public SortedMap subMap(Object object, Object object2) {
        Object object3 = Preconditions.checkNotNull(object);
        boolean bl2 = this.rangeContains(object3);
        if (bl2 && (bl2 = this.rangeContains(object3 = Preconditions.checkNotNull(object2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        Preconditions.checkArgument(bl2);
        TreeBasedTable treeBasedTable = this.this$0;
        Object object4 = this.rowKey;
        object3 = new TreeBasedTable$TreeRow(treeBasedTable, object4, object, object2);
        return object3;
    }

    public SortedMap tailMap(Object object) {
        Object object2 = Preconditions.checkNotNull(object);
        Preconditions.checkArgument(this.rangeContains(object2));
        TreeBasedTable treeBasedTable = this.this$0;
        Object object3 = this.rowKey;
        Object object4 = this.upperBound;
        object2 = new TreeBasedTable$TreeRow(treeBasedTable, object3, object, object4);
        return object2;
    }

    public void updateWholeRowField() {
        Object object;
        boolean bl2;
        Map map2 = this.wholeRow;
        if (map2 == null || (bl2 = map2.isEmpty()) && (bl2 = (map2 = this.this$0.backingMap).containsKey(object = this.rowKey))) {
            map2 = this.this$0.backingMap;
            object = this.rowKey;
            map2 = (SortedMap)map2.get(object);
            this.wholeRow = map2;
        }
    }
}

