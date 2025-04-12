/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter$1;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

final class TypeAdapters$EnumTypeAdapter
extends TypeAdapter {
    private final Map constantToName;
    private final Map nameToConstant;
    private final Map stringToConstant;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TypeAdapters$EnumTypeAdapter(Class fieldArray) {
        int n3;
        int n4;
        block6: {
            Object object = new HashMap();
            this.nameToConstant = object;
            object = new HashMap();
            this.stringToConstant = object;
            object = new HashMap();
            this.constantToName = object;
            try {
                object = new TypeAdapters$EnumTypeAdapter$1(this, (Class)fieldArray);
                fieldArray = AccessController.doPrivileged(object);
                fieldArray = fieldArray;
                n4 = fieldArray.length;
                n3 = 0;
                break block6;
            }
            catch (IllegalAccessException illegalAccessException) {}
            object = new AssertionError((Object)illegalAccessException);
            throw object;
        }
        while (n3 < n4) {
            Object object = fieldArray[n3];
            Object object2 = null;
            object2 = ((Field)object).get(null);
            object2 = (Enum)object2;
            String string2 = ((Enum)object2).name();
            String string3 = ((Enum)object2).toString();
            Class<SerializedName> clazz = SerializedName.class;
            object = ((Field)object).getAnnotation(clazz);
            if ((object = (SerializedName)object) != null) {
                string2 = object.value();
                for (String string4 : object.alternate()) {
                    Map map2 = this.nameToConstant;
                    map2.put(string4, object2);
                }
            }
            object = this.nameToConstant;
            object.put(string2, object2);
            object = this.stringToConstant;
            object.put(string3, object2);
            object = this.constantToName;
            object.put(object2, string2);
            ++n3;
        }
        return;
    }

    public Enum read(JsonReader object) {
        JsonToken jsonToken;
        Object object2 = ((JsonReader)object).peek();
        if (object2 == (jsonToken = JsonToken.NULL)) {
            ((JsonReader)object).nextNull();
            return null;
        }
        object2 = (Enum)this.nameToConstant.get(object = ((JsonReader)object).nextString());
        if (object2 == null) {
            object2 = object = this.stringToConstant.get(object);
            object2 = (Enum)object;
        }
        return object2;
    }

    public void write(JsonWriter jsonWriter, Enum object) {
        if (object == null) {
            object = null;
        } else {
            Map map2 = this.constantToName;
            object = (String)map2.get(object);
        }
        jsonWriter.value((String)object);
    }
}

