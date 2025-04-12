/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

public final class HomePageRatingViewType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ HomePageRatingViewType[] $VALUES;
    public static final /* enum */ HomePageRatingViewType RATE_ITEM_VIEW;
    public static final /* enum */ HomePageRatingViewType RATE_OTHER_ITEM_VIEW;
    public static final /* enum */ HomePageRatingViewType RATING_COMPLETED;
    private final int type;

    private static final /* synthetic */ HomePageRatingViewType[] $values() {
        HomePageRatingViewType homePageRatingViewType = RATE_ITEM_VIEW;
        homePageRatingViewType = RATE_OTHER_ITEM_VIEW;
        homePageRatingViewType = RATING_COMPLETED;
        HomePageRatingViewType[] homePageRatingViewTypeArray = new HomePageRatingViewType[]{homePageRatingViewType, homePageRatingViewType, homePageRatingViewType};
        return homePageRatingViewTypeArray;
    }

    static {
        Enum[] enumArray = new HomePageRatingViewType("RATE_ITEM_VIEW", 0, 0);
        RATE_ITEM_VIEW = enumArray;
        int n3 = 1;
        enumArray = new HomePageRatingViewType("RATE_OTHER_ITEM_VIEW", n3, n3);
        RATE_OTHER_ITEM_VIEW = enumArray;
        n3 = 2;
        enumArray = new HomePageRatingViewType("RATING_COMPLETED", n3, n3);
        RATING_COMPLETED = enumArray;
        enumArray = HomePageRatingViewType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HomePageRatingViewType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static HomePageRatingViewType valueOf(String string2) {
        return Enum.valueOf(HomePageRatingViewType.class, string2);
    }

    public static HomePageRatingViewType[] values() {
        return (HomePageRatingViewType[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

