/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zzhe
implements PrivilegedExceptionAction {
    public static final Unsafe zza() {
        Class<Unsafe> clazz = Unsafe.class;
        Field[] fieldArray = clazz.getDeclaredFields();
        int n3 = fieldArray.length;
        int n4 = 0;
        while (true) {
            Object object = null;
            if (n4 >= n3) break;
            Field field = fieldArray[n4];
            boolean bl2 = true;
            ((AccessibleObject)field).setAccessible(bl2);
            object = field.get(null);
            boolean bl3 = clazz.isInstance(object);
            if (bl3) {
                return (Unsafe)clazz.cast(object);
            }
            ++n4;
        }
        return null;
    }
}

