/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Serialization$1;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class Serialization$FieldSetter {
    private final Field field;

    private Serialization$FieldSetter(Field field) {
        this.field = field;
        ((AccessibleObject)field).setAccessible(true);
    }

    public /* synthetic */ Serialization$FieldSetter(Field field, Serialization$1 serialization$1) {
        this(field);
    }

    public void set(Object object, int n3) {
        Object object2;
        Field field;
        try {
            field = this.field;
        }
        catch (IllegalAccessException illegalAccessException) {
            object2 = new AssertionError((Object)illegalAccessException);
            throw object2;
        }
        object2 = n3;
        field.set(object, object2);
    }

    public void set(Object object, Object object2) {
        Field field;
        try {
            field = this.field;
        }
        catch (IllegalAccessException illegalAccessException) {
            object2 = new AssertionError((Object)illegalAccessException);
            throw object2;
        }
        field.set(object, object2);
    }
}

