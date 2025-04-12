/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Platform;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public final class ObjectArrays {
    private ObjectArrays() {
    }

    public static Object checkElementNotNull(Object object, int n3) {
        if (object != null) {
            return object;
        }
        String string2 = hj0_0.a(n3, "at index ");
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object[] checkElementsNotNull(Object ... objectArray) {
        int n3 = objectArray.length;
        ObjectArrays.checkElementsNotNull(objectArray, n3);
        return objectArray;
    }

    public static Object[] checkElementsNotNull(Object[] objectArray, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectArray[i3];
            ObjectArrays.checkElementNotNull(object, i3);
        }
        return objectArray;
    }

    public static Object[] concat(Object object, Object[] objectArray) {
        int n3 = objectArray.length;
        int n4 = 1;
        Object[] objectArray2 = ObjectArrays.newArray(objectArray, n3 += n4);
        objectArray2[0] = object;
        int n7 = objectArray.length;
        System.arraycopy(objectArray, 0, objectArray2, n4, n7);
        return objectArray2;
    }

    public static Object[] concat(Object[] objectArray, Object object) {
        int n3 = objectArray.length + 1;
        Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
        int n4 = objectArray.length;
        objectArray2[n4] = object;
        return objectArray2;
    }

    public static Object[] concat(Object[] objectArray, Object[] objectArray2, Class objectArray3) {
        int n3 = objectArray.length;
        int n4 = objectArray2.length;
        objectArray3 = ObjectArrays.newArray((Class)objectArray3, n3 += n4);
        n3 = objectArray.length;
        System.arraycopy(objectArray, 0, objectArray3, 0, n3);
        int n7 = objectArray.length;
        n3 = objectArray2.length;
        System.arraycopy(objectArray2, 0, objectArray3, n7, n3);
        return objectArray3;
    }

    public static Object[] copyAsObjectArray(Object[] objectArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = objectArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        n7 = 0;
        if (n4 == 0) {
            return new Object[0];
        }
        Object[] objectArray2 = new Object[n4];
        System.arraycopy(objectArray, n3, objectArray2, 0, n4);
        return objectArray2;
    }

    private static Object[] fillArray(Iterable object, Object[] objectArray) {
        boolean bl2;
        object = object.iterator();
        int n3 = 0;
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            int n4 = n3 + 1;
            objectArray[n3] = e2;
            n3 = n4;
        }
        return objectArray;
    }

    public static Object[] newArray(Class clazz, int n3) {
        return (Object[])Array.newInstance(clazz, n3);
    }

    public static Object[] newArray(Object[] objectArray, int n3) {
        return Platform.newArray(objectArray, n3);
    }

    public static void swap(Object[] objectArray, int n3, int n4) {
        Object object;
        Object object2 = objectArray[n3];
        objectArray[n3] = object = objectArray[n4];
        objectArray[n4] = object2;
    }

    public static Object[] toArrayImpl(Collection collection) {
        Object[] objectArray = new Object[collection.size()];
        return ObjectArrays.fillArray(collection, objectArray);
    }

    public static Object[] toArrayImpl(Collection collection, Object[] objectArray) {
        int n3 = objectArray.length;
        int n4 = collection.size();
        if (n3 < n4) {
            objectArray = ObjectArrays.newArray(objectArray, n4);
        }
        ObjectArrays.fillArray(collection, objectArray);
        int n7 = objectArray.length;
        if (n7 > n4) {
            n7 = 0;
            collection = null;
            objectArray[n4] = null;
        }
        return objectArray;
    }

    public static Object[] toArrayImpl(Object[] objectArray, int n3, int n4, Object[] objectArray2) {
        int n7 = n3 + n4;
        int n8 = objectArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        n7 = objectArray2.length;
        if (n7 < n4) {
            objectArray2 = ObjectArrays.newArray(objectArray2, n4);
        } else {
            n7 = objectArray2.length;
            if (n7 > n4) {
                n7 = 0;
                objectArray2[n4] = null;
            }
        }
        System.arraycopy(objectArray, n3, objectArray2, 0, n4);
        return objectArray2;
    }
}

