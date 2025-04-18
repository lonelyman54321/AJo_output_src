/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayTable$1;
import com.google.common.collect.ArrayTable$ArrayMap$1;
import com.google.common.collect.ArrayTable$ArrayMap$2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps$IteratorBasedAbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class ArrayTable$ArrayMap
extends Maps$IteratorBasedAbstractMap {
    private final ImmutableMap keyIndex;

    private ArrayTable$ArrayMap(ImmutableMap immutableMap) {
        this.keyIndex = immutableMap;
    }

    public /* synthetic */ ArrayTable$ArrayMap(ImmutableMap immutableMap, ArrayTable.1 var2_2) {
        this(immutableMap);
    }

    public void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public boolean containsKey(Object object) {
        return this.keyIndex.containsKey(object);
    }

    public Iterator entryIterator() {
        int n3 = this.size();
        ArrayTable$ArrayMap$2 arrayTable$ArrayMap$2 = new ArrayTable$ArrayMap$2(this, n3);
        return arrayTable$ArrayMap$2;
    }

    public Object get(Object object) {
        ImmutableMap immutableMap = this.keyIndex;
        if ((object = (Integer)immutableMap.get(object)) == null) {
            return null;
        }
        int n3 = (Integer)object;
        return this.getValue(n3);
    }

    public Map.Entry getEntry(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        ArrayTable$ArrayMap$1 arrayTable$ArrayMap$1 = new ArrayTable$ArrayMap$1(this, n3);
        return arrayTable$ArrayMap$1;
    }

    public Object getKey(int n3) {
        return this.keyIndex.keySet().asList().get(n3);
    }

    public abstract String getKeyRole();

    public abstract Object getValue(int var1);

    public boolean isEmpty() {
        return this.keyIndex.isEmpty();
    }

    public Set keySet() {
        return this.keyIndex.keySet();
    }

    public Object put(Object object, Object object2) {
        Comparable<Integer> comparable = (Integer)this.keyIndex.get(object);
        if (comparable != null) {
            int n3 = (Integer)comparable;
            return this.setValue(n3, object2);
        }
        comparable = new Comparable<Integer>();
        String string2 = this.getKeyRole();
        ((StringBuilder)comparable).append(string2);
        ((StringBuilder)comparable).append(" ");
        ((StringBuilder)comparable).append(object);
        ((StringBuilder)comparable).append(" not in ");
        object = this.keyIndex.keySet();
        ((StringBuilder)comparable).append(object);
        object = ((StringBuilder)comparable).toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public Object remove(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public abstract Object setValue(int var1, Object var2);

    public int size() {
        return this.keyIndex.size();
    }
}

