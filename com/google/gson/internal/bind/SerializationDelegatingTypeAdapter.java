/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;

public abstract class SerializationDelegatingTypeAdapter
extends TypeAdapter {
    public abstract TypeAdapter getSerializationDelegate();
}

