/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

class ConstructorConstructor$6
implements ObjectConstructor {
    final /* synthetic */ Type val$type;

    public ConstructorConstructor$6(Type type2) {
        this.val$type = type2;
    }

    public Object construct() {
        Object object = this.val$type;
        boolean bl2 = object instanceof ParameterizedType;
        String string2 = "Invalid EnumMap type: ";
        if (bl2) {
            object = ((ParameterizedType)object).getActualTypeArguments();
            Object object2 = null;
            bl2 = (object = object[0]) instanceof Class;
            if (bl2) {
                object = (Class)object;
                object2 = new EnumMap(object);
                return object2;
            }
            object2 = new StringBuilder(string2);
            string2 = this.val$type.toString();
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            object = new JsonIOException((String)object2);
            throw object;
        }
        CharSequence charSequence = new StringBuilder(string2);
        string2 = this.val$type.toString();
        charSequence.append(string2);
        charSequence = charSequence.toString();
        object = new JsonIOException((String)charSequence);
        throw object;
    }
}

