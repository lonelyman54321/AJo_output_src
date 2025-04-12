/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractTable;
import com.google.common.collect.ArrayTable$1;
import com.google.common.collect.ArrayTable$2;
import com.google.common.collect.ArrayTable$3;
import com.google.common.collect.ArrayTable$Column;
import com.google.common.collect.ArrayTable$ColumnMap;
import com.google.common.collect.ArrayTable$Row;
import com.google.common.collect.ArrayTable$RowMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Table$Cell;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ArrayTable
extends AbstractTable
implements Serializable {
    private static final long serialVersionUID;
    private final Object[][] array;
    private final ImmutableMap columnKeyToIndex;
    private final ImmutableList columnList;
    private transient ArrayTable$ColumnMap columnMap;
    private final ImmutableMap rowKeyToIndex;
    private final ImmutableList rowList;
    private transient ArrayTable$RowMap rowMap;

    private ArrayTable(ArrayTable arrayTable) {
        Object[] objectArray;
        ImmutableList immutableList;
        Object[][] objectArray2 = arrayTable.rowList;
        this.rowList = objectArray2;
        this.columnList = immutableList = arrayTable.columnList;
        Object object = arrayTable.rowKeyToIndex;
        this.rowKeyToIndex = object;
        object = arrayTable.columnKeyToIndex;
        this.columnKeyToIndex = object;
        int n3 = objectArray2.size();
        int n4 = immutableList.size();
        object = new int[2];
        int n7 = 1;
        object[n7] = n4;
        n4 = 0;
        immutableList = null;
        object[0] = n3;
        objectArray2 = (Object[][])Array.newInstance(Object.class, (int[])object);
        this.array = objectArray2;
        object = null;
        for (int i3 = 0; i3 < (n7 = (objectArray = this.rowList).size()); ++i3) {
            objectArray = arrayTable.array[i3];
            Object[] objectArray3 = objectArray2[i3];
            int n8 = objectArray.length;
            System.arraycopy(objectArray, 0, objectArray3, 0, n8);
        }
    }

    private ArrayTable(Table table) {
        Set set = table.rowKeySet();
        Set set2 = table.columnKeySet();
        this(set, set2);
        this.putAll(table);
    }

    private ArrayTable(Iterable objectArray, Iterable iterable) {
        Object object;
        objectArray = ImmutableList.copyOf((Iterable)objectArray);
        this.rowList = objectArray;
        iterable = ImmutableList.copyOf(iterable);
        this.columnList = iterable;
        boolean bl2 = objectArray.isEmpty();
        boolean bl3 = ((AbstractCollection)iterable).isEmpty();
        int n3 = 1;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
        object = Maps.indexMap((Collection)objectArray);
        this.rowKeyToIndex = object;
        object = Maps.indexMap((Collection)iterable);
        this.columnKeyToIndex = object;
        int n4 = objectArray.size();
        int n7 = ((AbstractCollection)iterable).size();
        object = new int[2];
        object[n3] = n7;
        object[0] = n4;
        objectArray = (Object[][])Array.newInstance(Object.class, (int[])object);
        this.array = objectArray;
        this.eraseAll();
    }

    public static /* synthetic */ Table$Cell access$000(ArrayTable arrayTable, int n3) {
        return arrayTable.getCell(n3);
    }

    public static /* synthetic */ ImmutableList access$100(ArrayTable arrayTable) {
        return arrayTable.columnList;
    }

    public static /* synthetic */ ImmutableList access$200(ArrayTable arrayTable) {
        return arrayTable.rowList;
    }

    public static /* synthetic */ ImmutableMap access$300(ArrayTable arrayTable) {
        return arrayTable.rowKeyToIndex;
    }

    public static /* synthetic */ ImmutableMap access$600(ArrayTable arrayTable) {
        return arrayTable.columnKeyToIndex;
    }

    public static /* synthetic */ Object access$800(ArrayTable arrayTable, int n3) {
        return arrayTable.getValue(n3);
    }

    public static ArrayTable create(Table table) {
        ArrayTable arrayTable;
        boolean bl2 = table instanceof ArrayTable;
        if (bl2) {
            table = (ArrayTable)table;
            arrayTable = new ArrayTable((ArrayTable)table);
        } else {
            arrayTable = new ArrayTable(table);
        }
        return arrayTable;
    }

    public static ArrayTable create(Iterable iterable, Iterable iterable2) {
        ArrayTable arrayTable = new ArrayTable(iterable, iterable2);
        return arrayTable;
    }

    private Table$Cell getCell(int n3) {
        ArrayTable$2 arrayTable$2 = new ArrayTable$2(this, n3);
        return arrayTable$2;
    }

    private Object getValue(int n3) {
        int n4 = this.columnList.size();
        n4 = n3 / n4;
        int n7 = this.columnList.size();
        return this.at(n4, n3 %= n7);
    }

    public Object at(int n3, int n4) {
        int n7 = this.rowList.size();
        Preconditions.checkElementIndex(n3, n7);
        n7 = this.columnList.size();
        Preconditions.checkElementIndex(n4, n7);
        return this.array[n3][n4];
    }

    public Iterator cellIterator() {
        int n3 = this.size();
        ArrayTable$1 arrayTable$1 = new ArrayTable$1(this, n3);
        return arrayTable$1;
    }

    public Set cellSet() {
        return super.cellSet();
    }

    public void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public Map column(Object object) {
        Preconditions.checkNotNull(object);
        Map map2 = this.columnKeyToIndex;
        object = (Integer)map2.get(object);
        if (object == null) {
            return Collections.emptyMap();
        }
        int n3 = (Integer)object;
        map2 = new ArrayTable$Column(this, n3);
        return map2;
    }

    public ImmutableList columnKeyList() {
        return this.columnList;
    }

    public ImmutableSet columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    public Map columnMap() {
        ArrayTable$ColumnMap arrayTable$ColumnMap = this.columnMap;
        if (arrayTable$ColumnMap == null) {
            this.columnMap = arrayTable$ColumnMap = new ArrayTable$ColumnMap(this, null);
        }
        return arrayTable$ColumnMap;
    }

    public boolean contains(Object object, Object object2) {
        boolean bl2 = this.containsRow(object);
        if (bl2 && (bl2 = this.containsColumn(object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean containsColumn(Object object) {
        return this.columnKeyToIndex.containsKey(object);
    }

    public boolean containsRow(Object object) {
        return this.rowKeyToIndex.containsKey(object);
    }

    public boolean containsValue(Object object) {
        for (Object[] objectArray : this.array) {
            for (Object object2 : objectArray) {
                boolean bl2 = Objects.equal(object, object2);
                if (!bl2) continue;
                return true;
            }
        }
        return false;
    }

    public Object erase(Object object, Object object2) {
        object = (Integer)this.rowKeyToIndex.get(object);
        object2 = (Integer)this.columnKeyToIndex.get(object2);
        if (object != null && object2 != null) {
            int n3 = (Integer)object;
            int n4 = (Integer)object2;
            return this.set(n3, n4, null);
        }
        return null;
    }

    public void eraseAll() {
        for (Object[] objectArray : this.array) {
            Arrays.fill(objectArray, null);
        }
    }

    public Object get(Object object, Object object2) {
        object = (Integer)this.rowKeyToIndex.get(object);
        ImmutableMap immutableMap = this.columnKeyToIndex;
        object2 = (Integer)immutableMap.get(object2);
        if (object != null && object2 != null) {
            int n3 = (Integer)object;
            int n4 = (Integer)object2;
            object = this.at(n3, n4);
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public boolean isEmpty() {
        ImmutableList immutableList = this.rowList;
        boolean bl2 = immutableList.isEmpty();
        if (!bl2 && !(bl2 = (immutableList = this.columnList).isEmpty())) {
            bl2 = false;
            immutableList = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Object put(Object object, Object object2, Object object3) {
        ImmutableList immutableList;
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        Integer n3 = (Integer)this.rowKeyToIndex.get(object);
        boolean bl3 = false;
        if (n3 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            immutableList = null;
        }
        String string2 = "Row %s not in %s";
        ImmutableList immutableList2 = this.rowList;
        Preconditions.checkArgument(bl2, string2, object, (Object)immutableList2);
        object = (Integer)this.columnKeyToIndex.get(object2);
        if (object != null) {
            bl3 = true;
        }
        immutableList = this.columnList;
        Preconditions.checkArgument(bl3, "Column %s not in %s", object2, (Object)immutableList);
        int n4 = n3;
        int n7 = (Integer)object;
        return this.set(n4, n7, object3);
    }

    public void putAll(Table table) {
        super.putAll(table);
    }

    public Object remove(Object object, Object object2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public Map row(Object object) {
        Preconditions.checkNotNull(object);
        Map map2 = this.rowKeyToIndex;
        object = (Integer)map2.get(object);
        if (object == null) {
            return Collections.emptyMap();
        }
        int n3 = (Integer)object;
        map2 = new ArrayTable$Row(this, n3);
        return map2;
    }

    public ImmutableList rowKeyList() {
        return this.rowList;
    }

    public ImmutableSet rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    public Map rowMap() {
        ArrayTable$RowMap arrayTable$RowMap = this.rowMap;
        if (arrayTable$RowMap == null) {
            this.rowMap = arrayTable$RowMap = new ArrayTable$RowMap(this, null);
        }
        return arrayTable$RowMap;
    }

    public Object set(int n3, int n4, Object object) {
        int n7 = this.rowList.size();
        Preconditions.checkElementIndex(n3, n7);
        n7 = this.columnList.size();
        Preconditions.checkElementIndex(n4, n7);
        Object[] objectArray = this.array[n3];
        Object object2 = objectArray[n4];
        objectArray[n4] = object;
        return object2;
    }

    public int size() {
        int n3 = this.rowList.size();
        return this.columnList.size() * n3;
    }

    public Object[][] toArray(Class objectArray) {
        Object[] objectArray2;
        int n3;
        int n4 = this.rowList.size();
        int n7 = this.columnList.size();
        int[] nArray = new int[]{n4, n7};
        objectArray = (Object[][])Array.newInstance(objectArray, nArray);
        n4 = 0;
        nArray = null;
        for (n7 = 0; n7 < (n3 = (objectArray2 = this.rowList).size()); ++n7) {
            objectArray2 = this.array[n7];
            Object[] objectArray3 = objectArray[n7];
            int n8 = objectArray2.length;
            System.arraycopy(objectArray2, 0, objectArray3, 0, n8);
        }
        return objectArray;
    }

    public Collection values() {
        return super.values();
    }

    public Iterator valuesIterator() {
        int n3 = this.size();
        ArrayTable$3 arrayTable$3 = new ArrayTable$3(this, n3);
        return arrayTable$3;
    }
}

