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
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderCancellation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from xK
 */
public final class xk_2
implements F62 {
    public final /* synthetic */ CancelReasonFragment a;

    public /* synthetic */ xk_2(CancelReasonFragment cancelReasonFragment) {
        this.a = cancelReasonFragment;
    }

    public final void onChanged(Object object) {
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        object2.getClass();
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            object3 = ((CancelReasonFragment)object2).o;
            ((AjioProgressView)((Object)object3)).dismiss();
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                object3 = ((Fragment)object2).getActivity();
                if (object3 != null && (n4 = (object3 = ((Fragment)object2).getActivity()).isFinishing()) == 0) {
                    Object object4;
                    int n7;
                    object = (OrderCancellation)((DataCallback)object).getData();
                    object3 = new Bundle();
                    Object object5 = ((CancelReasonFragment)object2).h.getProduct().getCode();
                    object3.putString("product_id", (String)object5);
                    object5 = ((CancelReasonFragment)object2).h.getProduct().getName();
                    object3.putString("product_name", (String)object5);
                    Object object6 = ((CancelReasonFragment)object2).g;
                    object3.putString("order_id", (String)object6);
                    object5 = ((CancelReasonFragment)object2).j;
                    if (object5 != null && (n7 = ((HashMap)object5).containsKey(object6 = ((CancelReasonFragment)object2).h.getProduct().getCode())) != 0) {
                        object5 = ((CancelReasonFragment)object2).j;
                        object6 = ((CancelReasonFragment)object2).h.getProduct().getCode();
                        object5 = (ArrayList)((HashMap)object5).get(object6);
                        object6 = a21.a;
                        object6.getClass();
                        n7 = a21.c((ArrayList)object5);
                        if (n7 != 0) {
                            object5 = ((CancelReasonFragment)object2).j;
                            object6 = ((CancelReasonFragment)object2).h.getProduct().getCode();
                            object5 = a21.e((List)((HashMap)object5).get(object6)).toString();
                            object6 = "offer_count";
                            object3.putString((String)object6, (String)object5);
                        }
                    }
                    AnalyticsData analyticsData = ne_0.b((Bundle)object3);
                    Object object7 = AnalyticsManager.getInstance().getGtmEvents();
                    String string2 = "Cancel Item";
                    String string3 = "Cancel Item Button";
                    String string4 = "Order Cancellation Screen";
                    ((GTMEvents)object7).pushButtonTapEvent(string2, string3, string4, analyticsData, null);
                    ((CancelReasonFragment)object2).q = n3;
                    object3 = ((CancelReasonFragment)object2).w;
                    n7 = 0;
                    object5 = null;
                    object6 = "The item was successfully cancelled.";
                    if (object3 != null) {
                        ((CancelReasonFragment)object2).q = n3;
                        object3.showNotificationMyAccountFragment((String)object6, null);
                    } else {
                        object3 = ((Fragment)object2).getActivity().getClass().getName();
                        n4 = (int)(((String)object3).contains((CharSequence)(object7 = "CCCancelOrderActivity")) ? 1 : 0);
                        if (n4 != 0) {
                            ((CancelReasonFragment)object2).q = n3;
                            object4 = ((CancelReasonFragment)object2).w;
                            object4.showNotificationMyAccountFragment((String)object6, null);
                        }
                    }
                    object4 = ((CancelReasonFragment)object2).h;
                    object3 = ((CancelReasonFragment)object2).g;
                    object5 = GAEcommerceEvents.INSTANCE;
                    object7 = ((CancelReasonFragment)object2).j;
                    ((GAEcommerceEvents)object5).pushOrderCancelEvent((String)object3, (CartEntry)object4, "Order Cancellation Screen", (HashMap)object7);
                    object5 = ((CancelReasonFragment)object2).z;
                    object6 = ((CancelReasonFragment)object2).i;
                    ((NewEEcommerceEventsRevamp)object5).pushPurchaseCancelOrderAppsFlyerEvent((String)object3, (CartEntry)object4, (CartOrder)object6, (OrderCancellation)object);
                    object = rw2_1.a;
                    object = ((CancelReasonFragment)object2).g;
                    object4 = ((CancelReasonFragment)object2).h;
                    object3 = ((CancelReasonFragment)object2).j;
                    rw2_1.a((String)object, (CartEntry)object4, (HashMap)object3);
                    object = p5_0.a;
                    object4 = ((CancelReasonFragment)object2).h;
                    object3 = ((CancelReasonFragment)object2).i;
                    n7 = ((CancelReasonFragment)object2).v;
                    object.getClass();
                    p5_0.e((CartEntry)object4, (CartOrder)object3, n7);
                    object4 = ((Fragment)object2).getActivity().getMainLooper();
                    object = new Handler((Looper)object4);
                    object4 = new ak_2(object2, 0);
                    long l2 = 300L;
                    object.postDelayed((Runnable)object4, l2);
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3) {
                    int n8;
                    ((CancelReasonFragment)object2).A.setEnabled(n3 != 0);
                    object3 = ((Fragment)object2).getActivity();
                    if (object3 != null && (n8 = (object2 = ((Fragment)object2).getActivity()).isFinishing()) == 0) {
                        if ((object = ((DataCallback)object).getError()) != null && (object2 = ((DataError)object).getErrors()) != null && (n8 = (object2 = ((DataError)object).getErrors()).size()) > 0) {
                            n8 = R$string.acc_error_message;
                            object2 = hv3_0.K(n8);
                            object3 = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            Object object8 = new Object[n3];
                            object8[0] = object3;
                            object8 = String.format((String)object2, object8);
                            object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            mq0_2.c((String)object, (String)object8);
                        } else {
                            int n10 = R$string.acc_error_message;
                            object = hv3_0.K(n10);
                            object2 = "Cancellation cannot be done";
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = object2;
                            object = String.format((String)object, objectArray);
                            mq0_2.c((String)object2, (String)object);
                        }
                    }
                }
            }
        }
    }
}

