/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.analytics.utils;

import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GAUtils$Companion {
    private GAUtils$Companion() {
    }

    public /* synthetic */ GAUtils$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getGAViewItemList() {
        return "view_item_list";
    }

    public final String getGAViewItemSearchResults() {
        return "view_search_results";
    }

    public final Bundle getPDPBundleData(Product object) {
        String string2;
        Object object2 = AnalyticsManager.Companion;
        ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        Bundle bundle = new Bundle();
        String string3 = ((NewCustomEventsRevamp)object2).getPRODUCT_NAME();
        Object object3 = "";
        if (object == null || (string2 = ((Product)object).getName()) == null) {
            string2 = object3;
        }
        bundle.putString(string3, string2);
        string3 = ((NewCustomEventsRevamp)object2).getPRODUCT_ID();
        if (object == null || (string2 = ((Product)object).getCode()) == null) {
            string2 = object3;
        }
        bundle.putString(string3, string2);
        string3 = ((NewCustomEventsRevamp)object2).getPRODUCT_CATEGORY();
        if (object == null || (string2 = ((Product)object).getBrickCategory()) == null) {
            string2 = object3;
        }
        bundle.putString(string3, string2);
        string3 = ((NewCustomEventsRevamp)object2).getPRODUCT_BRICK();
        if (object == null || (string2 = ((Product)object).getBrickName()) == null) {
            string2 = object3;
        }
        bundle.putString(string3, string2);
        object2 = ((NewCustomEventsRevamp)object2).getPRODUCT_BRAND();
        if (object != null && (object = ((Product)object).getBrandName()) != null) {
            object3 = object;
        }
        bundle.putString((String)object2, (String)object3);
        return bundle;
    }
}

