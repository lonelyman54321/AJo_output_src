/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.UnsafeAllocator;

class UnsafeAllocator$4
extends UnsafeAllocator {
    public Object newInstance(Class object) {
        StringBuilder stringBuilder = new StringBuilder("Cannot allocate ");
        stringBuilder.append(object);
        stringBuilder.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        object = stringBuilder.toString();
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }
}

