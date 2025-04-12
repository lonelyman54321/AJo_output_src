/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from t80
 */
public final class t80_0
extends Enum {
    private static final /* synthetic */ t80_0[] $VALUES;
    public static final /* enum */ t80_0 AD_TYPE;
    public static final /* enum */ t80_0 CONTENTS;
    public static final /* enum */ t80_0 CONTENT_IDS;
    public static final /* enum */ t80_0 CONTENT_TYPE;
    public static final /* enum */ t80_0 CURRENCY;
    public static final /* enum */ t80_0 DESCRIPTION;
    public static final /* enum */ t80_0 EVENT_NAME;
    public static final /* enum */ t80_0 EVENT_TIME;
    public static final /* enum */ t80_0 LEVEL;
    public static final /* enum */ t80_0 MAX_RATING_VALUE;
    public static final /* enum */ t80_0 NUM_ITEMS;
    public static final /* enum */ t80_0 ORDER_ID;
    public static final /* enum */ t80_0 PAYMENT_INFO_AVAILABLE;
    public static final /* enum */ t80_0 REGISTRATION_METHOD;
    public static final /* enum */ t80_0 SEARCH_STRING;
    public static final /* enum */ t80_0 SUCCESS;
    public static final /* enum */ t80_0 VALUE_TO_SUM;
    private final String rawValue;

    private static final /* synthetic */ t80_0[] $values() {
        t80_0 t80_02 = VALUE_TO_SUM;
        t80_02 = EVENT_TIME;
        t80_02 = EVENT_NAME;
        t80_02 = CONTENT_IDS;
        t80_02 = CONTENTS;
        t80_02 = CONTENT_TYPE;
        t80_02 = DESCRIPTION;
        t80_02 = LEVEL;
        t80_02 = MAX_RATING_VALUE;
        t80_02 = NUM_ITEMS;
        t80_02 = PAYMENT_INFO_AVAILABLE;
        t80_02 = REGISTRATION_METHOD;
        t80_02 = SEARCH_STRING;
        t80_02 = SUCCESS;
        t80_02 = ORDER_ID;
        t80_02 = AD_TYPE;
        t80_02 = CURRENCY;
        t80_0[] t80_0Array = new t80_0[]{t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02, t80_02};
        return t80_0Array;
    }

    static {
        t80_0 t80_02;
        VALUE_TO_SUM = t80_02 = new t80_0("VALUE_TO_SUM", 0, "value");
        EVENT_TIME = t80_02 = new t80_0("EVENT_TIME", 1, "event_time");
        EVENT_NAME = t80_02 = new t80_0("EVENT_NAME", 2, "event_name");
        CONTENT_IDS = t80_02 = new t80_0("CONTENT_IDS", 3, "content_ids");
        CONTENTS = t80_02 = new t80_0("CONTENTS", 4, "contents");
        CONTENT_TYPE = t80_02 = new t80_0("CONTENT_TYPE", 5, "content_type");
        DESCRIPTION = t80_02 = new t80_0("DESCRIPTION", 6, "description");
        LEVEL = t80_02 = new t80_0("LEVEL", 7, "level");
        MAX_RATING_VALUE = t80_02 = new t80_0("MAX_RATING_VALUE", 8, "max_rating_value");
        NUM_ITEMS = t80_02 = new t80_0("NUM_ITEMS", 9, "num_items");
        PAYMENT_INFO_AVAILABLE = t80_02 = new t80_0("PAYMENT_INFO_AVAILABLE", 10, "payment_info_available");
        REGISTRATION_METHOD = t80_02 = new t80_0("REGISTRATION_METHOD", 11, "registration_method");
        SEARCH_STRING = t80_02 = new t80_0("SEARCH_STRING", 12, "search_string");
        SUCCESS = t80_02 = new t80_0("SUCCESS", 13, "success");
        ORDER_ID = t80_02 = new t80_0("ORDER_ID", 14, "order_id");
        AD_TYPE = t80_02 = new t80_0("AD_TYPE", 15, "ad_type");
        CURRENCY = t80_02 = new t80_0("CURRENCY", 16, "currency");
        $VALUES = t80_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private t80_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static t80_0 valueOf(String string2) {
        return Enum.valueOf(t80_0.class, string2);
    }

    public static t80_0[] values() {
        return (t80_0[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

