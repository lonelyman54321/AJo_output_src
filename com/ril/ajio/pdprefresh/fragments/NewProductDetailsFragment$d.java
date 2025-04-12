/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.pdprefresh.fragments;

import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class NewProductDetailsFragment$d
implements OnGAEventHandlerListener {
    public final /* synthetic */ NewProductDetailsFragment a;

    public NewProductDetailsFragment$d(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void pushEEBannerImpression(String string2, HashMap hashMap, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(hashMap, "urlList");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "previousScreen");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        Intrinsics.checkNotNullParameter(string7, "pageType");
        NewEEcommerceEventsRevamp.pushEEBannerImpression$default(AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp(), string2, hashMap, string3, string4, string5, string6, string7, bl2, bl3, null, 512, null);
    }

    public final void pushEEFleekImpressions(List list, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(list, "impressionList");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
        AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().pushEEFleekImpression(list, string2, string3, string4, string5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void pushEEProductImpression(List list, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        Intrinsics.checkNotNullParameter(list, "productList");
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "listName");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreenType");
        Object object2 = this.a;
        object = ((NewProductDetailsFragment)object2).Y6();
        boolean bl3 = Intrinsics.areEqual(string3, object);
        if (bl3) {
            bl3 = true;
            object2 = ((NewProductDetailsFragment)object2).bb(bl3);
        } else {
            object2 = null;
        }
        NewProductDetailsFragment newProductDetailsFragment = object2;
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
        NewEEcommerceEventsRevamp.pushEEProductImpression$default((NewEEcommerceEventsRevamp)object2, list, (String)object, string3, string4, string5, bl2, string6, string7, string8, null, null, null, false, null, null, 0L, null, null, null, null, (Bundle)newProductDetailsFragment, null, false, 7339520, null);
    }
}

