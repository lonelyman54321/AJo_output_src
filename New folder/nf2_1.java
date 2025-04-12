/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RatingBar
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.myaccount.order.fragment.b$c;
import com.willy.ratingbar.ScaleRatingBar;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nf2
 */
public final class nf2_1
extends RecyclerView$B {
    public static final /* synthetic */ int s;
    public final g82_0 a;
    public final R71 b;
    public final View c;
    public final CardView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final ImageView k;
    public final ImageView l;
    public final ScaleRatingBar m;
    public final RatingBar n;
    public final LinearLayout o;
    public final LinearLayout p;
    public final TextView q;
    public final ImageView r;

    public nf2_1(View view, if0_0 object, b$c object2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = object;
        this.b = object2;
        int n3 = R$id.row_order_layout_click;
        object = view.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.c = object;
        n3 = R$id.cv_container;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (CardView)((Object)object);
        this.d = object;
        n3 = R$id.row_order_product_lbl_refund_new;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.e = object;
        n3 = R$id.row_order_product_tv_refund_amount_new;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.f = object;
        n3 = R$id.row_order_product_tv_headerinfo;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.g = object;
        n3 = R$id.row_order_product_tv_info;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.h = object;
        n3 = R$id.row_order_product_tv_status;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.i = object;
        n3 = R$id.row_order_product_tv_exchange;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.j = object;
        n3 = R$id.row_order_product_imv_product;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ImageView)object;
        this.k = object;
        n3 = R$id.row_order_product_imv_arrow;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ImageView)object;
        this.l = object;
        n3 = R$id.rated_item_rating_bar;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ScaleRatingBar)((Object)object);
        this.m = object;
        n3 = R$id.rate_this_product_rating_bar;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RatingBar)object;
        this.n = object;
        n3 = R$id.your_rating_ll;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.o = object;
        n3 = R$id.rate_this_product_ll;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.p = object;
        n3 = R$id.row_order_imps_failed_info;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.q = object;
        n3 = R$id.priority_tag_iv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (ImageView)view;
        this.r = view;
    }
}

