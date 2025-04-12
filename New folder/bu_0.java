/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import com.ril.ajio.services.data.Cart.pickfromstore.PickFromStore;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from bU
 */
public final class bu_0
implements F62 {
    public final /* synthetic */ du_1 a;

    public /* synthetic */ bu_0(du_1 du_12) {
        this.a = du_12;
    }

    public final void onChanged(Object object) {
        int n3 = 0;
        Iterator iterator = null;
        int n4 = 1;
        Object object2 = object;
        object2 = (DataCallback)object;
        du_1 du_12 = this.a;
        Intrinsics.checkNotNullParameter(du_12, "this$0");
        Object object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object2);
        if (n7 != 0) {
            int n8;
            int n10;
            object3 = du_12.h;
            if (object3 != null) {
                object3.P0();
            }
            object3 = AnalyticsManager.Companion;
            Object object4 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
            String string2 = du_12.g;
            Object object5 = "Search store for - ";
            String string3 = "Pick from Store-Shipping";
            String string4 = "Shipping Address Screen";
            cP.b((String)object5, string2, (GTMEvents)object4, string3, string4);
            if (object2 != null && (n10 = ((DataCallback)object2).getStatus()) == 0) {
                object2 = (PickFromStore)((DataCallback)object2).getData();
                object4 = du_12.d;
                string2 = null;
                if (object2 != null && (object5 = ((PickFromStore)object2).getStoreNodes()) != null) {
                    object4.clear();
                    iterator = new Iterator(n4, null);
                    object4.add(iterator);
                    iterator = ((PickFromStore)object2).getStoreNodes().iterator();
                    Object object6 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object6);
                    while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object6 = (StoreNode)iterator.next();
                        n7 = 2;
                        object2 = new kc3_1(n7, (StoreNode)object6);
                        object4.add(object2);
                    }
                    n3 = object4.size();
                    object6 = du_12.a;
                    if (object6 != null) {
                        ((yt_0)object6).c = null;
                    }
                    if ((object6 = du_12.h) != null) {
                        object6.v5(null);
                    }
                    if ((object6 = du_12.a) != null) {
                        ((RecyclerView$f)object6).notifyDataSetChanged();
                    }
                } else {
                    object2 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                    object3 = du_12.g;
                    object5 = "No store found - ";
                    cP.b((String)object5, (String)object3, (GTMEvents)object2, string3, string4);
                    object4.clear();
                    object2 = new kc3_1(n4, null);
                    object4.add(object2);
                    int n14 = 3;
                    Object object7 = new kc3_1(n14, null);
                    object4.add(object7);
                    object7 = du_12.a;
                    if (object7 != null) {
                        ((RecyclerView$f)object7).notifyDataSetChanged();
                    }
                }
                object3 = du_12.j;
                object4 = ((NewCustomEventsRevamp)object3).getEC_CHECKOUT_INTERACTIONS();
                object5 = String.valueOf(n3);
                String string5 = du_12.l;
                String string6 = du_12.m;
                string2 = "find store search success";
                string3 = "store_search_success";
                string4 = "shipping screen";
                String string7 = "shipping screen";
                int n15 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, string2, (String)object5, string3, string4, string7, string5, null, string6, false, null, n15, null);
            } else if (object2 != null && (n8 = ((DataCallback)object2).getStatus()) == n4 && (object2 = du_12.b) != null) {
                object2 = StringCompanionObject.INSTANCE;
                object2 = hv3_0.K(R$string.acc_error_message);
                n7 = R$string.addresses_not_able_to_fetch;
                object3 = hv3_0.K(n7);
                object4 = new Object[n4];
                object4[0] = object3;
                iterator = xh2_0.a(object4, n4, (String)object2, "format(...)");
                AppCompatActivity appCompatActivity = du_12.b;
                Intrinsics.checkNotNull(appCompatActivity, "null cannot be cast to non-null type com.ril.ajio.payment.activity.CheckoutAddressActivity");
                appCompatActivity = (CheckoutAddressActivity)appCompatActivity;
                n8 = R$string.store_addresses_not_able_to_fetch;
                object2 = hv3_0.K(n8);
                ((CheckoutAddressActivity)appCompatActivity).showNotification((String)object2, (String)((Object)iterator));
            }
        }
    }
}

