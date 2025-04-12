/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.reflect;

import com.google.gson.internal.$Gson$Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TypeToken {
    private final int hashCode;
    private final Class rawType;
    private final Type type;

    public TypeToken() {
        int n3;
        Class clazz;
        Type type2;
        this.type = type2 = this.getTypeTokenTypeArgument();
        this.rawType = clazz = $Gson$Types.getRawType(type2);
        this.hashCode = n3 = type2.hashCode();
    }

    private TypeToken(Type type2) {
        int n3;
        Class clazz;
        Objects.requireNonNull(type2);
        this.type = type2 = $Gson$Types.canonicalize(type2);
        this.rawType = clazz = $Gson$Types.getRawType(type2);
        this.hashCode = n3 = type2.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type object, Class ... object2) {
        String string2 = "Unexpected type. Expected one of: ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n3 = ((Class[])object2).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = object2[i3].getName();
            stringBuilder.append(string3);
            string3 = ", ";
            stringBuilder.append(string3);
        }
        stringBuilder.append("but got: ");
        object2 = object.getClass().getName();
        stringBuilder.append((String)object2);
        stringBuilder.append(", for type token: ");
        object = object.toString();
        stringBuilder.append((String)object);
        stringBuilder.append('.');
        object2 = stringBuilder.toString();
        object = new AssertionError(object2);
        return object;
    }

    public static TypeToken get(Class clazz) {
        TypeToken typeToken = new TypeToken(clazz);
        return typeToken;
    }

    public static TypeToken get(Type type2) {
        TypeToken typeToken = new TypeToken(type2);
        return typeToken;
    }

    public static TypeToken getArray(Type type2) {
        type2 = $Gson$Types.arrayOf(type2);
        TypeToken typeToken = new TypeToken(type2);
        return typeToken;
    }

    public static TypeToken getParameterized(Type object, Type ... object2) {
        Objects.requireNonNull(object);
        Objects.requireNonNull(object2);
        boolean bl2 = object instanceof Class;
        if (bl2) {
            Object object3 = object;
            int n3 = ((Type[])object2).length;
            object3 = (Class)object;
            TypeVariable<Class<T>>[] typeVariableArray = ((Class)object3).getTypeParameters();
            int n4 = typeVariableArray.length;
            if (n3 == n4) {
                bl2 = false;
                object3 = null;
                for (n3 = 0; n3 < n4; ++n3) {
                    Type type2 = object2[n3];
                    Class clazz = $Gson$Types.getRawType(type2);
                    TypeVariable typeVariable = typeVariableArray[n3];
                    Type[] typeArray = typeVariable.getBounds();
                    int n7 = typeArray.length;
                    for (int i3 = 0; i3 < n7; ++i3) {
                        Class clazz2 = $Gson$Types.getRawType(typeArray[i3]);
                        boolean bl3 = clazz2.isAssignableFrom(clazz);
                        if (bl3) {
                            continue;
                        }
                        object3 = new StringBuilder("Type argument ");
                        ((StringBuilder)object3).append(type2);
                        ((StringBuilder)object3).append(" does not satisfy bounds for type variable ");
                        ((StringBuilder)object3).append(typeVariable);
                        ((StringBuilder)object3).append(" declared by ");
                        ((StringBuilder)object3).append(object);
                        object = ((StringBuilder)object3).toString();
                        object2 = new IllegalArgumentException((String)object);
                        throw object2;
                    }
                }
                object = $Gson$Types.newParameterizedTypeWithOwner(null, (Type)object, (Type[])object2);
                object3 = new TypeToken((Type)object);
                return object3;
            }
            object2 = new StringBuilder();
            object3 = ((Class)object3).getName();
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(" requires ");
            ((StringBuilder)object2).append(n4);
            ((StringBuilder)object2).append(" type arguments, but got ");
            ((StringBuilder)object2).append(n3);
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder("rawType must be of type Class, but was ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    private Type getTypeTokenTypeArgument() {
        Object object = this.getClass().getGenericSuperclass();
        boolean bl2 = object instanceof ParameterizedType;
        Class<TypeToken> clazz = TypeToken.class;
        if (bl2) {
            Type type2 = (object = (ParameterizedType)object).getRawType();
            if (type2 == clazz) {
                return $Gson$Types.canonicalize(object.getActualTypeArguments()[0]);
            }
        } else if (object == clazz) {
            object = new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
            throw object;
        }
        object = new IllegalStateException("Must only create direct subclasses of TypeToken");
        throw object;
    }

    private static boolean isAssignableFrom(Type clazz, GenericArrayType type2) {
        boolean bl2 = (type2 = type2.getGenericComponentType()) instanceof ParameterizedType;
        if (bl2) {
            bl2 = clazz instanceof GenericArrayType;
            if (bl2) {
                clazz = ((GenericArrayType)((Object)clazz)).getGenericComponentType();
            } else {
                bl2 = clazz instanceof Class;
                if (bl2) {
                    clazz = clazz;
                    while (bl2 = clazz.isArray()) {
                        clazz = clazz.getComponentType();
                    }
                }
            }
            type2 = (ParameterizedType)type2;
            HashMap hashMap = new HashMap();
            return TypeToken.isAssignableFrom(clazz, (ParameterizedType)type2, hashMap);
        }
        return true;
    }

    private static boolean isAssignableFrom(Type object, ParameterizedType parameterizedType, Map map2) {
        HashMap hashMap;
        Object object2;
        boolean bl2;
        int n3 = 0;
        HashMap hashMap2 = null;
        if (object == null) {
            return false;
        }
        boolean bl3 = parameterizedType.equals(object);
        boolean bl4 = true;
        if (bl3) {
            return bl4;
        }
        Class clazz = $Gson$Types.getRawType((Type)object);
        int n4 = object instanceof ParameterizedType;
        if (n4 != 0) {
            object = (ParameterizedType)object;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            int n7;
            Type[] typeArray = object.getActualTypeArguments();
            object2 = clazz.getTypeParameters();
            hashMap = null;
            for (int i3 = 0; i3 < (n7 = typeArray.length); ++i3) {
                boolean bl5;
                Object object3 = typeArray[i3];
                Object object4 = object2[i3];
                while (bl5 = object3 instanceof TypeVariable) {
                    object3 = ((TypeVariable)object3).getName();
                    object3 = (Type)map2.get(object3);
                }
                object4 = object4.getName();
                map2.put(object4, object3);
            }
            bl2 = TypeToken.typeEquals((ParameterizedType)object, parameterizedType, map2);
            if (bl2) {
                return bl4;
            }
        }
        object = clazz.getGenericInterfaces();
        n4 = ((Type[])object).length;
        while (n3 < n4) {
            object2 = object[n3];
            hashMap = new HashMap(map2);
            boolean bl6 = TypeToken.isAssignableFrom(object2, parameterizedType, hashMap);
            if (bl6) {
                return bl4;
            }
            ++n3;
        }
        object = clazz.getGenericSuperclass();
        hashMap2 = new HashMap(map2);
        return TypeToken.isAssignableFrom((Type)object, parameterizedType, hashMap2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean matches(Type object, Type type2, Map map2) {
        boolean bl2 = type2.equals(object);
        if (bl2) return true;
        bl2 = object instanceof TypeVariable;
        if (!bl2) return false;
        object = ((TypeVariable)object).getName();
        boolean bl3 = type2.equals(object = map2.get(object));
        if (!bl3) return false;
        return true;
    }

    private static boolean typeEquals(ParameterizedType typeArray, ParameterizedType typeArray2, Map map2) {
        Type type2 = typeArray.getRawType();
        Type type3 = typeArray2.getRawType();
        int n3 = type2.equals(type3);
        type3 = null;
        if (n3 != 0) {
            int n4;
            typeArray = typeArray.getActualTypeArguments();
            typeArray2 = typeArray2.getActualTypeArguments();
            type2 = null;
            for (n3 = 0; n3 < (n4 = typeArray.length); ++n3) {
                Type type4 = typeArray[n3];
                Type type5 = typeArray2[n3];
                n4 = (int)(TypeToken.matches(type4, type5, map2) ? 1 : 0);
                if (n4 != 0) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object object) {
        Type type2;
        boolean bl2;
        boolean bl3 = object instanceof TypeToken;
        if (bl3 && (bl2 = $Gson$Types.equals(type2 = this.type, (Type)(object = ((TypeToken)object).type)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Class getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public boolean isAssignableFrom(TypeToken object) {
        object = ((TypeToken)object).getType();
        return this.isAssignableFrom((Type)object);
    }

    public boolean isAssignableFrom(Class clazz) {
        return this.isAssignableFrom((Type)clazz);
    }

    public boolean isAssignableFrom(Type classArray) {
        boolean bl2 = true;
        if (classArray == null) {
            return false;
        }
        Type type2 = this.type;
        boolean bl3 = type2.equals(classArray);
        if (bl3) {
            return bl2;
        }
        type2 = this.type;
        boolean bl4 = type2 instanceof Class;
        if (bl4) {
            Class clazz = this.rawType;
            classArray = $Gson$Types.getRawType((Type)classArray);
            return clazz.isAssignableFrom((Class<?>)classArray);
        }
        bl4 = type2 instanceof ParameterizedType;
        if (bl4) {
            type2 = (ParameterizedType)type2;
            HashMap hashMap = new HashMap();
            return TypeToken.isAssignableFrom((Type)classArray, (ParameterizedType)type2, hashMap);
        }
        bl4 = type2 instanceof GenericArrayType;
        if (bl4) {
            boolean bl5;
            type2 = this.rawType;
            Class clazz = $Gson$Types.getRawType((Type)classArray);
            bl3 = ((Class)type2).isAssignableFrom(clazz);
            if (!bl3 || !(bl5 = TypeToken.isAssignableFrom((Type)classArray, (GenericArrayType)(type2 = (GenericArrayType)this.type)))) {
                bl2 = false;
                Object var6_8 = null;
            }
            return bl2;
        }
        classArray = new Class[3];
        classArray[0] = Class.class;
        classArray[bl2] = ParameterizedType.class;
        classArray[2] = GenericArrayType.class;
        throw TypeToken.buildUnexpectedTypeError(type2, classArray);
    }

    public final String toString() {
        return $Gson$Types.typeToString(this.type);
    }
}

