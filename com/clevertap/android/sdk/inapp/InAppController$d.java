/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inapp;

public final class InAppController$d
extends Enum {
    private static final /* synthetic */ InAppController$d[] $VALUES;
    public static final /* enum */ InAppController$d DISCARDED;
    public static final /* enum */ InAppController$d RESUMED;
    public static final /* enum */ InAppController$d SUSPENDED;
    final int state;

    private static /* synthetic */ InAppController$d[] $values() {
        InAppController$d inAppController$d = DISCARDED;
        inAppController$d = SUSPENDED;
        inAppController$d = RESUMED;
        InAppController$d[] inAppController$dArray = new InAppController$d[]{inAppController$d, inAppController$d, inAppController$d};
        return inAppController$dArray;
    }

    static {
        InAppController$d inAppController$d;
        DISCARDED = inAppController$d = new InAppController$d("DISCARDED", 0, -1);
        int n3 = 1;
        SUSPENDED = inAppController$d = new InAppController$d("SUSPENDED", n3, 0);
        RESUMED = inAppController$d = new InAppController$d("RESUMED", 2, n3);
        $VALUES = InAppController$d.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private InAppController$d() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.state = var3_2;
    }

    public static InAppController$d valueOf(String string2) {
        return Enum.valueOf(InAppController$d.class, string2);
    }

    public static InAppController$d[] values() {
        return (InAppController$d[])$VALUES.clone();
    }

    public int intValue() {
        return this.state;
    }
}

