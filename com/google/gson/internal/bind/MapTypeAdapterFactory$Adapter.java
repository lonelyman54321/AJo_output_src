/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

final class MapTypeAdapterFactory$Adapter
extends TypeAdapter {
    private final ObjectConstructor constructor;
    private final TypeAdapter keyTypeAdapter;
    final /* synthetic */ MapTypeAdapterFactory this$0;
    private final TypeAdapter valueTypeAdapter;

    public MapTypeAdapterFactory$Adapter(MapTypeAdapterFactory object, Gson gson, Type type2, TypeAdapter typeAdapter, Type type3, TypeAdapter typeAdapter2, ObjectConstructor objectConstructor) {
        this.this$0 = object;
        this.keyTypeAdapter = object = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type2);
        this.valueTypeAdapter = object = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type3);
        this.constructor = objectConstructor;
    }

    private String keyToString(JsonElement object) {
        boolean bl2 = ((JsonElement)object).isJsonPrimitive();
        if (bl2) {
            bl2 = ((JsonPrimitive)(object = ((JsonElement)object).getAsJsonPrimitive())).isNumber();
            if (bl2) {
                return String.valueOf(((JsonPrimitive)object).getAsNumber());
            }
            bl2 = ((JsonPrimitive)object).isBoolean();
            if (bl2) {
                return Boolean.toString(((JsonPrimitive)object).getAsBoolean());
            }
            bl2 = ((JsonPrimitive)object).isString();
            if (bl2) {
                return ((JsonPrimitive)object).getAsString();
            }
            object = new AssertionError();
            throw object;
        }
        boolean bl3 = ((JsonElement)object).isJsonNull();
        if (bl3) {
            return "null";
        }
        object = new AssertionError();
        throw object;
    }

    public Map read(JsonReader object) {
        Object object2;
        Object object3 = ((JsonReader)object).peek();
        if (object3 == (object2 = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object2 = (Map)this.constructor.construct();
        Object object4 = JsonToken.BEGIN_ARRAY;
        String string2 = "duplicate key: ";
        if (object3 == object4) {
            boolean bl2;
            ((JsonReader)object).beginArray();
            while (bl2 = ((JsonReader)object).hasNext()) {
                ((JsonReader)object).beginArray();
                object3 = this.keyTypeAdapter.read((JsonReader)object);
                object4 = this.valueTypeAdapter.read((JsonReader)object);
                object4 = object2.put(object3, object4);
                if (object4 == null) {
                    ((JsonReader)object).endArray();
                    continue;
                }
                object3 = jk0_0.a(object3, string2);
                object = new JsonSyntaxException((String)object3);
                throw object;
            }
            ((JsonReader)object).endArray();
        } else {
            boolean bl3;
            ((JsonReader)object).beginObject();
            while (bl3 = ((JsonReader)object).hasNext()) {
                JsonReaderInternalAccess.INSTANCE.promoteNameToValue((JsonReader)object);
                object3 = this.keyTypeAdapter.read((JsonReader)object);
                object4 = this.valueTypeAdapter.read((JsonReader)object);
                object4 = object2.put(object3, object4);
                if (object4 == null) continue;
                object3 = jk0_0.a(object3, string2);
                object = new JsonSyntaxException((String)object3);
                throw object;
            }
            ((JsonReader)object).endObject();
        }
        return object2;
    }

    public void write(JsonWriter jsonWriter, Map iterator) {
        Map.Entry entry;
        boolean bl2;
        if (iterator == null) {
            jsonWriter.nullValue();
            return;
        }
        Object object = this.this$0;
        boolean bl3 = ((MapTypeAdapterFactory)object).complexMapKeySerialization;
        if (!bl3) {
            jsonWriter.beginObject();
            iterator = iterator.entrySet().iterator();
            while (bl3 = iterator.hasNext()) {
                object = (Map.Entry)iterator.next();
                Object object2 = String.valueOf(object.getKey());
                jsonWriter.name((String)object2);
                object2 = this.valueTypeAdapter;
                object = object.getValue();
                ((TypeAdapter)object2).write(jsonWriter, object);
            }
            jsonWriter.endObject();
            return;
        }
        int n3 = iterator.size();
        object = new ArrayList(n3);
        int n4 = iterator.size();
        ArrayList arrayList = new ArrayList(n4);
        iterator = iterator.entrySet().iterator();
        n4 = 0;
        boolean bl4 = false;
        Object object3 = null;
        while (bl2 = iterator.hasNext()) {
            entry = iterator.next();
            Object object4 = this.keyTypeAdapter;
            Object k2 = entry.getKey();
            object4 = ((TypeAdapter)object4).toJsonTree(k2);
            ((ArrayList)object).add(object4);
            entry = entry.getValue();
            arrayList.add(entry);
            bl2 = ((JsonElement)object4).isJsonArray();
            if (!bl2 && !(bl2 = ((JsonElement)object4).isJsonObject())) {
                bl2 = false;
                entry = null;
            } else {
                bl2 = true;
            }
            bl4 |= bl2;
        }
        if (bl4) {
            jsonWriter.beginArray();
            int n7 = ((ArrayList)object).size();
            while (n4 < n7) {
                jsonWriter.beginArray();
                Streams.write((JsonElement)((ArrayList)object).get(n4), jsonWriter);
                object3 = this.valueTypeAdapter;
                entry = arrayList.get(n4);
                ((TypeAdapter)object3).write(jsonWriter, entry);
                jsonWriter.endArray();
                ++n4;
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.beginObject();
            int n8 = ((ArrayList)object).size();
            while (n4 < n8) {
                object3 = (JsonElement)((ArrayList)object).get(n4);
                object3 = this.keyToString((JsonElement)object3);
                jsonWriter.name((String)object3);
                object3 = this.valueTypeAdapter;
                entry = arrayList.get(n4);
                ((TypeAdapter)object3).write(jsonWriter, entry);
                ++n4;
            }
            jsonWriter.endObject();
        }
    }
}

