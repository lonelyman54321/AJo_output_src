/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RatingBar
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.myaccount.order.fragment.b$c;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackOrderLayout;
import com.ril.ajio.services.data.Order.orderhistory.StatusHistory;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hf2
 */
public final class hf2_0
extends RecyclerView$B {
    public static final Hf2$a Companion;
    public final g82_0 a;
    public final R71 b;
    public final int c;
    public final View d;
    public final View e;
    public final CardView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final ImageView n;
    public final ImageView o;
    public final ScaleRatingBar p;
    public final TextView q;
    public final RatingBar r;
    public final LinearLayout s;
    public final LinearLayout t;
    public final TrackOrderLayout u;
    public final int v;
    public final ImageView w;
    public final TextView x;

    static {
        Hf2$a hf2$a;
        Companion = hf2$a = new Object();
    }

    public hf2_0(View view, if0_0 object, b$c object2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = object;
        this.b = object2;
        this.c = 500;
        int n3 = R$id.row_order_product_layout_track;
        object = view.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.d = object;
        n3 = R$id.row_order_layout_click;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.e = object;
        n3 = R$id.cv_container;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (CardView)((Object)object);
        this.f = object;
        n3 = R$id.row_order_product_lbl_refund;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.g = object;
        n3 = R$id.row_order_product_tv_refund_amount;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.h = object;
        n3 = R$id.row_order_product_tv_headerinfo;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.i = object;
        n3 = R$id.row_order_product_tv_info;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.j = object;
        n3 = R$id.row_order_product_tv_subinfo;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.k = object;
        n3 = R$id.row_order_product_tv_status;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.l = object;
        n3 = R$id.row_order_product_tv_exchange;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.m = object;
        n3 = R$id.row_order_product_imv_product;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ImageView)object;
        this.n = object;
        n3 = R$id.row_order_product_imv_track;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ImageView)object;
        this.o = object;
        n3 = R$id.rated_item_rating_bar;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ScaleRatingBar)((Object)object);
        this.p = object;
        n3 = R$id.you_rated_text_id;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.q = object;
        n3 = R$id.rate_this_product_rating_bar;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RatingBar)object;
        this.r = object;
        n3 = R$id.your_rating_ll;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.s = object;
        n3 = R$id.rate_this_product_ll;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        this.t = object;
        n3 = R$id.track_order_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TrackOrderLayout)((Object)object);
        this.u = object;
        object = view.getContext().getResources();
        int n4 = R$dimen.track_view_height;
        this.v = n3 = object.getDimensionPixelOffset(n4);
        n3 = R$id.priority_tag_iv;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ImageView)object;
        this.w = object;
        n3 = R$id.tvFreebies;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.x = view;
    }

    /*
     * Unable to fully structure code
     */
    public static ArrayList w(String var0, ArrayList var1_1) {
        var2_2 = new ArrayList<Object>();
        var3_3 = var1_1.size();
        var4_4 = null;
        var5_5 = null;
        var6_6 = null;
        var7_7 = null;
        block7: for (var8_8 = 0; var8_8 < var3_3; ++var8_8) {
            var9_9 = var1_1.get(var8_8);
            Intrinsics.checkNotNullExpressionValue(var9_9, "get(...)");
            var9_9 = (StatusHistory)var9_9;
            var10_10 = var9_9.getStatus();
            if (var10_10 == null) continue;
            var11_11 = var10_10.hashCode();
            switch (var11_11) {
                default: {
                    continue block7;
                }
                case 1982485311: {
                    var12_12 = "CONFIRMED";
                    var13_13 = var10_10.equals(var12_12);
                    if (!var13_13) {
                        continue block7;
                    }
                    ** GOTO lbl27
                }
                case 1746537160: {
                    var12_12 = "CREATED";
                    var13_13 = var10_10.equals(var12_12);
                    if (!var13_13) continue block7;
lbl27:
                    // 2 sources

                    var4_4 = var9_9;
                    continue block7;
                }
                case -1515427533: {
                    var12_12 = "SHIPPED";
                    var13_13 = var10_10.equals(var12_12);
                    if (!var13_13) continue block7;
                    var6_6 = var9_9;
                    continue block7;
                }
                case -1812315843: {
                    var12_12 = "OUT FOR DELIVERY";
                    var13_13 = var10_10.equals(var12_12);
                    if (!var13_13) continue block7;
                    var7_7 = var9_9;
                    continue block7;
                }
                case -1942536072: 
            }
            var12_12 = "PACKED";
            var13_13 = var10_10.equals(var12_12);
            if (!var13_13) continue;
            var5_5 = var9_9;
        }
        if (var4_4 != null) {
            var2_2.add(var4_4);
        }
        if (var5_5 != null) {
            var2_2.add(var5_5);
        }
        if (var6_6 != null) {
            var2_2.add(var6_6);
        }
        if (var7_7 != null) {
            var2_2.add(var7_7);
        }
        var1_1 = new StatusHistory();
        var1_1.setStatus("Arriving");
        var1_1.setUpdateDate(var0);
        var2_2.add(var1_1);
        return var2_2;
    }

    public final void x(int n3) {
        TrackOrderLayout trackOrderLayout = this.u;
        Object object = trackOrderLayout.getLayoutParams();
        boolean bl2 = object instanceof LinearLayout.LayoutParams;
        if (bl2) {
            object = trackOrderLayout.getLayoutParams();
            String string2 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
            Intrinsics.checkNotNull(object, string2);
            object = (LinearLayout.LayoutParams)object;
            object.height = n3;
            if (n3 == 0) {
                trackOrderLayout.b();
            }
        } else {
            object = trackOrderLayout.getLayoutParams();
            String string3 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
            Intrinsics.checkNotNull(object, string3);
            object = (ConstraintLayout$LayoutParams)((Object)object);
            object.height = n3;
            if (n3 == 0) {
                trackOrderLayout.b();
            }
        }
        trackOrderLayout.requestLayout();
    }
}

