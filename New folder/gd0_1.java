/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GD0
 */
public final class gd0_1
extends RecyclerView$B {
    public final k82_0 a;
    public final ReturnOrderItemDetails b;
    public final boolean c;
    public final HashMap d;
    public final AjioRoundedCornerImageView e;
    public final RelativeLayout f;
    public final AjioTextView g;
    public final AjioTextView h;
    public final AjioTextView i;
    public final AjioTextView j;
    public final AjioTextView k;
    public final AjioCircularImageView l;
    public final AjioTextView m;
    public final AjioTextView n;
    public final View o;
    public final AjioTextView p;
    public final AjioTextView q;
    public final AjioTextView r;
    public final LinearLayout s;

    public gd0_1(View view, k82_0 object, ReturnOrderItemDetails object2, boolean bl2, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = object;
        this.b = object2;
        this.c = bl2;
        this.d = hashMap;
        int n3 = R$id.img_product;
        object = view.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioRoundedCornerImageView)((Object)object);
        this.e = object;
        n3 = R$id.exchange_items_details_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RelativeLayout)object;
        this.f = object;
        n3 = R$id.data_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RelativeLayout)object;
        n3 = R$id.item_name;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.g = object;
        n3 = R$id.size;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.h = object;
        n3 = R$id.quantity;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.i = object;
        n3 = R$id.quantity_label;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.j = object;
        n3 = R$id.return_exchange_message_tv;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.k = object;
        n3 = R$id.selected_icon_exchange;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioCircularImageView)((Object)object);
        this.l = object;
        n3 = R$id.item_actual_cost;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.m = object;
        n3 = R$id.item_original_price;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.n = object;
        n3 = R$id.rpp_layout_ras;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.o = object;
        n3 = R$id.rpp_tv_ras_info;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.p = object;
        n3 = R$id.tv_view_breakup;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.q = object;
        n3 = R$id.tv_brand_name;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.r = object;
        n3 = R$id.li_convenience_fee;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (LinearLayout)view;
        this.s = view;
    }

    public final void w(CartEntry object, View object2, int n3) {
        Serializable serializable;
        ReturnOrderItemDetails returnOrderItemDetails = this.b;
        if (returnOrderItemDetails != null && (serializable = returnOrderItemDetails.getSelectedList()) != null) {
            boolean n4 = serializable.containsKey(object);
            serializable = Boolean.valueOf(n4);
        } else {
            boolean bl2 = false;
            serializable = null;
        }
        Intrinsics.checkNotNull(serializable);
        boolean bl3 = (Boolean)serializable;
        RelativeLayout relativeLayout = this.f;
        String string2 = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.AjioCircularImageView";
        if (bl3) {
            Intrinsics.checkNotNull(object2, string2);
            object2 = (AjioCircularImageView)((Object)object2);
            n3 = R$drawable.rounded_rect_4_black_stroke;
            ((AppCompatImageView)((Object)object2)).setBackgroundResource(n3);
            n3 = R$color.accent_color_11;
            ((AppCompatImageView)((Object)object2)).setImageResource(n3);
            if (returnOrderItemDetails != null && (object2 = returnOrderItemDetails.getSelectedList()) != null) {
                object = (Integer)((HashMap)object2).remove(object);
            }
            int n4 = R$drawable.select_product_bg;
            relativeLayout.setBackgroundResource(n4);
        } else {
            Intrinsics.checkNotNull(object2, string2);
            object2 = (AjioCircularImageView)((Object)object2);
            int n7 = R$drawable.rounded_rect_black_bg;
            ((AppCompatImageView)((Object)object2)).setBackgroundResource(n7);
            int n8 = R$drawable.ic_done;
            ((AppCompatImageView)((Object)object2)).setImageResource(n8);
            if (returnOrderItemDetails != null && (object2 = returnOrderItemDetails.getSelectedList()) != null) {
                Integer n10 = n3;
                object = ((HashMap)object2).put(object, n10);
            }
            int n14 = R$drawable.select_product_bg_border;
            relativeLayout.setBackgroundResource(n14);
        }
        object = this.a;
        if (object != null) {
            object.k0();
        }
    }
}

