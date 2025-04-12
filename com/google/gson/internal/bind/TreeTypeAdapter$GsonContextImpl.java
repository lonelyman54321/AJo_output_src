/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter$1;
import java.lang.reflect.Type;

final class TreeTypeAdapter$GsonContextImpl
implements JsonSerializationContext,
JsonDeserializationContext {
    final /* synthetic */ TreeTypeAdapter this$0;

    private TreeTypeAdapter$GsonContextImpl(TreeTypeAdapter treeTypeAdapter) {
        this.this$0 = treeTypeAdapter;
    }

    public /* synthetic */ TreeTypeAdapter$GsonContextImpl(TreeTypeAdapter treeTypeAdapter, TreeTypeAdapter$1 treeTypeAdapter$1) {
        this(treeTypeAdapter);
    }

    public Object deserialize(JsonElement jsonElement, Type type2) {
        return this.this$0.gson.fromJson(jsonElement, type2);
    }

    public JsonElement serialize(Object object) {
        return this.this$0.gson.toJsonTree(object);
    }

    public JsonElement serialize(Object object, Type type2) {
        return this.this$0.gson.toJsonTree(object, type2);
    }
}

