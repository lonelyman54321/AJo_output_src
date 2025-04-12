/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.customviews.CustomLinearLayoutManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.data.Product.WidgetRecord;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from U43
 */
public final class u43_0
extends RecyclerView$B
implements TT2$b {
    public final View a;
    public final U71 b;
    public final OnGAEventHandlerListener c;
    public final tt2_2 d;
    public final k92_0 e;
    public final ConstraintLayout f;
    public final AjioTextView g;
    public final AjioTextView h;
    public final RecyclerView i;
    public final AnalyticsGAEventHandlerMultipleWidget j;
    public String k;
    public int l;
    public final ArrayList m;
    public String n;
    public final U43$a o;

    public u43_0(View object, U71 object2, OnGAEventHandlerListener object3, tt2_2 tt2_22, k92_0 k92_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object3, "onGAEventHandlerListener");
        Intrinsics.checkNotNullParameter(tt2_22, "scrollStateHolder");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = tt2_22;
        this.e = k92_02;
        int n3 = R$id.product_widget_parent;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ConstraintLayout)((Object)object2);
        this.f = object2;
        n3 = R$id.product_widget_title_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.g = object2;
        n3 = R$id.product_widget_subtitle_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.h = object2;
        n3 = R$id.home_product_widget_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (RecyclerView)object;
        this.i = object;
        object = AnalyticsGAEventHandlerMultipleWidget.Companion.getMultipleWidgetInstance();
        this.j = object;
        object = "";
        this.k = object;
        super();
        this.m = object2;
        this.n = object;
        super(this);
        this.o = object;
    }

    public final String k() {
        return this.n;
    }

    public final void w() {
        Object object = this.b;
        if (object != null) {
            int n3 = this.getBindingAdapterPosition();
            object.z(n3);
        }
        object = kotlinx.coroutines.d.a(ir0_2.a);
        v43_0 v43_02 = new v43_0(this, null);
        Ae3.d((i90_0)object, null, null, v43_02, 3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void x(HomeRowData homeRowData) {
        int n3;
        u43_0 u43_02 = this;
        if (homeRowData == null) return;
        Object object = homeRowData.getBanners();
        Object object2 = this.f;
        if (object != null && (n3 = object.isEmpty()) == 0) {
            Object object3;
            Object object4;
            int n4;
            String string2;
            int n7;
            int n8;
            object = homeRowData.getBgColor();
            if (object != null && (n3 = ((String)object).length()) > 0) {
                object = homeRowData.getBgColor();
                n3 = Color.parseColor((String)object);
                object2.setBackgroundColor(n3);
            } else {
                object = object2.getContext();
                int n10 = R$color.white;
                n3 = t70.getColor((Context)object, n10);
                object2.setBackgroundColor(n3);
            }
            object = homeRowData.getComponentName();
            Object object5 = u43_02.b;
            Object object6 = u43_02.g;
            if (object != null && (n3 = ((String)object).length()) != 0) {
                u43_02.k = object = homeRowData.getComponentName();
                object = homeRowData.getComponentName();
                object6.setText((CharSequence)object);
                ai0_2.B((View)object6);
                if (object5 != null) {
                    object = homeRowData.getComponentName();
                    object5.I((String)object);
                }
            } else {
                ai0_2.i((View)object6);
            }
            object = homeRowData.getSubHeading();
            object6 = u43_02.h;
            if (object != null && (n3 = ((String)object).length()) != 0) {
                object = homeRowData.getSubHeading();
                object6.setText((CharSequence)object);
                ai0_2.B((View)object6);
            } else {
                ai0_2.i((View)object6);
            }
            object = homeRowData.getBanners();
            if (object != null) {
                n3 = object.size();
            } else {
                n3 = 0;
                object = null;
            }
            object6 = null;
            if (n3 > 0) {
                void var10_16;
                Object object7;
                if (object5 != null && (object = object5.E(n3 = this.getBindingAdapterPosition())) != null && (object = ((RecentlyViewedProducts)object).getProductUIModelList()) != null && (object = (PlpProductUIModel)CollectionsKt.N(0, (List)object)) != null) {
                    object = ((PlpProductUIModel)object).getProductType();
                } else {
                    n3 = 0;
                    object = null;
                }
                HomeWidgetTypes homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_HIDE;
                if (object == homeWidgetTypes) {
                    object = object2.getLayoutParams();
                    ((ViewGroup.LayoutParams)object).height = 0;
                    ((ViewGroup.LayoutParams)object).width = 0;
                    return;
                }
                object = homeRowData.getBanners();
                if (object != null && (object = (BannerData)CollectionsKt.N(0, (List)object)) != null) {
                    Object object8 = object = ((BannerData)object).getFeedLogic();
                } else {
                    n8 = 0;
                    Object var10_15 = null;
                }
                object = homeRowData.getBanners();
                if (object != null && (object = (BannerData)CollectionsKt.N(0, (List)object)) != null) {
                    object7 = object = ((BannerData)object).getWidgetLevel();
                } else {
                    n7 = 0;
                    object7 = null;
                }
                string2 = homeRowData.getHeading();
                n3 = this.getBindingAdapterPosition();
                object2 = od3_2.a();
                String string3 = ld3_2.STORE_AJIO.getStoreId();
                n4 = (int)(Intrinsics.areEqual(object2, string3) ? 1 : 0);
                if (n4 != 0) {
                    object2 = "rilfnl";
                }
                Object object9 = object2;
                object2 = homeRowData.getBanners();
                Object object10 = object2 != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getShowDefault()) : null;
                object4 = Boolean.FALSE;
                Integer n14 = n3;
                object3 = "16";
                int n15 = 768;
                Object object11 = object2;
                object2 = new WidgetRecord((String)var10_16, (String)object7, (String)object3, string2, (Boolean)object4, (Boolean)object10, n14, (String)object9, null, null, n15, null);
                if (object5 != null) {
                    n3 = this.getBindingAdapterPosition();
                    object5.B(n3, (WidgetRecord)object2);
                }
            }
            n7 = this.getBindingAdapterPosition();
            string2 = u43_02.k;
            int n16 = 1;
            object4 = new zb2_2(u43_02, n16);
            U71 u71 = u43_02.b;
            object3 = u43_02.e;
            Object object12 = object;
            object = new bb2_1(u71, n7, (k92_0)object3, string2, (Function0)object4);
            object2 = u43_02.i;
            ai0_2.q((RecyclerView)object2);
            n4 = hv3_0.q(R$dimen.dimen_24);
            n8 = hv3_0.q(R$dimen.dimen_8);
            object5 = new lo_1(n4, n8);
            ((RecyclerView)object2).addItemDecoration((RecyclerView$n)object5);
            Context context = u43_02.a.getContext();
            object5 = new CustomLinearLayoutManager(context, 0, false);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object5);
            object5 = ((RecyclerView)object2).getAdapter();
            if (object5 == null) {
                ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
            }
            object = u43_02.o;
            ((RecyclerView)object2).addOnScrollListener((RecyclerView$s)object);
            object = homeRowData.getBanners();
            if (object != null && (object = (BannerData)CollectionsKt.N(0, (List)object)) != null) {
                object6 = ((BannerData)object).getUuid();
            }
            u43_02.n = object6;
            object = u43_02.d;
            ((tt2_2)object).b((RecyclerView)object2, u43_02);
            ((tt2_2)object).a((RecyclerView)object2, u43_02);
            return;
        }
        object = object2.getLayoutParams();
        ((ViewGroup.LayoutParams)object).height = 0;
        ((ViewGroup.LayoutParams)object).width = 0;
    }
}

