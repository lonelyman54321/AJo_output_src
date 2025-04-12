/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from wK
 */
public final class wk_2
implements F62 {
    public final /* synthetic */ CancelReasonFragment a;

    public /* synthetic */ wk_2(CancelReasonFragment cancelReasonFragment) {
        this.a = cancelReasonFragment;
    }

    public final void onChanged(Object object) {
        boolean bl2 = false;
        Object object2 = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object3 = this.a;
        object3.getClass();
        Object object4 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n4 != 0) {
            object4 = ((CancelReasonFragment)object3).o;
            ((AjioProgressView)((Object)object4)).dismiss();
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                boolean bl3;
                object = ((Fragment)object3).getActivity();
                if (object != null && !(bl3 = (object = ((Fragment)object3).getActivity()).isFinishing())) {
                    object = new Bundle();
                    object2 = ((CancelReasonFragment)object3).h.getProduct().getCode();
                    object.putString("product_id", (String)object2);
                    object2 = ((CancelReasonFragment)object3).h.getProduct().getName();
                    object.putString("product_name", (String)object2);
                    object4 = ((CancelReasonFragment)object3).g;
                    object.putString("order_id", (String)object4);
                    object2 = new AnalyticsData$Builder();
                    AnalyticsData analyticsData = ((AnalyticsData$Builder)object2).bundle((Bundle)object).build();
                    object2 = ((CancelReasonFragment)object3).j;
                    if (object2 != null && (bl2 = ((HashMap)object2).containsKey(object4 = ((CancelReasonFragment)object3).h.getProduct().getCode()))) {
                        object2 = ((CancelReasonFragment)object3).j;
                        object4 = ((CancelReasonFragment)object3).h.getProduct().getCode();
                        object2 = (ArrayList)((HashMap)object2).get(object4);
                        object4 = a21.a;
                        object4.getClass();
                        bl2 = a21.c((ArrayList)object2);
                        if (bl2) {
                            object2 = ((CancelReasonFragment)object3).j;
                            object4 = ((CancelReasonFragment)object3).h.getProduct().getCode();
                            object2 = a21.e((List)((HashMap)object2).get(object4)).toString();
                            object4 = "offer_count";
                            object.putString((String)object4, (String)object2);
                        }
                    }
                    object4 = AnalyticsManager.getInstance().getGtmEvents();
                    Object object5 = "Cancel Item";
                    Object object6 = "Cancel Item Button";
                    String string2 = "Order Cancellation Screen";
                    ((GTMEvents)object4).pushButtonTapEvent((String)object5, object6, string2, analyticsData, null);
                    ((CancelReasonFragment)object3).q = n3;
                    object = ((CancelReasonFragment)object3).w;
                    object2 = "The item was successfully cancelled.";
                    n4 = 0;
                    object4 = null;
                    if (object != null) {
                        ((CancelReasonFragment)object3).q = n3;
                        object.showNotificationMyAccountFragment((String)object2, null);
                    } else {
                        object = ((Fragment)object3).getActivity().getClass().getName();
                        bl3 = ((String)object).contains((CharSequence)(object5 = "CCCancelOrderActivity"));
                        if (bl3) {
                            ((CancelReasonFragment)object3).q = n3;
                            object = ((CancelReasonFragment)object3).w;
                            object.showNotificationMyAccountFragment((String)object2, null);
                        }
                    }
                    object = ((CancelReasonFragment)object3).h;
                    object2 = ((CancelReasonFragment)object3).g;
                    Object object7 = GAEcommerceEvents.INSTANCE;
                    object6 = ((CancelReasonFragment)object3).j;
                    ((GAEcommerceEvents)object7).pushOrderCancelEvent((String)object2, (CartEntry)object, "Order Cancellation Screen", (HashMap)object6);
                    object7 = ((CancelReasonFragment)object3).z;
                    object5 = ((CancelReasonFragment)object3).i;
                    ((NewEEcommerceEventsRevamp)object7).pushPurchaseCancelOrderAppsFlyerEvent((String)object2, (CartEntry)object, (CartOrder)object5, null);
                    object = rw2_1.a;
                    object = ((CancelReasonFragment)object3).g;
                    object2 = ((CancelReasonFragment)object3).h;
                    object7 = ((CancelReasonFragment)object3).j;
                    rw2_1.a((String)object, (CartEntry)object2, (HashMap)object7);
                    object = p5_0.a;
                    object2 = ((CancelReasonFragment)object3).h;
                    object7 = ((CancelReasonFragment)object3).i;
                    n4 = ((CancelReasonFragment)object3).v;
                    object.getClass();
                    p5_0.e((CartEntry)object2, (CartOrder)object7, n4);
                    object2 = ((Fragment)object3).getActivity().getMainLooper();
                    object = new Handler((Looper)object2);
                    object2 = new zk_2((CancelReasonFragment)object3);
                    long l2 = 300L;
                    object.postDelayed((Runnable)object2, l2);
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3) {
                    int n7;
                    ((CancelReasonFragment)object3).A.setEnabled(n3 != 0);
                    object4 = ((Fragment)object3).getActivity();
                    if (object4 != null && (n7 = (object3 = ((Fragment)object3).getActivity()).isFinishing()) == 0) {
                        if ((object = ((DataCallback)object).getError()) != null && (object3 = ((DataError)object).getErrors()) != null && (n7 = (object3 = ((DataError)object).getErrors()).size()) > 0) {
                            n7 = R$string.acc_error_message;
                            object3 = hv3_0.K(n7);
                            object4 = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            Object object8 = new Object[n3];
                            object8[0] = object4;
                            object8 = String.format((String)object3, object8);
                            object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            mq0_2.c((String)object, (String)object8);
                        } else {
                            int n8 = R$string.acc_error_message;
                            object = hv3_0.K(n8);
                            object3 = "Cancellation cannot be done";
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = object3;
                            object = String.format((String)object, objectArray);
                            mq0_2.c((String)object3, (String)object);
                        }
                    }
                }
            }
        }
    }
}

