/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimapGwtSerializationDependencies;
import com.google.common.collect.Multimap;
import com.google.common.collect.Platform;
import com.google.common.collect.Serialization;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;

public final class HashMultimap
extends HashMultimapGwtSerializationDependencies {
    private static final int DEFAULT_VALUES_PER_KEY = 2;
    private static final long serialVersionUID;
    transient int expectedValuesPerKey;

    private HashMultimap() {
        this(12, 2);
    }

    private HashMultimap(int n3, int n4) {
        Map map2 = Platform.newHashMapWithExpectedSize(n3);
        super(map2);
        this.expectedValuesPerKey = n3 = 2;
        if (n4 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            map2 = null;
        }
        Preconditions.checkArgument(n3 != 0);
        this.expectedValuesPerKey = n4;
    }

    private HashMultimap(Multimap multimap) {
        Map map2 = Platform.newHashMapWithExpectedSize(multimap.keySet().size());
        super(map2);
        this.expectedValuesPerKey = 2;
        this.putAll(multimap);
    }

    public static HashMultimap create() {
        HashMultimap hashMultimap = new HashMultimap();
        return hashMultimap;
    }

    public static HashMultimap create(int n3, int n4) {
        HashMultimap hashMultimap = new HashMultimap(n3, n4);
        return hashMultimap;
    }

    public static HashMultimap create(Multimap multimap) {
        HashMultimap hashMultimap = new HashMultimap(multimap);
        return hashMultimap;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int n3 = Serialization.readCount(objectInputStream);
        Map map2 = Platform.newHashMapWithExpectedSize(12);
        this.setMap(map2);
        Serialization.populateMultimap(this, objectInputStream, n3);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    public Set createCollection() {
        return Platform.newHashSetWithExpectedSize(this.expectedValuesPerKey);
    }
}

