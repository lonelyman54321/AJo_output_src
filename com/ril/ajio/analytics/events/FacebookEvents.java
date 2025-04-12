/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.g;
import com.google.gson.Gson;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.events.FacebookSDKHelper;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import com.ril.ajio.services.utils.JsonUtils;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class FacebookEvents {
    public static final int $stable;
    private final String BRAND;
    private final String CATALOG_ID;
    private final String PAYMENT_MODE;

    public FacebookEvents() {
        this.PAYMENT_MODE = "payment_mode";
        this.CATALOG_ID = "catalog_id";
        this.BRAND = "Brand";
    }

    public final void addToCart(AnalyticsData object) {
        boolean bl2;
        Object object2;
        float f5;
        Intrinsics.checkNotNullParameter(object, "data");
        Bundle bundle = new Bundle();
        String string2 = ((AnalyticsData)object).getPrice();
        try {
            f5 = Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(numberFormatException);
            bl2 = false;
            f5 = 0.0f;
            string2 = null;
        }
        bundle.putString("fb_currency", "INR");
        bundle.putString("fb_content_type", "product");
        String string3 = ((AnalyticsData)object).getProductCode();
        bundle.putString("fb_content_id", string3);
        object2 = JsonUtils.toJson(((AnalyticsData)object).getFbEventContentData());
        string3 = "fb_content";
        bundle.putString(string3, (String)object2);
        object2 = "_valueToSum";
        bundle.putFloat((String)object2, f5);
        string2 = ((AnalyticsData)object).getCatalogId();
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = this.CATALOG_ID;
            object2 = ((AnalyticsData)object).getCatalogId();
            bundle.putString(string2, (String)object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((AnalyticsData)object).getBrand())))) {
            string2 = this.BRAND;
            object = ((AnalyticsData)object).getBrand();
            bundle.putString(string2, (String)object);
        }
        FacebookSDKHelper.INSTANCE.getFBLogger().a.e("fb_mobile_add_to_cart", bundle);
    }

    public final void addToWishlistEvent(AnalyticsData object) {
        boolean bl2;
        Object object2;
        float f5;
        Intrinsics.checkNotNullParameter(object, "data");
        Bundle bundle = new Bundle();
        String string2 = ((AnalyticsData)object).getPrice();
        try {
            f5 = Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(numberFormatException);
            bl2 = false;
            f5 = 0.0f;
            string2 = null;
        }
        bundle.putString("fb_currency", "INR");
        bundle.putString("fb_content_type", "product");
        String string3 = ((AnalyticsData)object).getProductCode();
        bundle.putString("fb_content_id", string3);
        object2 = JsonUtils.toJson(((AnalyticsData)object).getFbEventContentData());
        string3 = "fb_content";
        bundle.putString(string3, (String)object2);
        object2 = "_valueToSum";
        bundle.putFloat((String)object2, f5);
        string2 = ((AnalyticsData)object).getCatalogId();
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = this.CATALOG_ID;
            object2 = ((AnalyticsData)object).getCatalogId();
            bundle.putString(string2, (String)object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((AnalyticsData)object).getBrand())))) {
            string2 = this.BRAND;
            object = ((AnalyticsData)object).getBrand();
            bundle.putString(string2, (String)object);
        }
        FacebookSDKHelper.INSTANCE.getFBLogger().a.e("fb_mobile_add_to_wishlist", bundle);
    }

    public final void completeRegistrationEvent(String string2) {
        string2 = E1.a("fb_registration_method", string2);
        FacebookSDKHelper.INSTANCE.getFBLogger().a.e("fb_mobile_complete_registration", (Bundle)string2);
    }

    public final void contentView(AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(analyticsData, "data");
        Bundle bundle = new Bundle();
        bundle.putString("fb_currency", "INR");
        String string2 = "product";
        bundle.putString("fb_content_type", string2);
        Object object = analyticsData.getCatalogId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = this.CATALOG_ID;
            string2 = analyticsData.getCatalogId();
            bundle.putString((String)object, string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = analyticsData.getBrand())))) {
            object = this.BRAND;
            string2 = analyticsData.getBrand();
            bundle.putString((String)object, string2);
        }
        string2 = analyticsData.getProductCode();
        bundle.putString("fb_content_id", string2);
        object = FacebookSDKHelper.INSTANCE.getFBLogger();
        double d2 = Double.parseDouble(analyticsData.getPrice());
        ((AppEventsLogger)object).a.d("fb_mobile_content_view", d2, bundle);
    }

    public final void initiateCheckoutEvent(AnalyticsData object) {
        double d2;
        Intrinsics.checkNotNullParameter(object, "data");
        Bundle bundle = new Bundle();
        Object object2 = new Gson();
        List list = ((AnalyticsData)object).getLuxeDetails();
        Object object3 = null;
        list = list != null ? ((LuxeDetails)((Object)list)).getLuxeProductDetails() : null;
        object2 = ((Gson)object2).toJson(list);
        Intrinsics.checkNotNull(object2);
        object2 = b.n((String)object2, "sku", "id", false);
        String string2 = "item_price";
        object2 = b.n((String)object2, "price", string2, false);
        bundle.putString("fb_content", (String)object2);
        list = "product";
        bundle.putString("fb_content_type", (String)((Object)list));
        object2 = ((AnalyticsData)object).getLuxeDetails();
        if (object2 != null && (object2 = ((LuxeDetails)object2).getTotalQuantity()) != null) {
            int n3 = ((Number)object2).intValue();
            list = "fb_num_items";
            bundle.putInt((String)((Object)list), n3);
        }
        list = ((AnalyticsData)object).getPaymentMode();
        bundle.putString("fb_payment_info_available", (String)((Object)list));
        object2 = "fb_currency";
        list = "INR";
        bundle.putString((String)object2, (String)((Object)list));
        object = ((AnalyticsData)object).getLuxeDetails();
        if (object != null && (object = ((LuxeDetails)object).getTotalPrice()) != null) {
            float f5 = ((Float)object).floatValue();
            d2 = f5;
            object3 = d2;
        }
        if (object3 != null) {
            d2 = ((Number)object3).doubleValue();
            object = FacebookSDKHelper.INSTANCE.getFBLogger().a;
            object3 = "fb_mobile_initiated_checkout";
            ((g)object).d((String)object3, d2, bundle);
        }
    }

    public final void logPurchase(AnalyticsData object) {
        block8: {
            Intrinsics.checkNotNullParameter(object, "data");
            Bundle bundle = new Bundle();
            Class<g> clazz = ((AnalyticsData)object).getProductCode();
            Object object2 = "fb_content_id";
            bundle.putString((String)object2, (String)((Object)clazz));
            clazz = ((AnalyticsData)object).getBrand();
            boolean bl2 = TextUtils.isEmpty((CharSequence)((Object)clazz));
            if (!bl2) {
                clazz = this.BRAND;
                object2 = ((AnalyticsData)object).getBrand();
                bundle.putString((String)((Object)clazz), (String)object2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)((Object)(clazz = ((AnalyticsData)object).getCatalogId()))))) {
                clazz = this.CATALOG_ID;
                object2 = ((AnalyticsData)object).getCatalogId();
                bundle.putString((String)((Object)clazz), (String)object2);
            }
            object2 = "INR";
            bundle.putString("fb_currency", (String)object2);
            bundle.putString("fb_content_type", "product");
            clazz = JsonUtils.toJson(((AnalyticsData)object).getFbEventContentData());
            bundle.putString("fb_content", (String)((Object)clazz));
            clazz = this.PAYMENT_MODE;
            Object object3 = ((AnalyticsData)object).getPaymentMode();
            bundle.putString((String)((Object)clazz), (String)object3);
            clazz = FacebookSDKHelper.INSTANCE.getFBLogger();
            double d2 = Double.parseDouble(((AnalyticsData)object).getPrice());
            object3 = BigDecimal.valueOf(d2);
            Currency currency = Currency.getInstance((String)object2);
            object = ((AppEventsLogger)((Object)clazz)).a;
            object.getClass();
            bl2 = td0.b(object);
            if (!bl2) {
                clazz = g.class;
                boolean bl3 = td0.b(clazz);
                if (bl3) break block8;
                object2 = object;
                try {
                    ((g)object).i((BigDecimal)object3, currency, bundle, false, null);
                }
                catch (Throwable throwable) {
                    try {
                        td0.a(clazz, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(object, throwable2);
                    }
                }
            }
        }
    }

    public final void productSearch(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        Bundle bundle = new Bundle();
        object = ((AnalyticsData)object).getSearchString();
        bundle.putString("fb_search_string", (String)object);
        FacebookSDKHelper.INSTANCE.getFBLogger().a.e("fb_mobile_search", bundle);
    }
}

