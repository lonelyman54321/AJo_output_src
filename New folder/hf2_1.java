/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hF2
 */
public final class hf2_1
extends RecyclerView$B
implements View.OnClickListener {
    public final x82_0 a;
    public final r82_0 b;
    public final String c;
    public final HashMap d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final View h;
    public final View i;
    public final ImageView j;
    public final ImageView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final AjioTextView p;
    public final AjioTextView q;
    public String r;
    public Product s;

    public hf2_1(View view, x82_0 object, r82_0 r82_02, String string2, HashMap hashMap, long l2, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = object;
        this.b = r82_02;
        this.c = string2;
        this.d = hashMap;
        this.e = l2;
        this.f = bl2;
        this.g = bl3;
        view = this.itemView;
        int n3 = R$id.lrv_layout_price_drop;
        this.h = view = view.findViewById(n3);
        view = this.itemView;
        n3 = R$id.row_shop_the_look;
        view = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        this.i = view;
        view = this.itemView;
        int n4 = R$id.row_stl_imv_promo;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (ImageView)view;
        this.j = view;
        view = this.itemView;
        n4 = R$id.capsule_image;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (ImageView)view;
        this.k = view;
        r82_02 = this.itemView;
        int n7 = R$id.capsule_item_brand_name;
        r82_02 = r82_02.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(r82_02, (String)object);
        r82_02 = (TextView)r82_02;
        this.l = r82_02;
        r82_02 = this.itemView;
        n7 = R$id.capsule_item_name;
        r82_02 = (TextView)r82_02.findViewById(n7);
        this.m = r82_02;
        r82_02 = this.itemView;
        n7 = R$id.capsule_item_price;
        r82_02 = r82_02.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(r82_02, (String)object);
        r82_02 = (TextView)r82_02;
        this.n = r82_02;
        r82_02 = this.itemView;
        n7 = R$id.capsule_item_old_price;
        r82_02 = r82_02.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(r82_02, (String)object);
        r82_02 = (TextView)r82_02;
        this.o = r82_02;
        object = this.itemView;
        n4 = R$id.lrv_tv_price_drop_value;
        this.p = object = (AjioTextView)object.findViewById(n4);
        object = this.itemView;
        n4 = R$id.lrv_tv_exclusive;
        this.q = object = (AjioTextView)object.findViewById(n4);
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View view) {
        String string2;
        String string3;
        String string4;
        int n3;
        Object object;
        Product product;
        hf2_1 hf2_12 = this;
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, "v");
        view.getId();
        Object object3 = this.s;
        object2 = null;
        if (object3 == null) {
            object3 = "product";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            product = null;
        } else {
            product = object3;
        }
        object3 = hf2_12.a;
        if (object3 != null) {
            object = hf2_12.r;
            product.setCode((String)object);
            object = hf2_12.r;
            Intrinsics.checkNotNull(object);
            n3 = this.getAdapterPosition();
            object3.d((String)object, product, n3, null);
        } else {
            object3 = hf2_12.b;
            if (object3 != null) {
                object = AnalyticsManager.Companion;
                Object object4 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                int n4 = this.getAdapterPosition();
                string4 = hj0_0.a(n4, "Recently Viewed/Product_click/");
                string3 = product.getName();
                object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
                ((GTMEvents)object4).pushButtonTapEvent(string4, string3, (String)object);
                object4 = product.getFnlColorVariantData();
                if (object4 != null) {
                    object2 = ((ProductFnlColorVariantData)object4).getColorGroup();
                }
                int n7 = this.getAdapterPosition();
                String string5 = hf2_12.c;
                String string6 = "recently_viewed";
                string2 = "productdetailspage";
                int n8 = -1;
                object = new hp1_2(string2, (String)object2, n7, null, string5, n8, null, string6);
                object3.La((hp1_2)object);
            }
        }
        object3 = AnalyticsManager.Companion;
        object = object2 = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp();
        n3 = product.getPosition();
        string4 = ((NewEEcommerceEventsRevamp)object2).getEE_SELECT_ITEM();
        string3 = av_0.a((AnalyticsManager$Companion)object3);
        string2 = av_0.a((AnalyticsManager$Companion)object3);
        String string7 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string8 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object2, product, n3, string4, string3, null, string2, false, string7, "bag screen", null, string8, null, null, false, null, null, 0L, null, null, null, null, null, 4192848, null);
    }
}

