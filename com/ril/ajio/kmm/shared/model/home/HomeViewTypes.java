/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

public final class HomeViewTypes
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ HomeViewTypes[] $VALUES;
    public static final /* enum */ HomeViewTypes ROW_TYPE_APP_UPDATE;
    public static final /* enum */ HomeViewTypes ROW_TYPE_CAROUSEL;
    public static final /* enum */ HomeViewTypes ROW_TYPE_CLOSET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_CURATED_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_DYNAMIC_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_FLOATING_COMPONENT;
    public static final /* enum */ HomeViewTypes ROW_TYPE_FULL_IMAGE;
    public static final /* enum */ HomeViewTypes ROW_TYPE_HLIST;
    public static final /* enum */ HomeViewTypes ROW_TYPE_IMAGE_SEARCH_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_LUXE_BOTTOM_LINKS;
    public static final /* enum */ HomeViewTypes ROW_TYPE_LUXE_BOTTOM_SCROLL_TO_TOP;
    public static final /* enum */ HomeViewTypes ROW_TYPE_OLP_CARDS_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_PRODUCT_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_RATINGS_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_RECENTLYVIEWED_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_RECENT_SEARCH_WIDGET;
    public static final /* enum */ HomeViewTypes ROW_TYPE_SIMILAR_ITEMS;
    public static final /* enum */ HomeViewTypes ROW_TYPE_SPACE;
    public static final /* enum */ HomeViewTypes ROW_TYPE_STANDARD;
    public static final /* enum */ HomeViewTypes ROW_TYPE_STL;
    private final int type;

    private static final /* synthetic */ HomeViewTypes[] $values() {
        HomeViewTypes homeViewTypes = ROW_TYPE_HLIST;
        homeViewTypes = ROW_TYPE_FULL_IMAGE;
        homeViewTypes = ROW_TYPE_CAROUSEL;
        homeViewTypes = ROW_TYPE_SPACE;
        homeViewTypes = ROW_TYPE_CLOSET;
        homeViewTypes = ROW_TYPE_APP_UPDATE;
        homeViewTypes = ROW_TYPE_LUXE_BOTTOM_LINKS;
        homeViewTypes = ROW_TYPE_LUXE_BOTTOM_SCROLL_TO_TOP;
        homeViewTypes = ROW_TYPE_PRODUCT_WIDGET;
        homeViewTypes = ROW_TYPE_STL;
        homeViewTypes = ROW_TYPE_RECENTLYVIEWED_WIDGET;
        homeViewTypes = ROW_TYPE_RECENT_SEARCH_WIDGET;
        homeViewTypes = ROW_TYPE_IMAGE_SEARCH_WIDGET;
        homeViewTypes = ROW_TYPE_STANDARD;
        homeViewTypes = ROW_TYPE_FLOATING_COMPONENT;
        homeViewTypes = ROW_TYPE_RATINGS_WIDGET;
        homeViewTypes = ROW_TYPE_DYNAMIC_WIDGET;
        homeViewTypes = ROW_TYPE_OLP_CARDS_WIDGET;
        homeViewTypes = ROW_TYPE_CURATED_WIDGET;
        homeViewTypes = ROW_TYPE_SIMILAR_ITEMS;
        HomeViewTypes[] homeViewTypesArray = new HomeViewTypes[]{homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes, homeViewTypes};
        return homeViewTypesArray;
    }

    static {
        int n3 = 1;
        Enum[] enumArray = new HomeViewTypes("ROW_TYPE_HLIST", 0, n3);
        ROW_TYPE_HLIST = enumArray;
        int n4 = 2;
        enumArray = new HomeViewTypes("ROW_TYPE_FULL_IMAGE", n3, n4);
        ROW_TYPE_FULL_IMAGE = enumArray;
        n3 = 3;
        enumArray = new HomeViewTypes("ROW_TYPE_CAROUSEL", n4, n3);
        ROW_TYPE_CAROUSEL = enumArray;
        n4 = 4;
        enumArray = new HomeViewTypes("ROW_TYPE_SPACE", n3, n4);
        ROW_TYPE_SPACE = enumArray;
        n3 = 5;
        enumArray = new HomeViewTypes("ROW_TYPE_CLOSET", n4, n3);
        ROW_TYPE_CLOSET = enumArray;
        n4 = 6;
        enumArray = new HomeViewTypes("ROW_TYPE_APP_UPDATE", n3, n4);
        ROW_TYPE_APP_UPDATE = enumArray;
        n3 = 7;
        enumArray = new HomeViewTypes("ROW_TYPE_LUXE_BOTTOM_LINKS", n4, n3);
        ROW_TYPE_LUXE_BOTTOM_LINKS = enumArray;
        n4 = 8;
        enumArray = new HomeViewTypes("ROW_TYPE_LUXE_BOTTOM_SCROLL_TO_TOP", n3, n4);
        ROW_TYPE_LUXE_BOTTOM_SCROLL_TO_TOP = enumArray;
        n3 = 9;
        enumArray = new HomeViewTypes("ROW_TYPE_PRODUCT_WIDGET", n4, n3);
        ROW_TYPE_PRODUCT_WIDGET = enumArray;
        n4 = 10;
        enumArray = new HomeViewTypes("ROW_TYPE_STL", n3, n4);
        ROW_TYPE_STL = enumArray;
        n3 = 11;
        enumArray = new HomeViewTypes("ROW_TYPE_RECENTLYVIEWED_WIDGET", n4, n3);
        ROW_TYPE_RECENTLYVIEWED_WIDGET = enumArray;
        n4 = 12;
        enumArray = new HomeViewTypes("ROW_TYPE_RECENT_SEARCH_WIDGET", n3, n4);
        ROW_TYPE_RECENT_SEARCH_WIDGET = enumArray;
        n3 = 13;
        enumArray = new HomeViewTypes("ROW_TYPE_IMAGE_SEARCH_WIDGET", n4, n3);
        ROW_TYPE_IMAGE_SEARCH_WIDGET = enumArray;
        n4 = 14;
        enumArray = new HomeViewTypes("ROW_TYPE_STANDARD", n3, n4);
        ROW_TYPE_STANDARD = enumArray;
        n3 = 15;
        enumArray = new HomeViewTypes("ROW_TYPE_FLOATING_COMPONENT", n4, n3);
        ROW_TYPE_FLOATING_COMPONENT = enumArray;
        n4 = 16;
        enumArray = new HomeViewTypes("ROW_TYPE_RATINGS_WIDGET", n3, n4);
        ROW_TYPE_RATINGS_WIDGET = enumArray;
        n3 = 17;
        enumArray = new HomeViewTypes("ROW_TYPE_DYNAMIC_WIDGET", n4, n3);
        ROW_TYPE_DYNAMIC_WIDGET = enumArray;
        n4 = 18;
        enumArray = new HomeViewTypes("ROW_TYPE_OLP_CARDS_WIDGET", n3, n4);
        ROW_TYPE_OLP_CARDS_WIDGET = enumArray;
        n3 = 19;
        enumArray = new HomeViewTypes("ROW_TYPE_CURATED_WIDGET", n4, n3);
        ROW_TYPE_CURATED_WIDGET = enumArray;
        enumArray = new HomeViewTypes("ROW_TYPE_SIMILAR_ITEMS", n3, 20);
        ROW_TYPE_SIMILAR_ITEMS = enumArray;
        enumArray = HomeViewTypes.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HomeViewTypes() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static HomeViewTypes valueOf(String string2) {
        return Enum.valueOf(HomeViewTypes.class, string2);
    }

    public static HomeViewTypes[] values() {
        return (HomeViewTypes[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

