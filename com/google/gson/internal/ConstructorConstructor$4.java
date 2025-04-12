/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;

class ConstructorConstructor$4
implements ObjectConstructor {
    final /* synthetic */ ConstructorConstructor this$0;
    final /* synthetic */ String val$message;

    public ConstructorConstructor$4(ConstructorConstructor constructorConstructor, String string2) {
        this.this$0 = constructorConstructor;
        this.val$message = string2;
    }

    public Object construct() {
        String string2 = this.val$message;
        JsonIOException jsonIOException = new JsonIOException(string2);
        throw jsonIOException;
    }
}

