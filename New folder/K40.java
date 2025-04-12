/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import com.ajio.ril.core.network.SSLProvider;
import java.lang.constant.Constable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class K40 {
    public static JSONObject A() {
        JSONObject jSONObject = new JSONObject("{\n\tapiTimeout:1.1\n}");
        return jSONObject;
    }

    public static JSONObject B() {
        JSONObject jSONObject = new JSONObject("{\n  \"appsflyer_firebase_logging_enable\": false,\n  \"appsflyer_ga_logging_enable\": false\n}");
        return jSONObject;
    }

    public static JSONObject C() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false,\n  \"experiments\": [\n    \"CMSABExp7\",\n    \"CMSABEXP10\"\n  ]\n}");
        return jSONObject;
    }

    public static JSONObject D() {
        JSONObject jSONObject = new JSONObject("{\n  \"pdp_exit_intent\": false,\n  \"pdp_similar_animation\": false,\n  \"pdp_oos_scenario\": false,\n  \"pdp_exit_intent_title\": \"Wait! Before You Leave\",\n  \"pdp_exit_intent_sub_title\": \"Explore these Similar Products\",\n  \"pdp_exit_back_title\": \"Continue to home\",\n  \"pdp_exit_go_back_to_product\": \"Go back to product\",\n  \"pdp_oos_scenario_title\": \"Other Colors\",\n  \"pdp_animation_text\": \"VIEW SIMILAR\",\n  \"pdp_animation_offset_value_sec\": 2,\n  \"pdp_exit_intent_full_screen\": true,\n  \"pdp_exit_intent_full_screen_title\": \"Wait! Before You Leave\",\n  \"pdp_exit_intent_full_screen_sub_title\": \"Explore these Products\",\n  \"pdp_exit_intent_full_screen_back_title\": \"Continue to home\",\n  \"pdp_exit_intent_full_screen_error_button\": \"Refresh\",\n  \"pdp_exit_intent_full_screen_error_title\": \"Oops! We're Encountering an Issue\",\n  \"pdp_exit_intent_full_screen_error_sub_title\": \"Please try refreshing the page\",\n  \"pdp_exit_intent_full_screen_page_url\": \"/pdp/exit_intent\"\n}");
        return jSONObject;
    }

    public static JSONObject E() {
        JSONObject jSONObject = new JSONObject("{\n  \"header model\": 1,\n  \"price brand model\": 2,\n  \"COLOR MODEL\": 3,\n  \"SIMILAR MODEL PRODUCT\": 4,\n  \"LUXE_BOTTOM_LINKS\": 5,\n  \"PRICE REVEAL MODEL\": 6,\n  \"LUXE_SIZE_SELECTION_CONTAINER\": 7,\n  \"BANK_OFFERS\": 8,\n  \"TRUST MARKER IMAGE MODEL\": 9,\n  \"TRUST_MARKER\": 10,\n  \"offer model\": 11,\n  \"SIZE MODEL\": 12,\n  \"EDD MODEL\": 13,\n  \"BANK_OFFERS_EDD\": 14,\n  \"LUXE_PROMO_OFFER\": 15,\n  \"PDP_NEW_PRODUCT_DETAILS\": 16,\n  \"INFO MODEL\": 17,\n  \"TRUST MARKER IMAGE MODEL NEW\": 18,\n  \"RATING AND REVIEW MODEL\": 19,\n  \"CUSTOMER PHOTOS\": 20,\n  \"CUSTOMER_REVIEWS\": 21,\n  \"PRICE_DETAIL_VIEW_MODEL\": 22,\n  \"SHOPPING ASSISTANT MODEL\": 23,\n  \"return model\": 24,\n  \"PRICE_ERROR_MODEL\": 25,\n  \"FOOTER MODEL\": 26,\n  \"REFERRAL_MODEL\": 27,\n  \"BRAND_DESC_MODEL\": 28,\n  \"RV MODEL\": 29,\n  \"CAPSULE MODEL PRODUCT\": 30,\n  \"LUXE_FOOTER_LINKS\": 31,\n  \"PDP_KNOW_THE_PRODUCT\": 32,\n  \"PDP_MORE_INFORMATION\": 33\n}");
        return jSONObject;
    }

    public static JSONObject F() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false,\n  \"paymentMode\": false,\n  \"refundMode\": false\n}");
        return jSONObject;
    }

    public static JSONObject G() {
        JSONObject jSONObject = new JSONObject("{\"isPdpVideosEnabled\":false,\"autoplayEnabled\":false}");
        return jSONObject;
    }

    public static JSONArray H() {
        JSONArray jSONArray = new JSONArray("[\"sizerecommendation\", \"uservoice\"]");
        return jSONArray;
    }

    public static JSONObject I() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false,\n  \"maxFiltersCount\": 6,\n  \"priority\": [],\n  \"filterIcons\": {\n    \"Quick Filter\": \"https://assets-uat.ajio.ril.com/cms/AJIO/MOBILE/best_seller_filter_icon.png\"\n  },\n  \"quickFilterBottomSheetTitle\": \"Shop Faster with Quick Filters\",\n  \"quickFilterTitle\": \"Quick Filters\"\n}");
        return jSONObject;
    }

    public static JSONObject J() {
        JSONObject jSONObject = new JSONObject("{\n  \"variants_type\": 0,\n  \"master_flag\": false,\n  \"rating_colour\": \"#000000\"\n}");
        return jSONObject;
    }

    public static JSONObject K() {
        JSONObject jSONObject = new JSONObject("{\n  \"ajio_cash\": [\n    \"RETURN_CREDIT\",\n    \"AJIO_CASH_NT_WALLET\",\n    \"REFERRAL\",\n    \"FINANCE_PROMOTION\",\n    \"GAMIFICATION_CREDIT\",\n    \"GIFTCARD_CREDIT\",\n    \"COD_REFUND\",\n    \"APPEASEMENT\",\n    \"REFUND\"\n  ]\n}");
        return jSONObject;
    }

    public static JSONObject L() {
        JSONObject jSONObject = new JSONObject("{\n  \"master\": false,\n  \"return_exchange_enabled\": false,\n  \"customer_care_enabled\": false,\n  \"return_cancel_enabled\": false,\n  \"return_request_reason_enabled\": false,\n  \"return_request_reason_desc\": \"Select the appropriate return reason to ensure smooth pickup and refund processing.\",\n  \"return_cancel_popup_title\": \"Cancel Return?\",\n  \"return_cancel_popup_desc\": \"Cancellation request for Return ID: %s will be taken and we will try to cancel it!\",\n  \"return_cancel_popup_timeline\": \"It usually takes 24 - 48 hours for the cancellation request to get processed.\",\n  \"return_cancel_popup_success_title\": \"Cancellation Requested\"\n}");
        return jSONObject;
    }

    public static JSONObject M() {
        JSONObject jSONObject = new JSONObject("{\n  \"return_processing_fee_cart\": false,\n  \"return_processing_fee_post_order\": {\n    \"master\": false,\n    \"return_creation\": false,\n    \"refund_breakup\": false\n  }\n}");
        return jSONObject;
    }

    public static JSONObject N() {
        JSONObject jSONObject = new JSONObject("{\n  \"masterFlag\": true,\n  \"footerConcernTitle\": \"Uh oh! You\u2019re at the risk of being charged a penalty.\",\n  \"footerActionTitle\": \"How to avoid extra charges on future orders\",\n  \"concernHeaderTitle\": \"Your returns are high\",\n  \"actionHeaderTitle\": \"Your returns are significantly high\",\n  \"headerPaymentTitle\": \"Pause before you proceed\",\n  \"concernSubTitle\": \"We noticed that your returns in the past 6 months have been high\",\n  \"actionSubTitle\": \"We noticed that your returns in the past 6 months have been significantly high\",\n  \"ajioAverage\": 20,\n  \"concernCautionSubTitle\": \"In the spirit of transparency, You are at the risk of being identified as a concerning profile\",\n  \"actionCautionSubTitle\": \"In the spirit of transparency, You are at the risk of being identified as a risky profile\",\n  \"howItWorksTitle\": \"How it works\",\n  \"howItWorksDesc\": \"We calculate your profile score based on returns/cancellations in comparison to the average score on the AJIO app. Profiles with a score that exceeds the set threshold by a big margin, would be impacted.\",\n  \"possibleActionsTitle\": \"Possible Actions\",\n  \"possibleActionsSubTitle1\": \"Platform Fees\",\n  \"possibleActionsSubTitle2\": \"COD Restrictions\",\n  \"possibleActionsSubTitle3\": \"Order Limitations\",\n  \"avoidPenaltiesTitle\": \"What can you do to avoid penalities\",\n  \"avoidPenaltiesSubTitle1\": \"Verify size before checkout\",\n  \"avoidPenaltiesSubTitle2\": \"Verify material\",\n  \"avoidPenaltiesSubTitle3\": \"Exchange instead of returning\",\n  \"PA_PlatformFeesImageUrl\": \"\",\n  \"PA_CodBanImageUrl\": \"\",\n  \"PA_OrderBlockageImageUrl\": \"\",\n  \"AP_ViewProductImageUrl\": \"\",\n  \"AP_ExchangeImageUrl\": \"\",\n  \"AP_DoubleCheckImageUrl\": \"\"\n}");
        return jSONObject;
    }

    public static JSONObject O() {
        JSONObject jSONObject = new JSONObject("{\n  \"isFeatureEnabled\": false,\n  \"message1\": \"%x is best fit for you\",\n  \"message2\": \"you have selected %x  but %y is best fit for you.\",\n  \"highlightedSize\": false,\n  \"autoSelected\": false,\n  \"sizeConfig\": [\n    {\n      \"segment\": \"\",\n      \"vertical\": \"\",\n      \"brick\": \"\"\n    }\n  ]\n}");
        return jSONObject;
    }

    public static JSONObject P() {
        JSONObject jSONObject = new JSONObject("{\n  \"ic_heart_icon\": \"https://assets.ajio.com/cms/AJIO/MOBILE/ic_wishlist.png\",\n  \"ic_product_quality_icon\": \"https://assets.ajio.com/cms/AJIO/MOBILE/ic_product_quality.png\"\n}");
        return jSONObject;
    }

    public static JSONObject Q() {
        JSONObject jSONObject = new JSONObject("{\n  \"clientId\": \"10058742\",\n  \"pageSize\": 10,\n  \"timeout\": 1.1\n}");
        return jSONObject;
    }

    public static JSONObject R() {
        JSONObject jSONObject = new JSONObject("{\n  \"accountCenterSubtitle\": \"Personal Info\",\n  \"deleteAccountInfo\": \"AJIO.com assures that your data is safe and secure and will not be used in any external advertising, marketing or other sources\",\n  \"deleteAccountTab\": \"Your Data\",\n  \"clientId\": \"01acec98-de91-4f9a-b586-2d45b946b4e2\",\n  \"referralMessage\": \"Congratulations! \u20b950 has been\\ncredited to your AJIO Wallet\",\n  \"referralMessageFail\": \"Invalid referral code\"\n}");
        return jSONObject;
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject("{\n  \"isCartEnabled\": false,\n  \"isPdpEnabled\": false,\n  \"messageReturn\": \"%x day Return\",\n  \"messageReturnAndExchange\": \"%x day Return and Exchange\",\n  \"messageNoReturnAndExchange\": \"Return and Exchange Not Available\",\n  \"messageExchange\": \"%x day Exchange\",\n  \"pdpTitle\": \"Delivery & Return Details\",\n  \"returnPolicyTitle\": \"Return Policies\",\n  \"codAvailableMsg\": \"Cash on Delivery Available\",\n  \"codUnavailableMsg\": \"Cash on Delivery unavailable, online payment mode only\"\n}");
        return jSONObject;
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false\n}");
        return jSONObject;
    }

    public static JSONObject c() {
        JSONObject jSONObject = new JSONObject("{\n  \"akamai_image_closed_group_cohort\": \"test_cohort_akamai\",\n  \"isAkamaiImageManagerPerfLogs\": false,\n  \"isAkamaiImageManagerNonFatalLogs\": false,\n  \"isAkamaiImageManagerGALogs\": false\n}");
        return jSONObject;
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false,\n  \"eventDurationInSec\": 30\n}");
        return jSONObject;
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject("{\n  \"isBannerAdEnabledForCart\": false,\n  \"isClickEnabledForBannerCart\": false,\n  \"pageUrl\": \"/cart/banner\",\n  \"isThirdPartyAdsEnabled\": false,\n  \"isThirdPartyAdsClickEnabled\": false,\n  \"isJioBannerAdsEnabled\": false,\n  \"isJioBannerAdsClickEnabled\": false,\n  \"jioAdsAsi\": \"\",\n  \"jioAdsPageUrl\": \"cart_banner\"\n}");
        return jSONObject;
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject("{\n  \"isBannerAdEnabledForMyAccount\": false,\n  \"isClickEnabledForBannerMyAccount\": false,\n  \"pageUrl\": \"/myaccount/banner\",\n  \"isThirdPartyAdsEnabled\": false,\n  \"isThirdPartyAdsClickEnabled\": false,\n  \"isJioBannerAdsEnabled\": false,\n  \"isJioBannerAdsClickEnabled\": false,\n  \"jioAdsAsi\": \"\",\n  \"jioAdsSdkAsi\": \"\",\n  \"jioAdsSdkDimension\":[],\n  \"jioAdsPageUrl\": \"myaccount_banner\"\n}");
        return jSONObject;
    }

    public static JSONObject g() {
        JSONObject jSONObject = new JSONObject("{\n  \"isBannerAdEnabledForOrderList\": false,\n  \"isClickEnabledForBannerOrderList\": false,\n  \"pageUrl\": \"/orderlisting/banner\",\n  \"isThirdPartyAdsEnabled\": false,\n  \"isThirdPartyAdsClickEnabled\": false,\n  \"isJioBannerAdsEnabled\": false,\n  \"isJioBannerAdsClickEnabled\": false,\n  \"jioAdsAsi\": \"\",\n  \"jioAdsSdkAsi\": \"\",\n  \"jioAdsSdkDimension\":[],\n  \"jioAdsPageUrl\": \"orderlisting_banner\"\n}");
        return jSONObject;
    }

    public static JSONObject h() {
        JSONObject jSONObject = new JSONObject("{\n  \"isBannerAdEnabledForPDP\": false,\n  \"isClickEnabledForBannerPDP\": false,\n  \"pageUrl\": \"/pdp/banner\",\n  \"isThirdPartyAdsEnabled\": false,\n  \"isThirdPartyAdsClickEnabled\": false,\n  \"isJioBannerAdsEnabled\": false,\n  \"isJioBannerAdsClickEnabled\": false,\n  \"jioAdsAsi\": \"\",\n  \"jioAdsPageUrl\": \"pdp_banner\"\n}");
        return jSONObject;
    }

    public static JSONObject i() {
        JSONObject jSONObject = new JSONObject("{\n  \"isBannerAdEnabledForThankyou\": false,\n  \"isClickEnabledForBannerThankyou\": false,\n  \"pageUrl\": \"/thankyou/banner\",\n  \"isThirdPartyAdsEnabled\": false,\n  \"isThirdPartyAdsClickEnabled\": false,\n  \"isJioBannerAdsEnabled\": true,\n  \"isJioBannerAdsClickEnabled\": false,\n  \"jioAdsAsi\": \"\",\n  \"jioAdsSdkAsi\": \"\",\n  \"jioAdsSdkDimension\":[],\n  \"jioAdsPageUrl\": \"thankyou_banner\"\n}");
        return jSONObject;
    }

    public static JSONObject j() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false,\n  \"max_key_value_pair\": 20,\n  \"better_pdp_title\": \"Product Details\",\n  \"max_line_for_value\": 3,\n  \"isSectionOneTabularView\": false,\n  \"isSectionTwoTabularView\": false,\n  \"isSectionThreeTabularView\": false\n}");
        return jSONObject;
    }

    public static JSONObject k() {
        JSONObject jSONObject = new JSONObject("{\"braDressToolPage\":\"/bradresstool\"}");
        return jSONObject;
    }

    public static JSONObject l() {
        JSONObject jSONObject = new JSONObject("{\n  \"enable\": true,\n  \"title\": \"Wait! You Can Bring a Change\",\n  \"description\": \"<!DOCTYPE html>\\n<html>\\n<body>\\n<p style=\\\"line-height: 0.2;\\\">For your order to reach at your doorstep, it takes</p>\\n<p style=\\\"line-height: 0.6;\\\"><strong>6+</strong> Man hours </p>\\n<p style=\\\"line-height: 0.2;\\\"><strong>3+</strong> litres of fuel</p>\\n<h4 style=\\\"line-height: 0.1;\\\">Please accept the delivery when it arrives.</h>\\n</body>\\n</html>\\n\\n\",\n  \"imageLink\": \"https://assets-uat.ajio.ril.com/cms/AJIO/MOBILE/group_11175.png\",\n  \"cta_forward_text\": \"Confirm Order\",\n  \"cta_backward_text\": \"Review Order\"\n}");
        return jSONObject;
    }

    public static JSONObject m() {
        JSONObject jSONObject = new JSONObject("{\"facet_type\":\"l1l3nestedcategory\",\"operator_type\":\"greater\",\"percentage\":10}");
        return jSONObject;
    }

    public static JSONObject n() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": true,\n  \"TTL\": 5,\n  \"clearCache\": false\n}");
        return jSONObject;
    }

    public static HashMap o() {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        da3_0.b(hashMap);
        Object object = 5;
        hashMap.put("CACHE_EXPIRATION_TIME", object);
        JSONObject jSONObject = Integer.valueOf(0);
        hashMap.put("android_smFilterEnable", jSONObject);
        Boolean bl2 = Boolean.FALSE;
        hashMap.put("performanceMonitor", bl2);
        hashMap.put("pdpBtnText", "Add to Bag");
        Object object2 = "android_HomePageRecentlyView";
        hashMap.put(object2, bl2);
        Object object3 = "cart_coupon_footer";
        hashMap.put(object3, bl2);
        Object object4 = "cart_price_drop";
        hashMap.put(object4, bl2);
        Object object5 = "closet_price_drop";
        hashMap.put(object5, bl2);
        Integer n3 = 2;
        hashMap.put("android_plp_visual_size_filter_min_percent", n3);
        hashMap.put("smGenderPercent", jSONObject);
        hashMap.put("smProd", jSONObject);
        hashMap.put("pdp_product_unit_display_control", bl2);
        String string2 = "";
        hashMap.put("similar_product_variant", string2);
        hashMap.put("plp_variant", string2);
        hashMap.put("url_redirect2", string2);
        hashMap.put("orderTrackEnable", bl2);
        hashMap.put("landingPageBgColor", string2);
        Object object6 = 10;
        hashMap.put("android_plp_visual_size_filter_min_item_count", object6);
        hashMap.put("android_service_error_events_screen_name_shown", bl2);
        Object object7 = 4;
        hashMap.put("android_slp_visual_gender_filter_min_item_count", object7);
        hashMap.put("codPopupEnable", bl2);
        hashMap.put("codHeroMessage", string2);
        hashMap.put("codOffer1", string2);
        hashMap.put("codOffer2", string2);
        hashMap.put("pdpSimilarProductListType", jSONObject);
        hashMap.put("search_suggestion_explore_offer", string2);
        hashMap.put("Prepaid_Text", "Credit &amp; Debit Cards, Netbanking, Wallets and UPI");
        hashMap.put("android_enableSizeGuideUrl", bl2);
        Constable constable = 9;
        hashMap.put("android_nps_rating_threshold", constable);
        hashMap.put("ajio_wallet_onboarding_control", bl2);
        hashMap.put("ajio_wallet_promo_enable", bl2);
        constable = Boolean.TRUE;
        hashMap.put("isDisplayAJIOWalletNewTag", constable);
        hashMap.put("continue_search_on_off", constable);
        hashMap.put("android_enablePaymentEngine", constable);
        hashMap.put("search_history_duration", jSONObject);
        hashMap.put("lp_timer", bl2);
        hashMap.put("SizeRecommendation", jSONObject);
        hashMap.put("android_gst_pdp_message", jSONObject);
        hashMap.put("enableKidsCollection", constable);
        hashMap.put("newnotificationCenterEnable", constable);
        Object object8 = 15;
        hashMap.put("notificationCenterCount", object8);
        hashMap.put("enableAPPExit", bl2);
        hashMap.put("markAsDelivered", constable);
        Integer n4 = 100;
        hashMap.put("price_drop_min_value", n4);
        hashMap.put("enableIMPS", constable);
        hashMap.put("enable_customer_care", constable);
        hashMap.put("closetCacheEnable", constable);
        hashMap.put("CacheClearanceTime", jSONObject);
        hashMap.put("enable_advance_filter", constable);
        hashMap.put("enable_rating_dialog", constable);
        Object object9 = -1;
        Integer n7 = object7;
        hashMap.put("ratingPosition", object9);
        hashMap.put("rating_later_count", object);
        hashMap.put("newCartDesign", bl2);
        hashMap.put("enableFB", constable);
        hashMap.put("ABAjioEnableGoogle", constable);
        hashMap.put("ABAjioEnableSocialLoginSignUp", constable);
        hashMap.put("updatetitle", string2);
        hashMap.put("appupdateimageurl", string2);
        hashMap.put("updatetext", string2);
        hashMap.put("message", string2);
        hashMap.put("checkExternalEmployee", bl2);
        hashMap.put("checkInternalEmployee", bl2);
        object7 = 808;
        hashMap.put("min_versioncode", object7);
        object7 = 961;
        hashMap.put("current_versioncode", object7);
        hashMap.put("chopQueryParams", "gclid|utm_|_ga");
        hashMap.put("homePageCardPosition", jSONObject);
        hashMap.put("pdp_expand_capsule", constable);
        hashMap.put("pdp_expand_prod_detail", constable);
        hashMap.put("pdp_expand_shop_look", constable);
        hashMap.put("enable_search_screen_topcategories", bl2);
        hashMap.put("android_slp_visual_gender_filter", bl2);
        hashMap.put("android_slp_visual_filters_to_show", string2);
        hashMap.put("SearchAPI_Exp", string2);
        hashMap.put("AutosuggestionAPI_Exp", string2);
        hashMap.put(object3, bl2);
        hashMap.put("android_dropAtStoreEnable", bl2);
        hashMap.put("feedback_email_id", "ajioapp_feedback@ril.com");
        hashMap.put("android_dropAtStoreInfoMsg", string2);
        hashMap.put(object2, bl2);
        hashMap.put("shipping_add_address", bl2);
        hashMap.put(object4, bl2);
        hashMap.put(object5, bl2);
        object2 = 1;
        hashMap.put("shipping_edd_error_btn_count", object2);
        hashMap.put("android_download_invoice", bl2);
        hashMap.put("android_plp_offer", bl2);
        hashMap.put("android_plp_search_exit_feedback", bl2);
        hashMap.put("search_categories", string2);
        hashMap.put("notification_variant", string2);
        hashMap.put("android_plp_visual_size_filter_max_count", object8);
        hashMap.put("android_slp_visual_filter_max_count", object);
        hashMap.put("android_plp_visual_size_filter", bl2);
        object3 = 300;
        hashMap.put("internet_check_interval_time", object3);
        object3 = 3;
        hashMap.put("internet_check_retry_count", object3);
        hashMap.put("offer_header", string2);
        hashMap.put("offer_text", string2);
        hashMap.put("offer_link", string2);
        hashMap.put("offer_start_time", string2);
        hashMap.put("offer_end_time", string2);
        hashMap.put("android_enable_appfeedback", bl2);
        hashMap.put("notif_freq_hours", jSONObject);
        hashMap.put("FIREBASE_PLP_DISABLE_DID_YOU_MEAN_KEY", bl2);
        hashMap.put("search_rv_on_off", bl2);
        hashMap.put("FIREBASE_ZSR_DISABLE_SUGGESTION_KEY", bl2);
        hashMap.put("enablePickupstore", bl2);
        hashMap.put("android_closet_card_in_home", bl2);
        hashMap.put("android_closet_card_max_click", object3);
        hashMap.put("android_closet_card_max_days", object6);
        hashMap.put("pickupAtStoreAvailableMessage", string2);
        hashMap.put("android_pdp_share_best_price_new", bl2);
        hashMap.put("android_pdp_share_price_new", bl2);
        hashMap.put("android_pdp_share_coupons_new", bl2);
        hashMap.put("android_pdp_utm_content", string2);
        hashMap.put("android_pdp_utm_campaign", string2);
        hashMap.put("android_pdp_utm_medium", string2);
        hashMap.put("android_pdp_utm_source", string2);
        hashMap.put("android_pdp_utm_term", string2);
        hashMap.put("android_pdp_share_url_short", bl2);
        hashMap.put("burst_network_cache", bl2);
        hashMap.put("android_accept_ssl", "bluedart,delhivery,xpressbees,ecomexpress");
        hashMap.put("android_closet_share", bl2);
        object4 = (long)30;
        hashMap.put("NETWORK_CACHE_INTERVAL", object4);
        hashMap.put("CC_CHAT", bl2);
        hashMap.put("CALL_ME_BACK", bl2);
        hashMap.put("loyaltyEnable", bl2);
        hashMap.put("faq_search_ui_new", constable);
        hashMap.put("enableDiscountForPdp", bl2);
        hashMap.put("discountValForPdp", jSONObject);
        hashMap.put("payment_options_ui_ab", bl2);
        hashMap.put("payment_trust_marker_enabled", bl2);
        hashMap.put("payment_trust_marker_message", string2);
        hashMap.put("payment_bottom_message", string2);
        hashMap.put("locale_gps_enable", bl2);
        hashMap.put("locale_gps_perm_duration", object);
        hashMap.put("pdp_image_size_chart_enable", bl2);
        hashMap.put("pdp_size_chart_position", n3);
        hashMap.put("imps_enable", constable);
        hashMap.put("isCodMessageEnable", bl2);
        hashMap.put("plp_sizes_enable", bl2);
        hashMap.put("ENABLE_CHUCK_IMAGES", bl2);
        hashMap.put("android_locale_dialog_enable", bl2);
        hashMap.put("enable_locale", bl2);
        hashMap.put("android_landing_page_redirect", string2);
        hashMap.put("pdp_view_pager_page_offset", n3);
        hashMap.put("return_exchange_message_enable", bl2);
        hashMap.put("return_exchange_info_dialog_message", string2);
        hashMap.put("dod_start_end_time", string2);
        hashMap.put("revamp_cart_qa_text", "Assured Quality  |  100% Handpicked  |  Easy Exchange");
        object4 = 25;
        hashMap.put("plp_page_size", object4);
        hashMap.put("cc_email_enable", constable);
        hashMap.put("cc_helpline_enable", constable);
        hashMap.put("zero_search_result_switch_enable", bl2);
        hashMap.put("selfcarekeys", string2);
        hashMap.put("flag_store_switch", constable);
        hashMap.put("hambuger_store_switch_enable", bl2);
        hashMap.put("wrong_product_reason", "Wrong Item Shipped:Wrong Color Delivered#Wrong Item Shipped:Delivered wrong size");
        hashMap.put("luxe_enable", constable);
        hashMap.put("enable_UUID_Curated", bl2);
        hashMap.put("enable_UUID_Category", bl2);
        hashMap.put("enable_UUID_search", bl2);
        hashMap.put("enable_glide_cache_clear", bl2);
        hashMap.put("unisex_home_page_id", "/shop/women");
        hashMap.put("ajiogram_home_page_default_id", "shop/ajiogram");
        hashMap.put("enable_mark_as_delivered", bl2);
        hashMap.put("Selfcare_Complaint_Card_reopened", bl2);
        hashMap.put("enableR1Points", bl2);
        hashMap.put("android_response_json_parsing_enable", bl2);
        hashMap.put("android_5xx_response_convert_to_json", bl2);
        hashMap.put("enableIfscValidation", bl2);
        hashMap.put("ifsc_validation_url", "https://www.rbi.org.in/Scripts/IFSCMICRDetails.aspx");
        hashMap.put("enable_my_rewards_status", "{\"title\":\"My Rewards\",\"isNewTag\":true,\"webUrlLink\":\"https://www.ajio.com/my-account/my-rewards\",\"isEnabled\":false}");
        hashMap.put("brand_description_enable", bl2);
        hashMap.put("find_page_deeplink_enable", bl2);
        hashMap.put("referral_feature_enable", bl2);
        hashMap.put("referrer_enable", bl2);
        hashMap.put("referee_enable", bl2);
        hashMap.put("display_referral_new_tag", bl2);
        hashMap.put("ajio_wallet_page_size", object4);
        hashMap.put("referral_share_message", "Your Friend %s invited you to join Ajio. Use his code %s to sign up and earn %sAJIO Cash.");
        hashMap.put("referee_widget_time", object8);
        hashMap.put("referral_widget_pdp_enable", bl2);
        hashMap.put("referral_widget_order_enable", bl2);
        hashMap.put("referral_widget_wallet_enable", bl2);
        hashMap.put("pdp_customer_pincode_edd", bl2);
        hashMap.put("non_transferable_cash_enable", bl2);
        hashMap.put("app_revamp", constable);
        hashMap.put("in_app_rating_dialog", bl2);
        hashMap.put("in_app_rating_dialog_delay", object);
        hashMap.put("enable_gamification", bl2);
        hashMap.put("enable_juspay", bl2);
        hashMap.put("enable_ssl_socket_custom_impl", constable);
        hashMap.put("cc_email_response_time", string2);
        hashMap.put("append_platform_info", constable);
        object4 = 45;
        hashMap.put("rtb_house_timeout", object4);
        hashMap.put("user_type_timeout", object);
        hashMap.put("pdp_gst_info", string2);
        hashMap.put("otp_intervention_enabled", bl2);
        hashMap.put("check_for_core", bl2);
        hashMap.put("utm_install_referrer_timeout", object);
        object5 = SSLProvider.getInstance().getValidSSLFallbackPins();
        Intrinsics.checkNotNullExpressionValue(object5, "getValidSSLFallbackPins(...)");
        object5 = tp_2.G(62, ",", object5);
        hashMap.put("ssl_pinning_public_keys", object5);
        hashMap.put("firebase_setup_failure_event_enable", constable);
        hashMap.put("api_performance_metric", bl2);
        hashMap.put("show_home_button_on_plp", bl2);
        hashMap.put("enableCodCaptcha", bl2);
        hashMap.put("pdp_bank_offer_enable", bl2);
        hashMap.put("enableOrderListDateFilter", bl2);
        hashMap.put("sis_splash_exp", bl2);
        hashMap.put("otp_popup_display_mobile", constable);
        hashMap.put("otp_popup_display_email", constable);
        hashMap.put("cc_luxe_chat_enable", bl2);
        hashMap.put("cc_luxe_helpline_enable", bl2);
        hashMap.put("cc_luxe_email_enable", bl2);
        hashMap.put("search_redirect_key", bl2);
        hashMap.put("use_store_field_search_redirect", bl2);
        hashMap.put("show_similar_items_on_cart", bl2);
        hashMap.put("adid_fetcher", bl2);
        hashMap.put("returnCapture", "{\"isNewOne\": true,   \"exchangeMessage\": \"Exchange is not available for the selected address\",   \"selfShipMessage\": \"This is a self ship request. After placing the request, please send the products to our address.\"}");
        object4 = "nav_luxe_banner";
        hashMap.put(object4, "{\"node\":\"AppNavBar\",\"storeId\":\"rilfnl\",\"switchStoreUrl\":\"luxe\",\"switchtoStoreIcon\":\"https://assets.ajio.com/medias/sys_master/root/hd7/h5b/17550180778014/Ajio-Luxe-banner-3x.png\",\"switchtoStoreId\":\"luxe\"}");
        object5 = "nav_ajio_banner";
        hashMap.put(object5, "{\"node\":\"LUXURY APP\",\"storeId\":\"luxe\",\"switchStoreUrl\":\"rilfnl\",\"switchtoStoreIcon\":\"https://assets.ajio.com/medias/sys_master/root/h36/h2d/34605626228766/AJIO-banner-2-.jpg\",\"switchtoStoreId\":\"rilfnl\"}");
        hashMap.put("CMSConfig", "{\n  \"masterFlag\": true,\n  \"isLuxeHomePageEnabled\": true,\n  \"isLuxeTopCategoryEnabled\": true,\n  \"luxeDefaultHomePageUrl\": \"/shop/luxe\",\n  \"clusterParamForHome\": true,\n  \"previewUrlForHome\": \"https://www.ajio.com/cms-editor/v1/page/preview\",\n  \"previewUrlForNav\": \"https://www.ajio.com/cms-editor/v1/navigation/preview\",\n  \"sideNavigationForAjio\": true,\n  \"sideNavigationForLuxe\": true,\n  \"bottomNavigationForAjio\": true,\n  \"bottomNavigationForLuxe\": true,\n  \"isAjioHomePageEnabled\": true,\n  \"isProductWidgetEnabledForAjio\": true,\n  \"isProductWidgetEnabledForLuxe\": true,\n  \"isStoreMetadataEnabled\": true,\n  \"isBrandEnabledForLuxe\": false,\n  \"isBrandImageEnabledForLuxe\": false,\n  \"isSTLEnabledForAjio\": false,\n  \"isSTLEnabledForLuxe\": false,\n  \"isRecentlyViewedEnabledForAjio\": true,\n  \"isRecentlyViewedEnabledForLuxe\": true,\n  \"recentlyViewedHomePageMax\": 10,\n  \"recentlyViewedHomePageMin\": 4,\n  \"sideNavigationForSteet\": false,\n  \"apiVersion\": \"v3\",\n  \"previewUrl\": {\n    \"prodHome\": \"https://www.ajio.com/cms-editor/v1/page/preview\",\n    \"prodNav\": \"https://www.ajio.com/cms-editor/v1/navigation/preview\",\n    \"uatHome\": \"https://uat.services.ajio.com/cms-editor/v1/page/preview\",\n    \"uatNav\": \"https://uat.services.ajio.com/cms-editor/v1/navigation/preview\"\n  },\n  \"supportedStoresForPreview\": [\n    {\n      \"name\": \"AJIO\",\n      \"id\": \"ajio\"\n    },\n    {\n      \"name\": \"LUXE\",\n      \"id\": \"luxe\"\n    },\n    {\n      \"name\": \"TRENDS\",\n      \"id\": \"trends\"\n    },\n    {\n      \"name\": \"MUJI\",\n      \"id\": \"muji\"\n    },\n    {\n      \"name\": \"JIOPOINT\",\n      \"id\": \"jiopoint\"\n    },\n    {\n      \"name\": \"AZORTE\",\n      \"id\": \"azorte\"\n    },\n    {\n      \"name\": \"GAP\",\n      \"id\": \"gap\"\n    },\n    {\n      \"name\": \"AVANTRA\",\n      \"id\": \"avantra\"\n    }\n  ]\n}");
        hashMap.put("cms_url_list", "[\"/shop/t-shirts-for-men\",\"/cart/banner\",\"/shop/shirts\",\"/shop/ajiomania-sale-shp\",\"/shop/ajio\",\"/shop/sale\",\"/shop/early-access\",\"/shop/pre-buzz\",\"/shop/spring-summer\",\"/shop/accessories\",\"/shop/assured-gifts\",\"/shop/saving-calculator\",\"/shop/watches\",\"/shop/womenswear\",\"/shop/menswear\",\"/shop/kidswear\",\"/shop/men\",\"/shop/women\",\"/shop/kids\",\"/shop/international-brands\",\"/shop/footwear\",\"/shop/sports-wear\",\"/shop/womens-lingerie\",\"/shop/mens-innerwear\",\"/shop/mothers-day\",\"/shop/max\",\"/shop/ajio-gold\",\"/shop/superstyledays\",\"/shop/dummy1\",\"/shop/indie\",\"/shop/beautystore\",\"/shop/yoga-wear\",\"/shop/women-western-wear-BSD\",\"/shop/the-spring-summer-edit\",\"/shop/workwear\",\"/shop/sloungewear\",\"/shop/very-pari\",\"/shop/wedding-store\",\"/shop/armani-exchange\",\"/shop/g-star-raw\",\"/shop/thank-you-page\",\"/shop/scotch-soda\",\"/shop/azorte\",\"/shop/homestore\",\"/shop/raksha-bandhan\",\"/shop/andamen\",\"/shop/avantra\",\"/shop/stores\",\"/shop/onam-store\",\"/shop/autumn-winter-2022\",\"/shop/trends-spotter-sep\",\"/shop/festive-page\",\"/shop/durga-puja\",\"/shop/gap\",\"/shop/azorte\",\"/shop/marksandspencer\",\"/shop/spotter\",\"/shop/editdiwali\",\"/shop/jewelers\",\"/shop/sobhita\",\"/shop/luxe-menswear\",\"/shop/luxe\",\"/shop/luxe-men\",\"/shop/luxe-women\",\"/shop/luxe-lifestyle\",\"/shop/luxe-beauty\",\"/shop/luxe-sbc-uhp\",\"/shop/luxe-sbc-men\",\"/shop/luxe-sbc-women\",\"/shop/luxe-sbc-beauty\",\"/shop/luxe-sbc-home\",\"/shop/hot-pink\",\"/shop/luxe-brand-bally\",\"/shop/luxe-brand-canali\",\"/shop/luxe-footwear\",\"/shop/luxe-edit-home\",\"/shop/luxe-cover-story\",\"/shop/luxe-women-apparel\",\"/shop/saree\",\"/shop/luxe-diesel\",\"/shop/luxe-emporio-armani\",\"/shop/luxe-winterwear\",\"/shop/luxe-accessories\",\"/shop/latest-drop\",\"/shop/the-list\",\"/shop/the-sneaky-trivia\",\"/shop/sneaker-store\",\"/shop/encrustd\",\"/shop/luxe-gifting\",\"/shop/luxe-brand-kate-spade\",\"/shop/luxe-brand-stella-mccartney\",\"/shop/luxe-brand-hugo-boss\",\"/shop/international-brands-page\",\"/shop/luxe-the-party-starters\",\"/shop/luxe-evening-wear\",\"/shop/aditya-bhalla\",\"/shop/replay\",\"/shop/luxe-michael-kors\",\"/shop/luxe-jimmy-choo\",\"/shop/luxe-shantanu-nikhil\",\"/shop/vijay-varma\",\"/shop/luxe-brand-ak-ok\",\"/shop/luxe-brand-coccinelle\",\"/shop/xint\",\"/shop/luxe-paul-smith\",\"/shop/luxe-ontisuka-tiger\",\"/shop/luxe-brand-toms\",\"/shop/luxe-paul-shark\",\"/shop/luxe-ferragamo\",\"/shop/luxe-zegna\",\"/shop/luxe-luggage-travel\",\"/shop/fashion-moments\",\"/shop/luxe-satya-paul-brand\",\"/shop/luxe-dsquared2\",\"/shop/luxe-brand-kenzo\",\"/shop/luxe-brands-marc-jacobs\",\"/shop/luxe-brands-by-far\",\"/shop/luxe-brands-ami-paris\",\"/shop/luxe-tumi\",\"/shop/luxe-veja\",\"/shop/luxe-story-vacation-mode\",\"/shop/luxe-alice-and-olivia\",\"/shop/luxe-brand-zimmermann\",\"/shop/luxe-self-portrait\",\"/shop/luxe-wedding-carnival\",\"/shop/yash-pradhan\",\"/shop/luxe-villeroy-and-boch\",\"/shop/luxe-paige\",\"/shop/luxe-brand-msgm-srl\",\"/shop/luxe-all-saints\",\"/shop/luxe-brand-simone\",\"/shop/hunkemoller\",\"/shop/muji\",\"/shop/temperature-drop\",\"/shop/luxe-cult-gaia\",\"/shop/buda-jeans-co\",\"/shop/stories-page\",\"/shop/luxe-story-home-stretch\",\"/shop/brand-cover-story\",\"/shop/luxe-story-valentines-day\",\"/shop/luxe-tory-burch\",\"/shop/luxe-story-valentinesday-gifting\",\"/shop/premium-men\",\"/shop/premium-men\",\"/shop/premium-women\",\"/shop/valentinesday-story\",\"/shop/luxe-story-valentinesday-women-gifting\",\"/shop/luxe-category-kidswear\",\"/shop/luxe-lingerie-loungewear\",\"/shop/supersonic-page\",\"/shop/brand-toms\",\"/shop/supersonic-event\",\"/shop/brand-ltb\",\"/shop/trends\",\"/shop/luxe-category-home\",\"/shop/luxe-category-womens-apparel\",\"/shop/luxe-sneaker-story\",\"/shop/story-one-palette\",\"/shop/supersonic-event1\",\"/shop/supersonic-event2\",\"/shop/supersonic-event3\",\"/shop/supersonic-event4\",\"/shop/luxe-giorgio-armani\",\"/shop/explore-more-brands\",\"/shop/brand-dune-london\",\"/shop/steve-madden\",\"/shop/howtomeasure-1\",\"/shop/howtomeasure-2\",\"/shop/howtomeasure-3\",\"/shop/howtomeasure-3-shoulder\",\"/shop/howtomeasure-3-bust\",\"/shop/howtomeasure-3-waist\",\"/shop/howtomeasure-3-inseam\",\"/shop/howtomeasure-4-shoulder\",\"/shop/howtomeasure-4-chest\",\"/shop/howtomeasure-4-waist\",\"/shop/howtomeasure-4-inseam\",\"/shop/brand-encrustd-spring-launch\",\"/shop/active-wear-store\",\"/shop/purple-reign-story\",\"/shop/green-acid-story\",\"/shop/luxe-jewellery-carnival\",\"/shop/april-fool\",\"/shop/april-fool-uorfi-javed\",\"/shop/explore-more\",\"/shop/uorfi-javed\",\"/shop/uorfi-javed-x-ajio\",\"/shop/luxe-story-valentinesday-women-gifting?isAdsEnabled=true\",\"/shop/luxe-story-home-stretch?isAdsEnabled=true\",\"/shop/luxe-gifting?isAdsEnabled=true\",\"/shop/luxe-sbc-uhp?isAdsEnabled=true\",\"/shop/luxe-sbc-beauty?isAdsEnabled=true\",\"/shop/luxe-sbc-home?isAdsEnabled=true\",\"/shop/luxe-story-valentines-day?isAdsEnabled=true\",\"/shop/luxe-story-valentinesday-gifting?isAdsEnabled=true\",\"/shop/luxe-story-vacation-mode?isAdsEnabled=true\",\"/shop/luxe-cover-story?isAdsEnabled=true\",\"/shop/luxe-the-party-starters?isAdsEnabled=true\",\"/shop/luxe-brand-tods\",\"/shop/luxe-footwear?isAdsEnabled=true\",\"/shop/lingerie-edit\",\"/shop/fyre-rose\",\"/shop/trends-footwear\",\"/shop/fnl-footwear\",\"/shop/santanu-hazarika\",\"/shop/luxe-autumn-winter-2022-story\",\"/shop/luxe-collectors-edit-story\",\"/shop/luxe-anya-hindmarch-story\",\"/shop/campus\",\"/shop/luxe-Allia-Al-Rufai-story\",\"/shop/luxe-festive-edit-story\",\"/shop/luxe-present-perfect-story\",\"/shop/luxe-sneaker-story\",\"/shop/luxe-ultimate-decor-story\",\"/shop/luxe-sneaker-story-page\",\"/shop/luxe-akshay-tyagi-story\",\"/shop/luxe-eyewear\",\"/shop/luxe-coach\",\"/shop/luxe-brand-bottega-veneta\",\"/shop/gap-the-denim-edit\",\"/shop/beverly-hills-polo-club\",\"/shop/lacoste\",\"/shop/adidas-kids\",\"/shop/luxe-quiet-luxury-story\",\"/shop/earn-and-burn-page\",\"/shop/sneaker-hanumankind\",\"/shop/luxe-the-met-gala\",\"/shop/trend-spotter-maternity-wear\",\"/shop/luxe-brand-hugo\",\"/shop/luxe-luggage-and-travel-carnival\",\"/shop/luxe-brand-armani-junior\",\"/shop/cargo\",\"/shop/brand-puma\",\"/shop/luxe-handbags\",\"/shop/fun-zone\",\"/shop/trivia-no\",\"/shop/trivia-yes\",\"/shop/reason-to-shop\",\"/shop/brooks-brothers\",\"/shop/brooks-brothers-men\",\"/shop/brooks-brothers-women\",\"/shop/gifting-page\",\"/shop/fathers-day\",\"/shop/only\",\"/shop/gifting-guide\",\"/shop/summer-style\",\"/shop/luxe-match-point\",\"/shop/luxe-summer-livin\",\"/shop/djnida\",\"/shop/giftcard\",\"/shop/luxe-colours-of-summer\",\"/shop/brandmania\",\"/shop/luxe-edit-beauty\",\"/shop/jack-and-jones\",\"/shop/style-edit-by-shanaya-kapoor\",\"/shop/brand-adidas\",\"/shop/barbie-and-ken\",\"/shop/first-customer-page\",\"/shop/luxe-watches-page\",\"/shop/vero-moda\",\"/shop/only\",\"/shop/abhishek-choudhary\",\"/shop/luxe-watches-edit\",\"/shop/riwah\",\"/shop/indie-invite\",\"/shop/luxe-vacation-edit\",\"/shop/luxe-brand-dkny\",\"/shop/luxe-men-icw-story\",\"/shop/luxe-made-in-heaven-story\",\"/shop/womens-denim-edit\",\"/shop/mens-denim-edit\",\"/shop/luxe-feeling-at-home\",\"/shop/foundry\",\"/shop/brand-sam\",\"/shop/teaser\",\"/shop/beauty-page\",\"/shop/yousta\",\"/shop/5-min-beauty\",\"/shop/powder-room\",\"/shop/mua\",\"/shop/homegrown-brands-store\",\"/shop/luxe-handbag-story\",\"/shop/superdry\",\"/shop/luxe-story-italian-autumn\",\"/shop/the-community\",\"/shop/style-edit\",\"/shop/report-in\",\"/shop/in-hue\",\"/shop/in-fashion\",\"/shop/latest-stories\",\"/shop/galactic-cobalt\",\"/shop/luxe-story-diesel\",\"/shop/luxe-story-the-wedding-edit\",\"/shop/promotions\",\"/shop/promotions-page\",\"/shop/promotions-page-store\",\"/shop/luxe-farm-rio\",\"/shop/dussehra-page\",\"/shop/luxe-fashion-takes-flight\",\"/shop/luxe-sbc-whp\",\"/shop/luxe-sbc-mhp\",\"/shop/indiepicks\",\"/shop/trndin-brown\",\"/shop/luxe-play-the-field\",\"/shop/festive-story\",\"/shop/luxe-the-starry-closet\",\"/shop/luxe-the-starry\",\"/shop/luxe-story-bags-beauty\",\"/shop/luxe-amiri-story\",\"/shop/blush-hack-tira\",\"/shop/glass-hair-tira\",\"/shop/k-beauty-tira\",\"/shop/dhruv-kapoor\",\"/shop/winterwear-store\",\"/shop/luxe-brand-amiri\",\"/shop/luxe-lfw-the-vault\",\"/shop/indie-picks-editorial\",\"/shop/luxe-coach-story\",\"/shop/luxe-diwali-story-2023\",\"/shop/luxe-sourabh-gupta\",\"/shop/festive-footwear\",\"/shop/luxe-woolmark-category-page\",\"/shop/luxe-woolmark-story-page\",\"/shop/ajio-vibe-tribe\",\"/shop/black-friday-pre-buzz\",\"/shop/luxe-story-shoes-bags\",\"/shop/luxe-dopamine-story\",\"/shop/luxe-chunky-knits-story\",\"/shop/hamleys\",\"/shop/luxe-meghna-goyal-story\",\"/shop/lowest-price-ever\",\"/shop/trndin-y2k-denim\",\"/shop/giftingstore-new\",\"/shop/giftingstore\",\"/shop/comic-con\",\"/shop/luxe-order-for-glamour\",\"/shop/luxe-winter-skincare\",\"/shop/men-westernwear\",\"/shop/women-westernwear\",\"/shop/partywear-for-men\",\"/shop/partywear-for-women\",\"/shop/luxe-story-ace-the-base\",\"/shop/luxe-ak-ok\",\"/shop/luxe-top-stories-menu\",\"/shop/luxe-fashion-stories\",\"/shop/luxe-beauty-stories\",\"/shop/luxe-home-stories\",\"/shop/luxe-gifting-stories\",\"/shop/luxe-lifestyle-culture-stories\",\"/shop/luxe-story-candle\",\"/shop/luxe-story-colour-therapy\",\"/shop/luxe-holi-jewellery-story\",\"/shop/luxe-rhea-kapoor-story\",\"/shop/luxe-joyeeta-story\",\"/shop/luxe-maskproof-your-lipstick-story\",\"/shop/luxe-microtrend-the-return-of-sexy-dressing-story\",\"/shop/luxe-quiet-luxury-story\",\"/shop/luxe-sara-tendulkar-story\",\"/shop/luxe-shivan-and-narresh-story\",\"/shop/luxe-suchir-story-style-stamps\",\"/shop/luxe-suchitra-material-girl-story\",\"/shop/luxe-sunny-side-up-story\",\"/shop/luxe-happy-holiday-christmas-story-2022\",\"/shop/luxe-red-lipstick-story\",\"/shop/luxe-dopamine-story\",\"/shop/luxe-chunky-knits-story\",\"/shop/luxe-story-cheek-it-up\",\"/shop/luxe-story-fit-fab-luxury-that-lasts\",\"/shop/luxe-fashion-stories\",\"/shop/luxe-beauty-stories\",\"/shop/luxe-home-stories\",\"/shop/luxe-people-stories\",\"/shop/women-wedding-page\",\"/shop/fabindia\",\"/shop/men-wedding-page\",\"/shop/luxe-celeb-guide-to-luxury-reds\",\"/shop/luxe-woolmark-luxury-warm\",\"/shop/superdry-aryan-style-edit\",\"/shop/luxe-villeroy-boch\",\"/shop/luxe-travel-edit-out-of-office\",\"/shop/winter-travel-page\",\"/shop/backpack-checklist\",\"/shop/luxe-new-year-new-surprise\",\"/shop/luxe-mindfulness-with-luxury\",\"/shop/tirabeauty-five-minutes-beauty-ritual\",\"/shop/tirabeauty-powder-room\",\"/shop/tirabeauty-a-celeb-mua\",\"/shop/tirabeauty\",\"/shop/reliance-sbi-cobranded-credit-cards\",\"/shop/allfestivals\",\"/shop/luxe-pangaias-science-of-fashion\",\"/shop/luxe-brand-pangaia\",\"/shop/peach-nougat\",\"/shop/luxe-future-of-shopping-weekend\",\"/shop/gant\",\"/shop/luxe-valentines-gifting-store\",\"/shop/luxe-fashion-seasons-luxury-learnings\",\"/shop/giva\",\"/shop/luxe-the-big-love-list\",\"/shop/charles-tyrwhitt\",\"/shop/valentines-day-edit\",\"/shop/portico\",\"/shop/luxe-eye-wear-selections\",\"/shop/luxe-art-of-carts-sake\",\"/shop/reliance-jewels\",\"/shop/naser-sneakerhood\",\"/shop/kids-premium-page\",\"/shop/holistore\",\"/shop/luxe-taylor-swift-style-guide\",\"/shop/luxe-wrap-and-roll-across-time\",\"/shop/explore-brands\",\"/shop/spring-summer-trendin\",\"/shop/luxe-about-ajio-luxe\",\"/shop/luxe-who-we-are\",\"/shop/luxe-brands-on-luxe\",\"/shop/luxe-the-luxe-experience\",\"/shop/gadgets\",\"/shop/luxe-brand-isharya\",\"/shop/luxe-holi-2024-celebrating-makeup\",\"/shop/festive-eid\",\"/shop/luxe-denim-collections\",\"/shop/april-fools-day\",\"/shop/the-futurefit-at-ajio\",\"/shop/luxe-top-trends-lfw-fdci\",\"/shop/luxe-story-valentino-born-in-roma\",\"/shop/amante\",\"/shop/clovia\",\"/shop/zivame\",\"/shop/juniper\",\"/shop/myntra\",\"/shop/luxe-story-divyak-dsouza\",\"/shop/luxe-brands-speak\",\"/shop/lothika-super-sonic\",\"/shop/citron-notes-story\",\"/shop/brand-puma-running\",\"/shop/brand-puma-sports\",\"/shop/brand-puma-men\",\"/shop/brand-puma-women\",\"/shop/brand-puma-teens\",\"/shop/brand-puma-kids\",\"/shop/brand-puma-support-your-team\",\"/shop/luxe-story-AKOK-Anamika-Khanna\",\"/shop/luxe-story-Coffee-Culture\",\"/shop/cod-video-english\",\"/shop/cod-video-hindi\",\"/shop/return-english\",\"/shop/return-hindi\",\"/shop/return-creation-demo\",\"/shop/ipl-store\",\"/shop/luxe-story-Haute-Watch-List\",\"/shop/impetus-page\",\"/shop/impetus-page-two\",\"/shop/luxe-brand-ray-ban\",\"/shop/impetus-page-riya\",\"/shop/impetus-page-shivani\",\"/shop/summer-travel-page\",\"/shop/impetus-page-cipia\",\"/shop/impetus-page-harshita\",\"/shop/impetus-page-priyanka\",\"/shop/impetus-page-simran\",\"/shop/luxe-brand-behno\",\"/shop/superdry-karthik-aryan-summer-edit\",\"/shop/luxe-story-How-To-Fashion-Tenniscore\",\"/shop/luxe-story-Met-Gala-2024-Beauty\",\"/shop/house-of-Ritukumar\",\"/shop/luxe-coach-tabby-store\",\"/shop/biba\",\"/shop/Emporio-Armani\",\"/shop/luxe-OR-brand-page\",\"/shop/federal-bank-cc\",\"/shop/federal-bank-dc\",\"/shop/au-bank-cc\",\"/shop/au-bank-dc\",\"/shop/dbs-bank-cc\",\"/shop/dbs-bank-dc\",\"/shop/yes-bank-cc\",\"/shop/yes-bank-dc\",\"/shop/icici-bank-cc\",\"/shop/icici-bank-dc\",\"/shop/instant-discount\",\"/shop/one-card-bank\",\"/shop/mobikwik-cashback\",\"/shop/mobikwik-upi\",\"/shop/mobikwik-new-user\",\"/shop/paytm-cashback\",\"/shop/phonepe-cashback\",\"/shop/sbi-reliance-prime\",\"/shop/sbi-reliance-base\",\"/shop/fi-federal-cashback\",\"/shop/bob-bank-cc\",\"/shop/bob-bank-dc\",\"/shop/idfc-bank-cc\",\"/shop/idfc-bank-dc\",\"/shop/flash-cashback\",\"/shop/indusind-bank-cc\",\"/shop/indusind-bank-dc\",\"/shop/citi-bank-cc\",\"/shop/citi-bank-dc\",\"/shop/axis-bank-cc\",\"/shop/axis-bank-dc\",\"/shop/hsbc-bank-cc\",\"/shop/hsbc-bank-dc\",\"/shop/hdfc-bank-cc\",\"/shop/hdfc-bank-dc\",\"/shop/heeramandi-page\",\"/shop/luxe-story-Cannes-2024\",\"/shop/in-the-middle\",\"/shop/sbi-co-branded\",\"/shop/luxe-Fathers-Day-page\",\"/shop/luxe-coach-tabby-shop\",\"/shop/luxe-story-Holiday-Edit-Indian-Summer\",\"/shop/pre-buzz-new\",\"/shop/premiumcopyedition\",\"/shop/curve-page\",\"/shop/srh-asos\",\"/shop/luxe-srh-asos\",\"/shop/summer-beauty-handbook\",\"/shop/luxe-story-Celeb-Starring-Holiday-2024\",\"/shop/brand-forever-new\",\"/shop/luxe-story-thermos-in-fashion\",\"/shop/pre-buzz-unreal\",\"/shop/pre-buzz-blink\",\"/shop/pre-buzz-special-deals\",\"/shop/luxe-brand-ritu-kumar\",\"/shop/luxe-srh-hnm\",\"/shop/srh-hnm\",\"/shop/luxe-story-Paris-Fashion-Week-Haute-Couture-AW24\",\"/shop/luxe-rakshabandhan-gifting-page\",\"/shop/luxe-story-paris-olympics-2024-lvmh\",\"/shop/luxe-luna\",\"/shop/luxe-story-fashions-formula-one\",\"/shop/sale\",\"/shop/men\",\"/shop/edit-page\",\"/shop/asos\",\"/shop/tira-beauty-page\",\"/shop/luxe-versace\",\"/shop/luxe-easy-emi-payments\",\"/shop/luxe-story-bridal-broadcast\",\"/shop/luxe-polo-carnival\",\"/shop/asos-men\",\"/shop/asos-edit-page\",\"/shop/luxe-tissot-coming-soon\",\"/shop/luxe-story-amit-aggarwal-interview\",\"/shop/sneaker-drobe-store\",\"/shop/luxe-story-six-ways-to-gift-luxury\"]");
        hashMap.put("supported_stores", "[\"trends\" , \"luxe\" , \"muji\"]");
        hashMap.put("ConvenienceFeeConfig", "{\n  \"masterFlag\": false,\n  \"isCodFeeApplicable\": false,\n  \"isRvpFeeApplicable\": false,\n  \"isConvFeeOrderDetailEnable\": false,\n  \"convenienceFeeTitle\": \"Convenience Fee\",\n  \"infoLabel\": \"What\u2019s this?\",\n  \"deliveryFeeLabel\": \"Delivery Fee\",\n  \"platformConvenienceFeeLabel\": \"Platform Fee\",\n  \"cashOnDeliveryFeeLabel\": \"Cash on Delivery Fee\",\n  \"priorityDeliveryFeeLabel\": \"Priority Delivery Fee\",\n  \"totalConvenienceFeeLabel\": \"Total Convenience Fee\",\n  \"deliveryFeeDesc\": \"This fee is charged to cover the logistics cost\",\n  \"platformConvenienceFeeDesc\": \"This fee is charged to ensure a hassle-free shopping and delivery experience for you. It is used to maintain a strong delivery network and stock availability.\",\n  \"codFeeDesc\": \"This fee is charged to provide you with the convenience of paying for orders at your doorstep.\",\n  \"priorityDeliverDesc\": \"Charged to deliver your product on Priority\",\n  \"codPopUpTopDesc\": \"You have opted to pay cash on delivery. To <b>save COD fees of %s, </b>you can choose prepaid mode of payment\",\n  \"codPopUpTopDescFree\": \"Yay! No Cash on Delivery Fee on this order\",\n  \"convenienceFeeNote\": \"\",\n  \"codExtraDeliveryText\": \"<b>%s will be charged</b> extra for Cash on Delivery\",\n  \"orderConfirmReadPolicy\": \"In case you return any product, Convenience Fee will not be refunded Read policy\",\n  \"returnRefundReadPolicy\": \"%s charged as Convenience Fee will not be refunded Read policy\",\n  \"priorityDeliveryLabel\": \"Priority Delivery Fee\"\n}");
        hashMap.put("cartExchangeReturnPolicy", "{\"masterFlag\":false,\"cartReturnRefundTitle\":\"Return/exchange or refund policy\",\"cartReturnRefundMsg\":\"[\n    \"In case of return or refund convenience charges will not be refunded\",\n    \"Convenience fee which includes delivery fee & shopping convenience charges are non refundable.\"\n  ]\",\"returnPolicyLinkText\":\"Read policy\",\"returnPolicyLinkUrl\":\"https://www.ajio.com/return-refund-policy\"}");
        hashMap.put("call_me_time_slot_enable", bl2);
        hashMap.put("call_me_est_wait_time_enable", bl2);
        hashMap.put("show_wishlist_on_cart", bl2);
        hashMap.put("referral_widget_message", "You get %s AJIO Cash for every friend");
        hashMap.put("retain_search_query", bl2);
        object9 = "Invite Friends & Earn";
        hashMap.put("referrer_widget_heading", object9);
        Object object10 = object5;
        hashMap.put("referral_myaccount_title", "Invite Friends");
        hashMap.put("referral_landing_page_title", object9);
        hashMap.put("referral_congratulations_message", "%s has given you %s<sup><small>*</small></sup> cash");
        hashMap.put("referral_signup_msg", "Signup to get %s AJIO Cash");
        hashMap.put("otp_trouble_login_timer_in_millis", jSONObject);
        hashMap.put("enable_gamezone", bl2);
        hashMap.put("return_refund_enable", bl2);
        hashMap.put("enableDeliveredAddressOnTop", bl2);
        hashMap.put("home_cms_enable", bl2);
        object5 = 30;
        hashMap.put("cms_list_cache_size", object5);
        hashMap.put("plp_additional_query_parameter", string2);
        hashMap.put("app_update_banner_pos", object);
        hashMap.put("similarto_popup", jSONObject);
        hashMap.put("pdp_pr_enable", bl2);
        hashMap.put("enable_new_signup_flow", constable);
        hashMap.put("enable_webp_images", jSONObject);
        hashMap.put("new_user_journey_cart", bl2);
        hashMap.put("new_user_plp", bl2);
        hashMap.put("ft_enable", bl2);
        hashMap.put("exec_pending_trans", bl2);
        hashMap.put("pdp_new_user_offer", jSONObject);
        hashMap.put("dns_hostname", "www.ajio.com");
        hashMap.put("dns_hostip", "116.50.83.240");
        hashMap.put("enable_dns_resolver", bl2);
        hashMap.put("mandatory_on_start_permissions", constable);
        hashMap.put("mandatory_on_start_perm_duration", object);
        hashMap.put("android_mandatory_on_start_perm_dialog_enable", bl2);
        hashMap.put("filter_new_ux", bl2);
        hashMap.put("top_category_filter_count", object);
        hashMap.put("firebase_enable_instant_disc_msg", bl2);
        hashMap.put("enable_Signup_popup", bl2);
        hashMap.put("enable_coupon_bonanza", bl2);
        object7 = 1629484200000L;
        hashMap.put("coupon_bonanza_sale_start_time_in_long", object7);
        object7 = 1629743400000L;
        hashMap.put("coupon_bonanza_sale_end_time_in_long", object7);
        hashMap.put("coupon_bonanza_t_and_c_url", string2);
        hashMap.put("coupon_bonanza_coin_balance", "10,000");
        hashMap.put("coupon_bonanza_game_name", "Coupon Bonanza");
        hashMap.put("enable_google_ddl", constable);
        hashMap.put("sale_enable", bl2);
        hashMap.put("sale_luxe_enable", bl2);
        hashMap.put("sale_plp_enable", bl2);
        hashMap.put("sale_pdp_enable", bl2);
        hashMap.put("sale_home_enable", bl2);
        hashMap.put("sale_wishlist_enable", bl2);
        hashMap.put("sale_header_bg_color", "#e8f8ff");
        hashMap.put("sale_header_text_presale", "Sale will be starting soon.");
        hashMap.put("sale_header_text_during_sale", "Sale will be ending soon");
        hashMap.put("sale_sub_header_text_pre_click", "Your chance to see the Sale price before it starts.");
        hashMap.put("sale_sub_header_text_post_click", "Wishlist your favourite products now");
        hashMap.put("sale_sub_header_text_during_sale", "Buy your favourite products at jaw-dropping discounts.");
        hashMap.put("sale_header_btn_text", "Show Sale Price");
        hashMap.put("sale_price_text", "Sale Price");
        hashMap.put("sale_presale_price_coming_soon", "Sale Price Coming Soon");
        hashMap.put("sale_discount_enable", bl2);
        hashMap.put("sale_pdp_header_tag", "#BigSale");
        hashMap.put("sale_info_text_pdp", "What is Sale Price?");
        hashMap.put("uat_hide_coach_mark", constable);
        hashMap.put("enableAppRedirection", bl2);
        hashMap.put("login_signup_otp_timer", object5);
        hashMap.put("visual_filter_position", object3);
        hashMap.put("enable_filter_nudge", jSONObject);
        hashMap.put("enable_luxe_visual_filter", bl2);
        hashMap.put("redirection_whitelisting_request_ids", "HomeCategoryContent,HomePageContent,LuxBrandCategory,MyAccountsStaticLink,ProductDetails,Anonymouslogin,User_Type,Logout_user,UserProfile,UpdateUserProfile,ResetPassword,PLPCategoryProducts,PLPSearchProducts,NewCartId,GetCartList,MergeCartList,RemoveCartEntry,UpdateCartEntry,AddtoCart,AddtoCloset,CartProductsSizeVariantAuth,GetAddresses,GetExReturnAddresses,OrderDetails,ReturnItemOrderDetails,getOrderList,ifscDetail,ShowWishList,RemoveFromWishList,cancelReasons,cancelOrder,account_check,StoreHomeContent,PlaceOrderRequest,OFFER_COUPON_LIST,OFFER_BANK_LIST,PAYMENT_GetPaymentInstruments,PAYMENT_PayNowByNetBanking,PAYMENT_PayNowByCard,PAYMENT_PayNowByWallet,PAYMENT_PayNowByIW,PAYMENT_PayNowByUPI,PAYMENT_PayNowByCOD,PAYMENT_AbortTransaction,PAYMENT_UpiRedirect,PAYMENT_StoredPaymentInstrument,PAYMENT_DeletePaymentInstrument,PAYMENT_PriceCalculation,PAYMENT_BinInfo,PAYMENT_TransactionStatus,PAYMENT_TransactionGetstatus,PAYMENT_WallePriceCalculation,couponBonanza_getCouponInfo");
        hashMap.put("wishlist_state_api_enable", bl2);
        hashMap.put("wishlist_state_enable", bl2);
        hashMap.put("maxLimitForShowLowInventoryLabel", object6);
        hashMap.put("isShowLowInventoryLabel", bl2);
        hashMap.put("is_applied_filters_at_top_of_plp_page_enabled", bl2);
        hashMap.put("max_applied_filter_list_size", object6);
        hashMap.put("similarProductsForWishlistAjio", bl2);
        hashMap.put("similarProductsForBag", bl2);
        hashMap.put("similarProductsForWishlistLuxe", bl2);
        hashMap.put("is_swap_similarto_and_recently_viewed_enabled", bl2);
        hashMap.put("is_product_key_feature_enabled", bl2);
        hashMap.put("is_auto_suggestion_product_count_enabled", bl2);
        hashMap.put("search_min_characters_count", object3);
        hashMap.put("wallet_fetch_delay_seconds", object3);
        hashMap.put("carrier_info_x_days", object8);
        hashMap.put("enable_RBI_consent_screen", bl2);
        hashMap.put("shopping_assistant", string2);
        hashMap.put("is_plp_extended_banner_enabled", bl2);
        hashMap.put("enable_pdp_prepaid_offer", bl2);
        hashMap.put("enable_pdp_both_offer", bl2);
        hashMap.put("urgency_driver_phase2_flags", "{\"enableWishlistTagPDP\":false,\"enableWishlistTagPLP\":false,\"enableSellingFastTagPDP\":false,\"enableSellingFastTagPLP\":false}");
        hashMap.put("enable_coupon_nudge_view", bl2);
        hashMap.put("coupon_nudge_data", string2);
        hashMap.put("enable_ga_revamp_custom_events", bl2);
        hashMap.put("enable_ga_revamp_screen_view_events", bl2);
        hashMap.put("enable_product_tag", bl2);
        hashMap.put("catalog_luxury_brand_list", "luxuryProductCatalog|bridgetoluxuryProductCatalog|beautybridgetoluxury|beautyluxury");
        hashMap.put("enable_urgency_driver_pdp", bl2);
        hashMap.put("enable_urgency_driver_plp", bl2);
        hashMap.put("is_ads_enable_plp", bl2);
        hashMap.put("is_ads_enable_slp", bl2);
        hashMap.put("is_jio_ad_sdk_enabled", bl2);
        hashMap.put("spc_upi_checkbox_flag", bl2);
        object7 = 6;
        hashMap.put("ga_revamp_events_bundle_threshold", object7);
        hashMap.put("recent_item_max_limit", object6);
        object6 = new JSONObject("{\"master_flag\":false,\"is_remove_all_enabled\":true,\"is_proceed_enabled\":true}");
        hashMap.put("cart_oos_improvement_json", object6);
        hashMap.put("EnableInternalWalletOnCartAPI", bl2);
        hashMap.put("isShowHighlightedCouponSavingPopUp", bl2);
        hashMap.put("chat_silent_message_version_key", "current");
        hashMap.put("enable_revamped_savedUPI", bl2);
        hashMap.put("haptik_custom_css_link", "https://assets.ajio.com/static/assets/static/css/custom-haptic.css");
        object6 = new JSONObject("{\"master_flag\":false,\"pdp_flag\":false,\"cart_flag\":false,\"spc_order_flag\":false}");
        hashMap.put("assured_gifts_flags", object6);
        object6 = new JSONObject("{   \"aqua\": \"#00FFFF\",   \"beige\": \"#D5BDA3\",   \"black\": \"#030102\",   \"blue\": \"#008BCC\",   \"bronze\": \"#967444\",   \"brown\": \"#4E3423\",   \"burgundy\": \"#80011F\",   \"clear\": \"#E6F9F3\",   \"copper\": \"#B67728\",   \"cream\": \"#F8F2DA\",   \"ecru\": \"#FAE2CA\",   \"fuchsia\": \"#D9017E\",   \"gold\": \"#FFD700\",   \"green\": \"#01563F\",   \"grey\": \"#64605D\",   \"indigo\": \"#23475F\",   \"khaki\": \"#C3B090\",   \"lavender\": \"#AFA4CF\",   \"magenta\": \"#CD2F8C\",   \"maroon\": \"#800000\",   \"metallic\": \"#A0A19F\",   \"mustard\": \"#EAAA00\",   \"navy\": \"#202A45\",   \"nude\": \"#ECD7C4\",   \"olive\": \"#708238\",   \"orange\": \"#FF6600\",   \"peach\": \"#FFCBA4\",   \"pink\": \"#FF1A75\",   \"purple\": \"#604083\",   \"red\": \"#E00500\",   \"rose_gold\": \"#E0BFB8\",   \"rust\": \"#B94700\",   \"silver\": \"#C0C0C0\",   \"tan\": \"#D89B7E\",   \"teal\": \"#235F69\",   \"violet\": \"#9B26B5\",   \"white\": \"#F8F7F3\",   \"wine\": \"#9B2243\",   \"yellow\": \"#FFE900\" }");
        hashMap.put("filter_color_palettes", object6);
        object6 = new JSONObject("{\"title\":\"Free Gifts with this Order\",\"description\":\"Details sent to your Email/SMS and My Rewards Page.\",\"image\":\"\",\"cta_text\":\"View Rewards\",\"cta_link\":\"\"}");
        hashMap.put("order_confirm_assured_gift_json", object6);
        object6 = new JSONObject("{\"title\":\"Shop & Win Free Gifts\",\"description\":\"Win Exciting Free Gifts based on your Order Amount\",\"image\":\"\",\"cta_text\":\"View Gifts\",\"cta_link\":\"\"}");
        hashMap.put("pdp_assured_gift_json", object6);
        object6 = new JSONObject("{\"title\":\"Free Gifts with this Order\",\"description\":\"Details will be sent to your Email/SMS and My Rewards Page on how to redeem these gifts.\",\"image\":\"\"}");
        hashMap.put("spc_assured_gift_json", object6);
        hashMap.put("assured_gift_minimum_order_value", object2);
        hashMap.put("enable_highlight_empty_cart", bl2);
        hashMap.put("captchavsPopup_newExperiment", "a");
        hashMap.put("SearchUIConfig", "{\n  \"pageUrlLuxe\": \"/shop/LuxeSearch\",\n  \"pageUrlAjio\": \"/shop/search\",\n  \"wishlistMaxLimit\": 20,\n  \"search_wishlist_max_limit\": 20,\n  \"recentSearchNewUIEnabled\": true,\n  \"autoSuggestionNewUIEnabled\": true,\n  \"recentSearchMaxLimit\": 10,\n  \"clearBtnEnabled\": false,\n  \"searchBtnEnabled\": false,\n  \"autoSuggetionAPIFlag\": false,\n  \"searchConfig\": {\n    \"masterFlag\": true,\n    \"luxeConfig\": {\n      \"masterFlag\": false,\n      \"trendingCategoryVersion\": 1,\n      \"searchPageVersion\": 1,\n      \"pageUrl\": \"/shop/LuxeSearch\"\n    },\n    \"ajioConfig\": {\n      \"masterFlag\": true,\n      \"trendingCategoryVersion\": 1,\n      \"searchPageVersion\": 1,\n      \"pageUrl\": \"/shop/search\"\n    }\n  }\n}");
        hashMap.put("isUaas", constable);
        hashMap.put("showTotalHighlightedSavings", bl2);
        hashMap.put("cod_refund_otp_enabled", bl2);
        hashMap.put("inAppUpdateEnable", bl2);
        hashMap.put("image_search", constable);
        hashMap.put("masterFlagToEnablePickupstore", bl2);
        object6 = new JSONObject("{\n  \"onboardingCMSPath\": \"/shop/view-schedule-earlyaccess\",\n  \"plpCMSBannerPath\": \"/plp/banner/earlyaccess\",\n  \"enableEarlyAccess\": true,\n  \"cartVariant\": \"22.08.02\",\n  \"bannerInfo\": {\n    \"saleTitle\": \"Early Access for All Products is live!\",\n    \"saleSubTitle\": \"Buy at BBS Price till 12AM\",\n    \"saleInfo\": \"Hurry, last chance before the sale starts\",\n    \"saleImage\": \"https://assets.ajio.com/static/assets/marketing/Oct-BBS-Logo-apps.png\",\n    \"backGroundColor\": \"#e8f8ff\",\n    \"sale_product_image_url\": \"https://assets.ajio.com/static/assets/marketing/Oct-BBS-Star-apps.png\",\n    \"enablePLPBanner\": true,\n    \"enablePDPBanner\": true,\n    \"enableClosetBanner\": true\n  },\n  \"salePDPHeaderTag\": \"#BBSEarlyAccess\",\n  \"salePDPImageUrl\": \"https://assets.ajio.com/static/assets/marketing/Oct-BBS-Star-apps.png\"\n}");
        hashMap.put("early_access_config", object6);
        hashMap.put("sizeChartRecommendationFlag", bl2);
        object6 = new JSONArray("[\"None\" , \"All\" , \"Jeans\" , \"Pant\" , \"Shirt\"]");
        hashMap.put("UserSubGroupForCMSPreview", object6);
        hashMap.put("sizeChartVariantFlag", jSONObject);
        object6 = "enabledDeleteForNotifyMe";
        hashMap.put(object6, bl2);
        object7 = "notifyMeSuccessMsg";
        object9 = "Thank you! We will update you once this is launched";
        hashMap.put(object7, object9);
        Object object11 = object5;
        object5 = "notifyMeFailureMsg";
        Integer n8 = object8;
        object8 = "We have already received your interest. Stay tuned!";
        hashMap.put(object5, object8);
        Object object12 = object4;
        hashMap.put("sizeRecommendVariant", jSONObject);
        hashMap.put("recentSearchNewUIEnabled", constable);
        hashMap.put("autoSuggestionNewUIEnabled", constable);
        hashMap.put("clearBtnEnabled", constable);
        hashMap.put("searchBtnEnabled", constable);
        hashMap.put("autoSuggetionAPIFlag", constable);
        hashMap.put("searchPageVersionForLuxe", n3);
        hashMap.put("searchPageVersionForAjio", n3);
        hashMap.put("trendingCategoryEnabledForAjio", constable);
        hashMap.put("trendingCategoryEnabledForLuxe", constable);
        hashMap.put("ajio_search_wishlist_enabled", constable);
        hashMap.put("links_similar_scroll_enable", bl2);
        jSONObject = new JSONObject("{\"master_flag\":false,\"mop_header\":\"Preferred Payment\"}");
        hashMap.put("preferred_mop", jSONObject);
        jSONObject = new JSONObject("{\"isSizeGuideApplicable\":\"false\",\"applicationName\":\"RILFNL-AJIO\"}");
        hashMap.put("wishlist_size_guide", jSONObject);
        hashMap.put("brand_size_disply_option_pdp", bl2);
        hashMap.put("brand_size_disply_label_pdp", "Show sizing used by %s");
        hashMap.put("ABAJIONewColorPalette", bl2);
        hashMap.put("ABAJIOFreeDeliveryTag", bl2);
        jSONObject = Integer.valueOf(1200);
        hashMap.put("free_shipping_amount_limit", jSONObject);
        Object object13 = object3;
        object4 = new JSONArray("[\"CMSABExp1\",\"CMSABExp2\",\"CMSABExp3\",\"CMSABExp4\",\"CMSABExp5\"]");
        hashMap.put("cms_experiment_flags", object4);
        object3 = new JSONObject("{\"brickCode\": []}");
        hashMap.put("comprehensive_brickcode_list", object3);
        hashMap.put("supportedCatalogToHideMRPAndDiscount", string2);
        hashMap.put(object6, bl2);
        hashMap.put(object7, object9);
        hashMap.put(object5, object8);
        object3 = new JSONObject("{\n  \"enableCMSVideoForAjioStore\": true,\n  \"enableSTLVideoForAjioStore\": true,\n  \"enableCMSVideoForLuxeStore\": true,\n  \"enableSTLVideoForLuxeStore\": true,\n\"videoWatchTimeThreasoldInSec\": 2\n}");
        hashMap.put("video_support_flags", object3);
        object3 = new JSONObject("{\"kyp\": {}}");
        hashMap.put("comprehensive_kyp_settings", object3);
        hashMap.put("PLP_List_Grid_Toggle", bl2);
        hashMap.put("ABAjioRatingEnabled", bl2);
        hashMap.put("ABAjioRatingOLP", bl2);
        hashMap.put("ABAjioRatingOrderDetail", bl2);
        hashMap.put("ABAjioRatingPDP", bl2);
        hashMap.put("ABAjioRatingWishlist", bl2);
        hashMap.put("ABAjioRatingCollectionWishlist", bl2);
        hashMap.put("ABAjioRatingCollectionWishlistGram", bl2);
        object3 = new JSONObject("{\n  \"ratingCollectionOnPDPEnabled\": false,\n    \"reviewCollectionOnPDPEnabled\": false,\n  \"questions\": [\n    {\n      \"question\": \"How is the value for money?\",\n      \"shortHandQuestion\": \"Value for Money\"\n    },\n    {\n      \"question\": \"How was the product Quality?\",\n      \"shortHandQuestion\": \"Product Quality\"\n    },\n    {\n      \"question\": \"How was the Product fit?\",\n      \"shortHandQuestion\": \"Size and Fit\"\n    }\n  ],\n  \"widgetAllProductsRatedTitleMsg\": \"You have rated all your purchases\",\n  \"widgetAllProductRatedThanksMsg\": \"Thank you for taking out the time\",\n  \"ratingInfoPopUpTitle\": \"How are Ratings Calculated\",\n  \"ratingInfoPopUpDescription\": \"A product\u2019s final rating is a simple average of each of the ratings submitted by our users\",\n  \"ratingBelowThresholdColor\": \"#A23031\",\n  \"ratingAboveThresholdColor\": \"#35a742\",\n  \"ratingSubmittedTitle\": \"Rating Submitted\",\n  \"lastXdaysOrders\": {\n    \"HomePage\": 15,\n    \"Wishlist\": 15,\n    \"PLP\": 15,\n    \"OLP\": 60,\n    \"ODP\": 60\n  },\n  \"reviewImageSizeInMB\": 1.5,\n  \"reviewDisclaimerMsgVisiblity\": false,\n  \"reviewsPrivacyPolicyUrl\": \"https://www.ajio.com/privacypolicy\",\n  \"reviewsTCUrl\": \"https://www.ajio.com/help/termsAndCondition\"\n}");
        hashMap.put("AjioRatingConfig", object3);
        object3 = new JSONObject("{\"master_GA3\":false,\"master_GA4\":false,\"release1_GA4\":false}");
        hashMap.put("ga_flags", object3);
        hashMap.put("ratingAboveThresholdColor", string2);
        hashMap.put("ratingBelowThresholdColor", string2);
        hashMap.put("howToMeasureSizeGuidePosition", "Tab");
        hashMap.put("ABAJIOCouponsAndBankOffersMerge", bl2);
        object3 = new JSONArray("[\n  {\n    \"key\": \"GENDER\",\n    \"visiblity\": true\n  }\n]");
        hashMap.put("ABAJIOSignUpPage", object3);
        hashMap.put("enableEdgeWorker", bl2);
        hashMap.put("enable_cluster_param", constable);
        hashMap.put("enable_cluster_param_pdp", bl2);
        hashMap.put("edgeWorkerTestUserId", string2);
        object3 = new JSONObject("{\"brickCode\": []}");
        hashMap.put("comprehensive_brickcode_prod_details_list", object3);
        hashMap.put("offers_merge_order_configiration_key", object2);
        hashMap.put("selfShipAmount", "150");
        hashMap.put("signup_page_banner_config", "{\n  \"bannerUrl\": \"\",\n  \"enableBannerSignupPage\": false\n}");
        hashMap.put("common_login_signup_page_banner_config", "{\n  \"bannerUrl\": \"\",\n  \"enableBannerCommonLoginSignupPage\": false\n}");
        hashMap.put("enable_signup_halfcard_banner", "{\n  \"bannerUrl\": \"\",\n  \"enableSignupHalfcardBanner\": false\n}");
        hashMap.put("enable_order_confirmation_earning_highlight", bl2);
        hashMap.put("is_my_account_ajio_wallet_widget_enabled", bl2);
        hashMap.put("free_shipping_amount_limit_pdp", jSONObject);
        hashMap.put("enable_return_bank_info_encryption", bl2);
        hashMap.put("pdp_size_chart_visiblity_enable", bl2);
        jSONObject = new JSONObject("{\"masterFlag\":false,\"totalDiscountPercentageMin\":30,\"totalDiscountValue\":1000}");
        hashMap.put("TD_Value_And_Percentage_Limit_PDP", jSONObject);
        jSONObject = new JSONObject("{\n  \"howToMeasureProducts\": [\n    {\n      \"brickCategory\": \"\",\n      \"brickName\": \"\",\n      \"brickSubCategory\": \"\"\n    }\n  ]\n}");
        hashMap.put("pdp_size_chart_imageinteraction_bricks", jSONObject);
        hashMap.put("AjioWalletToBankTransferConfig", "{\n  \"ajioCashTransferStatusMessage\": \"You have successfully initiated an IMPS transfer of %s. The amount should be credited to your account within 4 days\",\n  \"ajioCashImpsTimeMessage\": \"It can take up to 4 days for the amount to get credited in your account\",\n  \"ajioCashImpsTransferMessage\": \"Transferring %s to bank account\"\n}");
        hashMap.put("AjioCashWalletToBankTransferEnabled", bl2);
        hashMap.put("enable_fraud_detection", bl2);
        jSONObject = new JSONObject("{\n  \"isShowNewSizeGuideImage\": true,\n  \"howToMeasureProducts\": [\n    {\n      \"brickCategory\": \"Men\",\n      \"brickName\": \"Jeans\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Men\",\n      \"brickName\": \"Trousers & Pants\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Men\",\n      \"brickName\": \"Sweatshirts & Hoodie\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Men\",\n      \"brickName\": \"Shirts\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Men\",\n      \"brickName\": \"Tshirts\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Men\",\n      \"brickName\": \"Jackets & Coats\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Women\",\n      \"brickName\": \"Kurta Suit Sets\",\n      \"brickSubCategory\": \"Ethnic Wear\"\n    },\n    {\n      \"brickCategory\": \"Women\",\n      \"brickName\": \"Kurtas\",\n      \"brickSubCategory\": \"Ethnic Wear\"\n    },\n    {\n      \"brickCategory\": \"Women\",\n      \"brickName\": \"Jeans & Jeggings\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Women\",\n      \"brickName\": \"Sweatshirts &Hoodies\",\n      \"brickSubCategory\": \"Western Wear\"\n    },\n    {\n      \"brickCategory\": \"Men\",\n      \"brickName\": \"\",\n      \"brickSubCategory\": \"Footwear\"\n    },\n    {\n      \"brickCategory\": \"Women\",\n      \"brickName\": \"\",\n      \"brickSubCategory\": \"Footwear\"\n    }\n  ]\n}");
        hashMap.put("howToMeasureSizeGuide", jSONObject);
        hashMap.put("shouldResizeEnable", bl2);
        jSONObject = "is_banner_ad_enabled_plp";
        hashMap.put(jSONObject, bl2);
        object2 = "is_banner_ad_enabled_slp";
        hashMap.put(object2, bl2);
        hashMap.put("order_cancellation_refund_config", "{\n  \"enable\": false,\n  \"waitingForRefundInfo\": \"Refund details will be updated soon.\",\n  \"bussinessCancellationReason\": \"We had to cancel your order due to logistics restrictions.To make up for this, you will receive a special coupon code via SMS within 24 hrs as a token of apology, which you can use on your future purchase on AJIO.\",\n  \"noRefundCODTitle\": \"Refund Details\",\n  \"noRefundCODDescription\": \"No refund is involved as the order was a Cash on delivery order\"\n}");
        hashMap.put(jSONObject, bl2);
        hashMap.put(object2, bl2);
        hashMap.put("employee_offer_restriction_enabled", bl2);
        hashMap.put("banner_ad_variant_type", "C");
        dy_1.a(8, (Integer)object, "ad_repeat_index", "ad_start_index", hashMap);
        hashMap.put("ad_end_index", n4);
        hashMap.put("cart_hide_decimal_experiment", bl2);
        jSONObject = Long.valueOf(0L);
        hashMap.put("cart_load_event_x_second", jSONObject);
        hashMap.put("enable_mark_delivered_forward_order_revamp", bl2);
        hashMap.put("firebase_cart_inventory_enabled", constable);
        hashMap.put("isAdsDisabledOnCouponLink", bl2);
        hashMap.put("PlpRatingCollection", bl2);
        hashMap.put("PlpRatingCollectionGram", bl2);
        object2 = n7;
        hashMap.put("PlpRatingCollectionWidgetPosition", n7);
        hashMap.put("WishlistRatingCollectionPosition", n3);
        object2 = object13;
        hashMap.put("RatingThreshold", object13);
        hashMap.put("enable_cart_ratings", bl2);
        hashMap.put("TD_Value_And_Percentage_Limit_PDP_MasterFlag", bl2);
        hashMap.put("ABAjioPLPRating", bl2);
        hashMap.put("order_communication_packet_no_config", "{\n  \"alertTitle\": \"Upcoming Delivery Alert\",\n  \"alertDescription\": \"At the time of delivery, please check the <b>Unique Packet Code</b> at the back of your AJIO order packet. Accept the delivery only if it matches with the code mentioned below. \",\n  \"packageCodeTitle\": \"Unique Package Code \",\n  \"alertCtaText\": \"Can\u2019t find the code?\",\n  \"popupTitle\": \"Where can I find the Unique Packet Code?\",\n  \"popupDescription\": \"This code is printed at the back of your AJIO order package. It has 11 characters. At the time of delivery, match this with the Unique packet code mentioned in order tracking section. The code will look something like this:\",\n  \"popupQuestionTitle\": \"What if this code doesn\u2019t match?\",\n  \"popupQuestionDescription\": \"Please don\u2019t accept the packet if the code doesn\u2019t match\",\n  \"popupCtaText\": \"Okay, Got It\"\n}");
        jSONObject = "image_search_enabled_mass";
        hashMap.put(jSONObject, constable);
        object3 = object12;
        hashMap.put("keyToPickForSideNavigationBannerForAjio", object12);
        object3 = object10;
        hashMap.put("keyToPickForSideNavigationBannerForLuxe", object10);
        hashMap.put("enable_orderdetail_pricing_from_api", bl2);
        object2 = "taaraWalletName";
        hashMap.put(object2, string2);
        hashMap.put(jSONObject, bl2);
        hashMap.put(object2, string2);
        hashMap.put("enable_fraud_reduction_master_flag", bl2);
        hashMap.put("enable_continue_auto_click", bl2);
        jSONObject = Integer.valueOf(60);
        hashMap.put("timeoutForDynamicWidget", jSONObject);
        hashMap.put("ABAjioReviewsEnabled", bl2);
        hashMap.put("ABAjioReviewsForGramEnabled", bl2);
        jSONObject = new JSONObject("{\n  \"isNewReferralScreenEnabled\": true,\n  \"referralScreenTitleText\": \"Invite code\",\n  \"referralDescription\": \"Share the code and give your friends the joy of saving big on their favorite brands.\",\n  \"referrer\": {\n    \"referralAmountText\": \"AJIO cash\",\n    \"referralDescription\": \"On your friend first order\",\n    \"image\": \"https://assets.ajio.com/cms/AJIO/MOBILE/Image%20A_1.png\"\n  },\n  \"referee\": {\n    \"referralAmountText\": \"AJIO cash\",\n    \"referralDescription\": \"when they sign up\",\n    \"image\": \"https://assets.ajio.com/cms/AJIO/MOBILE/Image%20A_2.png\"\n  },\n  \"referrerBenefits\": {\n    \"referralAmountText\": \"AJIO cash\",\n    \"referralDescription\": \"when they sign up\",\n    \"leftImage\": \"https://assets.ajio.com/cms/AJIO/MOBILE/Image%20B_1.png\",\n    \"rightImage\": \"https://assets.ajio.com/cms/AJIO/MOBILE/Image%20B_2.png\",\n    \"isFetchBenefitsFromReferrer\": true\n  },\n  \"showEitherReferrerOrReferee\": false\n}");
        hashMap.put("referral_screen_flag", jSONObject);
        jSONObject = new JSONObject("{\n\"category\":[\n],\n\"name\":[\n]\n}");
        hashMap.put("cart_product_tag_json", jSONObject);
        hashMap.put("ABAjioHomePageRating", bl2);
        hashMap.put("enable_order_cancelltaion_reasons", bl2);
        hashMap.put("enable_remove_tag_info", bl2);
        jSONObject = new JSONObject("{\n  \"timeOutInterval\": 0.75,\n  \"adSpotId\": \"\",\n  \"userRestriction\": \"new\",\n  \"userType\": \"non-premium\",\n  \"experiment\": \"\"\n}");
        hashMap.put("jioBannerAdsConfigForHomePage", jSONObject);
        hashMap.put("apiVersion", "v3");
        jSONObject = new JSONObject("{\n  \"sizeGuidToggleProducts\": [\n    {\n      \"brickCategory\": \"\",\n      \"brickName\": \"\"\n    }\n  ]\n}");
        hashMap.put("sizeGuidToggleData", jSONObject);
        hashMap.put("master_GA3", bl2);
        hashMap.put("master_GA4", bl2);
        hashMap.put("release1_GA4", bl2);
        jSONObject = new JSONObject("{\n  \"header model\": 1,\n  \"price brand model\": 2,\n  \"PRICE REVEAL MODEL\": 3,\n  \"LUXE_SIZE_SELECTION_CONTAINER\": 4,\n  \"BANK_OFFERS\": 5,\n  \"TRUST MARKER IMAGE MODEL\": 6,\n  \"TRUST_MARKER\": 7,\n  \"offer model\": 8,\n  \"COLOR MODEL\": 9,\n  \"SIZE MODEL\": 10,\n  \"RATING AND REVIEW MODEL\": 12,\n  \"CUSTOMER PHOTOS\": 13,\n  \"CUSTOMER_REVIEWS\": 14,\n  \"EDD MODEL\": 15,\n  \"BANK_OFFERS_EDD\": 16,\n  \"LUXE_PROMO_OFFER\": 17,\n  \"PDP_NEW_PRODUCT_DETAILS\": 18,\n  \"INFO MODEL\": 19,\n  \"TRUST MARKER IMAGE MODEL NEW\": 20,\n  \"PRICE_DETAIL_VIEW_MODEL\": 21,\n  \"SHOPPING ASSISTANT MODEL\": 22,\n  \"return model\": 22,\n  \"PRICE_ERROR_MODEL\": 23,\n  \"FOOTER MODEL\": 24,\n  \"REFERRAL_MODEL\": 25,\n  \"BRAND_DESC_MODEL\": 26,\n  \"DRESS_TOOL\": 27,\n  \"RV MODEL\": 28,\n  \"SIMILAR MODEL PRODUCT\": 29,\n  \"CAPSULE MODEL PRODUCT\": 30,\n  \"LUXE_BOTTOM_LINKS\": 31,\n  \"LUXE_FOOTER_LINKS\": 32,\n  \"PDP_KNOW_THE_PRODUCT\": 33,\n  \"PDP_MORE_INFORMATION\": 34\n}");
        hashMap.put("pdp_ui_configuration", jSONObject);
        jSONObject = new JSONObject("{\n\"splash_animation_url\":\"https://assets.ajio.com/cms/AJIO/MOBILE/Splash_Screen.gif\",\n\"splash_image_url\":\"https://assets.ajio.com/cms/AJIO/MOBILE/Splashscreen_Static.png\",\n\"splash_loader_animation\":\"https://assets.ajio.com/cms/AJIO/MOBILE/Splashscreen_Loader.gif\",\n\"splash_loader_text\":\"Dope styles incoming\u2026\",\n\"splash_screen_time_in_seconds\":2,\n\"onboarding_background_image\":\"https://assets.ajio.com/cms/AJIO/MOBILE/Background.png\",\n\"onboarding_image_array\":{\n\"https://assets.ajio.com/cms/AJIO/MOBILE/Onboarding_11.png\":1,\n\"https://assets.ajio.com/cms/AJIO/MOBILE/Onboarding_21.png\":2\n},\n\"is_onboarding_auto_scroll\":true,\n\"onboarding_auto_scroll_time_in_seconds\":2\n}");
        hashMap.put("fleek_splash_onboarding_config", jSONObject);
        jSONObject = new JSONObject("{\n\"enableAutoDismiss\":true,\n\"autoDismissDuration\": 20,\n\"widgetMaxApperanceCount\": 5\n}");
        hashMap.put("floating_widget_config", jSONObject);
        jSONObject = new JSONObject("{\n  \"ajio\": {\n    \"splash_image_icon\": \"https://assets-uat.ajio.ril.com/cms/AJIO/MOBILE/ajio_splash_icon_3x.png\",\n    \"splash_bg_color\": \"#2F4254\",\n    \"splash_loader_text\": \"Get ready for hottest styles...\",\n    \"splash_loader_text_color\": \"#FFFFFF\",\n    \"coach_mark_title\": \"You are now on the Ajio Store\",\n    \"coach_mark_desc\": \"Click on \\\"Switch Stores\\\" to explore \\nother options\",\n    \"coach_mark_display_time\": 5\n  },\n  \"luxe\": {\n    \"splash_image_icon\": \"https://assets-uat.ajio.ril.com/cms/LUXE/MOBILE/luxe_splash_icon_3x.png\",\n    \"splash_bg_color\": \"#121212\",\n    \"splash_loader_text\": \"Loading luxury fashion...\",\n    \"splash_loader_text_color\": \"#FFFFFF\",\n    \"coach_mark_title\": \"You are now on the AJIO LUXE Store\",\n    \"coach_mark_desc\": \"Click on \\\"Switch Stores\\\" to explore \\nother options\",\n    \"coach_mark_display_time\": 3\n  },\n  \"ajiogram\": {\n    \"coach_mark_title\": \"You are now on the Ajiogram Store\",\n    \"coach_mark_desc\": \"Click on \\\"Switch Stores\\\" to explore \\nother options\",\n    \"coach_mark_display_time\": 3\n  },\n  \"fleek\": {\n    \"coach_mark_title\": \"You are now on the Ajiogram Store\",\n    \"coach_mark_desc\": \"Click on \\\"Switch Stores\\\" to explore \\nother options\",\n    \"coach_mark_display_time\": 3\n  }\n}");
        hashMap.put("all_store_meta_data_config", jSONObject);
        hashMap.put("all_store_top_bar_config", "{\n  \"ajio\": {\n    \"store_icon\": \"https://assets-uat.ajio.ril.com/cms/AJIO/MOBILE/small_ajio_brand_logo.png\",\n    \"animation_repeat_count\": 2,\n    \"search_bar_text\": \"Search by product, brand and more\"\n  },\n  \"luxe\": {\n    \"store_icon\": \"https://assets-uat.ajio.ril.com/cms/LUXE/MOBILE/small_luxe_brand_logo.png\",\n    \"animation_repeat_count\": 2,\n    \"search_bar_text\": \"Search by product, brand and more\"\n  }\n}");
        hashMap.put("interstitial_milestone_range", "[0,1,30,30,30]");
        hashMap.put("is_interstitial", constable);
        object2 = "{\"ajio\":{\"title\":\"Oops! We\u2019re facing an issue with our services\",\"subtitle\":\"Oops! We\u2019re facing an issue with our services\",\"buttonTitle\":\"Refresh\"},\"luxe\":{\"title\":\"Oh no! There seems to be a hiccup in our services\",\"subtitle\":\"Oops! We\u2019re facing an issue with our services\",\"buttonTitle\":\"Refresh\"}}";
        jSONObject = new JSONObject((String)object2);
        hashMap.put("all_store_errorConfig", jSONObject);
        jSONObject = new JSONObject("{\"shouldAutoPlay\":\"false\",\"shouldPlayOnMute\":\"false\",\"shouldLoop\":\"false\"}");
        hashMap.put("fleek_video_config", jSONObject);
        jSONObject = new JSONObject("{\n  \"isAutoPlayVideo\": false,\n  \"isPlayInLoop\": true,\n  \"isAudioMuted\": false\n}");
        hashMap.put("fleek_post_story_video_config", jSONObject);
        jSONObject = new JSONObject("{\n  \"mini_plp_brand_page_heading\": \"Check Out All Products\",\n  \"fleek_app_bar_logo\": \"https://assets.ajio.com/cms/AJIO/MOBILE/MicrosoftTeams-imagegreen-01.png\",\n  \"no_internet_title\": \"Uh oh! Internet has gone AWOL \ud83d\ude13\",\n  \"no_internet_message\": \"Check your connection or try refreshing the page\",\n  \"feed_page_api_error_message_title\": \"Oh no! An unexpected error happened \ud83d\ude13\",\n  \"feed_page_api_error_message_description\": \"Check your connection or try refreshing the page\",\n  \"feed_page_api_error_button_title\": \"Refresh\",\n  \"feed_seen_post_header_title\": \"You're all caught up for now.\",\n  \"fleek_seen_banner_msg\": \"You're all caught up for now\",\n  \"fleek_post_share_content\": \"Check out %s on AJIO's ongoing All Stars Sale where the best of brands are at incredible discounts! \",\n  \"mini_plp_banner_pagesize\": 10,\n  \"all_brands_directory_title\": \"All brands on Ajiogram\",\n  \"feed_updated_message\": \"Feed updated\",\n  \"brand_search_result_empty_message\": \"Sorry we couldn\u2019t find any matching results in %s\",\n  \"global_search_result_empty_message\": \"Sorry we couldn\u2019t find any matching results for %s\",\n  \"fleek_brand_share_content\": \"This post by %s is giving me some serious outfit inspo. Check it out.\",\n  \"no_internet_primary_text\": \"Uh oh! Internet has gone AWOL \ud83d\ude13\",\n  \"no_internet_secondary_text\": \"Check your connection or try refreshing the page\",\n  \"no_internet_button_text\": \"Refresh\",\n  \"api_failure_primary_text\": \"Oh no! An unexpected error happened \ud83d\ude13\",\n  \"api_failure_secondary_text\": \"Check your connection or try refreshing the page\",\n  \"api_failure_button_text\": \"Refresh\",\n  \"page_unavailable_primary_text\": \"Yikes! This page isn't available \ud83e\uddd0\",\n  \"page_unavailable_secondary_text\": \"Pls check the URL or just browse what's hot on Ajiogram\",\n  \"page_unavailable_button_text\": \"Browse Ajiogram\",\n  \"non_configured_route_primary_text\": \"Yikes! This page isn't available \ud83e\uddd0\",\n  \"non_configured_route_secondary_text\": \"Pls check the URL or just browse what's hot on Ajiogram\",\n  \"non_configured_route_button_text\": \"Browse Ajiogram\",\n  \"brand_page_recent_posts_title\": \"Recent Posts\"\n}");
        hashMap.put("fleek_configs", jSONObject);
        jSONObject = new JSONObject((String)object2);
        hashMap.put("all_store_category_error_config", jSONObject);
        hashMap.put("post_notifications_permission_enable", constable);
        hashMap.put("isNewReturnFormEnabled", bl2);
        object2 = n8;
        hashMap.put("post_notifications_settings_permission_duration", n8);
        hashMap.put("post_notifications_settings_permission_frequency", n3);
        hashMap.put("removal_login_password_json", "{\n  \"restore_web_url\": \"https://qa.services.ajio.com/restore-phonenumber\",\n  \"enable_restore_phone_number\": false,\n  \"login_restore_phone_number_message\": \"Email based login is no longer available. Please click here to restore your mobile number.\",\n  \"login_click_text_highlight\": \"click here\",\n  \"signup_restore_phone_number_message\": \"Email address is already linked to another account. Use a different email address or restore phone number.\",\n  \"myaccount_request_phone_update_message\": \"Your request for phone number update is in progress. It will update in next %s .\",\n  \"profile_change_new_number_note\": \"NOTE : The new phone number will be updated within %s . It won't affect any pending orders, new orders, or fund transfers. You can still use the current phone number until the update is complete.\",\n  \"profile_change_text_highlight\": \"NOTE :\",\n  \"account_check_api_error_msg\": \"Mobile number entered is already registered with us.\",\n  \"account_check_api_error_msg_for_signup\": \"Email Id entered is already registered with us.\"\n}");
        hashMap.put("web_deeplink_for_app", "ajioapps://www.ajio.com");
        hashMap.put("enable_link_cohort", constable);
        hashMap.put("reset_link_cohort_data", bl2);
        jSONObject = new JSONObject("{ \"resolutionHeight\": 672.0,   \"resolutionWidth\": 1024.0 }");
        hashMap.put("fleek_base_value", jSONObject);
        jSONObject = new JSONObject("{ \"storyImgDuration\": 10000,   \"storyGifDuration\": 10000}");
        hashMap.put("fleek_stories_progress_value", jSONObject);
        hashMap.put("fleek_enable", constable);
        jSONObject = new JSONObject("{\"triggers\":{\"onlaunch\":true,\"tabSwitch\":true,\"threshold\":10}}");
        hashMap.put("fleek_ses_config", jSONObject);
        hashMap.put("fleek_share_post_message", "This post by %s is giving me some serious outfit inspo. Check it out");
        hashMap.put("fleek_share_brand_message", "I found this super awesome brand on AJIOGram!");
        jSONObject = new JSONObject("{\n  \"header model\": 1,\n  \"price brand model\": 2,\n  \"PRICE REVEAL MODEL\": 2,\n  \"COLOR MODEL\": 3,\n  \"LUXE_SIZE_SELECTION_CONTAINER\": 4,\n  \"SIZE MODEL\": 4,\n  \"EDD MODEL\": 5,\n  \"return model\": 6,\n  \"offer model\": 7,\n  \"BANK_OFFERS\": 8,\n  \"BANK_OFFERS_EDD\": 8,\n  \"PDP_NEW_PRODUCT_DETAILS\": 9,\n  \"INFO MODEL\": 9,\n  \"PDP_KNOW_THE_PRODUCT\": 10,\n  \"STYLING_IDEAS\": 11,\n  \"RATING AND REVIEW MODEL\": 12,\n  \"CUSTOMER PHOTOS\": 13,\n  \"CUSTOMER_REVIEWS\": 14,\n  \"DISCOVER_BRANDS\": 15,\n  \"TRUST MARKER IMAGE MODEL\": 16,\n  \"TRUST_MARKER\": 16,\n  \"LUXE_PROMO_OFFER\": 19,\n  \"TRUST MARKER IMAGE MODEL NEW\": 20,\n  \"PRICE_DETAIL_VIEW_MODEL\": 21,\n  \"SHOPPING ASSISTANT MODEL\": 23,\n  \"PRICE_ERROR_MODEL\": 24,\n  \"FOOTER MODEL\": 25,\n  \"REFERRAL_MODEL\": 26,\n  \"BRAND_DESC_MODEL\": 27,\n  \"RV MODEL\": 28,\n  \"SIMILAR MODEL PRODUCT\": 29,\n  \"CAPSULE MODEL PRODUCT\": 30,\n  \"LUXE_BOTTOM_LINKS\": 31,\n  \"LUXE_FOOTER_LINKS\": 34,\n  \"PDP_MORE_INFORMATION\": 35\n}");
        hashMap.put("fleek_pdp_ui_configuration", jSONObject);
        jSONObject = new JSONObject("{\n  \"FB\": {\n    \"header model\": 1,\n    \"price brand model\": 2,\n    \"COLOR MODEL\": 3,\n    \"SIMILAR MODEL PRODUCT\": 4,\n    \"LUXE_BOTTOM_LINKS\": 5,\n    \"PRICE REVEAL MODEL\": 6,\n    \"LUXE_SIZE_SELECTION_CONTAINER\": 7,\n    \"BANK_OFFERS\": 8,\n    \"TRUST MARKER IMAGE MODEL\": 9,\n    \"TRUST_MARKER\": 10,\n    \"offer model\": 11,\n    \"SIZE MODEL\": 12,\n    \"EDD MODEL\": 13,\n    \"BANK_OFFERS_EDD\": 14,\n    \"LUXE_PROMO_OFFER\": 15,\n    \"PDP_NEW_PRODUCT_DETAILS\": 16,\n    \"INFO MODEL\": 17,\n    \"TRUST MARKER IMAGE MODEL NEW\": 18,\n    \"RATING AND REVIEW MODEL\": 19,\n    \"CUSTOMER PHOTOS\": 20,\n    \"CUSTOMER_REVIEWS\": 21,\n    \"PRICE_DETAIL_VIEW_MODEL\": 22,\n    \"SHOPPING ASSISTANT MODEL\": 23,\n    \"return model\": 24,\n    \"PRICE_ERROR_MODEL\": 25,\n    \"FOOTER MODEL\": 26,\n    \"REFERRAL_MODEL\": 27,\n    \"BRAND_DESC_MODEL\": 28,\n    \"RV MODEL\": 29,\n    \"CAPSULE MODEL PRODUCT\": 30,\n    \"LUXE_FOOTER_LINKS\": 31,\n    \"PDP_KNOW_THE_PRODUCT\": 32,\n    \"PDP_MORE_INFORMATION\": 33\n  },\n  \"Google\": {\n    \"header model\": 1,\n    \"price brand model\": 2,\n    \"COLOR MODEL\": 3,\n    \"SIMILAR MODEL PRODUCT\": 4,\n    \"LUXE_BOTTOM_LINKS\": 5,\n    \"PRICE REVEAL MODEL\": 6,\n    \"LUXE_SIZE_SELECTION_CONTAINER\": 7,\n    \"BANK_OFFERS\": 8,\n    \"TRUST MARKER IMAGE MODEL\": 9,\n    \"TRUST_MARKER\": 10,\n    \"offer model\": 11,\n    \"SIZE MODEL\": 12,\n    \"EDD MODEL\": 13,\n    \"BANK_OFFERS_EDD\": 14,\n    \"LUXE_PROMO_OFFER\": 15,\n    \"PDP_NEW_PRODUCT_DETAILS\": 16,\n    \"INFO MODEL\": 17,\n    \"TRUST MARKER IMAGE MODEL NEW\": 18,\n    \"RATING AND REVIEW MODEL\": 19,\n    \"CUSTOMER PHOTOS\": 20,\n    \"CUSTOMER_REVIEWS\": 21,\n    \"PRICE_DETAIL_VIEW_MODEL\": 22,\n    \"SHOPPING ASSISTANT MODEL\": 23,\n    \"return model\": 24,\n    \"PRICE_ERROR_MODEL\": 25,\n    \"FOOTER MODEL\": 26,\n    \"REFERRAL_MODEL\": 27,\n    \"BRAND_DESC_MODEL\": 28,\n    \"RV MODEL\": 29,\n    \"CAPSULE MODEL PRODUCT\": 30,\n    \"LUXE_FOOTER_LINKS\": 31,\n    \"PDP_KNOW_THE_PRODUCT\": 32,\n    \"PDP_MORE_INFORMATION\": 33\n  },\n  \"Clevertap\": {\n    \"header model\": 1,\n    \"price brand model\": 2,\n    \"COLOR MODEL\": 3,\n    \"SIMILAR MODEL PRODUCT\": 4,\n    \"LUXE_BOTTOM_LINKS\": 5,\n    \"PRICE REVEAL MODEL\": 6,\n    \"LUXE_SIZE_SELECTION_CONTAINER\": 7,\n    \"BANK_OFFERS\": 8,\n    \"TRUST MARKER IMAGE MODEL\": 9,\n    \"TRUST_MARKER\": 10,\n    \"offer model\": 11,\n    \"SIZE MODEL\": 12,\n    \"EDD MODEL\": 13,\n    \"BANK_OFFERS_EDD\": 14,\n    \"LUXE_PROMO_OFFER\": 15,\n    \"PDP_NEW_PRODUCT_DETAILS\": 16,\n    \"INFO MODEL\": 17,\n    \"TRUST MARKER IMAGE MODEL NEW\": 18,\n    \"RATING AND REVIEW MODEL\": 19,\n    \"CUSTOMER PHOTOS\": 20,\n    \"CUSTOMER_REVIEWS\": 21,\n    \"PRICE_DETAIL_VIEW_MODEL\": 22,\n    \"SHOPPING ASSISTANT MODEL\": 23,\n    \"return model\": 24,\n    \"PRICE_ERROR_MODEL\": 25,\n    \"FOOTER MODEL\": 26,\n    \"REFERRAL_MODEL\": 27,\n    \"BRAND_DESC_MODEL\": 28,\n    \"RV MODEL\": 29,\n    \"CAPSULE MODEL PRODUCT\": 30,\n    \"LUXE_FOOTER_LINKS\": 31,\n    \"PDP_KNOW_THE_PRODUCT\": 32,\n    \"PDP_MORE_INFORMATION\": 33\n  }\n}");
        hashMap.put("utm_redirection_pdp_ui_configuration", jSONObject);
        jSONObject = K40.h();
        hashMap.put("bannerAdConfigForPdp", jSONObject);
        jSONObject = K40.e();
        hashMap.put("bannerAdConfigForCart", jSONObject);
        jSONObject = K40.i();
        hashMap.put("bannerAdConfigForThankyou", jSONObject);
        jSONObject = K40.g();
        hashMap.put("bannerAdConfigForOrderListing", jSONObject);
        jSONObject = K40.f();
        hashMap.put("bannerAdConfigForMyAccount", jSONObject);
        hashMap.put("affise_enabled", bl2);
        hashMap.put("pdp_similar_product_ajiogram", bl2);
        jSONObject = K40.N();
        hashMap.put("ReturnReductionConfig", jSONObject);
        hashMap.put("RVPMasterFlag", bl2);
        hashMap.put("showSimilarOptionOnPLPAjiogram", bl2);
        object2 = "{\n  \"isRtoEnabled\": true,\n  \"visibility_threshold\": 3,\n  \"title\": \"Delivery Failed\",\n  \"sub_title\": \"Select Return Reason\",\n  \"description\": \"We noticed that delivery of the below products failed. \\nLet us know what went wrong\",\n  \"reasons\": [\n    \"Incorrect Address\",\n    \"Delivery Delayed\",\n    \"Found Better Price\",\n    \"Delivery Not Attempted\",\n    \"No Longer Want the Product\"\n  ],\n  \"default_reason\": \"Not at home\",\n  \"reason_not_listed_text\": \"Reason Not Listed\",\n  \"is_dialog_cancelable\": true\n}";
        jSONObject = new JSONObject((String)object2);
        hashMap.put("rto_reason_config", jSONObject);
        jSONObject = new JSONObject((String)object2);
        hashMap.put("order_rto_reason_config", jSONObject);
        jSONObject = Integer.valueOf(20);
        hashMap.put("fleek_feed_pagination_page_size", jSONObject);
        hashMap.put("fleek_stories_pagination_page_size", object);
        hashMap.put("pdp_share_content", "Check out %s on AJIO");
        hashMap.put("pdp_share_content_luxe", "Check out %s on LUXE");
        hashMap.put("pdp_share_content_ajiogram", "Check out %s on AJIOGRAM");
        jSONObject = object11;
        hashMap.put("fleek_brand_directory_page_size", object11);
        hashMap.put("show_ratings_expanded_view", bl2);
        hashMap.put("ga_beauty_product_flag", bl2);
        hashMap.put("enable_fit_tag", bl2);
        object = K40.P();
        hashMap.put("social_proofing_icons", object);
        object = K40.l();
        hashMap.put("cod_fraud_check_new_configValue", object);
        hashMap.put("retire_rcs_wallet_config", "{\n  \"isEnabled\": false,\n  \"rcs_retire_ajio_wallet_desc\": \"<ul><li>&nbsp;&nbsp;Refunds will be credited within 2-4 hours.</li><li>&nbsp;&nbsp;This refund, once added, will never expire.</li><li>&nbsp;&nbsp;<b>Amount in Wallet is Non-Transferable to bank.</b></li></ul>\\n&nbsp;&nbsp;&nbsp;Know more\",\n  \"home_page_refund_failure_card_count\": 4,\n  \"common_ledger_txn_limit_threshold\": 50\n}");
        hashMap.put("ga4_ajio_enable", constable);
        object = K40.D();
        hashMap.put("pdp_to_bag_conversation_json", object);
        hashMap.put("is_prod_api_new", bl2);
        hashMap.put("is_search_optimisations_solr_enabled", bl2);
        object = K40.E();
        hashMap.put("pdp_ui_oos_configuration", object);
        object = K40.a();
        hashMap.put("ajio_return_cod_communication_pdp_cart", object);
        object = K40.z();
        hashMap.put("hm_preorder_json", object);
        object = K40.O();
        hashMap.put("sizeRecommendationConfig", object);
        object = K40.H();
        hashMap.put("priorityForPdpToolTip", object);
        hashMap.put("enable_hnm_post_order", bl2);
        object = K40.J();
        hashMap.put("rating_star_display_experience_json", object);
        hashMap.put("in_app_notification_config", "{\n  \"masterFlag\": false,\n  \"touchPointList\": \"wishlist,cart,sessions,ratings\",\n  \"noOfSessionsAfterNudgeToBeTriggered\": 2,\n  \"wishlist\": {\n    \"inAppPopUpDialogModel\": {\n      \"title\": \"Wishlist Title\",\n      \"description\": \"Wishlist desription\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    },\n    \"systemDialogModel\": {\n      \"title\": \"Wishlist Title Settings\",\n      \"description\": \"Wishlist desription Settings\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    }\n  },\n  \"cart\": {\n    \"inAppPopUpDialogModel\": {\n      \"title\": \"Cart Title\",\n      \"description\": \"Cart desription\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    },\n    \"systemDialogModel\": {\n      \"title\": \"Cart Title Settings\",\n      \"description\": \"Cart desription Settings\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    }\n  },\n  \"sessions\": {\n    \"inAppPopUpDialogModel\": {\n      \"title\": \"Sessions Title\",\n      \"description\": \"Sessions desription\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    },\n    \"systemDialogModel\": {\n      \"title\": \"Sessions Title Settings\",\n      \"description\": \"Sessions desription Settings\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    }\n  },\n  \"ratings\": {\n    \"inAppPopUpDialogModel\": {\n      \"title\": \"Ratings Title\",\n      \"description\": \"Ratings desription\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    },\n    \"systemDialogModel\": {\n      \"title\": \"<b>Ratings Title Settings</b>\",\n      \"description\": \"Ratings desription Settings\",\n      \"positiveButton\": \"Allow\",\n      \"negativeButton\": \"Deny\"\n    }\n  },\n  \"minGapInDaysToShowNudge\": 10,\n  \"maxNumberOfNudgesInDDays\": 10,\n  \"resetNudgeDisplayAfterDDays\": 5\n}");
        hashMap.put("enable_chat_post_order", bl2);
        hashMap.put("appsflyer_luxe_enabled", bl2);
        hashMap.put("enable_pancard_collection", "{\n  \"keyVersion\": \"VERSION_1\",\n  \"encryptionKey\": \"30819F300D06092A864886F70D010101050003818D0030818902818100ABE0E1F504F61CF2BD7A64B395CA86565B5DB9ABB0F39C44BE7F7082284ABC8DD31D5680F9A289BD851F0C3656F214998A4BFEEE86318BCE77BC01FE9F496257E7B167B303AE0D4F178D6EE044DD7636D1E24DEEB82453349A5BA1962C0F41C7C73A965EF64691EEA6D5CFE97C442A92F3947A059ED89470D7C8B7492C7D7CB90203010001\",\n  \"isPanEnabled\": false\n}");
        hashMap.put("emi_enabled", bl2);
        hashMap.put("enable_affise_debug_logs", constable);
        hashMap.put("isUCPLoginFlowEnable", bl2);
        object = K40.R();
        hashMap.put("UCP_Configuratiion", object);
        object = K40.y();
        hashMap.put("gwp_config", object);
        hashMap.put("enable_return_image_upload_debug_logs", constable);
        hashMap.put("priority_delivery_config", "{\n  \"isEnabled\": false,\n  \"priorityDeliveryIcon\": \"https://assets.ajio.com/cms/AJIO/MOBILE/Tags-Priority-Tags-V2-1.png\",\n  \"priorityTagImageWidth\": \"62\",\n  \"priorityTagImageHeight\": \"18\",\n  \"priorityDeliveryFeeLabel\": \"Priority Delivery Fee\",\n  \"priorityDeliveryFeeDes\": \"Charged to deliver your product on Priority\",\n  \"postOrder\": {\n    \"isEnabledPostOrder\": false,\n    \"free\": \"We regret not able to deliver via Priority Delivery. No refund will be initiated as Priority Delivery was free.\",\n    \"refundYetToBeInitiated\": \"Unable to deliver via Priority Delivery. Hence, refund of \u20b9%s will be initiated to your AJIO Cash\",\n    \"refundInitiated\": \"Refund of \u20b9%s Priority delivery fee has been initiated to AJIO Cash\",\n    \"refunded\": \"\u20b9%s Priority Delivery Fee has been refunded to AJIO Cash.\"\n  }\n}");
        object = "enable_utm_pdp_redirection";
        hashMap.put(object, bl2);
        jSONObject = K40.x();
        hashMap.put("external_ads_home_config", jSONObject);
        jSONObject = K40.Q();
        hashMap.put("third_party_banner_config", jSONObject);
        jSONObject = K40.A();
        hashMap.put("jioAdsConfigMisc", jSONObject);
        hashMap.put(object, bl2);
        hashMap.put("enable_traffic_specific_targeting_size_oos", bl2);
        hashMap.put("enable_deviceId_cohort", bl2);
        object = K40.C();
        hashMap.put("navigation_experiment3", object);
        hashMap.put("isAkamaiImageManager", bl2);
        hashMap.put("akamai_image_header", "image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        hashMap.put("enable_block_for_cancellation", bl2);
        hashMap.put("comingSoonFeatureConfig", "{\n  \"isEnabled\": false,\n  \"message\": \"Thank you! We'll let you know at launch\"\n}");
        object = K40.I();
        hashMap.put("quick_filter", object);
        object = K40.c();
        hashMap.put("akamai_image_optimisation", object);
        object = K40.p();
        hashMap.put("incentivize_customer_exchange", object);
        object = K40.t();
        hashMap.put("account_delete_config", object);
        hashMap.put("ABAjioPdpCrossCellWidgetEnable", bl2);
        object = K40.v();
        hashMap.put("dressToolPdpBannerConfig", object);
        object = K40.u();
        hashMap.put("dressToolAtcPopupConfig", object);
        object = K40.k();
        hashMap.put("CMSPageConfig", object);
        object = K40.w();
        hashMap.put("dynamic_app_icon_config", object);
        object = K40.G();
        hashMap.put("pdp_videos_config", object);
        hashMap.put("priorityDeliveryPhase2Config", "{\n  \"_comment\": \"This configuration controls delivery options on the PLP and PDP.\",\n  \"isEnabled\": false,\n  \"plpDelivery\": {\n    \"_comment\": \"PLP configuration starts here.\",\n    \"plpListing\": {\n      \"_comment\": \"This is for PLP Listing page.\",\n      \"plp_empty_screen_title\": \"Unfortunately, faster delivery is not offered in your location\",\n      \"plp_empty_screen_sub_title\": \"Try a different location or explore other products\",\n      \"deliverySlaTag\": {\n        \"SDD\": \"Today\",\n        \"NDD\": \"Tomorrow\",\n        \"2DD\": \"In 2-Days\",\n        \"4HR\": \"4 hours\"\n      }\n    },\n    \"plpFilters\": {\n      \"_comment\": \"This is for PLP-Filter page.\",\n      \"filterMessage\": \"* Some delivery option might be paid\",\n      \"enterLocationMessage\": \"Please enter your location to see the delivery options\",\n      \"facetTitle\": \"Delivery\",\n      \"facetPosition\": 2,\n      \"serviceabilityError\": \"Unfortunately, faster delivery is not offered in your location\",\n      \"enableFacetValues\": {\n        \"SDD\": \"Today\",\n        \"NDD\": \"Tomorrow\",\n        \"2DD\": \"In 2-Days\",\n        \"4HR\": \"4 hours\"\n      },\n      \"disableFacetValues\": [\n        \"4 hours\",\n        \"Today\",\n        \"Tomorrow\",\n        \"In 2-Days\"\n      ],\n      \"displayFacetSequence\": [\n        \"4HR\",\n        \"SDD\",\n        \"NDD\",\n        \"2DD\"\n      ]\n    }\n  },\n  \"pdpCartDelivery\": {\n    \"_comment\": \"PDP & Cart common configuration starts here.\",\n    \"deliverySLA\": {\n      \"4HR\": {\n        \"displayName\": \"Delivery by <b>4 hours</b>\",\n        \"showDay\": false\n      },\n      \"SDD\": {\n        \"displayName\": \"Delivery by <b>Today</b>\",\n        \"showDay\": false\n      },\n      \"NDD\": {\n        \"displayName\": \"Delivery by <b>Tomorrow</b>\",\n        \"showDay\": false\n      },\n      \"2DD\": {\n        \"displayName\": \"Delivery in <b>2 Days</b>\",\n        \"showDay\": true\n      }\n    }\n  },\n  \"spc\": {\n    \"deliverySLA\": {\n      \"4HR\": \"4 hours\"\n    }\n  },\n  \"thankYou\": {\n    \"deliverySLA\": {\n      \"4HR\": {\n        \"displayName\": \"Today, by\",\n        \"showTime\": true\n      }\n    }\n  }\n}");
        hashMap.put("mto_cancellation_message", "Please note that certain products have a limited window for cancellations. Once this period closes, cancellations cannot be processed. We appreciate your cooperation.");
        hashMap.put("isOspreySearchEnabled", bl2);
        hashMap.put("pdp_similar_size_filter_key", "size");
        object = K40.d();
        hashMap.put("appsflyerSessionEvent", object);
        object = K40.B();
        hashMap.put("metrics_logging", object);
        object = K40.q();
        hashMap.put("ajiogram_interventions", object);
        object = K40.m();
        hashMap.put("banner_ad_facet_percentage_config", object);
        object = K40.s();
        hashMap.put("jio_ads_plp_facets_config", object);
        object = K40.n();
        hashMap.put("cmsTopBarApiCacheConfig", object);
        object = K40.F();
        hashMap.put("payment_mode_improvement_config", object);
        object = K40.r();
        hashMap.put("jio_cdn", object);
        object = K40.j();
        hashMap.put("better_pdp_config", object);
        object = K40.b();
        hashMap.put("ajiogram_landing_page", object);
        hashMap.put("ExternalBrowserDeeplinkKeys", "{\n  \"deeplinkKeys\": [\n    \"/fc/\",\n    \"/fb/\"\n  ]\n}");
        object = K40.M();
        hashMap.put("return_processing_fee", object);
        hashMap.put("spc_customer_type_enabled", constable);
        object = K40.K();
        hashMap.put("refund_mop_list", object);
        hashMap.put("enabledCohortV2", bl2);
        object = K40.L();
        hashMap.put("return_flow_optimization", object);
        hashMap.put("personalisedUserRelevancy", bl2);
        return hashMap;
    }

    public static JSONObject p() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false,\n  \"callout1\": false,\n  \"callout2\": false,\n  \"showNudge\": false,\n  \"callout1_title\": \"Avoid losing %s on return 1\",\n  \"tryNudge\": false\n}");
        return jSONObject;
    }

    public static JSONObject q() {
        JSONObject jSONObject = new JSONObject("{\n  \"master\": false,\n  \"plp_tag_enabled\": false,\n  \"pdp_tag_enabled\": false,\n  \"pdp_widget_enabled\": false,\n  \"pdp_widget_autoscroll_enabled\": false,\n  \"tag_image\": \"https://assets.ajio.com/cms/AJIO/MOBILE/OG%20Logo_Large.png\",\n  \"tag_text\": \"#AJIOGRAM\",\n  \"tag_text_color\": \"#202020\",\n  \"tag_bg_color\": \"#D2D50C\",\n  \"pdp_widget_title\": \"Explore more #AJIOGRAM Products\",\n  \"pdp_widget_cta\": \"Visit #AJIGRAM Store\"\n}");
        return jSONObject;
    }

    public static JSONObject r() {
        JSONObject jSONObject = new JSONObject("{\n  \"fqdn_master\": false,\n  \"is_replace_fqdn_image\": false,\n  \"is_replace_fqdn_gif\": false,\n  \"metrics_master\": false,\n  \"is_metrics_required_image\": false,\n  \"is_metrics_required_gif\": false,\n  \"fqdn\": \"assets-jiocdn.ajio.com\"\n}");
        return jSONObject;
    }

    public static JSONObject s() {
        JSONObject jSONObject = new JSONObject("{\n  \"enabled\": false,\n  \"facetsList\": [\n    {\n      \"facet_type\": \"l1l3nestedcategory\",\n      \"percentage\": 10,\n      \"count\": 5,\n      \"jioAdsKey\": \"md_ajiocat\",\n      \"enable\": true\n    },\n    {\n      \"facet_type\": \"brand\",\n      \"percentage\": 10,\n      \"count\": 5,\n      \"jioAdsKey\": \"md_brand\",\n      \"enable\": true\n    }\n  ]\n}");
        return jSONObject;
    }

    public static JSONObject t() {
        JSONObject jSONObject = new JSONObject("{\n\"master\":false,\n\"your_data\":\"AJIO.com assures that your data is safe and secure and will not be used in any external advertising, marketing or other sources\",\n\"read_policy\":\"Your account will be deleted in 30 days and you will lose access to all your data and order history. You will not be able to recover your account in future and will be logged out after your confirmation. You won\u2019t be able to use your Email and Phone Number linked with this account to login or create new account for those 30 days.\\n\\nIf you decide later that you want to start ordering from us again, or if you would like to use websites features that require an account, you\u2019ll need to create a new account. Ajio will retain your transaction history.\",\n\"select_reason\":[\n\"Privacy Concerns\",\n\"Account Hacked\",\n\"Don\u2019t find it useful\"\n],\n\"account_deleted_info\":\"Your account will be deleted in 30 days. You have been logged out\"\n}");
        return jSONObject;
    }

    public static JSONObject u() {
        JSONObject jSONObject = new JSONObject("{\n  \"showPopup\": false,\n  \"title\": \"Woah! That\u2019s a great choice!\",\n  \"subTitle\": \"Need help finding a bra that pairs perfectly with this dress? We are here to help!\",\n  \"imgUrl\": \"\",\n  \"bannerName\": \"dress tool pdp atc banner\",\n  \"visibilityConditions\": {}\n}");
        return jSONObject;
    }

    public static JSONObject v() {
        JSONObject jSONObject = new JSONObject("{\n  \"showBanner\": false,\n  \"imgUrl\": \"\",\n  \"bannerName\": \"dress tool pdp banner\",\n  \"visibilityConditions\": {}\n}");
        return jSONObject;
    }

    public static JSONObject w() {
        JSONObject jSONObject = new JSONObject("{\n  \"master\": false,\n  \"eventDescription\": {\n    \"eventName\": \"IndependenceDayIcon\",\n    \"startDate\": \"2024-07-07T00:00:00+0530\",\n    \"endDate\": \"2024-07-07T00:25:00+0530\"\n  }\n}");
        return jSONObject;
    }

    public static JSONObject x() {
        JSONObject jSONObject = new JSONObject("{\n  \"isEnabled\": false,\n  \"apiTimeoutInterval\": 0.9,\n  \"isClickEnabled\": false\n}");
        return jSONObject;
    }

    public static JSONObject y() {
        JSONObject jSONObject = new JSONObject("{\n  \"master\": true,\n  \"freeTextOnProduct\": \"FREE\",\n  \"freebiesOne\": \"Get Freebies\",\n  \"freebiesMoreThanOne\": \"Get %x Freebies\",\n  \"cartfreebiesHeaderOne\": \"Freebies\",\n  \"cartfreebiesHeaderMore\": \"%x Freebies\",\n  \"cartUnlockFreebies\": \"You have Unlocked %x Freebies\",\n  \"cartUnlockFreebiesDescription\": \"You will get these Free Gifts delivered with Order\",\n  \"orderListingFreebiesWithProduct\": \"You have got Freebies with this product\",\n  \"orderListingMoreFreebiesWithProduct\": \"You have got %x Freebies with this product\",\n  \"orderFreebiesWithProduct\": \"Freebies with this product\",\n  \"orderMoreFreebiesWithProduct\": \"%x Freebies with this product\",\n  \"orderDetailsReturnFreebies\": \"Please Return Freebies with the product\",\n  \"orderDetailsReturnMoreFreebies\": \"Please Return %x Freebies with the product\",\n  \"orderReturnNeededFreebies\": \"For return Freebies are needed\",\n  \"orderReturnNeededMoreFreebies\": \"For return %x Freebies are needed\",\n  \"pdpFreebiesOne\": \"+ Get Freebies\",\n  \"pdpFreebiesMoreThanOne\": \"+ Get %x Freebies\",\n  \"viewAllProducts\": \"View all Products\",\n  \"termsAndCondition\": \"T&C\",\n  \"returnText\": \"*Needed for return\",\n  \"productLevelRemoveMsg\": \"Freebies with this product will be removed\",\n  \"cartLevelRemoveMsg\": \"may miss out on gifts\",\n  \"cartComboProductTitle\": \"on completing purchase of\",\n  \"orderCancelInitFreebies\": \"Freebies will be cancelled with this product\",\n  \"orderCancelInitMoreFreebies\": \"%x Freebies with this product\",\n  \"orderCancelDetailFreebies\": \"Freebie canceled with this product\",\n  \"orderCancelDetailMoreFreebies\": \"%x Freebies canceled with this product\",\n  \"cancelPolicy\": \"https://www.ajio.com/help/termsAndCondition?uiel=Mobile&isAppsFlag=true\"\n}");
        return jSONObject;
    }

    public static JSONObject z() {
        JSONObject jSONObject = new JSONObject("{\n  \"hm_preorder_master_flag\": false,\n  \"hm_preorder_wallet_excluded_text\": \"Wallet is not applicable due to the following products\",\n  \"hm_preorder_rone_excluded_text\": \"ROne is not applicable due to the following products\"\n}");
        return jSONObject;
    }
}

