/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.Types$JavaVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

final class Types$JavaVersion$3
extends Types$JavaVersion {
    public Type newArrayType(Type type2) {
        return Types$JavaVersion.JAVA7.newArrayType(type2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String typeName(Type object) {
        InvocationTargetException invocationTargetException2222;
        Object object2;
        block4: {
            object2 = Type.class;
            String string2 = "getTypeName";
            try {
                object2 = ((Class)object2).getMethod(string2, null);
                object = ((Method)object2).invoke(object, null);
                return (String)object;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException2222) {
                break block4;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object = new AssertionError((Object)"Type.getTypeName should be available in Java 8");
                throw object;
            }
            object2 = new RuntimeException(illegalAccessException);
            throw object2;
        }
        object2 = new RuntimeException(invocationTargetException2222);
        throw object2;
    }

    public Type usedInGenericType(Type type2) {
        return Types$JavaVersion.JAVA7.usedInGenericType(type2);
    }
}

