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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.options.CuratedImage;
import com.ril.ajio.services.data.options.CuratedLayoutType;
import com.ril.ajio.services.data.options.CuratedWidget;
import com.ril.ajio.services.data.options.CuratedWidgetItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class i71
extends RecyclerView$f {
    public final U71 a;
    public final HomeRowData b;
    public final int c;
    public final kc1_2 d;

    public i71(U71 u71, HomeRowData homeRowData, int n3, kc1_2 kc1_22) {
        this.a = u71;
        this.b = homeRowData;
        this.c = n3;
        this.d = kc1_22;
    }

    public final int getItemCount() {
        int n3;
        int n4;
        Object object = this.a;
        if (object != null && (object = object.H(n4 = this.c)) != null && (object = ((CuratedWidget)object).getCuratedWidgetItemList()) != null) {
            n3 = ((ArrayList)object).size();
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
        void var2_5;
        CuratedLayoutType curatedLayoutType;
        int n4;
        CuratedWidget curatedWidget;
        U71 u71 = this.a;
        if (u71 != null && (curatedWidget = u71.H(n4 = this.c)) != null && (curatedLayoutType = curatedWidget.getLayoutType()) != null) {
            return var2_5.getType();
        }
        CuratedLayoutType curatedLayoutType2 = CuratedLayoutType.HOME_WIDGET_TYPE_SHIMMER;
        return var2_5.getType();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, object2);
        boolean bl2 = object instanceof i91;
        if (bl2) {
            object = (i91)object;
            object.getClass();
            hv3_0 hv3_02 = hv3_0.a;
            View view = ((i91)object).f;
            View view2 = ((i91)object).g;
            object2 = ((i91)object).c;
            ConstraintLayout constraintLayout = ((i91)object).d;
            boolean bl3 = ((i91)object).b;
            ConstraintLayout constraintLayout2 = ((i91)object).e;
            View view3 = ((i91)object).h;
            View view4 = ((i91)object).i;
            hv3_0.q0((ShimmerFrameLayout)((Object)object2), (View)constraintLayout, bl3, constraintLayout2, view, view2, view3, view4);
        } else {
            bl2 = object instanceof h71_0;
            if (bl2) {
                AppCompatImageView appCompatImageView;
                Object object3;
                int n4;
                object = (h71_0)object;
                bl2 = false;
                object2 = null;
                Object object4 = this.a;
                if (object4 != null && (object4 = object4.H(n4 = this.c)) != null && (object4 = ((CuratedWidget)object4).getCuratedWidgetItemList()) != null) {
                    object3 = (CuratedWidgetItem)CollectionsKt.N(n3, (List)object4);
                } else {
                    n3 = 0;
                    object3 = null;
                }
                ((h71_0)object).h = object3;
                if (object3 != null && (object4 = ((CuratedWidgetItem)object3).getHeader()) != null) {
                    appCompatImageView = ((h71_0)object).f;
                    appCompatImageView.setText((CharSequence)object4);
                    ai0_2.B((View)appCompatImageView);
                }
                if (object3 != null && (object4 = ((CuratedWidgetItem)object3).getSubheader()) != null) {
                    appCompatImageView = ((h71_0)object).g;
                    appCompatImageView.setText((CharSequence)object4);
                    ai0_2.B((View)appCompatImageView);
                }
                int n7 = og1_1.c();
                appCompatImageView = ((h71_0)object).d;
                object = ((h71_0)object).e;
                String string2 = "imageView";
                if (n7 != 0) {
                    if (object3 != null && (object3 = ((CuratedWidgetItem)object3).getImages()) != null) {
                        object2 = ((CuratedImage)object3).getMobileProductListingImage();
                    }
                    Intrinsics.checkNotNullParameter(object, string2);
                    object3 = new da$a();
                    ((da$a)object3).a = n7 = R$drawable.item_dummy_noimg;
                    ((da$a)object3).b = n7;
                    ((da$a)object3).n = object2;
                    ((da$a)object3).u = object;
                    ((da$a)object3).a();
                    ai0_2.i((View)appCompatImageView);
                } else {
                    if (object3 != null && (object3 = ((CuratedWidgetItem)object3).getImages()) != null) {
                        object2 = ((CuratedImage)object3).getMobileProductListingImage();
                    }
                    Intrinsics.checkNotNullParameter((Object)appCompatImageView, string2);
                    object3 = new da$a();
                    ((da$a)object3).a = n7 = R$drawable.item_dummy_noimg;
                    ((da$a)object3).b = n7;
                    ((da$a)object3).n = object2;
                    ((da$a)object3).u = appCompatImageView;
                    ((da$a)object3).a();
                    ai0_2.i((View)object);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        CuratedLayoutType curatedLayoutType = CuratedLayoutType.HOME_WIDGET_TYPE_SHIMMER;
        int n4 = curatedLayoutType.getType();
        kc1_2 kc1_22 = null;
        if (n3 == n4) {
            n3 = (int)(og1_1.c() ? 1 : 0);
            if (n3 != 0) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.luxe_product_shimmer;
                viewGroup = object.inflate(n4, viewGroup, false);
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.product_shimmer;
                viewGroup = object.inflate(n4, viewGroup, false);
            }
            Intrinsics.checkNotNull(viewGroup);
            n4 = 1;
            object = new i91((View)viewGroup, n4 != 0);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.new_curated_widget_item;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            n4 = this.c;
            kc1_22 = this.d;
            HomeRowData homeRowData = this.b;
            object = new h71_0((View)viewGroup, n4, homeRowData, kc1_22);
        }
        return object;
    }
}

