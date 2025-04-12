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
import com.ril.ajio.services.data.fleek.feedModel.FnlColorVariantData;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from yP0
 */
public final class yp0_0 {
    public final NewCustomEventsRevamp a;
    public final String b;
    public final String c;
    public final c80 d;

    public yp0_0() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.a = object2;
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.b = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.c = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object = ir0_2.a;
        this.d = object = kotlinx.coroutines.d.a(em0_2.b);
    }

    public static void d(yp0_0 yp0_02, String string2, String string3, String object, String string4, int n3) {
        int n4 = n3 & 4;
        if (n4 != 0) {
            object = null;
        }
        if ((n3 &= 8) != 0) {
            string4 = null;
        }
        String string5 = "productBrand";
        Bundle bundle = dm_1.a(string2, "action", string3, string5);
        String string6 = "product_brand";
        bundle.putString(string6, string3);
        if (object != null) {
            string6 = "post_id";
            bundle.putString(string6, (String)object);
        }
        if (string4 != null) {
            object = "brand_id";
            bundle.putString((String)object, string4);
        }
        object = new bp0_1(yp0_02, string2, string3, bundle, null);
        Ae3.d(yp0_02.d, null, null, (Function2)object, 3);
    }

    public final void a(String string2, String string3) {
        Bundle bundle = dm_1.a(string2, "action", string3, "productBrand");
        String string4 = od3_2.a();
        bundle.putString("store_type", string4);
        string4 = od3_2.a();
        bundle.putString("contains_store", string4);
        yP0$a yP0$a = new yP0$a(this, string2, string3, bundle, null);
        Ae3.d(this.d, null, null, yP0$a, 3);
    }

    public final void b(String string2, String string3, String object) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Bundle bundle = dm_1.a(string3, "productBrand", (String)object, "postId");
        bundle.putString("product_brand", string3);
        bundle.putString("post_id", (String)object);
        object = new yP0$b(this, string2, string3, bundle, null);
        Ae3.d(this.d, null, null, (Function2)object, 3);
    }

    public final void c(String object) {
        Bundle bundle = new Bundle();
        int n3 = R$string.insert;
        Object[] objectArray = new Object[]{object};
        object = hv3_0.L(n3, objectArray);
        bundle.putString("plp_source", (String)object);
        bundle.putString("plp_source_details", "logo");
        object = new zp0_2(this, bundle, null);
        Ae3.d(this.d, null, null, (Function2)object, 3);
    }

    public final void e(String string2, Resource object) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Bundle bundle = new Bundle();
        Object object2 = od3_2.a();
        bundle.putString("store_type", (String)object2);
        object2 = od3_2.a();
        bundle.putString("contains_store", (String)object2);
        object2 = object != null ? ((Resource)object).getId() : null;
        String string3 = "product_id";
        bundle.putString(string3, (String)object2);
        object2 = object != null ? ((Resource)object).getName() : null;
        string3 = "product_name";
        bundle.putString(string3, (String)object2);
        object2 = object != null && (object2 = ((Resource)object).getFnlColorVariantData()) != null ? ((FnlColorVariantData)object2).getBrandName() : null;
        string3 = "product_brand";
        bundle.putString(string3, (String)object2);
        object = object != null ? ((Resource)object).getName() : null;
        bundle.putString("product_brick", (String)object);
        object = new yP0$c(this, string2, bundle, null);
        Ae3.d(this.d, null, null, (Function2)object, 3);
    }

    public final void f(Product object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Bundle bundle = new Bundle();
        Object object2 = od3_2.a();
        bundle.putString("store_type", (String)object2);
        object2 = od3_2.a();
        bundle.putString("contains_store", (String)object2);
        object2 = object != null ? ((Product)object).getCode() : null;
        String string3 = "product_id";
        bundle.putString(string3, (String)object2);
        object2 = object != null ? ((Product)object).getName() : null;
        string3 = "product_name";
        bundle.putString(string3, (String)object2);
        object2 = object != null && (object2 = ((Product)object).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object2).getBrandName() : null;
        string3 = "product_brand";
        bundle.putString(string3, (String)object2);
        object = object != null ? ((Product)object).getBrickName() : null;
        bundle.putString("product_brick", (String)object);
        object = new dp0_1(this, string2, bundle, null);
        Ae3.d(this.d, null, null, (Function2)object, 3);
    }
}

