/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Md2
 */
public final class md2_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ int c;
    public final /* synthetic */ CartOrder d;
    public final /* synthetic */ qz1_2 e;

    public /* synthetic */ md2_1(Activity activity, CartEntry cartEntry, int n3, CartOrder cartOrder, qz1_2 qz1_22) {
        this.a = activity;
        this.b = cartEntry;
        this.c = n3;
        this.d = cartOrder;
        this.e = qz1_22;
    }

    public final Object invoke() {
        boolean bl2;
        qz1_2 qz1_22 = this.e;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Object object = this.a;
        if (object != null && !(bl2 = object.isFinishing())) {
            int n3;
            boolean bl3;
            int n4;
            Object object2 = AnalyticsManager.Companion;
            Object object3 = "Cancel Item Button";
            Object object4 = "consolidated order details screen";
            String string2 = "Show Cancellation Screen";
            tj2_0.e((AnalyticsManager$Companion)object2, string2, (String)object3, (String)object4);
            object2 = this.b;
            if (object2 != null) {
                n4 = this.c;
                object3 = n4;
                ((CartEntry)object2).setQuantity((Integer)object3);
            }
            n4 = 0;
            object3 = null;
            if (object2 != null) {
                object4 = ((CartEntry)object2).getProduct();
            } else {
                bl3 = false;
                object4 = null;
            }
            Y63.g((Product)object4);
            object2 = JsonUtils.toJson(object2);
            object2 = E1.a("BUNDLE_CART_ORDER_STRING", (String)object2);
            object4 = this.d;
            if (object4 != null) {
                string2 = ((CartOrder)object4).getCode();
            } else {
                n3 = 0;
                string2 = null;
            }
            String string3 = "order_code";
            object2.putString(string3, string2);
            object2.putSerializable("cart order", (Serializable)object4);
            object4 = (Serializable)qz1_22.A.getValue();
            string2 = "GIFTS_ITEMS_DATA";
            object2.putSerializable(string2, (Serializable)object4);
            bl3 = object instanceof AjioHomeActivity;
            if (bl3) {
                object = ((AjioHomeActivity)object).T0;
                object = object != null ? ((Fragment)object).getChildFragmentManager() : null;
                object4 = "OrderSummaryFragment";
                object = object != null ? ((FragmentManager)object).E((String)object4) : null;
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
                object = (bg2_1)object;
                object.getClass();
                string2 = "bundle";
                Intrinsics.checkNotNullParameter(object2, string2);
                object = ((bg2_1)object).j;
                if (object != null) {
                    n3 = 926;
                    object.onFragmentInteraction((String)object4, n3, (Bundle)object2);
                }
                object = null;
                qz1_22.d(false, null);
            }
        }
        return Unit.a;
    }
}

