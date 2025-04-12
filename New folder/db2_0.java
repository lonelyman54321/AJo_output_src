/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dB2
 */
public final class db2_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ db2_0[] $VALUES;
    public static final /* enum */ db2_0 IS_ADDRESS_VIEW;
    public static final /* enum */ db2_0 IS_AUTO_CORRECT;
    public static final /* enum */ db2_0 IS_BRAND_DESCRIPTION;
    public static final /* enum */ db2_0 IS_CMS_BANNER;
    public static final /* enum */ db2_0 IS_FILTER_NUDGE;
    public static final /* enum */ db2_0 IS_FULL_JIO_AD_BANNER;
    public static final /* enum */ db2_0 IS_HALF_JIO_AD_BANNER;
    public static final /* enum */ db2_0 IS_HEADER;
    public static final /* enum */ db2_0 IS_IMAGE_SEARCH;
    public static final /* enum */ db2_0 IS_NEW_USER_BANNER;
    public static final /* enum */ db2_0 IS_PLP_EXTENDED_BANNER;
    public static final /* enum */ db2_0 IS_PRODUCT;
    public static final /* enum */ db2_0 IS_QUICK_FILTER_WIDGET;
    public static final /* enum */ db2_0 IS_REVIEW_BANNER;
    public static final /* enum */ db2_0 IS_SALE_BANNER;
    public static final /* enum */ db2_0 IS_SEARCH_WIDGET;
    public static final /* enum */ db2_0 IS_VIDEO_BANNER;
    public static final /* enum */ db2_0 IS_VISUAL_FILTER;

    private static final /* synthetic */ db2_0[] $values() {
        db2_0 db2_02 = IS_PRODUCT;
        db2_02 = IS_BRAND_DESCRIPTION;
        db2_02 = IS_CMS_BANNER;
        db2_02 = IS_IMAGE_SEARCH;
        db2_02 = IS_AUTO_CORRECT;
        db2_02 = IS_PLP_EXTENDED_BANNER;
        db2_02 = IS_NEW_USER_BANNER;
        db2_02 = IS_FILTER_NUDGE;
        db2_02 = IS_VISUAL_FILTER;
        db2_02 = IS_HALF_JIO_AD_BANNER;
        db2_02 = IS_FULL_JIO_AD_BANNER;
        db2_02 = IS_REVIEW_BANNER;
        db2_02 = IS_VIDEO_BANNER;
        db2_02 = IS_SEARCH_WIDGET;
        db2_02 = IS_QUICK_FILTER_WIDGET;
        db2_02 = IS_HEADER;
        db2_02 = IS_SALE_BANNER;
        db2_02 = IS_ADDRESS_VIEW;
        db2_0[] db2_0Array = new db2_0[]{db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02, db2_02};
        return db2_0Array;
    }

    static {
        Enum[] enumArray = new db2_0("IS_PRODUCT", 0);
        IS_PRODUCT = enumArray;
        enumArray = new db2_0("IS_BRAND_DESCRIPTION", 1);
        IS_BRAND_DESCRIPTION = enumArray;
        enumArray = new db2_0("IS_CMS_BANNER", 2);
        IS_CMS_BANNER = enumArray;
        enumArray = new db2_0("IS_IMAGE_SEARCH", 3);
        IS_IMAGE_SEARCH = enumArray;
        enumArray = new db2_0("IS_AUTO_CORRECT", 4);
        IS_AUTO_CORRECT = enumArray;
        enumArray = new db2_0("IS_PLP_EXTENDED_BANNER", 5);
        IS_PLP_EXTENDED_BANNER = enumArray;
        enumArray = new db2_0("IS_NEW_USER_BANNER", 6);
        IS_NEW_USER_BANNER = enumArray;
        enumArray = new db2_0("IS_FILTER_NUDGE", 7);
        IS_FILTER_NUDGE = enumArray;
        enumArray = new db2_0("IS_VISUAL_FILTER", 8);
        IS_VISUAL_FILTER = enumArray;
        enumArray = new db2_0("IS_HALF_JIO_AD_BANNER", 9);
        IS_HALF_JIO_AD_BANNER = enumArray;
        enumArray = new db2_0("IS_FULL_JIO_AD_BANNER", 10);
        IS_FULL_JIO_AD_BANNER = enumArray;
        enumArray = new db2_0("IS_REVIEW_BANNER", 11);
        IS_REVIEW_BANNER = enumArray;
        enumArray = new db2_0("IS_VIDEO_BANNER", 12);
        IS_VIDEO_BANNER = enumArray;
        enumArray = new db2_0("IS_SEARCH_WIDGET", 13);
        IS_SEARCH_WIDGET = enumArray;
        enumArray = new db2_0("IS_QUICK_FILTER_WIDGET", 14);
        IS_QUICK_FILTER_WIDGET = enumArray;
        enumArray = new db2_0("IS_HEADER", 15);
        IS_HEADER = enumArray;
        enumArray = new db2_0("IS_SALE_BANNER", 16);
        IS_SALE_BANNER = enumArray;
        enumArray = new db2_0("IS_ADDRESS_VIEW", 17);
        IS_ADDRESS_VIEW = enumArray;
        enumArray = db2_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private db2_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static db2_0 valueOf(String string2) {
        return Enum.valueOf(db2_0.class, string2);
    }

    public static db2_0[] values() {
        return (db2_0[])$VALUES.clone();
    }
}

