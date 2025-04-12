/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BN$a
 */
public final class bn$a_1
extends RecyclerView$B {
    public final TextView a;
    public final TextView b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ConstraintLayout g;

    public bn$a_1(bn_1 bn_12, View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.shipping_address_tv_name;
        View view = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.a = view;
        n3 = R$id.shipping_address_lbl_default;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.b = view;
        n3 = R$id.view_empty_space;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.c = view;
        n3 = R$id.shipping_address_tv_address;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.d = view;
        n3 = R$id.shipping_address_tv_mobile;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.e = view;
        n3 = R$id.shipping_address_address_pincode;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.f = view;
        n3 = R$id.row_shipping_address;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ConstraintLayout)((Object)object);
        this.g = object;
        object.setOnClickListener((View.OnClickListener)bn_12);
    }
}

