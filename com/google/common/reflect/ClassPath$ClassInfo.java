/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.CharMatcher;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath$ResourceInfo;
import com.google.common.reflect.Reflection;
import java.io.File;

public final class ClassPath$ClassInfo
extends ClassPath$ResourceInfo {
    private final String className;

    public ClassPath$ClassInfo(File object, String string2, ClassLoader classLoader) {
        super((File)object, string2, classLoader);
        this.className = object = ClassPath.getClassName(string2);
    }

    public String getName() {
        return this.className;
    }

    public String getPackageName() {
        return Reflection.getPackageName(this.className);
    }

    public String getSimpleName() {
        int n3;
        String string2 = this.className;
        int n4 = string2.lastIndexOf(36);
        if (n4 != (n3 = -1)) {
            String string3 = this.className;
            string2 = string3.substring(++n4);
            return CharMatcher.inRange('0', '9').trimLeadingFrom(string2);
        }
        string2 = this.getPackageName();
        n3 = (int)(string2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return this.className;
        }
        String string4 = this.className;
        n4 = string2.length() + 1;
        return string4.substring(n4);
    }

    public boolean isTopLevel() {
        int n3;
        String string2 = this.className;
        int n4 = string2.indexOf(36);
        if (n4 == (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        return n4 != 0;
    }

    public Class load() {
        Object object;
        ClassLoader classLoader;
        try {
            classLoader = this.loader;
        }
        catch (ClassNotFoundException classNotFoundException) {
            object = new IllegalStateException(classNotFoundException);
            throw object;
        }
        object = this.className;
        return classLoader.loadClass((String)object);
    }

    public String toString() {
        return this.className;
    }
}

