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
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from eg2
 */
public final class eg2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ bg2_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public eg2_2(bg2_1 bg2_12, String string2, String string3, String string4, f80_0 f80_02) {
        this.a = bg2_12;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        bg2_1 bg2_12 = this.a;
        String string4 = this.b;
        object = new eg2_2(bg2_12, string4, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (eg2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((eg2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        boolean bl3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = (CartOrder)((bg2_1)object).Pa().l.getValue();
        if (object2 != null && (bl3 = ((CartOrder)object2).isReturnRevampNewFlowEnabled()) == (bl2 = true) && (bl3 = hv3_0.D()) && !(bl2 = TextUtils.isEmpty((CharSequence)(object2 = this.b)))) {
            object2 = E1.a("return_refund_return_id", (String)object2);
            String string2 = this.c;
            object2.putString("product_code", string2);
            String string3 = "clicked_item_code";
            string2 = this.d;
            object2.putString(string3, string2);
            object = ((bg2_1)object).j;
            if (object != null) {
                string3 = com.ril.ajio.myaccount.order.fragment.b.Z;
                int n3 = 2;
                object.onFragmentInteraction(string3, n3, (Bundle)object2);
            }
        }
        return Unit.a;
    }
}

