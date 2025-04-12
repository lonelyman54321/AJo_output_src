/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.ConstructorConstructor$1;
import com.google.gson.internal.ConstructorConstructor$10;
import com.google.gson.internal.ConstructorConstructor$11;
import com.google.gson.internal.ConstructorConstructor$12;
import com.google.gson.internal.ConstructorConstructor$13;
import com.google.gson.internal.ConstructorConstructor$14;
import com.google.gson.internal.ConstructorConstructor$15;
import com.google.gson.internal.ConstructorConstructor$16;
import com.google.gson.internal.ConstructorConstructor$17;
import com.google.gson.internal.ConstructorConstructor$18;
import com.google.gson.internal.ConstructorConstructor$19;
import com.google.gson.internal.ConstructorConstructor$2;
import com.google.gson.internal.ConstructorConstructor$20;
import com.google.gson.internal.ConstructorConstructor$3;
import com.google.gson.internal.ConstructorConstructor$4;
import com.google.gson.internal.ConstructorConstructor$5;
import com.google.gson.internal.ConstructorConstructor$6;
import com.google.gson.internal.ConstructorConstructor$7;
import com.google.gson.internal.ConstructorConstructor$8;
import com.google.gson.internal.ConstructorConstructor$9;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class ConstructorConstructor {
    private final Map instanceCreators;
    private final List reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map map2, boolean bl2, List list) {
        this.instanceCreators = map2;
        this.useJdkUnsafe = bl2;
        this.reflectionFilters = list;
    }

    public static String checkInstantiable(Class object) {
        int n3 = ((Class)object).getModifiers();
        boolean bl2 = Modifier.isInterface(n3);
        if (bl2) {
            object = ((Class)object).getName();
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat((String)object);
        }
        if ((n3 = (int)(Modifier.isAbstract(n3) ? 1 : 0)) != 0) {
            object = ((Class)object).getName();
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat((String)object);
        }
        return null;
    }

    private static ObjectConstructor newDefaultConstructor(Class object, ReflectionAccessFilter$FilterResult object2) {
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult;
        Constructor constructor;
        boolean bl2 = Modifier.isAbstract(((Class)object).getModifiers());
        boolean bl3 = false;
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult2 = null;
        if (bl2) {
            return null;
        }
        try {
            constructor = ((Class)object).getDeclaredConstructor(null);
            reflectionAccessFilter$FilterResult = ReflectionAccessFilter$FilterResult.ALLOW;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
        if (object2 != reflectionAccessFilter$FilterResult && (!(bl3 = ReflectionAccessFilterHelper.canAccess(constructor, null)) || object2 == (reflectionAccessFilter$FilterResult2 = ReflectionAccessFilter$FilterResult.BLOCK_ALL) && !(bl3 = Modifier.isPublic(constructor.getModifiers())))) {
            object2 = new StringBuilder("Unable to invoke no-args constructor of ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append("; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            object = ((StringBuilder)object2).toString();
            object2 = new ConstructorConstructor$7((String)object);
            return object2;
        }
        if (object2 == reflectionAccessFilter$FilterResult && (object = ReflectionHelper.tryMakeAccessible(constructor)) != null) {
            object2 = new ConstructorConstructor$8((String)object);
            return object2;
        }
        object = new ConstructorConstructor$9(constructor);
        return object;
    }

    private static ObjectConstructor newDefaultImplementationConstructor(Type object, Class clazz) {
        Class clazz2 = Collection.class;
        boolean bl2 = clazz2.isAssignableFrom(clazz);
        if (bl2) {
            object = SortedSet.class;
            boolean bl3 = object.isAssignableFrom(clazz);
            if (bl3) {
                object = new ConstructorConstructor$10();
                return object;
            }
            object = Set.class;
            bl3 = object.isAssignableFrom(clazz);
            if (bl3) {
                object = new ConstructorConstructor$11();
                return object;
            }
            object = Queue.class;
            bl3 = object.isAssignableFrom(clazz);
            if (bl3) {
                object = new ConstructorConstructor$12();
                return object;
            }
            object = new ConstructorConstructor$13();
            return object;
        }
        clazz2 = Map.class;
        bl2 = clazz2.isAssignableFrom(clazz);
        if (bl2) {
            clazz2 = ConcurrentNavigableMap.class;
            bl2 = clazz2.isAssignableFrom(clazz);
            if (bl2) {
                object = new ConstructorConstructor$14();
                return object;
            }
            clazz2 = ConcurrentMap.class;
            bl2 = clazz2.isAssignableFrom(clazz);
            if (bl2) {
                object = new ConstructorConstructor$15();
                return object;
            }
            clazz2 = SortedMap.class;
            boolean bl4 = clazz2.isAssignableFrom(clazz);
            if (bl4) {
                object = new ConstructorConstructor$16();
                return object;
            }
            bl4 = object instanceof ParameterizedType;
            if (bl4) {
                object = ((ParameterizedType)object).getActualTypeArguments();
                bl4 = false;
                clazz = String.class;
                boolean bl5 = clazz.isAssignableFrom((Class<?>)(object = TypeToken.get(object[0]).getRawType()));
                if (!bl5) {
                    object = new ConstructorConstructor$17();
                    return object;
                }
            }
            object = new ConstructorConstructor$18();
            return object;
        }
        return null;
    }

    private static ObjectConstructor newSpecialCollectionConstructor(Type type2, Class object) {
        Class clazz = EnumSet.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
        if (bl2) {
            object = new ConstructorConstructor$5(type2);
            return object;
        }
        clazz = EnumMap.class;
        if (object == clazz) {
            object = new ConstructorConstructor$6(type2);
            return object;
        }
        return null;
    }

    private ObjectConstructor newUnsafeAllocator(Class object) {
        boolean bl2 = this.useJdkUnsafe;
        if (bl2) {
            ConstructorConstructor$19 constructorConstructor$19 = new ConstructorConstructor$19(this, (Class)object);
            return constructorConstructor$19;
        }
        Object object2 = new StringBuilder("Unable to create instance of ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append("; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        object = ((StringBuilder)object2).toString();
        object2 = new ConstructorConstructor$20(this, (String)object);
        return object2;
    }

    public ObjectConstructor get(TypeToken object) {
        Object object2 = ((TypeToken)object).getType();
        object = ((TypeToken)object).getRawType();
        Object object3 = (InstanceCreator)this.instanceCreators.get(object2);
        if (object3 != null) {
            object = new ConstructorConstructor$1(this, (InstanceCreator)object3, (Type)object2);
            return object;
        }
        object3 = (InstanceCreator)this.instanceCreators.get(object);
        if (object3 != null) {
            object = new ConstructorConstructor$2(this, (InstanceCreator)object3, (Type)object2);
            return object;
        }
        object3 = ConstructorConstructor.newSpecialCollectionConstructor((Type)object2, (Class)object);
        if (object3 != null) {
            return object3;
        }
        object3 = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, (Class)object);
        ObjectConstructor objectConstructor = ConstructorConstructor.newDefaultConstructor((Class)object, (ReflectionAccessFilter$FilterResult)((Object)object3));
        if (objectConstructor != null) {
            return objectConstructor;
        }
        if ((object2 = ConstructorConstructor.newDefaultImplementationConstructor((Type)object2, (Class)object)) != null) {
            return object2;
        }
        object2 = ConstructorConstructor.checkInstantiable((Class)object);
        if (object2 != null) {
            object = new ConstructorConstructor$3(this, (String)object2);
            return object;
        }
        object2 = ReflectionAccessFilter$FilterResult.ALLOW;
        if (object3 == object2) {
            return this.newUnsafeAllocator((Class)object);
        }
        object2 = new StringBuilder("Unable to create instance of ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append("; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
        object = ((StringBuilder)object2).toString();
        object2 = new ConstructorConstructor$4(this, (String)object);
        return object2;
    }

    public String toString() {
        return this.instanceCreators.toString();
    }
}

