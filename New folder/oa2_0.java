/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oa2
 */
public final class oa2_0 {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ConstraintLayout g;
    public final TextView h;
    public final ImageView i;

    public oa2_0(View view) {
        Intrinsics.checkNotNullParameter(view, "rowView");
        int n3 = R$id.row_order_confirm_imv_product;
        Object object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.a = object;
        n3 = R$id.row_order_confirm_lbl_exclusive;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.b = object;
        n3 = R$id.row_order_confirm_tv_name;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.c = object;
        n3 = R$id.row_order_confirm_tv_size;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.d = object;
        n3 = R$id.row_order_confirm_tv_delivery;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.e = object;
        n3 = R$id.row_order_confirm_tv_brand;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.f = object;
        n3 = R$id.free_tag;
        object = (ConstraintLayout)view.findViewById(n3);
        this.g = object;
        n3 = R$id.freeTagText;
        object = (TextView)view.findViewById(n3);
        this.h = object;
        n3 = R$id.iv_pd_delivery_alert;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (ImageView)view;
        this.i = view;
    }

    public final void a(String string2) {
        int n3;
        TextView textView = this.e;
        if (string2 != null && (n3 = string2.length()) != 0) {
            textView.setText((CharSequence)string2);
            ai0_2.B((View)textView);
        } else {
            string2 = "";
            textView.setText((CharSequence)string2);
            ai0_2.i((View)textView);
        }
    }
}

