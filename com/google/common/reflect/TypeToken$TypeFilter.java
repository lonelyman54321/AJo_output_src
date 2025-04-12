/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Predicate;
import com.google.common.reflect.TypeToken$1;
import com.google.common.reflect.TypeToken$TypeFilter$1;
import com.google.common.reflect.TypeToken$TypeFilter$2;

abstract class TypeToken$TypeFilter
extends Enum
implements Predicate {
    private static final /* synthetic */ TypeToken$TypeFilter[] $VALUES;
    public static final /* enum */ TypeToken$TypeFilter IGNORE_TYPE_VARIABLE_OR_WILDCARD;
    public static final /* enum */ TypeToken$TypeFilter INTERFACE_ONLY;

    private static /* synthetic */ TypeToken$TypeFilter[] $values() {
        TypeToken$TypeFilter typeToken$TypeFilter = IGNORE_TYPE_VARIABLE_OR_WILDCARD;
        typeToken$TypeFilter = INTERFACE_ONLY;
        TypeToken$TypeFilter[] typeToken$TypeFilterArray = new TypeToken$TypeFilter[]{typeToken$TypeFilter, typeToken$TypeFilter};
        return typeToken$TypeFilterArray;
    }

    static {
        TypeToken$TypeFilter typeToken$TypeFilter = new TypeToken$TypeFilter$1();
        IGNORE_TYPE_VARIABLE_OR_WILDCARD = typeToken$TypeFilter;
        typeToken$TypeFilter = new TypeToken$TypeFilter$2();
        INTERFACE_ONLY = typeToken$TypeFilter;
        $VALUES = TypeToken$TypeFilter.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TypeToken$TypeFilter() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ TypeToken$TypeFilter(TypeToken$1 typeToken$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static TypeToken$TypeFilter valueOf(String string2) {
        return Enum.valueOf(TypeToken$TypeFilter.class, string2);
    }

    public static TypeToken$TypeFilter[] values() {
        return (TypeToken$TypeFilter[])$VALUES.clone();
    }
}

