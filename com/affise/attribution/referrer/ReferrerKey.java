/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.referrer;

import com.affise.attribution.referrer.ReferrerKey$Companion;

public final class ReferrerKey
extends Enum {
    private static final /* synthetic */ ReferrerKey[] $VALUES;
    public static final /* enum */ ReferrerKey AD_ID;
    public static final /* enum */ ReferrerKey AFFC;
    public static final /* enum */ ReferrerKey AFFISE_AD;
    public static final /* enum */ ReferrerKey AFFISE_ADSET;
    public static final /* enum */ ReferrerKey AFFISE_ADSET_ID;
    public static final /* enum */ ReferrerKey AFFISE_AD_ID;
    public static final /* enum */ ReferrerKey AFFISE_AD_TYPE;
    public static final /* enum */ ReferrerKey AFFISE_AFFC_ID;
    public static final /* enum */ ReferrerKey AFFISE_CHANNEL;
    public static final /* enum */ ReferrerKey AFFISE_CLICK_LOOK_BACK;
    public static final /* enum */ ReferrerKey AFFISE_COST_CURRENCY;
    public static final /* enum */ ReferrerKey AFFISE_COST_MODEL;
    public static final /* enum */ ReferrerKey AFFISE_COST_VALUE;
    public static final /* enum */ ReferrerKey AFFISE_DEEPLINK;
    public static final /* enum */ ReferrerKey AFFISE_KEYWORDS;
    public static final /* enum */ ReferrerKey AFFISE_MEDIA_TYPE;
    public static final /* enum */ ReferrerKey AFFISE_MODEL;
    public static final /* enum */ ReferrerKey AFFISE_OS;
    public static final /* enum */ ReferrerKey AFFISE_PARTNER;
    public static final /* enum */ ReferrerKey AFFISE_REF;
    public static final /* enum */ ReferrerKey AFFISE_SITE_ID;
    public static final /* enum */ ReferrerKey AFFISE_SUB_1;
    public static final /* enum */ ReferrerKey AFFISE_SUB_2;
    public static final /* enum */ ReferrerKey AFFISE_SUB_3;
    public static final /* enum */ ReferrerKey AFFISE_SUB_4;
    public static final /* enum */ ReferrerKey AFFISE_SUB_5;
    public static final /* enum */ ReferrerKey AFFISE_SUB_SITE_ID;
    public static final /* enum */ ReferrerKey CAMPAIGN_ID;
    public static final /* enum */ ReferrerKey CLICK_ID;
    public static final ReferrerKey$Companion Companion;
    public static final /* enum */ ReferrerKey PID;
    public static final /* enum */ ReferrerKey SUB_1;
    public static final /* enum */ ReferrerKey SUB_2;
    public static final /* enum */ ReferrerKey SUB_3;
    public static final /* enum */ ReferrerKey SUB_4;
    public static final /* enum */ ReferrerKey SUB_5;
    private final String type;

    private static final /* synthetic */ ReferrerKey[] $values() {
        ReferrerKey referrerKey = AD_ID;
        referrerKey = CAMPAIGN_ID;
        referrerKey = CLICK_ID;
        referrerKey = AFFISE_AD;
        referrerKey = AFFISE_AD_ID;
        referrerKey = AFFISE_AD_TYPE;
        referrerKey = AFFISE_ADSET;
        referrerKey = AFFISE_ADSET_ID;
        referrerKey = AFFISE_AFFC_ID;
        referrerKey = AFFISE_CHANNEL;
        referrerKey = AFFISE_CLICK_LOOK_BACK;
        referrerKey = AFFISE_COST_CURRENCY;
        referrerKey = AFFISE_COST_MODEL;
        referrerKey = AFFISE_COST_VALUE;
        referrerKey = AFFISE_DEEPLINK;
        referrerKey = AFFISE_KEYWORDS;
        referrerKey = AFFISE_MEDIA_TYPE;
        referrerKey = AFFISE_MODEL;
        referrerKey = AFFISE_OS;
        referrerKey = AFFISE_PARTNER;
        referrerKey = AFFISE_REF;
        referrerKey = AFFISE_SITE_ID;
        referrerKey = AFFISE_SUB_SITE_ID;
        referrerKey = AFFC;
        referrerKey = PID;
        referrerKey = SUB_1;
        referrerKey = SUB_2;
        referrerKey = SUB_3;
        referrerKey = SUB_4;
        referrerKey = SUB_5;
        referrerKey = AFFISE_SUB_1;
        referrerKey = AFFISE_SUB_2;
        referrerKey = AFFISE_SUB_3;
        referrerKey = AFFISE_SUB_4;
        referrerKey = AFFISE_SUB_5;
        ReferrerKey[] referrerKeyArray = new ReferrerKey[]{referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey, referrerKey};
        return referrerKeyArray;
    }

    static {
        Object object;
        AD_ID = object = new ReferrerKey("AD_ID", 0, "ad_id");
        CAMPAIGN_ID = object = new ReferrerKey("CAMPAIGN_ID", 1, "campaign_id");
        CLICK_ID = object = new ReferrerKey("CLICK_ID", 2, "clickid");
        AFFISE_AD = object = new ReferrerKey("AFFISE_AD", 3, "affise_ad");
        AFFISE_AD_ID = object = new ReferrerKey("AFFISE_AD_ID", 4, "affise_ad_id");
        AFFISE_AD_TYPE = object = new ReferrerKey("AFFISE_AD_TYPE", 5, "affise_ad_type");
        AFFISE_ADSET = object = new ReferrerKey("AFFISE_ADSET", 6, "affise_adset");
        AFFISE_ADSET_ID = object = new ReferrerKey("AFFISE_ADSET_ID", 7, "affise_adset_id");
        AFFISE_AFFC_ID = object = new ReferrerKey("AFFISE_AFFC_ID", 8, "affise_affc_id");
        AFFISE_CHANNEL = object = new ReferrerKey("AFFISE_CHANNEL", 9, "affise_channel");
        AFFISE_CLICK_LOOK_BACK = object = new ReferrerKey("AFFISE_CLICK_LOOK_BACK", 10, "affise_click_lookback");
        AFFISE_COST_CURRENCY = object = new ReferrerKey("AFFISE_COST_CURRENCY", 11, "affise_cost_currency");
        AFFISE_COST_MODEL = object = new ReferrerKey("AFFISE_COST_MODEL", 12, "affise_cost_model");
        AFFISE_COST_VALUE = object = new ReferrerKey("AFFISE_COST_VALUE", 13, "affise_cost_value");
        AFFISE_DEEPLINK = object = new ReferrerKey("AFFISE_DEEPLINK", 14, "affise_deeplink");
        AFFISE_KEYWORDS = object = new ReferrerKey("AFFISE_KEYWORDS", 15, "affise_keywords");
        AFFISE_MEDIA_TYPE = object = new ReferrerKey("AFFISE_MEDIA_TYPE", 16, "affise_media_type");
        AFFISE_MODEL = object = new ReferrerKey("AFFISE_MODEL", 17, "affise_model");
        AFFISE_OS = object = new ReferrerKey("AFFISE_OS", 18, "affise_os");
        AFFISE_PARTNER = object = new ReferrerKey("AFFISE_PARTNER", 19, "affise_partner");
        AFFISE_REF = object = new ReferrerKey("AFFISE_REF", 20, "affise_ref");
        AFFISE_SITE_ID = object = new ReferrerKey("AFFISE_SITE_ID", 21, "affise_siteid");
        AFFISE_SUB_SITE_ID = object = new ReferrerKey("AFFISE_SUB_SITE_ID", 22, "affise_sub_siteid");
        AFFC = object = new ReferrerKey("AFFC", 23, "affc");
        PID = object = new ReferrerKey("PID", 24, "pid");
        SUB_1 = object = new ReferrerKey("SUB_1", 25, "sub1");
        SUB_2 = object = new ReferrerKey("SUB_2", 26, "sub2");
        SUB_3 = object = new ReferrerKey("SUB_3", 27, "sub3");
        SUB_4 = object = new ReferrerKey("SUB_4", 28, "sub4");
        SUB_5 = object = new ReferrerKey("SUB_5", 29, "sub5");
        AFFISE_SUB_1 = object = new ReferrerKey("AFFISE_SUB_1", 30, "affise_sub1");
        AFFISE_SUB_2 = object = new ReferrerKey("AFFISE_SUB_2", 31, "affise_sub2");
        AFFISE_SUB_3 = object = new ReferrerKey("AFFISE_SUB_3", 32, "affise_sub3");
        AFFISE_SUB_4 = object = new ReferrerKey("AFFISE_SUB_4", 33, "affise_sub4");
        AFFISE_SUB_5 = object = new ReferrerKey("AFFISE_SUB_5", 34, "affise_sub5");
        $VALUES = ReferrerKey.$values();
        object = new ReferrerKey$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ReferrerKey() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static final ReferrerKey from(String string2) {
        return Companion.from(string2);
    }

    public static ReferrerKey valueOf(String string2) {
        return Enum.valueOf(ReferrerKey.class, string2);
    }

    public static ReferrerKey[] values() {
        return (ReferrerKey[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

