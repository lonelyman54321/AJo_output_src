/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable$SerializedForm;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.Table$Cell;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

final class DenseImmutableTable
extends RegularImmutableTable {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final ImmutableMap columnKeyToIndex;
    private final ImmutableMap columnMap;
    private final int[] rowCounts;
    private final ImmutableMap rowKeyToIndex;
    private final ImmutableMap rowMap;
    private final Object[][] values;

    public DenseImmutableTable(ImmutableList serializable, ImmutableSet object, ImmutableSet object2) {
        int n3 = ((AbstractCollection)object).size();
        int n4 = ((AbstractCollection)object2).size();
        Object object3 = 2;
        Object object4 = new int[object3];
        int n7 = 1;
        object4[n7] = n4;
        object4[0] = n3;
        Object object5 = (Object[][])Array.newInstance(Object.class, object4);
        this.values = object5;
        object = Maps.indexMap((Collection)object);
        this.rowKeyToIndex = object;
        object2 = Maps.indexMap((Collection)object2);
        this.columnKeyToIndex = object2;
        object = new int[object.size()];
        this.rowCounts = (int[])object;
        object = new int[object2.size()];
        this.columnCounts = (int[])object;
        int n8 = serializable.size();
        object = new int[n8];
        int n10 = serializable.size();
        object2 = new int[n10];
        for (n4 = 0; n4 < (n3 = serializable.size()); ++n4) {
            object5 = (Table$Cell)serializable.get(n4);
            object4 = object5.getRowKey();
            Object object6 = object5.getColumnKey();
            Integer n14 = (Integer)this.rowKeyToIndex.get(object4);
            Objects.requireNonNull(n14);
            int n15 = n14;
            Integer n16 = (Integer)this.columnKeyToIndex.get(object6);
            Objects.requireNonNull(n16);
            int n17 = n16;
            Object object7 = this.values[n15][n17];
            Object object8 = object5.getValue();
            this.checkNoDuplicate(object4, object6, object7, object8);
            object4 = this.values[n15];
            object5 = object5.getValue();
            object4[n17] = (int)object5;
            object5 = this.rowCounts;
            object3 = object5[n15] + n7;
            object5[n15] = (Object[])object3;
            object5 = this.columnCounts;
            object3 = object5[n17] + n7;
            object5[n17] = (Object[])object3;
            object[n4] = n15;
            object2[n4] = n17;
        }
        this.cellRowIndices = (int[])object;
        this.cellColumnIndices = (int[])object2;
        super(this, null);
        this.rowMap = serializable;
        super(this, null);
        this.columnMap = serializable;
    }

    public static /* synthetic */ int[] access$200(DenseImmutableTable denseImmutableTable) {
        return denseImmutableTable.rowCounts;
    }

    public static /* synthetic */ ImmutableMap access$300(DenseImmutableTable denseImmutableTable) {
        return denseImmutableTable.columnKeyToIndex;
    }

    public static /* synthetic */ Object[][] access$400(DenseImmutableTable denseImmutableTable) {
        return denseImmutableTable.values;
    }

    public static /* synthetic */ int[] access$500(DenseImmutableTable denseImmutableTable) {
        return denseImmutableTable.columnCounts;
    }

    public static /* synthetic */ ImmutableMap access$600(DenseImmutableTable denseImmutableTable) {
        return denseImmutableTable.rowKeyToIndex;
    }

    public ImmutableMap columnMap() {
        return ImmutableMap.copyOf((Map)this.columnMap);
    }

    public ImmutableTable$SerializedForm createSerializedForm() {
        int[] nArray = this.cellRowIndices;
        int[] nArray2 = this.cellColumnIndices;
        return ImmutableTable$SerializedForm.create(this, nArray, nArray2);
    }

    public Object get(Object object, Object object2) {
        object = (Integer)this.rowKeyToIndex.get(object);
        Object[][] objectArray = this.columnKeyToIndex;
        object2 = (Integer)objectArray.get(object2);
        if (object != null && object2 != null) {
            objectArray = this.values;
            int n3 = object.intValue();
            object = objectArray[n3];
            int n4 = (Integer)object2;
            object = object[n4];
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public Table$Cell getCell(int n3) {
        int n4 = this.cellRowIndices[n3];
        n3 = this.cellColumnIndices[n3];
        Object e2 = this.rowKeySet().asList().get(n4);
        Object e5 = this.columnKeySet().asList().get(n3);
        Object object = this.values[n4][n3];
        Objects.requireNonNull(object);
        return ImmutableTable.cellOf(e2, e5, object);
    }

    public Object getValue(int n3) {
        Object[][] objectArray = this.values;
        int n4 = this.cellRowIndices[n3];
        objectArray = objectArray[n4];
        n3 = this.cellColumnIndices[n3];
        Object[] objectArray2 = objectArray[n3];
        Objects.requireNonNull(objectArray2);
        return objectArray2;
    }

    public ImmutableMap rowMap() {
        return ImmutableMap.copyOf((Map)this.rowMap);
    }

    public int size() {
        return this.cellRowIndices.length;
    }
}

