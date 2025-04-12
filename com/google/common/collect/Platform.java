/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashSet;
import com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.CompactLinkedHashSet;
import com.google.common.collect.MapMaker;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

final class Platform {
    private Platform() {
    }

    public static Object[] copy(Object[] objectArray, int n3, int n4, Object[] object) {
        object = object.getClass();
        return Arrays.copyOfRange(objectArray, n3, n4, (Class<? extends T[]>)object);
    }

    public static Class getDeclaringClassOrObjectForJ2cl(Enum enum_) {
        return enum_.getDeclaringClass();
    }

    public static Object[] newArray(Object[] objectArray, int n3) {
        int n4 = objectArray.length;
        if (n4 != 0) {
            n4 = 0;
            objectArray = Arrays.copyOf(objectArray, 0);
        }
        return Arrays.copyOf(objectArray, n3);
    }

    public static Map newHashMapWithExpectedSize(int n3) {
        return CompactHashMap.createWithExpectedSize(n3);
    }

    public static Set newHashSetWithExpectedSize(int n3) {
        return CompactHashSet.createWithExpectedSize(n3);
    }

    public static Map newLinkedHashMapWithExpectedSize(int n3) {
        return CompactLinkedHashMap.createWithExpectedSize(n3);
    }

    public static Set newLinkedHashSetWithExpectedSize(int n3) {
        return CompactLinkedHashSet.createWithExpectedSize(n3);
    }

    public static Set preservesInsertionOrderOnAddsSet() {
        return CompactHashSet.create();
    }

    public static Map preservesInsertionOrderOnPutsMap() {
        return CompactHashMap.create();
    }

    public static int reduceExponentIfGwt(int n3) {
        return n3;
    }

    public static int reduceIterationsIfGwt(int n3) {
        return n3;
    }

    public static MapMaker tryWeakKeys(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }
}

