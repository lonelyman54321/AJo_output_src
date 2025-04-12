/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CompactHashMap$1;
import com.google.common.collect.CompactHashMap$2;
import com.google.common.collect.CompactHashMap$3;
import com.google.common.collect.CompactHashMap$EntrySetView;
import com.google.common.collect.CompactHashMap$KeySetView;
import com.google.common.collect.CompactHashMap$ValuesView;
import com.google.common.collect.CompactHashing;
import com.google.common.collect.Hashing;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class CompactHashMap
extends AbstractMap
implements Serializable {
    static final double HASH_FLOODING_FPP = 0.001;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND;
    transient int[] entries;
    private transient Set entrySetView;
    private transient Set keySetView;
    transient Object[] keys;
    private transient int metadata;
    private transient int size;
    private transient Object table;
    transient Object[] values;
    private transient Collection valuesView;

    static {
        Object object;
        NOT_FOUND = object = new Object();
    }

    public CompactHashMap() {
        this.init(3);
    }

    public CompactHashMap(int n3) {
        this.init(n3);
    }

    public static /* synthetic */ int access$000(CompactHashMap compactHashMap) {
        return compactHashMap.metadata;
    }

    public static /* synthetic */ Object access$100(CompactHashMap compactHashMap, int n3) {
        return compactHashMap.key(n3);
    }

    public static /* synthetic */ Object[] access$1000(CompactHashMap compactHashMap) {
        return compactHashMap.requireKeys();
    }

    public static /* synthetic */ Object[] access$1100(CompactHashMap compactHashMap) {
        return compactHashMap.requireValues();
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int n3;
        int n4 = compactHashMap.size;
        compactHashMap.size = n3 = n4 + -1;
        return n4;
    }

    public static /* synthetic */ void access$1300(CompactHashMap compactHashMap, int n3, Object object) {
        compactHashMap.setValue(n3, object);
    }

    public static /* synthetic */ Object access$200(CompactHashMap compactHashMap, Object object) {
        return compactHashMap.removeHelper(object);
    }

    public static /* synthetic */ Object access$300() {
        return NOT_FOUND;
    }

    public static /* synthetic */ int access$500(CompactHashMap compactHashMap, Object object) {
        return compactHashMap.indexOf(object);
    }

    public static /* synthetic */ Object access$600(CompactHashMap compactHashMap, int n3) {
        return compactHashMap.value(n3);
    }

    public static /* synthetic */ int access$700(CompactHashMap compactHashMap) {
        return compactHashMap.hashTableMask();
    }

    public static /* synthetic */ Object access$800(CompactHashMap compactHashMap) {
        return compactHashMap.requireTable();
    }

    public static /* synthetic */ int[] access$900(CompactHashMap compactHashMap) {
        return compactHashMap.requireEntries();
    }

    public static CompactHashMap create() {
        CompactHashMap compactHashMap = new CompactHashMap();
        return compactHashMap;
    }

    public static CompactHashMap createWithExpectedSize(int n3) {
        CompactHashMap compactHashMap = new CompactHashMap(n3);
        return compactHashMap;
    }

    private int entry(int n3) {
        return this.requireEntries()[n3];
    }

    private int hashTableMask() {
        int n3 = this.metadata & 0x1F;
        int n4 = 1;
        return (n4 << n3) - n4;
    }

    private int indexOf(Object object) {
        int n3;
        int n4 = this.needsAllocArrays();
        int n7 = -1;
        if (n4 != 0) {
            return n7;
        }
        n4 = Hashing.smearedHash(object);
        int n8 = this.hashTableMask();
        Object object2 = this.requireTable();
        int n10 = CompactHashing.tableGet(object2, n3 = n4 & n8);
        if (n10 == 0) {
            return n7;
        }
        n4 = CompactHashing.getHashPrefix(n4, n8);
        do {
            Object object3;
            int n14;
            if ((n14 = CompactHashing.getHashPrefix(n3 = this.entry(n10 += -1), n8)) != n4 || (n14 = (int)(com.google.common.base.Objects.equal(object, object3 = this.key(n10)) ? 1 : 0)) == 0) continue;
            return n10;
        } while ((n10 = CompactHashing.getNext(n3, n8)) != 0);
        return n7;
    }

    private Object key(int n3) {
        return this.requireKeys()[n3];
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        int n3 = ((ObjectInputStream)object).readInt();
        if (n3 >= 0) {
            this.init(n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = ((ObjectInputStream)object).readObject();
                Object object3 = ((ObjectInputStream)object).readObject();
                this.put(object2, object3);
            }
            return;
        }
        String string2 = hj0_0.a(n3, "Invalid size: ");
        object = new InvalidObjectException(string2);
        throw object;
    }

    private Object removeHelper(Object object) {
        int n3 = this.needsAllocArrays();
        if (n3 != 0) {
            return NOT_FOUND;
        }
        int n4 = this.hashTableMask();
        Object object2 = this.requireTable();
        int[] nArray = this.requireEntries();
        Object[] objectArray = this.requireKeys();
        Object object3 = object;
        int n7 = CompactHashing.remove(object, null, n4, object2, nArray, objectArray, null);
        if (n7 == (n3 = -1)) {
            return NOT_FOUND;
        }
        object3 = this.value(n7);
        this.moveLastEntry(n7, n4);
        this.size = n7 = this.size + -1;
        this.incrementModCount();
        return object3;
    }

    private int[] requireEntries() {
        int[] nArray = this.entries;
        Objects.requireNonNull(nArray);
        return nArray;
    }

    private Object[] requireKeys() {
        Object[] objectArray = this.keys;
        Objects.requireNonNull(objectArray);
        return objectArray;
    }

    private Object requireTable() {
        Object object = this.table;
        Objects.requireNonNull(object);
        return object;
    }

    private Object[] requireValues() {
        Object[] objectArray = this.values;
        Objects.requireNonNull(objectArray);
        return objectArray;
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

    private void setEntry(int n3, int n4) {
        this.requireEntries()[n3] = n4;
    }

    private void setHashTableMask(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3);
        n3 = 32 - n3;
        this.metadata = n3 = CompactHashing.maskCombine(this.metadata, n3, 31);
    }

    private void setKey(int n3, Object object) {
        this.requireKeys()[n3] = object;
    }

    private void setValue(int n3, Object object) {
        this.requireValues()[n3] = object;
    }

    private Object value(int n3) {
        return this.requireValues()[n3];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        boolean bl2;
        objectOutputStream.defaultWriteObject();
        int n3 = this.size();
        objectOutputStream.writeInt(n3);
        Iterator iterator = this.entrySetIterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object k2 = entry.getKey();
            objectOutputStream.writeObject(k2);
            entry = entry.getValue();
            objectOutputStream.writeObject(entry);
        }
    }

    public void accessEntry(int n3) {
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
        this.keys = objectArray;
        objectArray = new Object[n3];
        this.values = objectArray;
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
            objectArray = this.requireKeys();
            int n10 = this.size;
            Arrays.fill(objectArray, 0, n10, null);
            objectArray = this.requireValues();
            n10 = this.size;
            Arrays.fill(objectArray, 0, n10, null);
            CompactHashing.tableClear(this.requireTable());
            objectArray = this.requireEntries();
            n3 = this.size;
            Arrays.fill((int[])objectArray, 0, n3, 0);
            this.size = 0;
        }
    }

    public boolean containsKey(Object object) {
        int n3;
        Map map2 = this.delegateOrNull();
        if (map2 != null) {
            n3 = map2.containsKey(object);
        } else {
            int n4;
            n3 = this.indexOf(object);
            if (n3 != (n4 = -1)) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
        }
        return n3 != 0;
    }

    public boolean containsValue(Object object) {
        int n3;
        Map map2 = this.delegateOrNull();
        if (map2 != null) {
            return map2.containsValue(object);
        }
        map2 = null;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            Object object2 = this.value(i3);
            n3 = (int)(com.google.common.base.Objects.equal(object, object2) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    public Map convertToHashFloodingResistantImplementation() {
        int n3 = this.hashTableMask() + 1;
        Map map2 = this.createHashFloodingResistantDelegate(n3);
        int n4 = this.firstEntryIndex();
        while (n4 >= 0) {
            Object object = this.key(n4);
            Object object2 = this.value(n4);
            map2.put(object, object2);
            n4 = this.getSuccessor(n4);
        }
        this.table = map2;
        this.entries = null;
        this.keys = null;
        this.values = null;
        this.incrementModCount();
        return map2;
    }

    public Set createEntrySet() {
        CompactHashMap$EntrySetView compactHashMap$EntrySetView = new CompactHashMap$EntrySetView(this);
        return compactHashMap$EntrySetView;
    }

    public Map createHashFloodingResistantDelegate(int n3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(n3, 1.0f);
        return linkedHashMap;
    }

    public Set createKeySet() {
        CompactHashMap$KeySetView compactHashMap$KeySetView = new CompactHashMap$KeySetView(this);
        return compactHashMap$KeySetView;
    }

    public Collection createValues() {
        CompactHashMap$ValuesView compactHashMap$ValuesView = new CompactHashMap$ValuesView(this);
        return compactHashMap$ValuesView;
    }

    public Map delegateOrNull() {
        Object object = this.table;
        boolean bl2 = object instanceof Map;
        if (bl2) {
            return (Map)object;
        }
        return null;
    }

    public Set entrySet() {
        Set set = this.entrySetView;
        if (set == null) {
            this.entrySetView = set = this.createEntrySet();
        }
        return set;
    }

    public Iterator entrySetIterator() {
        Object object = this.delegateOrNull();
        if (object != null) {
            return object.entrySet().iterator();
        }
        object = new CompactHashMap$2(this);
        return object;
    }

    public int firstEntryIndex() {
        int n3 = this.isEmpty();
        n3 = n3 != 0 ? -1 : 0;
        return n3;
    }

    public Object get(Object object) {
        int n3;
        Map map2 = this.delegateOrNull();
        if (map2 != null) {
            return map2.get(object);
        }
        int n4 = this.indexOf(object);
        if (n4 == (n3 = -1)) {
            return null;
        }
        this.accessEntry(n4);
        return this.value(n4);
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

    public void insertEntry(int n3, Object object, Object object2, int n4, int n7) {
        n4 = CompactHashing.maskCombine(n4, 0, n7);
        this.setEntry(n3, n4);
        this.setKey(n3, object);
        this.setValue(n3, object2);
    }

    public boolean isEmpty() {
        int n3 = this.size();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public Set keySet() {
        Set set = this.keySetView;
        if (set == null) {
            this.keySetView = set = this.createKeySet();
        }
        return set;
    }

    public Iterator keySetIterator() {
        Object object = this.delegateOrNull();
        if (object != null) {
            return object.keySet().iterator();
        }
        object = new CompactHashMap$1(this);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void moveLastEntry(int n3, int n4) {
        Object object = this.requireTable();
        int[] nArray = this.requireEntries();
        Object[] objectArray = this.requireKeys();
        Object[] objectArray2 = this.requireValues();
        int n7 = this.size();
        int n8 = n7 + -1;
        if (n3 < n8) {
            int n10;
            Object object2;
            Object object3;
            objectArray[n3] = object3 = objectArray[n8];
            objectArray2[n3] = object2 = objectArray2[n8];
            objectArray[n8] = null;
            objectArray2[n8] = null;
            nArray[n3] = n10 = nArray[n8];
            nArray[n8] = 0;
            n10 = Hashing.smearedHash(object3) & n4;
            int n14 = CompactHashing.tableGet(object, n10);
            if (n14 == n7) {
                CompactHashing.tableSet(object, n10, ++n3);
                return;
            }
            while (true) {
                int n15;
                if ((n10 = CompactHashing.getNext(n15 = nArray[n14 += -1], n4)) == n7) {
                    ++n3;
                    nArray[n14] = n3 = CompactHashing.maskCombine(n15, n3, n4);
                    return;
                }
                n14 = n10;
            }
        }
        objectArray[n3] = null;
        objectArray2[n3] = null;
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

    /*
     * Unable to fully structure code
     */
    public Object put(Object var1_1, Object var2_2) {
        block10: {
            block11: {
                var3_3 = this.needsAllocArrays();
                if (var3_3 != 0) {
                    this.allocArrays();
                }
                if ((var4_4 = this.delegateOrNull()) != null) {
                    return var4_4.put(var1_1, var2_2);
                }
                var4_4 = this.requireEntries();
                var5_5 = this.requireKeys();
                var6_6 = this.requireValues();
                var7_7 = this.size;
                var8_8 = var7_7 + 1;
                var9_9 = Hashing.smearedHash(var1_1);
                var10_10 = this.hashTableMask();
                var11_11 = var9_9 & var10_10;
                var12_12 = this.requireTable();
                var13_13 = CompactHashing.tableGet(var12_12, var11_11);
                if (var13_13 != 0) break block10;
                if (var8_8 <= var10_10) break block11;
                var3_3 = CompactHashing.newCapacity(var10_10);
                var3_3 = this.resizeTable(var10_10, var3_3, var9_9, var7_7);
lbl21:
                // 2 sources

                while (true) {
                    var14_14 = var3_3;
                    ** GOTO lbl50
                    break;
                }
            }
            var4_4 = this.requireTable();
            CompactHashing.tableSet(var4_4, var11_11, var8_8);
            ** GOTO lbl49
        }
        var11_11 = CompactHashing.getHashPrefix(var9_9, var10_10);
        var14_14 = 0;
        while (true) {
            block12: {
                if ((var16_16 = CompactHashing.getHashPrefix((int)(var15_15 = var4_4[var13_13 += -1]), var10_10)) == var11_11 && (var16_16 = (int)com.google.common.base.Objects.equal(var1_1, var17_17 = var5_5[var13_13])) != 0) {
                    var1_1 = var6_6[var13_13];
                    var6_6[var13_13] = var2_2;
                    this.accessEntry(var13_13);
                    return var1_1;
                }
                var16_16 = CompactHashing.getNext((int)var15_15, var10_10);
                ++var14_14;
                if (var16_16 != 0) break block12;
                var18_18 = 9;
                if (var14_14 >= var18_18) {
                    return this.convertToHashFloodingResistantImplementation().put(var1_1, var2_2);
                }
                if (var8_8 > var10_10) {
                    var3_3 = CompactHashing.newCapacity(var10_10);
                    var3_3 = this.resizeTable(var10_10, var3_3, var9_9, var7_7);
                    ** continue;
                }
                var18_18 = CompactHashing.maskCombine((int)var15_15, var8_8, var10_10);
                var4_4[var13_13] = var18_18;
lbl49:
                // 2 sources

                var14_14 = var10_10;
lbl50:
                // 2 sources

                this.resizeMeMaybe(var8_8);
                var12_12 = var2_2;
                this.insertEntry(var7_7, var1_1, var2_2, var9_9, var14_14);
                this.size = var8_8;
                this.incrementModCount();
                return null;
            }
            var13_13 = var16_16;
        }
    }

    public Object remove(Object object) {
        Object object2 = this.delegateOrNull();
        if (object2 != null) {
            return object2.remove(object);
        }
        if ((object = this.removeHelper(object)) == (object2 = NOT_FOUND)) {
            object = null;
        }
        return object;
    }

    public void resizeEntries(int n3) {
        Object[] objectArray = Arrays.copyOf(this.requireEntries(), n3);
        this.entries = objectArray;
        objectArray = Arrays.copyOf(this.requireKeys(), n3);
        this.keys = objectArray;
        Object[] objectArray2 = Arrays.copyOf(this.requireValues(), n3);
        this.values = objectArray2;
    }

    public int size() {
        Map map2 = this.delegateOrNull();
        int n3 = map2 != null ? map2.size() : this.size;
        return n3;
    }

    public void trimToSize() {
        int n3 = this.needsAllocArrays();
        if (n3 != 0) {
            return;
        }
        Map map2 = this.delegateOrNull();
        if (map2 != null) {
            int n4 = this.size();
            Map map3 = this.createHashFloodingResistantDelegate(n4);
            map3.putAll(map2);
            this.table = map3;
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

    public Collection values() {
        Collection collection = this.valuesView;
        if (collection == null) {
            this.valuesView = collection = this.createValues();
        }
        return collection;
    }

    public Iterator valuesIterator() {
        Object object = this.delegateOrNull();
        if (object != null) {
            return object.values().iterator();
        }
        object = new CompactHashMap$3(this);
        return object;
    }
}

