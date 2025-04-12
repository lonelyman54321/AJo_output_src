/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl;
import com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl;
import com.google.gson.internal.$Gson$Types$WildcardTypeImpl;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

public final class $Gson$Types {
    static final /* synthetic */ boolean $assertionsDisabled;
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    private $Gson$Types() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public static GenericArrayType arrayOf(Type type2) {
        $Gson$Types$GenericArrayTypeImpl $Gson$Types$GenericArrayTypeImpl = new $Gson$Types$GenericArrayTypeImpl(type2);
        return $Gson$Types$GenericArrayTypeImpl;
    }

    public static Type canonicalize(Type typeArray) {
        boolean bl2 = typeArray instanceof Class;
        if (bl2) {
            bl2 = (typeArray = (Class)typeArray).isArray();
            if (bl2) {
                typeArray = $Gson$Types.canonicalize(typeArray.getComponentType());
                $Gson$Types$GenericArrayTypeImpl $Gson$Types$GenericArrayTypeImpl = new $Gson$Types$GenericArrayTypeImpl((Type)typeArray);
                typeArray = $Gson$Types$GenericArrayTypeImpl;
            }
            return typeArray;
        }
        bl2 = typeArray instanceof ParameterizedType;
        if (bl2) {
            typeArray = (ParameterizedType)typeArray;
            Type type2 = typeArray.getOwnerType();
            Type type3 = typeArray.getRawType();
            typeArray = typeArray.getActualTypeArguments();
            $Gson$Types$ParameterizedTypeImpl $Gson$Types$ParameterizedTypeImpl = new $Gson$Types$ParameterizedTypeImpl(type2, type3, typeArray);
            return $Gson$Types$ParameterizedTypeImpl;
        }
        bl2 = typeArray instanceof GenericArrayType;
        if (bl2) {
            typeArray = (GenericArrayType)typeArray;
            typeArray = typeArray.getGenericComponentType();
            $Gson$Types$GenericArrayTypeImpl $Gson$Types$GenericArrayTypeImpl = new $Gson$Types$GenericArrayTypeImpl((Type)typeArray);
            return $Gson$Types$GenericArrayTypeImpl;
        }
        bl2 = typeArray instanceof WildcardType;
        if (bl2) {
            typeArray = (WildcardType)typeArray;
            Type[] typeArray2 = typeArray.getUpperBounds();
            typeArray = typeArray.getLowerBounds();
            $Gson$Types$WildcardTypeImpl $Gson$Types$WildcardTypeImpl = new $Gson$Types$WildcardTypeImpl(typeArray2, typeArray);
            return $Gson$Types$WildcardTypeImpl;
        }
        return typeArray;
    }

    public static void checkNotPrimitive(Type type2) {
        boolean bl2;
        boolean bl3 = type2 instanceof Class;
        if (bl3 && (bl2 = ((Class)(type2 = (Class)type2)).isPrimitive())) {
            bl2 = false;
            type2 = null;
        } else {
            bl2 = true;
        }
        $Gson$Preconditions.checkArgument(bl2);
    }

    private static Class declaringClassOf(TypeVariable type2) {
        boolean bl2 = (type2 = type2.getGenericDeclaration()) instanceof Class;
        type2 = bl2 ? (Class)type2 : null;
        return type2;
    }

    private static boolean equal(Object object, Object object2) {
        return Objects.equals(object, object2);
    }

    public static boolean equals(Type objectArray, Type objectArray2) {
        boolean bl2 = true;
        if (objectArray == objectArray2) {
            return bl2;
        }
        boolean bl3 = objectArray instanceof Class;
        if (bl3) {
            return objectArray.equals(objectArray2);
        }
        bl3 = objectArray instanceof ParameterizedType;
        if (bl3) {
            boolean bl4;
            Type type2;
            bl3 = objectArray2 instanceof ParameterizedType;
            if (!bl3) {
                return false;
            }
            objectArray = (ParameterizedType)objectArray;
            objectArray2 = (ParameterizedType)objectArray2;
            Type type3 = objectArray.getOwnerType();
            bl3 = $Gson$Types.equal(type3, type2 = objectArray2.getOwnerType());
            if (!(bl3 && (bl3 = (type3 = objectArray.getRawType()).equals(type2 = objectArray2.getRawType())) && (bl4 = Arrays.equals(objectArray = objectArray.getActualTypeArguments(), objectArray2 = objectArray2.getActualTypeArguments())))) {
                bl2 = false;
            }
            return bl2;
        }
        bl3 = objectArray instanceof GenericArrayType;
        if (bl3) {
            bl2 = objectArray2 instanceof GenericArrayType;
            if (!bl2) {
                return false;
            }
            objectArray = (GenericArrayType)objectArray;
            objectArray2 = (GenericArrayType)objectArray2;
            objectArray = objectArray.getGenericComponentType();
            objectArray2 = objectArray2.getGenericComponentType();
            return $Gson$Types.equals((Type)objectArray, (Type)objectArray2);
        }
        bl3 = objectArray instanceof WildcardType;
        if (bl3) {
            boolean bl5;
            Object[] objectArray3;
            bl3 = objectArray2 instanceof WildcardType;
            if (!bl3) {
                return false;
            }
            objectArray = (WildcardType)objectArray;
            objectArray2 = (WildcardType)objectArray2;
            Object[] objectArray4 = objectArray.getUpperBounds();
            bl3 = Arrays.equals(objectArray4, objectArray3 = objectArray2.getUpperBounds());
            if (!bl3 || !(bl5 = Arrays.equals(objectArray = objectArray.getLowerBounds(), objectArray2 = objectArray2.getLowerBounds()))) {
                bl2 = false;
            }
            return bl2;
        }
        bl3 = objectArray instanceof TypeVariable;
        if (bl3) {
            boolean bl6;
            Object d2;
            bl3 = objectArray2 instanceof TypeVariable;
            if (!bl3) {
                return false;
            }
            objectArray = (TypeVariable)objectArray;
            objectArray2 = (TypeVariable)objectArray2;
            Object d5 = objectArray.getGenericDeclaration();
            if (d5 != (d2 = objectArray2.getGenericDeclaration()) || !(bl6 = (objectArray = objectArray.getName()).equals(objectArray2 = objectArray2.getName()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public static Type getArrayComponentType(Type type2) {
        boolean bl2 = type2 instanceof GenericArrayType;
        type2 = bl2 ? ((GenericArrayType)type2).getGenericComponentType() : ((Class)type2).getComponentType();
        return type2;
    }

    public static Type getCollectionElementType(Type type2, Class clazz) {
        Class<Collection> clazz2 = Collection.class;
        boolean bl2 = (type2 = $Gson$Types.getSupertype(type2, clazz, clazz2)) instanceof ParameterizedType;
        if (bl2) {
            return ((ParameterizedType)type2).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    private static Type getGenericSupertype(Type object, Class object2, Class clazz) {
        int n3;
        if (clazz == object2) {
            return object;
        }
        boolean bl2 = clazz.isInterface();
        if (bl2) {
            object = ((Class)object2).getInterfaces();
            n3 = ((Class<?>[])object).length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Class<?> clazz2 = object[i3];
                if (clazz2 == clazz) {
                    return ((Class)object2).getGenericInterfaces()[i3];
                }
                boolean bl3 = clazz.isAssignableFrom(clazz2);
                if (!bl3) continue;
                object2 = ((Class)object2).getGenericInterfaces()[i3];
                object = object[i3];
                return $Gson$Types.getGenericSupertype((Type)object2, (Class)object, clazz);
            }
        }
        if (!(bl2 = ((Class)object2).isInterface())) {
            while (object2 != (object = Object.class)) {
                object = ((Class)object2).getSuperclass();
                if (object == clazz) {
                    return ((Class)object2).getGenericSuperclass();
                }
                n3 = (int)(clazz.isAssignableFrom((Class<?>)object) ? 1 : 0);
                if (n3 != 0) {
                    return $Gson$Types.getGenericSupertype(((Class)object2).getGenericSuperclass(), (Class)object, clazz);
                }
                object2 = object;
            }
        }
        return clazz;
    }

    public static Type[] getMapKeyAndValueTypes(Type typeArray, Class clazz) {
        int n3 = 1;
        int n4 = 2;
        Class clazz2 = Properties.class;
        if (typeArray == clazz2) {
            typeArray = new Type[n4];
            clazz = String.class;
            typeArray[0] = clazz;
            typeArray[n3] = clazz;
            return typeArray;
        }
        clazz2 = Map.class;
        boolean bl2 = (typeArray = $Gson$Types.getSupertype((Type)typeArray, clazz, clazz2)) instanceof ParameterizedType;
        if (bl2) {
            return ((ParameterizedType)typeArray).getActualTypeArguments();
        }
        typeArray = new Type[n4];
        clazz = Object.class;
        typeArray[0] = clazz;
        typeArray[n3] = clazz;
        return typeArray;
    }

    public static Class getRawType(Type object) {
        boolean bl2 = object instanceof Class;
        if (bl2) {
            return (Class)object;
        }
        bl2 = object instanceof ParameterizedType;
        if (bl2) {
            object = ((ParameterizedType)object).getRawType();
            $Gson$Preconditions.checkArgument(object instanceof Class);
            return (Class)object;
        }
        bl2 = object instanceof GenericArrayType;
        IllegalArgumentException illegalArgumentException = null;
        if (bl2) {
            return Array.newInstance($Gson$Types.getRawType(((GenericArrayType)object).getGenericComponentType()), 0).getClass();
        }
        bl2 = object instanceof TypeVariable;
        if (bl2) {
            return Object.class;
        }
        bl2 = object instanceof WildcardType;
        if (bl2) {
            return $Gson$Types.getRawType(((WildcardType)object).getUpperBounds()[0]);
        }
        String string2 = object == null ? "null" : object.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append(object);
        stringBuilder.append("> is of type ");
        stringBuilder.append(string2);
        object = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    private static Type getSupertype(Type object, Class clazz, Class type2) {
        boolean bl2 = object instanceof WildcardType;
        if (bl2) {
            object = ((WildcardType)object).getUpperBounds();
            bl2 = false;
            object = object[0];
        }
        $Gson$Preconditions.checkArgument(type2.isAssignableFrom(clazz));
        type2 = $Gson$Types.getGenericSupertype((Type)object, clazz, type2);
        return $Gson$Types.resolve((Type)object, clazz, type2);
    }

    private static int indexOf(Object[] object, Object object2) {
        int n3 = ((Object[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = object[i3];
            boolean bl2 = object2.equals(object3);
            if (!bl2) continue;
            return i3;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type2, Type type3, Type ... typeArray) {
        $Gson$Types$ParameterizedTypeImpl $Gson$Types$ParameterizedTypeImpl = new $Gson$Types$ParameterizedTypeImpl(type2, type3, typeArray);
        return $Gson$Types$ParameterizedTypeImpl;
    }

    public static Type resolve(Type type2, Class clazz, Type type3) {
        HashMap hashMap = new HashMap();
        return $Gson$Types.resolve(type2, clazz, type3, hashMap);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Type resolve(Type type2, Class type3, Type type4, Map map2) {
        void var4_17;
        void var3_15;
        Type type5;
        block13: {
            int n3;
            void var1_11;
            int n4;
            block18: {
                void var0_4;
                block16: {
                    int n7;
                    Type type6;
                    block17: {
                        Type type7;
                        block14: {
                            Type type8;
                            block15: {
                                Object var4_16 = null;
                                while ((n4 = type5 instanceof TypeVariable) != 0) {
                                    void var6_21 = type5;
                                    TypeVariable typeVariable = (TypeVariable)type5;
                                    type6 = (Type)var3_15.get(typeVariable);
                                    if (type6 != null) {
                                        Class<Void> clazz = Void.TYPE;
                                        if (type6 != clazz) return type6;
                                        return type5;
                                    }
                                    type5 = Void.TYPE;
                                    var3_15.put(typeVariable, type5);
                                    if (var4_17 == null) {
                                        TypeVariable typeVariable2 = typeVariable;
                                    }
                                    if ((type5 = $Gson$Types.resolveTypeVariable(type2, (Class)var1_11, typeVariable)) != typeVariable) continue;
                                    break block13;
                                }
                                n4 = type5 instanceof Class;
                                if (n4 == 0) break block14;
                                void var6_22 = type5;
                                Class clazz = (Class)type5;
                                n7 = clazz.isArray();
                                if (n7 == 0) break block14;
                                type5 = clazz.getComponentType();
                                boolean bl2 = $Gson$Types.equal(type5, type8 = $Gson$Types.resolve(type2, (Class)var1_11, type5, (Map)var3_15));
                                if (!bl2) break block15;
                                type5 = clazz;
                                break block13;
                            }
                            GenericArrayType genericArrayType = $Gson$Types.arrayOf(type8);
                            break block16;
                        }
                        if ((n4 = type5 instanceof GenericArrayType) == 0) break block17;
                        Type type9 = (type5 = (GenericArrayType)type5).getGenericComponentType();
                        boolean bl3 = $Gson$Types.equal(type9, type7 = $Gson$Types.resolve(type2, (Class)var1_11, type9, (Map)var3_15));
                        if (bl3) break block13;
                        GenericArrayType genericArrayType = $Gson$Types.arrayOf(type7);
                        break block16;
                    }
                    n4 = type5 instanceof ParameterizedType;
                    type6 = null;
                    n3 = 1;
                    if (n4 == 0) break block18;
                    type5 = (ParameterizedType)type5;
                    Type type10 = type5.getOwnerType();
                    Type type11 = $Gson$Types.resolve(type2, (Class)var1_11, type10, (Map)var3_15);
                    n4 = $Gson$Types.equal(type11, type10) ^ n3;
                    Object object = type5.getActualTypeArguments();
                    int n8 = ((Type[])object).length;
                    for (n7 = 0; n7 < n8; ++n7) {
                        Type type12;
                        Type type13 = object[n7];
                        boolean bl4 = $Gson$Types.equal(type13 = $Gson$Types.resolve(type2, (Class)var1_11, type13, (Map)var3_15), type12 = object[n7]);
                        if (bl4) continue;
                        if (n4 == 0) {
                            Object object2 = object.clone();
                            object = object2;
                            object = (Type[])object2;
                            n4 = 1;
                        }
                        object[n7] = type13;
                    }
                    if (n4 == 0) break block13;
                    Type type14 = type5.getRawType();
                    ParameterizedType parameterizedType = $Gson$Types.newParameterizedTypeWithOwner(type11, type14, object);
                }
                type5 = var0_4;
                break block13;
            }
            n4 = type5 instanceof WildcardType;
            if (n4 != 0) {
                type5 = (WildcardType)type5;
                Type[] typeArray = type5.getLowerBounds();
                Type[] typeArray2 = type5.getUpperBounds();
                int n10 = typeArray.length;
                if (n10 == n3) {
                    Type type15;
                    Type type16 = typeArray[0];
                    Type type17 = $Gson$Types.resolve(type2, (Class)var1_11, type16, (Map)var3_15);
                    if (type17 != (type15 = typeArray[0])) {
                        type5 = $Gson$Types.supertypeOf(type17);
                    }
                } else {
                    Type type18;
                    Type type19;
                    Type type20;
                    n4 = typeArray2.length;
                    if (n4 == n3 && (type20 = $Gson$Types.resolve(type2, (Class)var1_11, type19 = typeArray2[0], (Map)var3_15)) != (type18 = typeArray2[0])) {
                        type5 = $Gson$Types.subtypeOf(type20);
                    }
                }
            }
        }
        if (var4_17 == null) return type5;
        var3_15.put(var4_17, type5);
        return type5;
    }

    private static Type resolveTypeVariable(Type type2, Class clazz, TypeVariable typeVariable) {
        Class clazz2 = $Gson$Types.declaringClassOf(typeVariable);
        if (clazz2 == null) {
            return typeVariable;
        }
        int n3 = (type2 = $Gson$Types.getGenericSupertype(type2, clazz, clazz2)) instanceof ParameterizedType;
        if (n3 != 0) {
            n3 = $Gson$Types.indexOf(clazz2.getTypeParameters(), typeVariable);
            return ((ParameterizedType)type2).getActualTypeArguments()[n3];
        }
        return typeVariable;
    }

    public static WildcardType subtypeOf(Type typeArray) {
        Type[] typeArray2;
        Object object;
        int n3 = typeArray instanceof WildcardType;
        if (n3 != 0) {
            typeArray = ((WildcardType)typeArray).getUpperBounds();
        } else {
            n3 = 1;
            object = new Type[n3];
            typeArray2 = null;
            object[0] = typeArray;
            typeArray = object;
        }
        typeArray2 = EMPTY_TYPE_ARRAY;
        object = new $Gson$Types$WildcardTypeImpl(typeArray, typeArray2);
        return object;
    }

    public static WildcardType supertypeOf(Type typeArray) {
        Object object;
        int n3 = 1;
        boolean bl2 = typeArray instanceof WildcardType;
        if (bl2) {
            typeArray = ((WildcardType)typeArray).getLowerBounds();
        } else {
            object = new Type[n3];
            object[0] = typeArray;
            typeArray = object;
        }
        Type[] typeArray2 = new Type[n3];
        typeArray2[0] = Object.class;
        object = new $Gson$Types$WildcardTypeImpl(typeArray2, typeArray);
        return object;
    }

    public static String typeToString(Type object) {
        boolean bl2 = object instanceof Class;
        object = bl2 ? ((Class)object).getName() : object.toString();
        return object;
    }
}

