/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import com.google.gson.internal.bind.ObjectTypeAdapter$2;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter
extends TypeAdapter {
    private static final TypeAdapterFactory DOUBLE_FACTORY = ObjectTypeAdapter.newFactory(ToNumberPolicy.DOUBLE);
    private final Gson gson;
    private final ToNumberStrategy toNumberStrategy;

    private ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy) {
        this.gson = gson;
        this.toNumberStrategy = toNumberStrategy;
    }

    public /* synthetic */ ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy, ObjectTypeAdapter$1 objectTypeAdapter$1) {
        this(gson, toNumberStrategy);
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
        ToNumberPolicy toNumberPolicy = ToNumberPolicy.DOUBLE;
        if (toNumberStrategy == toNumberPolicy) {
            return DOUBLE_FACTORY;
        }
        return ObjectTypeAdapter.newFactory(toNumberStrategy);
    }

    private static TypeAdapterFactory newFactory(ToNumberStrategy toNumberStrategy) {
        ObjectTypeAdapter$1 objectTypeAdapter$1 = new ObjectTypeAdapter$1(toNumberStrategy);
        return objectTypeAdapter$1;
    }

    private Object readTerminal(JsonReader object, JsonToken object2) {
        Object object3 = ObjectTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken;
        int n3 = object2.ordinal();
        int n4 = object3[n3];
        if (n4 != (n3 = 3)) {
            n3 = 4;
            if (n4 != n3) {
                n3 = 5;
                if (n4 != n3) {
                    n3 = 6;
                    if (n4 == n3) {
                        ((JsonReader)object).nextNull();
                        return null;
                    }
                    object3 = new StringBuilder;
                    ((StringBuilder)object3)("Unexpected token: ");
                    ((StringBuilder)object3).append(object2);
                    object2 = ((StringBuilder)object3).toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
                return ((JsonReader)object).nextBoolean();
            }
            return this.toNumberStrategy.readNumber((JsonReader)object);
        }
        return ((JsonReader)object).nextString();
    }

    private Object tryBeginNesting(JsonReader serializable, JsonToken jsonToken) {
        int[] nArray = ObjectTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken;
        int n3 = jsonToken.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 != n4) {
                return null;
            }
            ((JsonReader)((Object)serializable)).beginObject();
            serializable = new Serializable();
            return serializable;
        }
        ((JsonReader)((Object)serializable)).beginArray();
        serializable = new Serializable();
        return serializable;
    }

    public Object read(JsonReader jsonReader) {
        Object object = jsonReader.peek();
        Object object2 = this.tryBeginNesting(jsonReader, (JsonToken)((Object)object));
        if (object2 == null) {
            return this.readTerminal(jsonReader, (JsonToken)((Object)object));
        }
        object = new ArrayDeque();
        while (true) {
            boolean bl2;
            if (bl2 = jsonReader.hasNext()) {
                boolean bl3;
                Object object3;
                bl2 = object2 instanceof Map;
                if (bl2) {
                    object3 = jsonReader.nextName();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                Object object4 = jsonReader.peek();
                Object object5 = this.tryBeginNesting(jsonReader, (JsonToken)((Object)object4));
                boolean bl4 = object5 != null;
                if (object5 == null) {
                    object5 = this.readTerminal(jsonReader, (JsonToken)((Object)object4));
                }
                if (bl3 = object2 instanceof List) {
                    object3 = object2;
                    object3 = (List)object2;
                    object3.add(object5);
                } else {
                    object4 = object2;
                    object4 = (Map)object2;
                    object4.put(object3, object5);
                }
                if (!bl4) continue;
                ((ArrayDeque)object).addLast(object2);
                object2 = object5;
                continue;
            }
            bl2 = object2 instanceof List;
            if (bl2) {
                jsonReader.endArray();
            } else {
                jsonReader.endObject();
            }
            bl2 = ((ArrayDeque)object).isEmpty();
            if (bl2) {
                return object2;
            }
            object2 = ((ArrayDeque)object).removeLast();
        }
    }

    public void write(JsonWriter jsonWriter, Object object) {
        if (object == null) {
            jsonWriter.nullValue();
            return;
        }
        Object object2 = this.gson;
        Class<?> clazz = object.getClass();
        boolean bl2 = (object2 = ((Gson)object2).getAdapter(clazz)) instanceof ObjectTypeAdapter;
        if (bl2) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        ((TypeAdapter)object2).write(jsonWriter, object);
    }
}

