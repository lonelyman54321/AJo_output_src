/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.HashBiMap$EntrySet;
import com.google.common.collect.HashBiMap$Inverse;
import com.google.common.collect.HashBiMap$KeySet;
import com.google.common.collect.HashBiMap$ValueSet;
import com.google.common.collect.Hashing;
import com.google.common.collect.ImmutableCollection$Builder;
import com.google.common.collect.Serialization;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public final class HashBiMap
extends AbstractMap
implements BiMap,
Serializable {
    private static final int ABSENT = 255;
    private static final int ENDPOINT = 254;
    private transient Set entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    private transient BiMap inverse;
    private transient Set keySet;
    transient Object[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set valueSet;
    transient Object[] values;

    private HashBiMap(int n3) {
        this.init(n3);
    }

    public static /* synthetic */ int access$000(HashBiMap hashBiMap) {
        return hashBiMap.firstInInsertionOrder;
    }

    public static /* synthetic */ int[] access$100(HashBiMap hashBiMap) {
        return hashBiMap.nextInInsertionOrder;
    }

    public static /* synthetic */ void access$200(HashBiMap hashBiMap, int n3, Object object, boolean bl2) {
        hashBiMap.replaceValueInEntry(n3, object, bl2);
    }

    public static /* synthetic */ BiMap access$302(HashBiMap hashBiMap, BiMap biMap) {
        hashBiMap.inverse = biMap;
        return biMap;
    }

    public static /* synthetic */ void access$400(HashBiMap hashBiMap, int n3, Object object, boolean bl2) {
        hashBiMap.replaceKeyInEntry(n3, object, bl2);
    }

    private int bucket(int n3) {
        int n4 = this.hashTableKToV.length + -1;
        return n3 & n4;
    }

    public static HashBiMap create() {
        return HashBiMap.create(16);
    }

    public static HashBiMap create(int n3) {
        HashBiMap hashBiMap = new HashBiMap(n3);
        return hashBiMap;
    }

    public static HashBiMap create(Map map2) {
        HashBiMap hashBiMap = HashBiMap.create(map2.size());
        hashBiMap.putAll(map2);
        return hashBiMap;
    }

    private static int[] createFilledWithAbsent(int n3) {
        int[] nArray = new int[n3];
        Arrays.fill(nArray, -1);
        return nArray;
    }

    private void deleteFromTableKToV(int n3, int n4) {
        int[] nArray;
        boolean bl2;
        int n7 = -1;
        if (n3 != n7) {
            bl2 = true;
        } else {
            bl2 = false;
            nArray = null;
        }
        Preconditions.checkArgument(bl2);
        n4 = this.bucket(n4);
        nArray = this.hashTableKToV;
        int n8 = nArray[n4];
        if (n8 == n3) {
            int n10;
            int[] nArray2 = this.nextInBucketKToV;
            nArray[n4] = n10 = nArray2[n3];
            nArray2[n3] = n7;
            return;
        }
        Object object = this.nextInBucketKToV;
        n4 = object[n8];
        while (true) {
            int n14 = n8;
            n8 = n4;
            n4 = n14;
            if (n8 == n7) break;
            if (n8 == n3) {
                nArray = this.nextInBucketKToV;
                nArray[n14] = n8 = nArray[n3];
                nArray[n3] = n7;
                return;
            }
            object = this.nextInBucketKToV;
            n4 = object[n8];
        }
        object = new AssertionError;
        StringBuilder stringBuilder = new StringBuilder("Expected to find entry with key ");
        Object object2 = this.keys[n3];
        stringBuilder.append(object2);
        object2 = stringBuilder.toString();
        object(object2);
        throw object;
    }

    private void deleteFromTableVToK(int n3, int n4) {
        int[] nArray;
        boolean bl2;
        int n7 = -1;
        if (n3 != n7) {
            bl2 = true;
        } else {
            bl2 = false;
            nArray = null;
        }
        Preconditions.checkArgument(bl2);
        n4 = this.bucket(n4);
        nArray = this.hashTableVToK;
        int n8 = nArray[n4];
        if (n8 == n3) {
            int n10;
            int[] nArray2 = this.nextInBucketVToK;
            nArray[n4] = n10 = nArray2[n3];
            nArray2[n3] = n7;
            return;
        }
        Object object = this.nextInBucketVToK;
        n4 = object[n8];
        while (true) {
            int n14 = n8;
            n8 = n4;
            n4 = n14;
            if (n8 == n7) break;
            if (n8 == n3) {
                nArray = this.nextInBucketVToK;
                nArray[n14] = n8 = nArray[n3];
                nArray[n3] = n7;
                return;
            }
            object = this.nextInBucketVToK;
            n4 = object[n8];
        }
        object = new AssertionError;
        StringBuilder stringBuilder = new StringBuilder("Expected to find entry with value ");
        Object object2 = this.values[n3];
        stringBuilder.append(object2);
        object2 = stringBuilder.toString();
        object(object2);
        throw object;
    }

    private void ensureCapacity(int n3) {
        Object[] objectArray;
        int n4;
        Object object = this.nextInBucketKToV;
        int n7 = ((int[])object).length;
        if (n7 < n3) {
            n4 = ImmutableCollection$Builder.expandedCapacity(((int[])object).length, n3);
            objectArray = Arrays.copyOf(this.keys, n4);
            this.keys = objectArray;
            objectArray = Arrays.copyOf(this.values, n4);
            this.values = objectArray;
            objectArray = HashBiMap.expandAndFillWithAbsent(this.nextInBucketKToV, n4);
            this.nextInBucketKToV = (int[])objectArray;
            objectArray = HashBiMap.expandAndFillWithAbsent(this.nextInBucketVToK, n4);
            this.nextInBucketVToK = (int[])objectArray;
            objectArray = HashBiMap.expandAndFillWithAbsent(this.prevInInsertionOrder, n4);
            this.prevInInsertionOrder = (int[])objectArray;
            objectArray = this.nextInInsertionOrder;
            object = HashBiMap.expandAndFillWithAbsent((int[])objectArray, n4);
            this.nextInInsertionOrder = object;
        }
        if ((n4 = ((int[])(object = this.hashTableKToV)).length) < n3) {
            double d2 = 1.0;
            n3 = Hashing.closedTableSize(n3, d2);
            object = HashBiMap.createFilledWithAbsent(n3);
            this.hashTableKToV = object;
            int[] nArray = HashBiMap.createFilledWithAbsent(n3);
            this.hashTableVToK = nArray;
            n3 = 0;
            nArray = null;
            while (n3 < (n4 = this.size)) {
                n4 = Hashing.smearedHash(this.keys[n3]);
                n4 = this.bucket(n4);
                objectArray = this.nextInBucketKToV;
                int[] nArray2 = this.hashTableKToV;
                int n8 = nArray2[n4];
                objectArray[n3] = n8;
                nArray2[n4] = n3;
                object = this.values[n3];
                n4 = Hashing.smearedHash(object);
                n4 = this.bucket(n4);
                objectArray = this.nextInBucketVToK;
                nArray2 = this.hashTableVToK;
                n8 = nArray2[n4];
                objectArray[n3] = n8;
                nArray2[n4] = n3++;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] nArray, int n3) {
        int n4 = nArray.length;
        nArray = Arrays.copyOf(nArray, n3);
        Arrays.fill(nArray, n4, n3, -1);
        return nArray;
    }

    private void insertIntoTableKToV(int n3, int n4) {
        int n7;
        int[] nArray;
        int n8 = -1;
        if (n3 != n8) {
            n8 = 1;
        } else {
            n8 = 0;
            nArray = null;
        }
        Preconditions.checkArgument(n8 != 0);
        n4 = this.bucket(n4);
        nArray = this.nextInBucketKToV;
        int[] nArray2 = this.hashTableKToV;
        nArray[n3] = n7 = nArray2[n4];
        nArray2[n4] = n3;
    }

    private void insertIntoTableVToK(int n3, int n4) {
        int n7;
        int[] nArray;
        int n8 = -1;
        if (n3 != n8) {
            n8 = 1;
        } else {
            n8 = 0;
            nArray = null;
        }
        Preconditions.checkArgument(n8 != 0);
        n4 = this.bucket(n4);
        nArray = this.nextInBucketVToK;
        int[] nArray2 = this.hashTableVToK;
        nArray[n3] = n7 = nArray2[n4];
        nArray2[n4] = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void moveEntryToIndex(int var1_1, int var2_2) {
        block6: {
            if (var1_1 == var2_2) {
                return;
            }
            var3_3 /* !! */  = this.prevInInsertionOrder[var1_1];
            var4_4 /* !! */  = this.nextInInsertionOrder[var1_1];
            this.setSucceeds(var3_3 /* !! */ , var2_2);
            this.setSucceeds(var2_2, var4_4 /* !! */ );
            var5_5 /* !! */  = this.keys;
            var6_6 = var5_5 /* !! */ [var1_1];
            var7_7 /* !! */  = this.values;
            var8_8 = var7_7 /* !! */ [var1_1];
            var5_5 /* !! */ [var2_2] = var6_6;
            var7_7 /* !! */ [var2_2] = var8_8;
            var3_3 /* !! */  = Hashing.smearedHash(var6_6);
            var3_3 /* !! */  = this.bucket(var3_3 /* !! */ );
            var6_6 = this.hashTableKToV;
            var9_9 /* !! */  = var6_6[var3_3 /* !! */ ];
            if (var9_9 /* !! */  != var1_1) break block6;
            var6_6[var3_3 /* !! */ ] = var2_2;
            ** GOTO lbl30
        }
        var5_5 /* !! */  = this.nextInBucketKToV;
        var3_3 /* !! */  = (int)var5_5 /* !! */ [var9_9 /* !! */ ];
        while (true) {
            block7: {
                block8: {
                    var10_10 = var9_9 /* !! */ ;
                    var9_9 /* !! */  = var3_3 /* !! */ ;
                    var3_3 /* !! */  = (int)var10_10;
                    if (var9_9 /* !! */  != var1_1) break block7;
                    var6_6 = this.nextInBucketKToV;
                    var6_6[var10_10] = var2_2;
lbl30:
                    // 2 sources

                    var5_5 /* !! */  = this.nextInBucketKToV;
                    var4_4 /* !! */  = (int)var5_5 /* !! */ [var1_1];
                    var5_5 /* !! */ [var2_2] = var4_4 /* !! */ ;
                    var4_4 /* !! */  = -1;
                    var5_5 /* !! */ [var1_1] = var4_4 /* !! */ ;
                    var3_3 /* !! */  = Hashing.smearedHash(var8_8);
                    var3_3 /* !! */  = this.bucket(var3_3 /* !! */ );
                    var7_7 /* !! */  = this.hashTableVToK;
                    var11_11 /* !! */  = var7_7 /* !! */ [var3_3 /* !! */ ];
                    if (var11_11 /* !! */  != var1_1) break block8;
                    var7_7 /* !! */ [var3_3 /* !! */ ] = var2_2;
                    ** GOTO lbl52
                }
                var5_5 /* !! */  = this.nextInBucketVToK;
                var3_3 /* !! */  = (int)var5_5 /* !! */ [var11_11 /* !! */ ];
                while (true) {
                    block9: {
                        var10_10 = var11_11 /* !! */ ;
                        var11_11 /* !! */  = var3_3 /* !! */ ;
                        var3_3 /* !! */  = (int)var10_10;
                        if (var11_11 /* !! */  != var1_1) break block9;
                        var7_7 /* !! */  = this.nextInBucketVToK;
                        var7_7 /* !! */ [var10_10] = var2_2;
lbl52:
                        // 2 sources

                        var5_5 /* !! */  = this.nextInBucketVToK;
                        var5_5 /* !! */ [var2_2] = var9_9 /* !! */  = var5_5 /* !! */ [var1_1];
                        var5_5 /* !! */ [var1_1] = var4_4 /* !! */ ;
                        return;
                    }
                    var5_5 /* !! */  = this.nextInBucketVToK;
                    var3_3 /* !! */  = (int)var5_5 /* !! */ [var11_11 /* !! */ ];
                }
            }
            var5_5 /* !! */  = this.nextInBucketKToV;
            var3_3 /* !! */  = (int)var5_5 /* !! */ [var9_9 /* !! */ ];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n3 = Serialization.readCount(objectInputStream);
        this.init(16);
        Serialization.populateMap(this, objectInputStream, n3);
    }

    private void removeEntry(int n3, int n4, int n7) {
        int n8 = -1;
        int n10 = 1;
        n8 = n3 != n8 ? 1 : 0;
        Preconditions.checkArgument(n8 != 0);
        this.deleteFromTableKToV(n3, n4);
        this.deleteFromTableVToK(n3, n7);
        n4 = this.prevInInsertionOrder[n3];
        n7 = this.nextInInsertionOrder[n3];
        this.setSucceeds(n4, n7);
        n4 = this.size - n10;
        this.moveEntryToIndex(n4, n3);
        Object[] objectArray = this.keys;
        n4 = this.size;
        n7 = n4 + -1;
        objectArray[n7] = null;
        objectArray = this.values;
        n7 = n4 + -1;
        objectArray[n7] = null;
        this.size = n4 -= n10;
        this.modCount = n3 = this.modCount + n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void replaceKeyInEntry(int n3, Object object, boolean n4) {
        int[] nArray;
        int n7 = -1;
        int n8 = n3 != n7 ? 1 : 0;
        Preconditions.checkArgument(n8 != 0);
        n8 = Hashing.smearedHash(object);
        int n10 = this.findEntryByKey(object, n8);
        int n14 = this.lastInInsertionOrder;
        if (n10 != n7) {
            if (n4 == 0) {
                object = jk0_0.a(object, "Key already present in map: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            n14 = this.prevInInsertionOrder[n10];
            nArray = this.nextInInsertionOrder;
            n4 = nArray[n10];
            this.removeEntryKeyHashKnown(n10, n8);
            n7 = this.size;
            if (n3 == n7) {
                n3 = n10;
            }
        } else {
            n4 = -2;
        }
        if (n14 == n3) {
            int[] nArray2 = this.prevInInsertionOrder;
            n14 = nArray2[n3];
        } else {
            n7 = this.size;
            if (n14 == n7) {
                n14 = n10;
            }
        }
        if (n4 == n3) {
            nArray = this.nextInInsertionOrder;
            n10 = nArray[n3];
        } else {
            n7 = this.size;
            if (n4 != n7) {
                n10 = n4;
            }
        }
        n4 = this.prevInInsertionOrder[n3];
        n7 = this.nextInInsertionOrder[n3];
        this.setSucceeds(n4, n7);
        n4 = Hashing.smearedHash(this.keys[n3]);
        this.deleteFromTableKToV(n3, n4);
        this.keys[n3] = object;
        int n15 = Hashing.smearedHash(object);
        this.insertIntoTableKToV(n3, n15);
        this.setSucceeds(n14, n3);
        this.setSucceeds(n3, n10);
    }

    private void replaceValueInEntry(int n3, Object object, boolean n4) {
        int n7 = -1;
        int n8 = n3 != n7 ? 1 : 0;
        Preconditions.checkArgument(n8 != 0);
        n8 = Hashing.smearedHash(object);
        int n10 = this.findEntryByValue(object, n8);
        if (n10 != n7) {
            if (n4 != 0) {
                this.removeEntryValueHashKnown(n10, n8);
                n4 = this.size;
                if (n3 == n4) {
                    n3 = n10;
                }
            } else {
                object = jk0_0.a(object, "Value already present in map: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
        }
        n4 = Hashing.smearedHash(this.values[n3]);
        this.deleteFromTableVToK(n3, n4);
        this.values[n3] = object;
        this.insertIntoTableVToK(n3, n8);
    }

    private void setSucceeds(int n3, int n4) {
        int n7 = -2;
        if (n3 == n7) {
            this.firstInInsertionOrder = n4;
        } else {
            int[] nArray = this.nextInInsertionOrder;
            nArray[n3] = n4;
        }
        if (n4 == n7) {
            this.lastInInsertionOrder = n3;
        } else {
            int[] nArray = this.prevInInsertionOrder;
            nArray[n4] = n3;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMap(this, objectOutputStream);
    }

    public void clear() {
        int n3;
        Object[] objectArray = this.keys;
        int n4 = this.size;
        Arrays.fill(objectArray, 0, n4, null);
        objectArray = this.values;
        n4 = this.size;
        Arrays.fill(objectArray, 0, n4, null);
        objectArray = this.hashTableKToV;
        n4 = -1;
        Arrays.fill((int[])objectArray, n4);
        Arrays.fill(this.hashTableVToK, n4);
        objectArray = this.nextInBucketKToV;
        int n7 = this.size;
        Arrays.fill((int[])objectArray, 0, n7, n4);
        objectArray = this.nextInBucketVToK;
        n7 = this.size;
        Arrays.fill((int[])objectArray, 0, n7, n4);
        objectArray = this.prevInInsertionOrder;
        n7 = this.size;
        Arrays.fill((int[])objectArray, 0, n7, n4);
        objectArray = this.nextInInsertionOrder;
        n7 = this.size;
        Arrays.fill((int[])objectArray, 0, n7, n4);
        this.size = 0;
        this.firstInInsertionOrder = n3 = -2;
        this.lastInInsertionOrder = n3;
        this.modCount = n3 = this.modCount + 1;
    }

    public boolean containsKey(Object object) {
        int n3;
        int n4 = this.findEntryByKey(object);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public boolean containsValue(Object object) {
        int n3;
        int n4 = this.findEntryByValue(object);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set == null) {
            this.entrySet = set = new HashBiMap$EntrySet(this);
        }
        return set;
    }

    public int findEntry(Object object, int n3, int[] object2, int[] nArray, Object[] objectArray) {
        int n4;
        n3 = this.bucket(n3);
        n3 = object2[n3];
        while (n3 != (n4 = -1)) {
            object2 = objectArray[n3];
            n4 = (int)(Objects.equal(object2, object) ? 1 : 0);
            if (n4 != 0) {
                return n3;
            }
            n3 = nArray[n3];
        }
        return n4;
    }

    public int findEntryByKey(Object object) {
        int n3 = Hashing.smearedHash(object);
        return this.findEntryByKey(object, n3);
    }

    public int findEntryByKey(Object object, int n3) {
        int[] nArray = this.hashTableKToV;
        int[] nArray2 = this.nextInBucketKToV;
        Object[] objectArray = this.keys;
        return this.findEntry(object, n3, nArray, nArray2, objectArray);
    }

    public int findEntryByValue(Object object) {
        int n3 = Hashing.smearedHash(object);
        return this.findEntryByValue(object, n3);
    }

    public int findEntryByValue(Object object, int n3) {
        int[] nArray = this.hashTableVToK;
        int[] nArray2 = this.nextInBucketVToK;
        Object[] objectArray = this.values;
        return this.findEntry(object, n3, nArray, nArray2, objectArray);
    }

    public Object forcePut(Object object, Object object2) {
        return this.put(object, object2, true);
    }

    public Object get(Object object) {
        int n3;
        int n4 = this.findEntryByKey(object);
        if (n4 == (n3 = -1)) {
            n4 = 0;
            object = null;
        } else {
            Object[] objectArray = this.values;
            object = objectArray[n4];
        }
        return object;
    }

    public Object getInverse(Object object) {
        int n3;
        int n4 = this.findEntryByValue(object);
        if (n4 == (n3 = -1)) {
            n4 = 0;
            object = null;
        } else {
            Object[] objectArray = this.keys;
            object = objectArray[n4];
        }
        return object;
    }

    public void init(int n3) {
        CollectPreconditions.checkNonnegative(n3, "expectedSize");
        int n4 = Hashing.closedTableSize(n3, 1.0);
        this.size = 0;
        Object[] objectArray = new Object[n3];
        this.keys = objectArray;
        objectArray = new Object[n3];
        this.values = objectArray;
        objectArray = HashBiMap.createFilledWithAbsent(n4);
        this.hashTableKToV = (int[])objectArray;
        int[] nArray = HashBiMap.createFilledWithAbsent(n4);
        this.hashTableVToK = nArray;
        nArray = HashBiMap.createFilledWithAbsent(n3);
        this.nextInBucketKToV = nArray;
        nArray = HashBiMap.createFilledWithAbsent(n3);
        this.nextInBucketVToK = nArray;
        this.firstInInsertionOrder = n4 = -2;
        this.lastInInsertionOrder = n4;
        nArray = HashBiMap.createFilledWithAbsent(n3);
        this.prevInInsertionOrder = nArray;
        int[] nArray2 = HashBiMap.createFilledWithAbsent(n3);
        this.nextInInsertionOrder = nArray2;
    }

    public BiMap inverse() {
        BiMap biMap = this.inverse;
        if (biMap == null) {
            this.inverse = biMap = new HashBiMap$Inverse(this);
        }
        return biMap;
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set == null) {
            this.keySet = set = new HashBiMap$KeySet(this);
        }
        return set;
    }

    public Object put(Object object, Object object2) {
        return this.put(object, object2, false);
    }

    /*
     * WARNING - void declaration
     */
    public Object put(Object object, Object object2, boolean bl2) {
        Object[] objectArray;
        int n3;
        int n4 = Hashing.smearedHash(object);
        int n7 = this.findEntryByKey(object, n4);
        if (n7 != (n3 = -1)) {
            object = this.values[n7];
            n4 = (int)(Objects.equal(object, object2) ? 1 : 0);
            if (n4 != 0) {
                return object2;
            }
            this.replaceValueInEntry(n7, object2, bl2);
            return object;
        }
        n7 = Hashing.smearedHash(object2);
        int n8 = this.findEntryByValue(object2, n7);
        int n10 = 1;
        if (bl2) {
            if (n8 != n3) {
                this.removeEntryValueHashKnown(n8, n7);
            }
        } else {
            void var3_6;
            if (n8 == n3) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                objectArray = null;
            }
            String string2 = "Value already present: %s";
            Preconditions.checkArgument((boolean)var3_6, string2, object2);
        }
        int n14 = this.size + n10;
        this.ensureCapacity(n14);
        objectArray = this.keys;
        n3 = this.size;
        objectArray[n3] = object;
        this.values[n3] = object2;
        this.insertIntoTableKToV(n3, n4);
        int n15 = this.size;
        this.insertIntoTableVToK(n15, n7);
        n15 = this.lastInInsertionOrder;
        int n16 = this.size;
        this.setSucceeds(n15, n16);
        n15 = this.size;
        this.setSucceeds(n15, -2);
        this.size = n15 = this.size + n10;
        this.modCount = n15 = this.modCount + n10;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Object putInverse(Object object, Object objectArray, boolean bl2) {
        Object[] objectArray2;
        int n3;
        int n4 = Hashing.smearedHash(object);
        int n7 = this.findEntryByValue(object, n4);
        if (n7 != (n3 = -1)) {
            object = this.keys[n7];
            n4 = (int)(Objects.equal(object, objectArray) ? 1 : 0);
            if (n4 != 0) {
                return objectArray;
            }
            this.replaceKeyInEntry(n7, objectArray, bl2);
            return object;
        }
        n7 = this.lastInInsertionOrder;
        int n8 = Hashing.smearedHash(objectArray);
        int n10 = this.findEntryByKey(objectArray, n8);
        int n14 = 1;
        if (bl2) {
            if (n10 != n3) {
                objectArray2 = this.prevInInsertionOrder;
                n7 = objectArray2[n10];
                this.removeEntryKeyHashKnown(n10, n8);
            }
        } else {
            void var3_6;
            if (n10 == n3) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                objectArray2 = null;
            }
            String string2 = "Key already present: %s";
            Preconditions.checkArgument((boolean)var3_6, string2, (Object)objectArray);
        }
        int n15 = this.size + n14;
        this.ensureCapacity(n15);
        objectArray2 = this.keys;
        n3 = this.size;
        objectArray2[n3] = (int)objectArray;
        objectArray = this.values;
        objectArray[n3] = object;
        this.insertIntoTableKToV(n3, n8);
        Object object2 = this.size;
        this.insertIntoTableVToK((int)object2, n4);
        object2 = -2;
        if (n7 == object2) {
            object2 = this.firstInInsertionOrder;
        } else {
            object = this.nextInInsertionOrder;
            object2 = object[n7];
        }
        int n16 = this.size;
        this.setSucceeds(n7, n16);
        n16 = this.size;
        this.setSucceeds(n16, (int)object2);
        this.size = object2 = this.size + n14;
        this.modCount = object2 = this.modCount + n14;
        return null;
    }

    public Object remove(Object object) {
        int n3;
        int n4 = Hashing.smearedHash(object);
        int n7 = this.findEntryByKey(object, n4);
        if (n7 == (n3 = -1)) {
            return null;
        }
        Object object2 = this.values[n7];
        this.removeEntryKeyHashKnown(n7, n4);
        return object2;
    }

    public void removeEntry(int n3) {
        int n4 = Hashing.smearedHash(this.keys[n3]);
        this.removeEntryKeyHashKnown(n3, n4);
    }

    public void removeEntryKeyHashKnown(int n3, int n4) {
        int n7 = Hashing.smearedHash(this.values[n3]);
        this.removeEntry(n3, n4, n7);
    }

    public void removeEntryValueHashKnown(int n3, int n4) {
        int n7 = Hashing.smearedHash(this.keys[n3]);
        this.removeEntry(n3, n7, n4);
    }

    public Object removeInverse(Object object) {
        int n3;
        int n4 = Hashing.smearedHash(object);
        int n7 = this.findEntryByValue(object, n4);
        if (n7 == (n3 = -1)) {
            return null;
        }
        Object object2 = this.keys[n7];
        this.removeEntryValueHashKnown(n7, n4);
        return object2;
    }

    public int size() {
        return this.size;
    }

    public Set values() {
        Set set = this.valueSet;
        if (set == null) {
            this.valueSet = set = new HashBiMap$ValueSet(this);
        }
        return set;
    }
}

