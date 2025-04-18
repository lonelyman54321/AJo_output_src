/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.DenseImmutableTable;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.RegularImmutableTable$CellSet;
import com.google.common.collect.RegularImmutableTable$Values;
import com.google.common.collect.SparseImmutableTable;
import com.google.common.collect.Table$Cell;
import com.google.common.collect.h;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

abstract class RegularImmutableTable
extends ImmutableTable {
    public static /* synthetic */ int a(Comparator comparator, Comparator comparator2, Table$Cell table$Cell, Table$Cell table$Cell2) {
        return RegularImmutableTable.lambda$forCells$0(comparator, comparator2, table$Cell, table$Cell2);
    }

    public static RegularImmutableTable forCells(Iterable iterable) {
        return RegularImmutableTable.forCellsInternal(iterable, null, null);
    }

    public static RegularImmutableTable forCells(List list, Comparator comparator, Comparator comparator2) {
        Preconditions.checkNotNull(list);
        if (comparator != null || comparator2 != null) {
            h h3 = new h(comparator, comparator2);
            Collections.sort(list, h3);
        }
        return RegularImmutableTable.forCellsInternal(list, comparator, comparator2);
    }

    private static RegularImmutableTable forCellsInternal(Iterable object, Comparator object2, Comparator comparator) {
        boolean bl2;
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        LinkedHashSet<Object> linkedHashSet2 = new LinkedHashSet<Object>();
        ImmutableList immutableList = ImmutableList.copyOf((Iterable)object);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object3 = (Table$Cell)object.next();
            Object object4 = object3.getRowKey();
            linkedHashSet.add(object4);
            object3 = object3.getColumnKey();
            linkedHashSet2.add(object3);
        }
        object = object2 == null ? ImmutableSet.copyOf(linkedHashSet) : ImmutableSet.copyOf((Collection)ImmutableList.sortedCopyOf((Comparator)object2, linkedHashSet));
        object2 = comparator == null ? ImmutableSet.copyOf(linkedHashSet2) : ImmutableSet.copyOf((Collection)ImmutableList.sortedCopyOf(comparator, linkedHashSet2));
        return RegularImmutableTable.forOrderedComponents(immutableList, (ImmutableSet)object, (ImmutableSet)object2);
    }

    public static RegularImmutableTable forOrderedComponents(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        int n3 = immutableList.size();
        long l2 = n3;
        int n4 = immutableSet.size();
        long l3 = n4;
        long l4 = immutableSet2.size();
        l3 *= l4;
        l4 = 2;
        long l7 = l2 - (l3 /= l4);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        RegularImmutableTable regularImmutableTable = object > 0 ? new DenseImmutableTable(immutableList, immutableSet, immutableSet2) : new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
        return regularImmutableTable;
    }

    private static /* synthetic */ int lambda$forCells$0(Comparator object, Comparator comparator, Table$Cell object2, Table$Cell table$Cell) {
        int n3;
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            Object object3 = object2.getRowKey();
            Object object4 = table$Cell.getRowKey();
            n3 = object.compare(object3, object4);
        }
        if (n3 != 0) {
            return n3;
        }
        if (comparator != null) {
            object = object2.getColumnKey();
            object2 = table$Cell.getColumnKey();
            n4 = comparator.compare(object, object2);
        }
        return n4;
    }

    public final void checkNoDuplicate(Object object, Object object2, Object object3, Object object4) {
        boolean bl2 = object3 == null;
        Preconditions.checkArgument(bl2, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", object, object2, object4, object3);
    }

    public final ImmutableSet createCellSet() {
        boolean bl2 = this.isEmpty();
        ImmutableSet immutableSet = bl2 ? ImmutableSet.of() : new RegularImmutableTable$CellSet(this, null);
        return immutableSet;
    }

    public final ImmutableCollection createValues() {
        boolean bl2 = this.isEmpty();
        ImmutableList immutableList = bl2 ? ImmutableList.of() : new RegularImmutableTable$Values(this, null);
        return immutableList;
    }

    public abstract Table$Cell getCell(int var1);

    public abstract Object getValue(int var1);
}

