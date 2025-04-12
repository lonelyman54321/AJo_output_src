/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.TypeAdapters$35;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayDeque;
import java.util.Map;

class TypeAdapters$28
extends TypeAdapter {
    private JsonElement readTerminal(JsonReader object, JsonToken object2) {
        Object object3 = TypeAdapters$35.$SwitchMap$com$google$gson$stream$JsonToken;
        int n3 = object2.ordinal();
        int n4 = object3[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 6;
                    if (n4 == n3) {
                        ((JsonReader)object).nextNull();
                        return JsonNull.INSTANCE;
                    }
                    object3 = new StringBuilder;
                    ((StringBuilder)object3)("Unexpected token: ");
                    ((StringBuilder)object3).append(object2);
                    object2 = ((StringBuilder)object3).toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
                object = ((JsonReader)object).nextBoolean();
                object2 = new JsonPrimitive((Boolean)object);
                return object2;
            }
            object = ((JsonReader)object).nextString();
            object2 = new JsonPrimitive((String)object);
            return object2;
        }
        object = ((JsonReader)object).nextString();
        object3 = new LazilyParsedNumber;
        ((LazilyParsedNumber)object3)((String)object);
        object2 = new JsonPrimitive((Number)object3);
        return object2;
    }

    private JsonElement tryBeginNesting(JsonReader object, JsonToken jsonToken) {
        int[] nArray = TypeAdapters$35.$SwitchMap$com$google$gson$stream$JsonToken;
        int n3 = jsonToken.ordinal();
        int n4 = 4;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 5;
            if (n3 != n4) {
                return null;
            }
            ((JsonReader)object).beginObject();
            object = new JsonObject();
            return object;
        }
        ((JsonReader)object).beginArray();
        object = new JsonArray();
        return object;
    }

    public JsonElement read(JsonReader jsonReader) {
        boolean bl2 = jsonReader instanceof JsonTreeReader;
        if (bl2) {
            return ((JsonTreeReader)jsonReader).nextJsonElement();
        }
        Object object = jsonReader.peek();
        JsonElement jsonElement = this.tryBeginNesting(jsonReader, (JsonToken)((Object)object));
        if (jsonElement == null) {
            return this.readTerminal(jsonReader, (JsonToken)((Object)object));
        }
        object = new ArrayDeque();
        while (true) {
            boolean bl3;
            if (bl3 = jsonReader.hasNext()) {
                boolean bl4;
                Object object2;
                bl3 = jsonElement instanceof JsonObject;
                if (bl3) {
                    object2 = jsonReader.nextName();
                } else {
                    bl3 = false;
                    object2 = null;
                }
                Object object3 = jsonReader.peek();
                JsonElement jsonElement2 = this.tryBeginNesting(jsonReader, (JsonToken)((Object)object3));
                boolean bl5 = jsonElement2 != null;
                if (jsonElement2 == null) {
                    jsonElement2 = this.readTerminal(jsonReader, (JsonToken)((Object)object3));
                }
                if (bl4 = jsonElement instanceof JsonArray) {
                    object2 = jsonElement;
                    object2 = (JsonArray)jsonElement;
                    ((JsonArray)object2).add(jsonElement2);
                } else {
                    object3 = jsonElement;
                    object3 = (JsonObject)jsonElement;
                    ((JsonObject)object3).add((String)object2, jsonElement2);
                }
                if (!bl5) continue;
                ((ArrayDeque)object).addLast(jsonElement);
                jsonElement = jsonElement2;
                continue;
            }
            bl3 = jsonElement instanceof JsonArray;
            if (bl3) {
                jsonReader.endArray();
            } else {
                jsonReader.endObject();
            }
            bl3 = ((ArrayDeque)object).isEmpty();
            if (bl3) {
                return jsonElement;
            }
            jsonElement = (JsonElement)((ArrayDeque)object).removeLast();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void write(JsonWriter object, JsonElement object2) {
        boolean bl2;
        if (object2 != null && !(bl2 = ((JsonElement)object2).isJsonNull())) {
            bl2 = ((JsonElement)object2).isJsonPrimitive();
            if (bl2) {
                bl2 = ((JsonPrimitive)(object2 = ((JsonElement)object2).getAsJsonPrimitive())).isNumber();
                if (bl2) {
                    object2 = ((JsonPrimitive)object2).getAsNumber();
                    ((JsonWriter)object).value((Number)object2);
                    return;
                }
                bl2 = ((JsonPrimitive)object2).isBoolean();
                if (bl2) {
                    boolean bl3 = ((JsonPrimitive)object2).getAsBoolean();
                    ((JsonWriter)object).value(bl3);
                    return;
                }
                object2 = ((JsonPrimitive)object2).getAsString();
                ((JsonWriter)object).value((String)object2);
                return;
            }
            bl2 = ((JsonElement)object2).isJsonArray();
            if (bl2) {
                ((JsonWriter)object).beginArray();
                object2 = ((JsonElement)object2).getAsJsonArray().iterator();
                while (true) {
                    if (!(bl2 = object2.hasNext())) {
                        ((JsonWriter)object).endArray();
                        return;
                    }
                    JsonElement jsonElement = (JsonElement)object2.next();
                    this.write((JsonWriter)object, jsonElement);
                }
            }
            bl2 = ((JsonElement)object2).isJsonObject();
            if (!bl2) {
                StringBuilder stringBuilder = new StringBuilder("Couldn't write ");
                object2 = object2.getClass();
                stringBuilder.append(object2);
                object2 = stringBuilder.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            ((JsonWriter)object).beginObject();
            object2 = ((JsonElement)object2).getAsJsonObject().entrySet().iterator();
            while (true) {
                if (!(bl2 = object2.hasNext())) {
                    ((JsonWriter)object).endObject();
                    return;
                }
                Object object3 = (Map.Entry)object2.next();
                String string2 = (String)object3.getKey();
                ((JsonWriter)object).name(string2);
                object3 = (JsonElement)object3.getValue();
                this.write((JsonWriter)object, (JsonElement)object3);
            }
        }
        ((JsonWriter)object).nullValue();
    }
}

