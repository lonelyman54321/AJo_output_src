/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CU1$a
 */
public final class cu1$a_0
extends RecyclerView$B {
    public final TextView a;
    public final ImageView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final PesdkLoyaltyCardInfoView f;

    public cu1$a_0(cu1_1 cu1_12, View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.item_view_name;
        View view2 = view.findViewById(n3);
        Object object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, object);
        view2 = (TextView)view2;
        this.a = view2;
        n3 = R$id.item_view_img;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, object);
        view2 = (ImageView)view2;
        this.b = view2;
        n3 = R$id.nb_proceed_button;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, object);
        view2 = (LinearLayout)view2;
        this.c = view2;
        int n4 = R$id.nb_proceed_button_tv;
        View view3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view3, object);
        view3 = (TextView)view3;
        this.d = view3;
        n4 = R$id.pf_container;
        view3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view3, object);
        view3 = (TextView)view3;
        this.e = view3;
        int n7 = R$id.layout_loyaltyCardInfo;
        object = (PesdkLoyaltyCardInfoView)view.findViewById(n7);
        this.f = object;
        view3.setVisibility(8);
        super(cu1_12, view);
        view2.setOnClickListener((View.OnClickListener)object);
    }
}

