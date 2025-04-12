/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.ril.ajio.analytics.utils;

import android.content.Context;
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;

public final class PriorityDeliveryGaUtils {
    public static final int $stable = 0;
    public static final String ACTION_ADDRESS_LOADED = "address loaded";
    public static final String ACTION_CHANGE_ADDRESS = "change address";
    public static final String ACTION_ENTER_LOCATION = "enter location";
    public static final String ACTION_PINCODE_CHECK_CTA = "pincode check cta";
    public static final String CATEGORY_ADDRESS_INTERACTION = "address interaction";
    public static final String DEFAULT_ADDRESS_DIMENSION = "default_address";
    public static final String EVENT_ADDRESS_LOADED = "address_loaded";
    public static final String EVENT_CHANGE_ADDRESS = "change_address";
    public static final String EVENT_CHECK_ADDRESS = "check_address";
    public static final PriorityDeliveryGaUtils INSTANCE;
    private static final NewCustomEventsRevamp newCustomEventsRevamp;
    private static final NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;

    static {
        Object object = new PriorityDeliveryGaUtils();
        INSTANCE = object;
        object = AnalyticsManager.Companion;
        newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        $stable = 8;
    }

    private PriorityDeliveryGaUtils() {
    }

    public final void pushAddressDropDownClickedEvent(String string2, String string3, int n3) {
        Bundle bundle = dm_1.a(string2, "label", string3, "screenName");
        String string4 = String.valueOf(n3);
        bundle.putString(DEFAULT_ADDRESS_DIMENSION, string4);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, CATEGORY_ADDRESS_INTERACTION, ACTION_CHANGE_ADDRESS, string2, EVENT_CHANGE_ADDRESS, string3, string3, string3, bundle, string3, false, null, 1536, null);
    }

    public final void pushCheckCTAClickedEvent(String string2, String string3) {
        Bundle bundle = dm_1.a(string2, "label", string3, "screenName");
        bundle.putString(DEFAULT_ADDRESS_DIMENSION, "0");
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, CATEGORY_ADDRESS_INTERACTION, ACTION_PINCODE_CHECK_CTA, string2, EVENT_CHECK_ADDRESS, string3, string3, string3, bundle, string3, false, null, 1536, null);
    }

    public final void pushEnterLocationCTAClickedEvent(String string2, String string3) {
        Bundle bundle = dm_1.a(string2, "label", string3, "screenName");
        bundle.putString(DEFAULT_ADDRESS_DIMENSION, "0");
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, CATEGORY_ADDRESS_INTERACTION, ACTION_ENTER_LOCATION, string2, EVENT_CHECK_ADDRESS, string3, string3, string3, bundle, string3, false, null, 1536, null);
    }

    public final void pushEnterPinCodeCTAClickedEvent(String string2, String string3) {
        int n3;
        Bundle bundle = dm_1.a(string2, "label", string3, "screenName");
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new jo_2((Context)aJIOApplication);
        object = ((jo_2)object).l();
        if (object != null) {
            object = ((CartDeliveryAddress)object).getFormattedAddress();
        } else {
            n3 = 0;
            object = null;
        }
        object = object != null && (n3 = ((String)object).length()) != 0 ? "1" : "0";
        bundle.putString(DEFAULT_ADDRESS_DIMENSION, (String)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, CATEGORY_ADDRESS_INTERACTION, ACTION_PINCODE_CHECK_CTA, string2, EVENT_CHECK_ADDRESS, string3, string3, string3, bundle, string3, false, null, 1536, null);
    }
}

