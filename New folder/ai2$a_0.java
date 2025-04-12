/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ai2$a
 */
public final class ai2$a_0
implements OnGAEventHandlerListener {
    public final /* synthetic */ ai2_2 a;

    public ai2$a_0(ai2_2 ai2_22) {
        this.a = ai2_22;
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

    public final void pushEEProductImpression(List list, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        Intrinsics.checkNotNullParameter(list, "productList");
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "listName");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreenType");
        Object object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        String string15 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
        object2 = this;
        Object object3 = this.a;
        object3.getClass();
        Bundle bundle = new Bundle();
        object3 = ((ai2_2)object3).b.x5();
        String string16 = null;
        Object object4 = object3 != null ? ((Product)object3).getCode() : null;
        String string17 = "product_id";
        bundle.putString(string17, (String)object4);
        object4 = object3 != null ? ((Product)object3).getName() : null;
        string17 = "product_name";
        bundle.putString(string17, (String)object4);
        object4 = object3 != null && (object4 = ((Product)object3).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object4).getBrandName() : null;
        string17 = "product_brand";
        bundle.putString(string17, (String)object4);
        object4 = object3 != null ? ((Product)object3).getBrickName() : null;
        string17 = "product_brick";
        bundle.putString(string17, (String)object4);
        object4 = object3 != null ? ((Product)object3).getBrickCategory() : null;
        string17 = "product_category";
        bundle.putString(string17, (String)object4);
        if (object3 != null) {
            string16 = ((Product)object3).getVerticalColor();
        }
        bundle.putString("product_vertical", string16);
        object3 = string4;
        NewEEcommerceEventsRevamp.pushEEProductImpression$default((NewEEcommerceEventsRevamp)object, list, string15, string3, string4, string5, bl2, string6, string7, string8, null, null, null, false, null, null, 0L, null, null, null, null, bundle, null, false, 7339520, null);
    }
}

