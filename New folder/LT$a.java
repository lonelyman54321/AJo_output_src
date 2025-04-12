/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class LT$a
extends RecyclerView$B {
    public final RadioButton a;
    public final AjioTextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;

    public LT$a(LT lT, View view) {
        Object object;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.shipping_address_radioBtn;
        this.a = object = (RadioButton)view.findViewById(n3);
        n3 = R$id.shipping_address_lbl_edit;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.b = object;
        int n4 = R$id.shipping_address_tv_name;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.c = view2;
        n4 = R$id.shipping_address_lbl_default;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.d = view2;
        n4 = R$id.shipping_address_tv_address;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.e = view2;
        n4 = R$id.shipping_address_tv_mobile;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.f = view2;
        n4 = R$id.row_shipping_address;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.g = view;
        view.setOnClickListener((View.OnClickListener)lT);
        object.setOnClickListener((View.OnClickListener)lT);
    }
}

