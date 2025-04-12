/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;

class ConstructorConstructor$3
implements ObjectConstructor {
    final /* synthetic */ ConstructorConstructor this$0;
    final /* synthetic */ String val$exceptionMessage;

    public ConstructorConstructor$3(ConstructorConstructor constructorConstructor, String string2) {
        this.this$0 = constructorConstructor;
        this.val$exceptionMessage = string2;
    }

    public Object construct() {
        String string2 = this.val$exceptionMessage;
        JsonIOException jsonIOException = new JsonIOException(string2);
        throw jsonIOException;
    }
}

