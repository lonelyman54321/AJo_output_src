/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import java.lang.reflect.Type;

public final class Primitives {
    private Primitives() {
    }

    public static boolean isPrimitive(Type type2) {
        boolean bl2;
        boolean bl3 = type2 instanceof Class;
        if (bl3 && (bl2 = ((Class)(type2 = (Class)type2)).isPrimitive())) {
            bl2 = true;
        } else {
            bl2 = false;
            type2 = null;
        }
        return bl2;
    }

    public static boolean isWrapperType(Type type2) {
        boolean bl2;
        Class clazz = Integer.class;
        if (type2 != clazz && type2 != (clazz = Float.class) && type2 != (clazz = Byte.class) && type2 != (clazz = Double.class) && type2 != (clazz = Long.class) && type2 != (clazz = Character.class) && type2 != (clazz = Boolean.class) && type2 != (clazz = Short.class) && type2 != (clazz = Void.class)) {
            bl2 = false;
            type2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static Class unwrap(Class clazz) {
        Class clazz2 = Integer.class;
        if (clazz == clazz2) {
            return Integer.TYPE;
        }
        clazz2 = Float.class;
        if (clazz == clazz2) {
            return Float.TYPE;
        }
        clazz2 = Byte.class;
        if (clazz == clazz2) {
            return Byte.TYPE;
        }
        clazz2 = Double.class;
        if (clazz == clazz2) {
            return Double.TYPE;
        }
        clazz2 = Long.class;
        if (clazz == clazz2) {
            return Long.TYPE;
        }
        clazz2 = Character.class;
        if (clazz == clazz2) {
            return Character.TYPE;
        }
        clazz2 = Boolean.class;
        if (clazz == clazz2) {
            return Boolean.TYPE;
        }
        clazz2 = Short.class;
        if (clazz == clazz2) {
            return Short.TYPE;
        }
        clazz2 = Void.class;
        if (clazz == clazz2) {
            clazz = Void.TYPE;
        }
        return clazz;
    }

    public static Class wrap(Class clazz) {
        Class<Object> clazz2 = Integer.TYPE;
        if (clazz == clazz2) {
            return Integer.class;
        }
        clazz2 = Float.TYPE;
        if (clazz == clazz2) {
            return Float.class;
        }
        clazz2 = Byte.TYPE;
        if (clazz == clazz2) {
            return Byte.class;
        }
        clazz2 = Double.TYPE;
        if (clazz == clazz2) {
            return Double.class;
        }
        clazz2 = Long.TYPE;
        if (clazz == clazz2) {
            return Long.class;
        }
        clazz2 = Character.TYPE;
        if (clazz == clazz2) {
            return Character.class;
        }
        clazz2 = Boolean.TYPE;
        if (clazz == clazz2) {
            return Boolean.class;
        }
        clazz2 = Short.TYPE;
        if (clazz == clazz2) {
            return Short.class;
        }
        clazz2 = Void.TYPE;
        if (clazz == clazz2) {
            clazz = Void.class;
        }
        return clazz;
    }
}

