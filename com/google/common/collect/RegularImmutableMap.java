/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Hashing;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableMap$Builder$DuplicateKey;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap$EntrySet;
import com.google.common.collect.RegularImmutableMap$KeySet;
import com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList;
import java.util.Arrays;
import java.util.Objects;

final class RegularImmutableMap
extends ImmutableMap {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap EMPTY;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID;
    final transient Object[] alternatingKeysAndValues;
    private final transient Object hashTable;
    private final transient int size;

    static {
        Object[] objectArray = new Object[]{};
        RegularImmutableMap regularImmutableMap = new RegularImmutableMap(null, objectArray, 0);
        EMPTY = regularImmutableMap;
    }

    private RegularImmutableMap(Object object, Object[] objectArray, int n3) {
        this.hashTable = object;
        this.alternatingKeysAndValues = objectArray;
        this.size = n3;
    }

    public static RegularImmutableMap create(int n3, Object[] objectArray) {
        return RegularImmutableMap.create(n3, objectArray, null);
    }

    public static RegularImmutableMap create(int n3, Object[] objectArray, ImmutableMap$Builder object) {
        if (n3 == 0) {
            return (RegularImmutableMap)EMPTY;
        }
        int n4 = 0;
        int n7 = 1;
        if (n3 == n7) {
            Object object2 = objectArray[0];
            Objects.requireNonNull(object2);
            object = objectArray[n7];
            Objects.requireNonNull(object);
            CollectPreconditions.checkEntryNotNull(object2, object);
            object2 = new RegularImmutableMap(null, objectArray, n7);
            return object2;
        }
        int n8 = objectArray.length >> n7;
        Preconditions.checkPositionIndex(n3, n8);
        n8 = ImmutableSet.chooseTableSize(n3);
        Object object3 = RegularImmutableMap.createHashTable(objectArray, n3, n8, 0);
        boolean bl2 = object3 instanceof Object[];
        if (bl2) {
            object3 = object3;
            n3 = 2;
            Object object4 = (ImmutableMap$Builder$DuplicateKey)object3[n3];
            if (object != null) {
                ((ImmutableMap$Builder)object).duplicateKey = object4;
                object4 = object3[0];
                object = (Integer)object3[n7];
                int n10 = (Integer)object;
                n4 = n10 * 2;
                objectArray = Arrays.copyOf(objectArray, n4);
                object3 = object4;
                n3 = n10;
            } else {
                throw ((ImmutableMap$Builder$DuplicateKey)object4).exception();
            }
        }
        object = new RegularImmutableMap(object3, objectArray, n3);
        return object;
    }

    private static Object createHashTable(Object[] objectArray, int n3, int n4, int n7) {
        int n8 = n3;
        int n10 = n4;
        ImmutableMap$Builder$DuplicateKey immutableMap$Builder$DuplicateKey = null;
        int n14 = 1;
        if (n3 == n14) {
            Object object = objectArray[n7];
            Objects.requireNonNull(object);
            n10 = n7 ^ 1;
            Object object2 = objectArray[n10];
            Objects.requireNonNull(object2);
            CollectPreconditions.checkEntryNotNull(object, object2);
            return null;
        }
        int n15 = n4 + -1;
        int n16 = 128;
        int n17 = 3;
        int n18 = -1;
        int n19 = 2;
        if (n4 <= n16) {
            Object object = new byte[n4];
            Arrays.fill(object, (byte)n18);
            n18 = 0;
            Object var15_21 = null;
            block0: for (n16 = 0; n16 < n8; ++n16) {
                int n20 = n16 * 2 + n7;
                int n21 = n18 * 2 + n7;
                Object object3 = objectArray[n20];
                Objects.requireNonNull(object3);
                Object object4 = objectArray[n20 ^= n14];
                Objects.requireNonNull(object4);
                CollectPreconditions.checkEntryNotNull(object3, object4);
                int n22 = Hashing.smear(object3.hashCode());
                while (true) {
                    int n24 = object[n22 &= n15];
                    int n25 = 255;
                    if ((n24 &= n25) == n25) {
                        object[n22] = n24 = (int)((byte)n21);
                        if (n18 < n16) {
                            objectArray[n21] = object3;
                            objectArray[n21 ^= 1] = object4;
                        }
                        ++n18;
                        continue block0;
                    }
                    Object object5 = objectArray[n24];
                    n25 = (int)(object3.equals(object5) ? 1 : 0);
                    if (n25 != 0) {
                        n21 = n24 ^ 1;
                        Object object6 = objectArray[n21];
                        Objects.requireNonNull(object6);
                        immutableMap$Builder$DuplicateKey = new ImmutableMap$Builder$DuplicateKey(object3, object4, object6);
                        objectArray[n21] = object4;
                        continue block0;
                    }
                    ++n22;
                }
            }
            if (n18 != n8) {
                Object[] objectArray2 = new Object[n17];
                objectArray2[0] = object;
                object = n18;
                objectArray2[n14] = object;
                objectArray2[n19] = immutableMap$Builder$DuplicateKey;
                object = objectArray2;
            }
            return object;
        }
        n16 = 32768;
        if (n4 <= n16) {
            Object object = new short[n4];
            Arrays.fill(object, (short)n18);
            n18 = 0;
            Object var15_22 = null;
            block2: for (n16 = 0; n16 < n8; ++n16) {
                int n26 = n16 * 2 + n7;
                int n27 = n18 * 2 + n7;
                Object object7 = objectArray[n26];
                Objects.requireNonNull(object7);
                Object object8 = objectArray[n26 ^= n14];
                Objects.requireNonNull(object8);
                CollectPreconditions.checkEntryNotNull(object7, object8);
                int n28 = Hashing.smear(object7.hashCode());
                while (true) {
                    int n29 = object[n28 &= n15];
                    char c2 = (char)-1;
                    if ((n29 &= c2) == c2) {
                        object[n28] = n29 = (int)((short)n27);
                        if (n18 < n16) {
                            objectArray[n27] = object7;
                            objectArray[n27 ^= 1] = object8;
                        }
                        ++n18;
                        continue block2;
                    }
                    Object object9 = objectArray[n29];
                    c2 = (char)(object7.equals(object9) ? 1 : 0);
                    if (c2 != '\u0000') {
                        n27 = n29 ^ 1;
                        Object object10 = objectArray[n27];
                        Objects.requireNonNull(object10);
                        immutableMap$Builder$DuplicateKey = new ImmutableMap$Builder$DuplicateKey(object7, object8, object10);
                        objectArray[n27] = object8;
                        continue block2;
                    }
                    ++n28;
                }
            }
            if (n18 != n8) {
                Object[] objectArray3 = new Object[n17];
                objectArray3[0] = object;
                object = n18;
                objectArray3[n14] = object;
                objectArray3[n19] = immutableMap$Builder$DuplicateKey;
                object = objectArray3;
            }
            return object;
        }
        Object object = new int[n4];
        Arrays.fill(object, n18);
        int n30 = 0;
        Object var19_35 = null;
        block4: for (n16 = 0; n16 < n8; ++n16) {
            int n32 = n16 * 2 + n7;
            int n34 = n30 * 2 + n7;
            Object object11 = objectArray[n32];
            Objects.requireNonNull(object11);
            Object object12 = objectArray[n32 ^= n14];
            Objects.requireNonNull(object12);
            CollectPreconditions.checkEntryNotNull(object11, object12);
            int n35 = Hashing.smear(object11.hashCode());
            while (true) {
                block24: {
                    block23: {
                        int n36;
                        block22: {
                            if ((n36 = object[n35 &= n15]) != n18) break block22;
                            object[n35] = n34;
                            if (n30 < n16) {
                                objectArray[n34] = object11;
                                objectArray[n34 ^= 1] = object12;
                            }
                            ++n30;
                            break block23;
                        }
                        Object object13 = objectArray[n36];
                        n18 = (int)(object11.equals(object13) ? 1 : 0);
                        if (n18 == 0) break block24;
                        n18 = n36 ^ 1;
                        Object object14 = objectArray[n18];
                        Objects.requireNonNull(object14);
                        immutableMap$Builder$DuplicateKey = new ImmutableMap$Builder$DuplicateKey(object11, object12, object14);
                        objectArray[n18] = object12;
                    }
                    n18 = -1;
                    continue block4;
                }
                ++n35;
                n18 = -1;
            }
        }
        if (n30 != n8) {
            Object[] objectArray4 = new Object[n17];
            objectArray4[0] = object;
            object = n30;
            objectArray4[n14] = object;
            objectArray4[n19] = immutableMap$Builder$DuplicateKey;
            object = objectArray4;
        }
        return object;
    }

    public static Object createHashTableOrThrow(Object[] object, int n3, int n4, int n7) {
        if ((n3 = (object = RegularImmutableMap.createHashTable(object, n3, n4, n7)) instanceof Object[]) == 0) {
            return object;
        }
        throw ((ImmutableMap$Builder$DuplicateKey)object[2]).exception();
    }

    public static Object get(Object object, Object[] objectArray, int n3, int n4, Object object2) {
        Object object3 = null;
        if (object2 == null) {
            return null;
        }
        int n7 = 1;
        if (n3 == n7) {
            object = objectArray[n4];
            Objects.requireNonNull(object);
            int n8 = object.equals(object2);
            if (n8 != 0) {
                n8 = n4 ^ 1;
                object3 = objectArray[n8];
                Objects.requireNonNull(object3);
            }
            return object3;
        }
        if (object == null) {
            return null;
        }
        n3 = object instanceof byte[];
        if (n3 != 0) {
            Object object4 = object;
            object4 = (byte[])object;
            n4 = ((Object)object4).length + -1;
            int n10 = Hashing.smear(object2.hashCode());
            while (true) {
                Object object5 = object4[n10 &= n4];
                int n14 = 255;
                if ((object5 = (Object)(object5 & n14)) == n14) {
                    return null;
                }
                Object object6 = objectArray[object5];
                n14 = (int)(object2.equals(object6) ? 1 : 0);
                if (n14 != 0) {
                    n10 = object5 ^ 1;
                    return objectArray[n10];
                }
                ++n10;
            }
        }
        n3 = object instanceof short[];
        if (n3 != 0) {
            Object object7 = object;
            object7 = (short[])object;
            n4 = ((Object)object7).length + -1;
            int n15 = Hashing.smear(object2.hashCode());
            while (true) {
                Object object8 = object7[n15 &= n4];
                char c2 = (char)-1;
                if ((object8 = (Object)(object8 & c2)) == c2) {
                    return null;
                }
                Object object9 = objectArray[object8];
                c2 = (char)(object2.equals(object9) ? 1 : 0);
                if (c2 != '\u0000') {
                    n15 = object8 ^ 1;
                    return objectArray[n15];
                }
                ++n15;
            }
        }
        object = (int[])object;
        n3 = ((Object)object).length - n7;
        n4 = Hashing.smear(object2.hashCode());
        int n16;
        Object object10;
        while ((object10 = object[n4 &= n3]) != (n16 = -1)) {
            Object object11 = objectArray[object10];
            n16 = (int)(object2.equals(object11) ? 1 : 0);
            if (n16 != 0) {
                int n17 = object10 ^ 1;
                return objectArray[n17];
            }
            ++n4;
        }
        return null;
    }

    public ImmutableSet createEntrySet() {
        Object[] objectArray = this.alternatingKeysAndValues;
        int n3 = this.size;
        RegularImmutableMap$EntrySet regularImmutableMap$EntrySet = new RegularImmutableMap$EntrySet(this, objectArray, 0, n3);
        return regularImmutableMap$EntrySet;
    }

    public ImmutableSet createKeySet() {
        Object object = this.alternatingKeysAndValues;
        int n3 = this.size;
        RegularImmutableMap$KeysOrValuesAsList regularImmutableMap$KeysOrValuesAsList = new RegularImmutableMap$KeysOrValuesAsList((Object[])object, 0, n3);
        object = new RegularImmutableMap$KeySet(this, regularImmutableMap$KeysOrValuesAsList);
        return object;
    }

    public ImmutableCollection createValues() {
        Object[] objectArray = this.alternatingKeysAndValues;
        int n3 = this.size;
        RegularImmutableMap$KeysOrValuesAsList regularImmutableMap$KeysOrValuesAsList = new RegularImmutableMap$KeysOrValuesAsList(objectArray, 1, n3);
        return regularImmutableMap$KeysOrValuesAsList;
    }

    public Object get(Object object) {
        Object object2 = this.hashTable;
        Object[] objectArray = this.alternatingKeysAndValues;
        int n3 = this.size;
        if ((object = RegularImmutableMap.get(object2, objectArray, n3, 0, object)) == null) {
            object = null;
        }
        return object;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }
}

