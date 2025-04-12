/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.analytics.events;

import android.os.Bundle;
import com.google.android.gms.analytics.Tracker;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class GoogleAnalyticsEvents {
    public static final int $stable = 8;
    private final rq1_2 userInformation$delegate;

    public GoogleAnalyticsEvents() {
        Object object = new k00(1);
        this.userInformation$delegate = object = yr1_2.b((Function0)object);
    }

    public static /* synthetic */ UserInformation a() {
        return GoogleAnalyticsEvents.userInformation_delegate$lambda$0();
    }

    private final Tracker getGoogleTracker() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object, "context");
        ZX0 zX0 = ZX0.b;
        if (zX0 == null) {
            ZX0.b = zX0 = new ZX0((AJIOApplication)object);
        }
        object = ZX0.b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ajio.ril.core.analytics.GATracker");
        return ((ZX0)object).a;
    }

    private static final UserInformation userInformation_delegate$lambda$0() {
        return VX0.a(AJIOApplication.Companion);
    }

    public final void addedToCart(AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(analyticsData, "data");
        Object object = analyticsData.getBundle();
        long l2 = analyticsData.getValue();
        object.putLong("event_value", l2);
        object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        String string2 = analyticsData.getLabel();
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        gTMEvents.pushAddToCart("Added to Cart", string2, (String)object, analyticsData);
    }

    public final UserInformation getUserInformation() {
        Object object = this.userInformation$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void productPurchase(AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(analyticsData, "data");
        Object object = analyticsData.getBundle();
        long l2 = analyticsData.getValue();
        object.putLong("event_value", l2);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = analyticsData.getLabel();
        ((GTMEvents)object).pushProductPurchase("Product Purchase", string2, "order confirmation screen", analyticsData);
    }

    public final void productSearch(AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(analyticsData, "data");
        Object object = analyticsData.getBundle();
        long l2 = analyticsData.getValue();
        object.putLong("event_value", l2);
        object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        String string2 = analyticsData.getLabel();
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        gTMEvents.pushProductSearch("Product Search", string2, (String)object, analyticsData);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushCartCustomDimension(Cart object) {
        Exception exception2;
        Object object2;
        block8: {
            int n3;
            float f5;
            if (object == null) return;
            float f6 = ((Cart)object).getBagTotal();
            boolean bl2 = false;
            Object object3 = null;
            float f7 = f6 - 0.0f;
            Object object4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object4 == false) {
                return;
            }
            object2 = this.getGoogleTracker();
            if (object2 == null) {
                return;
            }
            try {
                object2 = ((Cart)object).getTotalPriceWithTax();
                object2 = ((Price)object2).getValue();
                if (object2 != null) {
                    f6 = Float.parseFloat((String)object2);
                } else {
                    object4 = false;
                    f6 = 0.0f;
                    object2 = null;
                }
                f5 = ((Cart)object).getBagTotal() - f6;
                n3 = 500;
            }
            catch (Exception exception2) {}
            float f8 = n3;
            float f11 = f6 % f8;
            float f12 = f11 - 0.0f;
            bl2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (bl2) {
                f6 = f6 + f8 - f11;
            }
            object3 = new Bundle();
            String string2 = "Item_count";
            int n4 = ((Cart)object).getTotalUnitCount();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n4);
            Object object5 = stringBuilder.toString();
            object3.putString(string2, (String)object5);
            string2 = "CouponAppliedstatus";
            object = ((Cart)object).getAppliedVouchers();
            object = object == null ? "No" : "Yes";
            break block8;
            object3.putString(string2, (String)object);
            object = "Item_count_CM";
            n3 = 1;
            f8 = Float.MIN_VALUE;
            object3.putInt((String)object, n3);
            object = "discount_bucket";
            object3.putFloat((String)object, f5);
            object = "final_amount";
            object3.putFloat((String)object, f6);
            object = AnalyticsManager.Companion;
            object = ((AnalyticsManager$Companion)object).getInstance();
            object = ((AnalyticsManager)object).getGtmEvents();
            object2 = "Item count";
            String string3 = "";
            string2 = "bag screen";
            object5 = new AnalyticsData$Builder();
            object3 = ((AnalyticsData$Builder)object5).bundle((Bundle)object3);
            object3 = ((AnalyticsData$Builder)object3).build();
            ((GTMEvents)object).pushItemCount((String)object2, string3, string2, (AnalyticsData)object3);
            return;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).j(exception2);
    }

    public final void pushOOSCustomDimension(Product object, String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string3, "name");
        Intrinsics.checkNotNullParameter(string4, "action");
        Intrinsics.checkNotNullParameter(string5, "label");
        String string7 = "screenName";
        Intrinsics.checkNotNullParameter(string6, string7);
        if (object == null) {
            return;
        }
        string7 = new Bundle();
        GAEcommerceEvents.addProductInfo((Product)object, (Bundle)string7);
        String string8 = ((Product)object).getName();
        string7.putString("productName", string8);
        string8 = ((Product)object).getCode();
        string7.putString("outofstock", string8);
        object = ((Product)object).getCode();
        string7.putString("product_id", (String)object);
        string7.putString("out_of_stock_sizes", string2);
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        AnalyticsData analyticsData = ne_0.b((Bundle)string7);
        string8 = string3;
        gTMEvents.pushEvent(string3, string4, string5, string6, analyticsData);
    }

    public final void setTrackerScreenName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        km_1.a(AnalyticsManager.Companion, string2);
    }

    public final void trackBannerImpressionEvent(String string2, String string3) {
    }

    public final void trackCMSLandingPageCustomDimension(String string2) {
    }

    public final void trackCustomDimension(String string2, String string3, String string4, String string5) {
        Bundle bundle = new Bundle();
        Object object = this.getUserInformation().getUserStatusMessage();
        bundle.putString("Logged In Status", (String)object);
        bundle.putString("outofstock", string2);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        AnalyticsData analyticsData = ne_0.b(bundle);
        ((GTMEvents)object).pushEvent(string3, string4, "", string5, analyticsData);
    }

    public final void trackLandingPageCustomDimension(String string2) {
    }
}

