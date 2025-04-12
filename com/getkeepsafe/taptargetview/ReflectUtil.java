/*
 * Decompiled with CFR 0.152.
 */
package com.getkeepsafe.taptargetview;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

class ReflectUtil {
    public static Object getPrivateField(Object object, String object2) {
        object2 = object.getClass().getDeclaredField((String)object2);
        ((AccessibleObject)object2).setAccessible(true);
        return ((Field)object2).get(object);
    }
}

