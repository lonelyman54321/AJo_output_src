/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.reflect;

import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.internal.reflect.ReflectionHelper$1;
import com.google.gson.internal.reflect.ReflectionHelper$RecordHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

class ReflectionHelper$RecordSupportedHelper
extends ReflectionHelper$RecordHelper {
    private final Method getName;
    private final Method getRecordComponents;
    private final Method getType;
    private final Method isRecord;

    private ReflectionHelper$RecordSupportedHelper() {
        super(null);
        Method method;
        Object object = Class.class;
        GenericDeclaration genericDeclaration = ((Class)object).getMethod("isRecord", null);
        this.isRecord = genericDeclaration;
        genericDeclaration = ((Class)object).getMethod("getRecordComponents", null);
        this.getRecordComponents = genericDeclaration;
        genericDeclaration = ((Method)genericDeclaration).getReturnType().getComponentType();
        this.getName = object = ((Class)genericDeclaration).getMethod("getName", null);
        this.getType = method = ((Class)genericDeclaration).getMethod("getType", null);
    }

    public /* synthetic */ ReflectionHelper$RecordSupportedHelper(ReflectionHelper$1 reflectionHelper$1) {
        this();
    }

    public Method getAccessor(Class clazz, Field object) {
        try {
            object = ((Field)object).getName();
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw ReflectionHelper.access$300(reflectiveOperationException);
        }
        return clazz.getMethod((String)object, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Constructor getCanonicalRecordConstructor(Class clazz) {
        try {
            int n3;
            Object[] objectArray = this.getRecordComponents;
            objectArray = objectArray.invoke((Object)clazz, null);
            objectArray = objectArray;
            int n4 = objectArray.length;
            Class[] classArray = new Class[n4];
            int n7 = 0;
            while (n7 < (n3 = objectArray.length)) {
                Object object = this.getType;
                Object object2 = objectArray[n7];
                object = ((Method)object).invoke(object2, null);
                classArray[n7] = object = (Class)object;
                ++n7;
            }
            return clazz.getDeclaredConstructor(classArray);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw ReflectionHelper.access$300(reflectiveOperationException);
        }
    }

    public String[] getRecordComponentNames(Class objectArray) {
        ReflectiveOperationException reflectiveOperationException2;
        block14: {
            String[] stringArray;
            block13: {
                int n3;
                stringArray = this.getRecordComponents;
                objectArray = stringArray.invoke((Object)objectArray, null);
                objectArray = objectArray;
                int n4 = objectArray.length;
                try {
                    stringArray = new String[n4];
                    n3 = 0;
                }
                catch (ReflectiveOperationException reflectiveOperationException2) {}
                while (true) {
                    int n7 = objectArray.length;
                    if (n3 >= n7) break block13;
                    break;
                }
                {
                    Object object = this.getName;
                    Object object2 = objectArray[n3];
                    object = ((Method)object).invoke(object2, null);
                    object = (String)object;
                    stringArray[n3] = object;
                    ++n3;
                    continue;
                }
                break block14;
            }
            return stringArray;
        }
        throw ReflectionHelper.access$300(reflectiveOperationException2);
    }

    public boolean isRecord(Class object) {
        Method method;
        try {
            method = this.isRecord;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw ReflectionHelper.access$300(reflectiveOperationException);
        }
        object = method.invoke(object, null);
        object = (Boolean)object;
        return (Boolean)object;
    }
}

