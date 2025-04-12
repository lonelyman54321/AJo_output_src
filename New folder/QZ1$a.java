/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class QZ1$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ CartOrder d;

    public QZ1$a(int n3, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, CartOrder cartOrder, f80_0 f80_02) {
        this.a = n3;
        this.b = qz1_22;
        this.c = selectedOrderItem;
        this.d = cartOrder;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SelectedOrderItem selectedOrderItem = this.c;
        CartOrder cartOrder = this.d;
        int n3 = this.a;
        qz1_2 qz1_22 = this.b;
        object = new QZ1$a(n3, qz1_22, selectedOrderItem, cartOrder, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (QZ1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((QZ1$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        int n3 = this.a;
        Object object3 = null;
        Object object4 = this.d;
        String string2 = "order_id";
        Object object5 = "";
        Object object6 = this.c;
        String string3 = "order_status";
        String string4 = "product_id";
        qz1_2 qz1_22 = this.b;
        switch (n3) {
            default: {
                break;
            }
            case 9: {
                object2 = new Bundle();
                Object object7 = qz1_22.g;
                object2.putString(string4, (String)object7);
                if (object6 != null && (object6 = ((SelectedOrderItem)object6).getOrderStatus()) != null) {
                    object5 = object6;
                }
                object2.putString(string3, (String)object5);
                if (object4 != null) {
                    object3 = ((CartOrder)object4).getCode();
                }
                object2.putString(string2, (String)object3);
                object7 = qz1_22.M;
                String string5 = qz1_22.N.getPrevScreen();
                object3 = qz1_22.N;
                String string6 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
                int n4 = 1588;
                String string7 = "order item details interaction";
                String string8 = "return policy";
                String string9 = "order_item_details_interaction";
                boolean bl2 = false;
                Object var20_35 = null;
                Object object8 = object2;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, string7, string8, null, string9, null, null, string5, (Bundle)object2, string6, false, null, n4, null);
                break;
            }
            case 8: {
                object2 = new Bundle();
                String string10 = qz1_22.g;
                object2.putString(string4, string10);
                if (object6 != null && (object6 = ((SelectedOrderItem)object6).getOrderStatus()) != null) {
                    object5 = object6;
                }
                object2.putString(string3, (String)object5);
                if (object4 != null) {
                    object3 = ((CartOrder)object4).getCode();
                }
                object2.putString(string2, (String)object3);
                object3 = qz1_22.M;
                String string11 = qz1_22.N.getPrevScreen();
                object4 = qz1_22.N;
                String string12 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
                int n7 = 1588;
                String string13 = "order item details interaction";
                String string14 = "view exchange";
                String string15 = "order_item_details_interaction";
                boolean bl3 = false;
                Object object9 = object3;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string13, string14, null, string15, null, null, string11, (Bundle)object2, string12, false, null, n7, null);
                break;
            }
            case 7: {
                Bundle bundle = new Bundle();
                object2 = qz1_22.g;
                bundle.putString(string4, (String)object2);
                if (object6 != null && (object2 = ((SelectedOrderItem)object6).getOrderStatus()) != null) {
                    object5 = object2;
                }
                bundle.putString(string3, (String)object5);
                if (object4 != null) {
                    object3 = ((CartOrder)object4).getCode();
                }
                bundle.putString(string2, (String)object3);
                object4 = qz1_22.M;
                String string16 = qz1_22.N.getPrevScreen();
                object2 = qz1_22.N;
                String string17 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
                int n8 = 1588;
                string2 = "order item details interaction";
                object5 = "return exchange";
                object6 = null;
                string3 = "order_item_details_interaction";
                string4 = null;
                qz1_22 = null;
                Object var18_30 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string2, (String)object5, null, string3, null, null, string16, bundle, string17, false, null, n8, null);
                break;
            }
            case 6: {
                object2 = new Bundle();
                String string18 = qz1_22.g;
                object2.putString(string4, string18);
                if (object6 != null && (object6 = ((SelectedOrderItem)object6).getOrderStatus()) != null) {
                    object5 = object6;
                }
                object2.putString(string3, (String)object5);
                if (object4 != null) {
                    object3 = ((CartOrder)object4).getCode();
                }
                object2.putString(string2, (String)object3);
                object3 = qz1_22.M;
                String string19 = qz1_22.N.getPrevScreen();
                object4 = qz1_22.N;
                String string20 = ((NewEEcommerceEventsRevamp)object4).getPrevScreenType();
                int n10 = 1588;
                String string21 = "order item details interaction";
                String string22 = "track";
                String string23 = "order_item_details_interaction";
                boolean bl4 = false;
                Object var27_47 = null;
                Object object10 = object3;
                Object object11 = object2;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string21, string22, null, string23, null, null, string19, (Bundle)object2, string20, false, null, n10, null);
                break;
            }
            case 5: {
                Bundle bundle = new Bundle();
                object2 = qz1_22.g;
                bundle.putString(string4, (String)object2);
                if (object6 != null && (object2 = ((SelectedOrderItem)object6).getOrderStatus()) != null) {
                    object5 = object2;
                }
                bundle.putString(string3, (String)object5);
                if (object4 != null) {
                    object3 = ((CartOrder)object4).getCode();
                }
                bundle.putString(string2, (String)object3);
                object4 = qz1_22.M;
                string4 = av_0.a(AnalyticsManager.Companion);
                String string24 = qz1_22.N.getPrevScreen();
                object2 = qz1_22.N;
                String string25 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
                int n14 = 1572;
                string2 = "order item details interaction";
                object5 = "cancel";
                object6 = null;
                string3 = "order_item_details_interaction";
                qz1_22 = null;
                Object var18_31 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string2, (String)object5, null, string3, string4, null, string24, bundle, string25, false, null, n14, null);
            }
        }
        return Unit.a;
    }
}

