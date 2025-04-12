/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;
import java.lang.reflect.TypeVariable;

public class SimpleType
extends TypeBase {
    private static final long serialVersionUID = 1L;

    public SimpleType() {
        throw null;
    }

    public SimpleType(Class clazz) {
        Ys3 ys3 = Ys3.d;
        Ys3 ys32 = ys3 == null ? Ys3.d : ys3;
        int n3 = ys32.c;
        super(clazz, ys3, n3);
    }

    public StringBuilder b(StringBuilder stringBuilder) {
        JavaType[] javaTypeArray = this.a;
        TypeBase.c((Class)javaTypeArray, stringBuilder, false);
        javaTypeArray = this.e.b;
        int n3 = javaTypeArray.length;
        if (n3 > 0) {
            char c2 = '<';
            stringBuilder.append(c2);
            for (int i3 = 0; i3 < n3; ++i3) {
                JavaType javaType = this.e(i3);
                stringBuilder = javaType.b(stringBuilder);
            }
            n3 = 62;
            stringBuilder.append((char)n3);
        }
        stringBuilder.append(';');
        return stringBuilder;
    }

    public String d() {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        TypeVariable<Class<T>>[] typeVariableArray = this.a;
        JavaType[] javaTypeArray = typeVariableArray.getName();
        stringBuilder.append((String)javaTypeArray);
        javaTypeArray = this.e.b;
        int n4 = javaTypeArray.length;
        if (n4 > 0 && (n3 = (typeVariableArray = typeVariableArray.getTypeParameters()).length) == n4) {
            stringBuilder.append('<');
            typeVariableArray = null;
            for (n3 = 0; n3 < n4; ++n3) {
                Object object = this.e(n3);
                if (n3 > 0) {
                    char c2 = ',';
                    stringBuilder.append(c2);
                }
                object = ((vk2_1)object).a();
                stringBuilder.append((String)object);
            }
            n3 = 62;
            stringBuilder.append((char)n3);
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        Class clazz;
        if (object == this) {
            return true;
        }
        Ys3 ys3 = null;
        if (object == null) {
            return false;
        }
        Class clazz2 = object.getClass();
        if (clazz2 != (clazz = this.getClass())) {
            return false;
        }
        object = (SimpleType)object;
        clazz2 = ((JavaType)object).a;
        clazz = this.a;
        if (clazz2 != clazz) {
            return false;
        }
        ys3 = this.e;
        object = ((TypeBase)object).e;
        return ys3.equals(object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("[simple type, class ");
        String string2 = this.d();
        stringBuilder.append(string2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

