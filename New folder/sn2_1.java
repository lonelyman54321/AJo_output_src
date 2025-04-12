/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from SN2
 */
public final class sn2_1
extends vw_0 {
    public final AjioTextView a;
    public final AjioTextView b;
    public RecyclerView c;

    public sn2_1(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.tv_shipping_address;
        Object object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (AjioTextView)object2;
        this.a = object2;
        n3 = R$id.tv_phone_number;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.b = object;
    }

    public final void w(Object object, Object object2) {
        Context context;
        int n3;
        int n4;
        object2 = null;
        int n7 = 1;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData");
        object = (pa2_0)object;
        Object object3 = ((pa2_0)object).a;
        if (object3 != null && (n4 = ((Integer)object3).intValue()) == (n3 = 20)) {
            object3 = this.itemView;
            n3 = R$id.recycler_view;
            this.c = object3 = (RecyclerView)object3.findViewById(n3);
            object3 = ((pa2_0)object).d;
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.String");
            object3 = (String)object3;
            int n8 = R$string.not_shipped_info_1;
            Object object4 = hv3_0.K(n8);
            context = new ro1_0("1.", (String)object4);
            int n10 = R$string.not_shipped_info_2;
            Object object5 = new Object[n7];
            object5[0] = object3;
            Object object6 = hv3_0.L(n10, object5);
            object4 = new ro1_0("2.", (String)object6);
            int n14 = R$string.not_shipped_info_3;
            object5 = hv3_0.K(n14);
            object6 = new ro1_0("3.", (String)object5);
            Object object7 = hv3_0.K(R$string.not_shipped_info_4);
            String string2 = "4.";
            object5 = new ro1_0(string2, (String)object7);
            int n15 = 4;
            object7 = new ro1_0[n15];
            object7[0] = context;
            object7[n7] = object4;
            object7[2] = object6;
            object7[3] = object5;
            context = xx_2.i(object7);
            object6 = ye_0.NOT_SHIPPED_YET_VIEW_HOLDER;
            object4 = new ae_2((List)context, (ye_0)((Object)object6), (String)object3);
            object3 = this.c;
            n3 = 0;
            context = null;
            object6 = "recyclerView";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n4 = 0;
                object3 = null;
            }
            ((RecyclerView)object3).setHasFixedSize(n7 != 0);
            object7 = this.c;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            } else {
                context = object7;
            }
            context = context.getContext();
            object5 = new LinearLayoutManager(context, n7, false);
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object5);
            ((RecyclerView)object3).setAdapter((RecyclerView$f)object4);
        }
        if ((n4 = (object = ((pa2_0)object).b) instanceof CartDeliveryAddress) != 0) {
            object3 = ((CartDeliveryAddress)(object = (CartDeliveryAddress)object)).getPhone();
            if (object3 != null && (n4 = (int)(kotlin.text.b.k((CharSequence)object3) ? 1 : 0)) == 0) {
                n4 = R$string.phone_format;
                context = ((CartDeliveryAddress)object).getPhone();
                Object object8 = new Object[n7];
                object8[0] = context;
                object2 = hv3_0.L(n4, object8);
                object8 = this.b;
                object8.setText((CharSequence)object2);
            }
            object2 = this.a;
            object = ai0_2.g((CartDeliveryAddress)object);
            object2.setText((CharSequence)object);
        }
    }
}

