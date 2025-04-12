/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.LinkedHashMultimap$1;
import com.google.common.collect.LinkedHashMultimap$ValueEntry;
import com.google.common.collect.LinkedHashMultimap$ValueSet;
import com.google.common.collect.LinkedHashMultimap$ValueSetLink;
import com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Platform;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class LinkedHashMultimap
extends LinkedHashMultimapGwtSerializationDependencies {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1.0;
    private static final long serialVersionUID = 1L;
    private transient LinkedHashMultimap$ValueEntry multimapHeaderEntry;
    transient int valueSetCapacity;

    private LinkedHashMultimap(int n3, int n4) {
        Object object = Platform.newLinkedHashMapWithExpectedSize(n3);
        super((Map)object);
        this.valueSetCapacity = 2;
        CollectPreconditions.checkNonnegative(n4, "expectedValuesPerKey");
        this.valueSetCapacity = n4;
        this.multimapHeaderEntry = object = LinkedHashMultimap$ValueEntry.newHeader();
        LinkedHashMultimap.succeedsInMultimap((LinkedHashMultimap$ValueEntry)object, (LinkedHashMultimap$ValueEntry)object);
    }

    public static /* synthetic */ void access$200(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink, LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink2) {
        LinkedHashMultimap.succeedsInValueSet(linkedHashMultimap$ValueSetLink, linkedHashMultimap$ValueSetLink2);
    }

    public static /* synthetic */ LinkedHashMultimap$ValueEntry access$300(LinkedHashMultimap linkedHashMultimap) {
        return linkedHashMultimap.multimapHeaderEntry;
    }

    public static /* synthetic */ void access$400(LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry, LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry2) {
        LinkedHashMultimap.succeedsInMultimap(linkedHashMultimap$ValueEntry, linkedHashMultimap$ValueEntry2);
    }

    public static /* synthetic */ void access$500(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink) {
        LinkedHashMultimap.deleteFromValueSet(linkedHashMultimap$ValueSetLink);
    }

    public static /* synthetic */ void access$600(LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry) {
        LinkedHashMultimap.deleteFromMultimap(linkedHashMultimap$ValueEntry);
    }

    public static LinkedHashMultimap create() {
        LinkedHashMultimap linkedHashMultimap = new LinkedHashMultimap(16, 2);
        return linkedHashMultimap;
    }

    public static LinkedHashMultimap create(int n3, int n4) {
        n3 = Maps.capacity(n3);
        n4 = Maps.capacity(n4);
        LinkedHashMultimap linkedHashMultimap = new LinkedHashMultimap(n3, n4);
        return linkedHashMultimap;
    }

    public static LinkedHashMultimap create(Multimap multimap) {
        LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.create(multimap.keySet().size(), 2);
        linkedHashMultimap.putAll(multimap);
        return linkedHashMultimap;
    }

    private static void deleteFromMultimap(LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry) {
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry2 = linkedHashMultimap$ValueEntry.getPredecessorInMultimap();
        linkedHashMultimap$ValueEntry = linkedHashMultimap$ValueEntry.getSuccessorInMultimap();
        LinkedHashMultimap.succeedsInMultimap(linkedHashMultimap$ValueEntry2, linkedHashMultimap$ValueEntry);
    }

    private static void deleteFromValueSet(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink) {
        LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink2 = linkedHashMultimap$ValueSetLink.getPredecessorInValueSet();
        linkedHashMultimap$ValueSetLink = linkedHashMultimap$ValueSetLink.getSuccessorInValueSet();
        LinkedHashMultimap.succeedsInValueSet(linkedHashMultimap$ValueSetLink2, linkedHashMultimap$ValueSetLink);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Object object;
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry;
        objectInputStream.defaultReadObject();
        this.multimapHeaderEntry = linkedHashMultimap$ValueEntry = LinkedHashMultimap$ValueEntry.newHeader();
        LinkedHashMultimap.succeedsInMultimap(linkedHashMultimap$ValueEntry, linkedHashMultimap$ValueEntry);
        this.valueSetCapacity = 2;
        int n3 = objectInputStream.readInt();
        int n4 = 12;
        Map map2 = Platform.newLinkedHashMapWithExpectedSize(n4);
        int n7 = 0;
        Object object2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object = objectInputStream.readObject();
            Collection collection = this.createCollection(object);
            map2.put(object, collection);
        }
        n3 = objectInputStream.readInt();
        while (n7 < n3) {
            object2 = objectInputStream.readObject();
            object = objectInputStream.readObject();
            object2 = (Collection)map2.get(object2);
            Objects.requireNonNull(object2);
            object2 = (Collection)object2;
            object2.add(object);
            ++n7;
        }
        this.setMap(map2);
    }

    private static void succeedsInMultimap(LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry, LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry2) {
        linkedHashMultimap$ValueEntry.setSuccessorInMultimap(linkedHashMultimap$ValueEntry2);
        linkedHashMultimap$ValueEntry2.setPredecessorInMultimap(linkedHashMultimap$ValueEntry);
    }

    private static void succeedsInValueSet(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink, LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink2) {
        linkedHashMultimap$ValueSetLink.setSuccessorInValueSet(linkedHashMultimap$ValueSetLink2);
        linkedHashMultimap$ValueSetLink2.setPredecessorInValueSet(linkedHashMultimap$ValueSetLink);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object object;
        boolean bl2;
        objectOutputStream.defaultWriteObject();
        int n3 = this.keySet().size();
        objectOutputStream.writeInt(n3);
        Iterator iterator = this.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            objectOutputStream.writeObject(object);
        }
        n3 = this.size();
        objectOutputStream.writeInt(n3);
        iterator = this.entries().iterator();
        while (bl2 = iterator.hasNext()) {
            object = (Map.Entry)iterator.next();
            Object k2 = object.getKey();
            objectOutputStream.writeObject(k2);
            object = object.getValue();
            objectOutputStream.writeObject(object);
        }
    }

    public void clear() {
        super.clear();
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry = this.multimapHeaderEntry;
        LinkedHashMultimap.succeedsInMultimap(linkedHashMultimap$ValueEntry, linkedHashMultimap$ValueEntry);
    }

    public Collection createCollection(Object object) {
        int n3 = this.valueSetCapacity;
        LinkedHashMultimap$ValueSet linkedHashMultimap$ValueSet = new LinkedHashMultimap$ValueSet(this, object, n3);
        return linkedHashMultimap$ValueSet;
    }

    public Set createCollection() {
        return Platform.newLinkedHashSetWithExpectedSize(this.valueSetCapacity);
    }

    public Set entries() {
        return super.entries();
    }

    public Iterator entryIterator() {
        LinkedHashMultimap$1 linkedHashMultimap$1 = new LinkedHashMultimap$1(this);
        return linkedHashMultimap$1;
    }

    public Set keySet() {
        return super.keySet();
    }

    public Set replaceValues(Object object, Iterable iterable) {
        return super.replaceValues(object, iterable);
    }

    public Iterator valueIterator() {
        return Maps.valueIterator(this.entryIterator());
    }

    public Collection values() {
        return super.values();
    }
}

