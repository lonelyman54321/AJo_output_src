/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.util.Objects;

public final class Parameter
implements AnnotatedElement {
    private final Object annotatedType;
    private final ImmutableList annotations;
    private final Invokable declaration;
    private final int position;
    private final TypeToken type;

    public Parameter(Invokable object, int n3, TypeToken typeToken, Annotation[] annotationArray, Object object2) {
        this.declaration = object;
        this.position = n3;
        this.type = typeToken;
        this.annotations = object = ImmutableList.copyOf(annotationArray);
        this.annotatedType = object2;
    }

    public boolean equals(Object object) {
        int n3 = object instanceof Parameter;
        boolean bl2 = false;
        if (n3 != 0) {
            Invokable invokable;
            boolean bl3;
            object = (Parameter)object;
            n3 = this.position;
            int n4 = ((Parameter)object).position;
            if (n3 == n4 && (bl3 = (invokable = this.declaration).equals(object = ((Parameter)object).declaration))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public AnnotatedType getAnnotatedType() {
        AnnotatedType annotatedType = (AnnotatedType)this.annotatedType;
        Objects.requireNonNull(annotatedType);
        return annotatedType;
    }

    public Annotation getAnnotation(Class clazz) {
        boolean bl2;
        Preconditions.checkNotNull(clazz);
        UnmodifiableIterator unmodifiableIterator = this.annotations.iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            Annotation annotation = (Annotation)unmodifiableIterator.next();
            boolean bl3 = clazz.isInstance(annotation);
            if (!bl3) continue;
            return (Annotation)clazz.cast(annotation);
        }
        return null;
    }

    public Annotation[] getAnnotations() {
        return this.getDeclaredAnnotations();
    }

    public Annotation[] getAnnotationsByType(Class clazz) {
        return this.getDeclaredAnnotationsByType(clazz);
    }

    public Annotation getDeclaredAnnotation(Class clazz) {
        Preconditions.checkNotNull(clazz);
        return (Annotation)FluentIterable.from(this.annotations).filter(clazz).first().orNull();
    }

    public Annotation[] getDeclaredAnnotations() {
        ImmutableList immutableList = this.annotations;
        Object[] objectArray = new Annotation[]{};
        return (Annotation[])immutableList.toArray(objectArray);
    }

    public Annotation[] getDeclaredAnnotationsByType(Class clazz) {
        return (Annotation[])FluentIterable.from(this.annotations).filter(clazz).toArray(clazz);
    }

    public Invokable getDeclaringInvokable() {
        return this.declaration;
    }

    public TypeToken getType() {
        return this.type;
    }

    public int hashCode() {
        return this.position;
    }

    public boolean isAnnotationPresent(Class object) {
        boolean bl2;
        if ((object = this.getAnnotation((Class)object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        TypeToken typeToken = this.type;
        stringBuilder.append(typeToken);
        stringBuilder.append(" arg");
        int n3 = this.position;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

