/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
package com.ril.ajio.cart.cartlist.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import java.util.HashMap;

public final class CMSBannerAdViewHolder$setDynamicAdView$1
extends JioAdListener {
    public final /* synthetic */ yg_1 a;

    public CMSBannerAdViewHolder$setDynamicAdView$1(yg_1 yg_12) {
        this.a = yg_12;
    }

    public final void onAdFailedToLoad(JioAdView object, JioAdError jioAdError) {
        int n3;
        object = this.a;
        jioAdError = ((yg_1)object).g;
        if (jioAdError != null && (n3 = jioAdError.getChildCount()) == 0) {
            object = ((yg_1)object).g;
            ai0_2.i((View)object);
        }
    }

    public final void onAdPrepared(JioAdView jioAdView) {
        Object object;
        int n3;
        Object object2 = this.a;
        Object object3 = ((yg_1)object2).g;
        if (object3 != null) {
            n3 = object3.getChildCount();
        } else {
            n3 = 0;
            object3 = null;
        }
        if (n3 > 0 && (object3 = ((yg_1)object2).g) != null) {
            object3.removeAllViews();
        }
        if ((object3 = ((yg_1)object2).g) != null) {
            ai0_2.B((View)object3);
        }
        if (jioAdView != null) {
            object3 = jioAdView.getAdView();
        } else {
            n3 = 0;
            object3 = null;
        }
        if (object3 != null) {
            int n4 = -2;
            object = new FrameLayout.LayoutParams(n4, n4);
            object.gravity = n4 = 17;
            object3.setLayoutParams((ViewGroup.LayoutParams)object);
        }
        if ((object = ((yg_1)object2).g) != null) {
            object.addView((View)object3);
        }
        if (jioAdView != null) {
            jioAdView.loadAd();
        }
        object2.getClass();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("null|null|1-1|jioads_exchange_demand|AD|miscSdk", "null");
        object3 = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp();
        object = "";
        String string2 = ((yg_1)object2).m;
        Object object4 = string2 == null ? object : string2;
        object2 = ((yg_1)object2).n;
        Object object5 = object2 == null ? object : object2;
        String string3 = bv_0.a((AnalyticsManager$Companion)object3);
        String string4 = cv_0.a((AnalyticsManager$Companion)object3);
        String string5 = av_0.a((AnalyticsManager$Companion)object3);
        NewEEcommerceEventsRevamp.pushEEBannerImpression$default(newEEcommerceEventsRevamp, null, hashMap, (String)object4, string3, (String)object5, string4, string5, false, true, null, 513, null);
    }

    public final void onAdRender(JioAdView jioAdView) {
    }
}

