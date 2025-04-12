/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.affise.attribution.Affise;
import com.affise.attribution.settings.AffiseSettings;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.user.AffiliateData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.d;

/*
 * Renamed from p5
 */
public final class p5_0 {
    public static final p5_0 a;
    public static final c80 b;
    public static final jo_2 c;
    public static final ArrayList d;
    public static String e;
    public static final NewCustomEventsRevamp f;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList = ir0_2.a;
        b = kotlinx.coroutines.d.a(em0_2.b);
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        arrayList = new ArrayList((Context)aJIOApplication);
        c = arrayList;
        d = arrayList = new ArrayList();
        e = "";
        f = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public static final void a(p5_0 object) {
        object.getClass();
        boolean bl2 = Affise.isInitialized();
        if (!bl2) {
            object = h40_0.a;
            bl2 = h40_0.N0();
            if (bl2) {
                object = "qaregression";
                Object object2 = "prod";
                String string2 = "qa";
                String string3 = object2 != string2 && object2 != object ? "367" : "363";
                object = object2 != string2 && object2 != object ? "9aa02299-6186-401e-8192-417200538455" : "521bdd7c-67a9-4f01-9c55-a85eaeb002c8";
                object = Affise.settings(string3, (String)object);
                AJIOApplication.Companion.getClass();
                object2 = AJIOApplication$a.a();
                ((AffiseSettings)object).start((Context)object2);
            }
        }
    }

    public static final double b(p5_0 object, CartEntry cartEntry) {
        object.getClass();
        object = cartEntry.getTotalPrice().getValue();
        double d2 = object != null ? Double.parseDouble((String)object) : 0.0;
        object = cartEntry.getOrderTotalQuantity();
        int n3 = object != null ? (Integer)object : 1;
        double d5 = n3;
        return d2 / d5;
    }

    public static final boolean c(p5_0 object, CartEntry cartEntry) {
        double d2;
        double d5;
        double d7;
        double d9;
        int n3;
        object.getClass();
        object = cartEntry.getVoucherPromoAmt();
        boolean bl2 = false;
        cartEntry = null;
        if (object != null && (n3 = ((String)object).length()) != 0 && (object = je3_2.d((String)object)) != null && (d9 = (d7 = (d5 = ((Number)object).doubleValue()) - (d2 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) > 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static final void d(p5_0 p5_02, String string2, String string3, String string4, String string5, String string6, Bundle bundle) {
        p5_02.getClass();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string7 = bv_0.a(analyticsManager$Companion);
        String string8 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(f, string3, string4, string5, string2, string6, string6, string7, bundle, string8, false, null, 1536, null);
    }

    public static void e(CartEntry cartEntry, CartOrder object, int n3) {
        boolean bl2;
        AffiliateData affiliateData;
        Object object2;
        boolean bl3 = h40_0.a.N0();
        if (!bl3) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        bl3 = false;
        if (object != null) {
            object2 = ((CartOrder)object).affiliateData;
            affiliateData = object2;
        } else {
            affiliateData = null;
        }
        if (affiliateData != null) {
            object2 = affiliateData.getUtmMedium();
        } else {
            bl2 = false;
            object2 = null;
        }
        Object object3 = "affiliate";
        bl2 = Intrinsics.areEqual(object2, object3);
        if (bl2) {
            p5$a p5$a;
            object2 = p5$a;
            object3 = cartEntry;
            p5$a = new p5$a(cartEntry, (CartOrder)object, n3, affiliateData, ref$ObjectRef, null);
            int n4 = 3;
            object = b;
            Ae3.d((i90_0)object, null, null, p5$a, n4);
        }
    }
}

