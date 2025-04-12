/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.reflect.Types$TypeVariableImpl;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

final class Types$TypeVariableInvocationHandler
implements InvocationHandler {
    private static final ImmutableMap typeVariableMethods;
    private final Types$TypeVariableImpl typeVariableImpl;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        Class<Types$TypeVariableImpl> clazz = Types$TypeVariableImpl.class;
        Method[] methodArray = clazz.getMethods();
        int n3 = methodArray.length;
        int n4 = 0;
        while (true) {
            if (n4 >= n3) {
                typeVariableMethods = immutableMap$Builder.buildKeepingLast();
                return;
            }
            Method method = methodArray[n4];
            Class<?> clazz2 = method.getDeclaringClass();
            boolean bl2 = clazz2.equals(clazz);
            if (bl2) {
                bl2 = true;
                try {
                    ((AccessibleObject)method).setAccessible(bl2);
                }
                catch (AccessControlException accessControlException) {}
                clazz2 = method.getName();
                immutableMap$Builder.put(clazz2, method);
            }
            ++n4;
        }
    }

    public Types$TypeVariableInvocationHandler(Types$TypeVariableImpl types$TypeVariableImpl) {
        this.typeVariableImpl = types$TypeVariableImpl;
    }

    public static /* synthetic */ Types$TypeVariableImpl access$500(Types$TypeVariableInvocationHandler types$TypeVariableInvocationHandler) {
        return types$TypeVariableInvocationHandler.typeVariableImpl;
    }

    public Object invoke(Object object, Method object2, Object[] objectArray) {
        object = ((Method)object2).getName();
        if ((object2 = (Method)typeVariableMethods.get(object)) != null) {
            try {
                object = this.typeVariableImpl;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getCause();
            }
            return ((Method)object2).invoke(object, objectArray);
        }
        object2 = new UnsupportedOperationException((String)object);
        throw object2;
    }
}

