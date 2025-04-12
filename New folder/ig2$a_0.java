/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.Unit;

/*
 * Renamed from ig2$a
 */
public final class ig2$a_0
implements fs0_2 {
    public final /* synthetic */ bg2_1 a;

    public ig2$a_0(bg2_1 bg2_12) {
        this.a = bg2_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3;
        int n4;
        object = (ReturnRequest)object;
        object2 = this.a;
        Object object3 = (CartOrder)((bg2_1)object2).Pa().l.getValue();
        if (object3 != null && (n4 = ((CartOrder)object3).isReturnRevampNewFlowEnabled()) == (n3 = 1) && (n4 = hv3_0.D()) != 0 && (n4 = TextUtils.isEmpty((CharSequence)(object3 = ((ReturnRequest)object).getReturnId()))) == 0) {
            object3 = new Bundle();
            object = ((ReturnRequest)object).getReturnId();
            object3.putString("return_refund_return_id", (String)object);
            object = (String)((bg2_1)object2).Pa().d.getValue();
            object3.putString("product_code", (String)object);
            object = ((bg2_1)object2).Pa().g;
            String string2 = "clicked_item_code";
            object3.putString(string2, (String)object);
            object = ((bg2_1)object2).j;
            if (object != null) {
                object2 = b.Z;
                n3 = 2;
                object.onFragmentInteraction((String)object2, n3, (Bundle)object3);
            }
        }
        return Unit.a;
    }
}

