/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.reflect.ReflectionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ConstructorConstructor$9
implements ObjectConstructor {
    final /* synthetic */ Constructor val$constructor;

    public ConstructorConstructor$9(Constructor constructor) {
        this.val$constructor = constructor;
    }

    public Object construct() {
        InstantiationException instantiationException2;
        RuntimeException runtimeException;
        Object object;
        String string2;
        block7: {
            InvocationTargetException invocationTargetException2;
            block6: {
                string2 = "' with no args";
                object = "Failed to invoke constructor '";
                Constructor constructor = this.val$constructor;
                runtimeException = null;
                try {
                    return constructor.newInstance(null);
                }
                catch (IllegalAccessException illegalAccessException) {
                }
                catch (InvocationTargetException invocationTargetException2) {
                    break block6;
                }
                catch (InstantiationException instantiationException2) {
                    break block7;
                }
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException);
            }
            StringBuilder stringBuilder = new StringBuilder((String)object);
            object = ReflectionHelper.constructorToString(this.val$constructor);
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            object = invocationTargetException2.getCause();
            runtimeException = new RuntimeException(string2, (Throwable)object);
            throw runtimeException;
        }
        StringBuilder stringBuilder = new StringBuilder((String)object);
        object = ReflectionHelper.constructorToString(this.val$constructor);
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        runtimeException = new RuntimeException(string2, instantiationException2);
        throw runtimeException;
    }
}

