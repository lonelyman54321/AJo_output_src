/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;

class ConstructorConstructor$8
implements ObjectConstructor {
    final /* synthetic */ String val$exceptionMessage;

    public ConstructorConstructor$8(String string2) {
        this.val$exceptionMessage = string2;
    }

    public Object construct() {
        String string2 = this.val$exceptionMessage;
        JsonIOException jsonIOException = new JsonIOException(string2);
        throw jsonIOException;
    }
}

