/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events.enum;

public final class EventsAction
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ EventsAction[] $VALUES;
    public static final /* enum */ EventsAction ADD_TO_WISHLIST;
    public static final /* enum */ EventsAction CART_ICON_CLICK;
    public static final /* enum */ EventsAction GO_TO_HOME;
    public static final /* enum */ EventsAction HAMBURGER_MENU_CLICK;
    public static final /* enum */ EventsAction HAMBURGER_MENU_SELECT;
    public static final /* enum */ EventsAction PLP_CATEGORY_FILTER_CLICKED;
    public static final /* enum */ EventsAction PLP_FILTER_APPLIED;
    public static final /* enum */ EventsAction PLP_FILTER_CLICKED;
    public static final /* enum */ EventsAction PLP_SORT_BY_APPLIED;
    public static final /* enum */ EventsAction PLP_SORT_BY_CLICK;
    public static final /* enum */ EventsAction PLP_VISUAL_FILTER_APPLIED;
    public static final /* enum */ EventsAction PLP_VISUAL_FILTER_IMPRESSION;
    public static final /* enum */ EventsAction QUICK_VIEW;
    public static final /* enum */ EventsAction SEARCH;
    private final String value;

    private static final /* synthetic */ EventsAction[] $values() {
        EventsAction eventsAction = PLP_FILTER_CLICKED;
        eventsAction = PLP_CATEGORY_FILTER_CLICKED;
        eventsAction = PLP_FILTER_APPLIED;
        eventsAction = PLP_SORT_BY_CLICK;
        eventsAction = PLP_SORT_BY_APPLIED;
        eventsAction = PLP_VISUAL_FILTER_IMPRESSION;
        eventsAction = PLP_VISUAL_FILTER_APPLIED;
        eventsAction = HAMBURGER_MENU_CLICK;
        eventsAction = ADD_TO_WISHLIST;
        eventsAction = HAMBURGER_MENU_SELECT;
        eventsAction = SEARCH;
        eventsAction = CART_ICON_CLICK;
        eventsAction = GO_TO_HOME;
        eventsAction = QUICK_VIEW;
        EventsAction[] eventsActionArray = new EventsAction[]{eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction, eventsAction};
        return eventsActionArray;
    }

    static {
        Enum[] enumArray = new EventsAction("PLP_FILTER_CLICKED", 0, "plp_filters_clicked");
        PLP_FILTER_CLICKED = enumArray;
        enumArray = new EventsAction("PLP_CATEGORY_FILTER_CLICKED", 1, "plp_category_filter_clicked");
        PLP_CATEGORY_FILTER_CLICKED = enumArray;
        enumArray = new EventsAction("PLP_FILTER_APPLIED", 2, "plp_filters_applied");
        PLP_FILTER_APPLIED = enumArray;
        enumArray = new EventsAction("PLP_SORT_BY_CLICK", 3, "plp_sort_by_click");
        PLP_SORT_BY_CLICK = enumArray;
        enumArray = new EventsAction("PLP_SORT_BY_APPLIED", 4, "plp_sort_by_applied");
        PLP_SORT_BY_APPLIED = enumArray;
        enumArray = new EventsAction("PLP_VISUAL_FILTER_IMPRESSION", 5, "plp_visual_filter_impression");
        PLP_VISUAL_FILTER_IMPRESSION = enumArray;
        enumArray = new EventsAction("PLP_VISUAL_FILTER_APPLIED", 6, "plp_visual_filter_applied");
        PLP_VISUAL_FILTER_APPLIED = enumArray;
        enumArray = new EventsAction("HAMBURGER_MENU_CLICK", 7, "hamburger_menu_click");
        HAMBURGER_MENU_CLICK = enumArray;
        enumArray = new EventsAction("ADD_TO_WISHLIST", 8, "add to wishlist");
        ADD_TO_WISHLIST = enumArray;
        enumArray = new EventsAction("HAMBURGER_MENU_SELECT", 9, "hamburger_menu_select");
        HAMBURGER_MENU_SELECT = enumArray;
        enumArray = new EventsAction("SEARCH", 10, "search");
        SEARCH = enumArray;
        enumArray = new EventsAction("CART_ICON_CLICK", 11, "cart icon click");
        CART_ICON_CLICK = enumArray;
        enumArray = new EventsAction("GO_TO_HOME", 12, "go to home");
        GO_TO_HOME = enumArray;
        enumArray = new EventsAction("QUICK_VIEW", 13, "quick view");
        QUICK_VIEW = enumArray;
        enumArray = EventsAction.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EventsAction() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static EventsAction valueOf(String string2) {
        return Enum.valueOf(EventsAction.class, string2);
    }

    public static EventsAction[] values() {
        return (EventsAction[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

