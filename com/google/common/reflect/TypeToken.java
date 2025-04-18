/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet$Builder;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeCapture;
import com.google.common.reflect.TypeParameter;
import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.TypeResolver$TypeVariableKey;
import com.google.common.reflect.TypeToken$1;
import com.google.common.reflect.TypeToken$3;
import com.google.common.reflect.TypeToken$4;
import com.google.common.reflect.TypeToken$Bounds;
import com.google.common.reflect.TypeToken$SimpleTypeToken;
import com.google.common.reflect.TypeToken$TypeSet;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$JavaVersion;
import com.google.common.reflect.Types$WildcardTypeImpl;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class TypeToken
extends TypeCapture
implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    private transient TypeResolver covariantTypeResolver;
    private transient TypeResolver invariantTypeResolver;
    private final Type runtimeType;

    public TypeToken() {
        Type type2;
        this.runtimeType = type2 = this.capture();
        Preconditions.checkState(type2 instanceof TypeVariable ^ true, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", (Object)type2);
    }

    public TypeToken(Class type2) {
        Type type3 = this.capture();
        boolean bl2 = type3 instanceof Class;
        if (bl2) {
            this.runtimeType = type3;
        } else {
            type2 = TypeResolver.covariantly(type2).resolveType(type3);
            this.runtimeType = type2;
        }
    }

    private TypeToken(Type type2) {
        this.runtimeType = type2 = (Type)Preconditions.checkNotNull(type2);
    }

    public /* synthetic */ TypeToken(Type type2, TypeToken$1 typeToken$1) {
        this(type2);
    }

    public static /* synthetic */ TypeResolver access$000(TypeToken typeToken) {
        return typeToken.getCovariantTypeResolver();
    }

    public static /* synthetic */ TypeResolver access$100(TypeToken typeToken) {
        return typeToken.getInvariantTypeResolver();
    }

    public static /* synthetic */ ImmutableSet access$300(TypeToken typeToken) {
        return typeToken.getRawTypes();
    }

    public static /* synthetic */ Type access$500(TypeToken typeToken) {
        return typeToken.runtimeType;
    }

    private static TypeToken$Bounds any(Type[] typeArray) {
        TypeToken$Bounds typeToken$Bounds = new TypeToken$Bounds(typeArray, true);
        return typeToken$Bounds;
    }

    private TypeToken boundAsSuperclass(Type object) {
        Class clazz = ((TypeToken)(object = TypeToken.of((Type)object))).getRawType();
        boolean bl2 = clazz.isInterface();
        if (bl2) {
            object = null;
        }
        return object;
    }

    private ImmutableList boundsAsInterfaces(Type[] typeArray) {
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        int n3 = typeArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            TypeToken typeToken = TypeToken.of(typeArray[i3]);
            Class clazz = typeToken.getRawType();
            boolean bl2 = clazz.isInterface();
            if (!bl2) continue;
            immutableList$Builder.add(typeToken);
        }
        return immutableList$Builder.build();
    }

    private static Type canonicalizeTypeArg(TypeVariable type2, Type type3) {
        boolean bl2 = type3 instanceof WildcardType;
        if (bl2) {
            type3 = (WildcardType)type3;
            type2 = TypeToken.canonicalizeWildcardType(type2, (WildcardType)type3);
        } else {
            type2 = TypeToken.canonicalizeWildcardsInType(type3);
        }
        return type2;
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable typeArray, WildcardType typeArray2) {
        typeArray = typeArray.getBounds();
        Type[] typeArray3 = new ArrayList();
        for (Type type2 : typeArray2.getUpperBounds()) {
            TypeToken$Bounds typeToken$Bounds = TypeToken.any(typeArray);
            boolean bl2 = typeToken$Bounds.isSubtypeOf(type2);
            if (bl2) continue;
            type2 = TypeToken.canonicalizeWildcardsInType(type2);
            typeArray3.add(type2);
        }
        typeArray2 = typeArray2.getLowerBounds();
        Type[] typeArray4 = new Type[]{};
        typeArray3 = typeArray3.toArray(typeArray4);
        typeArray = new Types$WildcardTypeImpl(typeArray2, typeArray3);
        return typeArray;
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        int n3;
        Class clazz = (Class)parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeVariableArray = clazz.getTypeParameters();
        Type[] typeArray = parameterizedType.getActualTypeArguments();
        for (int i3 = 0; i3 < (n3 = typeArray.length); ++i3) {
            Type type2 = typeVariableArray[i3];
            Type type3 = typeArray[i3];
            typeArray[i3] = type2 = TypeToken.canonicalizeTypeArg(type2, type3);
        }
        return Types.newParameterizedTypeWithOwner(parameterizedType.getOwnerType(), clazz, typeArray);
    }

    private static Type canonicalizeWildcardsInType(Type type2) {
        boolean bl2 = type2 instanceof ParameterizedType;
        if (bl2) {
            return TypeToken.canonicalizeWildcardsInParameterizedType((ParameterizedType)type2);
        }
        bl2 = type2 instanceof GenericArrayType;
        if (bl2) {
            type2 = Types.newArrayType(TypeToken.canonicalizeWildcardsInType(((GenericArrayType)type2).getGenericComponentType()));
        }
        return type2;
    }

    private static TypeToken$Bounds every(Type[] typeArray) {
        TypeToken$Bounds typeToken$Bounds = new TypeToken$Bounds(typeArray, false);
        return typeToken$Bounds;
    }

    private TypeToken getArraySubtype(Class object) {
        Serializable serializable = ((Class)object).getComponentType();
        if (serializable != null) {
            object = this.getComponentType();
            Objects.requireNonNull(object);
            return TypeToken.of(TypeToken.newArrayClassOrGenericArrayType(((TypeToken)object).getSubtype(serializable).runtimeType));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object);
        stringBuilder.append(" does not appear to be a subtype of ");
        stringBuilder.append(this);
        object = stringBuilder.toString();
        serializable = new Serializable((String)object);
        throw serializable;
    }

    private TypeToken getArraySupertype(Class object) {
        Serializable serializable = this.getComponentType();
        if (serializable != null) {
            object = ((Class)object).getComponentType();
            Objects.requireNonNull(object);
            return TypeToken.of(TypeToken.newArrayClassOrGenericArrayType(((TypeToken)serializable).getSupertype(object).runtimeType));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object);
        stringBuilder.append(" isn't a super type of ");
        stringBuilder.append(this);
        object = stringBuilder.toString();
        serializable = new IllegalArgumentException((String)object);
        throw serializable;
    }

    private TypeResolver getCovariantTypeResolver() {
        TypeResolver typeResolver = this.covariantTypeResolver;
        if (typeResolver == null) {
            this.covariantTypeResolver = typeResolver = TypeResolver.covariantly(this.runtimeType);
        }
        return typeResolver;
    }

    private TypeResolver getInvariantTypeResolver() {
        TypeResolver typeResolver = this.invariantTypeResolver;
        if (typeResolver == null) {
            this.invariantTypeResolver = typeResolver = TypeResolver.invariantly(this.runtimeType);
        }
        return typeResolver;
    }

    private Type getOwnerTypeIfPresent() {
        Type type2 = this.runtimeType;
        boolean bl2 = type2 instanceof ParameterizedType;
        if (bl2) {
            return ((ParameterizedType)type2).getOwnerType();
        }
        bl2 = type2 instanceof Class;
        if (bl2) {
            return ((Class)type2).getEnclosingClass();
        }
        return null;
    }

    private ImmutableSet getRawTypes() {
        ImmutableSet$Builder immutableSet$Builder = ImmutableSet.builder();
        TypeToken$4 typeToken$4 = new TypeToken$4(this, immutableSet$Builder);
        Type type2 = this.runtimeType;
        Type[] typeArray = new Type[]{type2};
        typeToken$4.visit(typeArray);
        return immutableSet$Builder.build();
    }

    private TypeToken getSubtypeFromLowerBounds(Class object, Type[] object2) {
        int n3 = ((Type[])object2).length;
        if (n3 > 0) {
            return TypeToken.of(object2[0]).getSubtype((Class)object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object);
        stringBuilder.append(" isn't a subclass of ");
        stringBuilder.append(this);
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    private TypeToken getSupertypeFromUpperBounds(Class object, Type[] object2) {
        int n3 = ((Type[])object2).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            TypeToken typeToken = TypeToken.of(object2[i3]);
            boolean bl2 = typeToken.isSubtypeOf((Type)object);
            if (!bl2) continue;
            return typeToken.getSupertype((Class)object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object);
        stringBuilder.append(" isn't a super type of ");
        stringBuilder.append(this);
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    private boolean is(Type object, TypeVariable object2) {
        Type type2 = this.runtimeType;
        boolean bl2 = type2.equals(object);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        bl2 = object instanceof WildcardType;
        if (bl2) {
            boolean bl4;
            object = (WildcardType)object;
            boolean bl5 = ((TypeToken$Bounds)(object2 = TypeToken.every((object = TypeToken.canonicalizeWildcardType((TypeVariable)object2, (WildcardType)object)).getUpperBounds()))).isSupertypeOf(type2 = this.runtimeType);
            if (!bl5 || !(bl4 = ((TypeToken$Bounds)(object = TypeToken.every(object.getLowerBounds()))).isSubtypeOf((Type)(object2 = this.runtimeType)))) {
                bl3 = false;
            }
            return bl3;
        }
        object2 = TypeToken.canonicalizeWildcardsInType(this.runtimeType);
        object = TypeToken.canonicalizeWildcardsInType((Type)object);
        return object2.equals(object);
    }

    private boolean isOwnedBySubtypeOf(Type type2) {
        boolean bl2;
        Iterator iterator = this.getTypes().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = ((TypeToken)iterator.next()).getOwnerTypeIfPresent();
            if (object == null || !(bl2 = ((TypeToken)(object = TypeToken.of((Type)object))).isSubtypeOf(type2))) continue;
            return true;
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType type2) {
        Object object = this.runtimeType;
        boolean bl2 = object instanceof Class;
        if (bl2) {
            bl2 = ((Class)(object = (Class)object)).isArray();
            if (!bl2) {
                return false;
            }
            object = TypeToken.of(((Class)object).getComponentType());
            type2 = type2.getGenericComponentType();
            return ((TypeToken)object).isSubtypeOf(type2);
        }
        bl2 = object instanceof GenericArrayType;
        if (bl2) {
            object = TypeToken.of(((GenericArrayType)object).getGenericComponentType());
            type2 = type2.getGenericComponentType();
            return ((TypeToken)object).isSubtypeOf(type2);
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType type2) {
        boolean bl2;
        int n3;
        Object object = TypeToken.of(type2).getRawType();
        boolean bl3 = this.someRawTypeIsSubclassOf((Class)object);
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        object = ((Class)object).getTypeParameters();
        Type[] typeArray = type2.getActualTypeArguments();
        for (int i3 = 0; i3 < (n3 = ((TypeVariable<Class<T>>[])object).length); ++i3) {
            Object object2;
            Object object3 = this.getCovariantTypeResolver();
            Type type3 = object[i3];
            n3 = (int)(super.is(type3 = typeArray[i3], (TypeVariable)(object2 = object[i3])) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        object = (Class)type2.getRawType();
        boolean bl5 = Modifier.isStatic(((Class)object).getModifiers());
        if (bl5 || (object = type2.getOwnerType()) == null || (bl2 = this.isOwnedBySubtypeOf(type2 = type2.getOwnerType()))) {
            bl4 = true;
        }
        return bl4;
    }

    private boolean isSupertypeOfArray(GenericArrayType object) {
        Class<Object[]> clazz = this.runtimeType;
        boolean bl2 = clazz instanceof Class;
        if (bl2) {
            bl2 = (clazz = (Class)clazz).isArray();
            if (!bl2) {
                return clazz.isAssignableFrom(Object[].class);
            }
            object = TypeToken.of(object.getGenericComponentType());
            clazz = clazz.getComponentType();
            return ((TypeToken)object).isSubtypeOf(clazz);
        }
        boolean bl3 = clazz instanceof GenericArrayType;
        if (bl3) {
            object = TypeToken.of(object.getGenericComponentType());
            clazz = ((GenericArrayType)this.runtimeType).getGenericComponentType();
            return ((TypeToken)object).isSubtypeOf(clazz);
        }
        return false;
    }

    private boolean isWrapper() {
        Set set = Primitives.allWrapperTypes();
        Type type2 = this.runtimeType;
        return set.contains(type2);
    }

    private static Type newArrayClassOrGenericArrayType(Type type2) {
        return Types$JavaVersion.JAVA7.newArrayType(type2);
    }

    public static TypeToken of(Class clazz) {
        TypeToken$SimpleTypeToken typeToken$SimpleTypeToken = new TypeToken$SimpleTypeToken((Type)clazz);
        return typeToken$SimpleTypeToken;
    }

    public static TypeToken of(Type type2) {
        TypeToken$SimpleTypeToken typeToken$SimpleTypeToken = new TypeToken$SimpleTypeToken(type2);
        return typeToken$SimpleTypeToken;
    }

    private TypeToken resolveSupertype(Type object) {
        TypeResolver typeResolver;
        object = TypeToken.of(this.getCovariantTypeResolver().resolveType((Type)object));
        ((TypeToken)object).covariantTypeResolver = typeResolver = this.covariantTypeResolver;
        ((TypeToken)object).invariantTypeResolver = typeResolver = this.invariantTypeResolver;
        return object;
    }

    private Type resolveTypeArgsForSubclass(Class object) {
        Object object2 = this.runtimeType;
        int n3 = object2 instanceof Class;
        if (n3 != 0 && ((n3 = ((TypeVariable<Class<T>>[])(object2 = ((Class)object).getTypeParameters())).length) == 0 || (n3 = ((TypeVariable<Class<T>>[])(object2 = this.getRawType().getTypeParameters())).length) != 0)) {
            return object;
        }
        object = TypeToken.toGenericType((Class)object);
        object2 = this.getRawType();
        object2 = ((TypeToken)object).getSupertype(object2).runtimeType;
        TypeResolver typeResolver = new TypeResolver();
        Type type2 = this.runtimeType;
        object2 = typeResolver.where((Type)object2, type2);
        object = ((TypeToken)object).runtimeType;
        return ((TypeResolver)object2).resolveType((Type)object);
    }

    private boolean someRawTypeIsSubclassOf(Class clazz) {
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.getRawTypes().iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            Class clazz2 = (Class)unmodifiableIterator.next();
            bl2 = clazz.isAssignableFrom(clazz2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public static TypeToken toGenericType(Class clazz) {
        Class<?> clazz2;
        Type type2;
        boolean bl2 = clazz.isArray();
        if (bl2) {
            return TypeToken.of(Types.newArrayType(TypeToken.toGenericType(clazz.getComponentType()).runtimeType));
        }
        Type[] typeArray = clazz.getTypeParameters();
        boolean bl3 = clazz.isMemberClass();
        if (bl3 && !(bl3 = Modifier.isStatic(clazz.getModifiers()))) {
            type2 = TypeToken.toGenericType(clazz.getEnclosingClass()).runtimeType;
        } else {
            bl3 = false;
            type2 = null;
        }
        int n3 = typeArray.length;
        if (n3 <= 0 && (type2 == null || type2 == (clazz2 = clazz.getEnclosingClass()))) {
            return TypeToken.of(clazz);
        }
        return TypeToken.of(Types.newParameterizedTypeWithOwner(type2, clazz, typeArray));
    }

    public final Invokable constructor(Constructor constructor) {
        boolean bl2;
        Class clazz;
        AnnotatedElement annotatedElement = constructor.getDeclaringClass();
        if (annotatedElement == (clazz = this.getRawType())) {
            bl2 = true;
        } else {
            bl2 = false;
            annotatedElement = null;
        }
        Class clazz2 = this.getRawType();
        Preconditions.checkArgument(bl2, "%s not declared by %s", (Object)constructor, (Object)clazz2);
        annotatedElement = new AnnotatedElement(this, constructor);
        return annotatedElement;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof TypeToken;
        if (bl2) {
            object = (TypeToken)object;
            Type type2 = this.runtimeType;
            object = ((TypeToken)object).runtimeType;
            return type2.equals(object);
        }
        return false;
    }

    public final TypeToken getComponentType() {
        Type type2 = Types.getComponentType(this.runtimeType);
        if (type2 == null) {
            return null;
        }
        return TypeToken.of(type2);
    }

    public final ImmutableList getGenericInterfaces() {
        Type[] typeArray = this.runtimeType;
        boolean bl2 = typeArray instanceof TypeVariable;
        if (bl2) {
            typeArray = ((TypeVariable)typeArray).getBounds();
            return this.boundsAsInterfaces(typeArray);
        }
        bl2 = typeArray instanceof WildcardType;
        if (bl2) {
            typeArray = ((WildcardType)typeArray).getUpperBounds();
            return this.boundsAsInterfaces(typeArray);
        }
        typeArray = ImmutableList.builder();
        for (Type type2 : this.getRawType().getGenericInterfaces()) {
            TypeToken object = this.resolveSupertype(type2);
            typeArray.add(object);
        }
        return typeArray.build();
    }

    public final TypeToken getGenericSuperclass() {
        Type type2 = this.runtimeType;
        boolean bl2 = type2 instanceof TypeVariable;
        if (bl2) {
            type2 = ((TypeVariable)type2).getBounds()[0];
            return this.boundAsSuperclass(type2);
        }
        bl2 = type2 instanceof WildcardType;
        if (bl2) {
            type2 = ((WildcardType)type2).getUpperBounds()[0];
            return this.boundAsSuperclass(type2);
        }
        type2 = this.getRawType().getGenericSuperclass();
        if (type2 == null) {
            return null;
        }
        return this.resolveSupertype(type2);
    }

    public final Class getRawType() {
        return (Class)this.getRawTypes().iterator().next();
    }

    public final TypeToken getSubtype(Class serializable) {
        boolean bl2 = this.runtimeType instanceof TypeVariable ^ true;
        String string2 = "Cannot get subtype of type variable <%s>";
        Preconditions.checkArgument(bl2, string2, (Object)this);
        Type[] typeArray = this.runtimeType;
        boolean bl3 = typeArray instanceof WildcardType;
        if (bl3) {
            typeArray = ((WildcardType)typeArray).getLowerBounds();
            return this.getSubtypeFromLowerBounds((Class)serializable, typeArray);
        }
        bl2 = this.isArray();
        if (bl2) {
            return this.getArraySubtype((Class)serializable);
        }
        Preconditions.checkArgument(this.getRawType().isAssignableFrom((Class<?>)serializable), "%s isn't a subclass of %s", (Object)serializable, (Object)this);
        serializable = TypeToken.of(this.resolveTypeArgsForSubclass((Class)serializable));
        Preconditions.checkArgument(((TypeToken)serializable).isSubtypeOf(this), "%s does not appear to be a subtype of %s", (Object)serializable, (Object)this);
        return serializable;
    }

    public final TypeToken getSupertype(Class type2) {
        boolean bl2 = this.someRawTypeIsSubclassOf((Class)type2);
        String string2 = "%s is not a super class of %s";
        Preconditions.checkArgument(bl2, string2, (Object)type2, (Object)this);
        Type[] typeArray = this.runtimeType;
        boolean bl3 = typeArray instanceof TypeVariable;
        if (bl3) {
            typeArray = ((TypeVariable)typeArray).getBounds();
            return this.getSupertypeFromUpperBounds((Class)type2, typeArray);
        }
        bl3 = typeArray instanceof WildcardType;
        if (bl3) {
            typeArray = ((WildcardType)typeArray).getUpperBounds();
            return this.getSupertypeFromUpperBounds((Class)type2, typeArray);
        }
        bl2 = type2.isArray();
        if (bl2) {
            return this.getArraySupertype((Class)type2);
        }
        type2 = TypeToken.toGenericType((Class)type2).runtimeType;
        return this.resolveSupertype(type2);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken$TypeSet getTypes() {
        TypeToken$TypeSet typeToken$TypeSet = new TypeToken$TypeSet(this);
        return typeToken$TypeSet;
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        boolean bl2;
        TypeToken typeToken = this.getComponentType();
        if (typeToken != null) {
            bl2 = true;
        } else {
            bl2 = false;
            typeToken = null;
        }
        return bl2;
    }

    public final boolean isPrimitive() {
        boolean bl2;
        Type type2 = this.runtimeType;
        boolean bl3 = type2 instanceof Class;
        if (bl3 && (bl2 = ((Class)(type2 = (Class)type2)).isPrimitive())) {
            bl2 = true;
        } else {
            bl2 = false;
            type2 = null;
        }
        return bl2;
    }

    public final boolean isSubtypeOf(TypeToken object) {
        object = ((TypeToken)object).getType();
        return this.isSubtypeOf((Type)object);
    }

    public final boolean isSubtypeOf(Type object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = object instanceof WildcardType;
        if (bl2) {
            object = TypeToken.any(((WildcardType)object).getLowerBounds());
            Type type2 = this.runtimeType;
            return ((TypeToken$Bounds)object).isSupertypeOf(type2);
        }
        Object object2 = this.runtimeType;
        boolean bl3 = object2 instanceof WildcardType;
        if (bl3) {
            return TypeToken.any(((WildcardType)object2).getUpperBounds()).isSubtypeOf((Type)object);
        }
        bl3 = object2 instanceof TypeVariable;
        boolean bl4 = false;
        if (bl3) {
            boolean bl5;
            bl2 = object2.equals(object);
            if (bl2 || (bl5 = ((TypeToken$Bounds)(object2 = TypeToken.any(((TypeVariable)this.runtimeType).getBounds()))).isSubtypeOf((Type)object))) {
                bl4 = true;
            }
            return bl4;
        }
        bl2 = object2 instanceof GenericArrayType;
        if (bl2) {
            object = TypeToken.of((Type)object);
            object2 = (GenericArrayType)this.runtimeType;
            return super.isSupertypeOfArray((GenericArrayType)object2);
        }
        bl2 = object instanceof Class;
        if (bl2) {
            object = (Class)object;
            return this.someRawTypeIsSubclassOf((Class)object);
        }
        bl2 = object instanceof ParameterizedType;
        if (bl2) {
            object = (ParameterizedType)object;
            return this.isSubtypeOfParameterizedType((ParameterizedType)object);
        }
        bl2 = object instanceof GenericArrayType;
        if (bl2) {
            object = (GenericArrayType)object;
            return this.isSubtypeOfArrayType((GenericArrayType)object);
        }
        return false;
    }

    public final boolean isSupertypeOf(TypeToken typeToken) {
        Type type2 = this.getType();
        return typeToken.isSubtypeOf(type2);
    }

    public final boolean isSupertypeOf(Type object) {
        object = TypeToken.of((Type)object);
        Type type2 = this.getType();
        return ((TypeToken)object).isSubtypeOf(type2);
    }

    public final Invokable method(Method method) {
        AnnotatedElement annotatedElement = method.getDeclaringClass();
        Preconditions.checkArgument(this.someRawTypeIsSubclassOf((Class)annotatedElement), "%s not declared by %s", (Object)method, (Object)this);
        annotatedElement = new AnnotatedElement(this, method);
        return annotatedElement;
    }

    public final TypeToken rejectTypeVariables() {
        TypeToken$3 typeToken$3 = new TypeToken$3(this);
        Type type2 = this.runtimeType;
        Type[] typeArray = new Type[]{type2};
        typeToken$3.visit(typeArray);
        return this;
    }

    public final TypeToken resolveType(Type type2) {
        Preconditions.checkNotNull(type2);
        return TypeToken.of(this.getInvariantTypeResolver().resolveType(type2));
    }

    public String toString() {
        return Types.toString(this.runtimeType);
    }

    public final TypeToken unwrap() {
        boolean bl2 = this.isWrapper();
        if (bl2) {
            return TypeToken.of(Primitives.unwrap((Class)this.runtimeType));
        }
        return this;
    }

    public final TypeToken where(TypeParameter object, TypeToken typeToken) {
        Object object2 = new TypeResolver();
        object = ((TypeParameter)object).typeVariable;
        TypeResolver$TypeVariableKey typeResolver$TypeVariableKey = new TypeResolver$TypeVariableKey((TypeVariable)object);
        object = typeToken.runtimeType;
        object = ImmutableMap.of(typeResolver$TypeVariableKey, object);
        object = ((TypeResolver)object2).where((Map)object);
        object2 = this.runtimeType;
        object = ((TypeResolver)object).resolveType((Type)object2);
        typeToken = new TypeToken$SimpleTypeToken((Type)object);
        return typeToken;
    }

    public final TypeToken where(TypeParameter typeParameter, Class serializable) {
        serializable = TypeToken.of(serializable);
        return this.where(typeParameter, (TypeToken)serializable);
    }

    public final TypeToken wrap() {
        boolean bl2 = this.isPrimitive();
        if (bl2) {
            return TypeToken.of(Primitives.wrap((Class)this.runtimeType));
        }
        return this;
    }

    public Object writeReplace() {
        TypeResolver typeResolver = new TypeResolver();
        Type type2 = this.runtimeType;
        return TypeToken.of(typeResolver.resolveType(type2));
    }
}

