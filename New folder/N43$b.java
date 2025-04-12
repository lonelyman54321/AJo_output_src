/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class N43$b
implements OnGAEventHandlerListener {
    public final void pushEEBannerImpression(String string2, HashMap hashMap, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(hashMap, "urlList");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "previousScreen");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        Intrinsics.checkNotNullParameter(string7, "pageType");
        AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().pushEEBannerImpression(string2, hashMap, string3, string4, string5, string6, string7, bl2, bl3, string8);
    }

    public final void pushEEFleekImpressions(List list, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(list, "impressionList");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
    }

    public final void pushEEProductImpression(List list, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        Object object = list;
        Intrinsics.checkNotNullParameter(list, "productList");
        object = string2;
        Intrinsics.checkNotNullParameter(string2, "eventName");
        object = string3;
        Intrinsics.checkNotNullParameter(string3, "listName");
        object = string5;
        Intrinsics.checkNotNullParameter(string5, "screenName");
        object = string6;
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        object = string7;
        Intrinsics.checkNotNullParameter(string7, "screenType");
        object = string8;
        Intrinsics.checkNotNullParameter(string8, "previousScreenType");
        object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
        NewEEcommerceEventsRevamp.pushEEProductImpression$default(newEEcommerceEventsRevamp, list, (String)object, string3, string4, string5, false, string6, string7, string8, string9, string10, string11, false, null, null, 0L, null, string12, null, null, null, null, false, 8253440, null);
    }
}

