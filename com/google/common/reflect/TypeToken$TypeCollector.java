/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.reflect.TypeToken$1;
import com.google.common.reflect.TypeToken$TypeCollector$1;
import com.google.common.reflect.TypeToken$TypeCollector$2;
import com.google.common.reflect.TypeToken$TypeCollector$3;
import com.google.common.reflect.TypeToken$TypeCollector$4;
import java.lang.constant.Constable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

abstract class TypeToken$TypeCollector {
    static final TypeToken$TypeCollector FOR_GENERIC_TYPE;
    static final TypeToken$TypeCollector FOR_RAW_TYPE;

    static {
        TypeToken$TypeCollector typeToken$TypeCollector = new TypeToken$TypeCollector$1();
        FOR_GENERIC_TYPE = typeToken$TypeCollector;
        typeToken$TypeCollector = new TypeToken$TypeCollector$2();
        FOR_RAW_TYPE = typeToken$TypeCollector;
    }

    private TypeToken$TypeCollector() {
    }

    public /* synthetic */ TypeToken$TypeCollector(TypeToken.1 var1_1) {
        this();
    }

    private int collectTypes(Object object, Map map2) {
        int n3;
        int n4;
        int n7;
        Constable constable = (Integer)map2.get(object);
        if (constable != null) {
            return (Integer)constable;
        }
        constable = this.getRawType(object);
        boolean n42 = ((Class)constable).isInterface();
        Object object2 = this.getInterfaces(object).iterator();
        while ((n7 = object2.hasNext()) != 0) {
            Object t3 = object2.next();
            n7 = this.collectTypes(t3, map2);
            n4 = Math.max(n4, n7);
        }
        object2 = this.getSuperclass(object);
        if (object2 != null) {
            int n8 = this.collectTypes(object2, map2);
            n3 = Math.max(n4, n8);
        }
        void var4_7 = n3 + true;
        object2 = (int)var4_7;
        map2.put(object, object2);
        return (int)var4_7;
    }

    private static ImmutableList sortKeysByValue(Map object, Comparator comparator) {
        TypeToken$TypeCollector$4 typeToken$TypeCollector$4 = new TypeToken$TypeCollector$4(comparator, (Map)object);
        object = object.keySet();
        return typeToken$TypeCollector$4.immutableSortedCopy((Iterable)object);
    }

    public final TypeToken$TypeCollector classesOnly() {
        TypeToken$TypeCollector$3 typeToken$TypeCollector$3 = new TypeToken$TypeCollector$3(this, this);
        return typeToken$TypeCollector$3;
    }

    public ImmutableList collectTypes(Iterable object) {
        boolean bl2;
        HashMap hashMap = Maps.newHashMap();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            this.collectTypes(e2, hashMap);
        }
        object = Ordering.natural().reverse();
        return TypeToken$TypeCollector.sortKeysByValue(hashMap, (Comparator)object);
    }

    public final ImmutableList collectTypes(Object object) {
        object = ImmutableList.of(object);
        return this.collectTypes((Iterable)object);
    }

    public abstract Iterable getInterfaces(Object var1);

    public abstract Class getRawType(Object var1);

    public abstract Object getSuperclass(Object var1);
}

