/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class vV2$d
implements OnGAEventHandlerListener {
    public final void pushEEBannerImpression(String string2, HashMap hashMap, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(hashMap, "urlList");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "previousScreen");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        Intrinsics.checkNotNullParameter(string7, "pageType");
        NewEEcommerceEventsRevamp.pushEEBannerImpression$default(AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp(), string2, hashMap, string3, string4, string5, string6, string7, bl2, false, null, 768, null);
    }

    public final void pushEEFleekImpressions(List list, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(list, "impressionList");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
    }

    public final void pushEEProductImpression(List list, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        String string15;
        boolean bl3;
        Object object = list;
        Intrinsics.checkNotNullParameter(list, "productList");
        Object object2 = string2;
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "listName");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreenType");
        object = list;
        HashSet<String> hashSet = new HashSet<String>();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl3 = object.hasNext()) {
            object2 = object.next();
            string15 = object2;
            string15 = ((Product)object2).getCode();
            boolean bl4 = hashSet.add(string15);
            if (!bl4) continue;
            arrayList.add(object2);
        }
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        string15 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
        NewEEcommerceEventsRevamp.pushEEProductImpression$default((NewEEcommerceEventsRevamp)object2, arrayList, string15, string3, string4, string5, bl2, string6, string7, string8, null, null, null, false, null, null, 0L, null, null, null, null, null, null, false, 8388096, null);
    }
}

