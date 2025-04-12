/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.handler.ImpressionTrackableAdapter;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bB2
 */
public final class bb2_1
extends ImpressionTrackableAdapter
implements M82 {
    public final U71 a;
    public final int b;
    public final k92_0 c;
    public final String d;
    public final Function0 e;

    public bb2_1(U71 u71, int n3, k92_0 k92_02, String string2, Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "handleImpression");
        this.a = u71;
        this.b = n3;
        this.c = k92_02;
        this.d = string2;
        this.e = function0;
    }

    public final void C(Product product, String string2) {
        k92_0 k92_02 = this.c;
        if (k92_02 != null) {
            int n3 = this.b;
            k92_02.Z2(product, n3, string2);
        }
    }

    public final void R4(Product product, String string2) {
        k92_0 k92_02 = this.c;
        if (k92_02 != null) {
            int n3 = this.b;
            k92_02.Z4(product, n3, string2);
        }
    }

    public final void S6(String charSequence, int n3, Product product, String object, SaleGAData saleGAData, String string2) {
        charSequence = new StringBuilder("pdp widget - ");
        object = this.d;
        ((StringBuilder)charSequence).append((String)object);
        charSequence = ((StringBuilder)charSequence).toString();
        object = this.c;
        if (object != null) {
            object.F(product, n3, (String)charSequence);
        }
    }

    public final int getItemCount() {
        int n3;
        int n4;
        Object object = this.a;
        if (object != null && (object = object.E(n4 = this.b)) != null && (object = ((RecentlyViewedProducts)object).getProducts()) != null) {
            n3 = object.size();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getItemViewType(int n3) {
        void var4_6;
        HomeWidgetTypes homeWidgetTypes;
        Product product;
        int n4;
        Object object = this.a;
        if (object != null && (object = object.E(n4 = this.b)) != null && (object = ((RecentlyViewedProducts)object).getProducts()) != null && (product = (Product)CollectionsKt.N(n3, (List)object)) != null && (homeWidgetTypes = product.getProductType()) != null) {
            return var4_6.getType();
        }
        HomeWidgetTypes homeWidgetTypes2 = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER;
        return var4_6.getType();
    }

    public final void h9(Product product, String string2) {
    }

    public final void n0() {
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n4 = recyclerView$B instanceof ab2_0;
        if (n4 != 0) {
            recyclerView$B = (ab2_0)recyclerView$B;
            recyclerView$B.getClass();
        } else {
            n4 = recyclerView$B instanceof vv2_1;
            if (n4 != 0) {
                Object object2;
                n4 = this.b;
                U71 u71 = this.a;
                Object object3 = null;
                Object object4 = u71 != null && (object2 = u71.E(n4)) != null && (object2 = ((RecentlyViewedProducts)object2).getProductUIModelList()) != null ? (object2 = (PlpProductUIModel)CollectionsKt.N(n3, (List)object2)) : null;
                if (u71 != null && (object = u71.E(n4)) != null && (object = ((RecentlyViewedProducts)object).getProducts()) != null) {
                    object3 = object = CollectionsKt.N(n3, (List)object);
                    object3 = (Product)object;
                }
                RecyclerView$B recyclerView$B2 = recyclerView$B;
                recyclerView$B2 = (vv2_1)recyclerView$B;
                ScreenType screenType = ScreenType.SCREEN_PLP;
                int n7 = 48;
                vv2_1.D((vv2_1)recyclerView$B2, n3, (Product)object3, (PlpProductUIModel)object4, screenType, null, n7);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        HomeWidgetTypes homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER;
        int n4 = homeWidgetTypes.getType();
        if (n3 == n4) {
            Object object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.shimmer_product_exit_intent;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object = new ab2_0((View)viewGroup);
            return object;
        }
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        n4 = R$layout.common_product_item_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new vv2_1((View)viewGroup);
        Intrinsics.checkNotNullParameter(this, "onPLPProductClickListener");
        object.h = this;
        object.j = false;
        object.t = true;
        return object;
    }

    public final void onImpressionItem(int n3) {
        this.e.invoke();
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        super.onViewAttachedToWindow(recyclerView$B);
    }
}

