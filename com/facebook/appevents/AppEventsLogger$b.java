/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

public final class AppEventsLogger$b
extends Enum {
    private static final /* synthetic */ AppEventsLogger$b[] $VALUES;
    public static final /* enum */ AppEventsLogger$b AUTO;
    public static final /* enum */ AppEventsLogger$b EXPLICIT_ONLY;

    private static final /* synthetic */ AppEventsLogger$b[] $values() {
        AppEventsLogger$b appEventsLogger$b = AUTO;
        appEventsLogger$b = EXPLICIT_ONLY;
        AppEventsLogger$b[] appEventsLogger$bArray = new AppEventsLogger$b[]{appEventsLogger$b, appEventsLogger$b};
        return appEventsLogger$bArray;
    }

    static {
        AppEventsLogger$b appEventsLogger$b;
        AUTO = appEventsLogger$b = new AppEventsLogger$b("AUTO", 0);
        EXPLICIT_ONLY = appEventsLogger$b = new AppEventsLogger$b("EXPLICIT_ONLY", 1);
        $VALUES = AppEventsLogger$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AppEventsLogger$b() {
        void var2_-1;
        void var1_-1;
    }

    public static AppEventsLogger$b valueOf(String string2) {
        return Enum.valueOf(AppEventsLogger$b.class, string2);
    }

    public static AppEventsLogger$b[] values() {
        return (AppEventsLogger$b[])$VALUES.clone();
    }
}

