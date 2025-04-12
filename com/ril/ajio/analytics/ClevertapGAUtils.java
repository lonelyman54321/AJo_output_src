/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.analytics;

import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class ClevertapGAUtils {
    public static final int $stable = 0;
    private static final String ACTION = "action";
    private static final String ADDITIONAL_METADATA = "additionalMetaData";
    private static final String CAMPAIGN_ID = "campaignId";
    private static final String CAMPAIGN_NAME = "campaignName";
    private static final String CLEVERTAP_WIDGET_INTERACTIONS = "clevertap widget interactions";
    private static final String CTA_NAME;
    public static final ClevertapGAUtils INSTANCE;
    private static final String URL = "url";
    private static final String WIDGET_CLICK = "widget click in app pop up";
    private static final String WIDGET_INTERACTIONS = "widget_interactions";
    private static final String previousScreen;
    private static final String previousScreenType;

    static {
        Object object = new ClevertapGAUtils();
        INSTANCE = object;
        CTA_NAME = "ctaName";
        object = AnalyticsManager.Companion;
        previousScreen = bv_0.a((AnalyticsManager$Companion)object);
        previousScreenType = cv_0.a((AnalyticsManager$Companion)object);
    }

    private ClevertapGAUtils() {
    }

    private final Bundle getBundle(String string2, String string3) {
        Bundle bundle = new Bundle();
        if (string2 != null) {
            String string4 = ADDITIONAL_METADATA;
            bundle.putString(string4, string2);
        }
        if (string3 != null) {
            string2 = ACTION;
            bundle.putString(string2, string3);
        }
        return bundle;
    }

    public static final void pushQueryParamsToGA(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        Object object3 = bundle.get("ctaName");
        Object object4 = bundle.get(CAMPAIGN_ID);
        Object object5 = bundle.get(CAMPAIGN_NAME);
        CharSequence charSequence = new StringBuilder();
        charSequence.append(object3);
        object3 = " - ";
        charSequence.append((String)object3);
        charSequence.append(object4);
        charSequence.append((String)object3);
        charSequence.append(object5);
        object4 = charSequence.toString();
        charSequence = av_0.a((AnalyticsManager$Companion)object);
        String string2 = av_0.a((AnalyticsManager$Companion)object);
        String string3 = previousScreen;
        String string4 = previousScreenType;
        object = object2;
        object2 = CLEVERTAP_WIDGET_INTERACTIONS;
        object3 = WIDGET_CLICK;
        object5 = WIDGET_INTERACTIONS;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, (String)object3, (String)object4, (String)object5, (String)charSequence, string2, string3, bundle, string4, false, null, 1536, null);
    }

    public final void pushInAppPopUpCTAClick(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        Object object = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        String string9 = " - ";
        String string10 = string5;
        string10 = KW.a(string2, string9, string4, string9, string5);
        String string11 = av_0.a((AnalyticsManager$Companion)object);
        String string12 = av_0.a((AnalyticsManager$Companion)object);
        String string13 = previousScreen;
        object = this;
        string9 = string7;
        Bundle bundle = this.getBundle(string7, string8);
        String string14 = previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, CLEVERTAP_WIDGET_INTERACTIONS, WIDGET_CLICK, string10, WIDGET_INTERACTIONS, string11, string12, string13, bundle, string14, false, null, 1536, null);
    }
}

