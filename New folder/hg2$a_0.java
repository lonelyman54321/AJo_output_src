/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.user.AffiliateData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from hg2$a
 */
public final class hg2$a_0
implements fs0_2 {
    public final /* synthetic */ bg2_1 a;

    public hg2$a_0(bg2_1 bg2_12) {
        this.a = bg2_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3 = 1;
        int n4 = ((DataCallback)(object = (DataCallback)object)).getStatus();
        if (n4 != 0) {
            if (n4 == n3) {
                object = StringCompanionObject.INSTANCE;
                int n7 = R$string.acc_error_message;
                object = hv3_0.K(n7);
                String string2 = "Order details for this order cannot be loaded, try again later";
                Object[] objectArray = new Object[n3];
                objectArray[0] = string2;
                String string3 = "format(...)";
                object = xh2_0.a(objectArray, n3, (String)object, string3);
                hv3_0.o0(n3, string2, (String)object);
            }
        } else {
            object2 = this.a;
            Object object3 = ((bg2_1)object2).Pa();
            Object object4 = (CartOrder)((DataCallback)object).getData();
            Object object5 = ((bg2_1)object2).Pa().g;
            String string4 = ((bg2_1)object2).Pa().h;
            ((qz1_2)object3).c((CartOrder)object4, (String)object5, string4);
            object3 = (CartOrder)((DataCallback)object).getData();
            object4 = null;
            if (object3 != null) {
                object3 = ((CartOrder)object3).affiliateData;
            } else {
                n4 = 0;
                object3 = null;
            }
            ((bg2_1)object2).p = object3;
            object3 = (CartOrder)((DataCallback)object).getData();
            if (object3 != null) {
                object3 = ((CartOrder)object3).getOriginalOrderId();
            } else {
                n4 = 0;
                object3 = null;
            }
            ((bg2_1)object2).q = object3;
            object3 = ((bg2_1)object2).g;
            if (object3 != null) {
                object5 = ((bg2_1)object2).p;
                ((ReturnOrderItemDetails)object3).setAffiliateData((AffiliateData)object5);
            }
            if ((object3 = ((bg2_1)object2).g) != null) {
                if ((object = (CartOrder)((DataCallback)object).getData()) != null) {
                    object4 = ((CartOrder)object).getOriginalOrderId();
                }
                ((ReturnOrderItemDetails)object3).setOriginalOrderId((String)object4);
            }
            object = h40_0.a;
            boolean bl2 = h40_0.U0();
            if (bl2 && (object = ((bg2_1)object2).e) != null) {
                object3 = (SelectedOrderItem)CollectionsKt.firstOrNull((List)((bg2_1)object2).Pa().m.getValue());
                object2 = ((bg2_1)object2).Pa();
                if (object3 == null || (object3 = ((SelectedOrderItem)object3).getRawEntryStatus()) == null) {
                    object3 = "";
                }
                ((qz1_2)object2).n((String)object, (String)object3);
            }
        }
        return Unit.a;
    }
}

