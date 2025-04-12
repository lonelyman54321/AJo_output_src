/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public abstract class TypeBase
extends JavaType {
    public static final Ys3 f = Ys3.d;
    private static final long serialVersionUID = 1L;
    public final Ys3 e;

    public TypeBase(Class clazz, Ys3 ys3, int n3) {
        super(clazz, n3);
        if (ys3 == null) {
            ys3 = f;
        }
        this.e = ys3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void c(Class object, StringBuilder serializable, boolean bl2) {
        int n3 = ((Class)object).isPrimitive();
        if (n3 != 0) {
            Class<Boolean> clazz = Boolean.TYPE;
            if (object == clazz) {
                char c2 = 'Z';
                ((StringBuilder)serializable).append(c2);
                return;
            }
            Class<Byte> clazz2 = Byte.TYPE;
            if (object == clazz2) {
                char c3 = 'B';
                ((StringBuilder)serializable).append(c3);
                return;
            }
            Class<Short> clazz3 = Short.TYPE;
            if (object == clazz3) {
                char c5 = 'S';
                ((StringBuilder)serializable).append(c5);
                return;
            }
            Class<Character> clazz4 = Character.TYPE;
            if (object == clazz4) {
                char c6 = 'C';
                ((StringBuilder)serializable).append(c6);
                return;
            }
            Class<Integer> clazz5 = Integer.TYPE;
            if (object == clazz5) {
                char c7 = 'I';
                ((StringBuilder)serializable).append(c7);
                return;
            }
            Class<Long> clazz6 = Long.TYPE;
            if (object == clazz6) {
                char c8 = 'J';
                ((StringBuilder)serializable).append(c8);
                return;
            }
            Class<Float> clazz7 = Float.TYPE;
            if (object == clazz7) {
                char c10 = 'F';
                ((StringBuilder)serializable).append(c10);
                return;
            }
            Class<Double> clazz8 = Double.TYPE;
            if (object == clazz8) {
                char c11 = 'D';
                ((StringBuilder)serializable).append(c11);
                return;
            }
            Class<Void> clazz9 = Void.TYPE;
            if (object == clazz9) {
                char c12 = 'V';
                ((StringBuilder)serializable).append(c12);
                return;
            }
            object = ((Class)object).getName();
            object = "Unrecognized primitive type: ".concat((String)object);
            serializable = new IllegalStateException((String)object);
            throw serializable;
        }
        ((StringBuilder)serializable).append('L');
        object = ((Class)object).getName();
        n3 = ((String)object).length();
        int n4 = 0;
        while (true) {
            char c13;
            if (n4 >= n3) {
                if (!bl2) return;
                char c14 = ';';
                ((StringBuilder)serializable).append(c14);
                return;
            }
            char c15 = ((String)object).charAt(n4);
            if (c15 == (c13 = '.')) {
                c15 = '/';
            }
            ((StringBuilder)serializable).append(c15);
            ++n4;
        }
    }

    public final String a() {
        return this.d();
    }

    public String d() {
        return this.a.getName();
    }

    public final JavaType e(int n3) {
        JavaType javaType;
        block3: {
            block2: {
                JavaType[] javaTypeArray;
                block1: {
                    javaTypeArray = this.e;
                    if (n3 < 0) break block1;
                    javaTypeArray = javaTypeArray.b;
                    int n4 = javaTypeArray.length;
                    if (n3 >= n4) break block2;
                    javaType = javaTypeArray[n3];
                    if (javaType == null) {
                        zs3_0.a.getClass();
                        javaType = zs3_0.b;
                    }
                    break block3;
                }
                javaTypeArray.getClass();
            }
            n3 = 0;
            javaType = null;
        }
        return javaType;
    }
}

