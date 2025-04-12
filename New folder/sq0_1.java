/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from sQ0
 */
public final class sq0_1 {
    public static final sq0_1 a;
    public static final NewCustomEventsRevamp b;
    public static final NewEEcommerceEventsRevamp c;
    public static final c80 d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;

    static {
        Object object = new Object();
        a = object;
        object = AnalyticsManager.Companion;
        b = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        c = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        d = kotlinx.coroutines.d.a(em0_2.b);
        e = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        f = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        g = "Explore click";
        h = "fleek_elastic_search_interactions";
        i = "fleek search interactions";
    }

    public static void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "label");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string3 = av_0.a(analyticsManager$Companion);
        String string4 = av_0.a(analyticsManager$Companion);
        String string5 = bv_0.a(analyticsManager$Companion);
        String string6 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(b, "fleek insert interactions", "theme based", string2, "fleek_insert_interactions", string3, string4, string5, null, string6, false, null, 1536, null);
    }

    public static Bundle c(sq0_1 sq0_12, String string2, String string3, String string4, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        sq0_12.getClass();
        sq0_12 = new Bundle();
        if (string2 != null) {
            String string5 = "product_brand";
            sq0_12.putString(string5, string2);
        }
        if (string3 != null) {
            string2 = "searchTerm";
            sq0_12.putString(string2, string3);
        }
        if (string4 != null) {
            string2 = "number_results";
            sq0_12.putString(string2, string4);
        }
        return sq0_12;
    }

    public static String d(String string2) {
        boolean bl2;
        ld3_2 ld3_22;
        String string3;
        String string4;
        String string5;
        int n3;
        if (string2 == null) {
            string2 = "plp screen";
        }
        if ((n3 = (string5 = od3_2.a).length()) == 0) {
            string5 = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) != 0 || (n3 = (int)(Intrinsics.areEqual(string4 = od3_2.a(), string3 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) != 0 || (bl2 = Intrinsics.areEqual(string5, string4 = ld3_22.getStoreId()))) {
            string2 = "blp screen";
        }
        return string2;
    }

    public static String e() {
        boolean bl2;
        ld3_2 ld3_22;
        String string2;
        String string3;
        String string4 = od3_2.a;
        int n3 = string4.length();
        if (n3 == 0) {
            string4 = od3_2.a();
        }
        string4 = (n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(string4, string3 = ld3_22.getStoreId())) ? "plp screen" : "blp screen";
        return string4;
    }

    public static void f(int n3, String string2, Resource resource) {
        Intrinsics.checkNotNullParameter(string2, "itemListName");
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = c;
        String string3 = "explore brands screen";
        newEEcommerceEventsRevamp.setCurrentScreen(string3);
        newEEcommerceEventsRevamp.setCurrentScreenType(string3);
        Product product = new Product();
        string3 = null;
        List list = resource != null ? resource.getId() : null;
        product.setId((String)((Object)list));
        list = resource != null ? resource.getName() : null;
        product.setName((String)((Object)list));
        list = resource != null ? resource.getResourceUrl() : null;
        product.setUrl((String)((Object)list));
        list = resource != null ? resource.getImages() : null;
        product.setImages(list);
        list = new ProductFnlColorVariantData();
        if (resource != null) {
            string3 = resource.getId();
        }
        ((ProductFnlColorVariantData)((Object)list)).setColorGroup(string3);
        product.setFnlColorVariantData((ProductFnlColorVariantData)((Object)list));
        String string4 = newEEcommerceEventsRevamp.getEE_SELECT_ITEM();
        String string5 = sq0_1.e();
        String string6 = e;
        String string7 = f;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default(newEEcommerceEventsRevamp, product, n3, string4, string2, "NA", "explore brands screen", false, string6, string5, null, string7, null, null, false, null, null, 0L, null, null, null, null, null, 4192832, null);
    }

    public static void g(String string2, String string3) {
        Bundle bundle = new Bundle();
        int n3 = R$string.insert;
        Object[] objectArray = new Object[]{string2};
        string2 = hv3_0.L(n3, objectArray);
        bundle.putString("plp_source", string2);
        bundle.putString("plp_source_details", string3);
        vb0_0.a(AnalyticsManager.Companion, "brand screen", bundle);
    }

    public static void h(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "itemId");
        Intrinsics.checkNotNullParameter(string3, "itemName");
        Intrinsics.checkNotNullParameter(string4, "creativeName");
        Intrinsics.checkNotNullParameter(string5, "creativeSlot");
        sq0$a_0 sq0$a_0 = new sq0$a_0(string2, string3, string4, string5, null);
        Ae3.d(d, null, null, sq0$a_0, 3);
    }

    public static void i(String string2, String string3, String string4, String string5, String string6, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "bannerId");
        Intrinsics.checkNotNullParameter(string4, "bannerName");
        Intrinsics.checkNotNullParameter(string5, "creativeName");
        Intrinsics.checkNotNullParameter(string6, "creativeSlot");
        sq0$b_0 sq0$b_0 = new sq0$b_0(string2, string3, string4, string5, string6, bl2, null);
        Ae3.d(d, null, null, sq0$b_0, 3);
    }

    public final void a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "label");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string4 = av_0.a(analyticsManager$Companion);
        String string5 = av_0.a(analyticsManager$Companion);
        String string6 = bv_0.a(analyticsManager$Companion);
        Bundle bundle = sq0_1.c(this, string3, null, null, 6);
        String string7 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(b, "fleek insert interactions", "view all brands click", string2, "fleek_insert_interactions", string4, string5, string6, bundle, string7, false, null, 1536, null);
    }
}

