/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.predefined;

import com.affise.attribution.events.predefined.TouchType$Companion;

public final class TouchType
extends Enum {
    private static final /* synthetic */ TouchType[] $VALUES;
    public static final /* enum */ TouchType CLICK;
    public static final TouchType$Companion Companion;
    public static final /* enum */ TouchType IMPRESSION;
    public static final /* enum */ TouchType WEB_TO_APP_AUTO_REDIRECT;
    private final String type;

    private static final /* synthetic */ TouchType[] $values() {
        TouchType touchType = CLICK;
        touchType = WEB_TO_APP_AUTO_REDIRECT;
        touchType = IMPRESSION;
        TouchType[] touchTypeArray = new TouchType[]{touchType, touchType, touchType};
        return touchTypeArray;
    }

    static {
        Object object;
        String string2 = "CLICK";
        CLICK = object = new TouchType(string2, 0, string2);
        string2 = "WEB_TO_APP_AUTO_REDIRECT";
        WEB_TO_APP_AUTO_REDIRECT = object = new TouchType(string2, 1, string2);
        string2 = "IMPRESSION";
        IMPRESSION = object = new TouchType(string2, 2, string2);
        $VALUES = TouchType.$values();
        object = new TouchType$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TouchType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static final /* synthetic */ String access$getType$p(TouchType touchType) {
        return touchType.type;
    }

    public static final TouchType from(String string2) {
        return Companion.from(string2);
    }

    public static TouchType valueOf(String string2) {
        return Enum.valueOf(TouchType.class, string2);
    }

    public static TouchType[] values() {
        return (TouchType[])$VALUES.clone();
    }
}

