/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.events;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.constants.AnalyticsValues;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FirebaseEvents$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class FirebaseEvents {
    public static final int $stable = 0;
    public static final int CART_CLOSET = 3;
    public static final FirebaseEvents$Companion Companion;
    public static final int PDP = 2;
    public static final int PLP = 1;
    private static FirebaseEvents firebaseEvents;
    private final jo_2 appPreferences;
    private FirebaseAnalytics firebaseAnalytics;

    static {
        FirebaseEvents$Companion firebaseEvents$Companion;
        Companion = firebaseEvents$Companion = new FirebaseEvents$Companion(null);
        $stable = 8;
    }

    public FirebaseEvents() {
        AJIOApplication.Companion.getClass();
        Object object = FirebaseAnalytics.getInstance((Context)AJIOApplication$a.a());
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(...)");
        this.firebaseAnalytics = object;
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.appPreferences = object = new jo_2((Context)aJIOApplication);
    }

    public static final /* synthetic */ FirebaseEvents access$getFirebaseEvents$cp() {
        return firebaseEvents;
    }

    public static final /* synthetic */ void access$setFirebaseEvents$cp(FirebaseEvents firebaseEvents) {
        FirebaseEvents.firebaseEvents = firebaseEvents;
    }

    private final String calculateTD(String object, String object2) {
        block16: {
            int n3 = 1;
            if (object != null && object2 != null) {
                double d2;
                double d5;
                try {
                    d5 = Double.parseDouble((String)object);
                }
                catch (Exception exception) {}
                double d7 = Double.parseDouble((String)object2);
                double d9 = 0.0;
                double d12 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1);
                if (d12 <= 0 || (d12 = d7 == d9 ? 0 : (d7 > d9 ? 1 : -1)) <= 0 || (d2 = d7 == d5 ? 0 : (d7 < d5 ? -1 : 1)) >= 0) break block16;
                d2 = 100;
                d9 = d2;
                d7 = d7 / d5 * d9;
                d9 -= d7;
                object = StringCompanionObject.INSTANCE;
                object = "%.2f";
                object2 = d9;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object2;
                object2 = Arrays.copyOf(objectArray, n3);
                object = String.format((String)object, (Object[])object2);
                object2 = "format(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                d7 = Double.parseDouble((String)object);
                int n4 = ok1_1.a(d7);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(n4);
                object = "% Off";
                ((StringBuilder)object2).append((String)object);
                return ((StringBuilder)object2).toString();
            }
        }
        return "0% Off";
    }

    public static final FirebaseEvents getInstance() {
        return Companion.getInstance();
    }

    private final Bundle prepareCartClosetBundle(Product object, String object2) {
        int n3;
        int n4 = 0;
        int n7 = 0;
        String[] stringArray = null;
        int n8 = 4;
        FirebaseEvents firebaseEvents = this;
        Object object3 = object;
        String string2 = object2;
        firebaseEvents = FirebaseEvents.preparePlpBundle$default(this, (Product)object, (String)object2, null, n8, null);
        object3 = ((Product)object).getFnlColorVariantData();
        string2 = "colour";
        if (object3 != null && (object3 = ((ProductFnlColorVariantData)object3).getColor()) != null) {
            firebaseEvents.putString(string2, (String)object3);
        }
        if ((n3 = Intrinsics.areEqual(object3 = "add_to_wishlist", object2)) != 0) {
            GAEcommerceEvents.addProductInfo((Product)object, (Bundle)firebaseEvents);
        }
        n3 = firebaseEvents.containsKey(string2);
        int n10 = 1;
        if (n3 == 0 && (object2 = ((Product)object).getCode()) != null) {
            stringArray = "_";
            n8 = 0;
            n3 = StringsKt.F((CharSequence)object2, (CharSequence)stringArray, false);
            if (n3 == n10) {
                object2 = ((Product)object).getCode();
                if (object2 != null) {
                    stringArray = new String[]{stringArray};
                    n4 = 6;
                    object2 = StringsKt.a0((CharSequence)object2, stringArray, false, 0, n4);
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (object2 != null && (n7 = object2.size()) == (n8 = 2)) {
                    object2 = (String)object2.get(n10);
                    firebaseEvents.putString(string2, (String)object2);
                }
            }
        }
        firebaseEvents.putInt("quantity", n10);
        firebaseEvents.putString("currency", "INR");
        object2 = "item_name";
        object3 = ((Product)object).getName();
        firebaseEvents.putString((String)object2, (String)object3);
        object = ((Product)object).getBrickCategory();
        if (object != null) {
            object2 = "item_category";
            firebaseEvents.putString((String)object2, (String)object);
        }
        return firebaseEvents;
    }

    private final Bundle preparePdpBundle(Product object, String stringArray) {
        int n3;
        int n4 = 4;
        FirebaseEvents firebaseEvents = this;
        Object object2 = object;
        String[] stringArray2 = stringArray;
        firebaseEvents = FirebaseEvents.preparePlpBundle$default(this, (Product)object, (String)stringArray, null, n4, null);
        object2 = ((Product)object).getFnlColorVariantData();
        stringArray2 = "colour";
        if (object2 != null && (object2 = ((ProductFnlColorVariantData)object2).getColor()) != null) {
            firebaseEvents.putString((String)stringArray2, (String)object2);
        }
        if ((n3 = Intrinsics.areEqual(object2 = "add_to_wishlist", stringArray)) != 0) {
            GAEcommerceEvents.addProductInfo((Product)object, (Bundle)firebaseEvents);
        }
        if ((n3 = firebaseEvents.containsKey((String)stringArray2)) == 0 && (stringArray = ((Product)object).getCode()) != null && (n3 = StringsKt.F((CharSequence)stringArray, (CharSequence)(object2 = "_"), false)) == (n4 = 1)) {
            int n7;
            if ((object = ((Product)object).getCode()) != null) {
                stringArray = new String[]{object2};
                n7 = 6;
                object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n7);
            } else {
                object = null;
            }
            if (object != null && (n3 = object.size()) == (n7 = 2)) {
                object = (String)object.get(n4);
                firebaseEvents.putString((String)stringArray2, (String)object);
            }
        }
        return firebaseEvents;
    }

    private final Bundle preparePlpBundle(Product object, String object2, SaleGAData saleGAData) {
        double d2;
        Bundle bundle = new Bundle();
        String string2 = "add_to_wishlist";
        boolean bl2 = Intrinsics.areEqual(string2, object2);
        if (bl2) {
            GAEcommerceEvents.addProductInfo((Product)object, bundle);
        }
        object2 = ((Product)object).getFnlColorVariantData();
        string2 = null;
        if (object2 != null) {
            object2 = ((ProductFnlColorVariantData)object2).getColorGroup();
        } else {
            bl2 = false;
            object2 = null;
        }
        String string3 = "item_id";
        if (object2 == null) {
            object2 = ((Product)object).getCode();
            bundle.putString(string3, (String)object2);
        } else {
            object2 = ((Product)object).getFnlColorVariantData();
            if (object2 != null) {
                object2 = ((ProductFnlColorVariantData)object2).getColorGroup();
            } else {
                bl2 = false;
                object2 = null;
            }
            bundle.putString(string3, (String)object2);
        }
        object2 = AnalyticsManager.Companion;
        string3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        Object object3 = "screenname";
        bundle.putString((String)object3, string3);
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        string3 = "screen_name";
        bundle.putString(string3, (String)object2);
        object2 = ((Product)object).getFnlColorVariantData();
        if (object2 != null) {
            object2 = ((ProductFnlColorVariantData)object2).getBrandName();
        } else {
            bl2 = false;
            object2 = null;
        }
        string3 = "brand";
        bundle.putString(string3, (String)object2);
        object2 = ((Product)object).getFnlColorVariantData();
        if (object2 != null) {
            object2 = ((ProductFnlColorVariantData)object2).getBrickName();
        } else {
            bl2 = false;
            object2 = null;
        }
        string3 = "price";
        if (object2 != null && !(bl2 = b.k((CharSequence)object2))) {
            object2 = ((Product)object).getFnlColorVariantData();
            if (object2 != null) {
                object2 = ((ProductFnlColorVariantData)object2).getBrickName();
            } else {
                bl2 = false;
                object2 = null;
            }
            object3 = "brick";
            bundle.putString((String)object3, (String)object2);
        } else {
            object2 = ((Product)object).getBrickName();
            if (object2 != null && !(bl2 = b.k((CharSequence)object2))) {
                object2 = ((Product)object).getBrickName();
                bundle.putString(string3, (String)object2);
            }
        }
        object2 = ((Product)object).getWasPriceData();
        if (object2 != null) {
            object2 = ((Price)object2).getValue();
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 == null && (object3 = ((Product)object).getVariantOptions()) != null) {
            int n3;
            object3 = ((Product)object).getVariantOptions();
            if (object3 != null) {
                n3 = object3.size();
            } else {
                n3 = 0;
                object3 = null;
            }
            if (n3 > 0) {
                object2 = ((Product)object).getVariantOptions();
                if (object2 != null && (object2 = (ProductOptionItem)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((ProductOptionItem)object2).getWasPriceData()) != null) {
                    object2 = ((Price)object2).getValue();
                } else {
                    bl2 = false;
                    object2 = null;
                }
            }
        }
        if (object2 != null) {
            d2 = Double.parseDouble((String)object2);
            String string4 = "value";
            bundle.putDouble(string4, d2);
        }
        if ((object3 = ((Product)object).getPrice()) != null && (object3 = ((Price)object3).getValue()) != null) {
            d2 = Double.parseDouble((String)object3);
            bundle.putDouble(string3, d2);
            object = ((Product)object).getPrice();
            if (object != null) {
                string2 = ((Price)object).getValue();
            }
            object = this.calculateTD((String)object2, string2);
            object2 = "TD";
            bundle.putString((String)object2, (String)object);
        }
        if (saleGAData != null) {
            object = "bbs_price_available";
            bl2 = saleGAData.isSalePriceAvailable();
            bundle.putBoolean((String)object, bl2);
            boolean bl3 = saleGAData.isSalePriceAvailable();
            if (bl3) {
                object2 = saleGAData.getProductPrice();
                bundle.putString("bbs_price", (String)object2);
                object = "bbs_td";
                object2 = saleGAData.getProductTD();
                bundle.putString((String)object, (String)object2);
            }
        }
        return bundle;
    }

    public static /* synthetic */ Bundle preparePlpBundle$default(FirebaseEvents firebaseEvents, Product product, String string2, SaleGAData saleGAData, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            saleGAData = null;
        }
        return firebaseEvents.preparePlpBundle(product, string2, saleGAData);
    }

    public static /* synthetic */ void pushProductEvent$default(FirebaseEvents firebaseEvents, String string2, Product product, int n3, SaleGAData saleGAData, int n4, Object object) {
        if ((n4 &= 8) != 0) {
            saleGAData = null;
        }
        firebaseEvents.pushProductEvent(string2, product, n3, saleGAData);
    }

    public final void imageQualityAB() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("experimentEvents");
        String string2 = null;
        String string3 = "image_quality_ab";
        boolean bl2 = StringsKt.F((CharSequence)object, string3, false);
        if (bl2) {
            object = new Bundle();
            string2 = "add_to_cart_ab";
            this.sendEvent(string2, (Bundle)object);
        }
    }

    public final void logLogoutEvent(UserInformation object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "userInformation");
        Object object2 = ((UserInformation)object).getUserId();
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            String string2 = null;
            String string3 = "@";
            n3 = (int)(StringsKt.F((CharSequence)object2, string3, false) ? 1 : 0);
            if (n3 == 0) {
                object = ((UserInformation)object).getUserStatusMessage();
                string2 = "userId:- ";
                string3 = "   loggedInStatus:- ";
                object = UX.c(string2, (String)object2, string3, (String)object);
            } else {
                object = "";
            }
        } else {
            object = ((UserInformation)object).getUserStatusMessage();
            object2 = "userId  loggedInStatus:- ";
            String string4 = "}";
            object = cP.a((String)object2, (String)object, string4);
        }
        int n4 = ((String)object).length();
        if (n4 > 0) {
            object2 = new Exception((String)object);
            object = yn3_0.a;
            ((yn3$a)object).g((Exception)object2);
        }
    }

    public final void proceedToShippingAb(int n3) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("experimentEvents");
        String string2 = null;
        String string3 = "proceed_to_shipping_ab";
        boolean bl2 = StringsKt.F((CharSequence)object, string3, false);
        if (bl2) {
            object = new Bundle();
            string2 = z40$a.a((Context)AJIOApplication$a.a()).a.b("singlePageCheckOut");
            String string4 = "firebase_experiement";
            object.putString(string4, string2);
            string2 = "item_count";
            object.putInt(string2, n3);
            this.sendEvent(string3, (Bundle)object);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void pushCartEvent(String var1_1, CartEntry var2_2, List var3_3, ArrayList var4_4) {
        var5_5 = "eventName";
        Intrinsics.checkNotNullParameter(var1_1, (String)var5_5);
        if (var2_2 == null) {
            return;
        }
        var5_5 = var2_2.getProduct();
        var6_6 = new Bundle();
        var7_7 = "add_to_wishlist";
        var8_8 = var7_7.equals(var1_1);
        if (var8_8 != 0) {
            GAEcommerceEvents.addProductInfo((Product)var5_5, var6_6);
        }
        if (var5_5 != null && (var7_7 = var5_5.getBrandName()) != null) {
            var9_9 = "brand";
            var6_6.putString(var9_9, (String)var7_7);
        }
        if (var5_5 != null && (var7_7 = var5_5.getBrickName()) != null) {
            var9_9 = "brick";
            var6_6.putString(var9_9, (String)var7_7);
        }
        var7_7 = var2_2.getQuantity();
        var10_10 = 1;
        if (var7_7 == null || (var8_8 = var7_7.intValue()) <= 0) {
            var8_8 = 1;
        }
        var6_6.putInt("quantity", var8_8);
        var2_2 = var2_2.getTotalPrice();
        var11_11 = null;
        var2_2 = var2_2 != null ? var2_2.getValue() : null;
        if (var5_5 != null && (var12_12 = var5_5.getWasPriceData()) != null) {
            var12_12 = var12_12.getValue();
        } else {
            var13_13 = 0;
            var12_12 = null;
        }
        if (var2_2 != null && var12_12 != null) {
            var14_14 = Double.parseDouble((String)var2_2);
            var16_15 = var8_8;
            var6_6.putDouble("price", var14_14 /= var16_15);
            var2_2 = String.valueOf(var14_14);
            var14_14 = Double.parseDouble((String)var12_12);
            var6_6.putDouble("value", var14_14);
            var7_7 = "TD";
            var2_2 = this.calculateTD((String)var12_12, (String)var2_2);
            var6_6.putString((String)var7_7, (String)var2_2);
        }
        var2_2 = var5_5 != null ? var5_5.getBaseProduct() : null;
        var7_7 = "colour";
        if (var2_2 == null) ** GOTO lbl-1000
        var12_12 = "_";
        var18_16 = 0;
        var19_17 = StringsKt.F((CharSequence)var2_2, (CharSequence)var12_12, false);
        if (var19_17 != 0) {
            var19_17 = 6;
            var13_13 = (var2_2 = StringsKt.a0((CharSequence)var2_2, var12_12 = new String[]{var12_12}, false, 0, var19_17)).size();
            if (var13_13 == (var18_16 = 2)) {
                var2_2 = (String)var2_2.get(var10_10);
                var6_6.putString((String)var7_7, (String)var2_2);
            }
        } else if ((var2_2 = var5_5 != null ? var5_5.getVerticalColor() : null) != null) {
            var2_2 = var5_5 != null ? var5_5.getVerticalColor() : null;
            var6_6.putString((String)var7_7, var2_2);
        }
        if (var5_5 != null && (var2_2 = var5_5.getFnlColorVariantData()) != null && (var2_2 = var2_2.getColor()) != null) {
            var6_6.putString((String)var7_7, (String)var2_2);
        }
        if (var3_3 != null) {
            var2_2 = var3_3.iterator();
            while (var20_18 = var2_2.hasNext()) {
                var3_3 = (CartAppliedVoucher)var2_2.next();
                if (var11_11 != null && !(var21_19 = b.k((CharSequence)var11_11))) {
                    var5_5 = ",";
                    var11_11.append((String)var5_5);
                } else {
                    var11_11 = var5_5 = new StringBuilder();
                }
                var3_3 = var3_3.getVoucherCode();
                var11_11.append((String)var3_3);
            }
            if (var11_11 != null) {
                var2_2 = "coupon_name";
                var3_3 = var11_11.toString();
                var6_6.putString((String)var2_2, (String)var3_3);
            }
        }
        var2_2 = AnalyticsManager.Companion;
        var3_3 = var2_2.getInstance().getGtmEvents().getScreenName();
        var5_5 = "screenname";
        var6_6.putString((String)var5_5, (String)var3_3);
        var2_2 = var2_2.getInstance().getGtmEvents().getScreenName();
        var3_3 = "screen_name";
        var6_6.putString((String)var3_3, (String)var2_2);
        var2_2 = var4_4 == null ? "N" : "Y";
        var6_6.putString("promo_applied", (String)var2_2);
        this.sendEvent(var1_1, var6_6);
    }

    public final void pushProductEvent(String string2, Product product, int n3, SaleGAData saleGAData) {
        int n4;
        Intrinsics.checkNotNullParameter(string2, "eventName");
        String string3 = "clickedProduct";
        Intrinsics.checkNotNullParameter(product, string3);
        int n7 = 1;
        product = n3 != n7 ? (n3 != (n4 = 2) ? this.prepareCartClosetBundle(product, string2) : this.preparePdpBundle(product, string2)) : this.preparePlpBundle(product, string2, saleGAData);
        this.sendEvent(string2, (Bundle)product);
    }

    public final void pushRTBApiFiredEvent(String string2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Bundle bundle = new Bundle();
        bundle.putString("screenname", string2);
        bundle.putString("screen_name", string2);
        string2 = b.n(string2, " ", "_", false);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("_RTB_API_Event");
        string2 = stringBuilder.toString();
        this.sendEvent(string2, bundle);
    }

    public final void sendEvent(String string2, Bundle bundle) {
        int n3;
        String string3;
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Object object = h40_0.a;
        if (bundle != null) {
            object = "isGA4";
            string3 = "true";
            bundle.putString((String)object, string3);
        }
        if (bundle != null) {
            object = "event_category";
            string3 = "Enhance E-commerce";
            bundle.putString((String)object, string3);
        }
        if (bundle != null) {
            object = "event_action";
            bundle.putString((String)object, string2);
        }
        if (bundle != null) {
            object = AnalyticsValues.INSTANCE.getStoreType();
            string3 = "contains_store";
            bundle.putString(string3, (String)object);
        }
        if (bundle != null) {
            object = AnalyticsValues.INSTANCE.getStoreType();
            string3 = "store_type";
            bundle.putString(string3, (String)object);
        }
        if ((object = this.appPreferences.f()) != null) {
            string3 = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n3 = 0;
            string3 = null;
        }
        if (string3 != null && (n3 = string3.length()) != 0 && bundle != null) {
            string3 = "user_type";
            bundle.putString(string3, (String)object);
        }
        this.firebaseAnalytics.logEvent(string2, bundle);
    }

    public final void sendManualAppOpenEvent() {
        String string2 = "direct";
        Bundle bundle = px1_2.b("utm_medium", string2, "utm_source", string2);
        bundle.putString("utm_campaign", string2);
        this.sendEvent("app_open", bundle);
    }

    public final void setPlatform() {
        this.firebaseAnalytics.setUserProperty("PLATFORM", "ANDROID");
        this.firebaseAnalytics.setUserProperty("version_code", "3444");
        this.firebaseAnalytics.setUserProperty("version_name", "9.20.0");
    }

    public final void updateDeviceIdTempDate(String string2) {
        Object object = "deviceId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        if (n3 > 0) {
            object = this.firebaseAnalytics;
            String string3 = "user_per_temp_id";
            ((FirebaseAnalytics)object).setUserProperty(string3, string2);
        }
    }

    public final void updateFreqHours() {
        long l2;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "notif_freq_hours";
        long l3 = ((ao0_0)object).h((String)object2);
        long l4 = l3 - (l2 = 0L);
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 > 0) {
            object = this;
            HashMap<String, Long> hashMap = this.firebaseAnalytics;
            String string2 = "Notif_freq";
            String string3 = String.valueOf(l3);
            ((FirebaseAnalytics)((Object)hashMap)).setUserProperty(string2, string3);
            hashMap = new HashMap<String, Long>();
            Object object4 = l3;
            hashMap.put((String)object2, (Long)object4);
            object2 = AnalyticsManager.Companion.getInstance().getCt();
            long l7 = 0L;
            int n3 = 65279;
            object4 = new AnalyticsData(null, null, null, l7, null, null, null, null, hashMap, null, null, null, null, null, null, null, n3, null);
            ((CleverTapEvents)object2).notiFrequentHours((AnalyticsData)object4);
        } else {
            object = this;
        }
    }

    public final void updateNotificationVariant() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "notification_variant";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = ((ao0_0)object).b((String)object2)));
        if (!bl2) {
            HashMap hashMap = p3.a("variant", (String)object);
            object2 = AnalyticsManager.Companion.getInstance().getCt();
            long l2 = 0L;
            int n3 = 65279;
            Object object3 = new AnalyticsData(null, null, null, l2, null, null, null, null, hashMap, null, null, null, null, null, null, null, n3, null);
            ((CleverTapEvents)object2).notigroup((AnalyticsData)object3);
            object2 = this;
            object3 = this.firebaseAnalytics;
            String string2 = "Notif_group";
            ((FirebaseAnalytics)object3).setUserProperty(string2, (String)object);
        } else {
            object2 = this;
        }
    }

    public final void updatePDPUserExperiment() {
        FirebaseAnalytics firebaseAnalytics = this.firebaseAnalytics;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("pdpBtnText");
        firebaseAnalytics.setUserProperty("Experiment", (String)object);
    }

    public final void updateUserHybrisId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "userHybrisId");
    }
}

