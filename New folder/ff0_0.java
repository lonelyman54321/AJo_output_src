/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ff0
 */
public final class ff0_0
extends Enum {
    private static final /* synthetic */ ff0_0[] $VALUES;
    public static final /* enum */ ff0_0 AD_TYPE;
    public static final /* enum */ ff0_0 CONTENTS;
    public static final /* enum */ ff0_0 CONTENT_IDS;
    public static final /* enum */ ff0_0 CONTENT_TYPE;
    public static final /* enum */ ff0_0 CURRENCY;
    public static final Ff0$a Companion;
    public static final /* enum */ ff0_0 DESCRIPTION;
    public static final /* enum */ ff0_0 EVENT_NAME;
    public static final /* enum */ ff0_0 EVENT_TIME;
    public static final /* enum */ ff0_0 LEVEL;
    public static final /* enum */ ff0_0 MAX_RATING_VALUE;
    public static final /* enum */ ff0_0 NUM_ITEMS;
    public static final /* enum */ ff0_0 ORDER_ID;
    public static final /* enum */ ff0_0 PAYMENT_INFO_AVAILABLE;
    public static final /* enum */ ff0_0 REGISTRATION_METHOD;
    public static final /* enum */ ff0_0 SEARCH_STRING;
    public static final /* enum */ ff0_0 SUCCESS;
    public static final /* enum */ ff0_0 VALUE_TO_SUM;
    private final String rawValue;

    private static final /* synthetic */ ff0_0[] $values() {
        ff0_0 ff0_02 = EVENT_TIME;
        ff0_02 = EVENT_NAME;
        ff0_02 = VALUE_TO_SUM;
        ff0_02 = CONTENT_IDS;
        ff0_02 = CONTENTS;
        ff0_02 = CONTENT_TYPE;
        ff0_02 = DESCRIPTION;
        ff0_02 = LEVEL;
        ff0_02 = MAX_RATING_VALUE;
        ff0_02 = NUM_ITEMS;
        ff0_02 = PAYMENT_INFO_AVAILABLE;
        ff0_02 = REGISTRATION_METHOD;
        ff0_02 = SEARCH_STRING;
        ff0_02 = SUCCESS;
        ff0_02 = ORDER_ID;
        ff0_02 = AD_TYPE;
        ff0_02 = CURRENCY;
        ff0_0[] ff0_0Array = new ff0_0[]{ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02, ff0_02};
        return ff0_0Array;
    }

    static {
        Object object;
        EVENT_TIME = object = new ff0_0("EVENT_TIME", 0, "_logTime");
        EVENT_NAME = object = new ff0_0("EVENT_NAME", 1, "_eventName");
        VALUE_TO_SUM = object = new ff0_0("VALUE_TO_SUM", 2, "_valueToSum");
        CONTENT_IDS = object = new ff0_0("CONTENT_IDS", 3, "fb_content_id");
        CONTENTS = object = new ff0_0("CONTENTS", 4, "fb_content");
        CONTENT_TYPE = object = new ff0_0("CONTENT_TYPE", 5, "fb_content_type");
        DESCRIPTION = object = new ff0_0("DESCRIPTION", 6, "fb_description");
        LEVEL = object = new ff0_0("LEVEL", 7, "fb_level");
        MAX_RATING_VALUE = object = new ff0_0("MAX_RATING_VALUE", 8, "fb_max_rating_value");
        NUM_ITEMS = object = new ff0_0("NUM_ITEMS", 9, "fb_num_items");
        PAYMENT_INFO_AVAILABLE = object = new ff0_0("PAYMENT_INFO_AVAILABLE", 10, "fb_payment_info_available");
        REGISTRATION_METHOD = object = new ff0_0("REGISTRATION_METHOD", 11, "fb_registration_method");
        SEARCH_STRING = object = new ff0_0("SEARCH_STRING", 12, "fb_search_string");
        SUCCESS = object = new ff0_0("SUCCESS", 13, "fb_success");
        ORDER_ID = object = new ff0_0("ORDER_ID", 14, "fb_order_id");
        AD_TYPE = object = new ff0_0("AD_TYPE", 15, "ad_type");
        CURRENCY = object = new ff0_0("CURRENCY", 16, "fb_currency");
        $VALUES = ff0_0.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ff0_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static ff0_0 valueOf(String string2) {
        return Enum.valueOf(ff0_0.class, string2);
    }

    public static ff0_0[] values() {
        return (ff0_0[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

