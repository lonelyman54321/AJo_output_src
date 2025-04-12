/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

public final class a$a
extends Enum {
    private static final /* synthetic */ a$a[] $VALUES;
    public static final /* enum */ a$a FAILED;
    public static final /* enum */ a$a READY_TO_RUN;
    public static final /* enum */ a$a RUNNING;
    public static final /* enum */ a$a SUCCESS;

    private static /* synthetic */ a$a[] $values() {
        a$a a$a = FAILED;
        a$a = SUCCESS;
        a$a = READY_TO_RUN;
        a$a = RUNNING;
        a$a[] a$aArray = new a$a[]{a$a, a$a, a$a, a$a};
        return a$aArray;
    }

    static {
        a$a a$a;
        FAILED = a$a = new a$a("FAILED", 0);
        SUCCESS = a$a = new a$a("SUCCESS", 1);
        READY_TO_RUN = a$a = new a$a("READY_TO_RUN", 2);
        RUNNING = a$a = new a$a("RUNNING", 3);
        $VALUES = a$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a$a() {
        void var2_-1;
        void var1_-1;
    }

    public static a$a valueOf(String string2) {
        return Enum.valueOf(a$a.class, string2);
    }

    public static a$a[] values() {
        return (a$a[])$VALUES.clone();
    }
}

