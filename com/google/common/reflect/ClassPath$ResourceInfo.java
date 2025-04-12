/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;
import com.google.common.reflect.ClassPath$ClassInfo;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;

public class ClassPath$ResourceInfo {
    private final File file;
    final ClassLoader loader;
    private final String resourceName;

    public ClassPath$ResourceInfo(File object, String string2, ClassLoader classLoader) {
        object = (File)Preconditions.checkNotNull(object);
        this.file = object;
        this.resourceName = object = (String)Preconditions.checkNotNull(string2);
        this.loader = object = (ClassLoader)Preconditions.checkNotNull(classLoader);
    }

    public static ClassPath$ResourceInfo of(File file, String string2, ClassLoader classLoader) {
        Object object = ".class";
        boolean bl2 = string2.endsWith((String)object);
        if (bl2) {
            object = new ClassPath$ClassInfo(file, string2, classLoader);
            return object;
        }
        object = new ClassPath$ResourceInfo(file, string2, classLoader);
        return object;
    }

    public final ByteSource asByteSource() {
        return Resources.asByteSource(this.url());
    }

    public final CharSource asCharSource(Charset charset) {
        return Resources.asCharSource(this.url(), charset);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof ClassPath$ResourceInfo;
        boolean bl3 = false;
        if (bl2) {
            object = (ClassPath$ResourceInfo)object;
            Object object2 = this.resourceName;
            String string2 = ((ClassPath$ResourceInfo)object).resourceName;
            bl2 = ((String)object2).equals(string2);
            if (bl2 && (object2 = this.loader) == (object = ((ClassPath$ResourceInfo)object).loader)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getResourceName() {
        return this.resourceName;
    }

    public int hashCode() {
        return this.resourceName.hashCode();
    }

    public String toString() {
        return this.resourceName;
    }

    public final URL url() {
        Object object = this.loader;
        String string2 = this.resourceName;
        if ((object = ((ClassLoader)object).getResource(string2)) != null) {
            return object;
        }
        string2 = this.resourceName;
        object = new NoSuchElementException(string2);
        throw object;
    }
}

