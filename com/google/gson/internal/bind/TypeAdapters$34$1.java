/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters$34;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;

class TypeAdapters$34$1
extends TypeAdapter {
    final /* synthetic */ TypeAdapters$34 this$0;
    final /* synthetic */ Class val$requestedType;

    public TypeAdapters$34$1(TypeAdapters$34 typeAdapters$34, Class clazz) {
        this.this$0 = typeAdapters$34;
        this.val$requestedType = clazz;
    }

    public Object read(JsonReader object) {
        Serializable serializable;
        boolean bl2;
        Object object2 = this.this$0.val$typeAdapter.read((JsonReader)object);
        if (object2 != null && !(bl2 = (serializable = this.val$requestedType).isInstance(object2))) {
            StringBuilder stringBuilder = new StringBuilder("Expected a ");
            String string2 = this.val$requestedType.getName();
            stringBuilder.append(string2);
            stringBuilder.append(" but was ");
            object2 = object2.getClass().getName();
            stringBuilder.append((String)object2);
            stringBuilder.append("; at path ");
            object = ((JsonReader)object).getPreviousPath();
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            serializable = new JsonSyntaxException((String)object);
            throw serializable;
        }
        return object2;
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.this$0.val$typeAdapter.write(jsonWriter, object);
    }
}

