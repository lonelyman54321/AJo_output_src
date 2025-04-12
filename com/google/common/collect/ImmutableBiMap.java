/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.BiMap;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableBiMap$Builder;
import com.google.common.collect.ImmutableBiMap$SerializedForm;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableBiMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public abstract class ImmutableBiMap
extends ImmutableMap
implements BiMap {
    public static ImmutableBiMap$Builder builder() {
        ImmutableBiMap$Builder immutableBiMap$Builder = new ImmutableBiMap$Builder();
        return immutableBiMap$Builder;
    }

    public static ImmutableBiMap$Builder builderWithExpectedSize(int n3) {
        CollectPreconditions.checkNonnegative(n3, "expectedSize");
        ImmutableBiMap$Builder immutableBiMap$Builder = new ImmutableBiMap$Builder(n3);
        return immutableBiMap$Builder;
    }

    public static ImmutableBiMap copyOf(Iterable iterable) {
        int n3 = iterable instanceof Collection;
        if (n3 != 0) {
            Iterable iterable2 = iterable;
            iterable2 = (Collection)iterable;
            n3 = iterable2.size();
        } else {
            n3 = 4;
        }
        ImmutableBiMap$Builder immutableBiMap$Builder = new ImmutableBiMap$Builder(n3);
        return immutableBiMap$Builder.putAll(iterable).build();
    }

    public static ImmutableBiMap copyOf(Map map2) {
        boolean bl2 = map2 instanceof ImmutableBiMap;
        if (bl2) {
            Map map3 = map2;
            map3 = (ImmutableBiMap)map2;
            boolean bl3 = ((ImmutableMap)map3).isPartialView();
            if (!bl3) {
                return map3;
            }
        }
        return ImmutableBiMap.copyOf(map2.entrySet());
    }

    public static ImmutableBiMap of() {
        return RegularImmutableBiMap.EMPTY;
    }

    public static ImmutableBiMap of(Object object, Object object2) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        Object[] objectArray = new Object[2];
        objectArray[0] = object;
        int n3 = 1;
        objectArray[n3] = object2;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        Object[] objectArray = new Object[4];
        objectArray[0] = object;
        objectArray[1] = object2;
        int n3 = 2;
        objectArray[n3] = object3;
        objectArray[3] = object4;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        Object[] objectArray = new Object[6];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        int n3 = 3;
        objectArray[n3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        CollectPreconditions.checkEntryNotNull(object7, object8);
        Object[] objectArray = new Object[8];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        int n3 = 4;
        objectArray[n3] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        CollectPreconditions.checkEntryNotNull(object7, object8);
        CollectPreconditions.checkEntryNotNull(object9, object10);
        Object[] objectArray = new Object[10];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        int n3 = 5;
        objectArray[n3] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        CollectPreconditions.checkEntryNotNull(object7, object8);
        CollectPreconditions.checkEntryNotNull(object9, object10);
        CollectPreconditions.checkEntryNotNull(object11, object12);
        Object[] objectArray = new Object[12];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        int n3 = 6;
        objectArray[n3] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        CollectPreconditions.checkEntryNotNull(object7, object8);
        CollectPreconditions.checkEntryNotNull(object9, object10);
        CollectPreconditions.checkEntryNotNull(object11, object12);
        CollectPreconditions.checkEntryNotNull(object13, object14);
        Object[] objectArray = new Object[14];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        int n3 = 7;
        objectArray[n3] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        CollectPreconditions.checkEntryNotNull(object7, object8);
        CollectPreconditions.checkEntryNotNull(object9, object10);
        CollectPreconditions.checkEntryNotNull(object11, object12);
        CollectPreconditions.checkEntryNotNull(object13, object14);
        CollectPreconditions.checkEntryNotNull(object15, object16);
        Object[] objectArray = new Object[16];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        int n3 = 8;
        objectArray[n3] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        CollectPreconditions.checkEntryNotNull(object7, object8);
        CollectPreconditions.checkEntryNotNull(object9, object10);
        CollectPreconditions.checkEntryNotNull(object11, object12);
        CollectPreconditions.checkEntryNotNull(object13, object14);
        CollectPreconditions.checkEntryNotNull(object15, object16);
        CollectPreconditions.checkEntryNotNull(object17, object18);
        Object[] objectArray = new Object[18];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        int n3 = 9;
        objectArray[n3] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        objectArray[17] = object18;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        CollectPreconditions.checkEntryNotNull(object, object2);
        CollectPreconditions.checkEntryNotNull(object3, object4);
        CollectPreconditions.checkEntryNotNull(object5, object6);
        CollectPreconditions.checkEntryNotNull(object7, object8);
        CollectPreconditions.checkEntryNotNull(object9, object10);
        CollectPreconditions.checkEntryNotNull(object11, object12);
        CollectPreconditions.checkEntryNotNull(object13, object14);
        CollectPreconditions.checkEntryNotNull(object15, object16);
        CollectPreconditions.checkEntryNotNull(object17, object18);
        CollectPreconditions.checkEntryNotNull(object19, object20);
        Object[] objectArray = new Object[20];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        int n3 = 10;
        objectArray[n3] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        objectArray[17] = object18;
        objectArray[18] = object19;
        objectArray[19] = object20;
        RegularImmutableBiMap regularImmutableBiMap = new RegularImmutableBiMap(objectArray, n3);
        return regularImmutableBiMap;
    }

    public static ImmutableBiMap ofEntries(Map.Entry ... entryArray) {
        return ImmutableBiMap.copyOf(Arrays.asList(entryArray));
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    public final ImmutableSet createValues() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public final Object forcePut(Object object, Object object2) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public abstract ImmutableBiMap inverse();

    public ImmutableSet values() {
        return ((ImmutableMap)((Object)this.inverse())).keySet();
    }

    public Object writeReplace() {
        ImmutableBiMap$SerializedForm immutableBiMap$SerializedForm = new ImmutableBiMap$SerializedForm(this);
        return immutableBiMap$SerializedForm;
    }
}

