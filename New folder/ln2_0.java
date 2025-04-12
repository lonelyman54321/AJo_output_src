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
 * Renamed from LN2
 */
public final class ln2_0
implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ nn2_2 b;
    public final /* synthetic */ Consignment c;
    public final /* synthetic */ CartOrder d;

    public /* synthetic */ ln2_0(ArrayList arrayList, nn2_2 nn2_22, Consignment consignment, CartOrder cartOrder) {
        this.a = arrayList;
        this.b = nn2_22;
        this.c = consignment;
        this.d = cartOrder;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$consignment");
        ArrayList arrayList = this.a;
        HN2 hN2 = null;
        ReturnRefundLinksEnum returnRefundLinksEnum = ((ReturnRefundBottomLink)arrayList.get(0)).getBottomLinkCode();
        ReturnRefundLinksEnum returnRefundLinksEnum2 = ReturnRefundLinksEnum.CREATE_NEW_RETURN;
        boolean bl2 = ((Object)((Object)returnRefundLinksEnum)).equals((Object)returnRefundLinksEnum2);
        if (!bl2) {
            object = ((nn2_2)object).a;
            if (object == null) return;
            object2 = ((ReturnRefundBottomLink)arrayList.get(0)).getBottomLinkUrl();
            ReturnRefundLinksEnum returnRefundLinksEnum3 = ((ReturnRefundBottomLink)arrayList.get(0)).getBottomLinkCode();
            object.O0((String)object2, returnRefundLinksEnum3);
            return;
        }
        hN2 = ((nn2_2)object).a;
        if (hN2 == null) return;
        String string2 = ((Consignment)object2).getCode();
        object = this.d;
        if (object != null) {
            object = ((CartOrder)object).getCode();
        } else {
            n3 = 0;
            object = null;
        }
        Object object3 = object;
        n3 = ((Consignment)object2).getShipmentPosition();
        Integer n4 = n3;
        String string3 = "";
        hN2.Ma((Consignment)object2, string2, (String)object, n4, string3);
    }
}

