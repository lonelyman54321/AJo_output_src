/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableMap$EntrySet;
import com.google.common.collect.RegularImmutableMap$KeySet;
import com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList;

final class RegularImmutableBiMap
extends ImmutableBiMap {
    static final RegularImmutableBiMap EMPTY;
    final transient Object[] alternatingKeysAndValues;
    private final transient RegularImmutableBiMap inverse;
    private final transient Object keyHashTable;
    private final transient int keyOffset;
    private final transient int size;

    static {
        RegularImmutableBiMap regularImmutableBiMap;
        EMPTY = regularImmutableBiMap = new RegularImmutableBiMap();
    }

    private RegularImmutableBiMap() {
        this.keyHashTable = null;
        Object[] objectArray = new Object[]{};
        this.alternatingKeysAndValues = objectArray;
        this.keyOffset = 0;
        this.size = 0;
        this.inverse = this;
    }

    private RegularImmutableBiMap(Object object, Object[] objectArray, int n3, RegularImmutableBiMap regularImmutableBiMap) {
        this.keyHashTable = object;
        this.alternatingKeysAndValues = objectArray;
        this.keyOffset = 1;
        this.size = n3;
        this.inverse = regularImmutableBiMap;
    }

    public RegularImmutableBiMap(Object[] objectArray, int n3) {
        RegularImmutableBiMap regularImmutableBiMap;
        this.alternatingKeysAndValues = objectArray;
        this.size = n3;
        Object object = null;
        this.keyOffset = 0;
        int n4 = 2;
        if (n3 >= n4) {
            n4 = ImmutableSet.chooseTableSize(n3);
        } else {
            n4 = 0;
            regularImmutableBiMap = null;
        }
        this.keyHashTable = object = RegularImmutableMap.createHashTableOrThrow(objectArray, n3, n4, 0);
        object = RegularImmutableMap.createHashTableOrThrow(objectArray, n3, n4, 1);
        this.inverse = regularImmutableBiMap = new RegularImmutableBiMap(object, objectArray, n3, this);
    }

    public ImmutableSet createEntrySet() {
        Object[] objectArray = this.alternatingKeysAndValues;
        int n3 = this.keyOffset;
        int n4 = this.size;
        RegularImmutableMap$EntrySet regularImmutableMap$EntrySet = new RegularImmutableMap$EntrySet(this, objectArray, n3, n4);
        return regularImmutableMap$EntrySet;
    }

    public ImmutableSet createKeySet() {
        Object object = this.alternatingKeysAndValues;
        int n3 = this.keyOffset;
        int n4 = this.size;
        RegularImmutableMap$KeysOrValuesAsList regularImmutableMap$KeysOrValuesAsList = new RegularImmutableMap$KeysOrValuesAsList((Object[])object, n3, n4);
        object = new RegularImmutableMap$KeySet(this, regularImmutableMap$KeysOrValuesAsList);
        return object;
    }

    public Object get(Object object) {
        Object object2 = this.keyHashTable;
        Object[] objectArray = this.alternatingKeysAndValues;
        int n3 = this.size;
        int n4 = this.keyOffset;
        if ((object = RegularImmutableMap.get(object2, objectArray, n3, n4, object)) == null) {
            object = null;
        }
        return object;
    }

    public ImmutableBiMap inverse() {
        return this.inverse;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }
}

