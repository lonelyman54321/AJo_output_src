/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

public final class HomeWidgetTypes
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ HomeWidgetTypes[] $VALUES;
    public static final /* enum */ HomeWidgetTypes HOME_WIDGET_TYPE_EXPLORE_ALL;
    public static final /* enum */ HomeWidgetTypes HOME_WIDGET_TYPE_EXPLORE_ALL_PRODUCT;
    public static final /* enum */ HomeWidgetTypes HOME_WIDGET_TYPE_HIDE;
    public static final /* enum */ HomeWidgetTypes HOME_WIDGET_TYPE_PRODUCT;
    public static final /* enum */ HomeWidgetTypes HOME_WIDGET_TYPE_SHIMMER;
    private final int type;

    private static final /* synthetic */ HomeWidgetTypes[] $values() {
        HomeWidgetTypes homeWidgetTypes = HOME_WIDGET_TYPE_SHIMMER;
        homeWidgetTypes = HOME_WIDGET_TYPE_PRODUCT;
        homeWidgetTypes = HOME_WIDGET_TYPE_HIDE;
        homeWidgetTypes = HOME_WIDGET_TYPE_EXPLORE_ALL;
        homeWidgetTypes = HOME_WIDGET_TYPE_EXPLORE_ALL_PRODUCT;
        HomeWidgetTypes[] homeWidgetTypesArray = new HomeWidgetTypes[]{homeWidgetTypes, homeWidgetTypes, homeWidgetTypes, homeWidgetTypes, homeWidgetTypes};
        return homeWidgetTypesArray;
    }

    static {
        Enum[] enumArray = new HomeWidgetTypes("HOME_WIDGET_TYPE_SHIMMER", 0, 0);
        HOME_WIDGET_TYPE_SHIMMER = enumArray;
        int n3 = 1;
        enumArray = new HomeWidgetTypes("HOME_WIDGET_TYPE_PRODUCT", n3, n3);
        HOME_WIDGET_TYPE_PRODUCT = enumArray;
        n3 = 2;
        enumArray = new HomeWidgetTypes("HOME_WIDGET_TYPE_HIDE", n3, n3);
        HOME_WIDGET_TYPE_HIDE = enumArray;
        n3 = 3;
        enumArray = new HomeWidgetTypes("HOME_WIDGET_TYPE_EXPLORE_ALL", n3, n3);
        HOME_WIDGET_TYPE_EXPLORE_ALL = enumArray;
        n3 = 4;
        enumArray = new HomeWidgetTypes("HOME_WIDGET_TYPE_EXPLORE_ALL_PRODUCT", n3, n3);
        HOME_WIDGET_TYPE_EXPLORE_ALL_PRODUCT = enumArray;
        enumArray = HomeWidgetTypes.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HomeWidgetTypes() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static HomeWidgetTypes valueOf(String string2) {
        return Enum.valueOf(HomeWidgetTypes.class, string2);
    }

    public static HomeWidgetTypes[] values() {
        return (HomeWidgetTypes[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

