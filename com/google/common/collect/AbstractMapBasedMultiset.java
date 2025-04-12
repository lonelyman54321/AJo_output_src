/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultiset$1;
import com.google.common.collect.AbstractMapBasedMultiset$2;
import com.google.common.collect.AbstractMultiset;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.collect.Serialization;
import com.google.common.primitives.Ints;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

abstract class AbstractMapBasedMultiset
extends AbstractMultiset
implements Serializable {
    private static final long serialVersionUID;
    transient ObjectCountHashMap backingMap;
    transient long size;

    public AbstractMapBasedMultiset(int n3) {
        ObjectCountHashMap objectCountHashMap;
        this.backingMap = objectCountHashMap = this.newBackingMap(n3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        ObjectCountHashMap objectCountHashMap;
        objectInputStream.defaultReadObject();
        int n3 = Serialization.readCount(objectInputStream);
        this.backingMap = objectCountHashMap = this.newBackingMap(3);
        Serialization.populateMultiset(this, objectInputStream, n3);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultiset(this, objectOutputStream);
    }

    public final int add(Object object, int n3) {
        long l2;
        ObjectCountHashMap objectCountHashMap;
        int n4;
        if (n3 == 0) {
            return this.count(object);
        }
        int n7 = 1;
        if (n3 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            objectCountHashMap = null;
        }
        String string2 = "occurrences cannot be negative: %s";
        Preconditions.checkArgument(n4 != 0, string2, n3);
        objectCountHashMap = this.backingMap;
        n4 = objectCountHashMap.indexOf(object);
        int n8 = -1;
        if (n4 == n8) {
            this.backingMap.put(object, n3);
            long l3 = this.size;
            long l4 = n3;
            this.size = l3 += l4;
            return 0;
        }
        object = this.backingMap;
        int n10 = ((ObjectCountHashMap)object).getValue(n4);
        long l7 = n10;
        long l8 = n3;
        long l12 = Integer.MAX_VALUE;
        long l14 = (l7 += l8) - l12;
        if ((n3 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1))) > 0) {
            n7 = 0;
        }
        Preconditions.checkArgument(n7 != 0, "too many occurrences: %s", l7);
        ObjectCountHashMap objectCountHashMap2 = this.backingMap;
        n7 = (int)l7;
        objectCountHashMap2.setValue(n4, n7);
        this.size = l2 = this.size + l8;
        return n10;
    }

    public void addTo(Multiset multiset) {
        Preconditions.checkNotNull(multiset);
        ObjectCountHashMap objectCountHashMap = this.backingMap;
        int n3 = objectCountHashMap.firstIndex();
        while (n3 >= 0) {
            Object object = this.backingMap.getKey(n3);
            ObjectCountHashMap objectCountHashMap2 = this.backingMap;
            int n4 = objectCountHashMap2.getValue(n3);
            multiset.add(object, n4);
            object = this.backingMap;
            n3 = ((ObjectCountHashMap)object).nextIndex(n3);
        }
    }

    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    public final int count(Object object) {
        return this.backingMap.get(object);
    }

    public final int distinctElements() {
        return this.backingMap.size();
    }

    public final Iterator elementIterator() {
        AbstractMapBasedMultiset$1 abstractMapBasedMultiset$1 = new AbstractMapBasedMultiset$1(this);
        return abstractMapBasedMultiset$1;
    }

    public final Iterator entryIterator() {
        AbstractMapBasedMultiset$2 abstractMapBasedMultiset$2 = new AbstractMapBasedMultiset$2(this);
        return abstractMapBasedMultiset$2;
    }

    public final Iterator iterator() {
        return Multisets.iteratorImpl(this);
    }

    public abstract ObjectCountHashMap newBackingMap(int var1);

    public final int remove(Object object, int n3) {
        ObjectCountHashMap objectCountHashMap;
        int n4;
        if (n3 == 0) {
            return this.count(object);
        }
        int n7 = 0;
        ObjectCountHashMap objectCountHashMap2 = null;
        if (n3 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            objectCountHashMap = null;
        }
        String string2 = "occurrences cannot be negative: %s";
        Preconditions.checkArgument(n4 != 0, string2, n3);
        objectCountHashMap = this.backingMap;
        int n8 = objectCountHashMap.indexOf(object);
        n4 = -1;
        if (n8 == n4) {
            return 0;
        }
        objectCountHashMap2 = this.backingMap;
        n7 = objectCountHashMap2.getValue(n8);
        if (n7 > n3) {
            objectCountHashMap = this.backingMap;
            int n10 = n7 - n3;
            objectCountHashMap.setValue(n8, n10);
        } else {
            ObjectCountHashMap objectCountHashMap3 = this.backingMap;
            objectCountHashMap3.removeEntry(n8);
            n3 = n7;
        }
        long l2 = this.size;
        long l3 = n3;
        this.size = l2 -= l3;
        return n7;
    }

    public final int setCount(Object object, int n3) {
        CollectPreconditions.checkNonnegative(n3, "count");
        ObjectCountHashMap objectCountHashMap = this.backingMap;
        int n4 = n3 == 0 ? objectCountHashMap.remove(object) : objectCountHashMap.put(object, n3);
        long l2 = this.size;
        long l3 = n3 - n4;
        this.size = l2 += l3;
        return n4;
    }

    public final boolean setCount(Object object, int n3, int n4) {
        CollectPreconditions.checkNonnegative(n3, "oldCount");
        CollectPreconditions.checkNonnegative(n4, "newCount");
        ObjectCountHashMap objectCountHashMap = this.backingMap;
        int n7 = objectCountHashMap.indexOf(object);
        int n8 = -1;
        boolean bl2 = true;
        if (n7 == n8) {
            if (n3 != 0) {
                return false;
            }
            if (n4 > 0) {
                ObjectCountHashMap objectCountHashMap2 = this.backingMap;
                objectCountHashMap2.put(object, n4);
                long l2 = this.size;
                long l3 = n4;
                this.size = l2 += l3;
            }
            return bl2;
        }
        object = this.backingMap;
        int n10 = ((ObjectCountHashMap)object).getValue(n7);
        if (n10 != n3) {
            return false;
        }
        if (n4 == 0) {
            object = this.backingMap;
            ((ObjectCountHashMap)object).removeEntry(n7);
            long l4 = this.size;
            long l7 = n3;
            this.size = l4 -= l7;
        } else {
            object = this.backingMap;
            ((ObjectCountHashMap)object).setValue(n7, n4);
            long l8 = this.size;
            long l12 = n4 -= n3;
            this.size = l8 += l12;
        }
        return bl2;
    }

    public final int size() {
        return Ints.saturatedCast(this.size);
    }
}

