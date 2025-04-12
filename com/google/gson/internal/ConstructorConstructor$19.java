/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.UnsafeAllocator;
import java.io.Serializable;

class ConstructorConstructor$19
implements ObjectConstructor {
    final /* synthetic */ ConstructorConstructor this$0;
    final /* synthetic */ Class val$rawType;

    public ConstructorConstructor$19(ConstructorConstructor constructorConstructor, Class clazz) {
        this.this$0 = constructorConstructor;
        this.val$rawType = clazz;
    }

    public Object construct() {
        Serializable serializable;
        UnsafeAllocator unsafeAllocator;
        try {
            unsafeAllocator = UnsafeAllocator.INSTANCE;
        }
        catch (Exception exception) {
            CharSequence charSequence = new StringBuilder("Unable to create instance of ");
            Class clazz = this.val$rawType;
            charSequence.append(clazz);
            charSequence.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            charSequence = charSequence.toString();
            serializable = new RuntimeException((String)charSequence, exception);
            throw serializable;
        }
        serializable = this.val$rawType;
        return unsafeAllocator.newInstance((Class)serializable);
    }
}

