/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.reflect.TypeCapture;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$1;
import com.google.common.reflect.Types$JavaVersion$1;
import com.google.common.reflect.Types$JavaVersion$2;
import com.google.common.reflect.Types$JavaVersion$3;
import com.google.common.reflect.Types$JavaVersion$4;
import com.google.common.reflect.Types$JavaVersion$5;
import com.google.common.reflect.Types$JavaVersion$6;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

abstract class Types$JavaVersion
extends Enum {
    private static final /* synthetic */ Types$JavaVersion[] $VALUES;
    static final Types$JavaVersion CURRENT;
    public static final /* enum */ Types$JavaVersion JAVA6;
    public static final /* enum */ Types$JavaVersion JAVA7;
    public static final /* enum */ Types$JavaVersion JAVA8;
    public static final /* enum */ Types$JavaVersion JAVA9;

    private static /* synthetic */ Types$JavaVersion[] $values() {
        Types$JavaVersion types$JavaVersion = JAVA6;
        types$JavaVersion = JAVA7;
        types$JavaVersion = JAVA8;
        types$JavaVersion = JAVA9;
        Types$JavaVersion[] types$JavaVersionArray = new Types$JavaVersion[]{types$JavaVersion, types$JavaVersion, types$JavaVersion, types$JavaVersion};
        return types$JavaVersionArray;
    }

    static {
        boolean bl2 = false;
        Object object = new Types$JavaVersion$1();
        JAVA6 = object;
        int n3 = 1;
        Object object2 = new Types$JavaVersion$2();
        JAVA7 = object2;
        Object object3 = new Types$JavaVersion$3();
        JAVA8 = object3;
        int n4 = 3;
        Types$JavaVersion$4 types$JavaVersion$4 = new Types$JavaVersion$4();
        JAVA9 = types$JavaVersion$4;
        $VALUES = Types$JavaVersion.$values();
        Class<AnnotatedElement> clazz = AnnotatedElement.class;
        Class<TypeVariable> clazz2 = TypeVariable.class;
        boolean bl3 = clazz.isAssignableFrom(clazz2);
        if (bl3) {
            object = new Types$JavaVersion$5();
            boolean bl4 = ((String)(object = ((TypeCapture)object).capture().toString())).contains((CharSequence)(object2 = "java.util.Map.java.util.Map"));
            CURRENT = bl4 ? object3 : types$JavaVersion$4;
        } else {
            object3 = new Types$JavaVersion$6();
            bl2 = (object3 = ((TypeCapture)object3).capture()) instanceof Class;
            CURRENT = bl2 ? object2 : object;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Types$JavaVersion() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ Types$JavaVersion(Types$1 types$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static Types$JavaVersion valueOf(String string2) {
        return Enum.valueOf(Types$JavaVersion.class, string2);
    }

    public static Types$JavaVersion[] values() {
        return (Types$JavaVersion[])$VALUES.clone();
    }

    public boolean jdkTypeDuplicatesOwnerName() {
        return true;
    }

    public abstract Type newArrayType(Type var1);

    public String typeName(Type type2) {
        return Types.toString(type2);
    }

    public final ImmutableList usedInGenericType(Type[] typeArray) {
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        for (Type type2 : typeArray) {
            type2 = this.usedInGenericType(type2);
            immutableList$Builder.add(type2);
        }
        return immutableList$Builder.build();
    }

    public abstract Type usedInGenericType(Type var1);
}

