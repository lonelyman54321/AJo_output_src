/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ArrayListMultimapGwtSerializationDependencies;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Platform;
import com.google.common.collect.Serialization;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ArrayListMultimap
extends ArrayListMultimapGwtSerializationDependencies {
    private static final int DEFAULT_VALUES_PER_KEY = 3;
    private static final long serialVersionUID;
    transient int expectedValuesPerKey;

    private ArrayListMultimap() {
        this(12, 3);
    }

    private ArrayListMultimap(int n3, int n4) {
        Map map2 = Platform.newHashMapWithExpectedSize(n3);
        super(map2);
        CollectPreconditions.checkNonnegative(n4, "expectedValuesPerKey");
        this.expectedValuesPerKey = n4;
    }

    private ArrayListMultimap(Multimap multimap) {
        Set set = multimap.keySet();
        int n3 = set.size();
        int n4 = multimap instanceof ArrayListMultimap;
        if (n4 != 0) {
            Multimap multimap2 = multimap;
            multimap2 = (ArrayListMultimap)multimap;
            n4 = ((ArrayListMultimap)multimap2).expectedValuesPerKey;
        } else {
            n4 = 3;
        }
        this(n3, n4);
        this.putAll(multimap);
    }

    public static ArrayListMultimap create() {
        ArrayListMultimap arrayListMultimap = new ArrayListMultimap();
        return arrayListMultimap;
    }

    public static ArrayListMultimap create(int n3, int n4) {
        ArrayListMultimap arrayListMultimap = new ArrayListMultimap(n3, n4);
        return arrayListMultimap;
    }

    public static ArrayListMultimap create(Multimap multimap) {
        ArrayListMultimap arrayListMultimap = new ArrayListMultimap(multimap);
        return arrayListMultimap;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int n3 = Serialization.readCount(objectInputStream);
        CompactHashMap compactHashMap = CompactHashMap.create();
        this.setMap(compactHashMap);
        Serialization.populateMultimap(this, objectInputStream, n3);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    public List createCollection() {
        int n3 = this.expectedValuesPerKey;
        ArrayList arrayList = new ArrayList(n3);
        return arrayList;
    }

    public void trimToSize() {
        boolean bl2;
        Iterator iterator = this.backingMap().values().iterator();
        while (bl2 = iterator.hasNext()) {
            ArrayList arrayList = (ArrayList)((Collection)iterator.next());
            arrayList.trimToSize();
        }
    }
}

