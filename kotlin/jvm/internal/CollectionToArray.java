/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CollectionToArray {
    private static final Object[] EMPTY = new Object[0];
    private static final int MAX_SIZE = 0x7FFFFFFD;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final Object[] toArray(Collection object) {
        void var0_7;
        Iterator iterator;
        int n3;
        Object[] objectArray = "collection";
        Intrinsics.checkNotNullParameter(object, (String)objectArray);
        int n4 = object.size();
        if (n4 == 0 || (n3 = (iterator = object.iterator()).hasNext()) == 0) {
            Object[] objectArray2 = EMPTY;
            return var0_7;
        }
        objectArray = new Object[n4];
        n3 = 0;
        while (true) {
            int n7 = n3 + 1;
            Object e2 = iterator.next();
            objectArray[n3] = e2;
            n3 = objectArray.length;
            String string2 = "copyOf(...)";
            if (n7 >= n3) {
                n3 = (int)(iterator.hasNext() ? 1 : 0);
                if (n3 == 0) {
                    Object[] objectArray3 = objectArray;
                    return var0_7;
                }
                n3 = n7 * 3 + 1 >>> 1;
                if (n3 <= n7 && n7 >= (n3 = 0x7FFFFFFD)) {
                    OutOfMemoryError outOfMemoryError = new OutOfMemoryError();
                    throw outOfMemoryError;
                }
                objectArray = Arrays.copyOf(objectArray, n3);
                Intrinsics.checkNotNullExpressionValue(objectArray, string2);
            } else {
                n3 = (int)(iterator.hasNext() ? 1 : 0);
                if (n3 == 0) {
                    Object[] objectArray4 = Arrays.copyOf(objectArray, n7);
                    Intrinsics.checkNotNullExpressionValue(objectArray4, string2);
                    return var0_7;
                }
            }
            n3 = n7;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final Object[] toArray(Collection object, Object[] objectArray) {
        String string2;
        void var2_6;
        String string3 = "collection";
        Intrinsics.checkNotNullParameter(object, string3);
        objectArray.getClass();
        int n3 = object.size();
        int n4 = 0;
        if (n3 == 0) {
            int n7 = objectArray.length;
            if (n7 <= 0) return objectArray;
            objectArray[0] = null;
            return objectArray;
        }
        int n8 = (object = object.iterator()).hasNext();
        if (n8 == 0) {
            int n10 = objectArray.length;
            if (n10 <= 0) return objectArray;
            objectArray[0] = null;
            return objectArray;
        }
        n8 = objectArray.length;
        if (n3 <= n8) {
            Object[] objectArray2 = objectArray;
        } else {
            Object object2 = Array.newInstance(objectArray.getClass().getComponentType(), n3);
            String string4 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
            Intrinsics.checkNotNull(object2, string4);
            Object[] objectArray3 = (Object[])object2;
        }
        while (true) {
            Object e2;
            n8 = n4 + 1;
            var2_6[n4] = e2 = object.next();
            n4 = ((void)var2_6).length;
            string2 = "copyOf(...)";
            if (n8 >= n4) {
                n4 = (int)(object.hasNext() ? 1 : 0);
                if (n4 == 0) {
                    return var2_6;
                }
                n4 = n8 * 3 + 1 >>> 1;
                if (n4 <= n8 && n8 >= (n4 = 0x7FFFFFFD)) {
                    object = new OutOfMemoryError();
                    throw object;
                }
                T[] TArray = Arrays.copyOf(var2_6, n4);
                Intrinsics.checkNotNullExpressionValue(TArray, string2);
            } else {
                n4 = (int)(object.hasNext() ? 1 : 0);
                if (n4 == 0) {
                    if (var2_6 != objectArray) break;
                    objectArray[n8] = null;
                    return objectArray;
                }
            }
            n4 = n8;
        }
        objectArray = Arrays.copyOf(var2_6, n8);
        Intrinsics.checkNotNullExpressionValue(objectArray, string2);
        return objectArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static final Object[] toArrayImpl(Collection object, Function0 objectArray, Function1 object2, Function2 function2) {
        int n3 = object.size();
        if (n3 == 0) {
            return (Object[])objectArray.invoke();
        }
        boolean bl2 = (object = object.iterator()).hasNext();
        if (!bl2) {
            return (Object[])objectArray.invoke();
        }
        objectArray = n3;
        objectArray = (Object[])object2.invoke(objectArray);
        int n4 = 0;
        object2 = null;
        while (true) {
            n3 = n4 + 1;
            Object e2 = object.next();
            objectArray[n4] = e2;
            n4 = objectArray.length;
            if (n3 >= n4) {
                n4 = (int)(object.hasNext() ? 1 : 0);
                if (n4 == 0) {
                    return objectArray;
                }
                n4 = n3 * 3 + 1 >>> 1;
                if (n4 <= n3 && n3 >= (n4 = 0x7FFFFFFD)) {
                    object = new OutOfMemoryError();
                    throw object;
                }
                objectArray = Arrays.copyOf(objectArray, n4);
                object2 = "copyOf(...)";
                Intrinsics.checkNotNullExpressionValue(objectArray, (String)object2);
            } else {
                n4 = (int)(object.hasNext() ? 1 : 0);
                if (n4 == 0) {
                    object = n3;
                    return (Object[])function2.invoke(objectArray, object);
                }
            }
            n4 = n3;
        }
    }
}

