/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnRefundBodyLink;
import com.ril.ajio.services.data.Order.ReturnRefundBottomLink;
import com.ril.ajio.services.data.Order.ReturnRefundNewReturnCreation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NN2
 */
public final class nn2_2
extends vw_0 {
    public final HN2 a;
    public final AjioTextView b;
    public final AjioTextView c;
    public final View d;
    public final LinearLayout e;
    public final AjioTextView f;
    public final AjioTextView g;

    public nn2_2(View object, HN2 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object2;
        int n3 = R$id.new_return_title_tv;
        this.b = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.new_return_subtitle_tv;
        this.c = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.divider;
        object2 = object.findViewById(n3);
        this.d = object2;
        n3 = R$id.link_container;
        object2 = (LinearLayout)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.link_one;
        this.f = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.link_two;
        object = (AjioTextView)object.findViewById(n3);
        this.g = object;
    }

    public final void w(Object object, Object object2) {
        int n3;
        Object object3;
        int n4;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData");
        object = (pa2_0)object;
        object2 = ((pa2_0)object).b;
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.ReturnRefundNewReturnCreation");
        object2 = (ReturnRefundNewReturnCreation)object2;
        Object object4 = ((pa2_0)object).d;
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.Consignment");
        object4 = (Consignment)object4;
        Object object5 = ((ReturnRefundNewReturnCreation)object2).getHeaderMessage();
        if (object5 != null && (n4 = ((String)object5).length()) != 0) {
            object5 = ((ReturnRefundNewReturnCreation)object2).getHeaderMessage();
            object3 = this.b;
            object3.setText((CharSequence)object5);
            object3.setVisibility(0);
        }
        object5 = new StringBuilder();
        object3 = ((ReturnRefundNewReturnCreation)object2).getBodyContent();
        if (object3 != null && (n3 = ((ArrayList)object3).size()) > 0) {
            boolean bl2;
            AjioTextView ajioTextView = this.c;
            ajioTextView.setVisibility(0);
            object3 = ((ArrayList)object3).iterator();
            String string2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            while (bl2 = object3.hasNext()) {
                string2 = object3.next();
                Intrinsics.checkNotNullExpressionValue(string2, "next(...)");
                string2 = ((ReturnRefundBodyLink)((Object)string2)).getMessage();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("\n");
                string2 = stringBuilder.toString();
                ((StringBuilder)object5).append(string2);
            }
            ajioTextView.setText((CharSequence)object5);
        }
        if ((object2 = ((ReturnRefundNewReturnCreation)object2).getBottomLinkContent()) != null && (n4 = ((ArrayList)object2).size()) > 0) {
            int n7;
            this.e.setVisibility(0);
            this.d.setVisibility(0);
            object5 = ((ReturnRefundBottomLink)((ArrayList)object2).get(0)).getBottomHeader();
            object = ((pa2_0)object).c;
            if (object5 != null && (n4 = ((String)object5).length()) != 0) {
                object5 = ((ReturnRefundBottomLink)((ArrayList)object2).get(0)).getBottomHeader();
                object3 = this.f;
                object3.setText((CharSequence)object5);
                object3.setVisibility(0);
                object5 = new ln2_0((ArrayList)object2, this, (Consignment)object4, (CartOrder)object);
                object3.setOnClickListener((View.OnClickListener)object5);
            }
            if ((n4 = ((ArrayList)object2).size()) > (n7 = 1) && (object5 = ((ReturnRefundBottomLink)((ArrayList)object2).get(n7)).getBottomHeader()) != null && (n4 = ((String)object5).length()) != 0) {
                object5 = ((ReturnRefundBottomLink)((ArrayList)object2).get(n7)).getBottomHeader();
                object3 = this.g;
                object3.setText((CharSequence)object5);
                object3.setVisibility(0);
                object5 = new mn2_0((ArrayList)object2, this, (Consignment)object4, (CartOrder)object);
                object3.setOnClickListener((View.OnClickListener)object5);
            }
        }
    }
}

