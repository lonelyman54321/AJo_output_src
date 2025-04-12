/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnCreateContextMenuListener
 */
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import com.ril.ajio.myaccount.order.imps.c;
import com.ril.ajio.services.query.QueryOrderCancel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vK
 */
public final class vk_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ vk_2(View.OnCreateContextMenuListener onCreateContextMenuListener, int n3) {
        this.a = n3;
        this.b = onCreateContextMenuListener;
    }

    public final void onClick(View object) {
        object = null;
        boolean bl2 = true;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (Dialog)object2;
                Intrinsics.checkNotNullParameter(object2, "$dialog");
                object2.dismiss();
                return;
            }
            case 1: {
                object2 = (c)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                ((BottomSheetDialogFragment)object2).dismiss();
                return;
            }
            case 0: 
        }
        object2 = (CancelReasonFragment)object2;
        Object object3 = ((CancelReasonFragment)object2).n;
        n3 = object3.getSelectedItemPosition();
        if (n3 == 0) {
            int n4 = R$string.acc_alert_message;
            object2 = hv3_0.K(n4);
            object3 = "Please select the cancellation reason";
            Object[] objectArray = new Object[bl2];
            objectArray[0] = object3;
            object = String.format((String)object2, objectArray);
            mq0_2.c((String)object3, (String)object);
        } else {
            object3 = ((CancelReasonFragment)object2).n.getSelectedItem();
            if (object3 != null && (object3 = ((CancelReasonFragment)object2).h.getProduct()) != null) {
                Object object4;
                object3 = ((CancelReasonFragment)object2).n.getSelectedItem().toString();
                n3 = (int)(((String)object3).contains((CharSequence)(object4 = "(please give details)")) ? 1 : 0);
                if (n3 != 0 && (object3 = ((CancelReasonFragment)object2).B.getText()) != null && (n3 = (int)(((String)(object3 = ((CancelReasonFragment)object2).B.getText().toString().trim())).isEmpty() ? 1 : 0)) != 0) {
                    int n7 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n7);
                    object3 = "Please enter cancellation comments";
                    Object[] objectArray = new Object[bl2];
                    objectArray[0] = object3;
                    object = String.format((String)object2, objectArray);
                    mq0_2.c((String)object3, (String)object);
                } else {
                    Object object5;
                    object3 = new Bundle();
                    object4 = ((CancelReasonFragment)object2).h.getProduct().getCode();
                    object3.putString("product_id", (String)object4);
                    object4 = ((CancelReasonFragment)object2).h.getProduct().getName();
                    object3.putString("product_name", (String)object4);
                    String string2 = ((CancelReasonFragment)object2).g;
                    object3.putString("order_id", string2);
                    object4 = new AnalyticsData$Builder();
                    AnalyticsData analyticsData = ((AnalyticsData$Builder)object4).bundle((Bundle)object3).build();
                    object4 = AnalyticsManager.getInstance().getGtmEvents();
                    Object object6 = ((CancelReasonFragment)object2).n.getSelectedItem().toString();
                    String string3 = "Order Cancellation Screen";
                    string2 = "Cancellation reason";
                    ((GTMEvents)object4).pushButtonTapEvent(string2, object6, string3, analyticsData, null);
                    object3 = cp_1.Companion;
                    n3 = (int)(km_1.b((cp$a)object3) ? 1 : 0);
                    if (n3 != 0) {
                        object = ((CancelReasonFragment)object2).A;
                        object.setEnabled(bl2);
                    } else {
                        object5 = ((CancelReasonFragment)object2).A;
                        object5.setEnabled(false);
                    }
                    object = ((CancelReasonFragment)object2).g;
                    object5 = ((CancelReasonFragment)object2).h.getProduct().getCode();
                    object3 = ((CancelReasonFragment)object2).n.getSelectedItem().toString();
                    object4 = ((CancelReasonFragment)object2).B.getText().toString();
                    int n8 = ((CancelReasonFragment)object2).v;
                    ((CancelReasonFragment)object2).o.show();
                    object2 = ((CancelReasonFragment)object2).x;
                    object2.getClass();
                    Intrinsics.checkNotNullParameter(object, "orderNo");
                    Intrinsics.checkNotNullParameter(object5, "productCode");
                    Intrinsics.checkNotNullParameter(object3, "cancelReason");
                    Intrinsics.checkNotNullParameter(object4, "comments");
                    object6 = new QueryOrderCancel();
                    ((QueryOrderCancel)object6).setOrderNo((String)object);
                    ((QueryOrderCancel)object6).setProductCode((String)object5);
                    ((QueryOrderCancel)object6).setCancelReason((String)object3);
                    ((QueryOrderCancel)object6).setCancelDescription((String)object4);
                    ((QueryOrderCancel)object6).setProductQuantity(n8);
                    object = md3_0.c((jD3)object2);
                    n3 = 0;
                    object3 = null;
                    object5 = new za2_2((db2_1)object2, (QueryOrderCancel)object6, null);
                    int n10 = 3;
                    Ae3.d((i90_0)object, null, null, (Function2)object5, n10);
                }
            }
        }
    }
}

