/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.FinalizableReferenceQueue;
import com.google.common.base.FinalizableReferenceQueue$FinalizerLoader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

class FinalizableReferenceQueue$DecoupledLoader
implements FinalizableReferenceQueue$FinalizerLoader {
    private static final String LOADING_ERROR = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

    public URL getBaseUrl() {
        Object object = new StringBuilder();
        char c2 = '.';
        char c3 = '/';
        String string2 = "com.google.common.base.internal.Finalizer";
        Object object2 = string2.replace(c2, c3);
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(".class");
        object = ((StringBuilder)object).toString();
        object2 = this.getClass().getClassLoader().getResource((String)object);
        if (object2 != null) {
            Object object3 = ((URL)object2).toString();
            boolean n3 = ((String)object3).endsWith((String)object);
            if (n3) {
                int n4 = ((String)object3).length();
                int n7 = ((String)object).length();
                int n8 = n4 - n7;
                object = ((String)object3).substring(0, n8);
                object3 = new URL((URL)object2, (String)object);
                return object3;
            }
            object2 = "Unsupported path style: ".concat((String)object3);
            object = new IOException((String)object2);
            throw object;
        }
        object2 = new FileNotFoundException((String)object);
        throw object2;
    }

    public Class loadFinalizer() {
        Object object;
        Object object2;
        try {
            object2 = this.getBaseUrl();
        }
        catch (Exception exception) {
            object = FinalizableReferenceQueue.access$000();
            Level level = Level.WARNING;
            ((Logger)object).log(level, LOADING_ERROR, exception);
            return null;
        }
        object2 = this.newLoader((URL)object2);
        object = "com.google.common.base.internal.Finalizer";
        return ((ClassLoader)object2).loadClass((String)object);
    }

    public URLClassLoader newLoader(URL uRL) {
        URL[] uRLArray = new URL[]{uRL};
        URLClassLoader uRLClassLoader = new URLClassLoader(uRLArray, null);
        return uRLClassLoader;
    }
}

