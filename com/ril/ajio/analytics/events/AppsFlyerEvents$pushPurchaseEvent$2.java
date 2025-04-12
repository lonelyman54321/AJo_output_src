/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.ril.ajio.analytics.events.AppsFlyerEvents;
import com.ril.ajio.analytics.events.enum.AppsFlyerEventsItem;
import kotlin.jvm.internal.Intrinsics;

public final class AppsFlyerEvents$pushPurchaseEvent$2
implements AppsFlyerRequestListener {
    final /* synthetic */ AppsFlyerEventsItem $appsFlyerEventItem;
    final /* synthetic */ boolean $isNewUser;
    final /* synthetic */ String $luxeEventName;

    public AppsFlyerEvents$pushPurchaseEvent$2(String string2, AppsFlyerEventsItem appsFlyerEventsItem, boolean bl2) {
        this.$luxeEventName = string2;
        this.$appsFlyerEventItem = appsFlyerEventsItem;
        this.$isNewUser = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onError(int n3, String string2) {
        String string3 = "errorDescription";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = this.$isNewUser;
        string3 = bl2 ? "first_purchase_luxe_fail" : "af_purchase_luxe_fail";
        String string4 = string3;
        AppsFlyerEvents appsFlyerEvents = AppsFlyerEvents.INSTANCE;
        string3 = this.$appsFlyerEventItem.getLuxeTotalRevenue();
        String string5 = "";
        String string6 = string3 == null ? string5 : string3;
        string3 = this.$appsFlyerEventItem.getOrderId();
        String string7 = string3 == null ? string5 : string3;
        string3 = this.$appsFlyerEventItem.getLuxeProductIds();
        String string8 = string3 == null ? string5 : string3;
        String string9 = String.valueOf(n3);
        AppsFlyerEvents.access$sendAppsflyerGaDebugLogs(appsFlyerEvents, "af_debug", "af_callbacks", string4, string6, string7, string8, string9, string2);
    }

    public void onSuccess() {
        AppsFlyerEvents appsFlyerEvents = AppsFlyerEvents.INSTANCE;
        String string2 = this.$luxeEventName;
        String string3 = this.$appsFlyerEventItem.getLuxeTotalRevenue();
        String string4 = "";
        String string5 = string3 == null ? string4 : string3;
        string3 = this.$appsFlyerEventItem.getOrderId();
        String string6 = string3 == null ? string4 : string3;
        string3 = this.$appsFlyerEventItem.getLuxeProductIds();
        String string7 = string3 == null ? string4 : string3;
        AppsFlyerEvents.sendAppsflyerGaDebugLogs$default(appsFlyerEvents, "af_debug", "af_callbacks", string2, string5, string6, string7, null, null, 192, null);
    }
}

