/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

final class ReflectiveTypeAdapterFactory$RecordAdapter
extends ReflectiveTypeAdapterFactory$Adapter {
    static final Map PRIMITIVE_DEFAULTS = ReflectiveTypeAdapterFactory$RecordAdapter.primitiveDefaults();
    private final Map componentIndices;
    private final Constructor constructor;
    private final Object[] constructorArgsDefaults;

    public ReflectiveTypeAdapterFactory$RecordAdapter(Class objectArray, Map object, boolean n3) {
        super((Map)object);
        Object object2;
        Map map2;
        int n4;
        Object[] objectArray2;
        super();
        this.componentIndices = object;
        this.constructor = object = ReflectionHelper.getCanonicalRecordConstructor((Class)objectArray);
        if (n3 != 0) {
            n3 = 0;
            objectArray2 = null;
            ReflectiveTypeAdapterFactory.access$000(null, (AccessibleObject)object);
        } else {
            ReflectionHelper.makeAccessible((AccessibleObject)object);
        }
        objectArray = ReflectionHelper.getRecordComponentNames((Class)objectArray);
        int n7 = 0;
        object = null;
        objectArray2 = null;
        for (n3 = 0; n3 < (n4 = objectArray.length); ++n3) {
            map2 = this.componentIndices;
            object2 = objectArray[n3];
            Integer n8 = n3;
            map2.put(object2, n8);
        }
        objectArray = this.constructor.getParameterTypes();
        n3 = objectArray.length;
        objectArray2 = new Object[n3];
        this.constructorArgsDefaults = objectArray2;
        while (n7 < (n3 = objectArray.length)) {
            objectArray2 = this.constructorArgsDefaults;
            map2 = PRIMITIVE_DEFAULTS;
            object2 = objectArray[n7];
            map2 = map2.get(object2);
            objectArray2[n7] = map2;
            ++n7;
        }
    }

    private static Map primitiveDefaults() {
        HashMap<Class<Byte>, Comparable<Byte>> hashMap = new HashMap<Class<Byte>, Comparable<Byte>>();
        Class<Comparable<Byte>> clazz = Byte.TYPE;
        Number number = (byte)0;
        hashMap.put((Class<Byte>)clazz, (Comparable<Byte>)((Object)number));
        clazz = Short.TYPE;
        number = (short)0;
        hashMap.put((Class<Byte>)clazz, (Comparable<Byte>)((Object)number));
        clazz = Integer.TYPE;
        number = 0;
        hashMap.put((Class<Byte>)clazz, (Comparable<Byte>)((Object)number));
        clazz = Long.TYPE;
        number = 0L;
        hashMap.put((Class<Byte>)clazz, (Comparable<Byte>)((Object)number));
        clazz = Float.TYPE;
        number = Float.valueOf(0.0f);
        hashMap.put((Class<Byte>)clazz, (Comparable<Byte>)((Object)number));
        clazz = Double.TYPE;
        number = 0.0;
        hashMap.put((Class<Byte>)clazz, (Comparable<Byte>)((Object)number));
        clazz = Character.TYPE;
        Comparable<Character> comparable = Character.valueOf('\u0000');
        hashMap.put(clazz, comparable);
        clazz = Boolean.TYPE;
        comparable = Boolean.FALSE;
        hashMap.put(clazz, comparable);
        return hashMap;
    }

    public Object[] createAccumulator() {
        return (Object[])this.constructorArgsDefaults.clone();
    }

    /*
     * WARNING - void declaration
     */
    public Object finalize(Object[] object) {
        IllegalAccessException illegalAccessException2;
        block8: {
            void var4_9;
            String string2;
            Object object2;
            block7: {
                object2 = "' with args ";
                string2 = "Failed to invoke constructor '";
                Constructor constructor = this.constructor;
                try {
                    return constructor.newInstance(object);
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    break block7;
                }
                catch (InstantiationException instantiationException) {
                    break block7;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block8;
                }
                StringBuilder stringBuilder = new StringBuilder(string2);
                string2 = ReflectionHelper.constructorToString(this.constructor);
                stringBuilder.append(string2);
                stringBuilder.append((String)object2);
                object = Arrays.toString(object);
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
                object2 = invocationTargetException.getCause();
                RuntimeException runtimeException = new RuntimeException((String)object, (Throwable)object2);
                throw runtimeException;
            }
            StringBuilder stringBuilder = new StringBuilder(string2);
            string2 = ReflectionHelper.constructorToString(this.constructor);
            stringBuilder.append(string2);
            stringBuilder.append((String)object2);
            object = Arrays.toString(object);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            RuntimeException runtimeException = new RuntimeException((String)object, (Throwable)var4_9);
            throw runtimeException;
        }
        throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException2);
    }

    public void readField(Object[] objectArray, JsonReader object, ReflectiveTypeAdapterFactory$BoundField object2) {
        Object object3 = this.componentIndices;
        String string2 = ((ReflectiveTypeAdapterFactory$BoundField)object2).fieldName;
        if ((object3 = (Integer)object3.get(string2)) != null) {
            int n3 = (Integer)object3;
            ((ReflectiveTypeAdapterFactory$BoundField)object2).readIntoArray((JsonReader)object, n3, objectArray);
            return;
        }
        object = new StringBuilder("Could not find the index in the constructor '");
        object3 = ReflectionHelper.constructorToString(this.constructor);
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("' for field with name '");
        object2 = ((ReflectiveTypeAdapterFactory$BoundField)object2).fieldName;
        object = h30_0.a((StringBuilder)object, (String)object2, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        objectArray = new IllegalStateException((String)object);
        throw objectArray;
    }
}

