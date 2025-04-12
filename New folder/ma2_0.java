/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ma2
 */
public final class ma2_0 {
    public static final NewCustomEventsRevamp a = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();

    public static Bundle a(Bundle object) {
        boolean bl2;
        String string2;
        boolean bl3;
        Bundle bundle = new Bundle();
        NewCustomEventsRevamp newCustomEventsRevamp = a;
        String string3 = newCustomEventsRevamp.getCM_EP_TAARA();
        boolean bl4 = true;
        if (object != null && (bl3 = object.containsKey(string3)) == bl4) {
            string2 = object.getString(string3);
            bundle.putString(string3, string2);
        }
        string3 = newCustomEventsRevamp.getCM_EP_RONE();
        if (object != null && (bl3 = object.containsKey(string3)) == bl4) {
            string2 = object.getString(string3);
            bundle.putString(string3, string2);
        }
        string3 = newCustomEventsRevamp.getCM_EP_AJIO_WALLET();
        if (object != null && (bl3 = object.containsKey(string3)) == bl4) {
            string2 = object.getString(string3);
            bundle.putString(string3, string2);
        }
        string3 = newCustomEventsRevamp.getCM_EP_MAHACASHBACK();
        if (object != null && (bl3 = object.containsKey(string3)) == bl4) {
            object = object.getString(string3);
            bundle.putString(string3, (String)object);
        }
        if ((bl2 = bundle.containsKey((String)(object = newCustomEventsRevamp.getCM_EP_TAARA()))) && (bl2 = bundle.containsKey((String)(object = newCustomEventsRevamp.getCM_EP_RONE())))) {
            object = newCustomEventsRevamp.getCM_EP_RONE();
            bundle.remove((String)object);
        }
        return bundle;
    }

    public static ArrayList b(CartOrder object) {
        boolean bl2;
        Object object2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (object != null) {
            object2 = ((CartOrder)object).getEntries();
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            object = ((CartOrder)object).getEntries();
            object2 = new ArrayList(object);
            object = ((ArrayList)object2).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                object2 = (CartEntry)object.next();
                if (object2 != null) {
                    object2 = ((CartEntry)object2).getProduct();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 == null || (object2 = ((Product)object2).getCode()) == null) continue;
                arrayList.add(object2);
            }
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c() {
        boolean bl2 = og1_1.c();
        if (bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "referral_feature_enable";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        object = z40$a.a((Context)AJIOApplication$a.a()).a;
        string2 = "referrer_enable";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        object = z40$a.a((Context)AJIOApplication$a.a()).a;
        string2 = "referral_widget_order_enable";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }
}

