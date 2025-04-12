/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yc0
 */
public final class yc0_1
extends RecyclerView$B {
    public final TextView a;
    public final ImageView b;
    public final TextView c;
    public final View d;
    public final View e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final View k;
    public final LinearLayout l;

    public yc0_1(View view) {
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.coupon_parent_container;
        this.l = linearLayout = (LinearLayout)view.findViewById(n3);
        n3 = R$id.coupon_title;
        linearLayout = (TextView)view.findViewById(n3);
        this.a = linearLayout;
        n3 = R$id.coupon_share;
        linearLayout = (ImageView)view.findViewById(n3);
        this.b = linearLayout;
        n3 = R$id.coupon_info;
        linearLayout = (TextView)view.findViewById(n3);
        this.c = linearLayout;
        n3 = R$id.coupon_offer_layout_shop;
        linearLayout = view.findViewById(n3);
        this.d = linearLayout;
        n3 = R$id.coupon_offer_layout_click_expanded;
        linearLayout = view.findViewById(n3);
        this.e = linearLayout;
        n3 = R$id.coupon_tnc;
        linearLayout = (TextView)view.findViewById(n3);
        this.f = linearLayout;
        n3 = R$id.coupon_expiry_days;
        linearLayout = (TextView)view.findViewById(n3);
        this.g = linearLayout;
        n3 = R$id.coupon_shop_info;
        linearLayout = (TextView)view.findViewById(n3);
        this.h = linearLayout;
        n3 = R$id.coupon_shop_btn;
        linearLayout = (TextView)view.findViewById(n3);
        this.i = linearLayout;
        n3 = R$id.coupon_expiry_text;
        linearLayout = (TextView)view.findViewById(n3);
        this.j = linearLayout;
        n3 = R$id.coupon_offer_layout_shop_bank;
        this.k = view = view.findViewById(n3);
    }
}

