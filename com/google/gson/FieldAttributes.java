/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public final class FieldAttributes {
    private final Field field;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.field = field;
    }

    public Annotation getAnnotation(Class clazz) {
        return this.field.getAnnotation(clazz);
    }

    public Collection getAnnotations() {
        return Arrays.asList(this.field.getAnnotations());
    }

    public Class getDeclaredClass() {
        return this.field.getType();
    }

    public Type getDeclaredType() {
        return this.field.getGenericType();
    }

    public Class getDeclaringClass() {
        return this.field.getDeclaringClass();
    }

    public String getName() {
        return this.field.getName();
    }

    public boolean hasModifier(int n3) {
        Field field = this.field;
        int n4 = field.getModifiers();
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public String toString() {
        return this.field.toString();
    }
}

