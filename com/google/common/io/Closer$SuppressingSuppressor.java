/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.Closer$LoggingSuppressor;
import com.google.common.io.Closer$Suppressor;
import java.io.Closeable;
import java.lang.reflect.Method;

final class Closer$SuppressingSuppressor
implements Closer$Suppressor {
    private final Method addSuppressed;

    private Closer$SuppressingSuppressor(Method method) {
        this.addSuppressed = method;
    }

    public static Closer$SuppressingSuppressor tryCreate() {
        Class[] classArray;
        Object object = Throwable.class;
        Object object2 = "addSuppressed";
        int n3 = 1;
        try {
            classArray = new Class[n3];
        }
        catch (Throwable throwable) {
            return null;
        }
        classArray[0] = object;
        object = ((Class)object).getMethod((String)object2, classArray);
        object2 = new Closer$SuppressingSuppressor((Method)object);
        return object2;
    }

    public void suppress(Closeable closeable, Throwable throwable, Throwable throwable2) {
        if (throwable == throwable2) {
            return;
        }
        Object object = this.addSuppressed;
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = throwable2;
        try {
            ((Method)object).invoke((Object)throwable, objectArray);
        }
        catch (Throwable throwable3) {
            object = Closer$LoggingSuppressor.INSTANCE;
            ((Closer$LoggingSuppressor)object).suppress(closeable, throwable, throwable2);
        }
    }
}

