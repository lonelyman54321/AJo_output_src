/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.options;

public final class CuratedLayoutType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ CuratedLayoutType[] $VALUES;
    public static final /* enum */ CuratedLayoutType HOME_WIDGET_TYPE_CURATED;
    public static final /* enum */ CuratedLayoutType HOME_WIDGET_TYPE_HIDE;
    public static final /* enum */ CuratedLayoutType HOME_WIDGET_TYPE_SHIMMER;
    private final int type;

    private static final /* synthetic */ CuratedLayoutType[] $values() {
        CuratedLayoutType curatedLayoutType = HOME_WIDGET_TYPE_SHIMMER;
        curatedLayoutType = HOME_WIDGET_TYPE_CURATED;
        curatedLayoutType = HOME_WIDGET_TYPE_HIDE;
        CuratedLayoutType[] curatedLayoutTypeArray = new CuratedLayoutType[]{curatedLayoutType, curatedLayoutType, curatedLayoutType};
        return curatedLayoutTypeArray;
    }

    static {
        Enum[] enumArray = new CuratedLayoutType("HOME_WIDGET_TYPE_SHIMMER", 0, 0);
        HOME_WIDGET_TYPE_SHIMMER = enumArray;
        int n3 = 1;
        enumArray = new CuratedLayoutType("HOME_WIDGET_TYPE_CURATED", n3, n3);
        HOME_WIDGET_TYPE_CURATED = enumArray;
        n3 = 2;
        enumArray = new CuratedLayoutType("HOME_WIDGET_TYPE_HIDE", n3, n3);
        HOME_WIDGET_TYPE_HIDE = enumArray;
        enumArray = CuratedLayoutType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CuratedLayoutType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static CuratedLayoutType valueOf(String string2) {
        return Enum.valueOf(CuratedLayoutType.class, string2);
    }

    public static CuratedLayoutType[] values() {
        return (CuratedLayoutType[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

