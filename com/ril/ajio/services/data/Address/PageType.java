/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Address;

public final class PageType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ PageType[] $VALUES;
    public static final /* enum */ PageType HOME;
    public static final /* enum */ PageType NONE;

    private static final /* synthetic */ PageType[] $values() {
        PageType pageType = HOME;
        pageType = NONE;
        PageType[] pageTypeArray = new PageType[]{pageType, pageType};
        return pageTypeArray;
    }

    static {
        Enum[] enumArray = new PageType("HOME", 0);
        HOME = enumArray;
        enumArray = new PageType("NONE", 1);
        NONE = enumArray;
        enumArray = PageType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PageType() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static PageType valueOf(String string2) {
        return Enum.valueOf(PageType.class, string2);
    }

    public static PageType[] values() {
        return (PageType[])$VALUES.clone();
    }
}

