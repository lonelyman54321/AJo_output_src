/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;

class ConstructorConstructor$7
implements ObjectConstructor {
    final /* synthetic */ String val$message;

    public ConstructorConstructor$7(String string2) {
        this.val$message = string2;
    }

    public Object construct() {
        String string2 = this.val$message;
        JsonIOException jsonIOException = new JsonIOException(string2);
        throw jsonIOException;
    }
}

