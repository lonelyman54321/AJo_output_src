/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;

/*
 * Renamed from Cz3
 */
public final class cz3_0 {
    public static final Type[] a = new Type[0];
    public static boolean b = true;

    public static void a(Type object) {
        boolean bl2;
        boolean bl3 = object instanceof Class;
        if (bl3 && (bl2 = ((Class)(object = (Class)object)).isPrimitive())) {
            object = new IllegalArgumentException();
            throw object;
        }
    }

    public static boolean b(Type objectArray, Type object) {
        boolean bl2 = true;
        if (objectArray == object) {
            return bl2;
        }
        boolean bl3 = objectArray instanceof Class;
        if (bl3) {
            return objectArray.equals(object);
        }
        bl3 = objectArray instanceof ParameterizedType;
        if (bl3) {
            Type type2;
            bl3 = object instanceof ParameterizedType;
            if (!bl3) {
                return false;
            }
            objectArray = (ParameterizedType)objectArray;
            object = (ParameterizedType)object;
            Type type3 = objectArray.getOwnerType();
            if (!(type3 == (type2 = object.getOwnerType()) || type3 != null && (bl3 = type3.equals(type2)))) {
                bl3 = false;
                type3 = null;
            } else {
                bl3 = true;
            }
            type2 = objectArray.getRawType();
            Type type4 = object.getRawType();
            boolean bl4 = type2.equals(type4);
            objectArray = objectArray.getActualTypeArguments();
            object = object.getActualTypeArguments();
            boolean bl5 = Arrays.equals(objectArray, object);
            if (!(bl3 && bl4 && bl5)) {
                bl2 = false;
            }
            return bl2;
        }
        bl3 = objectArray instanceof GenericArrayType;
        if (bl3) {
            bl2 = object instanceof GenericArrayType;
            if (!bl2) {
                return false;
            }
            objectArray = (GenericArrayType)objectArray;
            object = (GenericArrayType)object;
            objectArray = objectArray.getGenericComponentType();
            object = object.getGenericComponentType();
            return cz3_0.b((Type)objectArray, (Type)object);
        }
        bl3 = objectArray instanceof WildcardType;
        if (bl3) {
            boolean bl6;
            Object[] objectArray2;
            bl3 = object instanceof WildcardType;
            if (!bl3) {
                return false;
            }
            objectArray = (WildcardType)objectArray;
            object = (WildcardType)object;
            Object[] objectArray3 = objectArray.getUpperBounds();
            bl3 = Arrays.equals(objectArray3, objectArray2 = object.getUpperBounds());
            if (!bl3 || !(bl6 = Arrays.equals(objectArray = objectArray.getLowerBounds(), object = object.getLowerBounds()))) {
                bl2 = false;
            }
            return bl2;
        }
        bl3 = objectArray instanceof TypeVariable;
        if (bl3) {
            boolean bl7;
            Object d2;
            bl3 = object instanceof TypeVariable;
            if (!bl3) {
                return false;
            }
            objectArray = (TypeVariable)objectArray;
            object = (TypeVariable)object;
            Object d5 = objectArray.getGenericDeclaration();
            if (d5 != (d2 = object.getGenericDeclaration()) || !(bl7 = (objectArray = objectArray.getName()).equals(object = object.getName()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public static Type c(Type object, Class object2, Class clazz) {
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
                return cz3_0.c((Type)object2, (Class)object, clazz);
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
                    return cz3_0.c(((Class)object2).getGenericSuperclass(), (Class)object, clazz);
                }
                object2 = object;
            }
        }
        return clazz;
    }

    public static Type d(int n3, ParameterizedType parameterizedType) {
        int n4;
        Type[] typeArray = parameterizedType.getActualTypeArguments();
        if (n3 >= 0 && n3 < (n4 = typeArray.length)) {
            Object object = typeArray[n3];
            boolean bl2 = object instanceof WildcardType;
            if (bl2) {
                object = ((WildcardType)object).getUpperBounds();
                bl2 = false;
                parameterizedType = null;
                object = object[0];
            }
            return object;
        }
        CharSequence charSequence = wk0_0.a(n3, "Index ", " not in range [0,");
        int n7 = typeArray.length;
        charSequence.append(n7);
        charSequence.append(") for ");
        charSequence.append(parameterizedType);
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public static Class e(Type object) {
        Object object2 = "type == null";
        Objects.requireNonNull(object, (String)object2);
        boolean bl2 = object instanceof Class;
        if (bl2) {
            return (Class)object;
        }
        bl2 = object instanceof ParameterizedType;
        if (bl2) {
            bl2 = (object = ((ParameterizedType)object).getRawType()) instanceof Class;
            if (bl2) {
                return (Class)object;
            }
            object = new IllegalArgumentException();
            throw object;
        }
        bl2 = object instanceof GenericArrayType;
        StringBuilder stringBuilder = null;
        if (bl2) {
            return Array.newInstance(cz3_0.e(((GenericArrayType)object).getGenericComponentType()), 0).getClass();
        }
        bl2 = object instanceof TypeVariable;
        if (bl2) {
            return Object.class;
        }
        bl2 = object instanceof WildcardType;
        if (bl2) {
            return cz3_0.e(((WildcardType)object).getUpperBounds()[0]);
        }
        stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append(object);
        stringBuilder.append("> is of type ");
        object = object.getClass().getName();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static Type f(Type object, Class clazz) {
        Class<Map> clazz2 = Map.class;
        boolean bl2 = clazz2.isAssignableFrom(clazz);
        if (bl2) {
            clazz2 = cz3_0.c((Type)object, clazz, clazz2);
            return cz3_0.m((Type)object, clazz, (Type)((Object)clazz2));
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public static boolean g(Type object) {
        int n3 = object instanceof Class;
        IllegalArgumentException illegalArgumentException = null;
        if (n3 != 0) {
            return false;
        }
        n3 = object instanceof ParameterizedType;
        boolean bl2 = true;
        if (n3 != 0) {
            for (Type type2 : ((ParameterizedType)object).getActualTypeArguments()) {
                boolean bl3 = cz3_0.g(type2);
                if (!bl3) continue;
                return bl2;
            }
            return false;
        }
        n3 = object instanceof GenericArrayType;
        if (n3 != 0) {
            return cz3_0.g(((GenericArrayType)object).getGenericComponentType());
        }
        n3 = object instanceof TypeVariable;
        if (n3 != 0) {
            return bl2;
        }
        n3 = object instanceof WildcardType;
        if (n3 != 0) {
            return bl2;
        }
        String string2 = object == null ? "null" : object.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append(object);
        stringBuilder.append("> is of type ");
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public static boolean h(Annotation[] annotationArray, Class clazz) {
        for (Annotation annotation : annotationArray) {
            boolean bl2 = clazz.isInstance(annotation);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public static boolean i(Type type2) {
        boolean bl2 = b;
        boolean bl3 = false;
        if (bl2) {
            Class<Unit> clazz = Unit.class;
            if (type2 == clazz) {
                bl3 = true;
            }
            return bl3;
        }
        return false;
    }

    public static IllegalArgumentException j(Method object, Exception exception, String charSequence, Object ... object2) {
        charSequence = String.format((String)charSequence, object2);
        charSequence = nn_2.a((String)charSequence, "\n    for method ");
        String string2 = ((Method)object).getDeclaringClass().getSimpleName();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(".");
        object = ((Method)object).getName();
        ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)charSequence).toString();
        object2 = new IllegalArgumentException((String)object, exception);
        return object2;
    }

    public static IllegalArgumentException k(Method method, int n3, String string2, Object ... objectArray) {
        String string3 = at2_2.b.a(method, n3);
        string3 = y02.a(string2, " (", string3, ")");
        return cz3_0.j(method, null, string3, objectArray);
    }

    public static IllegalArgumentException l(Method method, Exception exception, int n3, String string2, Object ... objectArray) {
        String string3 = at2_2.b.a(method, n3);
        string3 = y02.a(string2, " (", string3, ")");
        return cz3_0.j(method, exception, string3, objectArray);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Type m(Type typeArray, Class object, Type object2) {
        int n3 = 0;
        Type type2 = null;
        int n4 = 1;
        while (true) {
            void var7_21;
            TypeVariable typeVariable;
            block23: {
                int n7;
                Object object3;
                int n8;
                void var7_25;
                block22: {
                    void var2_16;
                    boolean bl2;
                    void var2_3;
                    int n10;
                    block21: {
                        if ((n10 = var2_3 instanceof TypeVariable) == 0) break block21;
                        typeVariable = (TypeVariable)var2_3;
                        Object d2 = typeVariable.getGenericDeclaration();
                        bl2 = d2 instanceof Class;
                        if (bl2) {
                            Class clazz = (Class)d2;
                        } else {
                            n10 = 0;
                            Object var7_24 = null;
                        }
                        if (var7_25 != null && (n8 = (object3 = cz3_0.c((Type)typeArray, (Class)object, (Class)var7_25)) instanceof ParameterizedType) != 0) break block22;
                        TypeVariable typeVariable2 = typeVariable;
                        break block23;
                    }
                    n10 = var2_3 instanceof Class;
                    if (n10 != 0) {
                        void var7_29 = var2_3;
                        Class clazz = (Class)var2_3;
                        bl2 = clazz.isArray();
                        if (bl2) {
                            void var7_32;
                            Class<?> clazz2 = clazz.getComponentType();
                            if (clazz2 == (typeArray = cz3_0.m((Type)typeArray, (Class)object, clazz2))) {
                                return var7_32;
                            }
                            Cz3$a cz3$a = new Cz3$a((Type)typeArray);
                            return var7_32;
                        }
                    }
                    if ((n10 = var2_3 instanceof GenericArrayType) != 0) {
                        void var2_9;
                        GenericArrayType genericArrayType = (GenericArrayType)var2_3;
                        type2 = genericArrayType.getGenericComponentType();
                        if (type2 == (typeArray = cz3_0.m((Type)typeArray, (Class)object, type2))) {
                            return var2_9;
                        }
                        Cz3$a cz3$a = new Cz3$a((Type)typeArray);
                        return var2_9;
                    }
                    n10 = var2_3 instanceof ParameterizedType;
                    if (n10 != 0) {
                        ParameterizedType parameterizedType = (ParameterizedType)var2_3;
                        Type type3 = parameterizedType.getOwnerType();
                        object3 = cz3_0.m((Type)typeArray, (Class)object, type3);
                        if (object3 != type3) {
                            n10 = 1;
                        } else {
                            n10 = 0;
                            Object var7_35 = null;
                        }
                        Type[] typeArray2 = parameterizedType.getActualTypeArguments();
                        n7 = typeArray2.length;
                        while (true) {
                            void var15_52;
                            void var11_46;
                            if (n3 >= n7) {
                                void var2_12;
                                if (n10 == 0) return var2_12;
                                object = parameterizedType.getRawType();
                                Type[] typeArray3 = typeArray = new Cz3$b((Type)object3, (Type)object, (Type[])var11_46);
                                return var2_12;
                            }
                            Type type4 = var11_46[n3];
                            if ((type4 = cz3_0.m((Type)typeArray, (Class)object, type4)) != (var15_52 = var11_46[n3])) {
                                if (n10 == 0) {
                                    Object object4;
                                    Object object5 = object4 = var11_46.clone();
                                    Type[] typeArray4 = (Type[])object4;
                                    n10 = 1;
                                }
                                var11_46[n3] = type4;
                            }
                            n3 += n4;
                        }
                    }
                    n10 = var2_3 instanceof WildcardType;
                    if (n10 == 0) return (Type)var2_16;
                    WildcardType wildcardType = (WildcardType)var2_3;
                    Type[] typeArray5 = wildcardType.getLowerBounds();
                    object3 = wildcardType.getUpperBounds();
                    n8 = typeArray5.length;
                    if (n8 == n4) {
                        object3 = typeArray5[0];
                        if ((typeArray = cz3_0.m((Type)typeArray, (Class)object, (Type)object3)) == (object = typeArray5[0])) return (Type)var2_16;
                        Type[] typeArray6 = new Type[n4];
                        typeArray6[0] = Object.class;
                        Type[] typeArray7 = new Type[n4];
                        typeArray7[0] = typeArray;
                        return new Cz3$c(typeArray6, typeArray7);
                    }
                    n10 = ((Type[])object3).length;
                    if (n10 != n4) return (Type)var2_16;
                    Type type5 = object3[0];
                    if ((typeArray = cz3_0.m((Type)typeArray, (Class)object, type5)) == (object = object3[0])) return (Type)var2_16;
                    Type[] typeArray8 = new Type[n4];
                    typeArray8[0] = typeArray;
                    typeArray = a;
                    return new Cz3$c(typeArray8, typeArray);
                }
                TypeVariable<Class<T>>[] typeVariableArray = var7_25.getTypeParameters();
                n8 = 0;
                Object var11_44 = null;
                while (true) {
                    if (n8 >= (n7 = typeVariableArray.length)) {
                        typeArray = new NoSuchElementException();
                        throw typeArray;
                    }
                    TypeVariable typeVariable3 = typeVariableArray[n8];
                    n7 = (int)(typeVariable.equals(typeVariable3) ? 1 : 0);
                    if (n7 != 0) {
                        object3 = (ParameterizedType)object3;
                        Type type6 = object3.getActualTypeArguments()[n8];
                        break;
                    }
                    n8 += n4;
                }
            }
            if (var7_21 == typeVariable) {
                return var7_21;
            }
            void var2_5 = var7_21;
        }
    }

    public static void n(Throwable throwable) {
        boolean bl2 = throwable instanceof VirtualMachineError;
        if (!bl2) {
            bl2 = throwable instanceof ThreadDeath;
            if (!bl2) {
                bl2 = throwable instanceof LinkageError;
                if (!bl2) {
                    return;
                }
                throw (LinkageError)throwable;
            }
            throw (ThreadDeath)throwable;
        }
        throw (VirtualMachineError)throwable;
    }

    public static String o(Type object) {
        boolean bl2 = object instanceof Class;
        object = bl2 ? ((Class)object).getName() : object.toString();
        return object;
    }
}

