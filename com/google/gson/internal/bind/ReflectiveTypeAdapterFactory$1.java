/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

class ReflectiveTypeAdapterFactory$1
extends ReflectiveTypeAdapterFactory$BoundField {
    final /* synthetic */ ReflectiveTypeAdapterFactory this$0;
    final /* synthetic */ Method val$accessor;
    final /* synthetic */ boolean val$blockInaccessible;
    final /* synthetic */ Gson val$context;
    final /* synthetic */ TypeToken val$fieldType;
    final /* synthetic */ boolean val$isPrimitive;
    final /* synthetic */ boolean val$isStaticFinalField;
    final /* synthetic */ boolean val$jsonAdapterPresent;
    final /* synthetic */ TypeAdapter val$typeAdapter;

    public ReflectiveTypeAdapterFactory$1(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String string2, Field field, boolean bl2, boolean bl3, boolean bl4, Method method, boolean bl5, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean bl6, boolean bl7) {
        this.this$0 = reflectiveTypeAdapterFactory;
        this.val$blockInaccessible = bl4;
        this.val$accessor = method;
        this.val$jsonAdapterPresent = bl5;
        this.val$typeAdapter = typeAdapter;
        this.val$context = gson;
        this.val$fieldType = typeToken;
        this.val$isPrimitive = bl6;
        this.val$isStaticFinalField = bl7;
        super(string2, field, bl2, bl3);
    }

    public void readIntoArray(JsonReader object, int n3, Object[] object2) {
        boolean bl2;
        Object object3 = this.val$typeAdapter.read((JsonReader)object);
        if (object3 == null && (bl2 = this.val$isPrimitive)) {
            object2 = new StringBuilder("null is not allowed as value for record component '");
            object3 = this.fieldName;
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append("' of primitive type; at path ");
            object = ((JsonReader)object).getPath();
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            JsonParseException jsonParseException = new JsonParseException((String)object);
            throw jsonParseException;
        }
        object2[n3] = object3;
    }

    public void readIntoField(JsonReader object, Object object2) {
        block5: {
            block2: {
                Object object3;
                block4: {
                    boolean bl2;
                    block3: {
                        object3 = this.val$typeAdapter;
                        if ((object = ((TypeAdapter)object3).read((JsonReader)object)) == null && (bl2 = this.val$isPrimitive)) break block2;
                        bl2 = this.val$blockInaccessible;
                        if (!bl2) break block3;
                        object3 = this.field;
                        ReflectiveTypeAdapterFactory.access$000(object2, (AccessibleObject)object3);
                        break block4;
                    }
                    bl2 = this.val$isStaticFinalField;
                    if (bl2) break block5;
                }
                object3 = this.field;
                ((Field)object3).set(object2, object);
            }
            return;
        }
        object = ReflectionHelper.getAccessibleObjectDescription(this.field, false);
        object = kp1_0.c("Cannot set value of 'static final' ", (String)object);
        object2 = new JsonIOException((String)object);
        throw object2;
    }

    public void write(JsonWriter jsonWriter, Object object) {
        Gson gson;
        Object object2;
        boolean bl2 = this.serialized;
        if (!bl2) {
            return;
        }
        bl2 = this.val$blockInaccessible;
        if (bl2) {
            object2 = this.val$accessor;
            if (object2 == null) {
                object2 = this.field;
                ReflectiveTypeAdapterFactory.access$000(object, (AccessibleObject)object2);
            } else {
                ReflectiveTypeAdapterFactory.access$000(object, (AccessibleObject)object2);
            }
        }
        if ((object2 = this.val$accessor) != null) {
            gson = null;
            try {
                object2 = ((Method)object2).invoke(object, null);
            }
            catch (InvocationTargetException invocationTargetException) {
                object = ReflectionHelper.getAccessibleObjectDescription(this.val$accessor, false);
                object = cP.a("Accessor ", (String)object, " threw exception");
                Throwable throwable = invocationTargetException.getCause();
                object2 = new JsonIOException((String)object, throwable);
                throw object2;
            }
        } else {
            object2 = this.field.get(object);
        }
        if (object2 == object) {
            return;
        }
        object = this.name;
        jsonWriter.name((String)object);
        boolean bl3 = this.val$jsonAdapterPresent;
        if (bl3) {
            object = this.val$typeAdapter;
        } else {
            gson = this.val$context;
            TypeAdapter typeAdapter = this.val$typeAdapter;
            Type type2 = this.val$fieldType.getType();
            object = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type2);
        }
        ((TypeAdapter)object).write(jsonWriter, object2);
    }
}

