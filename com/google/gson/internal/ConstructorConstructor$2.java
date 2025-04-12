/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.Type;

class ConstructorConstructor$2
implements ObjectConstructor {
    final /* synthetic */ ConstructorConstructor this$0;
    final /* synthetic */ InstanceCreator val$rawTypeCreator;
    final /* synthetic */ Type val$type;

    public ConstructorConstructor$2(ConstructorConstructor constructorConstructor, InstanceCreator instanceCreator, Type type2) {
        this.this$0 = constructorConstructor;
        this.val$rawTypeCreator = instanceCreator;
        this.val$type = type2;
    }

    public Object construct() {
        InstanceCreator instanceCreator = this.val$rawTypeCreator;
        Type type2 = this.val$type;
        return instanceCreator.createInstance(type2);
    }
}

