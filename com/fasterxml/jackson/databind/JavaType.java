/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.lang.reflect.Type;

public abstract class JavaType
extends vk2_1
implements Serializable,
Type {
    private static final long serialVersionUID = 1L;
    public final Class a;
    public final int b;
    public final Object c;
    public final Object d;

    public JavaType(Class clazz, int n3) {
        int n4;
        this.a = clazz;
        this.b = n4 = clazz.hashCode() + (n3 *= 31);
    }

    public abstract StringBuilder b(StringBuilder var1);

    public int hashCode() {
        return this.b;
    }
}

