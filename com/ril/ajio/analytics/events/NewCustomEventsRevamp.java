/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.events;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.ktx.Firebase;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class NewCustomEventsRevamp {
    public static final int $stable = 0;
    private static final String CLIENT_ID = "client_id";
    public static final NewCustomEventsRevamp$Companion Companion;
    private static final String EVENT_ACTION = "event_action";
    private static final String EVENT_CATEGORY = "event_category";
    private static final String EVENT_LABEL = "event_label";
    private static final String HYBRIS_ID = "hybris_id";
    private static final String IS_ANALYTICS_REVAMP = "isAnalyticsRevamp";
    private static final String LOGGED_IN_STATUS = "Logged_In_Status";
    private static final String LOGIN_TYPE = "login_type";
    private static final String NETWORK_TYPE = "network_type";
    private static final String PREVIOUS_SCREEN = "previous_screen_name";
    private static final String PREVIOUS_SCREEN_TYPE = "previous_screen_type";
    private static final String SCREENNAME = "screenname";
    private static final String SCREEN_NAME = "screen_name";
    private static final String SCREEN_TYPE = "screen_type";
    private static final String Time_O_Day = "time_of_the_day";
    private final String ACTION_TRANSFER_TO_BANK;
    private final String ADDRESS_TYPE;
    private final String CANCEL;
    private final String CANCEL_SUCCESS;
    private final String CASH_SCREEN_INTERACTIONS;
    private final String CD_NOTIFIED;
    private final String CD_TAARA;
    private final String CM_EP_AJIO_WALLET;
    private final String CM_EP_MAHACASHBACK;
    private final String CM_EP_RONE;
    private final String CM_EP_TAARA;
    private final String COMMENTS;
    private final String COUPONS_APPLICABLE;
    private final String COUPONS_AVAILABLE;
    private final String COUPON_CODE;
    private final String COUPON_TYPE;
    private final String DESCRIPTION;
    private final String DYNAMIC_WIDGET_VIEW;
    private final String EARLY_ACCESS_INTERACTION;
    private final String EA_BUSINESS_ERROR;
    private final String EA_CALL_ME_BACK;
    private final String EA_CALL_ME_BACK_SUCCESS;
    private final String EA_CANCEL_OREDER;
    private final String EA_CHAT_WITH_US;
    private final String EA_CONTACT_US;
    private final String EA_EMAIL;
    private final String EA_FULL_SCREEN;
    private final String EA_FULL_SCREEN_CTA;
    private final String EA_HELPLINE;
    private final String EA_LOGOUT;
    private final String EA_MINIMIZED;
    private final String EA_NAV_CLICK_FOOTER;
    private final String EA_NAV_CLICK_HEADER;
    private final String EA_NAV_CLICK_MAIN;
    private final String EA_NAV_FILTER_APPLY;
    private final String EA_NAV_FILTER_DISCARD;
    private final String EA_RETRUN_ORDER;
    private final String EA_TRACK_ORDER;
    private final String EA_VIDEO_PAUSED;
    private final String EA_VIDEO_PLAY;
    private final String EA_VIDEO_PLAYED;
    private final String EA_VIDEO_VIEW;
    private final String EA_VIDEO_VIEW_TIME;
    private final String EA_WAS_THAT_HELPFUL_THUMBS_DOWN;
    private final String EA_WAS_THAT_HELPFUL_THUMBS_UP;
    private final String EC_ADD_INTERACTION;
    private final String EC_AJIO_REF_INTERACTION;
    private final String EC_APP_UPDATE_INTERACTION;
    private final String EC_BAG_INTERACTIONS;
    private final String EC_CC_ORDER_INTERACTION;
    private final String EC_CHECKOUT_INTERACTIONS;
    private final String EC_CLOSET_INTERACTIONS;
    private final String EC_COUPON_INTERACTIONS;
    private final String EC_ERRORS;
    private final String EC_FAQ_INTERACTION;
    private final String EC_FLEEK_BLP_SEARCH_INTERACTIONS;
    private final String EC_FORM;
    private final String EC_IMAGE_SEARCH;
    private final String EC_INVITE_AND_EARN_INTERACTION;
    private final String EC_MY_ACC_INTERACTION;
    private final String EC_NOTI_INTERACTION;
    private final String EC_ORDER_CONFIRMATION;
    private final String EC_ORDER_DETAIL_INTERACTION;
    private final String EC_ORDER_LIST_INTERACTION;
    private final String EC_ORDER_PAYMENT_MODE_SAVED_EVENT_NAME;
    private final String EC_PAYMENT_INSTRUMENT_SCR_TYPE;
    private final String EC_PAYMENT_MODE_SAVED_ACTION;
    private final String EC_PREFERRED_MODE_ACTION;
    private final String EC_PREFERRED_MODE_SELECTED_ACTION;
    private final String EC_PRODUCT_DETAILS_INTERACTION;
    private final String EC_PRODUCT_DETAILS_INTERACTIONS;
    private final String EC_PRODUCT_LIST_INTERACTIONS;
    private final String EC_SEARCH_BAR_INTERACTIONS;
    private final String EC_SEARCH_INTERACTIONS;
    private final String EC_SELF_CARE_INTERACTION;
    private final String EC_SELF_CARE_ISSUE_INTERACTION;
    private final String EC_SHOP_THE_LOOK;
    private final String EC_SPC_PAYMENT_MODE_SAVED_EVENT_NAME;
    private final String EC_USER_ACCOUNTS;
    private final String EC_USER_INTERACTION;
    private final String EC_WALLET_CHECK_BALANCE_TYPE;
    private final String EC_WALLET_INTERACTION;
    private final String EC_WIDGET_INTERACTION;
    private final String EC_WIDGET_INTERACTION_EVENT;
    private final String EC_WISHLIST_INTERACTIONS;
    private final String EN_COUPON_INTERACTIONS;
    private final String EN_MY_ACCOUNT_INTERACTIONS;
    private final String EN_NAV_CLICK;
    private final String EN_SELF_CARE_INTERACTION;
    private final String EVENT_ACTION_DELETE_ACCOUNT_CANCEL_CLICK;
    private final String EVENT_ACTION_DELETE_ACCOUNT_CLICK;
    private final String EVENT_ACTION_DELETE_ACCOUNT_DONE;
    private final String EVENT_ACTION_DELETE_REASON_SELECT_OPTION;
    private final String EVENT_ACTION_EXPLORE_ALL;
    private final String EVENT_ACTION_ICON_CLICK;
    private final String EVENT_ACTION_RATING_WIDGETS;
    private final String EVENT_ACTION_STORE_SWITCH;
    private final String EVENT_ACTION_STORE_SWITCH_CLOSED;
    private final String EVENT_ACTION_YOUR_DATA_DELETE_ACCOUNT_CLICK;
    private final String EVENT_CATEGORY$1;
    private final String EVENT_CATEGORY_DELETE_PROFILE;
    private final String EVENT_CATEGORY_DYNAMIC_EXPLORE;
    private final String EVENT_CATEGORY_FOOTER_NAVIGATION_INTERACTIONS;
    private final String EVENT_CATEGORY_MY_ACCOUNT_INTERACTIONS;
    private final String EVENT_CATEGORY_PRODUCT_EXPLORE;
    private final String EVENT_CATEGORY_QUICK_FILTER_INTERACTIONS;
    private final String EVENT_CATEGORY_STORE_SWITCH_INTERACTIONS;
    private final String EVENT_CATEGORY_USER_LEVEL_EXPLORE;
    private final String EVENT_DELETE_MY_ACCOUNT_INTERACTIONS;
    private final String EVENT_FOOTER_NAVIGATION_MENU_CLICK;
    private final String EVENT_LABEL_RATING_WIDGETS;
    private final String EVENT_NAME_AKAMAI_LOGGING;
    private final String EVENT_NAME_EXPLORE_ALL;
    private final String EVENT_NAME_QUICK_FILTER_INTERACTIONS;
    private final String EVENT_NAME_USER_LEVEL_EXPLORE;
    private final String EVENT_PLP_FILTER_APPLY;
    private final String EVENT_REVIEWS_RATING_INTERACTIONS;
    private final String EVENT_STORE_SWITCH_INTERACTIONS;
    private final String EVENT_TRANSFER_TO_BANK;
    private final String EV_NAME_LANDING_SCREEN_INTERACTION;
    private final String EV_NAME_VIDEO_SCREEN_INTERACTION;
    private final String EXCHANGE_MODE_SELECTION_INTERACTION;
    private final String EXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY;
    private final String EXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT;
    private final String FAQ_QUESTION;
    private final String GAME_AVG_RUNTIME;
    private final String INSTALL_NOW_CTA_VIEW;
    private final String IS_AUTO_PLAY_ENABLED;
    private final String LOGIN_SIGNUP_SRC;
    private final String LOGIN_TYPE$1;
    private final String NEW_NOTIFICATION;
    private final String NO_OF_ADDRESS;
    private final String NUMBER_OF_CARDS;
    private final String NUMBER_OF_GAMES;
    private final String NUMBER_OF_ITEMS;
    private final String NUMBER_OF_ORDER;
    private final String NUMBER_OF_PRODUCTS;
    private final String NUMBER_OF_RESULT;
    private final String NUMBER_OF_SIZE_OOS;
    private final String NUMBER_OF_TRANSACTION;
    private final String ORDER_ID;
    private final String ORDER_ITEM_DETAILS_INTERACTION_CATEGORY;
    private final String ORDER_ITEM_DETAILS_INTERACTION_EVENT;
    private final String PAGELOAD;
    private final String PAGE_LOAD;
    private final String PAYMENT_AMOUNT;
    private final String PAYMENT_MODE;
    private final String PAYMENT_TYPE;
    private final String PLAY_DURATION;
    private final String POSTAL_CODE;
    private final String PRODUCT_BRAND;
    private final String PRODUCT_BRICK;
    private final String PRODUCT_CATEGORY;
    private final String PRODUCT_COLOR;
    private final String PRODUCT_DISCOUNT;
    private final String PRODUCT_GENDER;
    private final String PRODUCT_ID;
    private final String PRODUCT_MRP;
    private final String PRODUCT_NAME;
    private final String PRODUCT_PRICE;
    private final String PRODUCT_SIZE;
    private final String PRODUCT_TAG;
    private final String PRODUCT_VERTICAL;
    private final String PURCHASE_RECOMMENDATIONS;
    private final String RATING;
    private final String REASON;
    private final String REFUND_BREAKUP;
    private final String RETURN_CANCELLATION_HALFCARD_CATEGORY;
    private final String RETURN_CANCELLATION_HALFCARD_EVENT;
    private final String RETURN_FEE_HALF_CARD_INTERACTION;
    private final String RETURN_MODE_SELECTION_INTERACTION;
    private final String RETURN_ORDER_DETAIL_INTERACTION;
    private final String REWARD_TYPE;
    private final String SHIPPING_CHARGES;
    private final String SIZE_CHART;
    private final String SIZE_CHART_INTERACTION;
    private final String SIZE_CHART_INTERACTIONS;
    private final String STEP;
    private final String SV_EP_AGE;
    private final String SV_EP_AJIO_WALLET;
    private final String SV_EP_CART_TYPE;
    private final String SV_EP_COD_FEE_ACTUAL;
    private final String SV_EP_COD_FEE_SLASHED;
    private final String SV_EP_CTA_DISABLE;
    private final String SV_EP_DEF_ADD;
    private final String SV_EP_DEF_ADD_PIN;
    private final String SV_EP_DELIVERY_FEE;
    private final String SV_EP_DELIVERY_SLASHED_FEE;
    private final String SV_EP_DISCOVER_BRAND_CLICKED;
    private final String SV_EP_EDD_DELIVERY_DATE_DIFF;
    private final String SV_EP_EDD_MAX;
    private final String SV_EP_EDD_MODE;
    private final String SV_EP_EDD_TYPE;
    private final String SV_EP_FIND_RECOMMENDED_SIZE_CLICK;
    private final String SV_EP_FIND_RECOMMENDED_SIZE_DISPLAY;
    private final String SV_EP_FLICK_BPL_SEARCH;
    private final String SV_EP_NON_DELIVERABLE_COUNT;
    private final String SV_EP_OFFERS;
    private final String SV_EP_OOS_SKU;
    private final String SV_EP_OUTTAGE_MESG;
    private final String SV_EP_PDP_STYLES_CLICKED;
    private final String SV_EP_PRDT_AVL;
    private final String SV_EP_PROMO_MSG;
    private final String SV_EP_PROMO_PRE_APLD;
    private final String SV_EP_RECOMMENDED_SIZE_CLICK;
    private final String SV_EP_RONE;
    private final String SV_EP_RVP_FEE;
    private final String SV_EP_STATUS;
    private final String SV_EP_TOTAL_CONV_FEE;
    private final String SV_EP_VIEW_ALL_PRODUCTS_CLICK;
    private final String SV_EP_VIEW_STORE_CLICK;
    private final String SV_ESTIMATE_DELIVERY_DATE;
    private final String SV_SOURCE_SCREEN;
    private final String SV_ZERO_SEARCH_TERM;
    private final String TOTAL_DISCOUNT;
    private final String TOTAL_NOTIFICATION;
    private final String TOTAL_SCORE;
    private final String TYPE;
    private final String UPDATE_POP_UP_VIEW;
    private final String USER_FRAUD_STATUS;
    private final String USER_STATUS;
    private final String VIDEO_LOAD_TIME;
    private final String VIDEO_LOOPS;
    private final String VIDEO_NAME;
    private final String VIDEO_TOTAL_VIEW_TIME;
    private final String VIDEO_VIEWS;
    private final String WALLET_WIDGET_VIEW;
    private final FirebaseAnalytics analytics;
    private final jo_2 appPreferences;
    private final GAUtils gaUtils;
    private boolean isUserLanding;
    private final UserInformation userInformation;

    static {
        NewCustomEventsRevamp$Companion newCustomEventsRevamp$Companion;
        Companion = newCustomEventsRevamp$Companion = new NewCustomEventsRevamp$Companion(null);
        $stable = 8;
    }

    public NewCustomEventsRevamp() {
        GAUtils gAUtils;
        String string2;
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Object object2 = new jo_2((Context)object);
        this.appPreferences = object2;
        object2 = UserInformation.getInstance((Context)AJIOApplication$a.a());
        Intrinsics.checkNotNullExpressionValue(object2, "getInstance(...)");
        this.userInformation = object2;
        this.analytics = object2 = AnalyticsKt.getAnalytics(Firebase.INSTANCE);
        this.PRODUCT_NAME = "product_name";
        this.PRODUCT_ID = "product_id";
        this.PRODUCT_BRAND = "product_brand";
        this.PRODUCT_PRICE = "product_price";
        this.PRODUCT_COLOR = "product_color";
        this.PRODUCT_DISCOUNT = "product_trade_discount";
        this.PRODUCT_CATEGORY = "product_category";
        this.PRODUCT_GENDER = "product_gender";
        this.PRODUCT_VERTICAL = "product_vertical";
        this.PRODUCT_BRICK = "product_brick";
        this.PRODUCT_TAG = "product_tag";
        this.PRODUCT_SIZE = "product_size";
        this.PRODUCT_MRP = "product_mrp";
        this.COUPON_CODE = "coupon_code";
        this.NUMBER_OF_RESULT = "number_of_results";
        this.COUPON_TYPE = "coupon_type";
        this.POSTAL_CODE = "postal_code";
        this.ADDRESS_TYPE = "address_type";
        this.PAYMENT_MODE = "payment_mode";
        this.LOGIN_SIGNUP_SRC = "login_signup_source";
        this.ORDER_ID = "order_id";
        this.STEP = "step";
        this.LOGIN_TYPE$1 = LOGIN_TYPE;
        this.RATING = "rating";
        this.COMMENTS = "comments";
        this.TOTAL_NOTIFICATION = "total_notification";
        this.NEW_NOTIFICATION = "new_notification";
        this.NUMBER_OF_ITEMS = "number_of_items";
        this.NUMBER_OF_SIZE_OOS = "number_of_size_oos";
        this.SHIPPING_CHARGES = "shipping_charges";
        this.COUPONS_AVAILABLE = "coupons_available";
        this.COUPONS_APPLICABLE = "coupons_applicable";
        this.TOTAL_DISCOUNT = "total_discount";
        this.PAYMENT_TYPE = "payment_type";
        this.NUMBER_OF_ORDER = "no_of_orders";
        this.NUMBER_OF_PRODUCTS = "number_of_products";
        this.FAQ_QUESTION = "faq_question";
        this.NUMBER_OF_TRANSACTION = "number_of_transaction";
        this.NO_OF_ADDRESS = "no_of_address";
        this.NUMBER_OF_CARDS = "number_of_cards";
        this.NUMBER_OF_GAMES = "number_of_games";
        this.TOTAL_SCORE = "total_score";
        this.REWARD_TYPE = "reward_type";
        this.PLAY_DURATION = "play_duration";
        this.GAME_AVG_RUNTIME = "game_avg_runtime";
        this.EVENT_PLP_FILTER_APPLY = "plp_filter_apply";
        this.REASON = "reason";
        this.PAYMENT_AMOUNT = "payment_amount";
        this.EN_NAV_CLICK = "navigation_click";
        this.EN_SELF_CARE_INTERACTION = "event_self_care_interactions";
        this.EN_MY_ACCOUNT_INTERACTIONS = object2 = "my_account_interactions";
        this.EN_COUPON_INTERACTIONS = "coupon_interactions";
        this.EC_BAG_INTERACTIONS = "bag interactions";
        this.EC_WIDGET_INTERACTION = "widget interactions";
        this.EC_WIDGET_INTERACTION_EVENT = "widget_interaction";
        this.EC_COUPON_INTERACTIONS = "coupon interactions";
        this.EC_CHECKOUT_INTERACTIONS = "checkout interactions";
        this.EC_ORDER_CONFIRMATION = "order confirmation interactions";
        this.EC_WISHLIST_INTERACTIONS = "wishlist interactions";
        this.EC_PRODUCT_LIST_INTERACTIONS = "product list interactions";
        this.EC_PRODUCT_DETAILS_INTERACTIONS = "product details interactions";
        this.EC_FORM = "form interactions";
        this.EC_ERRORS = "errors interactions";
        this.EC_MY_ACC_INTERACTION = object = "my account interactions";
        this.EC_ORDER_LIST_INTERACTION = "order listing interactions";
        this.EC_ORDER_DETAIL_INTERACTION = "orders detail interactions";
        this.EC_USER_INTERACTION = "user interactions";
        this.EC_SELF_CARE_ISSUE_INTERACTION = "self care issue interactions";
        this.EC_SELF_CARE_INTERACTION = "self care interactions";
        this.EC_CLOSET_INTERACTIONS = "closet interactions";
        this.EA_CALL_ME_BACK_SUCCESS = "service success";
        this.EA_CHAT_WITH_US = "chat with us";
        this.EA_WAS_THAT_HELPFUL_THUMBS_UP = string2 = "was that helpful";
        this.EA_WAS_THAT_HELPFUL_THUMBS_DOWN = string2;
        this.EA_CONTACT_US = "contact us";
        this.EA_TRACK_ORDER = "track";
        this.EA_RETRUN_ORDER = "retrun";
        this.EA_CANCEL_OREDER = string2 = "cancel";
        this.EA_HELPLINE = "helpline";
        this.EA_EMAIL = "email";
        this.EA_CALL_ME_BACK = "request call back";
        this.EC_IMAGE_SEARCH = "image search";
        this.EA_VIDEO_PAUSED = "video paused";
        this.EA_VIDEO_PLAYED = "video played";
        this.EA_VIDEO_PLAY = "video play";
        this.EA_VIDEO_VIEW = "video view";
        this.EA_VIDEO_VIEW_TIME = "video view time";
        this.EA_FULL_SCREEN = "full screen";
        this.EA_MINIMIZED = "minimized";
        this.EA_FULL_SCREEN_CTA = "full screen cta";
        this.EC_SHOP_THE_LOOK = "shop the look video interactions";
        this.EC_APP_UPDATE_INTERACTION = "app update interaction";
        this.EC_USER_ACCOUNTS = "user account interactions";
        this.EC_WALLET_INTERACTION = "wallet interactions";
        this.EC_PAYMENT_INSTRUMENT_SCR_TYPE = "spc interaction";
        this.EC_WALLET_CHECK_BALANCE_TYPE = "check balance interaction";
        this.EC_NOTI_INTERACTION = "notification interactions";
        this.EC_AJIO_REF_INTERACTION = "ajio referral interactions";
        this.EC_INVITE_AND_EARN_INTERACTION = "invite and earn interactions";
        this.EC_ADD_INTERACTION = "address interactions";
        this.EC_FAQ_INTERACTION = "faq interactions";
        this.EC_CC_ORDER_INTERACTION = "customer care order interactions";
        this.EC_SEARCH_INTERACTIONS = "search interactions";
        this.EC_FLEEK_BLP_SEARCH_INTERACTIONS = "fleek blp interactions";
        this.EA_NAV_CLICK_HEADER = "navigation click - header menu";
        this.EA_NAV_CLICK_FOOTER = "navigation click - footer menu";
        this.EA_NAV_CLICK_MAIN = "navigation click - main menu";
        this.EA_NAV_FILTER_DISCARD = "No, Leave";
        this.EA_NAV_FILTER_APPLY = "Yes, Do it";
        this.EA_LOGOUT = "logout";
        this.EA_BUSINESS_ERROR = "business error";
        this.SV_EP_PROMO_PRE_APLD = "promotion_pre_applied";
        this.SV_EP_PROMO_MSG = "promotion_message";
        this.SV_EP_CART_TYPE = "cart_type";
        this.SV_EP_PRDT_AVL = "product_available";
        this.SV_EP_CTA_DISABLE = "cta_disabled";
        this.SV_EP_STATUS = "status";
        this.SV_EP_RONE = "rone";
        this.SV_EP_AJIO_WALLET = "ajio_wallet";
        this.CM_EP_RONE = "rone_cm";
        this.CM_EP_TAARA = "tara_cm";
        this.CD_NOTIFIED = "notified";
        this.CD_TAARA = "tara";
        this.CM_EP_AJIO_WALLET = "ajio_wallet_cm";
        this.CM_EP_MAHACASHBACK = "mahacashback_cm";
        this.SV_EP_OUTTAGE_MESG = "outtage_message";
        this.SV_EP_OFFERS = "offers";
        this.SV_EP_DEF_ADD = "default_address";
        this.SV_EP_DEF_ADD_PIN = "default_address_pin_code";
        this.SV_EP_EDD_TYPE = "edd_type";
        this.SV_EP_EDD_MAX = "max_edd";
        this.SV_EP_EDD_MODE = "edd_mode";
        this.SV_ZERO_SEARCH_TERM = "zero_search_term";
        this.SV_ESTIMATE_DELIVERY_DATE = "EDD";
        this.SV_SOURCE_SCREEN = "source_screen";
        this.UPDATE_POP_UP_VIEW = "update pop up view";
        this.INSTALL_NOW_CTA_VIEW = "install now cta view";
        this.isUserLanding = true;
        this.gaUtils = gAUtils = new GAUtils();
        this.SV_EP_EDD_DELIVERY_DATE_DIFF = "edd_delivery_date_difference";
        this.SV_EP_NON_DELIVERABLE_COUNT = "non_deliverable_count";
        this.EV_NAME_LANDING_SCREEN_INTERACTION = "landing_screen_interactions";
        this.EV_NAME_VIDEO_SCREEN_INTERACTION = "video_screen_interaction";
        this.USER_STATUS = "user_status";
        this.SV_EP_COD_FEE_SLASHED = "cod_fee_slashed";
        this.SV_EP_COD_FEE_ACTUAL = "cod_fee_actual";
        this.SV_EP_RVP_FEE = "rvp_fee";
        this.SV_EP_DELIVERY_FEE = "delivery_fee_actual";
        this.SV_EP_DELIVERY_SLASHED_FEE = "delivery_fee_slashed";
        this.SV_EP_TOTAL_CONV_FEE = "total_convenience_fee";
        this.SV_EP_FIND_RECOMMENDED_SIZE_CLICK = "find recommended size click";
        this.SV_EP_FIND_RECOMMENDED_SIZE_DISPLAY = "recommended size display";
        this.SV_EP_RECOMMENDED_SIZE_CLICK = "recommended size click";
        this.EC_PRODUCT_DETAILS_INTERACTION = "product detail interactions";
        this.EC_SEARCH_BAR_INTERACTIONS = "search bar interactions";
        this.SV_EP_AGE = "cart_age";
        this.SV_EP_OOS_SKU = "oos_sku";
        this.EARLY_ACCESS_INTERACTION = "early access interaction";
        this.SIZE_CHART = "size chart";
        this.SIZE_CHART_INTERACTION = "size_chart_interaction";
        this.SIZE_CHART_INTERACTIONS = "size chart interactions";
        this.PURCHASE_RECOMMENDATIONS = "purchase recommendations";
        this.CASH_SCREEN_INTERACTIONS = "cash screen interactions";
        this.ACTION_TRANSFER_TO_BANK = "transfer to bank click";
        this.EVENT_TRANSFER_TO_BANK = "transfer_to_bank_CTA";
        this.EC_PAYMENT_MODE_SAVED_ACTION = "user payment mode saved";
        this.EC_ORDER_PAYMENT_MODE_SAVED_EVENT_NAME = "user_pay_mode_saved";
        this.EC_SPC_PAYMENT_MODE_SAVED_EVENT_NAME = "spc_user_pay_mode_saved";
        this.EC_PREFERRED_MODE_ACTION = "preferred payment mode view";
        this.EC_PREFERRED_MODE_SELECTED_ACTION = "preferred mode selected";
        this.VIDEO_LOOPS = "video_loops";
        this.VIDEO_VIEWS = "video_views";
        this.VIDEO_NAME = "video_name";
        this.IS_AUTO_PLAY_ENABLED = "is_auto_play_enabled";
        this.VIDEO_LOAD_TIME = "video_load_time";
        this.VIDEO_TOTAL_VIEW_TIME = "video_total_view_time";
        this.USER_FRAUD_STATUS = "otp_validation_needed";
        this.WALLET_WIDGET_VIEW = "wallet widget view";
        this.CANCEL = string2;
        this.CANCEL_SUCCESS = "cancelordersuccessful";
        this.PAGELOAD = "pageload";
        this.PAGE_LOAD = "page_load";
        this.DESCRIPTION = "description";
        this.RETURN_MODE_SELECTION_INTERACTION = "return mode selection interaction";
        this.EXCHANGE_MODE_SELECTION_INTERACTION = "exchange mode selection interaction";
        this.TYPE = "type";
        this.EVENT_CATEGORY$1 = EVENT_CATEGORY;
        this.EVENT_CATEGORY_USER_LEVEL_EXPLORE = "user_level widget interactions";
        this.EVENT_NAME_USER_LEVEL_EXPLORE = "user_level_widget_interactions";
        this.EVENT_CATEGORY_DYNAMIC_EXPLORE = "Dynamic widget interactions";
        this.EVENT_CATEGORY_PRODUCT_EXPLORE = "product widget interactions";
        this.EVENT_ACTION_EXPLORE_ALL = "explore all click";
        this.EVENT_NAME_EXPLORE_ALL = "dynamic_widget_interactions";
        this.EVENT_CATEGORY_FOOTER_NAVIGATION_INTERACTIONS = "footer navigation interactions";
        this.EVENT_FOOTER_NAVIGATION_MENU_CLICK = "footer_navigation_menu_click";
        this.EVENT_ACTION_ICON_CLICK = "icon - click";
        this.EVENT_CATEGORY_STORE_SWITCH_INTERACTIONS = "store switch interactions";
        this.EVENT_STORE_SWITCH_INTERACTIONS = "store_switch_interactions";
        this.EVENT_ACTION_STORE_SWITCH = "store switch";
        this.EVENT_ACTION_STORE_SWITCH_CLOSED = "store switch closed";
        this.SV_EP_VIEW_STORE_CLICK = "view store click";
        this.SV_EP_VIEW_ALL_PRODUCTS_CLICK = "view all products click";
        this.SV_EP_PDP_STYLES_CLICKED = "PDP styles clicked";
        this.SV_EP_DISCOVER_BRAND_CLICKED = "Discover brand clicked";
        this.SV_EP_FLICK_BPL_SEARCH = "fleek_blp_search_interactions";
        this.EVENT_REVIEWS_RATING_INTERACTIONS = "reviews_rating_interactions";
        this.EVENT_ACTION_RATING_WIDGETS = "give rating widget - stars";
        this.EVENT_LABEL_RATING_WIDGETS = "seen";
        this.EVENT_CATEGORY_QUICK_FILTER_INTERACTIONS = "quick filter interactions";
        this.EVENT_NAME_QUICK_FILTER_INTERACTIONS = "quick_filter_interactions";
        this.EVENT_NAME_AKAMAI_LOGGING = "akamai_logging";
        this.ORDER_ITEM_DETAILS_INTERACTION_EVENT = "order_item_details_interaction";
        this.ORDER_ITEM_DETAILS_INTERACTION_CATEGORY = "order item details interaction";
        this.RETURN_CANCELLATION_HALFCARD_CATEGORY = "return cancellation halfcard screen interactions";
        this.RETURN_CANCELLATION_HALFCARD_EVENT = "return_cancellation_halfcard_interaction";
        this.EXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT = "exchange_nudge_bottom_card_interaction";
        this.EXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY = "exchange nudge bottom card interaction";
        this.EVENT_CATEGORY_DELETE_PROFILE = "delete profile interaction";
        this.EVENT_ACTION_DELETE_ACCOUNT_CLICK = "Delete account";
        this.EVENT_ACTION_DELETE_ACCOUNT_CANCEL_CLICK = string2;
        this.EVENT_ACTION_DELETE_ACCOUNT_DONE = "delete account done";
        this.EVENT_ACTION_DELETE_REASON_SELECT_OPTION = "select option";
        this.EVENT_DELETE_MY_ACCOUNT_INTERACTIONS = object2;
        this.EVENT_CATEGORY_MY_ACCOUNT_INTERACTIONS = object;
        this.EVENT_ACTION_YOUR_DATA_DELETE_ACCOUNT_CLICK = "delete account";
        this.RETURN_FEE_HALF_CARD_INTERACTION = "return_fee_halfcard_interaction";
        this.REFUND_BREAKUP = "refund_breakup";
        this.RETURN_ORDER_DETAIL_INTERACTION = "return_order_details_interaction";
        this.DYNAMIC_WIDGET_VIEW = "Dynamic widget view";
    }

    private final String getLoggedINStatus() {
        String string2 = this.userInformation.getUserStatusMessage();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserStatusMessage(...)");
        return string2;
    }

    private final String getStoreType() {
        ld3_2 ld3_22;
        String string2;
        String string3 = od3_2.a();
        boolean bl2 = Intrinsics.areEqual(string3, string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId());
        if (bl2) {
            return ld3_22.getStoreId();
        }
        bl2 = og1_1.c();
        string3 = bl2 ? "luxe" : "ajio";
        return string3;
    }

    private final Pair handleExistingUser(boolean bl2) {
        String string2 = bl2 ? "ucp-login-success" : "ucp-login-failure";
        Pair pair = new Pair(string2, "login method otp");
        return pair;
    }

    private final Pair handleNewUser(boolean bl2, boolean bl3) {
        String string2 = bl2 && bl3 ? "ucp-sign up-success-referral" : (bl2 ? "ucp-sign up-success" : (bl3 ? "ucp-sign up-failure-referral" : "ucp-sign up-failure"));
        Pair pair = new Pair(string2, "signup method otp");
        return pair;
    }

    public static /* synthetic */ Bundle makeBundle$default(NewCustomEventsRevamp newCustomEventsRevamp, Bundle bundle, String string2, String string3, String string4, String string5, String string6, String string7, String string8, boolean bl2, int n3, Object object) {
        boolean bl3;
        int n4 = n3;
        n4 = n3 & 0x100;
        if (n4 != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        return newCustomEventsRevamp.makeBundle(bundle, string2, string3, string4, string5, string6, string7, string8, bl3);
    }

    public static /* synthetic */ void newBagPushCustomEvent$default(NewCustomEventsRevamp newCustomEventsRevamp, String string2, String string3, String string4, String string5, String string6, String string7, String string8, Bundle bundle, String string9, int n3, Object object) {
        String string10;
        int n4 = n3 & 4;
        String string11 = "";
        String string12 = n4 != 0 ? string11 : string4;
        n4 = n3 & 8;
        String string13 = n4 != 0 ? (string10 = "custom_event") : string5;
        n4 = n3 & 0x10;
        String string14 = n4 != 0 ? string11 : string6;
        n4 = n3 & 0x20;
        String string15 = n4 != 0 ? string11 : string7;
        n4 = n3 & 0x40;
        String string16 = n4 != 0 ? string11 : string8;
        newCustomEventsRevamp.newBagPushCustomEvent(string2, string3, string12, string13, string14, string15, string16, bundle, string9);
    }

    public static /* synthetic */ void newPushCustomEvent$default(NewCustomEventsRevamp newCustomEventsRevamp, String string2, String string3, String string4, String string5, String string6, String string7, String string8, Bundle bundle, String string9, boolean bl2, String string10, int n3, Object object) {
        boolean bl3;
        Bundle bundle2;
        String string11;
        int n4 = n3;
        int n7 = n3 & 4;
        String string12 = "";
        String string13 = n7 != 0 ? string12 : string4;
        n7 = n4 & 8;
        String string14 = n7 != 0 ? (string11 = "custom_event") : string5;
        n7 = n4 & 0x10;
        String string15 = n7 != 0 ? string12 : string6;
        n7 = n4 & 0x20;
        String string16 = n7 != 0 ? string12 : string7;
        n7 = n4 & 0x40;
        String string17 = n7 != 0 ? string12 : string8;
        n7 = n4 & 0x80;
        if (n7 != 0) {
            n7 = 0;
            string11 = null;
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        n7 = n4 & 0x200;
        if (n7 != 0) {
            n7 = 0;
            string11 = null;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        String string18 = (n4 &= 0x400) != 0 ? string12 : string10;
        newCustomEventsRevamp.newPushCustomEvent(string2, string3, string13, string14, string15, string16, string17, bundle2, string9, bl3, string18);
    }

    public static /* synthetic */ void newPushCustomScreenView$default(NewCustomEventsRevamp newCustomEventsRevamp, String string2, String string3, String string4, Bundle bundle, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        String string6 = "";
        String string7 = n4 != 0 ? string6 : string2;
        int n7 = n3 & 2;
        String string8 = n7 != 0 ? string6 : string3;
        n7 = n3 & 4;
        String string9 = n7 != 0 ? string6 : string4;
        n7 = n3 & 8;
        if (n7 != 0) {
            bundle = null;
        }
        newCustomEventsRevamp.newPushCustomScreenView(string7, string8, string9, bundle, string5);
    }

    public static /* synthetic */ void sendLoginRegisterEvent$default(NewCustomEventsRevamp newCustomEventsRevamp, boolean bl2, String string2, String string3, String string4, String string5, boolean bl3, String string6, int n3, Object object) {
        boolean bl4;
        String string7;
        int n4 = n3 & 0x20;
        if (n4 != 0) {
            n4 = 0;
            string7 = null;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        n4 = n3 & 0x40;
        String string8 = n4 != 0 ? (string7 = "") : string6;
        newCustomEventsRevamp.sendLoginRegisterEvent(bl2, string2, string3, string4, string5, bl4, string8);
    }

    public final String getACTION_TRANSFER_TO_BANK() {
        return this.ACTION_TRANSFER_TO_BANK;
    }

    public final String getADDRESS_TYPE() {
        return this.ADDRESS_TYPE;
    }

    public final String getCANCEL() {
        return this.CANCEL;
    }

    public final String getCANCEL_SUCCESS() {
        return this.CANCEL_SUCCESS;
    }

    public final String getCASH_SCREEN_INTERACTIONS() {
        return this.CASH_SCREEN_INTERACTIONS;
    }

    public final String getCD_NOTIFIED() {
        return this.CD_NOTIFIED;
    }

    public final String getCD_TAARA() {
        return this.CD_TAARA;
    }

    public final String getCM_EP_AJIO_WALLET() {
        return this.CM_EP_AJIO_WALLET;
    }

    public final String getCM_EP_MAHACASHBACK() {
        return this.CM_EP_MAHACASHBACK;
    }

    public final String getCM_EP_RONE() {
        return this.CM_EP_RONE;
    }

    public final String getCM_EP_TAARA() {
        return this.CM_EP_TAARA;
    }

    public final String getCOMMENTS() {
        return this.COMMENTS;
    }

    public final String getCOUPONS_APPLICABLE() {
        return this.COUPONS_APPLICABLE;
    }

    public final String getCOUPONS_AVAILABLE() {
        return this.COUPONS_AVAILABLE;
    }

    public final String getCOUPON_CODE() {
        return this.COUPON_CODE;
    }

    public final String getCOUPON_TYPE() {
        return this.COUPON_TYPE;
    }

    public final String getDESCRIPTION() {
        return this.DESCRIPTION;
    }

    public final String getDYNAMIC_WIDGET_VIEW() {
        return this.DYNAMIC_WIDGET_VIEW;
    }

    public final String getEARLY_ACCESS_INTERACTION() {
        return this.EARLY_ACCESS_INTERACTION;
    }

    public final String getEA_BUSINESS_ERROR() {
        return this.EA_BUSINESS_ERROR;
    }

    public final String getEA_CALL_ME_BACK() {
        return this.EA_CALL_ME_BACK;
    }

    public final String getEA_CALL_ME_BACK_SUCCESS() {
        return this.EA_CALL_ME_BACK_SUCCESS;
    }

    public final String getEA_CANCEL_OREDER() {
        return this.EA_CANCEL_OREDER;
    }

    public final String getEA_CHAT_WITH_US() {
        return this.EA_CHAT_WITH_US;
    }

    public final String getEA_CONTACT_US() {
        return this.EA_CONTACT_US;
    }

    public final String getEA_EMAIL() {
        return this.EA_EMAIL;
    }

    public final String getEA_FULL_SCREEN() {
        return this.EA_FULL_SCREEN;
    }

    public final String getEA_FULL_SCREEN_CTA() {
        return this.EA_FULL_SCREEN_CTA;
    }

    public final String getEA_HELPLINE() {
        return this.EA_HELPLINE;
    }

    public final String getEA_LOGOUT() {
        return this.EA_LOGOUT;
    }

    public final String getEA_MINIMIZED() {
        return this.EA_MINIMIZED;
    }

    public final String getEA_NAV_CLICK_FOOTER() {
        return this.EA_NAV_CLICK_FOOTER;
    }

    public final String getEA_NAV_CLICK_HEADER() {
        return this.EA_NAV_CLICK_HEADER;
    }

    public final String getEA_NAV_CLICK_MAIN() {
        return this.EA_NAV_CLICK_MAIN;
    }

    public final String getEA_NAV_FILTER_APPLY() {
        return this.EA_NAV_FILTER_APPLY;
    }

    public final String getEA_NAV_FILTER_DISCARD() {
        return this.EA_NAV_FILTER_DISCARD;
    }

    public final String getEA_RETRUN_ORDER() {
        return this.EA_RETRUN_ORDER;
    }

    public final String getEA_TRACK_ORDER() {
        return this.EA_TRACK_ORDER;
    }

    public final String getEA_VIDEO_PAUSED() {
        return this.EA_VIDEO_PAUSED;
    }

    public final String getEA_VIDEO_PLAY() {
        return this.EA_VIDEO_PLAY;
    }

    public final String getEA_VIDEO_PLAYED() {
        return this.EA_VIDEO_PLAYED;
    }

    public final String getEA_VIDEO_VIEW() {
        return this.EA_VIDEO_VIEW;
    }

    public final String getEA_VIDEO_VIEW_TIME() {
        return this.EA_VIDEO_VIEW_TIME;
    }

    public final String getEA_WAS_THAT_HELPFUL_THUMBS_DOWN() {
        return this.EA_WAS_THAT_HELPFUL_THUMBS_DOWN;
    }

    public final String getEA_WAS_THAT_HELPFUL_THUMBS_UP() {
        return this.EA_WAS_THAT_HELPFUL_THUMBS_UP;
    }

    public final String getEC_ADD_INTERACTION() {
        return this.EC_ADD_INTERACTION;
    }

    public final String getEC_AJIO_REF_INTERACTION() {
        return this.EC_AJIO_REF_INTERACTION;
    }

    public final String getEC_APP_UPDATE_INTERACTION() {
        return this.EC_APP_UPDATE_INTERACTION;
    }

    public final String getEC_BAG_INTERACTIONS() {
        return this.EC_BAG_INTERACTIONS;
    }

    public final String getEC_CC_ORDER_INTERACTION() {
        return this.EC_CC_ORDER_INTERACTION;
    }

    public final String getEC_CHECKOUT_INTERACTIONS() {
        return this.EC_CHECKOUT_INTERACTIONS;
    }

    public final String getEC_CLOSET_INTERACTIONS() {
        return this.EC_CLOSET_INTERACTIONS;
    }

    public final String getEC_COUPON_INTERACTIONS() {
        return this.EC_COUPON_INTERACTIONS;
    }

    public final String getEC_ERRORS() {
        return this.EC_ERRORS;
    }

    public final String getEC_FAQ_INTERACTION() {
        return this.EC_FAQ_INTERACTION;
    }

    public final String getEC_FLEEK_BLP_SEARCH_INTERACTIONS() {
        return this.EC_FLEEK_BLP_SEARCH_INTERACTIONS;
    }

    public final String getEC_FORM() {
        return this.EC_FORM;
    }

    public final String getEC_IMAGE_SEARCH() {
        return this.EC_IMAGE_SEARCH;
    }

    public final String getEC_INVITE_AND_EARN_INTERACTION() {
        return this.EC_INVITE_AND_EARN_INTERACTION;
    }

    public final String getEC_MY_ACC_INTERACTION() {
        return this.EC_MY_ACC_INTERACTION;
    }

    public final String getEC_NOTI_INTERACTION() {
        return this.EC_NOTI_INTERACTION;
    }

    public final String getEC_ORDER_CONFIRMATION() {
        return this.EC_ORDER_CONFIRMATION;
    }

    public final String getEC_ORDER_DETAIL_INTERACTION() {
        return this.EC_ORDER_DETAIL_INTERACTION;
    }

    public final String getEC_ORDER_LIST_INTERACTION() {
        return this.EC_ORDER_LIST_INTERACTION;
    }

    public final String getEC_ORDER_PAYMENT_MODE_SAVED_EVENT_NAME() {
        return this.EC_ORDER_PAYMENT_MODE_SAVED_EVENT_NAME;
    }

    public final String getEC_PAYMENT_INSTRUMENT_SCR_TYPE() {
        return this.EC_PAYMENT_INSTRUMENT_SCR_TYPE;
    }

    public final String getEC_PAYMENT_MODE_SAVED_ACTION() {
        return this.EC_PAYMENT_MODE_SAVED_ACTION;
    }

    public final String getEC_PREFERRED_MODE_ACTION() {
        return this.EC_PREFERRED_MODE_ACTION;
    }

    public final String getEC_PREFERRED_MODE_SELECTED_ACTION() {
        return this.EC_PREFERRED_MODE_SELECTED_ACTION;
    }

    public final String getEC_PRODUCT_DETAILS_INTERACTION() {
        return this.EC_PRODUCT_DETAILS_INTERACTION;
    }

    public final String getEC_PRODUCT_DETAILS_INTERACTIONS() {
        return this.EC_PRODUCT_DETAILS_INTERACTIONS;
    }

    public final String getEC_PRODUCT_LIST_INTERACTIONS() {
        return this.EC_PRODUCT_LIST_INTERACTIONS;
    }

    public final String getEC_SEARCH_BAR_INTERACTIONS() {
        return this.EC_SEARCH_BAR_INTERACTIONS;
    }

    public final String getEC_SEARCH_INTERACTIONS() {
        return this.EC_SEARCH_INTERACTIONS;
    }

    public final String getEC_SELF_CARE_INTERACTION() {
        return this.EC_SELF_CARE_INTERACTION;
    }

    public final String getEC_SELF_CARE_ISSUE_INTERACTION() {
        return this.EC_SELF_CARE_ISSUE_INTERACTION;
    }

    public final String getEC_SHOP_THE_LOOK() {
        return this.EC_SHOP_THE_LOOK;
    }

    public final String getEC_SPC_PAYMENT_MODE_SAVED_EVENT_NAME() {
        return this.EC_SPC_PAYMENT_MODE_SAVED_EVENT_NAME;
    }

    public final String getEC_USER_ACCOUNTS() {
        return this.EC_USER_ACCOUNTS;
    }

    public final String getEC_USER_INTERACTION() {
        return this.EC_USER_INTERACTION;
    }

    public final String getEC_WALLET_CHECK_BALANCE_TYPE() {
        return this.EC_WALLET_CHECK_BALANCE_TYPE;
    }

    public final String getEC_WALLET_INTERACTION() {
        return this.EC_WALLET_INTERACTION;
    }

    public final String getEC_WIDGET_INTERACTION() {
        return this.EC_WIDGET_INTERACTION;
    }

    public final String getEC_WIDGET_INTERACTION_EVENT() {
        return this.EC_WIDGET_INTERACTION_EVENT;
    }

    public final String getEC_WISHLIST_INTERACTIONS() {
        return this.EC_WISHLIST_INTERACTIONS;
    }

    public final String getEN_COUPON_INTERACTIONS() {
        return this.EN_COUPON_INTERACTIONS;
    }

    public final String getEN_MY_ACCOUNT_INTERACTIONS() {
        return this.EN_MY_ACCOUNT_INTERACTIONS;
    }

    public final String getEN_NAV_CLICK() {
        return this.EN_NAV_CLICK;
    }

    public final String getEN_SELF_CARE_INTERACTION() {
        return this.EN_SELF_CARE_INTERACTION;
    }

    public final String getEVENT_ACTION_DELETE_ACCOUNT_CANCEL_CLICK() {
        return this.EVENT_ACTION_DELETE_ACCOUNT_CANCEL_CLICK;
    }

    public final String getEVENT_ACTION_DELETE_ACCOUNT_CLICK() {
        return this.EVENT_ACTION_DELETE_ACCOUNT_CLICK;
    }

    public final String getEVENT_ACTION_DELETE_ACCOUNT_DONE() {
        return this.EVENT_ACTION_DELETE_ACCOUNT_DONE;
    }

    public final String getEVENT_ACTION_DELETE_REASON_SELECT_OPTION() {
        return this.EVENT_ACTION_DELETE_REASON_SELECT_OPTION;
    }

    public final String getEVENT_ACTION_EXPLORE_ALL() {
        return this.EVENT_ACTION_EXPLORE_ALL;
    }

    public final String getEVENT_ACTION_ICON_CLICK() {
        return this.EVENT_ACTION_ICON_CLICK;
    }

    public final String getEVENT_ACTION_RATING_WIDGETS() {
        return this.EVENT_ACTION_RATING_WIDGETS;
    }

    public final String getEVENT_ACTION_STORE_SWITCH() {
        return this.EVENT_ACTION_STORE_SWITCH;
    }

    public final String getEVENT_ACTION_STORE_SWITCH_CLOSED() {
        return this.EVENT_ACTION_STORE_SWITCH_CLOSED;
    }

    public final String getEVENT_ACTION_YOUR_DATA_DELETE_ACCOUNT_CLICK() {
        return this.EVENT_ACTION_YOUR_DATA_DELETE_ACCOUNT_CLICK;
    }

    public final String getEVENT_CATEGORY() {
        return this.EVENT_CATEGORY$1;
    }

    public final String getEVENT_CATEGORY_DELETE_PROFILE() {
        return this.EVENT_CATEGORY_DELETE_PROFILE;
    }

    public final String getEVENT_CATEGORY_DYNAMIC_EXPLORE() {
        return this.EVENT_CATEGORY_DYNAMIC_EXPLORE;
    }

    public final String getEVENT_CATEGORY_FOOTER_NAVIGATION_INTERACTIONS() {
        return this.EVENT_CATEGORY_FOOTER_NAVIGATION_INTERACTIONS;
    }

    public final String getEVENT_CATEGORY_MY_ACCOUNT_INTERACTIONS() {
        return this.EVENT_CATEGORY_MY_ACCOUNT_INTERACTIONS;
    }

    public final String getEVENT_CATEGORY_PRODUCT_EXPLORE() {
        return this.EVENT_CATEGORY_PRODUCT_EXPLORE;
    }

    public final String getEVENT_CATEGORY_QUICK_FILTER_INTERACTIONS() {
        return this.EVENT_CATEGORY_QUICK_FILTER_INTERACTIONS;
    }

    public final String getEVENT_CATEGORY_STORE_SWITCH_INTERACTIONS() {
        return this.EVENT_CATEGORY_STORE_SWITCH_INTERACTIONS;
    }

    public final String getEVENT_CATEGORY_USER_LEVEL_EXPLORE() {
        return this.EVENT_CATEGORY_USER_LEVEL_EXPLORE;
    }

    public final String getEVENT_DELETE_MY_ACCOUNT_INTERACTIONS() {
        return this.EVENT_DELETE_MY_ACCOUNT_INTERACTIONS;
    }

    public final String getEVENT_FOOTER_NAVIGATION_MENU_CLICK() {
        return this.EVENT_FOOTER_NAVIGATION_MENU_CLICK;
    }

    public final String getEVENT_LABEL_RATING_WIDGETS() {
        return this.EVENT_LABEL_RATING_WIDGETS;
    }

    public final String getEVENT_NAME_AKAMAI_LOGGING() {
        return this.EVENT_NAME_AKAMAI_LOGGING;
    }

    public final String getEVENT_NAME_EXPLORE_ALL() {
        return this.EVENT_NAME_EXPLORE_ALL;
    }

    public final String getEVENT_NAME_QUICK_FILTER_INTERACTIONS() {
        return this.EVENT_NAME_QUICK_FILTER_INTERACTIONS;
    }

    public final String getEVENT_NAME_USER_LEVEL_EXPLORE() {
        return this.EVENT_NAME_USER_LEVEL_EXPLORE;
    }

    public final String getEVENT_PLP_FILTER_APPLY() {
        return this.EVENT_PLP_FILTER_APPLY;
    }

    public final String getEVENT_REVIEWS_RATING_INTERACTIONS() {
        return this.EVENT_REVIEWS_RATING_INTERACTIONS;
    }

    public final String getEVENT_STORE_SWITCH_INTERACTIONS() {
        return this.EVENT_STORE_SWITCH_INTERACTIONS;
    }

    public final String getEVENT_TRANSFER_TO_BANK() {
        return this.EVENT_TRANSFER_TO_BANK;
    }

    public final String getEV_NAME_LANDING_SCREEN_INTERACTION() {
        return this.EV_NAME_LANDING_SCREEN_INTERACTION;
    }

    public final String getEV_NAME_VIDEO_SCREEN_INTERACTION() {
        return this.EV_NAME_VIDEO_SCREEN_INTERACTION;
    }

    public final String getEXCHANGE_MODE_SELECTION_INTERACTION() {
        return this.EXCHANGE_MODE_SELECTION_INTERACTION;
    }

    public final String getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY() {
        return this.EXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY;
    }

    public final String getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT() {
        return this.EXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT;
    }

    public final String getFAQ_QUESTION() {
        return this.FAQ_QUESTION;
    }

    public final String getGAME_AVG_RUNTIME() {
        return this.GAME_AVG_RUNTIME;
    }

    public final GAUtils getGaUtils() {
        return this.gaUtils;
    }

    public final String getINSTALL_NOW_CTA_VIEW() {
        return this.INSTALL_NOW_CTA_VIEW;
    }

    public final String getIS_AUTO_PLAY_ENABLED() {
        return this.IS_AUTO_PLAY_ENABLED;
    }

    public final String getLOGIN_SIGNUP_SRC() {
        return this.LOGIN_SIGNUP_SRC;
    }

    public final String getLOGIN_TYPE() {
        return this.LOGIN_TYPE$1;
    }

    public final String getNEW_NOTIFICATION() {
        return this.NEW_NOTIFICATION;
    }

    public final String getNO_OF_ADDRESS() {
        return this.NO_OF_ADDRESS;
    }

    public final String getNUMBER_OF_CARDS() {
        return this.NUMBER_OF_CARDS;
    }

    public final String getNUMBER_OF_GAMES() {
        return this.NUMBER_OF_GAMES;
    }

    public final String getNUMBER_OF_ITEMS() {
        return this.NUMBER_OF_ITEMS;
    }

    public final String getNUMBER_OF_ORDER() {
        return this.NUMBER_OF_ORDER;
    }

    public final String getNUMBER_OF_PRODUCTS() {
        return this.NUMBER_OF_PRODUCTS;
    }

    public final String getNUMBER_OF_RESULT() {
        return this.NUMBER_OF_RESULT;
    }

    public final String getNUMBER_OF_SIZE_OOS() {
        return this.NUMBER_OF_SIZE_OOS;
    }

    public final String getNUMBER_OF_TRANSACTION() {
        return this.NUMBER_OF_TRANSACTION;
    }

    public final String getORDER_ID() {
        return this.ORDER_ID;
    }

    public final String getORDER_ITEM_DETAILS_INTERACTION_CATEGORY() {
        return this.ORDER_ITEM_DETAILS_INTERACTION_CATEGORY;
    }

    public final String getORDER_ITEM_DETAILS_INTERACTION_EVENT() {
        return this.ORDER_ITEM_DETAILS_INTERACTION_EVENT;
    }

    public final String getPAGELOAD() {
        return this.PAGELOAD;
    }

    public final String getPAGE_LOAD() {
        return this.PAGE_LOAD;
    }

    public final String getPAYMENT_AMOUNT() {
        return this.PAYMENT_AMOUNT;
    }

    public final String getPAYMENT_MODE() {
        return this.PAYMENT_MODE;
    }

    public final String getPAYMENT_TYPE() {
        return this.PAYMENT_TYPE;
    }

    public final String getPLAY_DURATION() {
        return this.PLAY_DURATION;
    }

    public final String getPOSTAL_CODE() {
        return this.POSTAL_CODE;
    }

    public final String getPRODUCT_BRAND() {
        return this.PRODUCT_BRAND;
    }

    public final String getPRODUCT_BRICK() {
        return this.PRODUCT_BRICK;
    }

    public final String getPRODUCT_CATEGORY() {
        return this.PRODUCT_CATEGORY;
    }

    public final String getPRODUCT_COLOR() {
        return this.PRODUCT_COLOR;
    }

    public final String getPRODUCT_DISCOUNT() {
        return this.PRODUCT_DISCOUNT;
    }

    public final String getPRODUCT_GENDER() {
        return this.PRODUCT_GENDER;
    }

    public final String getPRODUCT_ID() {
        return this.PRODUCT_ID;
    }

    public final String getPRODUCT_MRP() {
        return this.PRODUCT_MRP;
    }

    public final String getPRODUCT_NAME() {
        return this.PRODUCT_NAME;
    }

    public final String getPRODUCT_PRICE() {
        return this.PRODUCT_PRICE;
    }

    public final String getPRODUCT_SIZE() {
        return this.PRODUCT_SIZE;
    }

    public final String getPRODUCT_TAG() {
        return this.PRODUCT_TAG;
    }

    public final String getPRODUCT_VERTICAL() {
        return this.PRODUCT_VERTICAL;
    }

    public final String getPURCHASE_RECOMMENDATIONS() {
        return this.PURCHASE_RECOMMENDATIONS;
    }

    public final String getRATING() {
        return this.RATING;
    }

    public final String getREASON() {
        return this.REASON;
    }

    public final String getREFUND_BREAKUP() {
        return this.REFUND_BREAKUP;
    }

    public final String getRETURN_CANCELLATION_HALFCARD_CATEGORY() {
        return this.RETURN_CANCELLATION_HALFCARD_CATEGORY;
    }

    public final String getRETURN_CANCELLATION_HALFCARD_EVENT() {
        return this.RETURN_CANCELLATION_HALFCARD_EVENT;
    }

    public final String getRETURN_FEE_HALF_CARD_INTERACTION() {
        return this.RETURN_FEE_HALF_CARD_INTERACTION;
    }

    public final String getRETURN_MODE_SELECTION_INTERACTION() {
        return this.RETURN_MODE_SELECTION_INTERACTION;
    }

    public final String getRETURN_ORDER_DETAIL_INTERACTION() {
        return this.RETURN_ORDER_DETAIL_INTERACTION;
    }

    public final String getREWARD_TYPE() {
        return this.REWARD_TYPE;
    }

    public final String getSHIPPING_CHARGES() {
        return this.SHIPPING_CHARGES;
    }

    public final String getSIZE_CHART() {
        return this.SIZE_CHART;
    }

    public final String getSIZE_CHART_INTERACTION() {
        return this.SIZE_CHART_INTERACTION;
    }

    public final String getSIZE_CHART_INTERACTIONS() {
        return this.SIZE_CHART_INTERACTIONS;
    }

    public final String getSTEP() {
        return this.STEP;
    }

    public final String getSV_EP_AGE() {
        return this.SV_EP_AGE;
    }

    public final String getSV_EP_AJIO_WALLET() {
        return this.SV_EP_AJIO_WALLET;
    }

    public final String getSV_EP_CART_TYPE() {
        return this.SV_EP_CART_TYPE;
    }

    public final String getSV_EP_COD_FEE_ACTUAL() {
        return this.SV_EP_COD_FEE_ACTUAL;
    }

    public final String getSV_EP_COD_FEE_SLASHED() {
        return this.SV_EP_COD_FEE_SLASHED;
    }

    public final String getSV_EP_CTA_DISABLE() {
        return this.SV_EP_CTA_DISABLE;
    }

    public final String getSV_EP_DEF_ADD() {
        return this.SV_EP_DEF_ADD;
    }

    public final String getSV_EP_DEF_ADD_PIN() {
        return this.SV_EP_DEF_ADD_PIN;
    }

    public final String getSV_EP_DELIVERY_FEE() {
        return this.SV_EP_DELIVERY_FEE;
    }

    public final String getSV_EP_DELIVERY_SLASHED_FEE() {
        return this.SV_EP_DELIVERY_SLASHED_FEE;
    }

    public final String getSV_EP_DISCOVER_BRAND_CLICKED() {
        return this.SV_EP_DISCOVER_BRAND_CLICKED;
    }

    public final String getSV_EP_EDD_DELIVERY_DATE_DIFF() {
        return this.SV_EP_EDD_DELIVERY_DATE_DIFF;
    }

    public final String getSV_EP_EDD_MAX() {
        return this.SV_EP_EDD_MAX;
    }

    public final String getSV_EP_EDD_MODE() {
        return this.SV_EP_EDD_MODE;
    }

    public final String getSV_EP_EDD_TYPE() {
        return this.SV_EP_EDD_TYPE;
    }

    public final String getSV_EP_FIND_RECOMMENDED_SIZE_CLICK() {
        return this.SV_EP_FIND_RECOMMENDED_SIZE_CLICK;
    }

    public final String getSV_EP_FIND_RECOMMENDED_SIZE_DISPLAY() {
        return this.SV_EP_FIND_RECOMMENDED_SIZE_DISPLAY;
    }

    public final String getSV_EP_FLICK_BPL_SEARCH() {
        return this.SV_EP_FLICK_BPL_SEARCH;
    }

    public final String getSV_EP_NON_DELIVERABLE_COUNT() {
        return this.SV_EP_NON_DELIVERABLE_COUNT;
    }

    public final String getSV_EP_OFFERS() {
        return this.SV_EP_OFFERS;
    }

    public final String getSV_EP_OOS_SKU() {
        return this.SV_EP_OOS_SKU;
    }

    public final String getSV_EP_OUTTAGE_MESG() {
        return this.SV_EP_OUTTAGE_MESG;
    }

    public final String getSV_EP_PDP_STYLES_CLICKED() {
        return this.SV_EP_PDP_STYLES_CLICKED;
    }

    public final String getSV_EP_PRDT_AVL() {
        return this.SV_EP_PRDT_AVL;
    }

    public final String getSV_EP_PROMO_MSG() {
        return this.SV_EP_PROMO_MSG;
    }

    public final String getSV_EP_PROMO_PRE_APLD() {
        return this.SV_EP_PROMO_PRE_APLD;
    }

    public final String getSV_EP_RECOMMENDED_SIZE_CLICK() {
        return this.SV_EP_RECOMMENDED_SIZE_CLICK;
    }

    public final String getSV_EP_RONE() {
        return this.SV_EP_RONE;
    }

    public final String getSV_EP_RVP_FEE() {
        return this.SV_EP_RVP_FEE;
    }

    public final String getSV_EP_STATUS() {
        return this.SV_EP_STATUS;
    }

    public final String getSV_EP_TOTAL_CONV_FEE() {
        return this.SV_EP_TOTAL_CONV_FEE;
    }

    public final String getSV_EP_VIEW_ALL_PRODUCTS_CLICK() {
        return this.SV_EP_VIEW_ALL_PRODUCTS_CLICK;
    }

    public final String getSV_EP_VIEW_STORE_CLICK() {
        return this.SV_EP_VIEW_STORE_CLICK;
    }

    public final String getSV_ESTIMATE_DELIVERY_DATE() {
        return this.SV_ESTIMATE_DELIVERY_DATE;
    }

    public final String getSV_SOURCE_SCREEN() {
        return this.SV_SOURCE_SCREEN;
    }

    public final String getSV_ZERO_SEARCH_TERM() {
        return this.SV_ZERO_SEARCH_TERM;
    }

    public final String getTOTAL_DISCOUNT() {
        return this.TOTAL_DISCOUNT;
    }

    public final String getTOTAL_NOTIFICATION() {
        return this.TOTAL_NOTIFICATION;
    }

    public final String getTOTAL_SCORE() {
        return this.TOTAL_SCORE;
    }

    public final String getTYPE() {
        return this.TYPE;
    }

    public final String getUPDATE_POP_UP_VIEW() {
        return this.UPDATE_POP_UP_VIEW;
    }

    public final String getUSER_FRAUD_STATUS() {
        return this.USER_FRAUD_STATUS;
    }

    public final String getUSER_STATUS() {
        return this.USER_STATUS;
    }

    public final String getVIDEO_LOAD_TIME() {
        return this.VIDEO_LOAD_TIME;
    }

    public final String getVIDEO_LOOPS() {
        return this.VIDEO_LOOPS;
    }

    public final String getVIDEO_NAME() {
        return this.VIDEO_NAME;
    }

    public final String getVIDEO_TOTAL_VIEW_TIME() {
        return this.VIDEO_TOTAL_VIEW_TIME;
    }

    public final String getVIDEO_VIEWS() {
        return this.VIDEO_VIEWS;
    }

    public final String getWALLET_WIDGET_VIEW() {
        return this.WALLET_WIDGET_VIEW;
    }

    public final boolean isUserLanding() {
        return this.isUserLanding;
    }

    public final Bundle makeBagBundle(Bundle bundle, String object, String string2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(object, "category");
        Intrinsics.checkNotNullParameter(string2, "action");
        String string8 = "label";
        Intrinsics.checkNotNullParameter(string3, string8);
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        Intrinsics.checkNotNullParameter(string7, "previousScreenType");
        string3 = "index";
        bundle.putInt(string3, 0);
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        string5 = "";
        if (n3 != 0) {
            string2 = string5;
        }
        bundle.putString(EVENT_ACTION, string2);
        string2 = this.userInformation.getEncryptedId();
        bundle.putString(HYBRIS_ID, string2);
        string3 = this.getLoggedINStatus();
        bundle.putString(LOGGED_IN_STATUS, string3);
        AJIOApplication.Companion.getClass();
        string2 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        bundle.putString(NETWORK_TYPE, string2);
        string2 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
        bundle.putString(PREVIOUS_SCREEN, string2);
        bundle.putString(SCREENNAME, string4);
        bundle.putString(SCREEN_NAME, string4);
        string3 = this.getStoreType();
        bundle.putString("store_type", string3);
        string2 = "contains_store";
        n3 = bundle.containsKey(string2);
        if (n3 == 0) {
            string3 = this.getStoreType();
            bundle.putString(string2, string3);
        }
        if ((string2 = this.appPreferences.f()) != null) {
            string3 = ((Object)StringsKt.m0(string2)).toString();
        } else {
            n3 = 0;
            string3 = null;
        }
        if (string3 != null && (n3 = string3.length()) != 0) {
            string3 = "user_type";
            bundle.putString(string3, string2);
        }
        string2 = this.EVENT_CATEGORY$1;
        n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n3 != 0) {
            object = string5;
        }
        bundle.putString(string2, (String)object);
        object = h40_0.a;
        bundle.putString("isGA4", "true");
        return bundle;
    }

    public final Bundle makeBundle(Bundle bundle, String object, String string2, String string3, String string4, String string5, String string6, String string7, boolean bl2) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(object, "category");
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "label");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        Intrinsics.checkNotNullParameter(string7, "previousScreenType");
        string7 = null;
        bundle.putInt("index", 0);
        string6 = this.EVENT_CATEGORY$1;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        String string8 = "";
        if (bl3) {
            object = string8;
        }
        bundle.putString(string6, (String)object);
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        if (bl4) {
            string2 = string8;
        }
        object = EVENT_ACTION;
        bundle.putString((String)object, string2);
        bl4 = TextUtils.isEmpty((CharSequence)string3);
        if (bl4) {
            string3 = string8;
        }
        bundle.putString(EVENT_LABEL, string3);
        bundle.putString(SCREEN_TYPE, string5);
        bundle.putString(SCREEN_NAME, string4);
        bundle.putString(SCREENNAME, string4);
        object = AnalyticsManager.Companion;
        string2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
        string3 = PREVIOUS_SCREEN;
        bundle.putString(string3, string2);
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getPrevScreenType();
        bundle.putString(PREVIOUS_SCREEN_TYPE, (String)object);
        string2 = this.getStoreType();
        bundle.putString("store_type", string2);
        object = "contains_store";
        boolean bl5 = bundle.containsKey((String)object);
        if (!bl5) {
            string2 = this.getStoreType();
            bundle.putString((String)object, string2);
        }
        object = this.userInformation.getNewClientId();
        string2 = CLIENT_ID;
        bundle.putString(string2, (String)object);
        if (!bl2) {
            object = this.userInformation.getEncryptedId();
            string2 = HYBRIS_ID;
            bundle.putString(string2, (String)object);
        }
        object = this.USER_STATUS;
        string2 = this.userInformation.getUserStatus();
        bundle.putString((String)object, string2);
        object = rj_0.b();
        bundle.putString(Time_O_Day, (String)object);
        object = this.LOGIN_TYPE$1;
        string2 = this.getLoggedINStatus();
        bundle.putString((String)object, string2);
        object = h40_0.a;
        bundle.putString("isGA4", "true");
        return bundle;
    }

    public final void newBagPushCustomEvent(String string2, String string3, String string4, String string5, String string6, String string7, String string8, Bundle bundle, String string9) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreen");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string9, "previousScreenType");
        Object object = this.gaUtils;
        boolean bl2 = ((GAUtils)object).isGaRevampCustomEventsEnabled();
        if (!bl2) {
            return;
        }
        object = this;
        object = this.makeBagBundle(bundle, string2, string3, string4, string6, string7, string8, string9);
        this.analytics.logEvent(string5, (Bundle)object);
    }

    public final void newDressToolInteractionsCustomEvent(String string2, String string3, String string4, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "eventAction");
        Intrinsics.checkNotNullParameter(string3, "label");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Object object = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "dress size tool interaction", string2, string3, "dress_size_tool_interaction", string4, null, string5, bundle, string6, false, null, 1568, null);
    }

    public final void newPDPInteractionsCustomEvent(String string2, String string3, String string4, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "eventAction");
        Intrinsics.checkNotNullParameter(string3, "label");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Object object = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string5 = newCustomEventsRevamp.EC_PRODUCT_DETAILS_INTERACTIONS;
        String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string7 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string2, string3, "product_details_interactions", string4, null, string6, bundle, string7, false, null, 1568, null);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, null, null, null, null, null, null, string4, false, null, 1788, null);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, string4, null, null, null, null, null, string5, false, null, 1784, null);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, string4, string5, null, null, null, null, string6, false, null, 1776, null);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(string7, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, string4, string5, string6, null, null, null, string7, false, null, 1760, null);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, string4, string5, string6, string7, null, null, string8, false, null, 1728, null);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4, String string5, String string6, String string7, String string8, Bundle bundle, String string9) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreen");
        Intrinsics.checkNotNullParameter(string9, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, string4, string5, string6, string7, string8, bundle, string9, false, null, 1536, null);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4, String string5, String string6, String string7, String string8, Bundle bundle, String string9, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreen");
        Intrinsics.checkNotNullParameter(string9, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, string4, string5, string6, string7, string8, bundle, string9, bl2, null, 1024, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void newPushCustomEvent(String var1_1, String var2_2, String var3_3, String var4_4, String var5_5, String var6_6, String var7_7, Bundle var8_8, String var9_9, boolean var10_10, String var11_11) {
        var12_12 = this;
        var13_13 = var4_4;
        var14_14 = var11_11;
        var15_15 = var1_1;
        Intrinsics.checkNotNullParameter(var1_1, "category");
        var16_16 = var2_2;
        Intrinsics.checkNotNullParameter(var2_2, "action");
        Intrinsics.checkNotNullParameter(var3_3, "label");
        Intrinsics.checkNotNullParameter(var4_4, "eventName");
        Intrinsics.checkNotNullParameter(var5_5, "screenName");
        Intrinsics.checkNotNullParameter(var6_6, "screenType");
        Intrinsics.checkNotNullParameter(var7_7, "previousScreen");
        Intrinsics.checkNotNullParameter(var9_9, "previousScreenType");
        Intrinsics.checkNotNullParameter(var11_11, "ucpUserType");
        var17_17 = this.gaUtils;
        var18_18 = var17_17.isGaRevampCustomEventsEnabled();
        if (!var18_18) {
            return;
        }
        if (var8_8 != null) {
            var17_17 = this;
            var19_19 /* !! */  = var8_8;
            var17_17 = this.makeBundle(var8_8, var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var9_9, var10_10);
        } else {
            var19_19 /* !! */  = new Bundle();
            var17_17 = this;
            var17_17 = this.makeBundle(var19_19 /* !! */ , var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var9_9, var10_10);
        }
        var19_19 /* !! */  = var12_12.appPreferences.f();
        if (var19_19 /* !! */  != null) {
            var15_15 = StringsKt.m0((CharSequence)var19_19 /* !! */ ).toString();
        } else {
            var20_20 = 0;
            var15_15 = null;
        }
        var16_16 = "user_type";
        if (var15_15 == null || (var20_20 = var15_15.length()) == 0) ** GOTO lbl-1000
        var15_15 = h40_0.a;
        var20_20 = (int)h40_0.u2();
        if (var20_20 == 0) {
            var17_17.putString(var16_16, (String)var19_19 /* !! */ );
        } else lbl-1000:
        // 2 sources

        {
            var17_17.putString(var16_16, var14_14);
        }
        var12_12.analytics.logEvent(var13_13, (Bundle)var17_17);
    }

    public final void newPushCustomEvent(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreen");
        Intrinsics.checkNotNullParameter(string9, "previousScreenType");
        NewCustomEventsRevamp.newPushCustomEvent$default(this, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, 1664, null);
    }

    public final void newPushCustomScreenView(String object, String string2, String string3, Bundle bundle, String string4) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Intrinsics.checkNotNullParameter(string2, "screenType");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "previousScreenType");
        object = h40_0.a;
    }

    public final void pushTopPLPFilterRemoveEvents(String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.analytics.logEvent(string2, bundle);
    }

    public final void sendLoginRegisterEvent(boolean bl2, String string2, String string3, String string4, String string5, boolean bl3, String string6) {
        Object object = string5;
        String string7 = string6;
        Intrinsics.checkNotNullParameter(string2, "userType");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "source");
        Intrinsics.checkNotNullParameter(string6, "failReason");
        Object object2 = AnalyticsManager.Companion;
        Object object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        Object object4 = "new";
        boolean bl4 = Intrinsics.areEqual(string2, object4);
        if (bl4) {
            bl4 = bl2;
            object4 = this.handleNewUser(bl2, bl3);
        } else {
            bl4 = bl2;
            object4 = this.handleExistingUser(bl2);
        }
        String string8 = (String)((Pair)object4).a;
        object4 = (String)((Pair)object4).b;
        Bundle bundle = px1_2.b("login_source", (String)object, "fail_reason", string7);
        String string9 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string10 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        object = object3;
        object2 = string8;
        object3 = object4;
        object4 = "user_signup_login_interactions";
        string8 = string9;
        string9 = string10;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "user signup login interactions", (String)object2, (String)object3, (String)object4, string3, string4, string8, bundle, string10, false, string2, 512, null);
    }

    public final void setUserLanding(boolean bl2) {
        this.isUserLanding = bl2;
    }

    public final String[] trimProductId(String object) {
        int n3;
        String string2;
        int n4 = 2;
        Object object2 = new String[n4];
        object2[0] = string2 = "";
        int n7 = 1;
        object2[n7] = string2;
        int n8 = TextUtils.isEmpty((CharSequence)object);
        if (n8 != 0) {
            return object2;
        }
        Intrinsics.checkNotNull(object);
        n8 = ((String)object).length();
        int n10 = 10;
        if (n8 == n10) {
            object2[0] = object;
            object2[n7] = string2;
        } else {
            n8 = ((String)object).length();
            if (n8 > (n10 = 9)) {
                String string3 = "_";
                boolean bl2 = StringsKt.F((CharSequence)object, string3, false);
                if (bl2) {
                    object2 = new String[]{string3};
                    n10 = 6;
                    object = StringsKt.a0((CharSequence)object, object2, false, 0, n10);
                    object2 = new String[]{};
                    object = object.toArray((T[])object2);
                    object2 = object;
                    object2 = (String[])object;
                } else {
                    String string4 = ((String)object).substring(0, n10);
                    String string5 = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(string4, string5);
                    object2[0] = string4;
                    object = ((String)object).substring(n10);
                    Intrinsics.checkNotNullExpressionValue(object, string5);
                    object2[n7] = object;
                }
                object = object2[n7];
                n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n3 == 0) {
                    object = object2[n7];
                    Intrinsics.checkNotNull(object);
                    n3 = (int)(b.s((String)object, string3, false) ? 1 : 0);
                    if (n3 != 0) {
                        object = object2[n7];
                        Intrinsics.checkNotNull(object);
                        Regex regex = new Regex(string3);
                        object2[n7] = object = regex.d((String)object);
                    }
                }
            } else {
                object2[0] = object;
            }
        }
        n3 = ((String[])object2).length;
        if (n3 > n7 && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = object2[n7])) ? 1 : 0)) != 0) {
            object2[n7] = string2;
        } else {
            n3 = ((String[])object2).length;
            if (n3 < n4) {
                String string6;
                object = new String[n4];
                object[0] = string6 = object2[0];
                object[n7] = string2;
                object2 = object;
            }
        }
        return object2;
    }
}

