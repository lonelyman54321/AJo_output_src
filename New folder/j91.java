/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$layout;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class j91
extends RecyclerView$f {
    public final U71 a;
    public final HomeRowData b;
    public final int c;
    public final x82_0 d;

    public j91(U71 u71, HomeRowData homeRowData, int n3, x82_0 x82_02) {
        this.a = u71;
        this.b = homeRowData;
        this.c = n3;
        this.d = x82_02;
    }

    public final int getItemCount() {
        boolean bl2;
        Object object;
        int n3;
        Object object2;
        j91 j912 = this;
        boolean bl3 = false;
        Object object3 = null;
        int n4 = this.c;
        U71 u71 = this.a;
        if (u71 != null && (object2 = u71.E(n4)) != null && (object2 = ((RecentlyViewedProducts)object2).getProductUIModelList()) != null) {
            n3 = object2.size();
        } else {
            n3 = 0;
            object2 = null;
        }
        Object object4 = j912.b;
        if (object4 != null && (object4 = ((HomeRowData)object4).getBanners()) != null && (object4 = (BannerData)CollectionsKt.N(0, (List)object4)) != null && (object4 = ((BannerData)object4).getCtaSettings()) != null) {
            object4 = ((CTASettings)object4).getEnable();
            object = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object4, object);
        } else {
            bl2 = false;
            object4 = null;
        }
        if (bl2) {
            Object object5;
            if (n3 > 0) {
                int n7;
                bl2 = false;
                object4 = null;
                object = u71 != null && (object = u71.E(n4)) != null && (object = ((RecentlyViewedProducts)object).getProductUIModelList()) != null && (object = (PlpProductUIModel)CollectionsKt.N(n7 = n3 + -1, (List)object)) != null ? ((PlpProductUIModel)object).getProductType() : null;
                if (object != (object5 = HomeWidgetTypes.HOME_WIDGET_TYPE_EXPLORE_ALL)) {
                    if (u71 != null && (object = u71.E(n4)) != null && (object = ((RecentlyViewedProducts)object).getProductUIModelList()) != null && (object = (PlpProductUIModel)CollectionsKt.N(n7 = n3 + -1, (List)object)) != null) {
                        object4 = ((PlpProductUIModel)object).getProductType();
                    }
                    if (object4 != (object = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER)) {
                        bl3 = true;
                    }
                }
            }
            if (bl3) {
                Object object6;
                object3 = new Product();
                object4 = HomeWidgetTypes.HOME_WIDGET_TYPE_EXPLORE_ALL;
                ((Product)object3).setProductType((HomeWidgetTypes)((Object)object4));
                if (u71 != null && (object = u71.E(n4)) != null && (object = ((RecentlyViewedProducts)object).getProducts()) != null) {
                    object.add(object3);
                }
                object5 = object3;
                int n8 = -1;
                int n10 = -1;
                int n14 = -1 >>> 4;
                long l2 = 0L;
                int n15 = -1;
                int n16 = -1;
                object3 = new PlpProductUIModel(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, l2, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, n15, n16, n8, n10, n14, null);
                ((PlpProductUIModel)object3).setProductType((HomeWidgetTypes)((Object)object4));
                if (u71 != null && (object6 = u71.E(n4)) != null && (object6 = ((RecentlyViewedProducts)object6).getProductUIModelList()) != null) {
                    object6.add(object3);
                }
                ++n3;
            }
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
        PlpProductUIModel plpProductUIModel;
        int n4;
        Object object = this.a;
        if (object != null && (object = object.E(n4 = this.c)) != null && (object = ((RecentlyViewedProducts)object).getProductUIModelList()) != null && (plpProductUIModel = (PlpProductUIModel)CollectionsKt.N(n3, (List)object)) != null && (homeWidgetTypes = plpProductUIModel.getProductType()) != null) {
            return var4_6.getType();
        }
        HomeWidgetTypes homeWidgetTypes2 = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER;
        return var4_6.getType();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = object instanceof i91;
        if (n4 != 0) {
            object = (i91)object;
            object.getClass();
            hv3_0 hv3_02 = hv3_0.a;
            View view = ((i91)object).f;
            View view2 = ((i91)object).g;
            object2 = ((i91)object).c;
            ConstraintLayout constraintLayout = ((i91)object).d;
            boolean bl2 = ((i91)object).b;
            ConstraintLayout constraintLayout2 = ((i91)object).e;
            View view3 = ((i91)object).h;
            View view4 = ((i91)object).i;
            hv3_0.q0((ShimmerFrameLayout)((Object)object2), (View)constraintLayout, bl2, constraintLayout2, view, view2, view3, view4);
        } else {
            n4 = object instanceof vv2_1;
            Object object3 = null;
            if (n4 != 0) {
                Object object4;
                n4 = this.c;
                U71 u71 = this.a;
                Object object5 = u71 != null && (object4 = u71.E(n4)) != null && (object4 = ((RecentlyViewedProducts)object4).getProductUIModelList()) != null ? (object4 = (PlpProductUIModel)CollectionsKt.N(n3, (List)object4)) : null;
                if (u71 != null && (object2 = u71.E(n4)) != null && (object2 = ((RecentlyViewedProducts)object2).getProducts()) != null) {
                    object3 = object2 = CollectionsKt.N(n3, (List)object2);
                    object3 = (Product)object2;
                }
                Object object6 = object3;
                RecyclerView$B recyclerView$B = object;
                recyclerView$B = (vv2_1)object;
                ScreenType screenType = ScreenType.SCREEN_PLP;
                int n7 = 48;
                vv2_1.D((vv2_1)recyclerView$B, n3, (Product)object3, (PlpProductUIModel)object5, screenType, null, n7);
            } else {
                n3 = object instanceof mf0_1;
                if (n3 != 0) {
                    object = (mf0_1)object;
                    object.getClass();
                    n4 = 1;
                    Object object7 = new oW((RecyclerView$B)object, n4);
                    object2 = ((mf0_1)object).g;
                    object2.setOnClickListener((View.OnClickListener)object7);
                    object7 = ((mf0_1)object).b;
                    if (object7 != null && (object7 = ((HomeRowData)object7).getBanners()) != null) {
                        n4 = 0;
                        object2 = null;
                        if ((object7 = (BannerData)CollectionsKt.N(0, (List)object7)) != null && (object7 = ((BannerData)object7).getCtaSettings()) != null) {
                            object3 = ((CTASettings)object7).getCtaText();
                        }
                    }
                    object = ((mf0_1)object).h;
                    object.setText((CharSequence)object3);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        int n4;
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        HomeWidgetTypes homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER;
        int n7 = homeWidgetTypes.getType();
        if (n3 == n7) {
            Object object2;
            n3 = (int)(og1_1.c() ? 1 : 0);
            if (n3 != 0) {
                object2 = LayoutInflater.from((Context)viewGroup.getContext());
                n7 = R$layout.luxe_product_shimmer;
                viewGroup = object2.inflate(n7, viewGroup, false);
            } else {
                object2 = LayoutInflater.from((Context)viewGroup.getContext());
                n7 = R$layout.product_shimmer;
                viewGroup = object2.inflate(n7, viewGroup, false);
            }
            Intrinsics.checkNotNull(viewGroup);
            object2 = new i91((View)viewGroup, false);
            return object2;
        }
        homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_EXPLORE_ALL;
        n7 = homeWidgetTypes.getType();
        HomeRowData homeRowData = this.b;
        x82_0 x82_02 = this.d;
        if (n3 == n7) {
            Object object3;
            n3 = (int)(og1_1.c() ? 1 : 0);
            if (n3 != 0) {
                object3 = LayoutInflater.from((Context)viewGroup.getContext());
                n7 = R$layout.item_dynamic_widget_explore_luxe;
                viewGroup = object3.inflate(n7, viewGroup, false);
            } else {
                object3 = LayoutInflater.from((Context)viewGroup.getContext());
                n7 = R$layout.item_dynamic_widget_explore_all;
                viewGroup = object3.inflate(n7, viewGroup, false);
            }
            Intrinsics.checkNotNull(viewGroup);
            object3 = new mf0_1((View)viewGroup, homeRowData, x82_02);
            return object3;
        }
        n3 = (int)(og1_1.c() ? 1 : 0);
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n7 = R$layout.common_product_item_view;
            viewGroup = object.inflate(n7, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n7 = R$layout.common_product_item_view;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        object = new vv2_1((View)viewGroup);
        object.d = x82_02;
        object.o = n4 = this.c;
        object.f = homeRowData;
        object.s = true;
        return object;
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        super.onViewAttachedToWindow(recyclerView$B);
    }
}

