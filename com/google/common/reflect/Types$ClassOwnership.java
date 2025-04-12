/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.reflect.Types$1;
import com.google.common.reflect.Types$ClassOwnership$1;
import com.google.common.reflect.Types$ClassOwnership$1LocalClass;
import com.google.common.reflect.Types$ClassOwnership$2;
import com.google.common.reflect.Types$ClassOwnership$3;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

abstract class Types$ClassOwnership
extends Enum {
    private static final /* synthetic */ Types$ClassOwnership[] $VALUES;
    static final Types$ClassOwnership JVM_BEHAVIOR;
    public static final /* enum */ Types$ClassOwnership LOCAL_CLASS_HAS_NO_OWNER;
    public static final /* enum */ Types$ClassOwnership OWNED_BY_ENCLOSING_CLASS;

    private static /* synthetic */ Types$ClassOwnership[] $values() {
        Types$ClassOwnership types$ClassOwnership = OWNED_BY_ENCLOSING_CLASS;
        types$ClassOwnership = LOCAL_CLASS_HAS_NO_OWNER;
        Types$ClassOwnership[] types$ClassOwnershipArray = new Types$ClassOwnership[]{types$ClassOwnership, types$ClassOwnership};
        return types$ClassOwnershipArray;
    }

    static {
        Types$ClassOwnership types$ClassOwnership = new Types$ClassOwnership$1();
        OWNED_BY_ENCLOSING_CLASS = types$ClassOwnership;
        types$ClassOwnership = new Types$ClassOwnership$2();
        LOCAL_CLASS_HAS_NO_OWNER = types$ClassOwnership;
        $VALUES = Types$ClassOwnership.$values();
        JVM_BEHAVIOR = Types$ClassOwnership.detectJvmBehavior();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Types$ClassOwnership() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ Types$ClassOwnership(Types.1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    private static Types$ClassOwnership detectJvmBehavior() {
        new Types$ClassOwnership$3();
        Object object = (ParameterizedType)Types$ClassOwnership$3.class.getGenericSuperclass();
        Objects.requireNonNull(object);
        for (Types$ClassOwnership types$ClassOwnership : Types$ClassOwnership.values()) {
            Type type2;
            Class clazz = types$ClassOwnership.getOwnerType(Types$ClassOwnership$1LocalClass.class);
            if (clazz != (type2 = object.getOwnerType())) continue;
            return types$ClassOwnership;
        }
        object = new AssertionError();
        throw object;
    }

    public static Types$ClassOwnership valueOf(String string2) {
        return Enum.valueOf(Types$ClassOwnership.class, string2);
    }

    public static Types$ClassOwnership[] values() {
        return (Types$ClassOwnership[])$VALUES.clone();
    }

    public abstract Class getOwnerType(Class var1);
}

