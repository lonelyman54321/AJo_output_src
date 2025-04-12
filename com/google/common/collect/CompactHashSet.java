/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CompactHashSet$1;
import com.google.common.collect.CompactHashing;
import com.google.common.collect.Hashing;
import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class CompactHashSet
extends AbstractSet
implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    transient Object[] elements;
    private transient int[] entries;
    private transient int metadata;
    private transient int size;
    private transient Object table;

    public CompactHashSet() {
        this.init(3);
    }

    public CompactHashSet(int n3) {
        this.init(n3);
    }

    public static /* synthetic */ int access$000(CompactHashSet compactHashSet) {
        return compactHashSet.metadata;
    }

    public static /* synthetic */ Object access$100(CompactHashSet compactHashSet, int n3) {
        return compactHashSet.element(n3);
    }

    public static CompactHashSet create() {
        CompactHashSet compactHashSet = new CompactHashSet();
        return compactHashSet;
    }

    public static CompactHashSet create(Collection collection) {
        CompactHashSet compactHashSet = CompactHashSet.createWithExpectedSize(collection.size());
        compactHashSet.addAll(collection);
        return compactHashSet;
    }

    public static CompactHashSet create(Object ... objectArray) {
        CompactHashSet compactHashSet = CompactHashSet.createWithExpectedSize(objectArray.length);
        Collections.addAll(compactHashSet, objectArray);
        return compactHashSet;
    }

    private Set createHashFloodingResistantDelegate(int n3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(n3, 1.0f);
        return linkedHashSet;
    }

    public static CompactHashSet createWithExpectedSize(int n3) {
        CompactHashSet compactHashSet = new CompactHashSet(n3);
        return compactHashSet;
    }

    private Object element(int n3) {
        return this.requireElements()[n3];
    }

    private int entry(int n3) {
        return this.requireEntries()[n3];
    }

    private int hashTableMask() {
        int n3 = this.metadata & 0x1F;
        int n4 = 1;
        return (n4 << n3) - n4;
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        int n3 = ((ObjectInputStream)object).readInt();
        if (n3 >= 0) {
            this.init(n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = ((ObjectInputStream)object).readObject();
                this.add(object2);
            }
            return;
        }
        String string2 = hj0_0.a(n3, "Invalid size: ");
        object = new InvalidObjectException(string2);
        throw object;
    }

    private Object[] requireElements() {
        Object[] objectArray = this.elements;
        Objects.requireNonNull(objectArray);
        return objectArray;
    }

    private int[] requireEntries() {
        int[] nArray = this.entries;
        Objects.requireNonNull(nArray);
        return nArray;
    }

    private Object requireTable() {
        Object object = this.table;
        Objects.requireNonNull(object);
        return object;
    }

    private void resizeMeMaybe(int n3) {
        int[] nArray = this.requireEntries();
        int n4 = nArray.length;
        if (n3 > n4) {
            n3 = n4 >>> 1;
            int n7 = 1;
            n3 = Math.max(n7, n3) + n4 | n7;
            n7 = -1 >>> 2;
            if ((n3 = Math.min(n7, n3)) != n4) {
                this.resizeEntries(n3);
            }
        }
    }

    private int resizeTable(int n3, int n4, int n7, int n8) {
        Object object = CompactHashing.createTable(n4);
        n4 += -1;
        if (n8 != 0) {
            CompactHashing.tableSet(object, n7 &= n4, ++n8);
        }
        Object object2 = this.requireTable();
        int[] nArray = this.requireEntries();
        for (int i3 = 0; i3 <= n3; ++i3) {
            int n10 = CompactHashing.tableGet(object2, i3);
            while (n10 != 0) {
                int n14 = n10 + -1;
                int n15 = nArray[n14];
                int n16 = CompactHashing.getHashPrefix(n15, n3) | i3;
                int n17 = n16 & n4;
                int n18 = CompactHashing.tableGet(object, n17);
                CompactHashing.tableSet(object, n17, n10);
                nArray[n14] = n10 = CompactHashing.maskCombine(n16, n18, n4);
                n10 = CompactHashing.getNext(n15, n3);
            }
        }
        this.table = object;
        this.setHashTableMask(n4);
        return n4;
    }

    private void setElement(int n3, Object object) {
        this.requireElements()[n3] = object;
    }

    private void setEntry(int n3, int n4) {
        this.requireEntries()[n3] = n4;
    }

    private void setHashTableMask(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3);
        n3 = 32 - n3;
        this.metadata = n3 = CompactHashing.maskCombine(this.metadata, n3, 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        boolean bl2;
        objectOutputStream.defaultWriteObject();
        int n3 = this.size();
        objectOutputStream.writeInt(n3);
        Iterator iterator = this.iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            objectOutputStream.writeObject(e2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean add(Object object) {
        Object object2;
        int n3 = this.needsAllocArrays();
        if (n3 != 0) {
            this.allocArrays();
        }
        if ((object2 = this.delegateOrNull()) != null) {
            return object2.add(object);
        }
        object2 = this.requireEntries();
        Object[] objectArray = this.requireElements();
        int n4 = this.size;
        int n7 = n4 + 1;
        int n8 = Hashing.smearedHash(object);
        int n10 = this.hashTableMask();
        int n14 = n8 & n10;
        Object object3 = this.requireTable();
        int n15 = CompactHashing.tableGet(object3, n14);
        int n16 = 1;
        if (n15 == 0) {
            if (n7 > n10) {
                n3 = CompactHashing.newCapacity(n10);
                n10 = this.resizeTable(n10, n3, n8, n4);
            } else {
                object2 = this.requireTable();
                CompactHashing.tableSet(object2, n14, n7);
            }
        } else {
            n14 = CompactHashing.getHashPrefix(n8, n10);
            int n17 = 0;
            while (true) {
                Object object4;
                Object object5;
                int n18;
                if ((n18 = CompactHashing.getHashPrefix((int)(object5 = object2[n15 -= n16]), n10)) == n14 && (n18 = (int)(com.google.common.base.Objects.equal(object, object4 = objectArray[n15]) ? 1 : 0)) != 0) {
                    return false;
                }
                n18 = CompactHashing.getNext((int)object5, n10);
                n17 += n16;
                if (n18 == 0) {
                    int n19 = 9;
                    if (n17 >= n19) {
                        return this.convertToHashFloodingResistantImplementation().add(object);
                    }
                    if (n7 > n10) {
                        n3 = CompactHashing.newCapacity(n10);
                        n10 = this.resizeTable(n10, n3, n8, n4);
                        break;
                    }
                    n19 = CompactHashing.maskCombine((int)object5, n7, n10);
                    object2[n15] = n19;
                    break;
                }
                n15 = n18;
            }
        }
        this.resizeMeMaybe(n7);
        this.insertEntry(n4, object, n8, n10);
        this.size = n7;
        this.incrementModCount();
        return n16 != 0;
    }

    public int adjustAfterRemove(int n3, int n4) {
        return n3 + -1;
    }

    public int allocArrays() {
        Object object;
        Preconditions.checkState(this.needsAllocArrays(), "Arrays already allocated");
        int n3 = this.metadata;
        int n4 = CompactHashing.tableSize(n3);
        this.table = object = CompactHashing.createTable(n4);
        this.setHashTableMask(n4 += -1);
        Object[] objectArray = new int[n3];
        this.entries = objectArray;
        objectArray = new Object[n3];
        this.elements = objectArray;
        return n3;
    }

    public void clear() {
        boolean bl2 = this.needsAllocArrays();
        if (bl2) {
            return;
        }
        this.incrementModCount();
        Object[] objectArray = this.delegateOrNull();
        int n3 = 0;
        if (objectArray != null) {
            int n4 = this.size();
            int n7 = 3;
            int n8 = -1 >>> 2;
            this.metadata = n4 = Ints.constrainToRange(n4, n7, n8);
            objectArray.clear();
            this.table = null;
            this.size = 0;
        } else {
            objectArray = this.requireElements();
            int n10 = this.size;
            Arrays.fill(objectArray, 0, n10, null);
            CompactHashing.tableClear(this.requireTable());
            objectArray = this.requireEntries();
            n3 = this.size;
            Arrays.fill((int[])objectArray, 0, n3, 0);
            this.size = 0;
        }
    }

    public boolean contains(Object object) {
        int n3;
        int n4;
        int n7 = this.needsAllocArrays();
        if (n7 != 0) {
            return false;
        }
        Set set = this.delegateOrNull();
        if (set != null) {
            return set.contains(object);
        }
        n7 = Hashing.smearedHash(object);
        int n8 = this.hashTableMask();
        Object object2 = this.requireTable();
        int n10 = CompactHashing.tableGet(object2, n4 = n7 & n8);
        if (n10 == 0) {
            return false;
        }
        n7 = CompactHashing.getHashPrefix(n7, n8);
        do {
            int n14;
            if ((n14 = CompactHashing.getHashPrefix(n3 = this.entry(n10 -= (n4 = 1)), n8)) != n7 || (n10 = (int)(com.google.common.base.Objects.equal(object, object2 = this.element(n10)) ? 1 : 0)) == 0) continue;
            return n4 != 0;
        } while ((n10 = CompactHashing.getNext(n3, n8)) != 0);
        return false;
    }

    public Set convertToHashFloodingResistantImplementation() {
        int n3 = this.hashTableMask() + 1;
        Set set = this.createHashFloodingResistantDelegate(n3);
        int n4 = this.firstEntryIndex();
        while (n4 >= 0) {
            Object object = this.element(n4);
            set.add(object);
            n4 = this.getSuccessor(n4);
        }
        this.table = set;
        this.entries = null;
        this.elements = null;
        this.incrementModCount();
        return set;
    }

    public Set delegateOrNull() {
        Object object = this.table;
        boolean bl2 = object instanceof Set;
        if (bl2) {
            return (Set)object;
        }
        return null;
    }

    public int firstEntryIndex() {
        int n3 = this.isEmpty();
        n3 = n3 != 0 ? -1 : 0;
        return n3;
    }

    public int getSuccessor(int n3) {
        int n4 = this.size;
        if (++n3 >= n4) {
            n3 = -1;
        }
        return n3;
    }

    public void incrementModCount() {
        int n3;
        this.metadata = n3 = this.metadata + 32;
    }

    public void init(int n3) {
        int n4 = 1;
        boolean bl2 = n3 >= 0;
        Preconditions.checkArgument(bl2, "Expected size must be >= 0");
        this.metadata = n3 = Ints.constrainToRange(n3, n4, -1 >>> 2);
    }

    public void insertEntry(int n3, Object object, int n4, int n7) {
        n4 = CompactHashing.maskCombine(n4, 0, n7);
        this.setEntry(n3, n4);
        this.setElement(n3, object);
    }

    public boolean isEmpty() {
        int n3 = this.size();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isUsingHashFloodingResistance() {
        boolean bl2;
        Set set = this.delegateOrNull();
        if (set != null) {
            bl2 = true;
        } else {
            bl2 = false;
            set = null;
        }
        return bl2;
    }

    public Iterator iterator() {
        Object object = this.delegateOrNull();
        if (object != null) {
            return object.iterator();
        }
        object = new CompactHashSet$1(this);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void moveLastEntry(int n3, int n4) {
        Object object = this.requireTable();
        int[] nArray = this.requireEntries();
        Object[] objectArray = this.requireElements();
        int n7 = this.size();
        int n8 = n7 + -1;
        if (n3 < n8) {
            int n10;
            Object object2;
            objectArray[n3] = object2 = objectArray[n8];
            objectArray[n8] = null;
            nArray[n3] = n10 = nArray[n8];
            nArray[n8] = 0;
            n10 = Hashing.smearedHash(object2) & n4;
            n8 = CompactHashing.tableGet(object, n10);
            if (n8 == n7) {
                CompactHashing.tableSet(object, n10, ++n3);
                return;
            }
            while (true) {
                int n14;
                if ((n10 = CompactHashing.getNext(n14 = nArray[n8 += -1], n4)) == n7) {
                    ++n3;
                    nArray[n8] = n3 = CompactHashing.maskCombine(n14, n3, n4);
                    return;
                }
                n8 = n10;
            }
        }
        objectArray[n3] = null;
        nArray[n3] = 0;
    }

    public boolean needsAllocArrays() {
        boolean bl2;
        Object object = this.table;
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean remove(Object object) {
        int n3;
        Object[] objectArray;
        int[] nArray;
        Object object2;
        int n4 = this.needsAllocArrays();
        if (n4 != 0) {
            return false;
        }
        Set set = this.delegateOrNull();
        if (set != null) {
            return set.remove(object);
        }
        n4 = this.hashTableMask();
        int n7 = CompactHashing.remove(object, null, n4, object2 = this.requireTable(), nArray = this.requireEntries(), objectArray = this.requireElements(), null);
        if (n7 == (n3 = -1)) {
            return false;
        }
        this.moveLastEntry(n7, n4);
        n7 = this.size;
        n4 = 1;
        this.size = n7 -= n4;
        this.incrementModCount();
        return n4 != 0;
    }

    public void resizeEntries(int n3) {
        int[] nArray = Arrays.copyOf(this.requireEntries(), n3);
        this.entries = nArray;
        Object[] objectArray = Arrays.copyOf(this.requireElements(), n3);
        this.elements = objectArray;
    }

    public int size() {
        Set set = this.delegateOrNull();
        int n3 = set != null ? set.size() : this.size;
        return n3;
    }

    public Object[] toArray() {
        boolean bl2 = this.needsAllocArrays();
        if (bl2) {
            return new Object[0];
        }
        Object[] objectArray = this.delegateOrNull();
        if (objectArray != null) {
            objectArray = objectArray.toArray();
        } else {
            objectArray = this.requireElements();
            int n3 = this.size;
            objectArray = Arrays.copyOf(objectArray, n3);
        }
        return objectArray;
    }

    public Object[] toArray(Object[] objectArray) {
        int n3 = this.needsAllocArrays();
        if (n3 != 0) {
            n3 = objectArray.length;
            if (n3 > 0) {
                n3 = 0;
                Object var3_3 = null;
                objectArray[0] = null;
            }
            return objectArray;
        }
        Object[] objectArray2 = this.delegateOrNull();
        if (objectArray2 != null) {
            objectArray = objectArray2.toArray(objectArray);
        } else {
            objectArray2 = this.requireElements();
            int n4 = this.size;
            objectArray = ObjectArrays.toArrayImpl(objectArray2, 0, n4, objectArray);
        }
        return objectArray;
    }

    public void trimToSize() {
        int n3 = this.needsAllocArrays();
        if (n3 != 0) {
            return;
        }
        Set set = this.delegateOrNull();
        if (set != null) {
            int n4 = this.size();
            Set set2 = this.createHashFloodingResistantDelegate(n4);
            set2.addAll(set);
            this.table = set2;
            return;
        }
        n3 = this.size;
        int[] nArray = this.requireEntries();
        int n7 = nArray.length;
        if (n3 < n7) {
            this.resizeEntries(n3);
        }
        if ((n3 = CompactHashing.tableSize(n3)) < (n7 = this.hashTableMask())) {
            this.resizeTable(n7, n3, 0, 0);
        }
    }
}

