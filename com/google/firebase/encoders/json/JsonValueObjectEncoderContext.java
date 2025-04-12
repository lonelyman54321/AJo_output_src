/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonWriter
 */
package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.NumberedEnum;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

final class JsonValueObjectEncoderContext
implements ObjectEncoderContext,
ValueEncoderContext {
    private boolean active = true;
    private JsonValueObjectEncoderContext childContext = null;
    private final ObjectEncoder fallbackEncoder;
    private final boolean ignoreNullValues;
    private final JsonWriter jsonWriter;
    private final Map objectEncoders;
    private final Map valueEncoders;

    private JsonValueObjectEncoderContext(JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
        boolean bl2;
        Object object;
        this.jsonWriter = object = jsonValueObjectEncoderContext.jsonWriter;
        object = jsonValueObjectEncoderContext.objectEncoders;
        this.objectEncoders = object;
        object = jsonValueObjectEncoderContext.valueEncoders;
        this.valueEncoders = object;
        object = jsonValueObjectEncoderContext.fallbackEncoder;
        this.fallbackEncoder = object;
        this.ignoreNullValues = bl2 = jsonValueObjectEncoderContext.ignoreNullValues;
    }

    public JsonValueObjectEncoderContext(Writer writer, Map map2, Map map3, ObjectEncoder objectEncoder, boolean bl2) {
        JsonWriter jsonWriter;
        this.jsonWriter = jsonWriter = new JsonWriter(writer);
        this.objectEncoders = map2;
        this.valueEncoders = map3;
        this.fallbackEncoder = objectEncoder;
        this.ignoreNullValues = bl2;
    }

    private boolean cannotBeInline(Object object) {
        boolean bl2;
        Class<?> clazz;
        boolean bl3;
        if (!(object == null || (bl3 = (clazz = object.getClass()).isArray()) || (bl3 = object instanceof Collection) || (bl3 = object instanceof Date) || (bl3 = object instanceof Enum) || (bl2 = object instanceof Number))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private JsonValueObjectEncoderContext internalAdd(String string2, Object object) {
        this.maybeUnNest();
        JsonWriter jsonWriter = this.jsonWriter;
        jsonWriter.name(string2);
        if (object == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        return this.add(object, false);
    }

    private JsonValueObjectEncoderContext internalAddIgnoreNullValues(String string2, Object object) {
        if (object == null) {
            return this;
        }
        this.maybeUnNest();
        this.jsonWriter.name(string2);
        return this.add(object, false);
    }

    private void maybeUnNest() {
        boolean bl2 = this.active;
        if (bl2) {
            JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.childContext;
            if (jsonValueObjectEncoderContext != null) {
                jsonValueObjectEncoderContext.maybeUnNest();
                this.childContext.active = false;
                bl2 = false;
                this.childContext = null;
                jsonValueObjectEncoderContext = this.jsonWriter;
                jsonValueObjectEncoderContext.endObject();
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        throw illegalStateException;
    }

    public ObjectEncoderContext add(FieldDescriptor object, double d2) {
        object = ((FieldDescriptor)object).getName();
        return this.add((String)object, d2);
    }

    public ObjectEncoderContext add(FieldDescriptor object, float f5) {
        object = ((FieldDescriptor)object).getName();
        double d2 = f5;
        return this.add((String)object, d2);
    }

    public ObjectEncoderContext add(FieldDescriptor object, int n3) {
        object = ((FieldDescriptor)object).getName();
        return this.add((String)object, n3);
    }

    public ObjectEncoderContext add(FieldDescriptor object, long l2) {
        object = ((FieldDescriptor)object).getName();
        return this.add((String)object, l2);
    }

    public ObjectEncoderContext add(FieldDescriptor object, Object object2) {
        object = ((FieldDescriptor)object).getName();
        return this.add((String)object, object2);
    }

    public ObjectEncoderContext add(FieldDescriptor object, boolean bl2) {
        object = ((FieldDescriptor)object).getName();
        return this.add((String)object, bl2);
    }

    public JsonValueObjectEncoderContext add(double d2) {
        this.maybeUnNest();
        this.jsonWriter.value(d2);
        return this;
    }

    public JsonValueObjectEncoderContext add(float f5) {
        this.maybeUnNest();
        JsonWriter jsonWriter = this.jsonWriter;
        double d2 = f5;
        jsonWriter.value(d2);
        return this;
    }

    public JsonValueObjectEncoderContext add(int n3) {
        this.maybeUnNest();
        JsonWriter jsonWriter = this.jsonWriter;
        long l2 = n3;
        jsonWriter.value(l2);
        return this;
    }

    public JsonValueObjectEncoderContext add(long l2) {
        this.maybeUnNest();
        this.jsonWriter.value(l2);
        return this;
    }

    public JsonValueObjectEncoderContext add(Object object, boolean n3) {
        int n4;
        int n7;
        Object object2 = null;
        int n8 = 1;
        if (n3 != 0 && (n7 = this.cannotBeInline(object)) != false) {
            if (object == null) {
                boolean bl2 = false;
                object = null;
            } else {
                object = object.getClass();
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" cannot be encoded inline");
            object = ((StringBuilder)object2).toString();
            EncodingException encodingException = new EncodingException((String)object);
            throw encodingException;
        }
        if (object == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        n7 = (int)(object instanceof Number ? 1 : 0);
        if (n7 != false) {
            JsonWriter jsonWriter = this.jsonWriter;
            object = (Number)object;
            jsonWriter.value(object);
            return this;
        }
        Class<Object> clazz = object.getClass();
        n7 = (int)(clazz.isArray() ? 1 : 0);
        if (n7 != false) {
            n3 = object instanceof byte[];
            if (n3 != 0) {
                object = (byte[])object;
                return this.add((byte[])object);
            }
            JsonWriter jsonWriter = this.jsonWriter;
            jsonWriter.beginArray();
            n3 = object instanceof int[];
            if (n3 != 0) {
                object = (int[])object;
                n3 = ((Object)object).length;
                for (n4 = 0; n4 < n3; n4 += n8) {
                    n7 = object[n4];
                    JsonWriter jsonWriter2 = this.jsonWriter;
                    long l2 = n7;
                    jsonWriter2.value(l2);
                }
            } else {
                n3 = object instanceof long[];
                if (n3 != 0) {
                    object = (long[])object;
                    n3 = ((Object)object).length;
                    while (n4 < n3) {
                        Object object3 = object[n4];
                        this.add((long)object3);
                        n4 += n8;
                    }
                } else {
                    n3 = object instanceof double[];
                    if (n3 != 0) {
                        object = (double[])object;
                        n3 = ((Object)object).length;
                        while (n4 < n3) {
                            Object object4 = object[n4];
                            JsonWriter jsonWriter3 = this.jsonWriter;
                            jsonWriter3.value((double)object4);
                            n4 += n8;
                        }
                    } else {
                        n3 = object instanceof boolean[];
                        if (n3 != 0) {
                            object = (boolean[])object;
                            n3 = ((Object)object).length;
                            while (n4 < n3) {
                                n7 = object[n4];
                                JsonWriter jsonWriter4 = this.jsonWriter;
                                jsonWriter4.value(n7 != 0);
                                n4 += n8;
                            }
                        } else {
                            n3 = object instanceof Number[];
                            if (n3 != 0) {
                                object = (Number[])object;
                                n3 = ((Object[])object).length;
                                clazz = null;
                                for (n7 = 0; n7 < n3; n7 += n8) {
                                    Object object5 = object[n7];
                                    this.add(object5, false);
                                }
                            } else {
                                object = object;
                                n3 = ((Object[])object).length;
                                clazz = null;
                                for (n7 = 0; n7 < n3; n7 += n8) {
                                    Object object6 = object[n7];
                                    this.add(object6, false);
                                }
                            }
                        }
                    }
                }
            }
            this.jsonWriter.endArray();
            return this;
        }
        n7 = (int)(object instanceof Collection ? 1 : 0);
        if (n7 != false) {
            object = (Collection)object;
            Object object7 = this.jsonWriter;
            object7.beginArray();
            object = object.iterator();
            while ((n3 = object.hasNext()) != 0) {
                object7 = object.next();
                this.add(object7, false);
            }
            this.jsonWriter.endArray();
            return this;
        }
        n7 = (int)(object instanceof Map ? 1 : 0);
        if (n7 != false) {
            object = (Map)object;
            Object object8 = this.jsonWriter;
            object8.beginObject();
            object = object.entrySet().iterator();
            while ((n3 = object.hasNext()) != 0) {
                object8 = (Map.Entry)object.next();
                clazz = object8.getKey();
                Class<?> clazz2 = clazz;
                try {
                    clazz2 = (String)((Object)clazz);
                }
                catch (ClassCastException classCastException) {
                    clazz2 = clazz.getClass();
                    Object[] objectArray = new Object[2];
                    objectArray[0] = clazz;
                    objectArray[n8] = clazz2;
                    object2 = String.format("Only String keys are currently supported in maps, got %s of type %s instead.", objectArray);
                    object8 = new EncodingException((String)object2, classCastException);
                    throw object8;
                }
                object8 = object8.getValue();
                this.add((String)((Object)clazz2), object8);
            }
            this.jsonWriter.endObject();
            return this;
        }
        object2 = this.objectEncoders;
        Class<?> clazz3 = object.getClass();
        if ((object2 = (ObjectEncoder)object2.get(clazz3)) != null) {
            return this.doEncode((ObjectEncoder)object2, object, n3 != 0);
        }
        object2 = this.valueEncoders;
        clazz3 = object.getClass();
        if ((object2 = (ValueEncoder)object2.get(clazz3)) != null) {
            object2.encode(object, this);
            return this;
        }
        n4 = object instanceof Enum;
        if (n4 != 0) {
            n3 = object instanceof NumberedEnum;
            if (n3 != 0) {
                object = (NumberedEnum)object;
                int n10 = object.getNumber();
                this.add(n10);
            } else {
                object = ((Enum)object).name();
                this.add((String)object);
            }
            return this;
        }
        object2 = this.fallbackEncoder;
        return this.doEncode((ObjectEncoder)object2, object, n3 != 0);
    }

    public JsonValueObjectEncoderContext add(String string2) {
        this.maybeUnNest();
        this.jsonWriter.value(string2);
        return this;
    }

    public JsonValueObjectEncoderContext add(String string2, double d2) {
        this.maybeUnNest();
        this.jsonWriter.name(string2);
        return this.add(d2);
    }

    public JsonValueObjectEncoderContext add(String string2, int n3) {
        this.maybeUnNest();
        this.jsonWriter.name(string2);
        return this.add(n3);
    }

    public JsonValueObjectEncoderContext add(String string2, long l2) {
        this.maybeUnNest();
        this.jsonWriter.name(string2);
        return this.add(l2);
    }

    public JsonValueObjectEncoderContext add(String string2, Object object) {
        boolean bl2 = this.ignoreNullValues;
        if (bl2) {
            return this.internalAddIgnoreNullValues(string2, object);
        }
        return this.internalAdd(string2, object);
    }

    public JsonValueObjectEncoderContext add(String string2, boolean bl2) {
        this.maybeUnNest();
        this.jsonWriter.name(string2);
        return this.add(bl2);
    }

    public JsonValueObjectEncoderContext add(boolean bl2) {
        this.maybeUnNest();
        this.jsonWriter.value(bl2);
        return this;
    }

    public JsonValueObjectEncoderContext add(byte[] object) {
        this.maybeUnNest();
        if (object == null) {
            object = this.jsonWriter;
            object.nullValue();
        } else {
            JsonWriter jsonWriter = this.jsonWriter;
            int n3 = 2;
            object = Base64.encodeToString((byte[])object, (int)n3);
            jsonWriter.value((String)object);
        }
        return this;
    }

    public void close() {
        this.maybeUnNest();
        this.jsonWriter.flush();
    }

    public JsonValueObjectEncoderContext doEncode(ObjectEncoder objectEncoder, Object object, boolean bl2) {
        if (!bl2) {
            JsonWriter jsonWriter = this.jsonWriter;
            jsonWriter.beginObject();
        }
        objectEncoder.encode(object, this);
        if (!bl2) {
            objectEncoder = this.jsonWriter;
            objectEncoder.endObject();
        }
        return this;
    }

    public ObjectEncoderContext inline(Object object) {
        return this.add(object, true);
    }

    public ObjectEncoderContext nested(FieldDescriptor object) {
        object = ((FieldDescriptor)object).getName();
        return this.nested((String)object);
    }

    public ObjectEncoderContext nested(String string2) {
        JsonValueObjectEncoderContext jsonValueObjectEncoderContext;
        this.maybeUnNest();
        this.childContext = jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(this);
        this.jsonWriter.name(string2);
        this.jsonWriter.beginObject();
        return this.childContext;
    }
}

