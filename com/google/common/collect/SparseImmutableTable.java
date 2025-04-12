/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable$SerializedForm;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.Table$Cell;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

final class SparseImmutableTable
extends RegularImmutableTable {
    static final ImmutableTable EMPTY;
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final ImmutableMap columnMap;
    private final ImmutableMap rowMap;

    static {
        ImmutableList immutableList = ImmutableList.of();
        ImmutableSet immutableSet = ImmutableSet.of();
        ImmutableSet immutableSet2 = ImmutableSet.of();
        SparseImmutableTable sparseImmutableTable = new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
        EMPTY = sparseImmutableTable;
    }

    public SparseImmutableTable(ImmutableList object, ImmutableSet iterator, ImmutableSet object2) {
        boolean bl2;
        int n3;
        LinkedHashMap linkedHashMap;
        Object object3;
        int n4;
        Object object4 = Maps.indexMap((Collection)((Object)iterator));
        LinkedHashMap linkedHashMap2 = Maps.newLinkedHashMap();
        iterator = ((ImmutableSet)((Object)iterator)).iterator();
        while ((n4 = iterator.hasNext()) != 0) {
            object3 = iterator.next();
            linkedHashMap = new LinkedHashMap();
            linkedHashMap2.put(object3, linkedHashMap);
        }
        iterator = Maps.newLinkedHashMap();
        object2 = ((ImmutableSet)object2).iterator();
        while ((n4 = object2.hasNext()) != 0) {
            object3 = object2.next();
            linkedHashMap = new LinkedHashMap();
            iterator.put(object3, linkedHashMap);
        }
        int n7 = ((AbstractCollection)object).size();
        object2 = new int[n7];
        n4 = ((AbstractCollection)object).size();
        object3 = new int[n4];
        linkedHashMap = null;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)object).size()); ++i3) {
            Object object5 = (Table$Cell)object.get(i3);
            Object object6 = object5.getRowKey();
            Object object7 = object5.getColumnKey();
            object5 = object5.getValue();
            Object object8 = (Integer)object4.get(object6);
            Objects.requireNonNull(object8);
            int n8 = (Integer)object8;
            object2[i3] = (Iterator)n8;
            object8 = (Map)linkedHashMap2.get(object6);
            Objects.requireNonNull(object8);
            object8 = (Map)object8;
            int n10 = object8.size();
            object3[i3] = n10;
            object8 = object8.put(object7, object5);
            this.checkNoDuplicate(object6, object7, object8, object5);
            object7 = (Map)iterator.get(object7);
            Objects.requireNonNull(object7);
            object7 = (Map)object7;
            object7.put(object6, object5);
        }
        this.cellRowIndices = (int[])object2;
        this.cellColumnInRowIndices = (int[])object3;
        n7 = linkedHashMap2.size();
        object = new ImmutableMap$Builder(n7);
        object2 = linkedHashMap2.entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            object4 = object2.next();
            linkedHashMap2 = object4.getKey();
            object4 = ImmutableMap.copyOf((Map)object4.getValue());
            ((ImmutableMap$Builder)object).put(linkedHashMap2, object4);
        }
        this.rowMap = object = ((ImmutableMap$Builder)object).buildOrThrow();
        n7 = iterator.size();
        object = new ImmutableMap$Builder(n7);
        iterator = iterator.entrySet().iterator();
        while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object2 = iterator.next();
            object4 = object2.getKey();
            object2 = ImmutableMap.copyOf((Map)object2.getValue());
            ((ImmutableMap$Builder)object).put(object4, object2);
        }
        this.columnMap = object = ((ImmutableMap$Builder)object).buildOrThrow();
    }

    public ImmutableMap columnMap() {
        return ImmutableMap.copyOf((Map)this.columnMap);
    }

    public ImmutableTable$SerializedForm createSerializedForm() {
        int n3;
        Object object = Maps.indexMap(this.columnKeySet());
        int n4 = this.cellSet().size();
        int[] nArray = new int[n4];
        UnmodifiableIterator unmodifiableIterator = this.cellSet().iterator();
        int n7 = 0;
        while ((n3 = unmodifiableIterator.hasNext()) != 0) {
            Object object2 = (Table$Cell)unmodifiableIterator.next();
            int n8 = n7 + 1;
            object2 = object2.getColumnKey();
            object2 = (Integer)object.get(object2);
            Objects.requireNonNull(object2);
            nArray[n7] = n3 = ((Integer)object2).intValue();
            n7 = n8;
        }
        object = this.cellRowIndices;
        return ImmutableTable$SerializedForm.create(this, (int[])object, nArray);
    }

    public Table$Cell getCell(int n3) {
        int n4 = this.cellRowIndices[n3];
        Map.Entry entry = (Map.Entry)this.rowMap.entrySet().asList().get(n4);
        ImmutableMap immutableMap = (ImmutableMap)entry.getValue();
        n3 = this.cellColumnInRowIndices[n3];
        Map.Entry entry2 = (Map.Entry)immutableMap.entrySet().asList().get(n3);
        entry = entry.getKey();
        immutableMap = entry2.getKey();
        entry2 = entry2.getValue();
        return ImmutableTable.cellOf(entry, immutableMap, entry2);
    }

    public Object getValue(int n3) {
        int n4 = this.cellRowIndices[n3];
        ImmutableMap immutableMap = (ImmutableMap)this.rowMap.values().asList().get(n4);
        n3 = this.cellColumnInRowIndices[n3];
        return immutableMap.values().asList().get(n3);
    }

    public ImmutableMap rowMap() {
        return ImmutableMap.copyOf((Map)this.rowMap);
    }

    public int size() {
        return this.cellRowIndices.length;
    }
}

