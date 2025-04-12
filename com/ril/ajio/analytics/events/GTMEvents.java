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
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsUtil;
import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.FirebaseExperimentsItem;
import com.ril.ajio.analytics.constants.AnalyticsValues;
import com.ril.ajio.analytics.events.GTMEvents$Companion;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class GTMEvents {
    public static final int $stable = 0;
    public static final String CURRENT_EXPERIENCE = "current_experience";
    public static final GTMEvents$Companion Companion;
    public static final String GA_AMOUNT_PAYABLE = "amount_payable";
    public static final String GA_BAG_TOTAL = "bag_total";
    public static final String GA_CART_VALUE = "cart_value";
    public static final String GA_COUPON_SAVINGS = "coupon_savings";
    public static final String GA_ITEM_COUNT = "item_count";
    public static final String GA_NUMBER_OF_ITEMS_ON_CART = "number_of_items_on_cart";
    public static final String GA_OOS_COUNT = "oos_count";
    public static final String GA_TOTAL_SAVINGS = "total_savings";
    private static final String GTM_CATEGORY = "event_category";
    public static final String GTM_EVENT_ADD_CLOSET_SOURCE_SIMILAR = "similar products widget";
    private static final String GTM_EVENT_ADD_TO_CART = "Added_to_Cart";
    private static final String GTM_EVENT_ADD_TO_CLOSET = "add_to_closet";
    private static final String GTM_EVENT_APP_LAUNCH = "App_Launch";
    private static final String GTM_EVENT_BUTTON_TAP = "buttonTap";
    private static final String GTM_EVENT_DISCOVERY = "discovery";
    private static final String GTM_EVENT_ITEM_COUNT = "Item_count";
    private static final String GTM_EVENT_NAVIGATION_TAP = "navigationTap";
    private static final String GTM_EVENT_ORDER_DETAILS_INTERACTION = "orderDetailsInteraction";
    private static final String GTM_EVENT_PAGE_INTERACTION = "pageInteraction";
    private static final String GTM_EVENT_PRODUCT_PURCHASE = "Product_Purchase";
    private static final String GTM_EVENT_PRODUCT_SEARCH = "Product_Search";
    private static final String GTM_EVENT_REMOVE_FROM_WISHLIST = "remove_from_wishlist";
    private static final String GTM_EVENT_SUGGESTION_WIDGET = "suggestion_widget_view";
    private static final String GTM_EVENT_UPDATE_WIDGET = "update_widget";
    private static final String GTM_EVENT_WEB_VIEW_LOAD = "WEB_VIEW_LOAD";
    private static final String GTM_EVENT_WIDGET_INTERACTION = "widget_interaction";
    private static final String GTM_NETWORK_TYPE = "network_type";
    public static final String GTM_PAYMENT_SDK = "payment_sdk";
    public static final String GTM_PROCEED_TO_RETURN_EXCHANGE = "proceed to return|exchange";
    private static final String GTM_SIZE_CHART_INTERACTION = "size chart interactions";
    public static final String GTM_TAG_GLOBAL_NAV = "Global Nav";
    public static final String GTM_TAG_OPEN_SCREEN = "openScreen";
    public static final String GTM_TAG_SCREEN_VIEW = "screen_view";
    public static final String GTM_V5_ACTION = "event_action";
    public static final String GTM_V5_CLIENT_ID = "Client_ID";
    public static final String GTM_V5_HYBRIS_ID = "hybris_id";
    public static final String GTM_V5_LABEL = "event_label";
    public static final String GTM_V5_SCREEN_NAME = "screenname";
    public static final String GTM_V5_TIME_OF_DAY = "Time_of_the_day";
    private static final String GTM_V5_UD = "UID";
    public static final String GTM_V5_USER_ID = "userId";
    public static final String GTM_V5_USER_STATUS = "user_status";
    public static final String GTM_VIEW_MORE_CLICK = "view more address click";
    public static final String LINK_PARAM = "link_param";
    public static final String SERVICE_ERROR_EVENT = "serviceErrorEvent";
    public static final String USER_STATUS_GUEST = "guest";
    public static final String USER_STATUS_LOGGED_IN = "logged in";
    private static String mScreenName;
    private final jo_2 appPreferences;
    private final String segmentIds;
    private final rq1_2 userInformation$delegate;

    static {
        GTMEvents$Companion gTMEvents$Companion;
        Companion = gTMEvents$Companion = new GTMEvents$Companion(null);
        $stable = 8;
        mScreenName = "UnKnown";
    }

    public GTMEvents() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new jo_2((Context)aJIOApplication);
        this.appPreferences = object;
        this.segmentIds = object = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserSegementIds();
        object = new Object();
        this.userInformation$delegate = object = yr1_2.b((Function0)object);
    }

    public static /* synthetic */ UserInformation a() {
        return GTMEvents.userInformation_delegate$lambda$0();
    }

    private final String eaCohort(String object) {
        boolean bl2;
        String string2 = "landing screen";
        boolean bl3 = StringsKt.F(object, string2, false);
        object = !bl3 && !(bl3 = StringsKt.F(object, string2 = "feed screen", false)) ? ((bl3 = StringsKt.F(object, string2 = "plp screen", false)) ? ScreenType.SCREEN_PLP : ((bl3 = StringsKt.F(object, string2 = "pdp screen", false)) ? ScreenType.SCREEN_PDP : ((bl2 = StringsKt.F(object, string2 = "closet screen", false)) ? ScreenType.SCREEN_WISHLIST : ScreenType.SCREEN_UNKNOWN))) : ScreenType.SCREEN_HOME;
        return ww0_2.a((ScreenType)((Object)object));
    }

    private final String getDiscount(Product object) {
        String string2 = "";
        if (object != null) {
            String string3;
            Price price = ((Product)object).getWasPriceData();
            object = ((Product)object).getPrice();
            if (price != null && object != null && (string3 = price.getValue()) != null && (string3 = ((Price)object).getValue()) != null) {
                float f5;
                int n3;
                float f6;
                string3 = price.getValue();
                float f7 = 0.0f;
                if (string3 != null) {
                    f6 = Float.parseFloat(string3);
                } else {
                    n3 = 0;
                    f6 = 0.0f;
                    string3 = null;
                }
                String string4 = ((Price)object).getValue();
                if (string4 != null) {
                    f5 = Float.parseFloat(string4);
                } else {
                    f5 = 0.0f;
                    string4 = null;
                }
                n3 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
                if (n3 > 0) {
                    int n4;
                    float f8;
                    if ((object = ((Price)object).getValue()) != null) {
                        f8 = Float.parseFloat((String)object);
                    } else {
                        n4 = 0;
                        f8 = 0.0f;
                        object = null;
                    }
                    string2 = price.getValue();
                    if (string2 != null) {
                        f7 = Float.parseFloat(string2);
                    }
                    f8 = (f7 - f8) / f7;
                    int n7 = 100;
                    float f11 = n7;
                    n4 = ok1_1.b(f8 *= f11);
                    string2 = String.valueOf(n4);
                }
            }
        }
        return string2;
    }

    public static /* synthetic */ void gtmEventsCategoryToGa$default(GTMEvents gTMEvents, String string2, String string3, String string4, String string5, AnalyticsData analyticsData, String string6, Bundle bundle, int n3, Object object) {
        int n4 = n3 & 0x10;
        AnalyticsData analyticsData2 = n4 != 0 ? null : analyticsData;
        n4 = n3 & 0x20;
        String string7 = n4 != 0 ? null : string6;
        n4 = n3 & 0x40;
        Bundle bundle2 = n4 != 0 ? null : bundle;
        gTMEvents.gtmEventsCategoryToGa(string2, string3, string4, string5, analyticsData2, string7, bundle2);
    }

    public static /* synthetic */ void gtmEventsToGa$default(GTMEvents gTMEvents, String string2, String string3, String string4, String string5, AnalyticsData analyticsData, Bundle bundle, String string6, int n3, Object object) {
        String string7;
        int n4 = n3 & 0x10;
        AnalyticsData analyticsData2 = n4 != 0 ? null : analyticsData;
        n4 = n3 & 0x20;
        Bundle bundle2 = n4 != 0 ? null : bundle;
        n4 = n3 & 0x40;
        String string8 = n4 != 0 ? (string7 = "") : string6;
        gTMEvents.gtmEventsToGa(string2, string3, string4, string5, analyticsData2, bundle2, string8);
    }

    public static /* synthetic */ void gtmEventsToGaWithCategory$default(GTMEvents gTMEvents, String string2, String string3, String string4, String string5, String string6, AnalyticsData analyticsData, int n3, Object object) {
        int n4 = n3 & 8;
        String string7 = n4 != 0 ? null : string5;
        n4 = n3 & 0x20;
        AnalyticsData analyticsData2 = n4 != 0 ? null : analyticsData;
        gTMEvents.gtmEventsToGaWithCategory(string2, string3, string4, string7, string6, analyticsData2);
    }

    private final boolean isUserOnline() {
        return this.getUserInformation().isUserOnline();
    }

    public static /* synthetic */ void pushAppLaunched$default(GTMEvents gTMEvents, String string2, String string3, String string4, AnalyticsData analyticsData, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            analyticsData = null;
        }
        gTMEvents.pushAppLaunched(string2, string3, string4, analyticsData);
    }

    public static /* synthetic */ void pushBagInteractionsEvent$default(GTMEvents gTMEvents, String string2, String string3, String string4, String string5, String string6, Bundle bundle, int n3, Object object) {
        if ((n3 &= 0x20) != 0) {
            bundle = null;
        }
        gTMEvents.pushBagInteractionsEvent(string2, string3, string4, string5, string6, bundle);
    }

    public static /* synthetic */ void pushButtonTapEvent$default(GTMEvents gTMEvents, String string2, Object object, String string3, AnalyticsData analyticsData, Bundle bundle, int n3, Object object2) {
        int n4 = n3 & 8;
        AnalyticsData analyticsData2 = n4 != 0 ? null : analyticsData;
        int n7 = n3 & 0x10;
        Bundle bundle2 = n7 != 0 ? null : bundle;
        gTMEvents.pushButtonTapEvent(string2, object, string3, analyticsData2, bundle2);
    }

    public static /* synthetic */ void pushCartInteractionsEvent$default(GTMEvents gTMEvents, String string2, String string3, String string4, String string5, String string6, Bundle bundle, int n3, Object object) {
        if ((n3 &= 0x20) != 0) {
            bundle = null;
        }
        gTMEvents.pushCartInteractionsEvent(string2, string3, string4, string5, string6, bundle);
    }

    public static /* synthetic */ void pushCheckoutInteractionsEvent$default(GTMEvents gTMEvents, String string2, String string3, String string4, String string5, Bundle bundle, int n3, Object object) {
        if ((n3 &= 0x10) != 0) {
            bundle = null;
        }
        gTMEvents.pushCheckoutInteractionsEvent(string2, string3, string4, string5, bundle);
    }

    public static /* synthetic */ void pushEvent$default(GTMEvents gTMEvents, String string2, String string3, Object object, String string4, AnalyticsData analyticsData, int n3, Object object2) {
        if ((n3 &= 0x10) != 0) {
            analyticsData = null;
        }
        gTMEvents.pushEvent(string2, string3, object, string4, analyticsData);
    }

    public static /* synthetic */ void pushItemCount$default(GTMEvents gTMEvents, String string2, Object object, String string3, AnalyticsData analyticsData, int n3, Object object2) {
        if ((n3 &= 8) != 0) {
            analyticsData = null;
        }
        gTMEvents.pushItemCount(string2, object, string3, analyticsData);
    }

    public static /* synthetic */ void pushPageInteractionEvent$default(GTMEvents gTMEvents, String string2, String string3, String string4, AnalyticsData analyticsData, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            analyticsData = null;
        }
        gTMEvents.pushPageInteractionEvent(string2, string3, string4, analyticsData);
    }

    public static /* synthetic */ void pushPageOrderDetailsInteractionEvent$default(GTMEvents gTMEvents, String string2, String string3, String string4, AnalyticsData analyticsData, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            analyticsData = null;
        }
        gTMEvents.pushPageOrderDetailsInteractionEvent(string2, string3, string4, analyticsData);
    }

    public static /* synthetic */ void pushServiceErrorEvent$default(GTMEvents gTMEvents, String string2, Object object, Object object2, AnalyticsData analyticsData, int n3, Object object3) {
        int n4 = n3 & 4;
        if (n4 != 0) {
            object2 = "";
        }
        if ((n3 &= 8) != 0) {
            analyticsData = null;
        }
        gTMEvents.pushServiceErrorEvent(string2, object, object2, analyticsData);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void pushSuggestionWidgetEvent$default(GTMEvents gTMEvents, String string2, String string3, boolean bl2, List list, Product product, int n3, Object object) {
        void var5_8;
        void var4_7;
        boolean bl3;
        void var6_9;
        int n4 = var6_9 & 4;
        if (n4 != 0) {
            boolean bl4 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        int n7 = var6_9 & 8;
        n4 = 0;
        Object object2 = n7 != 0 ? null : var4_7;
        int n8 = var6_9 & 0x10;
        Object object3 = n8 != 0 ? null : var5_8;
        gTMEvents.pushSuggestionWidgetEvent(string2, string3, bl3, (List)object2, (Product)object3);
    }

    public static /* synthetic */ void pushWidgetInteractionEvent$default(GTMEvents gTMEvents, String string2, String string3, String string4, Bundle bundle, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            bundle = null;
        }
        gTMEvents.pushWidgetInteractionEvent(string2, string3, string4, bundle);
    }

    private final void sendGTMtoFirebase(String string2, String string3, String object, String string4, AnalyticsData object2, String string5, Bundle bundle) {
        int n3;
        int n4;
        Object object3;
        Bundle bundle2 = new Bundle();
        Object object4 = GTM_TAG_OPEN_SCREEN;
        boolean bl2 = Intrinsics.areEqual(string2, object4);
        String string6 = GTM_V5_ACTION;
        String string7 = GTM_TAG_SCREEN_VIEW;
        String string8 = "";
        if (!bl2 && !(bl2 = Intrinsics.areEqual(string2, string7))) {
            bl2 = TextUtils.isEmpty((CharSequence)string3);
            object3 = bl2 ? string8 : string3;
            bundle2.putString(string6, (String)object3);
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                object = string8;
            }
            object3 = GTM_V5_LABEL;
            bundle2.putString((String)object3, (String)object);
        }
        if (string5 != null && (n4 = string5.length()) != 0) {
            object = GTM_CATEGORY;
            bundle2.putString((String)object, string5);
        }
        n4 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0);
        string5 = "screen_name";
        object3 = GTM_V5_SCREEN_NAME;
        if (n4 == 0) {
            bundle2.putString((String)object3, string4);
            bundle2.putString(string5, string4);
            bundle2.putString((String)object3, string4);
        } else {
            object = this.getScreenName();
            bundle2.putString((String)object3, (String)object);
            object = this.getScreenName();
            bundle2.putString(string5, (String)object);
            object = this.getScreenName();
            bundle2.putString((String)object3, (String)object);
        }
        object = "single page checkout";
        n4 = (int)(Intrinsics.areEqual(object, string4) ? 1 : 0);
        if (n4 != 0) {
            object = qn1_2.Companion;
            object.getClass();
            n4 = (int)(qn1$a.a() ? 1 : 0);
            string5 = GTM_PAYMENT_SDK;
            if (n4 != 0) {
                object = "juspay sdk";
                bundle2.putString(string5, (String)object);
            } else {
                object = "ajio sdk";
                bundle2.putString(string5, (String)object);
            }
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)(string5 = ((UserInformation)(object = VX0.a(AJIOApplication.Companion))).getEncryptedUuid()))) {
            string5 = "N/A";
        } else {
            cp_1.Companion.getClass();
            object3 = cp$a.e();
            object3.getClass();
            string5 = cp_1.L(string5);
        }
        object3 = GTM_V5_USER_ID;
        bundle2.putString((String)object3, string5);
        string5 = ((UserInformation)object).getClientId();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string5);
        if (!bl3) {
            string5 = GTM_V5_CLIENT_ID;
            object3 = ((UserInformation)object).getClientId();
            bundle2.putString(string5, (String)object3);
        }
        object3 = ((UserInformation)object).getEncryptedId();
        bundle2.putString(GTM_V5_HYBRIS_ID, (String)object3);
        bl3 = false;
        string5 = null;
        boolean bl4 = b.i(string2, (String)object4, false);
        if (bl4 || (bl4 = b.i(string2, string7, false))) {
            object4 = ((UserInformation)object).getUserPhoneNumber();
            bl2 = TextUtils.isEmpty((CharSequence)object4);
            if (!bl2) {
                cp_1.Companion.getClass();
                object3 = cp$a.e();
                object3.getClass();
                string8 = cp_1.L((String)object4);
            }
            bundle2.putString(GTM_V5_UD, string8);
            object4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
            object3 = GTM_NETWORK_TYPE;
            bundle2.putString((String)object3, (String)object4);
        }
        object4 = rj_0.b();
        bundle2.putString(GTM_V5_TIME_OF_DAY, (String)object4);
        object3 = ((UserInformation)object).getUserStatusMessage();
        bundle2.putString("LoggedInStatus", (String)object3);
        object4 = GTM_V5_USER_STATUS;
        object = ((UserInformation)object).getUserStatus();
        bundle2.putString((String)object4, (String)object);
        if (object2 != null) {
            object = ((AnalyticsData)object2).getBundle();
            bundle2.putAll((Bundle)object);
        }
        object = AnalyticsValues.INSTANCE;
        object2 = ((AnalyticsValues)object).getStoreType();
        bundle2.putString("contains_store", (String)object2);
        object = ((AnalyticsValues)object).getStoreType();
        bundle2.putString("store_type", (String)object);
        object = AnalyticsUtil.Companion;
        object2 = z40_0.Companion;
        object4 = AJIOApplication$a.a();
        object2.getClass();
        object2 = z40$a.a((Context)object4).a;
        object4 = "firebase_experiment";
        object2 = ((ao0_0)object2).b((String)object4);
        object = ((AnalyticsUtil$Companion)object).mapperToFirebaseExperiments((String)object2);
        if (object != null) {
            boolean bl5;
            object = ((AbstractCollection)object).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl5 = object.hasNext()) {
                object2 = object.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                object4 = ((FirebaseExperimentsItem)(object2 = (FirebaseExperimentsItem)object2)).getParams().getEvent_name();
                bl4 = ((String)object4).equals(string2);
                if (!bl4) continue;
                object4 = ((FirebaseExperimentsItem)object2).getParams().getScreen_name();
                bl4 = ((String)object4).equals(object3 = "All");
                if (bl4) {
                    object4 = z40_0.Companion;
                    object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
                    object3 = ((FirebaseExperimentsItem)object2).getParams().getKey();
                    bl2 = TextUtils.isEmpty((CharSequence)(object4 = ((ao0_0)object4).b((String)object3)));
                    if (bl2) continue;
                    object2 = ((FirebaseExperimentsItem)object2).getParams().getKey();
                    bundle2.putString((String)object2, (String)object4);
                    continue;
                }
                object4 = ((FirebaseExperimentsItem)object2).getParams().getScreen_name();
                bl4 = StringsKt.F((CharSequence)object4, (CharSequence)(object3 = String.valueOf(string4)), false);
                if (!bl4) continue;
                object4 = z40_0.Companion;
                object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
                object3 = ((FirebaseExperimentsItem)object2).getParams().getKey();
                bl2 = TextUtils.isEmpty((CharSequence)(object4 = ((ao0_0)object4).b((String)object3)));
                if (bl2) continue;
                object2 = ((FirebaseExperimentsItem)object2).getParams().getKey();
                bundle2.putString((String)object2, (String)object4);
            }
        }
        if ((object = this.appPreferences.f()) != null) {
            string4 = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n3 = 0;
            string4 = null;
        }
        if (string4 != null && (n3 = string4.length()) != 0) {
            string4 = "user_type";
            bundle2.putString(string4, (String)object);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        object = h40_0.a;
        bundle2.putString("isGA4", "true");
        bundle2.putString(string6, string3);
        AJIOApplication.Companion.getClass();
        FirebaseAnalytics.getInstance((Context)AJIOApplication$a.a()).logEvent(string2, bundle2);
    }

    public static /* synthetic */ void sendGTMtoFirebase$default(GTMEvents gTMEvents, String string2, String string3, String string4, String string5, AnalyticsData analyticsData, String string6, Bundle bundle, int n3, Object object) {
        int n4 = n3 & 0x10;
        AnalyticsData analyticsData2 = n4 != 0 ? null : analyticsData;
        n4 = n3 & 0x20;
        String string7 = n4 != 0 ? null : string6;
        n4 = n3 & 0x40;
        Bundle bundle2 = n4 != 0 ? null : bundle;
        gTMEvents.sendGTMtoFirebase(string2, string3, string4, string5, analyticsData2, string7, bundle2);
    }

    private static final UserInformation userInformation_delegate$lambda$0() {
        return VX0.a(AJIOApplication.Companion);
    }

    public final String getScreenName() {
        String string2 = mScreenName;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            mScreenName = string2 = "UnKnown";
        }
        return mScreenName;
    }

    public final UserInformation getUserInformation() {
        Object object = this.userInformation$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void gtmEventsCategoryToGa(String string2, String string3, String string4, String string5, AnalyticsData analyticsData, String string6, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "category");
        this.sendGTMtoFirebase(string2, string3, string4, string5, analyticsData, string6, bundle);
    }

    public final void gtmEventsToGa(String string2, String string3, String string4, String string5, AnalyticsData analyticsData, Bundle bundle, String string6) {
        Intrinsics.checkNotNullParameter(string2, "category");
        this.sendGTMtoFirebase(string2, string3, string4, string5, analyticsData, string6, bundle);
    }

    public final void gtmEventsToGaWithCategory(String string2, String string3, String string4, String string5, String string6, AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        GTMEvents.sendGTMtoFirebase$default(this, string3, string4, string5, string6, analyticsData, string2, null, 64, null);
    }

    public final void onSimilarItemsLoaded(String string2, String string3, String string4, String string5, AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        Intrinsics.checkNotNullParameter(string4, "category");
        Intrinsics.checkNotNullParameter(analyticsData, "analyticsData");
        GTMEvents.gtmEventsToGaWithCategory$default(this, string4, string3, string5, null, string2, analyticsData, 8, null);
    }

    public final void pushAddToCart(String string2, Object object, String string3, AnalyticsData analyticsData) {
        if (object != null) {
            Object object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            Object object3 = "android_service_error_events_screen_name_shown";
            boolean bl2 = ((ao0_0)object2).a((String)object3);
            String string4 = bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string3)) ? string2 : string3;
            String string5 = object.toString();
            String string6 = GTM_EVENT_ADD_TO_CART;
            int n3 = 96;
            object3 = this;
            GTMEvents.gtmEventsToGa$default(this, string6, string2, string5, string4, analyticsData, null, null, n3, null);
        }
    }

    public final void pushAddToClosetWidgetEvent(Product object, String string2, String string3) {
        int n3;
        String string4 = "screenName";
        Intrinsics.checkNotNullParameter(string2, string4);
        if (object != null && (string4 = ((Product)object).getName()) != null && (n3 = string4.length()) != 0) {
            boolean bl2;
            string4 = new Bundle();
            Object object2 = ((Product)object).getName();
            string4.putString("product_name", (String)object2);
            object2 = ((Product)object).getCode();
            string4.putString("product_id", (String)object2);
            Object object3 = ((Product)object).getPrice();
            object2 = null;
            if (object3 != null) {
                object3 = ((Price)object3).getDisplayformattedValue();
            } else {
                bl2 = false;
                object3 = null;
            }
            String string5 = "product_price";
            string4.putString(string5, (String)object3);
            object3 = ((Product)object).getFnlColorVariantData();
            if (object3 != null) {
                object2 = ((ProductFnlColorVariantData)object3).getBrandName();
            }
            string4.putString("product_brand", (String)object2);
            object2 = ((Product)object).getSelectedSize();
            string4.putString("product_size", (String)object2);
            object3 = "plp screen";
            bl2 = Intrinsics.areEqual(string2, object3);
            object2 = "pdp_td";
            if (!bl2 && !(bl2 = Intrinsics.areEqual(string3, object3 = GTM_EVENT_ADD_CLOSET_SOURCE_SIMILAR))) {
                object = ((Product)object).getProductTD();
                string4.putString((String)object2, (String)object);
            } else {
                object3 = this.getDiscount((Product)object);
                string4.putString((String)object2, (String)object3);
                object3 = "product_position";
                int n4 = ((Product)object).getPosition();
                string4.putInt((String)object3, n4);
            }
            AnalyticsData analyticsData = ne_0.b((Bundle)string4);
            int n7 = 96;
            string5 = GTM_EVENT_ADD_TO_CLOSET;
            String string6 = "add to closet";
            object2 = this;
            GTMEvents.gtmEventsToGa$default(this, string5, string6, string3, string2, analyticsData, null, null, n7, null);
        }
    }

    public final void pushAddToClosetWidgetEventFleek(Product object, String string2, String string3) {
        int n3;
        String string4 = "screenName";
        Intrinsics.checkNotNullParameter(string2, string4);
        if (object != null && (string4 = ((Product)object).getName()) != null && (n3 = string4.length()) != 0) {
            string4 = new Bundle();
            Object object2 = ((Product)object).getName();
            string4.putString("product_name", (String)object2);
            object2 = ((Product)object).getCode();
            string4.putString("product_id", (String)object2);
            Object object3 = ((Product)object).getFnlColorVariantData();
            object3 = object3 != null ? ((ProductFnlColorVariantData)object3).getBrandName() : null;
            string4.putString("product_brand", (String)object3);
            object2 = ((Product)object).getBrickName();
            string4.putString("product_brick", (String)object2);
            object3 = "plp screen";
            boolean bl2 = Intrinsics.areEqual(string2, object3);
            object2 = "pdp_td";
            if (!bl2 && !(bl2 = Intrinsics.areEqual(string3, string2 = GTM_EVENT_ADD_CLOSET_SOURCE_SIMILAR))) {
                object = ((Product)object).getProductTD();
                string4.putString((String)object2, (String)object);
            } else {
                string2 = this.getDiscount((Product)object);
                string4.putString((String)object2, string2);
                string2 = "product_position";
                int n4 = ((Product)object).getPosition();
                string4.putInt(string2, n4);
            }
            String string5 = sq0_1.d((String)object3);
            AnalyticsData analyticsData = ne_0.b((Bundle)string4);
            String string6 = "added successfully";
            String string7 = "";
            String string8 = "add_to_wishlist";
            String string9 = GTM_EVENT_ADD_TO_CLOSET;
            object2 = this;
            this.gtmEventsToGaWithCategory(string8, string9, string6, string7, string5, analyticsData);
        }
    }

    public final void pushAppLaunched(String string2, String string3, String string4, AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(string4, "screenName");
        GTMEvents.gtmEventsToGa$default(this, GTM_EVENT_APP_LAUNCH, string2, string3, string4, analyticsData, null, null, 96, null);
    }

    public final void pushAutoSuggestionClickEvents(String string2, String string3, String string4, String string5, String string6, AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "eventCategory");
        Intrinsics.checkNotNullParameter(string4, "action");
        Intrinsics.checkNotNullParameter(string5, "label");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        GTMEvents.sendGTMtoFirebase$default(this, string2, string4, string5, string6, analyticsData, string3, null, 64, null);
    }

    public final void pushBagInteractionsEvent(String string2, String string3, String string4, String string5, String string6, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Object object = "screenName";
        Intrinsics.checkNotNullParameter(string6, (String)object);
        object = bundle == null ? null : ne_0.b(bundle);
        GTMEvents.sendGTMtoFirebase$default(this, string5, string3, string4, string6, (AnalyticsData)object, string2, null, 64, null);
    }

    public final void pushButtonTapEvent(Object object, String string2) {
        if (object != null) {
            Object object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            String string3 = "android_service_error_events_screen_name_shown";
            boolean bl2 = ((ao0_0)object2).a(string3);
            if (bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string2))) {
                string2 = GTM_EVENT_BUTTON_TAP;
            }
            String string4 = object.toString();
            String string5 = GTM_EVENT_BUTTON_TAP;
            string3 = GTM_EVENT_BUTTON_TAP;
            String string6 = GTM_EVENT_BUTTON_TAP;
            int n3 = 80;
            object2 = this;
            GTMEvents.gtmEventsCategoryToGa$default(this, string3, string6, string4, string2, null, string5, null, n3, null);
        }
    }

    public final void pushButtonTapEvent(String string2, Object object, String string3) {
        if (object != null) {
            Object object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            Object object3 = "android_service_error_events_screen_name_shown";
            boolean bl2 = ((ao0_0)object2).a((String)object3);
            String string4 = bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string3)) ? string2 : string3;
            String string5 = object.toString();
            String string6 = GTM_EVENT_BUTTON_TAP;
            String string7 = GTM_EVENT_BUTTON_TAP;
            int n3 = 80;
            object3 = this;
            GTMEvents.gtmEventsCategoryToGa$default(this, string7, string2, string5, string4, null, string6, null, n3, null);
        }
    }

    public final void pushButtonTapEvent(String string2, Object object, String string3, AnalyticsData analyticsData, Bundle bundle) {
        if (object != null) {
            Object object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            Object object3 = "android_service_error_events_screen_name_shown";
            boolean bl2 = ((ao0_0)object2).a((String)object3);
            String string4 = bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string3)) ? string2 : string3;
            String string5 = object.toString();
            String string6 = GTM_EVENT_BUTTON_TAP;
            String string7 = GTM_EVENT_BUTTON_TAP;
            object3 = this;
            this.gtmEventsCategoryToGa(string7, string2, string5, string4, analyticsData, string6, bundle);
        }
    }

    public final void pushCartInteractionsEvent(String string2, String string3, String string4, String string5, String string6, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "label");
        Intrinsics.checkNotNullParameter(string4, "eventName");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Object object = "category";
        Intrinsics.checkNotNullParameter(string6, (String)object);
        object = bundle == null ? null : ne_0.b(bundle);
        GTMEvents.sendGTMtoFirebase$default(this, string4, string2, string3, string5, (AnalyticsData)object, string6, null, 64, null);
    }

    public final void pushCheckoutInteractionsEvent(String string2, String string3, String string4, String string5, Bundle object) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "label");
        Intrinsics.checkNotNullParameter(string4, "eventName");
        Object object2 = "screenName";
        Intrinsics.checkNotNullParameter(string5, (String)object2);
        object = object == null ? null : ne_0.b(object);
        object2 = this;
        GTMEvents.sendGTMtoFirebase$default(this, string4, string2, string3, string5, (AnalyticsData)object, "checkout interactions", null, 64, null);
    }

    public final void pushEvent(String string2, String string3, Object object, String string4) {
        if (object != null) {
            Intrinsics.checkNotNull(string2);
            String string5 = object.toString();
            Intrinsics.checkNotNull(string4);
            int n3 = 112;
            GTMEvents.gtmEventsToGa$default(this, string2, string3, string5, string4, null, null, null, n3, null);
        }
    }

    public final void pushEvent(String string2, String string3, Object object, String string4, AnalyticsData analyticsData) {
        if (object != null) {
            Intrinsics.checkNotNull(string2);
            String string5 = object.toString();
            Intrinsics.checkNotNull(string4);
            int n3 = 96;
            GTMEvents.gtmEventsToGa$default(this, string2, string3, string5, string4, analyticsData, null, null, n3, null);
        }
    }

    public final void pushItemCount(String string2, Object object, String string3, AnalyticsData analyticsData) {
        if (object != null) {
            String string4 = object.toString();
            Intrinsics.checkNotNull(string3);
            int n3 = 96;
            String string5 = GTM_EVENT_ITEM_COUNT;
            GTMEvents.gtmEventsToGa$default(this, string5, string2, string4, string3, analyticsData, null, null, n3, null);
        }
    }

    public final void pushNavigationTapEvent(String string2, Object object, String string3) {
        if (object != null) {
            String string4 = object.toString();
            Intrinsics.checkNotNull(string3);
            int n3 = 112;
            String string5 = GTM_EVENT_NAVIGATION_TAP;
            GTMEvents.gtmEventsToGa$default(this, string5, string2, string4, string3, null, null, null, n3, null);
        }
    }

    public final void pushOOSItemMoveToWishListClickEvent(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        Intrinsics.checkNotNullParameter(string4, "category");
        GTMEvents.gtmEventsToGaWithCategory$default(this, string4, string3, string5, string6, string2, null, 32, null);
    }

    public final void pushOpenScreenEvent(String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "screenName");
        this.setScreenName(string2);
        Object object = this.eaCohort(string2);
        Object object2 = new Bundle();
        String string3 = this.segmentIds;
        if (string3 != null && (n3 = string3.length()) != 0) {
            string3 = "pricing_cust_seg";
            String string4 = this.segmentIds;
            object2.putString(string3, string4);
        }
        if ((n3 = object.length()) > 0) {
            string3 = "secondary_user_cohort";
            object2.putString(string3, (String)object);
        }
        object = h40_0.a;
        object2.putString("isGA4", "true");
        object = new AnalyticsData$Builder();
        AnalyticsData analyticsData = ((AnalyticsData$Builder)object).bundle((Bundle)object2).build();
        object2 = this;
        GTMEvents.gtmEventsToGa$default(this, GTM_TAG_SCREEN_VIEW, "", "", string2, analyticsData, null, null, 96, null);
    }

    public final void pushOpenScreenEvent(String string2, Bundle bundle) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(bundle, "eventMap");
        this.setScreenName(string2);
        Object object = this.eaCohort(string2);
        String string3 = this.segmentIds;
        if (string3 != null && (n3 = string3.length()) != 0) {
            string3 = "pricing_cust_seg";
            String string4 = this.segmentIds;
            bundle.putString(string3, string4);
        }
        if ((n3 = object.length()) > 0) {
            string3 = "secondary_user_cohort";
            bundle.putString(string3, (String)object);
        }
        object = h40_0.a;
        bundle.putString("isGA4", "true");
        object = new AnalyticsData$Builder();
        AnalyticsData analyticsData = ((AnalyticsData$Builder)object).bundle(bundle).build();
        object = this;
        GTMEvents.gtmEventsToGa$default(this, GTM_TAG_SCREEN_VIEW, "", "", string2, analyticsData, null, null, 96, null);
    }

    public final void pushPageInteractionEvent(String string2, String string3, String string4) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "android_service_error_events_screen_name_shown";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        String string5 = bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string4)) ? string2 : string4;
        Intrinsics.checkNotNull(string3);
        object2 = this;
        GTMEvents.gtmEventsToGa$default(this, GTM_EVENT_PAGE_INTERACTION, string2, string3, string5, null, null, null, 112, null);
    }

    public final void pushPageInteractionEvent(String string2, String string3, String string4, AnalyticsData analyticsData) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "android_service_error_events_screen_name_shown";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        String string5 = bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string4)) ? string2 : string4;
        Intrinsics.checkNotNull(string3);
        object2 = this;
        GTMEvents.gtmEventsToGa$default(this, GTM_EVENT_PAGE_INTERACTION, string2, string3, string5, analyticsData, null, null, 96, null);
    }

    public final void pushPageOrderDetailsInteractionEvent(String string2, String string3, String string4, AnalyticsData analyticsData) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "android_service_error_events_screen_name_shown";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        String string5 = bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string4)) ? string2 : string4;
        Intrinsics.checkNotNull(string3);
        object2 = this;
        GTMEvents.gtmEventsToGa$default(this, GTM_EVENT_ORDER_DETAILS_INTERACTION, string2, string3, string5, analyticsData, null, null, 96, null);
    }

    public final void pushProductPurchase(String string2, Object object, String string3, AnalyticsData analyticsData) {
        if (object != null) {
            String string4 = object.toString();
            int n3 = 96;
            String string5 = GTM_EVENT_PRODUCT_PURCHASE;
            GTMEvents.gtmEventsToGa$default(this, string5, string2, string4, string3, analyticsData, null, null, n3, null);
        }
    }

    public final void pushProductSearch(String object, Object object2, String string2, AnalyticsData analyticsData) {
        if (object2 != null) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object2 = "android_service_error_events_screen_name_shown";
            boolean bl2 = ((ao0_0)object).a((String)object2);
            if (bl2) {
                TextUtils.isEmpty((CharSequence)string2);
            }
        }
    }

    public final void pushProductSpotlightSeenEvent(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        Intrinsics.checkNotNullParameter(string4, "category");
        GTMEvents.gtmEventsToGaWithCategory$default(this, string4, string3, string5, string6, string2, null, 32, null);
    }

    public final void pushRemoveFromClosetWidgetEvent(Product object, String string2, String string3) {
        int n3;
        String string4 = "screenName";
        Intrinsics.checkNotNullParameter(string2, string4);
        if (object != null && (string4 = ((Product)object).getName()) != null && (n3 = string4.length()) != 0) {
            string4 = new Bundle();
            Object object2 = ((Product)object).getName();
            string4.putString("product_name", (String)object2);
            object2 = ((Product)object).getCode();
            string4.putString("product_id", (String)object2);
            Object object3 = ((Product)object).getPrice();
            object2 = null;
            object3 = object3 != null ? ((Price)object3).getDisplayformattedValue() : null;
            String string5 = "product_price";
            string4.putString(string5, (String)object3);
            object3 = ((Product)object).getFnlColorVariantData();
            if (object3 != null) {
                object2 = ((ProductFnlColorVariantData)object3).getBrandName();
            }
            string4.putString("product_brand", (String)object2);
            object3 = "plp screen";
            boolean bl2 = Intrinsics.areEqual(string2, object3);
            object2 = "pdp_td";
            if (!bl2 && !(bl2 = Intrinsics.areEqual(string3, string2 = GTM_EVENT_ADD_CLOSET_SOURCE_SIMILAR))) {
                object = ((Product)object).getProductTD();
                string4.putString((String)object2, (String)object);
            } else {
                string2 = this.getDiscount((Product)object);
                string4.putString((String)object2, string2);
                string2 = "product_position";
                int n4 = ((Product)object).getPosition();
                string4.putInt(string2, n4);
            }
            String string6 = sq0_1.d((String)object3);
            AnalyticsData analyticsData = ne_0.b((Bundle)string4);
            string5 = GTM_EVENT_REMOVE_FROM_WISHLIST;
            String string7 = "remove from closet";
            int n7 = 96;
            object2 = this;
            GTMEvents.gtmEventsToGa$default(this, string5, string7, string3, string6, analyticsData, null, null, n7, null);
        }
    }

    public final void pushRemoveFromClosetWidgetEventFleek(Product object, String string2, String string3) {
        int n3;
        String string4 = "screenName";
        Intrinsics.checkNotNullParameter(string2, string4);
        if (object != null && (string4 = ((Product)object).getName()) != null && (n3 = string4.length()) != 0) {
            string4 = new Bundle();
            Object object2 = ((Product)object).getName();
            string4.putString("product_name", (String)object2);
            object2 = ((Product)object).getCode();
            string4.putString("product_id", (String)object2);
            object2 = ((Product)object).getBrickName();
            string4.putString("product_brick", (String)object2);
            Object object3 = ((Product)object).getFnlColorVariantData();
            object3 = object3 != null ? ((ProductFnlColorVariantData)object3).getBrandName() : null;
            string4.putString("product_brand", (String)object3);
            object3 = "plp screen";
            boolean bl2 = Intrinsics.areEqual(string2, object3);
            object2 = "pdp_td";
            if (!bl2 && !(bl2 = Intrinsics.areEqual(string3, string2 = GTM_EVENT_ADD_CLOSET_SOURCE_SIMILAR))) {
                object = ((Product)object).getProductTD();
                string4.putString((String)object2, (String)object);
            } else {
                string2 = this.getDiscount((Product)object);
                string4.putString((String)object2, string2);
                string2 = "product_position";
                int n4 = ((Product)object).getPosition();
                string4.putInt(string2, n4);
            }
            String string5 = sq0_1.d((String)object3);
            AnalyticsData analyticsData = ne_0.b((Bundle)string4);
            String string6 = "removed succesfully";
            String string7 = "";
            String string8 = GTM_EVENT_REMOVE_FROM_WISHLIST;
            String string9 = "delete_from_closet";
            object2 = this;
            this.gtmEventsToGaWithCategory(string8, string9, string6, string7, string5, analyticsData);
        }
    }

    public final void pushRemoveOOSItemClickEvent(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        Intrinsics.checkNotNullParameter(string4, "category");
        GTMEvents.gtmEventsToGaWithCategory$default(this, string4, string3, string5, string6, string2, null, 32, null);
    }

    public final void pushSearchDiscoveryEvent(String string2, String string3, String string4, AnalyticsData analyticsData) {
        String string5 = String.valueOf(string3);
        GTMEvents.gtmEventsToGa$default(this, GTM_EVENT_DISCOVERY, string2, string5, string4, analyticsData, null, null, 96, null);
    }

    public final void pushServiceErrorEvent(String string2, Object object) {
        GTMEvents.pushServiceErrorEvent$default(this, string2, object, null, null, 12, null);
    }

    public final void pushServiceErrorEvent(String string2, Object object, Object object2) {
        GTMEvents.pushServiceErrorEvent$default(this, string2, object, object2, null, 8, null);
    }

    public final void pushServiceErrorEvent(String string2, Object object, Object object2, AnalyticsData analyticsData) {
        String string3 = String.valueOf(object);
        if (object2 == null || (object = object2.toString()) == null) {
            object = "";
        }
        GTMEvents.gtmEventsToGa$default(this, SERVICE_ERROR_EVENT, string2, string3, (String)object, analyticsData, null, null, 96, null);
    }

    public final void pushShowSimilarEvent(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        Intrinsics.checkNotNullParameter(string4, "category");
        GTMEvents.gtmEventsToGaWithCategory$default(this, string4, string3, string5, string6, string2, null, 32, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void pushSuggestionWidgetEvent(String string2, String string3, boolean bl2, List object, Product object2) {
        Object object3;
        Object object4;
        Object object5;
        Object object6 = "screenName";
        Intrinsics.checkNotNullParameter(string3, (String)object6);
        if (bl2 && object2 != null && object != null) {
            object = (Iterable)object;
            int n3 = yx_2.o((Iterable)object, 10);
            object6 = new ArrayList(n3);
            object = object.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object5 = ((Product)object.next()).getCode();
                object6.add(object5);
            }
            object = new Bundle();
            object5 = new ArrayList(object6);
            object.putStringArrayList("widget_master_product", object5);
            object5 = ((Product)object2).getCode();
            object.putString("product_id", (String)object5);
            object5 = ((Product)object2).getName();
            object.putString("product_name", (String)object5);
            object5 = ((Product)object2).getBrandName();
            object.putString("product_brand", (String)object5);
            object5 = ((Product)object2).getBrickName();
            object.putString("product_brick", (String)object5);
            object6 = "product_category";
            object2 = ((Product)object2).getBrickCategory();
            object.putString((String)object6, (String)object2);
        } else {
            object = null;
        }
        Object object7 = object;
        if (bl2) {
            String string4 = "pdp_widget_impression";
            object = "cross-sell widget";
            object2 = "widget impression";
            object5 = string4;
            object4 = object;
            object3 = object2;
        } else {
            String string5 = "";
            object = GTM_EVENT_SUGGESTION_WIDGET;
            object2 = "suggestions viewed";
            object3 = string5;
            object5 = object;
            object4 = object2;
        }
        object6 = this;
        GTMEvents.gtmEventsToGa$default(this, object5, (String)object4, string2, string3, null, (Bundle)object7, (String)object3, 16, null);
    }

    public final void pushUpdateAppEvent(String string2, Object object, String string3) {
        if (object != null) {
            boolean bl2;
            Object object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            Object object3 = "android_service_error_events_screen_name_shown";
            boolean n3 = ((ao0_0)object2).a((String)object3);
            String string4 = n3 && (bl2 = TextUtils.isEmpty((CharSequence)string3)) ? string2 : string3;
            string3 = dk0.a(3444, "current_app_version");
            int n4 = qo_0.a;
            string3.putInt("proposed_app_version", n4);
            String string5 = object.toString();
            AnalyticsData analyticsData = ne_0.b((Bundle)string3);
            String string6 = GTM_EVENT_UPDATE_WIDGET;
            int n7 = 96;
            object3 = this;
            GTMEvents.gtmEventsToGa$default(this, string6, string2, string5, string4, analyticsData, null, null, n7, null);
        }
    }

    public final void pushWebViewLoad(String string2, Object object, String string3) {
        if (object != null) {
            Object object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            String string4 = "android_service_error_events_screen_name_shown";
            boolean bl2 = ((ao0_0)object2).a(string4);
            if (bl2 && (bl2 = TextUtils.isEmpty((CharSequence)string3))) {
                string3 = GTM_EVENT_BUTTON_TAP;
            }
            String string5 = object.toString();
            string4 = GTM_EVENT_WEB_VIEW_LOAD;
            int n3 = 112;
            object2 = this;
            GTMEvents.gtmEventsToGa$default(this, string4, string2, string5, string3, null, null, null, n3, null);
        }
    }

    public final void pushWidgetInteractionEvent(String string2, String string3, String string4, Bundle object) {
        object = object != null ? ne_0.b(object) : null;
        GTMEvents.sendGTMtoFirebase$default(this, GTM_EVENT_WIDGET_INTERACTION, string2, string3, string4, (AnalyticsData)object, null, null, 96, null);
    }

    public final void setScreenName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        mScreenName = string2;
    }

    public final void showXLeftInventoryEvent(String string2, String string3, String string4, String string5, AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        Intrinsics.checkNotNullParameter(string4, "category");
        GTMEvents.gtmEventsToGaWithCategory$default(this, string4, string3, string5, null, string2, analyticsData, 8, null);
    }

    public final void talkToUsTapEvent(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        Intrinsics.checkNotNullParameter(string4, "category");
        GTMEvents.gtmEventsToGaWithCategory$default(this, string4, string3, string5, null, string2, null, 40, null);
    }
}

