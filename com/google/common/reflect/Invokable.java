/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.reflect.Invokable$ConstructorInvokable;
import com.google.common.reflect.Invokable$MethodInvokable;
import com.google.common.reflect.Parameter;
import com.google.common.reflect.TypeToken;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class Invokable
implements AnnotatedElement,
Member {
    private static final boolean ANNOTATED_TYPE_EXISTS = Invokable.initAnnotatedTypeExists();
    private final AccessibleObject accessibleObject;
    private final Member member;

    public Invokable(AccessibleObject object) {
        Preconditions.checkNotNull(object);
        this.accessibleObject = object;
        this.member = object = (Member)object;
    }

    public static Invokable from(Constructor constructor) {
        Invokable$ConstructorInvokable invokable$ConstructorInvokable = new Invokable$ConstructorInvokable(constructor);
        return invokable$ConstructorInvokable;
    }

    public static Invokable from(Method method) {
        Invokable$MethodInvokable invokable$MethodInvokable = new Invokable$MethodInvokable(method);
        return invokable$MethodInvokable;
    }

    private static boolean initAnnotatedTypeExists() {
        String string2 = "java.lang.reflect.AnnotatedType";
        try {
            Class.forName(string2);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Invokable;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            TypeToken typeToken;
            object = (Invokable)object;
            Object object2 = this.getOwnerType();
            bl2 = ((TypeToken)object2).equals(typeToken = ((Invokable)object).getOwnerType());
            if (bl2 && (bl4 = (object2 = this.member).equals(object = ((Invokable)object).member))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public abstract AnnotatedType[] getAnnotatedParameterTypes();

    public abstract AnnotatedType getAnnotatedReturnType();

    public final Annotation getAnnotation(Class clazz) {
        return this.accessibleObject.getAnnotation(clazz);
    }

    public final Annotation[] getAnnotations() {
        return this.accessibleObject.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.accessibleObject.getDeclaredAnnotations();
    }

    public final Class getDeclaringClass() {
        return this.member.getDeclaringClass();
    }

    public final ImmutableList getExceptionTypes() {
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        Type[] typeArray = this.getGenericExceptionTypes();
        int n3 = typeArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            TypeToken typeToken = TypeToken.of(typeArray[i3]);
            immutableList$Builder.add(typeToken);
        }
        return immutableList$Builder.build();
    }

    public abstract Type[] getGenericExceptionTypes();

    public abstract Type[] getGenericParameterTypes();

    public abstract Type getGenericReturnType();

    public final int getModifiers() {
        return this.member.getModifiers();
    }

    public final String getName() {
        return this.member.getName();
    }

    public TypeToken getOwnerType() {
        return TypeToken.of(this.getDeclaringClass());
    }

    public abstract Annotation[][] getParameterAnnotations();

    public final ImmutableList getParameters() {
        int n3;
        Object[] objectArray;
        Type[] typeArray = this.getGenericParameterTypes();
        Annotation[][] annotationArray = this.getParameterAnnotations();
        int n4 = ANNOTATED_TYPE_EXISTS;
        if (n4 != 0) {
            objectArray = this.getAnnotatedParameterTypes();
        } else {
            n4 = typeArray.length;
            objectArray = new Object[n4];
        }
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        for (int i3 = 0; i3 < (n3 = typeArray.length); ++i3) {
            TypeToken typeToken = TypeToken.of(typeArray[i3]);
            Annotation[] annotationArray2 = annotationArray[i3];
            Object object = objectArray[i3];
            Parameter parameter = new Parameter(this, i3, typeToken, annotationArray2, object);
            immutableList$Builder.add(parameter);
        }
        return immutableList$Builder.build();
    }

    public final TypeToken getReturnType() {
        return TypeToken.of(this.getGenericReturnType());
    }

    public abstract TypeVariable[] getTypeParameters();

    public int hashCode() {
        return this.member.hashCode();
    }

    public final Object invoke(Object object, Object ... objectArray) {
        objectArray = (Object[])Preconditions.checkNotNull(objectArray);
        return this.invokeInternal(object, objectArray);
    }

    public abstract Object invokeInternal(Object var1, Object[] var2);

    public final boolean isAbstract() {
        return Modifier.isAbstract(this.getModifiers());
    }

    public final boolean isAccessible() {
        return this.accessibleObject.isAccessible();
    }

    public final boolean isAnnotationPresent(Class clazz) {
        return this.accessibleObject.isAnnotationPresent(clazz);
    }

    public final boolean isFinal() {
        return Modifier.isFinal(this.getModifiers());
    }

    public final boolean isNative() {
        return Modifier.isNative(this.getModifiers());
    }

    public abstract boolean isOverridable();

    public final boolean isPackagePrivate() {
        boolean bl2 = this.isPrivate();
        bl2 = !bl2 && !(bl2 = this.isPublic()) && !(bl2 = this.isProtected());
        return bl2;
    }

    public final boolean isPrivate() {
        return Modifier.isPrivate(this.getModifiers());
    }

    public final boolean isProtected() {
        return Modifier.isProtected(this.getModifiers());
    }

    public final boolean isPublic() {
        return Modifier.isPublic(this.getModifiers());
    }

    public final boolean isStatic() {
        return Modifier.isStatic(this.getModifiers());
    }

    public final boolean isSynchronized() {
        return Modifier.isSynchronized(this.getModifiers());
    }

    public final boolean isSynthetic() {
        return this.member.isSynthetic();
    }

    public final boolean isTransient() {
        return Modifier.isTransient(this.getModifiers());
    }

    public abstract boolean isVarArgs();

    public final boolean isVolatile() {
        return Modifier.isVolatile(this.getModifiers());
    }

    public final Invokable returning(TypeToken object) {
        Serializable serializable = this.getReturnType();
        boolean bl2 = ((TypeToken)object).isSupertypeOf((TypeToken)serializable);
        if (bl2) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("Invokable is known to return ");
        TypeToken typeToken = this.getReturnType();
        stringBuilder.append(typeToken);
        stringBuilder.append(", not ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        serializable = new IllegalArgumentException((String)object);
        throw serializable;
    }

    public final Invokable returning(Class serializable) {
        serializable = TypeToken.of(serializable);
        return this.returning((TypeToken)serializable);
    }

    public final void setAccessible(boolean bl2) {
        this.accessibleObject.setAccessible(bl2);
    }

    public String toString() {
        return this.member.toString();
    }

    public final boolean trySetAccessible() {
        boolean bl2;
        AccessibleObject accessibleObject;
        try {
            accessibleObject = this.accessibleObject;
            bl2 = true;
        }
        catch (RuntimeException runtimeException) {
            return false;
        }
        accessibleObject.setAccessible(bl2);
        return bl2;
    }
}

