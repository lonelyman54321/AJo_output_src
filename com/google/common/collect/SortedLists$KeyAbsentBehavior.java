/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.SortedLists$1;
import com.google.common.collect.SortedLists$KeyAbsentBehavior$1;
import com.google.common.collect.SortedLists$KeyAbsentBehavior$2;
import com.google.common.collect.SortedLists$KeyAbsentBehavior$3;

abstract class SortedLists$KeyAbsentBehavior
extends Enum {
    private static final /* synthetic */ SortedLists$KeyAbsentBehavior[] $VALUES;
    public static final /* enum */ SortedLists$KeyAbsentBehavior INVERTED_INSERTION_INDEX;
    public static final /* enum */ SortedLists$KeyAbsentBehavior NEXT_HIGHER;
    public static final /* enum */ SortedLists$KeyAbsentBehavior NEXT_LOWER;

    private static /* synthetic */ SortedLists$KeyAbsentBehavior[] $values() {
        SortedLists$KeyAbsentBehavior sortedLists$KeyAbsentBehavior = NEXT_LOWER;
        sortedLists$KeyAbsentBehavior = NEXT_HIGHER;
        sortedLists$KeyAbsentBehavior = INVERTED_INSERTION_INDEX;
        SortedLists$KeyAbsentBehavior[] sortedLists$KeyAbsentBehaviorArray = new SortedLists$KeyAbsentBehavior[]{sortedLists$KeyAbsentBehavior, sortedLists$KeyAbsentBehavior, sortedLists$KeyAbsentBehavior};
        return sortedLists$KeyAbsentBehaviorArray;
    }

    static {
        SortedLists$KeyAbsentBehavior sortedLists$KeyAbsentBehavior = new SortedLists$KeyAbsentBehavior$1();
        NEXT_LOWER = sortedLists$KeyAbsentBehavior;
        sortedLists$KeyAbsentBehavior = new SortedLists$KeyAbsentBehavior$2();
        NEXT_HIGHER = sortedLists$KeyAbsentBehavior;
        sortedLists$KeyAbsentBehavior = new SortedLists$KeyAbsentBehavior$3();
        INVERTED_INSERTION_INDEX = sortedLists$KeyAbsentBehavior;
        $VALUES = SortedLists$KeyAbsentBehavior.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SortedLists$KeyAbsentBehavior() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SortedLists$KeyAbsentBehavior(SortedLists$1 sortedLists$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static SortedLists$KeyAbsentBehavior valueOf(String string2) {
        return Enum.valueOf(SortedLists$KeyAbsentBehavior.class, string2);
    }

    public static SortedLists$KeyAbsentBehavior[] values() {
        return (SortedLists$KeyAbsentBehavior[])$VALUES.clone();
    }

    public abstract int resultIndex(int var1);
}

