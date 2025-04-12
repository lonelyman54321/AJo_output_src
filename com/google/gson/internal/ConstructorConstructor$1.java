/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.Type;

class ConstructorConstructor$1
implements ObjectConstructor {
    final /* synthetic */ ConstructorConstructor this$0;
    final /* synthetic */ Type val$type;
    final /* synthetic */ InstanceCreator val$typeCreator;

    public ConstructorConstructor$1(ConstructorConstructor constructorConstructor, InstanceCreator instanceCreator, Type type2) {
        this.this$0 = constructorConstructor;
        this.val$typeCreator = instanceCreator;
        this.val$type = type2;
    }

    public Object construct() {
        InstanceCreator instanceCreator = this.val$typeCreator;
        Type type2 = this.val$type;
        return instanceCreator.createInstance(type2);
    }
}

