/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PZ1
 */
public final class pz1_0
extends RecyclerView$B {
    public final q82_0 a;
    public final yi2_1 b;
    public final ImageView c;
    public final AjioTextView d;
    public final AjioTextView e;
    public final AjioTextView f;
    public final AjioTextView g;
    public final AjioTextView h;
    public final ConstraintLayout i;
    public ProductOptionVariant j;

    public pz1_0(View object, q82_0 object2, yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "onColorClickListener");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object2;
        this.b = yi2_12;
        object = this.itemView;
        int n3 = R$id.plp_row_product_iv;
        object = (ImageView)object.findViewById(n3);
        this.c = object;
        object = this.itemView;
        n3 = R$id.plp_row_brand_tv;
        object = object.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.d = object;
        object = this.itemView;
        int n4 = R$id.plp_row_prd_name_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.e = object;
        object = this.itemView;
        n4 = R$id.plp_row_final_price_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.f = object;
        object = this.itemView;
        n4 = R$id.plp_row_mrp_price_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.g = object;
        object = this.itemView;
        n4 = R$id.plp_row_discount_percent_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.h = object;
        object = this.itemView;
        n4 = R$id.constraint_oos_other_colours;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ConstraintLayout)((Object)object);
        this.i = object;
    }

    public final void w() {
        Object object;
        pz1_0 pz1_02 = this;
        Object object2 = this.b.x5();
        if (object2 == null) {
            object2 = new Product();
        }
        Product product = object2;
        object2 = this.x().getCode();
        product.setCode((String)object2);
        object2 = product.getFnlColorVariantData();
        if (object2 != null) {
            object = this.x().getCode();
            ((ProductFnlColorVariantData)object2).setColorGroup((String)object);
        }
        object2 = this.x().getWasPriceData();
        product.setWasPriceData((Price)object2);
        object2 = this.x().getPriceData();
        product.setPrice((Price)object2);
        object = object2 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        int n3 = product.getPosition();
        String string2 = ((NewEEcommerceEventsRevamp)object2).getEE_SELECT_ITEM();
        String string3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string4 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        String string5 = "PDP - OOS - Other Colours";
        String string6 = "PDP - OOS - Other Colours";
        String string7 = "bag screen";
        long l2 = 0L;
        int n4 = 4192848;
        NewEEcommerceEventsRevamp.pushEEProductSelect$default((NewEEcommerceEventsRevamp)object2, product, n3, string2, string5, null, string6, false, string3, string7, null, string4, null, null, false, null, null, l2, null, null, null, null, null, n4, null);
        object2 = this.x().getCode();
        if (object2 == null) {
            object2 = "";
        }
        pz1_02.a.c3((String)object2);
    }

    public final ProductOptionVariant x() {
        ProductOptionVariant productOptionVariant = this.j;
        if (productOptionVariant != null) {
            return productOptionVariant;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productOptionVariant");
        return null;
    }
}

