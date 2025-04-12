/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.Predefined;
import com.affise.attribution.events.parameters.PredefinedString$Companion;

public final class PredefinedString
extends Enum
implements Predefined {
    private static final /* synthetic */ PredefinedString[] $VALUES;
    public static final /* enum */ PredefinedString ACHIEVEMENT_ID;
    public static final /* enum */ PredefinedString ADREV_AD_TYPE;
    public static final /* enum */ PredefinedString BRAND;
    public static final /* enum */ PredefinedString BRICK;
    public static final /* enum */ PredefinedString CAMPAIGN_ID;
    public static final /* enum */ PredefinedString CATALOGUE_ID;
    public static final /* enum */ PredefinedString CHANNEL_TYPE;
    public static final /* enum */ PredefinedString CITY;
    public static final /* enum */ PredefinedString CLASS;
    public static final /* enum */ PredefinedString CLICK_ID;
    public static final /* enum */ PredefinedString CONTENT_ID;
    public static final /* enum */ PredefinedString CONTENT_NAME;
    public static final /* enum */ PredefinedString CONTENT_TYPE;
    public static final /* enum */ PredefinedString CONVERSION_ID;
    public static final /* enum */ PredefinedString COUNTRY;
    public static final /* enum */ PredefinedString COUPON_CODE;
    public static final /* enum */ PredefinedString CURRENCY;
    public static final /* enum */ PredefinedString CUSTOMER_SEGMENT;
    public static final /* enum */ PredefinedString CUSTOMER_TYPE;
    public static final /* enum */ PredefinedString CUSTOMER_USER_ID;
    public static final PredefinedString$Companion Companion;
    public static final /* enum */ PredefinedString DEEP_LINK;
    public static final /* enum */ PredefinedString DESCRIPTION;
    public static final /* enum */ PredefinedString DESTINATION_A;
    public static final /* enum */ PredefinedString DESTINATION_B;
    public static final /* enum */ PredefinedString DESTINATION_LIST;
    public static final /* enum */ PredefinedString EVENT_NAME;
    public static final /* enum */ PredefinedString NETWORK;
    public static final /* enum */ PredefinedString NEW_VERSION;
    public static final /* enum */ PredefinedString OLD_VERSION;
    public static final /* enum */ PredefinedString ORDER_ID;
    public static final /* enum */ PredefinedString ORIGINAL_ORDER_ID;
    public static final /* enum */ PredefinedString PARAM_01;
    public static final /* enum */ PredefinedString PARAM_02;
    public static final /* enum */ PredefinedString PARAM_03;
    public static final /* enum */ PredefinedString PARAM_04;
    public static final /* enum */ PredefinedString PARAM_05;
    public static final /* enum */ PredefinedString PARAM_06;
    public static final /* enum */ PredefinedString PARAM_07;
    public static final /* enum */ PredefinedString PARAM_08;
    public static final /* enum */ PredefinedString PARAM_09;
    public static final /* enum */ PredefinedString PARAM_10;
    public static final /* enum */ PredefinedString PAYMENT_INFO_AVAILABLE;
    public static final /* enum */ PredefinedString PID;
    public static final /* enum */ PredefinedString PLACEMENT;
    public static final /* enum */ PredefinedString PREFERRED_NEIGHBORHOODS;
    public static final /* enum */ PredefinedString PRODUCT_ID;
    public static final /* enum */ PredefinedString PRODUCT_NAME;
    public static final /* enum */ PredefinedString PRODUCT_TYPE;
    public static final /* enum */ PredefinedString PURCHASE_CURRENCY;
    public static final /* enum */ PredefinedString RECEIPT_ID;
    public static final /* enum */ PredefinedString REGION;
    public static final /* enum */ PredefinedString REGISTRATION_METHOD;
    public static final /* enum */ PredefinedString REVIEW_TEXT;
    public static final /* enum */ PredefinedString SEARCH_STRING;
    public static final /* enum */ PredefinedString SEGMENT;
    public static final /* enum */ PredefinedString SOURCE;
    public static final /* enum */ PredefinedString STATUS;
    public static final /* enum */ PredefinedString SUBSCRIPTION_ID;
    public static final /* enum */ PredefinedString SUBSCRIPTION_TYPE;
    public static final /* enum */ PredefinedString SUCCESS;
    public static final /* enum */ PredefinedString SUGGESTED_DESTINATIONS;
    public static final /* enum */ PredefinedString SUGGESTED_HOTELS;
    public static final /* enum */ PredefinedString TUTORIAL_ID;
    public static final /* enum */ PredefinedString UNIT;
    public static final /* enum */ PredefinedString UTM_CAMPAIGN;
    public static final /* enum */ PredefinedString UTM_MEDIUM;
    public static final /* enum */ PredefinedString UTM_SOURCE;
    public static final /* enum */ PredefinedString VALIDATED;
    public static final /* enum */ PredefinedString VERTICAL;
    public static final /* enum */ PredefinedString VIRTUAL_CURRENCY_NAME;
    public static final /* enum */ PredefinedString VOUCHER_CODE;
    private final String value;

    private static final /* synthetic */ PredefinedString[] $values() {
        PredefinedString predefinedString = ADREV_AD_TYPE;
        predefinedString = CITY;
        predefinedString = COUNTRY;
        predefinedString = REGION;
        predefinedString = CLASS;
        predefinedString = CONTENT_ID;
        predefinedString = CONTENT_TYPE;
        predefinedString = CURRENCY;
        predefinedString = CUSTOMER_USER_ID;
        predefinedString = DESCRIPTION;
        predefinedString = DESTINATION_A;
        predefinedString = DESTINATION_B;
        predefinedString = DESTINATION_LIST;
        predefinedString = ORDER_ID;
        predefinedString = PAYMENT_INFO_AVAILABLE;
        predefinedString = PREFERRED_NEIGHBORHOODS;
        predefinedString = PURCHASE_CURRENCY;
        predefinedString = RECEIPT_ID;
        predefinedString = REGISTRATION_METHOD;
        predefinedString = SEARCH_STRING;
        predefinedString = SUBSCRIPTION_ID;
        predefinedString = SUCCESS;
        predefinedString = SUGGESTED_DESTINATIONS;
        predefinedString = SUGGESTED_HOTELS;
        predefinedString = VALIDATED;
        predefinedString = ACHIEVEMENT_ID;
        predefinedString = COUPON_CODE;
        predefinedString = CUSTOMER_SEGMENT;
        predefinedString = DEEP_LINK;
        predefinedString = NEW_VERSION;
        predefinedString = OLD_VERSION;
        predefinedString = PARAM_01;
        predefinedString = PARAM_02;
        predefinedString = PARAM_03;
        predefinedString = PARAM_04;
        predefinedString = PARAM_05;
        predefinedString = PARAM_06;
        predefinedString = PARAM_07;
        predefinedString = PARAM_08;
        predefinedString = PARAM_09;
        predefinedString = PARAM_10;
        predefinedString = REVIEW_TEXT;
        predefinedString = TUTORIAL_ID;
        predefinedString = VIRTUAL_CURRENCY_NAME;
        predefinedString = STATUS;
        predefinedString = BRAND;
        predefinedString = BRICK;
        predefinedString = CATALOGUE_ID;
        predefinedString = CHANNEL_TYPE;
        predefinedString = CUSTOMER_TYPE;
        predefinedString = SEGMENT;
        predefinedString = UTM_CAMPAIGN;
        predefinedString = UTM_MEDIUM;
        predefinedString = UTM_SOURCE;
        predefinedString = VERTICAL;
        predefinedString = VOUCHER_CODE;
        predefinedString = CLICK_ID;
        predefinedString = CAMPAIGN_ID;
        predefinedString = EVENT_NAME;
        predefinedString = PID;
        predefinedString = PRODUCT_ID;
        predefinedString = CONVERSION_ID;
        predefinedString = CONTENT_NAME;
        predefinedString = PRODUCT_NAME;
        predefinedString = SOURCE;
        predefinedString = NETWORK;
        predefinedString = UNIT;
        predefinedString = PLACEMENT;
        predefinedString = PRODUCT_TYPE;
        predefinedString = SUBSCRIPTION_TYPE;
        predefinedString = ORIGINAL_ORDER_ID;
        PredefinedString[] predefinedStringArray = new PredefinedString[]{predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString, predefinedString};
        return predefinedStringArray;
    }

    static {
        Object object = new PredefinedString("ADREV_AD_TYPE", 0, "adrev_ad_type");
        ADREV_AD_TYPE = object;
        object = new PredefinedString("CITY", 1, "city");
        CITY = object;
        object = new PredefinedString("COUNTRY", 2, "country");
        COUNTRY = object;
        object = new PredefinedString("REGION", 3, "region");
        REGION = object;
        object = new PredefinedString("CLASS", 4, "class");
        CLASS = object;
        object = new PredefinedString("CONTENT_ID", 5, "content_id");
        CONTENT_ID = object;
        object = new PredefinedString("CONTENT_TYPE", 6, "content_type");
        CONTENT_TYPE = object;
        object = new PredefinedString("CURRENCY", 7, "currency");
        CURRENCY = object;
        object = new PredefinedString("CUSTOMER_USER_ID", 8, "customer_user_id");
        CUSTOMER_USER_ID = object;
        object = new PredefinedString("DESCRIPTION", 9, "description");
        DESCRIPTION = object;
        object = new PredefinedString("DESTINATION_A", 10, "destination_a");
        DESTINATION_A = object;
        object = new PredefinedString("DESTINATION_B", 11, "destination_b");
        DESTINATION_B = object;
        object = new PredefinedString("DESTINATION_LIST", 12, "destination_list");
        DESTINATION_LIST = object;
        object = new PredefinedString("ORDER_ID", 13, "order_id");
        ORDER_ID = object;
        object = new PredefinedString("PAYMENT_INFO_AVAILABLE", 14, "payment_info_available");
        PAYMENT_INFO_AVAILABLE = object;
        object = new PredefinedString("PREFERRED_NEIGHBORHOODS", 15, "preferred_neighborhoods");
        PREFERRED_NEIGHBORHOODS = object;
        object = new PredefinedString("PURCHASE_CURRENCY", 16, "purchase_currency");
        PURCHASE_CURRENCY = object;
        object = new PredefinedString("RECEIPT_ID", 17, "receipt_id");
        RECEIPT_ID = object;
        object = new PredefinedString("REGISTRATION_METHOD", 18, "registration_method");
        REGISTRATION_METHOD = object;
        object = new PredefinedString("SEARCH_STRING", 19, "search_string");
        SEARCH_STRING = object;
        object = new PredefinedString("SUBSCRIPTION_ID", 20, "subscription_id");
        SUBSCRIPTION_ID = object;
        object = new PredefinedString("SUCCESS", 21, "success");
        SUCCESS = object;
        object = new PredefinedString("SUGGESTED_DESTINATIONS", 22, "suggested_destinations");
        SUGGESTED_DESTINATIONS = object;
        object = new PredefinedString("SUGGESTED_HOTELS", 23, "suggested_hotels");
        SUGGESTED_HOTELS = object;
        object = new PredefinedString("VALIDATED", 24, "validated");
        VALIDATED = object;
        object = new PredefinedString("ACHIEVEMENT_ID", 25, "achievement_id");
        ACHIEVEMENT_ID = object;
        object = new PredefinedString("COUPON_CODE", 26, "coupon_code");
        COUPON_CODE = object;
        object = new PredefinedString("CUSTOMER_SEGMENT", 27, "customer_segment");
        CUSTOMER_SEGMENT = object;
        object = new PredefinedString("DEEP_LINK", 28, "deep_link");
        DEEP_LINK = object;
        object = new PredefinedString("NEW_VERSION", 29, "new_version");
        NEW_VERSION = object;
        object = new PredefinedString("OLD_VERSION", 30, "old_version");
        OLD_VERSION = object;
        object = new PredefinedString("PARAM_01", 31, "param_01");
        PARAM_01 = object;
        object = new PredefinedString("PARAM_02", 32, "param_02");
        PARAM_02 = object;
        object = new PredefinedString("PARAM_03", 33, "param_03");
        PARAM_03 = object;
        object = new PredefinedString("PARAM_04", 34, "param_04");
        PARAM_04 = object;
        object = new PredefinedString("PARAM_05", 35, "param_05");
        PARAM_05 = object;
        object = new PredefinedString("PARAM_06", 36, "param_06");
        PARAM_06 = object;
        object = new PredefinedString("PARAM_07", 37, "param_07");
        PARAM_07 = object;
        object = new PredefinedString("PARAM_08", 38, "param_08");
        PARAM_08 = object;
        object = new PredefinedString("PARAM_09", 39, "param_09");
        PARAM_09 = object;
        object = new PredefinedString("PARAM_10", 40, "param_10");
        PARAM_10 = object;
        object = new PredefinedString("REVIEW_TEXT", 41, "review_text");
        REVIEW_TEXT = object;
        object = new PredefinedString("TUTORIAL_ID", 42, "tutorial_id");
        TUTORIAL_ID = object;
        object = new PredefinedString("VIRTUAL_CURRENCY_NAME", 43, "virtual_currency_name");
        VIRTUAL_CURRENCY_NAME = object;
        object = new PredefinedString("STATUS", 44, "status");
        STATUS = object;
        object = new PredefinedString("BRAND", 45, "brand");
        BRAND = object;
        object = new PredefinedString("BRICK", 46, "brick");
        BRICK = object;
        object = new PredefinedString("CATALOGUE_ID", 47, "catalogue_id");
        CATALOGUE_ID = object;
        object = new PredefinedString("CHANNEL_TYPE", 48, "channel_type");
        CHANNEL_TYPE = object;
        object = new PredefinedString("CUSTOMER_TYPE", 49, "customer_type");
        CUSTOMER_TYPE = object;
        object = new PredefinedString("SEGMENT", 50, "segment");
        SEGMENT = object;
        object = new PredefinedString("UTM_CAMPAIGN", 51, "utm_campaign");
        UTM_CAMPAIGN = object;
        object = new PredefinedString("UTM_MEDIUM", 52, "utm_medium");
        UTM_MEDIUM = object;
        object = new PredefinedString("UTM_SOURCE", 53, "utm_source");
        UTM_SOURCE = object;
        object = new PredefinedString("VERTICAL", 54, "vertical");
        VERTICAL = object;
        object = new PredefinedString("VOUCHER_CODE", 55, "voucher_code");
        VOUCHER_CODE = object;
        object = new PredefinedString("CLICK_ID", 56, "click_id");
        CLICK_ID = object;
        object = new PredefinedString("CAMPAIGN_ID", 57, "campaign_id");
        CAMPAIGN_ID = object;
        object = new PredefinedString("EVENT_NAME", 58, "event_name");
        EVENT_NAME = object;
        object = new PredefinedString("PID", 59, "pid");
        PID = object;
        object = new PredefinedString("PRODUCT_ID", 60, "product_id");
        PRODUCT_ID = object;
        object = new PredefinedString("CONVERSION_ID", 61, "conversion_id");
        CONVERSION_ID = object;
        object = new PredefinedString("CONTENT_NAME", 62, "content_name");
        CONTENT_NAME = object;
        object = new PredefinedString("PRODUCT_NAME", 63, "product_name");
        PRODUCT_NAME = object;
        object = new PredefinedString("SOURCE", 64, "source");
        SOURCE = object;
        object = new PredefinedString("NETWORK", 65, "network");
        NETWORK = object;
        object = new PredefinedString("UNIT", 66, "unit");
        UNIT = object;
        object = new PredefinedString("PLACEMENT", 67, "placement");
        PLACEMENT = object;
        object = new PredefinedString("PRODUCT_TYPE", 68, "product_type");
        PRODUCT_TYPE = object;
        object = new PredefinedString("SUBSCRIPTION_TYPE", 69, "subscription_type");
        SUBSCRIPTION_TYPE = object;
        object = new PredefinedString("ORIGINAL_ORDER_ID", 70, "original_order_id");
        ORIGINAL_ORDER_ID = object;
        $VALUES = PredefinedString.$values();
        Companion = object = new PredefinedString$Companion(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PredefinedString() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final /* synthetic */ String access$getValue$p(PredefinedString predefinedString) {
        return predefinedString.value;
    }

    public static final PredefinedString from(String string2) {
        return Companion.from(string2);
    }

    public static PredefinedString valueOf(String string2) {
        return Enum.valueOf(PredefinedString.class, string2);
    }

    public static PredefinedString[] values() {
        return (PredefinedString[])$VALUES.clone();
    }

    public String value() {
        StringBuilder stringBuilder = new StringBuilder("affise_p_");
        String string2 = this.value;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

