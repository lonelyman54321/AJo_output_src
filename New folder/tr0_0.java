/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from tr0
 */
public final class tr0_0 {
    public static final void a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        int n4;
        Object object2;
        Object object3;
        SelectedOrderItem selectedOrderItem2;
        qz1_2 qz1_23;
        block18: {
            int n8;
            String string2;
            Object object4;
            Object object5;
            float f5;
            Object object6;
            qz1_23 = qz1_22;
            selectedOrderItem2 = selectedOrderItem;
            Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
            int n10 = -1490624906;
            object3 = object;
            object2 = object.g(n10);
            qz1_22.getClass();
            object3 = new LinkedHashMap();
            n4 = 0;
            float f6 = 0.0f;
            Object object7 = null;
            Object object8 = selectedOrderItem != null ? selectedOrderItem.getConsignment() : null;
            if (selectedOrderItem2 != null && (object6 = selectedOrderItem.getCartEntry()) != null && (object6 = ((CartEntry)object6).getProduct()) != null) {
                object6 = ((Product)object6).getCode();
            } else {
                object6 = null;
                f5 = 0.0f;
            }
            String string3 = "text";
            String string4 = "state";
            boolean bl2 = false;
            if (object8 != null && (object8 = ((Consignment)object8).getReturnRequests()) != null) {
                boolean bl3;
                object8 = object8.iterator();
                while (bl3 = object8.hasNext()) {
                    object5 = (ReturnRequest)object8.next();
                    object4 = ((ReturnRequest)object5).getReturnStatus();
                    int n7 = b.i((String)object4, string2 = "DELIVERED", (n8 = 1) != 0);
                    if (n7 == 0 && (n7 = b.i((String)(object4 = ((ReturnRequest)object5).getReturnStatus()), string2 = "RETURN CANCELLED", n8 != 0)) == 0) continue;
                    object4 = ((ReturnRequest)object5).getReturnCancelledEntries();
                    if (object4 != null && (object4 = (OrderDetailLineItem)object4.get(0)) != null && (object4 = ((OrderDetailLineItem)object4).getEntry()) != null && (object4 = ((CartEntry)object4).getProduct()) != null) {
                        object4 = ((Product)object4).getCode();
                    } else {
                        n7 = 0;
                        object4 = null;
                    }
                    if (object6 == null || (n7 = ((String)object6).equals(object4)) != n8) continue;
                    object4 = Boolean.TRUE;
                    object3.put(string4, object4);
                    object4 = ((ReturnRequest)object5).getExchangeRTO();
                    n7 = ((Boolean)object4).booleanValue();
                    object5 = n7 != 0 ? ((ReturnRequest)object5).getExchangeRTOMessage() : ((ReturnRequest)object5).getCancelledTrackerMessageBody();
                    object3.put(string3, object5);
                }
            }
            if ((n4 = object3.containsKey(string4)) != 0) {
                object7 = ((LinkedHashMap)object3).get(string4);
                object8 = "null cannot be cast to non-null type kotlin.Boolean";
                Intrinsics.checkNotNull(object7, (String)object8);
                object7 = (Boolean)object7;
                bl2 = (Boolean)object7;
            }
            if ((n4 = object3.containsKey(string3)) != 0) {
                object3 = ((LinkedHashMap)object3).get(string3);
                object7 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object3, (String)object7);
                object3 = (String)object3;
            } else {
                object3 = "";
            }
            if (!bl2 || (n4 = ((String)object3).length()) == 0) {
                object = object2;
            } else {
                av0_0 av0_02;
                object7 = new Sl$a();
                long l2 = xx_1.e;
                object5 = tv0_0.m;
                av0_0 av0_03 = y20_0.a;
                long l3 = 0L;
                boolean bl3 = false;
                object4 = null;
                string2 = null;
                long l4 = 0L;
                tv0_0 tv0_02 = null;
                long l7 = 0L;
                char c2 = (char)-38;
                object8 = av0_02;
                object = object2;
                object2 = av0_02;
                av0_02 = av0_03;
                ((S93)object8)(l2, l3, (tv0_0)object5, null, null, av0_03, null, l4, null, null, null, l7, null, null, c2);
                n10 = ((Sl$a)object7).g((S93)object8);
                ((Sl$a)object7).c((String)object3);
                object3 = Unit.a;
                l4 = xx_1.h;
                tv0_02 = tv0_0.o;
                long l8 = 0L;
                long l12 = 0L;
                long l14 = 0L;
                char c3 = (char)-38;
                object2 = new S93(l4, l8, tv0_02, null, null, av0_03, null, l12, null, null, null, l14, null, null, c3);
                n10 = ((Sl$a)object7).g((S93)object2);
                object3 = "  View Return/Exchange Order";
                ((Sl$a)object7).c((String)object3);
                object3 = ((Sl$a)object7).h();
                object7 = LP1$a.b;
                float f7 = 16;
                n10 = 14;
                f5 = n10;
                object2 = h.i((LP1)object7, f7, f5, f7, 0.0f, 8);
                n4 = 1065353216;
                f6 = 1.0f;
                object7 = j.c((LP1)object2, f6);
                object5 = new rr0_0(qz1_23, selectedOrderItem2);
                string4 = null;
                bl2 = false;
                object8 = null;
                f5 = 0.0f;
                object6 = null;
                f7 = 0.0f;
                string3 = null;
                string2 = null;
                n8 = 124;
                object4 = object;
                IV.a((Sl)object3, (LP1)object7, null, false, 0, 0, null, (Function1)object5, (b30_0)object, 0, n8);
            }
            break block18;
            finally {
                ((Sl$a)object7).e(n10);
            }
            finally {
                ((Sl$a)object7).e(n10);
            }
        }
        object2 = ((j30_0)object).X();
        if (object2 != null) {
            n4 = n3;
            ((CF2)object2).d = object3 = new sr0_0(qz1_23, selectedOrderItem2, n3);
        }
    }
}

