/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.RegularImmutableTable;
import java.io.Serializable;

final class ImmutableTable$SerializedForm
implements Serializable {
    private static final long serialVersionUID;
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final Object[] cellValues;
    private final Object[] columnKeys;
    private final Object[] rowKeys;

    private ImmutableTable$SerializedForm(Object[] objectArray, Object[] objectArray2, Object[] objectArray3, int[] nArray, int[] nArray2) {
        this.rowKeys = objectArray;
        this.columnKeys = objectArray2;
        this.cellValues = objectArray3;
        this.cellRowIndices = nArray;
        this.cellColumnIndices = nArray2;
    }

    public static ImmutableTable$SerializedForm create(ImmutableTable immutableTable, int[] nArray, int[] nArray2) {
        Object[] objectArray = immutableTable.rowKeySet().toArray();
        Object[] objectArray2 = immutableTable.columnKeySet().toArray();
        Object[] objectArray3 = immutableTable.values().toArray();
        ImmutableTable$SerializedForm immutableTable$SerializedForm = new ImmutableTable$SerializedForm(objectArray, objectArray2, objectArray3, nArray, nArray2);
        return immutableTable$SerializedForm;
    }

    public Object readResolve() {
        Object object;
        Object object2 = this.cellValues;
        int n3 = ((Object[])object2).length;
        if (n3 == 0) {
            return ImmutableTable.of();
        }
        n3 = ((Object[])object2).length;
        int n4 = 1;
        if (n3 == n4) {
            Object object3 = this.rowKeys[0];
            Object object4 = this.columnKeys[0];
            object2 = object2[0];
            return ImmutableTable.of(object3, object4, object2);
        }
        int n7 = ((Object[])object2).length;
        Object object5 = new ImmutableList$Builder(n7);
        for (int i3 = 0; i3 < (n4 = ((Object[])(object2 = this.cellValues)).length); ++i3) {
            object = this.rowKeys;
            int n8 = this.cellRowIndices[i3];
            object = object[n8];
            Object object6 = this.columnKeys;
            int[] nArray = this.cellColumnIndices;
            int n10 = nArray[i3];
            object6 = object6[n10];
            object2 = object2[i3];
            object2 = ImmutableTable.cellOf(object, object6, object2);
            ((ImmutableList$Builder)object5).add(object2);
        }
        object2 = ((ImmutableList$Builder)object5).build();
        object5 = ImmutableSet.copyOf(this.rowKeys);
        object = ImmutableSet.copyOf(this.columnKeys);
        return RegularImmutableTable.forOrderedComponents((ImmutableList)object2, (ImmutableSet)object5, (ImmutableSet)object);
    }
}

