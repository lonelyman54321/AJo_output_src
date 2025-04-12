/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class WC0
implements View.OnClickListener {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ ActionContent c;
    public final /* synthetic */ gd0_0 d;

    public /* synthetic */ WC0(FragmentManager fragmentManager, CartEntry cartEntry, ActionContent actionContent, gd0_0 gd0_02) {
        this.a = fragmentManager;
        this.b = cartEntry;
        this.c = actionContent;
        this.d = gd0_02;
    }

    public final void onClick(View view) {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        Object object4 = this.d;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        Object object5 = new ih2_2();
        FragmentManager fragmentManager = this.a;
        CartEntry cartEntry = this.b;
        if (fragmentManager != null) {
            object3 = new ReturnOrderItemDetails();
            ((ReturnOrderItemDetails)object3).getSelectedControllerConfirmedList().add(cartEntry);
            ((CartEntry)((ReturnOrderItemDetails)object3).getSelectedControllerConfirmedList().get(0)).setOrderEntry(cartEntry);
            object2 = new Bundle();
            object2.putSerializable("Return_Order_Details", (Serializable)object3);
            object = this.c;
            object2.putSerializable("actionContent", (Serializable)object);
            ((Fragment)object5).setArguments((Bundle)object2);
            object3 = "Refund Breakup";
            ((DialogFragment)object5).show(fragmentManager, (String)object3);
        }
        if (bl2 = ((gd0_0)object4).a) {
            Bundle bundle = DE.a();
            object4 = cartEntry.getOrderId();
            object5 = "order_id";
            bundle.putString((String)object5, (String)object4);
            object4 = cartEntry.getProduct();
            if (object4 != null) {
                object4 = ((Product)object4).getCode();
            } else {
                bl2 = false;
                object4 = null;
            }
            bundle.putString("product_id", (String)object4);
            object4 = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp();
            String string2 = ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_EVENT();
            object5 = ((AnalyticsManager$Companion)object4).getInstance().getNewCustomEventsRevamp();
            object = ((NewCustomEventsRevamp)object5).getREFUND_BREAKUP();
            String string3 = bv_0.a((AnalyticsManager$Companion)object4);
            String string4 = cv_0.a((AnalyticsManager$Companion)object4);
            object2 = "order details interaction";
            String string5 = "order item details screen";
            int n3 = 1572;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object2, (String)object, null, string2, string5, null, string3, bundle, string4, false, null, n3, null);
        }
    }
}

