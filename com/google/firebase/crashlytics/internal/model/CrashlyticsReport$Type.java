/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

public final class CrashlyticsReport$Type
extends Enum {
    private static final /* synthetic */ CrashlyticsReport$Type[] $VALUES;
    public static final /* enum */ CrashlyticsReport$Type INCOMPLETE;
    public static final /* enum */ CrashlyticsReport$Type JAVA;
    public static final /* enum */ CrashlyticsReport$Type NATIVE;

    private static /* synthetic */ CrashlyticsReport$Type[] $values() {
        CrashlyticsReport$Type crashlyticsReport$Type = INCOMPLETE;
        crashlyticsReport$Type = JAVA;
        crashlyticsReport$Type = NATIVE;
        CrashlyticsReport$Type[] crashlyticsReport$TypeArray = new CrashlyticsReport$Type[]{crashlyticsReport$Type, crashlyticsReport$Type, crashlyticsReport$Type};
        return crashlyticsReport$TypeArray;
    }

    static {
        CrashlyticsReport$Type crashlyticsReport$Type;
        INCOMPLETE = crashlyticsReport$Type = new CrashlyticsReport$Type("INCOMPLETE", 0);
        JAVA = crashlyticsReport$Type = new CrashlyticsReport$Type("JAVA", 1);
        NATIVE = crashlyticsReport$Type = new CrashlyticsReport$Type("NATIVE", 2);
        $VALUES = CrashlyticsReport$Type.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CrashlyticsReport$Type() {
        void var2_-1;
        void var1_-1;
    }

    public static CrashlyticsReport$Type valueOf(String string2) {
        return Enum.valueOf(CrashlyticsReport$Type.class, string2);
    }

    public static CrashlyticsReport$Type[] values() {
        return (CrashlyticsReport$Type[])$VALUES.clone();
    }
}

