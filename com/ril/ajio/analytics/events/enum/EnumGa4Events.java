/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events.enum;

public final class EnumGa4Events
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ EnumGa4Events[] $VALUES;
    public static final /* enum */ EnumGa4Events HAMBURGER_MENU_INTERACTION;
    public static final /* enum */ EnumGa4Events HAMBURGER_MENU_NAVIGATION;
    public static final /* enum */ EnumGa4Events PLP_ADD_TO_WISHLIST;
    public static final /* enum */ EnumGa4Events PLP_FILTER_INTERACTION;
    public static final /* enum */ EnumGa4Events PLP_NAVGATION_INTERACTION;
    public static final /* enum */ EnumGa4Events PLP_SORT_BY_INTERACTION;
    public static final /* enum */ EnumGa4Events PLP_VISUAL_FILTER_INTERACTION;
    public static final /* enum */ EnumGa4Events PRODUCT_IMAGE_INTERACTION;
    public static final /* enum */ EnumGa4Events QUICK_VIEW_INTERACTION;
    public static final /* enum */ EnumGa4Events SCREEN_VIEW;
    public static final /* enum */ EnumGa4Events SIZE_GUIDE_INTERACTION;
    private final String value;

    private static final /* synthetic */ EnumGa4Events[] $values() {
        EnumGa4Events enumGa4Events = PLP_FILTER_INTERACTION;
        enumGa4Events = PLP_SORT_BY_INTERACTION;
        enumGa4Events = PLP_VISUAL_FILTER_INTERACTION;
        enumGa4Events = HAMBURGER_MENU_NAVIGATION;
        enumGa4Events = HAMBURGER_MENU_INTERACTION;
        enumGa4Events = PLP_NAVGATION_INTERACTION;
        enumGa4Events = QUICK_VIEW_INTERACTION;
        enumGa4Events = PLP_ADD_TO_WISHLIST;
        enumGa4Events = PRODUCT_IMAGE_INTERACTION;
        enumGa4Events = SIZE_GUIDE_INTERACTION;
        enumGa4Events = SCREEN_VIEW;
        EnumGa4Events[] enumGa4EventsArray = new EnumGa4Events[]{enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events, enumGa4Events};
        return enumGa4EventsArray;
    }

    static {
        Enum[] enumArray = new EnumGa4Events("PLP_FILTER_INTERACTION", 0, "plp_filter_interaction");
        PLP_FILTER_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("PLP_SORT_BY_INTERACTION", 1, "plp_sort_by_interaction");
        PLP_SORT_BY_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("PLP_VISUAL_FILTER_INTERACTION", 2, "plp_visual_filter_interaction");
        PLP_VISUAL_FILTER_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("HAMBURGER_MENU_NAVIGATION", 3, "hamburger_menu_navigation");
        HAMBURGER_MENU_NAVIGATION = enumArray;
        enumArray = new EnumGa4Events("HAMBURGER_MENU_INTERACTION", 4, "hamburger_menu_interaction");
        HAMBURGER_MENU_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("PLP_NAVGATION_INTERACTION", 5, "plp_navigation_interaction");
        PLP_NAVGATION_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("QUICK_VIEW_INTERACTION", 6, "quick_view_interaction");
        QUICK_VIEW_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("PLP_ADD_TO_WISHLIST", 7, "plp_add_to_whishlist");
        PLP_ADD_TO_WISHLIST = enumArray;
        enumArray = new EnumGa4Events("PRODUCT_IMAGE_INTERACTION", 8, "product_image_interaction");
        PRODUCT_IMAGE_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("SIZE_GUIDE_INTERACTION", 9, "size_guide_interaction");
        SIZE_GUIDE_INTERACTION = enumArray;
        enumArray = new EnumGa4Events("SCREEN_VIEW", 10, "screen_view");
        SCREEN_VIEW = enumArray;
        enumArray = EnumGa4Events.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EnumGa4Events() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static EnumGa4Events valueOf(String string2) {
        return Enum.valueOf(EnumGa4Events.class, string2);
    }

    public static EnumGa4Events[] values() {
        return (EnumGa4Events[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

