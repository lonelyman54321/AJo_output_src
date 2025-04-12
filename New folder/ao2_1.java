/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Html
 *  android.view.View
 *  android.widget.TextView
 */
import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Order.ReturnRefundBodyLink;
import com.ril.ajio.services.data.Order.ReturnRefundPickUpReason;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aO2
 */
public final class ao2_1
extends vw_0 {
    public final TextView a;
    public final TextView b;

    public ao2_1(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.reason_title;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.a = view2;
        n3 = R$id.reason_points;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.b = view;
    }

    public final void w(Object object, Object object2) {
        int n3;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData");
        object = ((pa2_0)object).b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Order.ReturnRefundPickUpReason");
        object = (ReturnRefundPickUpReason)object;
        object2 = ((ReturnRefundPickUpReason)object).getPickUpHeader();
        TextView textView = this.a;
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            object2 = ((ReturnRefundPickUpReason)object).getPickUpHeader();
            textView.setText((CharSequence)object2);
        } else {
            n3 = 8;
            textView.setVisibility(n3);
        }
        object2 = ((ReturnRefundPickUpReason)object).getBodyContent();
        if (object2 != null) {
            object2 = ((ReturnRefundPickUpReason)object).getBodyContent();
            Intrinsics.checkNotNull(object2);
            n3 = ((ArrayList)object2).size();
            if (n3 > 0) {
                object2 = ((ReturnRefundPickUpReason)object).getBodyContent();
                Intrinsics.checkNotNull(object2);
                n3 = ((ArrayList)object2).size();
                int n4 = 1;
                TextView textView2 = this.b;
                if (n3 == n4) {
                    object = ((ReturnRefundPickUpReason)object).getBodyContent();
                    Intrinsics.checkNotNull(object);
                    object = ((ReturnRefundBodyLink)((ArrayList)object).get(0)).getMessage();
                    textView2.setText((CharSequence)object);
                } else {
                    object2 = new StringBuilder();
                    ArrayList arrayList = ((ReturnRefundPickUpReason)object).getBodyContent();
                    Intrinsics.checkNotNull(arrayList);
                    int n7 = arrayList.size();
                    for (int i3 = 0; i3 < n7; ++i3) {
                        Object object3 = ((ReturnRefundPickUpReason)object).getBodyContent();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((ArrayList)object3).get(i3);
                        Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
                        object3 = ((ReturnRefundBodyLink)object3).getMessage();
                        String string2 = "&#8226;  ";
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        stringBuilder.append((String)object3);
                        object3 = stringBuilder.toString();
                        ((StringBuilder)object2).append((String)object3);
                        object3 = ((ReturnRefundPickUpReason)object).getBodyContent();
                        Intrinsics.checkNotNull(object3);
                        int n8 = ((ArrayList)object3).size() - n4;
                        if (i3 == n8) continue;
                        object3 = "<br/>";
                        ((StringBuilder)object2).append((String)object3);
                    }
                    int n10 = Build.VERSION.SDK_INT;
                    n4 = 24;
                    object = n10 >= n4 ? jC2.a(((StringBuilder)object2).toString()) : Html.fromHtml((String)((StringBuilder)object2).toString());
                    textView2.setText((CharSequence)object);
                }
            }
        }
    }
}

