/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import com.ril.ajio.services.data.Product.fleek.Brand;
import com.ril.ajio.services.data.Product.fleek.BrandResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qj2
 */
public final class qj2_0
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final NewAjioStoryViewPager c;
    public final LinearLayout d;
    public final pj2_1 e;
    public final ArrayList f;
    public int g;
    public final SparseArray h;
    public final qj2$a i;

    public qj2_0(View object, yi2_1 object2, ma_2 object3, bf3_1 bf3_12, yh2_1 object4) {
        Object object5;
        ArrayList<Object> arrayList;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object3, "ajioVideoPlayer");
        Intrinsics.checkNotNullParameter(bf3_12, "stylishIdeasCallback");
        Intrinsics.checkNotNullParameter(object4, "adapter");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.f = arrayList = new ArrayList<Object>();
        this.h = object5 = new SparseArray();
        Intrinsics.checkNotNullParameter(object, "parentView");
        int n3 = R$id.pdp_stylish_view_pager;
        object5 = (NewAjioStoryViewPager)object.findViewById(n3);
        this.c = object5;
        n3 = R$id.progress_bar_view;
        object = (LinearLayout)object.findViewById(n3);
        this.d = object;
        if (object2 != null && (object = object2.N6()) != null && (object = ((PostsResponse)object).getComponents()) != null) {
            super((yi2_1)object2, (ma_2)object3, bf3_12, (yh2_1)object4);
            this.e = object5;
            object2 = this.c;
            object3 = "pdpStylishViewPager";
            bf3_12 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object2 = null;
            }
            if ((object4 = this.e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pdpCarouselPagerAdapter");
                object4 = null;
            }
            ((NewAjioStoryViewPager)((Object)object2)).setAdapter((Uk2)object4);
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object2 = null;
            }
            object4 = this.i;
            ((NewAjioStoryViewPager)((Object)object2)).b((NewAjioStoryViewPager$g)object4);
            object2 = this.d;
            object4 = "progressBarView";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object2 = null;
            }
            if (object2 != null) {
                object2.removeAllViews();
            }
            arrayList.clear();
            object = (Collection)object;
            int n4 = object.size();
            object2 = null;
            object5 = null;
            for (n3 = 0; n3 < n4; ++n3) {
                LinearLayout linearLayout;
                Object object6 = this.c;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object6 = null;
                }
                object6 = LayoutInflater.from((Context)object6.getContext());
                int n7 = R$layout.fleek_stylish_view_layout;
                LinearLayout linearLayout2 = this.d;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    linearLayout2 = null;
                }
                object6 = object6.inflate(n7, (ViewGroup)linearLayout2, false);
                n7 = R$id.row_rotate_progressbar_one;
                object6 = (AppCompatImageView)object6.findViewById(n7);
                n7 = this.g;
                if (n7 == n3) {
                    n7 = R$drawable.selected_banner_indicator;
                    ((AppCompatImageView)((Object)object6)).setBackgroundResource(n7);
                }
                if ((linearLayout = this.d) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n7 = 0;
                    linearLayout = null;
                }
                if (linearLayout != null) {
                    linearLayout.addView((View)object6);
                }
                arrayList.add(object6);
            }
        }
        super(this);
        this.i = object;
    }

    public final void w() {
        boolean bl2;
        Object object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpCarouselPagerAdapter");
            object = null;
        }
        int bl22 = this.g;
        object = ((pj2_1)object).g.get(bl22);
        String string2 = "get(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (View)object;
        if (object != null && (bl2 = object instanceof PDPStylingIdeasVideoHolder)) {
            object = (PDPStylingIdeasVideoHolder)object;
            boolean bl3 = true;
            ((PDPStylingIdeasVideoHolder)object).h(bl3);
        }
    }

    public final void x(int n3) {
        int n4;
        int n7;
        String string2;
        Integer n8;
        Object object;
        SparseArray sparseArray = this.h;
        Object object2 = sparseArray.get(n3);
        if (object2 != null) {
            return;
        }
        boolean bl2 = false;
        object2 = null;
        Object object3 = this.b;
        object = object3 != null && (object = object3.N6()) != null && (object = ((PostsResponse)object).getComponents()) != null ? (PostsResponse$Component)object.get(n3) : null;
        if (object3 != null) {
            int n10 = object3.W2();
            n8 = n10;
        } else {
            boolean bl3 = false;
            n8 = null;
        }
        Object object4 = "";
        Object object5 = object != null && (string2 = ((PostsResponse$Component)object).getPostID()) != null ? string2 : object4;
        object3 = object3.P4();
        if (object3 != null && (object3 = ((BrandResponse)object3).getBrand()) != null && (object3 = ((Brand)object3).getName()) != null) {
            object4 = object3;
        }
        String string3 = "fleek_post_".concat((String)object4);
        object3 = "content";
        if (object != null && (object4 = ((PostsResponse$Component)object).getSubcomponent()) != null && (object4 = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object4)) != null && (object4 = ((PostsResponse$Component$Subcomponent)object4).getResources()) != null && (n7 = object4.size()) > (n4 = 1)) {
            object3 = "content+product";
        }
        if (object != null && (object = ((PostsResponse$Component)object).getSubcomponent()) != null && (object = (PostsResponse$Component$Subcomponent)CollectionsKt.firstOrNull((List)object)) != null && (object = ((PostsResponse$Component$Subcomponent)object).getMedia()) != null && (object = (PostsResponse$Component$Subcomponent$Media)CollectionsKt.firstOrNull((List)object)) != null) {
            object2 = ((PostsResponse$Component$Subcomponent$Media)object).getMediaType();
        }
        object2 = (bl2 = Intrinsics.areEqual(object2, object = "IMAGE")) ? "- image" : "- video";
        String string4 = Qj0.b((String)object3, (String)object2);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(n8);
        ((StringBuilder)object2).append(" | ");
        ((StringBuilder)object2).append(n3);
        String string5 = ((StringBuilder)object2).toString();
        object2 = sq0_1.a;
        sq0_1.i("pdp screen", (String)object5, string3, string4, string5, false);
        object2 = n3;
        sparseArray.put(n3, object2);
    }
}

