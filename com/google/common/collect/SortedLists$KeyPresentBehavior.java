/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.SortedLists$1;
import com.google.common.collect.SortedLists$KeyPresentBehavior$1;
import com.google.common.collect.SortedLists$KeyPresentBehavior$2;
import com.google.common.collect.SortedLists$KeyPresentBehavior$3;
import com.google.common.collect.SortedLists$KeyPresentBehavior$4;
import com.google.common.collect.SortedLists$KeyPresentBehavior$5;
import java.util.Comparator;
import java.util.List;

abstract class SortedLists$KeyPresentBehavior
extends Enum {
    private static final /* synthetic */ SortedLists$KeyPresentBehavior[] $VALUES;
    public static final /* enum */ SortedLists$KeyPresentBehavior ANY_PRESENT;
    public static final /* enum */ SortedLists$KeyPresentBehavior FIRST_AFTER;
    public static final /* enum */ SortedLists$KeyPresentBehavior FIRST_PRESENT;
    public static final /* enum */ SortedLists$KeyPresentBehavior LAST_BEFORE;
    public static final /* enum */ SortedLists$KeyPresentBehavior LAST_PRESENT;

    private static /* synthetic */ SortedLists$KeyPresentBehavior[] $values() {
        SortedLists$KeyPresentBehavior sortedLists$KeyPresentBehavior = ANY_PRESENT;
        sortedLists$KeyPresentBehavior = LAST_PRESENT;
        sortedLists$KeyPresentBehavior = FIRST_PRESENT;
        sortedLists$KeyPresentBehavior = FIRST_AFTER;
        sortedLists$KeyPresentBehavior = LAST_BEFORE;
        SortedLists$KeyPresentBehavior[] sortedLists$KeyPresentBehaviorArray = new SortedLists$KeyPresentBehavior[]{sortedLists$KeyPresentBehavior, sortedLists$KeyPresentBehavior, sortedLists$KeyPresentBehavior, sortedLists$KeyPresentBehavior, sortedLists$KeyPresentBehavior};
        return sortedLists$KeyPresentBehaviorArray;
    }

    static {
        SortedLists$KeyPresentBehavior sortedLists$KeyPresentBehavior = new SortedLists$KeyPresentBehavior$1();
        ANY_PRESENT = sortedLists$KeyPresentBehavior;
        sortedLists$KeyPresentBehavior = new SortedLists$KeyPresentBehavior$2();
        LAST_PRESENT = sortedLists$KeyPresentBehavior;
        sortedLists$KeyPresentBehavior = new SortedLists$KeyPresentBehavior$3();
        FIRST_PRESENT = sortedLists$KeyPresentBehavior;
        sortedLists$KeyPresentBehavior = new SortedLists$KeyPresentBehavior$4();
        FIRST_AFTER = sortedLists$KeyPresentBehavior;
        sortedLists$KeyPresentBehavior = new SortedLists$KeyPresentBehavior$5();
        LAST_BEFORE = sortedLists$KeyPresentBehavior;
        $VALUES = SortedLists$KeyPresentBehavior.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SortedLists$KeyPresentBehavior() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SortedLists$KeyPresentBehavior(SortedLists$1 sortedLists$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static SortedLists$KeyPresentBehavior valueOf(String string2) {
        return Enum.valueOf(SortedLists$KeyPresentBehavior.class, string2);
    }

    public static SortedLists$KeyPresentBehavior[] values() {
        return (SortedLists$KeyPresentBehavior[])$VALUES.clone();
    }

    public abstract int resultIndex(Comparator var1, Object var2, List var3, int var4);
}

