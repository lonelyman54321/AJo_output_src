/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews;

public final class ToolbarIconName
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ToolbarIconName[] $VALUES;
    public static final /* enum */ ToolbarIconName BACK;
    public static final /* enum */ ToolbarIconName CLOSE;
    public static final /* enum */ ToolbarIconName HAMBURGER;

    private static final /* synthetic */ ToolbarIconName[] $values() {
        ToolbarIconName toolbarIconName = BACK;
        toolbarIconName = CLOSE;
        toolbarIconName = HAMBURGER;
        ToolbarIconName[] toolbarIconNameArray = new ToolbarIconName[]{toolbarIconName, toolbarIconName, toolbarIconName};
        return toolbarIconNameArray;
    }

    static {
        Enum[] enumArray = new ToolbarIconName("BACK", 0, "back");
        BACK = enumArray;
        enumArray = new ToolbarIconName("CLOSE", 1, "close");
        CLOSE = enumArray;
        enumArray = new ToolbarIconName("HAMBURGER", 2, "hamburger");
        HAMBURGER = enumArray;
        enumArray = ToolbarIconName.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ToolbarIconName() {
        void var2_1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ToolbarIconName valueOf(String string2) {
        return Enum.valueOf(ToolbarIconName.class, string2);
    }

    public static ToolbarIconName[] values() {
        return (ToolbarIconName[])$VALUES.clone();
    }
}

