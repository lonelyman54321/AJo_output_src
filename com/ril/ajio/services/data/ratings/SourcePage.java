/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

public final class SourcePage
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ SourcePage[] $VALUES;
    public static final /* enum */ SourcePage LP;
    public static final /* enum */ SourcePage ORDER_DETAILS;
    public static final /* enum */ SourcePage ORDER_LISTING;
    public static final /* enum */ SourcePage PDP;
    public static final /* enum */ SourcePage PLP;
    public static final /* enum */ SourcePage WIHSLIST;

    private static final /* synthetic */ SourcePage[] $values() {
        SourcePage sourcePage = ORDER_DETAILS;
        sourcePage = ORDER_LISTING;
        sourcePage = LP;
        sourcePage = PLP;
        sourcePage = PDP;
        sourcePage = WIHSLIST;
        SourcePage[] sourcePageArray = new SourcePage[]{sourcePage, sourcePage, sourcePage, sourcePage, sourcePage, sourcePage};
        return sourcePageArray;
    }

    static {
        Enum[] enumArray = new SourcePage("ORDER_DETAILS", 0);
        ORDER_DETAILS = enumArray;
        enumArray = new SourcePage("ORDER_LISTING", 1);
        ORDER_LISTING = enumArray;
        enumArray = new SourcePage("LP", 2);
        LP = enumArray;
        enumArray = new SourcePage("PLP", 3);
        PLP = enumArray;
        enumArray = new SourcePage("PDP", 4);
        PDP = enumArray;
        enumArray = new SourcePage("WIHSLIST", 5);
        WIHSLIST = enumArray;
        enumArray = SourcePage.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SourcePage() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static SourcePage valueOf(String string2) {
        return Enum.valueOf(SourcePage.class, string2);
    }

    public static SourcePage[] values() {
        return (SourcePage[])$VALUES.clone();
    }
}

