/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates$1;
import com.google.common.base.Predicates$ObjectPredicate$1;
import com.google.common.base.Predicates$ObjectPredicate$2;
import com.google.common.base.Predicates$ObjectPredicate$3;
import com.google.common.base.Predicates$ObjectPredicate$4;

abstract class Predicates$ObjectPredicate
extends Enum
implements Predicate {
    private static final /* synthetic */ Predicates$ObjectPredicate[] $VALUES;
    public static final /* enum */ Predicates$ObjectPredicate ALWAYS_FALSE;
    public static final /* enum */ Predicates$ObjectPredicate ALWAYS_TRUE;
    public static final /* enum */ Predicates$ObjectPredicate IS_NULL;
    public static final /* enum */ Predicates$ObjectPredicate NOT_NULL;

    private static /* synthetic */ Predicates$ObjectPredicate[] $values() {
        Predicates$ObjectPredicate predicates$ObjectPredicate = ALWAYS_TRUE;
        predicates$ObjectPredicate = ALWAYS_FALSE;
        predicates$ObjectPredicate = IS_NULL;
        predicates$ObjectPredicate = NOT_NULL;
        Predicates$ObjectPredicate[] predicates$ObjectPredicateArray = new Predicates$ObjectPredicate[]{predicates$ObjectPredicate, predicates$ObjectPredicate, predicates$ObjectPredicate, predicates$ObjectPredicate};
        return predicates$ObjectPredicateArray;
    }

    static {
        Predicates$ObjectPredicate predicates$ObjectPredicate = new Predicates$ObjectPredicate$1();
        ALWAYS_TRUE = predicates$ObjectPredicate;
        predicates$ObjectPredicate = new Predicates$ObjectPredicate$2();
        ALWAYS_FALSE = predicates$ObjectPredicate;
        predicates$ObjectPredicate = new Predicates$ObjectPredicate$3();
        IS_NULL = predicates$ObjectPredicate;
        predicates$ObjectPredicate = new Predicates$ObjectPredicate$4();
        NOT_NULL = predicates$ObjectPredicate;
        $VALUES = Predicates$ObjectPredicate.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Predicates$ObjectPredicate() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ Predicates$ObjectPredicate(Predicates$1 predicates$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static Predicates$ObjectPredicate valueOf(String string2) {
        return Enum.valueOf(Predicates$ObjectPredicate.class, string2);
    }

    public static Predicates$ObjectPredicate[] values() {
        return (Predicates$ObjectPredicate[])$VALUES.clone();
    }

    public Predicate withNarrowedType() {
        return this;
    }
}

