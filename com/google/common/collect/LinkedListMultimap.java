/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.LinkedListMultimap$1;
import com.google.common.collect.LinkedListMultimap$1EntriesImpl;
import com.google.common.collect.LinkedListMultimap$1KeySetImpl;
import com.google.common.collect.LinkedListMultimap$1ValuesImpl;
import com.google.common.collect.LinkedListMultimap$KeyList;
import com.google.common.collect.LinkedListMultimap$Node;
import com.google.common.collect.LinkedListMultimap$ValueForKeyIterator;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps$AsMap;
import com.google.common.collect.Multimaps$Keys;
import com.google.common.collect.Multiset;
import com.google.common.collect.Platform;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class LinkedListMultimap
extends AbstractMultimap
implements ListMultimap,
Serializable {
    private static final long serialVersionUID;
    private transient LinkedListMultimap$Node head;
    private transient Map keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient LinkedListMultimap$Node tail;

    public LinkedListMultimap() {
        this(12);
    }

    private LinkedListMultimap(int n3) {
        Map map2;
        this.keyToKeyList = map2 = Platform.newHashMapWithExpectedSize(n3);
    }

    private LinkedListMultimap(Multimap multimap) {
        int n3 = multimap.keySet().size();
        this(n3);
        this.putAll(multimap);
    }

    public static /* synthetic */ int access$000(LinkedListMultimap linkedListMultimap) {
        return linkedListMultimap.modCount;
    }

    public static /* synthetic */ LinkedListMultimap$Node access$100(LinkedListMultimap linkedListMultimap) {
        return linkedListMultimap.tail;
    }

    public static /* synthetic */ LinkedListMultimap$Node access$200(LinkedListMultimap linkedListMultimap) {
        return linkedListMultimap.head;
    }

    public static /* synthetic */ void access$300(LinkedListMultimap linkedListMultimap, LinkedListMultimap$Node linkedListMultimap$Node) {
        linkedListMultimap.removeNode(linkedListMultimap$Node);
    }

    public static /* synthetic */ void access$400(LinkedListMultimap linkedListMultimap, Object object) {
        linkedListMultimap.removeAllNodes(object);
    }

    public static /* synthetic */ Map access$500(LinkedListMultimap linkedListMultimap) {
        return linkedListMultimap.keyToKeyList;
    }

    public static /* synthetic */ LinkedListMultimap$Node access$600(LinkedListMultimap linkedListMultimap, Object object, Object object2, LinkedListMultimap$Node linkedListMultimap$Node) {
        return linkedListMultimap.addNode(object, object2, linkedListMultimap$Node);
    }

    public static /* synthetic */ int access$800(LinkedListMultimap linkedListMultimap) {
        return linkedListMultimap.size;
    }

    private LinkedListMultimap$Node addNode(Object object, Object object2, LinkedListMultimap$Node object3) {
        int n3;
        LinkedListMultimap$Node linkedListMultimap$Node = new LinkedListMultimap$Node(object, object2);
        object2 = this.head;
        if (object2 == null) {
            this.tail = linkedListMultimap$Node;
            this.head = linkedListMultimap$Node;
            object2 = this.keyToKeyList;
            object3 = new LinkedListMultimap$KeyList(linkedListMultimap$Node);
            object2.put(object, object3);
            this.modCount = n3 = this.modCount + 1;
        } else if (object3 == null) {
            object2 = this.tail;
            Objects.requireNonNull(object2);
            ((LinkedListMultimap$Node)object2).next = linkedListMultimap$Node;
            linkedListMultimap$Node.previous = object2 = this.tail;
            this.tail = linkedListMultimap$Node;
            object2 = (LinkedListMultimap$KeyList)this.keyToKeyList.get(object);
            if (object2 == null) {
                object2 = this.keyToKeyList;
                object3 = new LinkedListMultimap$KeyList(linkedListMultimap$Node);
                object2.put(object, object3);
                this.modCount = n3 = this.modCount + 1;
            } else {
                ((LinkedListMultimap$KeyList)object2).count = n3 = ((LinkedListMultimap$KeyList)object2).count + 1;
                object = ((LinkedListMultimap$KeyList)object2).tail;
                ((LinkedListMultimap$Node)object).nextSibling = linkedListMultimap$Node;
                linkedListMultimap$Node.previousSibling = object;
                ((LinkedListMultimap$KeyList)object2).tail = linkedListMultimap$Node;
            }
        } else {
            int n4;
            object = (LinkedListMultimap$KeyList)this.keyToKeyList.get(object);
            Objects.requireNonNull(object);
            ((LinkedListMultimap$KeyList)object).count = n4 = ((LinkedListMultimap$KeyList)object).count + 1;
            linkedListMultimap$Node.previous = object2 = ((LinkedListMultimap$Node)object3).previous;
            linkedListMultimap$Node.previousSibling = object2 = ((LinkedListMultimap$Node)object3).previousSibling;
            linkedListMultimap$Node.next = object3;
            linkedListMultimap$Node.nextSibling = object3;
            object2 = ((LinkedListMultimap$Node)object3).previousSibling;
            if (object2 == null) {
                ((LinkedListMultimap$KeyList)object).head = linkedListMultimap$Node;
            } else {
                ((LinkedListMultimap$Node)object2).nextSibling = linkedListMultimap$Node;
            }
            object = ((LinkedListMultimap$Node)object3).previous;
            if (object == null) {
                this.head = linkedListMultimap$Node;
            } else {
                ((LinkedListMultimap$Node)object).next = linkedListMultimap$Node;
            }
            ((LinkedListMultimap$Node)object3).previous = linkedListMultimap$Node;
            ((LinkedListMultimap$Node)object3).previousSibling = linkedListMultimap$Node;
        }
        this.size = n3 = this.size + 1;
        return linkedListMultimap$Node;
    }

    public static LinkedListMultimap create() {
        LinkedListMultimap linkedListMultimap = new LinkedListMultimap();
        return linkedListMultimap;
    }

    public static LinkedListMultimap create(int n3) {
        LinkedListMultimap linkedListMultimap = new LinkedListMultimap(n3);
        return linkedListMultimap;
    }

    public static LinkedListMultimap create(Multimap multimap) {
        LinkedListMultimap linkedListMultimap = new LinkedListMultimap(multimap);
        return linkedListMultimap;
    }

    private List getCopy(Object object) {
        LinkedListMultimap$ValueForKeyIterator linkedListMultimap$ValueForKeyIterator = new LinkedListMultimap$ValueForKeyIterator(this, object);
        return Collections.unmodifiableList(Lists.newArrayList(linkedListMultimap$ValueForKeyIterator));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        CompactLinkedHashMap compactLinkedHashMap = CompactLinkedHashMap.create();
        this.keyToKeyList = compactLinkedHashMap;
        int n3 = objectInputStream.readInt();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            this.put(object, object2);
        }
    }

    private void removeAllNodes(Object object) {
        LinkedListMultimap$ValueForKeyIterator linkedListMultimap$ValueForKeyIterator = new LinkedListMultimap$ValueForKeyIterator(this, object);
        Iterators.clear(linkedListMultimap$ValueForKeyIterator);
    }

    private void removeNode(LinkedListMultimap$Node object) {
        int n3;
        Object object2;
        Object object3 = ((LinkedListMultimap$Node)object).previous;
        if (object3 != null) {
            object2 = ((LinkedListMultimap$Node)object).next;
            ((LinkedListMultimap$Node)object3).next = object2;
        } else {
            object2 = ((LinkedListMultimap$Node)object).next;
            this.head = object2;
        }
        object2 = ((LinkedListMultimap$Node)object).next;
        if (object2 != null) {
            ((LinkedListMultimap$Node)object2).previous = object3;
        } else {
            this.tail = object3;
        }
        object3 = ((LinkedListMultimap$Node)object).previousSibling;
        if (object3 == null && (object3 = ((LinkedListMultimap$Node)object).nextSibling) == null) {
            object3 = this.keyToKeyList;
            object = ((LinkedListMultimap$Node)object).key;
            object = (LinkedListMultimap$KeyList)object3.remove(object);
            Objects.requireNonNull(object);
            object3 = null;
            ((LinkedListMultimap$KeyList)object).count = 0;
            this.modCount = n3 = this.modCount + 1;
        } else {
            int n4;
            object3 = this.keyToKeyList;
            object2 = ((LinkedListMultimap$Node)object).key;
            object3 = (LinkedListMultimap$KeyList)object3.get(object2);
            Objects.requireNonNull(object3);
            ((LinkedListMultimap$KeyList)object3).count = n4 = ((LinkedListMultimap$KeyList)object3).count + -1;
            object2 = ((LinkedListMultimap$Node)object).previousSibling;
            if (object2 == null) {
                object2 = ((LinkedListMultimap$Node)object).nextSibling;
                Objects.requireNonNull(object2);
                ((LinkedListMultimap$KeyList)object3).head = object2;
            } else {
                LinkedListMultimap$Node linkedListMultimap$Node;
                ((LinkedListMultimap$Node)object2).nextSibling = linkedListMultimap$Node = ((LinkedListMultimap$Node)object).nextSibling;
            }
            object2 = ((LinkedListMultimap$Node)object).nextSibling;
            if (object2 == null) {
                object = ((LinkedListMultimap$Node)object).previousSibling;
                Objects.requireNonNull(object);
                ((LinkedListMultimap$KeyList)object3).tail = object;
            } else {
                ((LinkedListMultimap$Node)object2).previousSibling = object = ((LinkedListMultimap$Node)object).previousSibling;
            }
        }
        this.size = n3 = this.size + -1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        boolean bl2;
        objectOutputStream.defaultWriteObject();
        int n3 = this.size();
        objectOutputStream.writeInt(n3);
        Iterator iterator = this.entries().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object k2 = entry.getKey();
            objectOutputStream.writeObject(k2);
            entry = entry.getValue();
            objectOutputStream.writeObject(entry);
        }
    }

    public void clear() {
        int n3;
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount = n3 = this.modCount + 1;
    }

    public boolean containsKey(Object object) {
        return this.keyToKeyList.containsKey(object);
    }

    public boolean containsValue(Object object) {
        return this.values().contains(object);
    }

    public Map createAsMap() {
        Multimaps$AsMap multimaps$AsMap = new Multimaps$AsMap(this);
        return multimaps$AsMap;
    }

    public List createEntries() {
        LinkedListMultimap$1EntriesImpl linkedListMultimap$1EntriesImpl = new LinkedListMultimap$1EntriesImpl(this);
        return linkedListMultimap$1EntriesImpl;
    }

    public Set createKeySet() {
        LinkedListMultimap$1KeySetImpl linkedListMultimap$1KeySetImpl = new LinkedListMultimap$1KeySetImpl(this);
        return linkedListMultimap$1KeySetImpl;
    }

    public Multiset createKeys() {
        Multimaps$Keys multimaps$Keys = new Multimaps$Keys(this);
        return multimaps$Keys;
    }

    public List createValues() {
        LinkedListMultimap$1ValuesImpl linkedListMultimap$1ValuesImpl = new LinkedListMultimap$1ValuesImpl(this);
        return linkedListMultimap$1ValuesImpl;
    }

    public List entries() {
        return (List)super.entries();
    }

    public Iterator entryIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public List get(Object object) {
        LinkedListMultimap$1 linkedListMultimap$1 = new LinkedListMultimap$1(this, object);
        return linkedListMultimap$1;
    }

    public boolean isEmpty() {
        boolean bl2;
        LinkedListMultimap$Node linkedListMultimap$Node = this.head;
        if (linkedListMultimap$Node == null) {
            bl2 = true;
        } else {
            bl2 = false;
            linkedListMultimap$Node = null;
        }
        return bl2;
    }

    public boolean put(Object object, Object object2) {
        this.addNode(object, object2, null);
        return true;
    }

    public List removeAll(Object object) {
        List list = this.getCopy(object);
        this.removeAllNodes(object);
        return list;
    }

    public List replaceValues(Object iterator, Iterable iterable) {
        boolean bl2;
        List list = this.getCopy(iterator);
        LinkedListMultimap$ValueForKeyIterator linkedListMultimap$ValueForKeyIterator = new LinkedListMultimap$ValueForKeyIterator(this, iterator);
        iterator = iterable.iterator();
        while ((bl2 = linkedListMultimap$ValueForKeyIterator.hasNext()) && (bl2 = iterator.hasNext())) {
            linkedListMultimap$ValueForKeyIterator.next();
            iterable = iterator.next();
            linkedListMultimap$ValueForKeyIterator.set(iterable);
        }
        while (bl2 = linkedListMultimap$ValueForKeyIterator.hasNext()) {
            linkedListMultimap$ValueForKeyIterator.next();
            linkedListMultimap$ValueForKeyIterator.remove();
        }
        while (bl2 = iterator.hasNext()) {
            iterable = iterator.next();
            linkedListMultimap$ValueForKeyIterator.add(iterable);
        }
        return list;
    }

    public int size() {
        return this.size;
    }

    public List values() {
        return (List)super.values();
    }
}

