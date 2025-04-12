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
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Product.Product;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from DN2
 */
public final class dn2_0
implements View.OnClickListener {
    public final /* synthetic */ fn2_2 a;
    public final /* synthetic */ ReturnRequest b;
    public final /* synthetic */ CartOrder c;
    public final /* synthetic */ Ref$BooleanRef d;

    public /* synthetic */ dn2_0(fn2_2 fn2_22, ReturnRequest returnRequest, CartOrder cartOrder, Ref$BooleanRef ref$BooleanRef) {
        this.a = fn2_22;
        this.b = returnRequest;
        this.c = cartOrder;
        this.d = ref$BooleanRef;
    }

    public final void onClick(View view) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$returnRequest");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$cartOrder");
        Object object4 = this.d;
        String string2 = "$mIsAjioWalletToBankTransferFlow";
        Intrinsics.checkNotNullParameter(object4, string2);
        object = ((fn2_2)object).a;
        if (object != null) {
            boolean bl2 = ((Ref$BooleanRef)object4).element;
            object.t6((ReturnRequest)object2, (CartOrder)object3, bl2);
        }
        object = zE2.a;
        String string3 = ((ReturnRequest)object2).getReturnId();
        Intrinsics.checkNotNullExpressionValue(string3, "getReturnId(...)");
        object = ((CartOrder)object3).getCode();
        Intrinsics.checkNotNullExpressionValue(object, "getCode(...)");
        object3 = ((ReturnRequest)object2).getReturnEntries();
        object4 = "getReturnEntries(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object3);
        object3 = object3 != null && (object3 = ((OrderDetailLineItem)object3).getEntry()) != null && (object3 = ((CartEntry)object3).getProduct()) != null ? ((Product)object3).getCode() : null;
        object2 = ((ReturnRequest)object2).getReturnStatus();
        Intrinsics.checkNotNullExpressionValue(object2, "getReturnStatus(...)");
        Intrinsics.checkNotNullParameter(string3, "returnId");
        Bundle bundle = dm_1.a((String)object, "orderId", (String)object2, "orderStatus");
        bundle.putString("order_id", (String)object);
        bundle.putString("product_id", (String)object3);
        bundle.putString("order_status", (String)object2);
        object = AnalyticsManager.Companion;
        String string4 = av_0.a((AnalyticsManager$Companion)object);
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = bv_0.a((AnalyticsManager$Companion)object);
        String string7 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(zE2.a, "order details interaction", "Wallet to bank transfer", string3, "order_details_interaction", string4, string5, string6, bundle, string7, false, null, 1536, null);
    }
}

