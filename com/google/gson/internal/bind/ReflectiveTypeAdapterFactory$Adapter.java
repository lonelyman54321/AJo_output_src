/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import java.util.Map;

public abstract class ReflectiveTypeAdapterFactory$Adapter
extends TypeAdapter {
    final Map boundFields;

    public ReflectiveTypeAdapterFactory$Adapter(Map map2) {
        this.boundFields = map2;
    }

    public abstract Object createAccumulator();

    public abstract Object finalize(Object var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object read(JsonReader jsonReader) {
        boolean bl2;
        Object object;
        Object object2;
        block6: {
            object2 = jsonReader.peek();
            if (object2 == (object = JsonToken.NULL)) {
                jsonReader.nextNull();
                return null;
            }
            object2 = this.createAccumulator();
            try {
                jsonReader.beginObject();
                break block6;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException);
            }
            catch (IllegalStateException illegalStateException) {}
            object2 = new JsonSyntaxException(illegalStateException);
            throw object2;
        }
        while (bl2 = jsonReader.hasNext()) {
            boolean bl3;
            object = jsonReader.nextName();
            Map map2 = this.boundFields;
            object = map2.get(object);
            if ((object = (ReflectiveTypeAdapterFactory$BoundField)object) != null && (bl3 = ((ReflectiveTypeAdapterFactory$BoundField)object).deserialized)) {
                this.readField(object2, jsonReader, (ReflectiveTypeAdapterFactory$BoundField)object);
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return this.finalize(object2);
    }

    public abstract void readField(Object var1, JsonReader var2, ReflectiveTypeAdapterFactory$BoundField var3);

    public void write(JsonWriter jsonWriter, Object object) {
        IllegalAccessException illegalAccessException2;
        block11: {
            block10: {
                if (object == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                Iterator iterator = this.boundFields;
                iterator = iterator.values();
                try {
                    iterator = iterator.iterator();
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block11;
                }
                while (true) {
                    boolean bl2 = iterator.hasNext();
                    if (!bl2) break block10;
                    break;
                }
                {
                    Object object2 = iterator.next();
                    object2 = (ReflectiveTypeAdapterFactory$BoundField)object2;
                    ((ReflectiveTypeAdapterFactory$BoundField)object2).write(jsonWriter, object);
                    continue;
                }
            }
            jsonWriter.endObject();
            return;
        }
        throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException2);
    }
}

