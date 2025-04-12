/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Hashing;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.ObjectCountHashMap$MapEntry;
import java.util.Arrays;

class ObjectCountHashMap {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = 0xFF00000000L;
    private static final int MAXIMUM_CAPACITY = 0x40000000;
    private static final long NEXT_MASK = 0xFFFFFFFFL;
    static final int UNSET = 255;
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    public ObjectCountHashMap() {
        this.init(3, 1.0f);
    }

    public ObjectCountHashMap(int n3) {
        this(n3, 1.0f);
    }

    public ObjectCountHashMap(int n3, float f5) {
        this.init(n3, f5);
    }

    public ObjectCountHashMap(ObjectCountHashMap objectCountHashMap) {
        int n3 = objectCountHashMap.size();
        int n4 = 1065353216;
        float f5 = 1.0f;
        this.init(n3, f5);
        n3 = objectCountHashMap.firstIndex();
        while (true) {
            n4 = -1;
            f5 = 0.0f / 0.0f;
            if (n3 == n4) break;
            Object object = objectCountHashMap.getKey(n3);
            int n7 = objectCountHashMap.getValue(n3);
            this.put(object, n7);
            n3 = objectCountHashMap.nextIndex(n3);
        }
    }

    public static ObjectCountHashMap create() {
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap();
        return objectCountHashMap;
    }

    public static ObjectCountHashMap createWithExpectedSize(int n3) {
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap(n3);
        return objectCountHashMap;
    }

    private static int getHash(long l2) {
        return (int)(l2 >>> 32);
    }

    private static int getNext(long l2) {
        return (int)l2;
    }

    private int hashTableMask() {
        return this.table.length + -1;
    }

    private static long[] newEntries(int n3) {
        long[] lArray = new long[n3];
        Arrays.fill(lArray, (long)-1);
        return lArray;
    }

    private static int[] newTable(int n3) {
        int[] nArray = new int[n3];
        Arrays.fill(nArray, -1);
        return nArray;
    }

    private int remove(Object object, int n3) {
        int n4 = this.hashTableMask() & n3;
        int[] nArray = this.table;
        int n7 = nArray[n4];
        int n8 = 0;
        long[] lArray = null;
        int n10 = -1;
        if (n7 == n10) {
            return 0;
        }
        int n14 = -1;
        while (true) {
            long l2;
            Object object2;
            long l3;
            int n15;
            if ((n15 = ObjectCountHashMap.getHash(l3 = (object2 = this.entries)[n7])) == n3 && (n15 = (int)(Objects.equal(object, object2 = (Object)this.keys[n7]) ? 1 : 0)) != 0) {
                object = this.values;
                Object object3 = object[n7];
                if (n14 == n10) {
                    int[] nArray2 = this.table;
                    lArray = this.entries;
                    long l4 = lArray[n7];
                    nArray2[n4] = n8 = ObjectCountHashMap.getNext(l4);
                } else {
                    long[] lArray2 = this.entries;
                    long l7 = lArray2[n14];
                    l2 = lArray2[n7];
                    n4 = ObjectCountHashMap.getNext(l2);
                    lArray2[n14] = l7 = ObjectCountHashMap.swapNext(l7, n4);
                }
                this.moveLastEntry(n7);
                this.size = n3 = this.size + -1;
                this.modCount = n3 = this.modCount + 1;
                return (int)object3;
            }
            long[] lArray3 = this.entries;
            l2 = lArray3[n7];
            n14 = ObjectCountHashMap.getNext(l2);
            if (n14 == n10) {
                return 0;
            }
            int n16 = n14;
            n14 = n7;
            n7 = n16;
        }
    }

    private void resizeMeMaybe(int n3) {
        long[] lArray = this.entries;
        int n4 = lArray.length;
        if (n3 > n4) {
            n3 = n4 >>> 1;
            int n7 = 1;
            if ((n3 = Math.max(n7, n3) + n4) < 0) {
                n3 = -1 >>> 1;
            }
            if (n3 != n4) {
                this.resizeEntries(n3);
            }
        }
    }

    private void resizeTable(int n3) {
        int n4;
        int[] nArray = this.table;
        int n7 = nArray.length;
        int n8 = 0x40000000;
        float f5 = 2.0f;
        if (n7 >= n8) {
            this.threshold = -1 >>> 1;
            return;
        }
        float f6 = n3;
        f5 = this.loadFactor;
        n7 = (int)(f6 *= f5) + 1;
        int[] nArray2 = ObjectCountHashMap.newTable(n3);
        long[] lArray = this.entries;
        int n10 = nArray2.length + -1;
        for (int i3 = 0; i3 < (n4 = this.size); ++i3) {
            n4 = ObjectCountHashMap.getHash(lArray[i3]);
            int n14 = n4 & n10;
            int n15 = nArray2[n14];
            nArray2[n14] = i3;
            long l2 = n4;
            int n16 = 32;
            l2 <<= n16;
            long l3 = 0xFFFFFFFFL;
            long l4 = n15;
            long l7 = l4 & l3;
            lArray[i3] = l2 |= l7;
        }
        this.threshold = n7;
        this.table = nArray2;
    }

    private static long swapNext(long l2, int n3) {
        long l3 = n3;
        long l4 = 0xFFFFFFFFL & l3;
        return (l2 &= 0xFFFFFFFF00000000L) | l4;
    }

    public void clear() {
        int n3;
        this.modCount = n3 = this.modCount + 1;
        Object[] objectArray = this.keys;
        int n4 = this.size;
        Arrays.fill(objectArray, 0, n4, null);
        objectArray = this.values;
        n4 = this.size;
        Arrays.fill((int[])objectArray, 0, n4, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, (long)-1);
        this.size = 0;
    }

    public boolean containsKey(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public void ensureCapacity(int n3) {
        long[] lArray = this.entries;
        int n4 = lArray.length;
        if (n3 > n4) {
            this.resizeEntries(n3);
        }
        if (n3 >= (n4 = this.threshold)) {
            n3 = Integer.highestOneBit(n3 + -1) << 1;
            n4 = 2;
            n3 = Math.max(n4, n3);
            this.resizeTable(n3);
        }
    }

    public int firstIndex() {
        int n3 = this.size;
        n3 = n3 == 0 ? -1 : 0;
        return n3;
    }

    public int get(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        if (n4 == (n3 = -1)) {
            n4 = 0;
            object = null;
        } else {
            int[] nArray = this.values;
            n4 = nArray[n4];
        }
        return n4;
    }

    public Multiset$Entry getEntry(int n3) {
        int n4 = this.size;
        Preconditions.checkElementIndex(n3, n4);
        ObjectCountHashMap$MapEntry objectCountHashMap$MapEntry = new ObjectCountHashMap$MapEntry(this, n3);
        return objectCountHashMap$MapEntry;
    }

    public Object getKey(int n3) {
        int n4 = this.size;
        Preconditions.checkElementIndex(n3, n4);
        return this.keys[n3];
    }

    public int getValue(int n3) {
        int n4 = this.size;
        Preconditions.checkElementIndex(n3, n4);
        return this.values[n3];
    }

    public int indexOf(Object object) {
        int n3 = Hashing.smearedHash(object);
        int[] nArray = this.table;
        int n4 = this.hashTableMask() & n3;
        int n7 = nArray[n4];
        while (n7 != (n4 = -1)) {
            Object object2 = this.entries;
            long l2 = object2[n7];
            n4 = ObjectCountHashMap.getHash(l2);
            if (n4 == n3 && (n4 = (int)(Objects.equal(object, object2 = (Object)this.keys[n7]) ? 1 : 0)) != 0) {
                return n7;
            }
            n7 = ObjectCountHashMap.getNext(l2);
        }
        return n4;
    }

    public void init(int n3, float f5) {
        Object[] objectArray;
        int n4;
        int n7 = 0;
        int n8 = 1;
        if (n3 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            objectArray = null;
        }
        String string2 = "Initial capacity must be non-negative";
        Preconditions.checkArgument(n4 != 0, string2);
        objectArray = null;
        float f6 = f5 - 0.0f;
        n4 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (n4 > 0) {
            n7 = 1;
        }
        Preconditions.checkArgument(n7 != 0, "Illegal load factor");
        double d2 = f5;
        n7 = Hashing.closedTableSize(n3, d2);
        objectArray = ObjectCountHashMap.newTable(n7);
        this.table = objectArray;
        this.loadFactor = f5;
        objectArray = new Object[n3];
        this.keys = objectArray;
        objectArray = new int[n3];
        this.values = objectArray;
        long[] lArray = ObjectCountHashMap.newEntries(n3);
        this.entries = lArray;
        n3 = (int)((float)n7 * f5);
        this.threshold = n3 = Math.max(n8, n3);
    }

    public void insertEntry(int n3, Object object, int n4, int n7) {
        long l2;
        long[] lArray = this.entries;
        lArray[n3] = l2 = (long)n7 << 32 | 0xFFFFFFFFL;
        this.keys[n3] = object;
        this.values[n3] = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void moveLastEntry(int n3) {
        int n4 = this.size() + -1;
        long l2 = -1;
        int n7 = 0;
        long[] lArray = null;
        if (n3 < n4) {
            long l3;
            Object object;
            Object object2;
            Object[] objectArray = this.keys;
            objectArray[n3] = object2 = objectArray[n4];
            object2 = this.values;
            object2[n3] = object = object2[n4];
            objectArray[n4] = null;
            object2[n4] = false;
            lArray = this.entries;
            lArray[n3] = l3 = lArray[n4];
            lArray[n4] = l2;
            int n8 = ObjectCountHashMap.getHash(l3);
            int[] nArray = this.table;
            int n10 = this.hashTableMask();
            n7 = nArray[n8 &= n10];
            if (n7 == n4) {
                nArray[n8] = n3;
                return;
            }
            while (true) {
                long[] lArray2;
                if ((n8 = ObjectCountHashMap.getNext(l3 = (lArray2 = this.entries)[n7])) == n4) {
                    long[] lArray3 = this.entries;
                    lArray3[n7] = l2 = ObjectCountHashMap.swapNext(l3, n3);
                    return;
                }
                n7 = n8;
            }
        }
        this.keys[n3] = null;
        this.values[n3] = 0;
        long[] lArray4 = this.entries;
        lArray4[n3] = l2;
    }

    public int nextIndex(int n3) {
        int n4 = this.size;
        if (++n3 >= n4) {
            n3 = -1;
        }
        return n3;
    }

    public int nextIndexAfterRemove(int n3, int n4) {
        return n3 + -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int put(Object object, int n3) {
        CollectPreconditions.checkPositive(n3, "count");
        long[] lArray = this.entries;
        Object[] objectArray = this.keys;
        int[] nArray = this.values;
        int n4 = Hashing.smearedHash(object);
        int n7 = this.hashTableMask() & n4;
        int n8 = this.size;
        int[] nArray2 = this.table;
        int n10 = nArray2[n7];
        int n14 = -1;
        if (n10 == n14) {
            nArray2[n7] = n8;
        } else {
            while (true) {
                Object object2;
                long l2;
                if ((n7 = ObjectCountHashMap.getHash(l2 = lArray[n10])) == n4 && (n7 = (int)(Objects.equal(object, object2 = objectArray[n10]) ? 1 : 0)) != 0) {
                    int n15 = nArray[n10];
                    nArray[n10] = n3;
                    return n15;
                }
                n7 = ObjectCountHashMap.getNext(l2);
                if (n7 == n14) {
                    long l3;
                    lArray[n10] = l3 = ObjectCountHashMap.swapNext(l2, n8);
                    break;
                }
                n10 = n7;
            }
        }
        int n16 = -1 >>> 1;
        if (n8 == n16) {
            object = new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
            throw object;
        }
        n16 = n8 + 1;
        this.resizeMeMaybe(n16);
        this.insertEntry(n8, object, n3, n4);
        this.size = n16;
        int n17 = this.threshold;
        if (n8 >= n17) {
            object = this.table;
            n17 = ((Object)object).length * 2;
            this.resizeTable(n17);
        }
        this.modCount = n17 = this.modCount + 1;
        return 0;
    }

    public int remove(Object object) {
        int n3 = Hashing.smearedHash(object);
        return this.remove(object, n3);
    }

    public int removeEntry(int n3) {
        Object object = this.keys[n3];
        n3 = ObjectCountHashMap.getHash(this.entries[n3]);
        return this.remove(object, n3);
    }

    public void resizeEntries(int n3) {
        Object[] objectArray = Arrays.copyOf(this.keys, n3);
        this.keys = objectArray;
        objectArray = Arrays.copyOf(this.values, n3);
        this.values = (int[])objectArray;
        objectArray = this.entries;
        int n4 = objectArray.length;
        objectArray = Arrays.copyOf((long[])objectArray, n3);
        if (n3 > n4) {
            long l2 = -1;
            Arrays.fill((long[])objectArray, n4, n3, l2);
        }
        this.entries = (long[])objectArray;
    }

    public void setValue(int n3, int n4) {
        int n7 = this.size;
        Preconditions.checkElementIndex(n3, n7);
        this.values[n3] = n4;
    }

    public int size() {
        return this.size;
    }
}

