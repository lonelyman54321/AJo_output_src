/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMapEntrySet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;

final class ImmutableMapEntrySet$RegularEntrySet
extends ImmutableMapEntrySet {
    private final transient ImmutableList entries;
    private final transient ImmutableMap map;

    public ImmutableMapEntrySet$RegularEntrySet(ImmutableMap immutableMap, ImmutableList immutableList) {
        this.map = immutableMap;
        this.entries = immutableList;
    }

    public ImmutableMapEntrySet$RegularEntrySet(ImmutableMap immutableMap, Map.Entry[] object) {
        object = ImmutableList.asImmutableList(object);
        this(immutableMap, (ImmutableList)object);
    }

    public int copyIntoArray(Object[] objectArray, int n3) {
        return this.entries.copyIntoArray(objectArray, n3);
    }

    public ImmutableList createAsList() {
        return this.entries;
    }

    public UnmodifiableIterator iterator() {
        return this.entries.iterator();
    }

    public ImmutableMap map() {
        return this.map;
    }
}

