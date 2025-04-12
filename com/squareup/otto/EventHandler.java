/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EventHandler {
    private final int hashCode;
    private final Method method;
    private final Object target;
    private boolean valid;

    public EventHandler(Object object, Method method) {
        boolean bl2;
        this.valid = bl2 = true;
        if (object != null) {
            if (method != null) {
                int n3;
                this.target = object;
                this.method = method;
                ((AccessibleObject)method).setAccessible(bl2);
                int n4 = (method.hashCode() + 31) * 31;
                this.hashCode = n3 = object.hashCode() + n4;
                return;
            }
            object = new NullPointerException("EventHandler method cannot be null.");
            throw object;
        }
        object = new NullPointerException("EventHandler target cannot be null.");
        throw object;
    }

    public boolean equals(Object object) {
        GenericDeclaration genericDeclaration;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        GenericDeclaration genericDeclaration2 = this.getClass();
        if (genericDeclaration2 != (genericDeclaration = object.getClass())) {
            return false;
        }
        object = (EventHandler)object;
        genericDeclaration2 = this.method;
        genericDeclaration = ((EventHandler)object).method;
        boolean bl3 = ((Method)genericDeclaration2).equals(genericDeclaration);
        if (!bl3 || (genericDeclaration2 = this.target) != (object = ((EventHandler)object).target)) {
            bl2 = false;
        }
        return bl2;
    }

    public void handleEvent(Object object) {
        boolean bl2 = this.valid;
        if (bl2) {
            IllegalAccessException illegalAccessException2;
            Object object2;
            block10: {
                object2 = this.method;
                Object object3 = this.target;
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                try {
                    ((Method)object2).invoke(object3, objectArray);
                    return;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block10;
                }
                object2 = invocationTargetException.getCause();
                bl2 = object2 instanceof Error;
                if (bl2) {
                    throw (Error)invocationTargetException.getCause();
                }
                throw invocationTargetException;
            }
            object2 = new AssertionError((Object)illegalAccessException2);
            throw object2;
        }
        CharSequence charSequence = new StringBuilder();
        String string2 = this.toString();
        charSequence = h30_0.a(charSequence, string2, " has been invalidated and can no longer handle events.");
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public void invalidate() {
        this.valid = false;
    }

    public boolean isValid() {
        return this.valid;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[EventHandler ");
        Method method = this.method;
        stringBuilder.append(method);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

