/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnRefundBottomLink;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MN2
 */
public final class mn2_0
implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ nn2_2 b;
    public final /* synthetic */ Consignment c;
    public final /* synthetic */ CartOrder d;

    public /* synthetic */ mn2_0(ArrayList arrayList, nn2_2 nn2_22, Consignment consignment, CartOrder cartOrder) {
        this.a = arrayList;
        this.b = nn2_22;
        this.c = consignment;
        this.d = cartOrder;
    }

    public final void onClick(View object) {
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$consignment");
        Object object3 = this.a;
        Object object4 = ((ReturnRefundBottomLink)object3.get(0)).getBottomLinkCode();
        Object object5 = ReturnRefundLinksEnum.CREATE_NEW_RETURN;
        boolean n3 = object4.equals(object5);
        if (n3) {
            object4 = ((nn2_2)object).a;
            if (object4 != null) {
                int n4;
                object5 = ((Consignment)object2).getCode();
                object = this.d;
                if (object != null) {
                    object = ((CartOrder)object).getCode();
                } else {
                    n4 = 0;
                    object = null;
                }
                n4 = ((Consignment)object2).getShipmentPosition();
                Integer n7 = n4;
                String string2 = "";
                object4.Ma((Consignment)object2, (String)object5, (String)object, n7, string2);
            }
        } else {
            object = ((nn2_2)object).a;
            if (object != null) {
                int n8 = 1;
                object2 = ((ReturnRefundBottomLink)object3.get(n8)).getBottomLinkUrl();
                object3 = ((ReturnRefundBottomLink)object3.get(n8)).getBottomLinkCode();
                object.O0((String)object2, (ReturnRefundLinksEnum)((Object)object3));
            }
        }
    }
}

