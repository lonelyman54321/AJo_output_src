/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

public final class Priority
extends Enum {
    private static final /* synthetic */ Priority[] $VALUES;
    public static final /* enum */ Priority DEFAULT;
    public static final /* enum */ Priority HIGHEST;
    public static final /* enum */ Priority VERY_LOW;

    static {
        Priority priority;
        Priority priority2;
        Priority priority3;
        DEFAULT = priority3 = new Priority("DEFAULT", 0);
        int n3 = 1;
        VERY_LOW = priority2 = new Priority("VERY_LOW", n3);
        int n4 = 2;
        HIGHEST = priority = new Priority("HIGHEST", n4);
        Priority[] priorityArray = new Priority[3];
        priorityArray[0] = priority3;
        priorityArray[n3] = priority2;
        priorityArray[n4] = priority;
        $VALUES = priorityArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Priority() {
        void var2_-1;
        void var1_-1;
    }

    public static Priority valueOf(String string2) {
        return Enum.valueOf(Priority.class, string2);
    }

    public static Priority[] values() {
        return (Priority[])$VALUES.clone();
    }
}

