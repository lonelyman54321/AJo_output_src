/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.UnsafeAllocator$1;
import com.google.gson.internal.UnsafeAllocator$2;
import com.google.gson.internal.UnsafeAllocator$3;
import com.google.gson.internal.UnsafeAllocator$4;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = UnsafeAllocator.create();

    public static /* synthetic */ void access$000(Class clazz) {
        UnsafeAllocator.assertInstantiable(clazz);
    }

    private static void assertInstantiable(Class object) {
        if ((object = ConstructorConstructor.checkInstantiable((Class)object)) == null) {
            return;
        }
        object = "UnsafeAllocator is used for non-instantiable type: ".concat((String)object);
        AssertionError assertionError = new AssertionError(object);
        throw assertionError;
    }

    private static UnsafeAllocator create() {
        Object object;
        Object object2;
        int n3 = 2;
        UnsafeAllocator$3 unsafeAllocator$3 = null;
        boolean bl2 = true;
        String string2 = "newInstance";
        Object object3 = ObjectStreamClass.class;
        Class<Class> clazz = Class.class;
        int n4 = 0;
        Object object4 = null;
        Object object5 = "sun.misc.Unsafe";
        try {
            object5 = Class.forName((String)object5);
            object2 = "theUnsafe";
        }
        catch (Exception exception) {
            object5 = "getConstructorId";
            try {
                object2 = new Class[bl2];
            }
            catch (Exception exception2) {
                Object object6;
                object3 = ObjectInputStream.class;
                try {
                    object6 = new Class[n3];
                }
                catch (Exception exception3) {
                    object6 = new UnsafeAllocator$4();
                    return object6;
                }
                object6[0] = clazz;
                object6[bl2] = clazz;
                object6 = ((Class)object3).getDeclaredMethod(string2, (Class<?>)object6);
                ((AccessibleObject)object6).setAccessible(bl2);
                unsafeAllocator$3 = new UnsafeAllocator$3((Method)object6);
                return unsafeAllocator$3;
            }
            object2[0] = clazz;
            object5 = ((Class)object3).getDeclaredMethod((String)object5, (Class<?>)object2);
            object5.setAccessible(bl2);
            object2 = new Object[bl2];
            object = Object.class;
            object2[0] = object;
            object4 = object5.invoke(null, (Object[])object2);
            object4 = (Integer)object4;
            n4 = (Integer)object4;
            object5 = new Class[n3];
            object5[0] = clazz;
            object2 = Integer.TYPE;
            object5[bl2] = object2;
            object3 = ((Class)object3).getDeclaredMethod(string2, (Class<?>)object5);
            ((AccessibleObject)object3).setAccessible(bl2);
            object5 = new UnsafeAllocator$2((Method)object3, n4);
            return object5;
        }
        object2 = object5.getDeclaredField((String)object2);
        ((AccessibleObject)object2).setAccessible(bl2);
        object2 = ((Field)object2).get(null);
        object = "allocateInstance";
        Class[] classArray = new Class[bl2];
        classArray[0] = clazz;
        object5 = object5.getMethod((String)object, classArray);
        object = new UnsafeAllocator$1((Method)object5, object2);
        return object;
    }

    public abstract Object newInstance(Class var1);
}

