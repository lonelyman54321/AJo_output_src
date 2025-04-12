/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

public final class ScreenType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ScreenType[] $VALUES;
    public static final /* enum */ ScreenType SCREEN_HOME;
    public static final /* enum */ ScreenType SCREEN_PDP;
    public static final /* enum */ ScreenType SCREEN_PLP;
    public static final /* enum */ ScreenType SCREEN_UNKNOWN;
    public static final /* enum */ ScreenType SCREEN_WISHLIST;
    private final String screenName;

    private static final /* synthetic */ ScreenType[] $values() {
        ScreenType screenType = SCREEN_HOME;
        screenType = SCREEN_PLP;
        screenType = SCREEN_PDP;
        screenType = SCREEN_WISHLIST;
        screenType = SCREEN_UNKNOWN;
        ScreenType[] screenTypeArray = new ScreenType[]{screenType, screenType, screenType, screenType, screenType};
        return screenTypeArray;
    }

    static {
        Enum[] enumArray = new ScreenType("SCREEN_HOME", 0, "cms");
        SCREEN_HOME = enumArray;
        enumArray = new ScreenType("SCREEN_PLP", 1, "plp");
        SCREEN_PLP = enumArray;
        enumArray = new ScreenType("SCREEN_PDP", 2, "pdp");
        SCREEN_PDP = enumArray;
        enumArray = new ScreenType("SCREEN_WISHLIST", 3, "wishlist");
        SCREEN_WISHLIST = enumArray;
        enumArray = new ScreenType("SCREEN_UNKNOWN", 4, "");
        SCREEN_UNKNOWN = enumArray;
        enumArray = ScreenType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ScreenType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.screenName = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ScreenType valueOf(String string2) {
        return Enum.valueOf(ScreenType.class, string2);
    }

    public static ScreenType[] values() {
        return (ScreenType[])$VALUES.clone();
    }

    public final String getScreenName() {
        return this.screenName;
    }
}

