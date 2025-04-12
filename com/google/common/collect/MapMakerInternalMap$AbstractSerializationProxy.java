/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.ForwardingConcurrentMap;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap$Strength;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

abstract class MapMakerInternalMap$AbstractSerializationProxy
extends ForwardingConcurrentMap
implements Serializable {
    private static final long serialVersionUID = 3L;
    final int concurrencyLevel;
    transient ConcurrentMap delegate;
    final Equivalence keyEquivalence;
    final MapMakerInternalMap$Strength keyStrength;
    final Equivalence valueEquivalence;
    final MapMakerInternalMap$Strength valueStrength;

    public MapMakerInternalMap$AbstractSerializationProxy(MapMakerInternalMap$Strength mapMakerInternalMap$Strength, MapMakerInternalMap$Strength mapMakerInternalMap$Strength2, Equivalence equivalence, Equivalence equivalence2, int n3, ConcurrentMap concurrentMap) {
        this.keyStrength = mapMakerInternalMap$Strength;
        this.valueStrength = mapMakerInternalMap$Strength2;
        this.keyEquivalence = equivalence;
        this.valueEquivalence = equivalence2;
        this.concurrencyLevel = n3;
        this.delegate = concurrentMap;
    }

    public ConcurrentMap delegate() {
        return this.delegate;
    }

    public void readEntries(ObjectInputStream objectInputStream) {
        Object object;
        while ((object = objectInputStream.readObject()) != null) {
            Object object2 = objectInputStream.readObject();
            ConcurrentMap concurrentMap = this.delegate;
            concurrentMap.put(object, object2);
        }
        return;
    }

    public MapMaker readMapMaker(ObjectInputStream object) {
        int n3 = ((ObjectInputStream)object).readInt();
        Object object2 = new MapMaker();
        object = object2.initialCapacity(n3);
        object2 = this.keyStrength;
        object = ((MapMaker)object).setKeyStrength((MapMakerInternalMap$Strength)((Object)object2));
        object2 = this.valueStrength;
        object = ((MapMaker)object).setValueStrength((MapMakerInternalMap$Strength)((Object)object2));
        object2 = this.keyEquivalence;
        object = ((MapMaker)object).keyEquivalence((Equivalence)object2);
        int n4 = this.concurrencyLevel;
        return ((MapMaker)object).concurrencyLevel(n4);
    }

    public void writeMapTo(ObjectOutputStream objectOutputStream) {
        boolean bl2;
        int n3 = this.delegate.size();
        objectOutputStream.writeInt(n3);
        Iterator iterator = this.delegate.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object k2 = entry.getKey();
            objectOutputStream.writeObject(k2);
            entry = entry.getValue();
            objectOutputStream.writeObject(entry);
        }
        objectOutputStream.writeObject(null);
    }
}

