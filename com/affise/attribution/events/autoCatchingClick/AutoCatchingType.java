/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.autoCatchingClick;

import com.affise.attribution.events.autoCatchingClick.AutoCatchingType$Companion;

public final class AutoCatchingType
extends Enum {
    private static final /* synthetic */ AutoCatchingType[] $VALUES;
    public static final /* enum */ AutoCatchingType BUTTON;
    public static final AutoCatchingType$Companion Companion;
    public static final /* enum */ AutoCatchingType GROUP;
    public static final /* enum */ AutoCatchingType IMAGE;
    public static final /* enum */ AutoCatchingType IMAGE_BUTTON;
    public static final /* enum */ AutoCatchingType TEXT;
    private final String type;

    private static final /* synthetic */ AutoCatchingType[] $values() {
        AutoCatchingType autoCatchingType = BUTTON;
        autoCatchingType = TEXT;
        autoCatchingType = IMAGE_BUTTON;
        autoCatchingType = IMAGE;
        autoCatchingType = GROUP;
        AutoCatchingType[] autoCatchingTypeArray = new AutoCatchingType[]{autoCatchingType, autoCatchingType, autoCatchingType, autoCatchingType, autoCatchingType};
        return autoCatchingTypeArray;
    }

    static {
        Object object;
        String string2 = "BUTTON";
        BUTTON = object = new AutoCatchingType(string2, 0, string2);
        string2 = "TEXT";
        TEXT = object = new AutoCatchingType(string2, 1, string2);
        string2 = "IMAGE_BUTTON";
        IMAGE_BUTTON = object = new AutoCatchingType(string2, 2, string2);
        string2 = "IMAGE";
        IMAGE = object = new AutoCatchingType(string2, 3, string2);
        string2 = "GROUP";
        GROUP = object = new AutoCatchingType(string2, 4, string2);
        $VALUES = AutoCatchingType.$values();
        object = new AutoCatchingType$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AutoCatchingType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static final /* synthetic */ String access$getType$p(AutoCatchingType autoCatchingType) {
        return autoCatchingType.type;
    }

    public static AutoCatchingType valueOf(String string2) {
        return Enum.valueOf(AutoCatchingType.class, string2);
    }

    public static AutoCatchingType[] values() {
        return (AutoCatchingType[])$VALUES.clone();
    }
}

