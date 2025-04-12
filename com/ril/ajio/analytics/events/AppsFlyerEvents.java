/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.ril.ajio.analytics.events;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.AppsFlyerEvents$pushPurchaseEvent$1;
import com.ril.ajio.analytics.events.AppsFlyerEvents$pushPurchaseEvent$2;
import com.ril.ajio.analytics.events.MetricsLogging;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.events.enum.AppsFlyerEventsItem;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AppsFlyerEvents {
    public static final int $stable = 0;
    private static final String AF_BALANCE_REVENUE = "af_bal_revenue";
    private static final String AF_BRICK = "af_brick";
    private static final String AF_CONTAINS_LUXE = "af_contains_luxe";
    private static final String AF_CONTENT = "af_content";
    private static final String AF_CONTENT_ID = "af_content_id";
    private static final String AF_CONTENT_LIST = "af_content_list";
    private static final String AF_CONTENT_TYPE = "af_content_type";
    private static final String AF_CURRENCY = "af_currency";
    public static final String AF_CURRENCY_INR = "INR";
    public static final String AF_FACEBOOK_LOGIN_METHOD = "Facebook";
    public static final String AF_GOOGLE_LOGIN_METHOD = "Google";
    private static final String AF_LOGIN_METHOD = "af_login_method";
    private static final String AF_LUXE_REVENUE = "af_luxe_revenue";
    private static final String AF_ORDER_ID = "af_order_id";
    public static final String AF_OTP_LOGIN_METHOD = "OTP";
    private static final String AF_PRICE = "af_price";
    private static final String AF_QUANTITY = "af_quantity";
    private static final String AF_REGISTRATION_METHOD = "af_registration_method";
    private static final String AF_RETURN_CANCEL = "af_return_cancel";
    private static final String AF_REVENUE = "af_revenue";
    private static final String AF_SEARCH_STRING = "af_search_string";
    private static final String AF_SEGMENT = "af_segment";
    private static final String AF_VALIDATED = "af_validated";
    private static final String CATEGORY_APPSFLYER_CALLBACKS = "af_callbacks";
    private static final String ERROR_CODE_AF = "error_code_af";
    private static final String ERROR_DESCRIPTION_AF = "error_description_af";
    private static final String EVENT_AF_ADD_TO_CART = "af_add_to_cart";
    private static final String EVENT_AF_ADD_TO_CART_LUXE = "af_add_to_cart_luxe";
    private static final String EVENT_AF_COMPLETE_REGISTRATION = "af_complete_registration";
    private static final String EVENT_AF_FIRST_PURCHASE = "first_purchase";
    private static final String EVENT_AF_FIRST_PURCHASE_FAIL = "first_purchase_fail";
    private static final String EVENT_AF_FIRST_PURCHASE_LUXE = "first_purchase_luxe";
    private static final String EVENT_AF_FIRST_PURCHASE_LUXE_FAIL = "first_purchase_luxe_fail";
    private static final String EVENT_AF_LOGIN = "af_login";
    private static final String EVENT_AF_PDP_CONTENT_VIEW = "af_content_view";
    private static final String EVENT_AF_PURCHASE = "af_purchase";
    private static final String EVENT_AF_PURCHASE_FAIL = "af_purchase_fail";
    private static final String EVENT_AF_PURCHASE_LUXE = "af_purchase_luxe";
    private static final String EVENT_AF_PURCHASE_LUXE_FAIL = "af_purchase_luxe_fail";
    private static final String EVENT_AF_PURCHASE_REFUND = "af_purchase_refund";
    private static final String EVENT_AF_PURCHASE_REFUND_LUXE = "af_purchase_refund_luxe";
    private static final String EVENT_AF_SEARCH = "af_search";
    private static final String EVENT_APPSFLYER_DEBUG = "af_debug";
    private static final String EVENT_ENGAGED_SESSION = "engaged_session";
    private static final String EVENT_FIRST_ENGAGED_SESSION = "first_engaged_session";
    public static final AppsFlyerEvents INSTANCE;
    private static final String ORDER_ID = "order_id";
    private static final String PRODUCT_ID = "product_id";
    private static final NewCustomEventsRevamp newCustomEventsRevamp;
    private static final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;

    static {
        Object object = new AppsFlyerEvents();
        INSTANCE = object;
        object = AnalyticsManager.Companion;
        newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        $stable = 8;
    }

    private AppsFlyerEvents() {
    }

    public static final /* synthetic */ void access$sendAppsflyerGaDebugLogs(AppsFlyerEvents appsFlyerEvents, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        appsFlyerEvents.sendAppsflyerGaDebugLogs(string2, string3, string4, string5, string6, string7, string8, string9);
    }

    private final boolean isNewUser() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        return b.i(jo_22.f(), "New", true);
    }

    private final void sendAppsflyerGaDebugLogs(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        int n3;
        int n4;
        boolean bl2;
        Object object;
        Object object2 = string8;
        String string10 = string9;
        Object object3 = h40_0.a;
        object3 = h40_0.S();
        boolean bl3 = false;
        if (object3 != null) {
            object3 = ((MetricsLogging)object3).getAppsflyerGaLoggingEnable();
            object = Boolean.FALSE;
            bl2 = Intrinsics.areEqual(object3, object);
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2) {
            return;
        }
        object3 = ORDER_ID;
        object = PRODUCT_ID;
        Object object4 = string6;
        Bundle bundle = px1_2.b((String)object3, string6, (String)object, string7);
        bl2 = true;
        if (object2 != null && (n4 = string8.length()) != 0) {
            n4 = 0;
            object = null;
        } else {
            n4 = 1;
        }
        if (n4 == 0) {
            object = ERROR_CODE_AF;
            bundle.putString((String)object, (String)object2);
        }
        if (string10 == null || (n3 = string9.length()) == 0) {
            bl3 = true;
        }
        if (!bl3) {
            object2 = ERROR_DESCRIPTION_AF;
            bundle.putString((String)object2, string10);
        }
        object4 = newCustomEventsRevamp;
        object2 = AnalyticsManager.Companion;
        String string11 = av_0.a((AnalyticsManager$Companion)object2);
        String string12 = av_0.a((AnalyticsManager$Companion)object2);
        String string13 = bv_0.a((AnalyticsManager$Companion)object2);
        String string14 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string3, string4, string5, string2, string11, string12, string13, bundle, string14, false, null, 1536, null);
    }

    public static /* synthetic */ void sendAppsflyerGaDebugLogs$default(AppsFlyerEvents appsFlyerEvents, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, int n3, Object object) {
        int n4 = n3;
        int n7 = n3 & 0x40;
        String string10 = n7 != 0 ? null : string8;
        String string11 = (n4 &= 0x80) != 0 ? null : string9;
        appsFlyerEvents.sendAppsflyerGaDebugLogs(string2, string3, string4, string5, string6, string7, string10, string11);
    }

    public final String getUserType() {
        boolean bl2 = this.isNewUser();
        String string2 = bl2 ? "new" : "repeat";
        return string2;
    }

    public final void pushAddToCartEvent(double d2, String object, String string2, String string3, long l2, boolean bl2, Double object2, AppsFlyerEventsItem appsFlyerEventsItem) {
        Intrinsics.checkNotNullParameter(object, "productCategory");
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(string3, "productName");
        Intrinsics.checkNotNullParameter(appsFlyerEventsItem, "appsFlyerEventItem");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object3 = appsFlyerEventsItem.getPrice();
        object = "";
        if (object3 == null) {
            object3 = object;
        }
        string2 = AF_PRICE;
        hashMap.put(string2, object3);
        object3 = appsFlyerEventsItem.getContentId();
        if (object3 == null) {
            object3 = object;
        }
        String string4 = AF_CONTENT_ID;
        hashMap.put(string4, object3);
        object3 = appsFlyerEventsItem.getContentType();
        if (object3 == null) {
            object3 = object;
        }
        String string5 = AF_CONTENT_TYPE;
        hashMap.put(string5, object3);
        hashMap.put(AF_CONTENT, string3);
        object3 = AF_CURRENCY;
        string3 = AF_CURRENCY_INR;
        hashMap.put((String)object3, string3);
        Object object4 = appsFlyerEventsItem.getQuantity();
        if (object4 == null) {
            object4 = "0";
        }
        String string6 = AF_QUANTITY;
        hashMap.put(string6, object4);
        object4 = bl2;
        String string7 = AF_CONTAINS_LUXE;
        hashMap.put(string7, object4);
        object4 = appsFlyerEventsItem.getSegment();
        if (object4 == null) {
            object4 = object;
        }
        string7 = AF_SEGMENT;
        hashMap.put(string7, object4);
        object4 = appsFlyerEventsItem.getBrick();
        if (object4 != null) {
            object = object4;
        }
        object4 = AF_BRICK;
        hashMap.put((String)object4, object);
        object = AF_LUXE_REVENUE;
        if (object2 != null) {
            double d5 = ((Number)object2).doubleValue();
            object2 = d5;
            hashMap.put((String)object, object2);
        } else {
            double d7 = 0.0;
            object2 = d7;
            hashMap.put((String)object, object2);
        }
        object = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        String string8 = EVENT_AF_ADD_TO_CART;
        ((AppsFlyerLib)object).logEvent((Context)object2, string8, hashMap);
        if (bl2) {
            hashMap = h40_0.a;
            boolean bl3 = h40_0.Q0();
            if (bl3) {
                hashMap = new HashMap<String, Object>();
                object = appsFlyerEventsItem.getQuantity();
                if (object != null) {
                    hashMap.put(string6, object);
                }
                if ((object = appsFlyerEventsItem.getPrice()) != null) {
                    hashMap.put(string2, object);
                }
                if ((object = appsFlyerEventsItem.getContentId()) != null) {
                    hashMap.put(string4, object);
                }
                if ((object = appsFlyerEventsItem.getContentType()) != null) {
                    hashMap.put(string5, object);
                }
                if ((object = appsFlyerEventsItem.getSegment()) != null) {
                    hashMap.put(string7, object);
                }
                if ((object = appsFlyerEventsItem.getBrick()) != null) {
                    hashMap.put((String)object4, object);
                }
                hashMap.put((String)object3, string3);
                object3 = AppsFlyerLib.getInstance();
                object = AJIOApplication$a.a();
                string2 = EVENT_AF_ADD_TO_CART_LUXE;
                ((AppsFlyerLib)object3).logEvent((Context)object, string2, hashMap);
            }
        }
    }

    public final void pushPDPContentViewEvent(AppsFlyerEventsItem object) {
        String string2;
        Intrinsics.checkNotNullParameter(object, "appsFlyerEventItem");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object2 = ((AppsFlyerEventsItem)object).getPrice();
        if (object2 != null) {
            string2 = AF_PRICE;
            hashMap.put(string2, object2);
        }
        if ((object2 = ((AppsFlyerEventsItem)object).getContent()) != null) {
            string2 = AF_CONTENT;
            hashMap.put(string2, object2);
        }
        if ((object2 = ((AppsFlyerEventsItem)object).getContentId()) != null) {
            string2 = AF_CONTENT_ID;
            hashMap.put(string2, object2);
        }
        if ((object2 = ((AppsFlyerEventsItem)object).getContentType()) != null) {
            string2 = AF_CONTENT_TYPE;
            hashMap.put(string2, object2);
        }
        if ((object2 = ((AppsFlyerEventsItem)object).getSegment()) != null) {
            string2 = AF_SEGMENT;
            hashMap.put(string2, object2);
        }
        if ((object2 = ((AppsFlyerEventsItem)object).getBrick()) != null) {
            string2 = AF_BRICK;
            hashMap.put(string2, object2);
        }
        if ((object = ((AppsFlyerEventsItem)object).getCurrency()) != null) {
            object2 = AF_CURRENCY;
            hashMap.put((String)object2, object);
        }
        object = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        ((AppsFlyerLib)object).logEvent((Context)object2, EVENT_AF_PDP_CONTENT_VIEW, hashMap);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void pushPurchaseEvent(double d2, String string2, boolean bl2, Double object, AppsFlyerEventsItem appsFlyerEventsItem) {
        HashMap<String, Object> hashMap = string2;
        AppsFlyerEventsItem appsFlyerEventsItem2 = appsFlyerEventsItem;
        Intrinsics.checkNotNullParameter(string2, "orderId");
        Intrinsics.checkNotNullParameter(appsFlyerEventsItem, "appsFlyerEventItem");
        Object object2 = new HashMap();
        Object object3 = appsFlyerEventsItem.getRevenue();
        Object object4 = "";
        if (object3 == null) {
            object3 = object4;
        }
        Object object5 = AF_REVENUE;
        ((HashMap)object2).put(object5, object3);
        object3 = appsFlyerEventsItem.getContentId();
        if (object3 == null) {
            object3 = object4;
        }
        String string3 = AF_CONTENT_ID;
        ((HashMap)object2).put(string3, object3);
        object3 = appsFlyerEventsItem.getContentType();
        if (object3 == null) {
            object3 = object4;
        }
        String string4 = AF_CONTENT_TYPE;
        ((HashMap)object2).put(string4, object3);
        object3 = AF_CURRENCY;
        String string5 = AF_CURRENCY_INR;
        ((HashMap)object2).put(object3, string5);
        String string6 = appsFlyerEventsItem.getQuantity();
        if (string6 == null) {
            string6 = object4;
        }
        String string7 = AF_QUANTITY;
        ((HashMap)object2).put(string7, string6);
        string6 = AF_ORDER_ID;
        ((HashMap)object2).put(string6, hashMap);
        Object object6 = appsFlyerEventsItem.getSegment();
        if (object6 == null) {
            object6 = object4;
        }
        String string8 = AF_SEGMENT;
        ((HashMap)object2).put(string8, object6);
        object6 = appsFlyerEventsItem.getBrick();
        if (object6 == null) {
            object6 = object4;
        }
        Object object7 = AF_BRICK;
        ((HashMap)object2).put(object7, object6);
        String string9 = this.getUserType();
        ((HashMap)object2).put(AF_VALIDATED, string9);
        object6 = d2;
        ((HashMap)object2).put(AF_BALANCE_REVENUE, object6);
        object6 = bl2;
        string9 = AF_CONTAINS_LUXE;
        ((HashMap)object2).put(string9, object6);
        object6 = appsFlyerEventsItem.getLuxeTotalRevenue();
        if (object6 == null) {
            object6 = object4;
        }
        string9 = AF_LUXE_REVENUE;
        ((HashMap)object2).put(string9, object6);
        boolean bl3 = this.isNewUser();
        string9 = bl3 ? EVENT_AF_FIRST_PURCHASE : EVENT_AF_PURCHASE;
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        object = object4;
        object4 = AJIOApplication$a.a();
        String string10 = object7;
        object7 = new AppsFlyerEvents$pushPurchaseEvent$1(string9, appsFlyerEventsItem2, (String)((Object)hashMap), bl3);
        appsFlyerLib.logEvent((Context)object4, string9, (Map)object2, (AppsFlyerRequestListener)object7);
        if (bl2) {
            hashMap = h40_0.a;
            boolean bl4 = h40_0.Q0();
            if (bl4) {
                hashMap = new HashMap<String, Object>();
                object2 = appsFlyerEventsItem.getLuxeTotalRevenue();
                if (object2 == null) {
                    object2 = object;
                }
                hashMap.put((String)object5, object2);
                object2 = appsFlyerEventsItem.getLuxeProductIds();
                if (object2 == null) {
                    object2 = object;
                }
                hashMap.put(string3, object2);
                object2 = appsFlyerEventsItem.getLuxeContentType();
                if (object2 == null) {
                    object2 = object;
                }
                hashMap.put(string4, object2);
                hashMap.put((String)object3, string5);
                object2 = appsFlyerEventsItem.getLuxeCartQuantity();
                if (object2 == null) {
                    object2 = object;
                }
                hashMap.put(string7, object2);
                object2 = appsFlyerEventsItem.getOrderId();
                if (object2 == null) {
                    object2 = object;
                }
                hashMap.put(string6, object2);
                object2 = appsFlyerEventsItem.getLuxeSegmentType();
                if (object2 == null) {
                    object2 = object;
                }
                hashMap.put(string8, object2);
                object2 = appsFlyerEventsItem.getLuxeBrickType();
                object4 = object2 == null ? object : object2;
                object2 = string10;
                hashMap.put(string10, object4);
                object2 = bl3 ? EVENT_AF_FIRST_PURCHASE_LUXE : EVENT_AF_PURCHASE_LUXE;
                object3 = AppsFlyerLib.getInstance();
                object4 = AJIOApplication$a.a();
                object5 = new AppsFlyerEvents$pushPurchaseEvent$2((String)object2, appsFlyerEventsItem2, bl3);
                ((AppsFlyerLib)object3).logEvent((Context)object4, (String)object2, hashMap, (AppsFlyerRequestListener)object5);
            }
        }
    }

    public final void pushPurchaseRefund(double d2, double d5, String string2, String string3, String string4, boolean bl2, Double d7, AppsFlyerEventsItem appsFlyerEventsItem) {
        String string5;
        int n3;
        CharSequence charSequence;
        int n4;
        HashMap<String, Double> hashMap = string3;
        Object object = string4;
        Object object2 = string2;
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(string3, "orderId");
        Intrinsics.checkNotNullParameter(string4, "returnCancel");
        object2 = appsFlyerEventsItem;
        Intrinsics.checkNotNullParameter(appsFlyerEventsItem, "appsFlyerEventItem");
        Object object3 = new HashMap();
        Object object4 = appsFlyerEventsItem.getRevenue();
        double d9 = 0.0;
        Double d12 = d9;
        String string6 = "-";
        String string7 = "0.0";
        String string8 = AF_REVENUE;
        if (object4 != null && (n4 = ((String)object4).length()) != 0 && (n4 = (int)(Intrinsics.areEqual(object4 = appsFlyerEventsItem.getRevenue(), string7) ? 1 : 0)) == 0) {
            object4 = appsFlyerEventsItem.getRevenue();
            charSequence = new StringBuilder(string6);
            charSequence.append((String)object4);
            object4 = charSequence.toString();
            ((HashMap)object3).put(string8, object4);
        } else {
            ((HashMap)object3).put(string8, d12);
        }
        double d13 = d5 - d2;
        object4 = d13;
        ((HashMap)object3).put(AF_BALANCE_REVENUE, object4);
        ((HashMap)object3).put(AF_RETURN_CANCEL, object);
        object = AF_CURRENCY;
        object4 = AF_CURRENCY_INR;
        ((HashMap)object3).put(object, object4);
        charSequence = appsFlyerEventsItem.getQuantity();
        Object object5 = "";
        if (charSequence == null) {
            charSequence = object5;
        }
        String string9 = AF_QUANTITY;
        ((HashMap)object3).put(string9, charSequence);
        charSequence = AF_ORDER_ID;
        ((HashMap)object3).put(charSequence, hashMap);
        hashMap = appsFlyerEventsItem.getSegment();
        if (hashMap == null) {
            hashMap = object5;
        }
        String string10 = AF_SEGMENT;
        ((HashMap)object3).put(string10, hashMap);
        hashMap = appsFlyerEventsItem.getBrick();
        if (hashMap == null) {
            hashMap = object5;
        }
        String string11 = AF_BRICK;
        ((HashMap)object3).put(string11, hashMap);
        String string12 = this.getUserType();
        ((HashMap)object3).put(AF_VALIDATED, string12);
        hashMap = appsFlyerEventsItem.getContentId();
        if (hashMap == null) {
            hashMap = object5;
        }
        string12 = AF_CONTENT_ID;
        ((HashMap)object3).put(string12, hashMap);
        hashMap = appsFlyerEventsItem.getContentType();
        if (hashMap == null) {
            hashMap = object5;
        }
        String string13 = AF_CONTENT_TYPE;
        ((HashMap)object3).put(string13, hashMap);
        hashMap = bl2;
        ((HashMap)object3).put(AF_CONTAINS_LUXE, hashMap);
        hashMap = appsFlyerEventsItem.getLuxeTotalRevenue();
        object2 = AF_LUXE_REVENUE;
        if (hashMap != null && (n3 = ((String)((Object)hashMap)).length()) != 0 && (n3 = (int)(Intrinsics.areEqual(hashMap = appsFlyerEventsItem.getLuxeTotalRevenue(), string7) ? 1 : 0)) == 0) {
            hashMap = appsFlyerEventsItem.getLuxeTotalRevenue();
            string5 = object5;
            object5 = new StringBuilder(string6);
            ((StringBuilder)object5).append((String)((Object)hashMap));
            hashMap = ((StringBuilder)object5).toString();
            ((HashMap)object3).put(object2, hashMap);
        } else {
            string5 = object5;
            ((HashMap)object3).put(object2, d12);
        }
        hashMap = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        object5 = EVENT_AF_PURCHASE_REFUND;
        ((AppsFlyerLib)((Object)hashMap)).logEvent((Context)object2, (String)object5, (Map)object3);
        if (bl2) {
            hashMap = h40_0.a;
            n3 = (int)(h40_0.Q0() ? 1 : 0);
            if (n3 != 0) {
                int n7;
                hashMap = new HashMap<String, Double>();
                object3 = appsFlyerEventsItem.getLuxeTotalRevenue();
                if (object3 != null && (n7 = ((String)object3).length()) != 0 && (n7 = (int)(Intrinsics.areEqual(object3 = appsFlyerEventsItem.getLuxeTotalRevenue(), string7) ? 1 : 0)) == 0) {
                    object3 = appsFlyerEventsItem.getLuxeTotalRevenue();
                    object2 = new StringBuilder(string6);
                    ((StringBuilder)object2).append((String)object3);
                    object3 = ((StringBuilder)object2).toString();
                    hashMap.put(string8, (Double)object3);
                } else {
                    hashMap.put(string8, d12);
                }
                object3 = appsFlyerEventsItem.getLuxeProductIds();
                if (object3 == null) {
                    object3 = string5;
                }
                hashMap.put(string12, (Double)object3);
                object3 = appsFlyerEventsItem.getLuxeContentType();
                if (object3 == null) {
                    object3 = string5;
                }
                hashMap.put(string13, (Double)object3);
                hashMap.put((String)object, (Double)object4);
                object = appsFlyerEventsItem.getLuxeCartQuantity();
                if (object == null) {
                    object = string5;
                }
                hashMap.put(string9, (Double)object);
                object = appsFlyerEventsItem.getOrderId();
                if (object == null) {
                    object = string5;
                }
                hashMap.put((String)charSequence, (Double)object);
                object = appsFlyerEventsItem.getLuxeSegmentType();
                if (object == null) {
                    object = string5;
                }
                hashMap.put(string10, (Double)object);
                object = appsFlyerEventsItem.getLuxeBrickType();
                object5 = object == null ? string5 : object;
                hashMap.put(string11, (Double)object5);
                object = AppsFlyerLib.getInstance();
                object3 = AJIOApplication$a.a();
                object2 = EVENT_AF_PURCHASE_REFUND_LUXE;
                ((AppsFlyerLib)object).logEvent((Context)object3, (String)object2, hashMap);
            }
        }
    }

    public final void pushUserSessionEvent() {
        HashMap hashMap = new HashMap();
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Object object2 = new jo_2((Context)object);
        object = "USER_SESSION";
        AppsFlyerLib appsFlyerLib = null;
        boolean bl2 = ((sw_0)object2).getPreference((String)object, false);
        if (!bl2) {
            appsFlyerLib = AppsFlyerLib.getInstance();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            String string2 = EVENT_FIRST_ENGAGED_SESSION;
            appsFlyerLib.logEvent((Context)aJIOApplication, string2, hashMap);
            bl2 = true;
            ((sw_0)object2).putPreference((String)object, bl2);
        }
        object2 = AppsFlyerLib.getInstance();
        object = AJIOApplication$a.a();
        ((AppsFlyerLib)object2).logEvent((Context)object, EVENT_ENGAGED_SESSION, hashMap);
    }

    public final void sendLoginMethodEvent(String object) {
        Intrinsics.checkNotNullParameter(object, "loginMethod");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(AF_LOGIN_METHOD, (String)object);
        object = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        ((AppsFlyerLib)object).logEvent((Context)aJIOApplication, EVENT_AF_LOGIN, hashMap);
    }

    public final void sendRegistrationMethodEvent(String object) {
        Intrinsics.checkNotNullParameter(object, "loginMethod");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(AF_REGISTRATION_METHOD, (String)object);
        object = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        ((AppsFlyerLib)object).logEvent((Context)aJIOApplication, EVENT_AF_COMPLETE_REGISTRATION, hashMap);
    }

    public final void sendSearchEvent(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "searchString");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = AF_SEARCH_STRING;
        hashMap.put(string2, (String)object);
        if (object2 == null) {
            object2 = "";
        }
        hashMap.put(AF_CONTENT_LIST, (String)object2);
        object = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        ((AppsFlyerLib)object).logEvent((Context)object2, EVENT_AF_SEARCH, hashMap);
    }

    public final void wrapper(Function0 function0) {
        Object object = "wrappedApiFunction";
        Intrinsics.checkNotNullParameter(function0, (String)object);
        try {
            function0.invoke();
        }
        catch (Exception exception) {
            object = FirebaseCrashlytics.getInstance();
            String string2 = "HANDLED_API_EXCEPTION - AppsFlyerEvents";
            Exception exception2 = new Exception(string2, exception);
            ((FirebaseCrashlytics)object).recordException(exception2);
        }
    }
}

