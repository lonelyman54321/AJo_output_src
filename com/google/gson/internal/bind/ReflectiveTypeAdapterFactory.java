/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldReflectionAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$RecordAdapter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory
implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final List reflectionFilters;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    public static /* synthetic */ void access$000(Object object, AccessibleObject accessibleObject) {
        ReflectiveTypeAdapterFactory.checkAccessible(object, accessibleObject);
    }

    private static void checkAccessible(Object object, AccessibleObject object2) {
        boolean bl2;
        Object object3 = object2;
        object3 = (Member)object2;
        boolean bl3 = Modifier.isStatic(object3.getModifiers());
        if (bl3) {
            bl2 = false;
            object = null;
        }
        if (bl2 = ReflectionAccessFilterHelper.canAccess((AccessibleObject)object2, object)) {
            return;
        }
        object = ReflectionHelper.getAccessibleObjectDescription((AccessibleObject)object2, true);
        object = Ft2.a((String)object, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        object2 = new JsonIOException((String)object);
        throw object2;
    }

    private ReflectiveTypeAdapterFactory$BoundField createBoundField(Gson gson, Field field, Method method, String string2, TypeToken typeToken, boolean bl2, boolean bl3, boolean bl4) {
        ReflectiveTypeAdapterFactory$1 reflectiveTypeAdapterFactory$1;
        TypeAdapterFactory typeAdapterFactory;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Gson gson2 = gson;
        TypeToken typeToken2 = typeToken;
        Object object = typeToken.getRawType();
        boolean bl5 = Primitives.isPrimitive((Type)object);
        int n3 = field.getModifiers();
        boolean bl6 = Modifier.isStatic(n3);
        boolean bl7 = bl6 && (n3 = (int)(Modifier.isFinal(n3) ? 1 : 0)) != 0;
        object = field.getAnnotation(JsonAdapter.class);
        if (object != null) {
            typeAdapterFactory = reflectiveTypeAdapterFactory.jsonAdapterFactory;
            ConstructorConstructor constructorConstructor = reflectiveTypeAdapterFactory.constructorConstructor;
            object = typeAdapterFactory.getTypeAdapter(constructorConstructor, gson2, typeToken2, (JsonAdapter)object);
        } else {
            n3 = 0;
            object = null;
        }
        boolean bl8 = object != null;
        if (object == null) {
            object = gson2.getAdapter(typeToken2);
        }
        Object object2 = object;
        object = reflectiveTypeAdapterFactory$1;
        typeAdapterFactory = this;
        gson2 = gson;
        typeToken2 = typeToken;
        reflectiveTypeAdapterFactory$1 = new ReflectiveTypeAdapterFactory$1(this, string2, field, bl2, bl3, bl4, method, bl8, (TypeAdapter)object2, gson, typeToken, bl5, bl7);
        return reflectiveTypeAdapterFactory$1;
    }

    private Map getBoundFields(Gson gson, TypeToken typeToken, Class clazz, boolean n3, boolean bl2) {
        Object object;
        Object object2 = this;
        Class clazz2 = clazz;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean n4 = clazz.isInterface();
        if (n4) {
            return linkedHashMap;
        }
        TypeToken typeToken2 = typeToken;
        int n7 = n3;
        Class clazz3 = clazz;
        while (clazz3 != (object = Object.class)) {
            int n8;
            Object object3;
            int n10;
            Field[] fieldArray = clazz3.getDeclaredFields();
            boolean bl3 = true;
            if (clazz3 != clazz2 && (n10 = fieldArray.length) > 0) {
                object3 = ReflectionAccessFilterHelper.getFilterResult(((ReflectiveTypeAdapterFactory)object2).reflectionFilters, clazz3);
                if (object3 != (object = ReflectionAccessFilter$FilterResult.BLOCK_ALL)) {
                    object = ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
                    if (object3 == object) {
                        n8 = 1;
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                } else {
                    object = new StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
                    ((StringBuilder)object).append(clazz3);
                    ((StringBuilder)object).append(" (supertype of ");
                    ((StringBuilder)object).append(clazz2);
                    ((StringBuilder)object).append("). Register a TypeAdapter for this type or adjust the access filter.");
                    object = ((StringBuilder)object).toString();
                    object3 = new JsonIOException((String)object);
                    throw object3;
                }
            }
            void var17_19 = n8;
            int n14 = fieldArray.length;
            int n15 = 0;
            while (n15 < n14) {
                Object object4;
                Object object5;
                block23: {
                    int n16;
                    int n17;
                    block22: {
                        Field field;
                        Object object6;
                        Object object7;
                        int n18;
                        Object object8;
                        int n19;
                        block21: {
                            object5 = fieldArray[n15];
                            n8 = ((ReflectiveTypeAdapterFactory)object2).includeField((Field)object5, bl3);
                            n10 = (int)(((ReflectiveTypeAdapterFactory)object2).includeField((Field)object5, false) ? 1 : 0);
                            if (n8 != 0 || n10 != 0) break block21;
                            n17 = n15;
                            n16 = n14;
                            break block22;
                        }
                        object4 = null;
                        if (bl2) {
                            SerializedName serializedName;
                            n19 = Modifier.isStatic(((Field)object5).getModifiers());
                            if (n19 != 0) {
                                object8 = null;
                                n18 = 0;
                                serializedName = null;
                            } else {
                                object7 = ReflectionHelper.getAccessor(clazz3, (Field)object5);
                                if (var17_19 == false) {
                                    ReflectionHelper.makeAccessible((AccessibleObject)object7);
                                }
                                if ((serializedName = ((Method)object7).getAnnotation(object6 = SerializedName.class)) != null && (object6 = ((Field)object5).getAnnotation(object6)) == null) {
                                    object3 = ReflectionHelper.getAccessibleObjectDescription((AccessibleObject)object7, false);
                                    object3 = cP.a("@SerializedName on ", (String)object3, " is not supported");
                                    object = new JsonIOException((String)object3);
                                    throw object;
                                }
                                n18 = n10;
                                object8 = object7;
                            }
                        } else {
                            n18 = n10;
                            object8 = null;
                        }
                        if (var17_19 == false && object8 == null) {
                            ReflectionHelper.makeAccessible((AccessibleObject)object5);
                        }
                        object = typeToken2.getType();
                        object7 = ((Field)object5).getGenericType();
                        Type type2 = $Gson$Types.resolve((Type)object, clazz3, (Type)object7);
                        object6 = ((ReflectiveTypeAdapterFactory)object2).getFieldNames((Field)object5);
                        n19 = object6.size();
                        n10 = 0;
                        object = null;
                        while (n10 < n19) {
                            int n20;
                            Object e2;
                            Object object9 = e2 = object6.get(n10);
                            object9 = (String)e2;
                            if (n10 != 0) {
                                n20 = 0;
                                e2 = null;
                            } else {
                                n20 = n8;
                            }
                            TypeToken typeToken3 = TypeToken.get(type2);
                            object3 = this;
                            int n21 = n10;
                            object = gson;
                            object2 = object4;
                            object4 = object5;
                            int n22 = n19;
                            object7 = object8;
                            Object object10 = object6;
                            object6 = object9;
                            field = object5;
                            object5 = typeToken3;
                            n17 = n15;
                            n15 = n20;
                            n16 = n14;
                            n14 = n18;
                            object3 = this.createBoundField(gson, (Field)object4, (Method)object8, (String)object9, typeToken3, n20 != 0, n18 != 0, (boolean)var17_19);
                            object3 = (ReflectiveTypeAdapterFactory$BoundField)((Object)linkedHashMap.put(object9, (ReflectionAccessFilter$FilterResult)((Object)object3)));
                            object4 = object2 == null ? object3 : object2;
                            n10 = n21 + 1;
                            object2 = this;
                            n8 = n20;
                            n15 = n17;
                            n19 = n22;
                            object6 = object10;
                            object5 = field;
                            n14 = n16;
                            bl3 = true;
                        }
                        object2 = object4;
                        field = object5;
                        n17 = n15;
                        n16 = n14;
                        if (object4 != null) break block23;
                    }
                    n15 = n17 + 1;
                    n14 = n16;
                    bl3 = true;
                    object2 = this;
                    continue;
                }
                object = new StringBuilder("Class ");
                object4 = clazz.getName();
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append(" declares multiple JSON fields named '");
                object4 = ((ReflectiveTypeAdapterFactory$BoundField)object2).name;
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append("'; conflict is caused by fields ");
                object4 = ReflectionHelper.fieldToString(((ReflectiveTypeAdapterFactory$BoundField)object2).field);
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append(" and ");
                object4 = ReflectionHelper.fieldToString((Field)object5);
                ((StringBuilder)object).append((String)object4);
                object = ((StringBuilder)object).toString();
                object3 = new IllegalArgumentException((String)object);
                throw object3;
            }
            object3 = typeToken2.getType();
            object = clazz3.getGenericSuperclass();
            object3 = $Gson$Types.resolve((Type)object3, clazz3, object);
            typeToken2 = TypeToken.get((Type)object3);
            clazz3 = typeToken2.getRawType();
            object2 = this;
            n8 = var17_19;
        }
        return linkedHashMap;
    }

    private List getFieldNames(Field object) {
        String[] stringArray = ((Field)object).getAnnotation(SerializedName.class);
        if (stringArray == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName((Field)object));
        }
        object = stringArray.value();
        int n3 = (stringArray = stringArray.alternate()).length;
        if (n3 == 0) {
            return Collections.singletonList(object);
        }
        int n4 = stringArray.length + 1;
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        arrayList.add(object);
        Collections.addAll(arrayList, stringArray);
        return arrayList;
    }

    private boolean includeField(Field field, boolean bl2) {
        boolean bl3;
        Excluder excluder = this.excluder;
        Class<?> clazz = field.getType();
        boolean bl4 = excluder.excludeClass(clazz, bl2);
        if (!bl4 && !(bl3 = (excluder = this.excluder).excludeField(field, bl2))) {
            bl3 = true;
        } else {
            bl3 = false;
            field = null;
        }
        return bl3;
    }

    public TypeAdapter create(Gson object, TypeToken object2) {
        Object object3;
        Object object4 = Object.class;
        Class clazz = ((TypeToken)object2).getRawType();
        boolean bl2 = object4.isAssignableFrom(clazz);
        if (!bl2) {
            return null;
        }
        object4 = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, clazz);
        if (object4 != (object3 = ReflectionAccessFilter$FilterResult.BLOCK_ALL)) {
            boolean bl3;
            object3 = ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
            if (object4 == object3) {
                bl2 = true;
                bl3 = true;
            } else {
                bl2 = false;
                object4 = null;
                bl3 = false;
            }
            bl2 = ReflectionHelper.isRecord(clazz);
            if (bl2) {
                object4 = this;
                object3 = object;
                object = this.getBoundFields((Gson)object, (TypeToken)object2, clazz, bl3, true);
                ReflectiveTypeAdapterFactory$RecordAdapter reflectiveTypeAdapterFactory$RecordAdapter = new ReflectiveTypeAdapterFactory$RecordAdapter(clazz, (Map)object, bl3);
                return reflectiveTypeAdapterFactory$RecordAdapter;
            }
            ObjectConstructor objectConstructor = this.constructorConstructor.get((TypeToken)object2);
            object4 = this;
            object3 = object;
            object = this.getBoundFields((Gson)object, (TypeToken)object2, clazz, bl3, false);
            ReflectiveTypeAdapterFactory$FieldReflectionAdapter reflectiveTypeAdapterFactory$FieldReflectionAdapter = new ReflectiveTypeAdapterFactory$FieldReflectionAdapter(objectConstructor, (Map)object);
            return reflectiveTypeAdapterFactory$FieldReflectionAdapter;
        }
        object2 = new StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
        ((StringBuilder)object2).append(clazz);
        ((StringBuilder)object2).append(". Register a TypeAdapter for this type or adjust the access filter.");
        object2 = ((StringBuilder)object2).toString();
        object = new JsonIOException((String)object2);
        throw object;
    }
}

