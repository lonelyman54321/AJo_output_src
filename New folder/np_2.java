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
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nP
 */
public final class np_2
extends RecyclerView$f {
    public final nw_0 a;
    public final List b;
    public final List c;
    public final boolean d;
    public final RecyclerViewScrollListener e;
    public final hy0_0 f;
    public final jo_2 g;
    public final int h;
    public final int i;

    public np_2(nw_0 object, List object2, List list, boolean bl2, RecyclerViewScrollListener recyclerViewScrollListener, hy0_0 hy0_02) {
        Intrinsics.checkNotNullParameter(recyclerViewScrollListener, "recyclerViewScrollListener");
        this.a = object;
        this.b = object2;
        this.c = list;
        this.d = bl2;
        this.e = recyclerViewScrollListener;
        this.f = hy0_02;
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        this.g = object = new jo_2((Context)object2);
        this.h = 1;
        this.i = 2;
    }

    public final int getItemCount() {
        boolean bl2;
        boolean bl3 = false;
        Object object = this.c;
        int n3 = object != null ? object.size() : 0;
        boolean bl4 = true;
        if (object != null) {
            object = (Collection)object;
            bl2 = object.isEmpty() ^ bl4;
        } else {
            bl2 = false;
            object = null;
        }
        if (bl2 && !(bl2 = ((RecyclerViewScrollListener)(object = this.e)).isLastPage())) {
            bl3 = true;
        }
        if (bl3) {
            ++n3;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4;
        Object object = this.c;
        if (object != null) {
            n4 = object.size();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        Intrinsics.checkNotNull(object);
        n4 = (Integer)object;
        if (n3 < n4) {
            return this.i;
        }
        return this.h;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4 = 1;
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof vv2_1;
        if (bl2) {
            object2 = yn3_0.a;
            Object object3 = n3;
            Object object4 = new Object[n4];
            object4[0] = object3;
            ((yn3$a)object2).a("CartViewClosetListAdapter onBindViewHolder holder is ClosetViewHolderRefresh position = %s", object4);
            object2 = this.c;
            object3 = null;
            Object object5 = object2 != null ? (object2 = (PlpProductUIModel)object2.get(n3)) : null;
            object4 = object;
            object4 = (vv2_1)object;
            object2 = this.b;
            if (object2 != null) {
                object3 = object2 = object2.get(n3);
                object3 = (Product)object2;
            }
            ScreenType screenType = ScreenType.SCREEN_WISHLIST;
            int n7 = 16;
            vv2_1.D((vv2_1)object4, n3, (Product)object3, (PlpProductUIModel)object5, screenType, null, n7);
        }
        if (bl2 = object instanceof lv1_2) {
            object2 = yn3_0.a;
            Object object6 = n3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object6;
            ((yn3$a)object2).a("CartViewClosetListAdapter onBindViewHolder holder is LoadMoreViewHolder position = %s", objectArray);
            object = (lv1_2)object;
            object6 = ((lv1_2)object).b;
            n4 = 8;
            object6.setVisibility(n4);
            object = ((lv1_2)object).a;
            if (object != null) {
                ((RecyclerViewScrollListener)object).onLoadMore();
                boolean bl3 = ((RecyclerViewScrollListener)object).isLastPage();
                if (bl3) {
                    object6.setVisibility(n4);
                    ((ShimmerFrameLayout)((Object)object6)).stopShimmer();
                } else {
                    object6.setVisibility(0);
                    ((ShimmerFrameLayout)((Object)object6)).startShimmer();
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2 = "parent";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = this.i;
        if (n3 == n4) {
            Object object3;
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                object3 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.common_product_item_view;
                object = object3.inflate(n4, object, false);
            } else {
                n3 = (int)(this.d ? 1 : 0);
                if (n3 != 0) {
                    object3 = LayoutInflater.from((Context)object.getContext());
                    n4 = R$layout.common_product_item_view;
                    object = object3.inflate(n4, object, false);
                } else {
                    object3 = LayoutInflater.from((Context)object.getContext());
                    n4 = R$layout.common_product_item_view;
                    object = object3.inflate(n4, object, false);
                }
            }
            Intrinsics.checkNotNull(object);
            object3 = new vv2_1((View)object);
            object = this.g;
            object3.b = object;
            object = this.a;
            object3.c = object;
            object = this.f;
            object3.k = object;
            return object3;
        }
        Object object4 = LayoutInflater.from((Context)object.getContext());
        n4 = R$layout.wishlist_in_cart_load_more;
        object = object4.inflate(n4, object, false);
        Intrinsics.checkNotNull(object);
        object2 = this.e;
        object4 = new lv1_2((View)object, (RecyclerViewScrollListener)object2);
        return object4;
    }
}

