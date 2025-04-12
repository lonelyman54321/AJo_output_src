/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EventProducer {
    private final int hashCode;
    private final Method method;
    final Object target;
    private boolean valid;

    public EventProducer(Object object, Method method) {
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
            object = new NullPointerException("EventProducer method cannot be null.");
            throw object;
        }
        object = new NullPointerException("EventProducer target cannot be null.");
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
        object = (EventProducer)object;
        genericDeclaration2 = this.method;
        genericDeclaration = ((EventProducer)object).method;
        boolean bl3 = ((Method)genericDeclaration2).equals(genericDeclaration);
        if (!bl3 || (genericDeclaration2 = this.target) != (object = ((EventProducer)object).target)) {
            bl2 = false;
        }
        return bl2;
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

    public Object produceEvent() {
        boolean bl2 = this.valid;
        if (bl2) {
            IllegalAccessException illegalAccessException2;
            Object object;
            block8: {
                Method method = this.method;
                object = this.target;
                Object var4_8 = null;
                try {
                    return method.invoke(object, null);
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block8;
                }
                object = invocationTargetException.getCause();
                boolean bl3 = object instanceof Error;
                if (bl3) {
                    throw (Error)invocationTargetException.getCause();
                }
                throw invocationTargetException;
            }
            object = new AssertionError((Object)illegalAccessException2);
            throw object;
        }
        CharSequence charSequence = new StringBuilder();
        String string2 = this.toString();
        charSequence = h30_0.a(charSequence, string2, " has been invalidated and can no longer produce events.");
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[EventProducer ");
        Method method = this.method;
        stringBuilder.append(method);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

