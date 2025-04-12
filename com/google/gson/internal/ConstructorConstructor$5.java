/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

class ConstructorConstructor$5
implements ObjectConstructor {
    final /* synthetic */ Type val$type;

    public ConstructorConstructor$5(Type type2) {
        this.val$type = type2;
    }

    public Object construct() {
        Object object = this.val$type;
        boolean bl2 = object instanceof ParameterizedType;
        String string2 = "Invalid EnumSet type: ";
        if (bl2) {
            object = ((ParameterizedType)object).getActualTypeArguments();
            CharSequence charSequence = null;
            bl2 = (object = object[0]) instanceof Class;
            if (bl2) {
                return EnumSet.noneOf((Class)object);
            }
            charSequence = new StringBuilder(string2);
            string2 = this.val$type.toString();
            charSequence.append(string2);
            charSequence = charSequence.toString();
            object = new JsonIOException((String)charSequence);
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

