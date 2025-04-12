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
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.ScreenType;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TX1
 */
public final class tx1_0
extends RecyclerView$f {
    public ImmutableList a;
    public ImmutableList b;
    public final p82_0 c;
    public final RecyclerViewScrollListener d;
    public boolean e;
    public ArrayList f;
    public final hy0_0 g;

    public tx1_0(ImmutableList immutableList, ImmutableList immutableList2, p82_0 p82_02, RecyclerViewScrollListener recyclerViewScrollListener, boolean bl2, ArrayList arrayList, hy0_0 hy0_02) {
        Intrinsics.checkNotNullParameter(immutableList, "productList");
        Intrinsics.checkNotNullParameter(immutableList2, "plpProductUIList");
        Intrinsics.checkNotNullParameter(p82_02, "onClosetListProductClickListener");
        Intrinsics.checkNotNullParameter(recyclerViewScrollListener, "recyclerViewScrollListener");
        Intrinsics.checkNotNullParameter(arrayList, "listImages");
        Intrinsics.checkNotNullParameter(hy0_02, "gaClickEventListener");
        this.a = immutableList;
        this.b = immutableList2;
        this.c = p82_02;
        this.d = recyclerViewScrollListener;
        this.e = bl2;
        this.f = arrayList;
        this.g = hy0_02;
    }

    public final boolean g() {
        ImmutableList immutableList = this.b;
        boolean bl2 = immutableList.isEmpty();
        boolean bl3 = true;
        if (!(bl2 ^= bl3) || !(bl2 = this.e)) {
            bl3 = false;
        }
        return bl3;
    }

    public final int getItemCount() {
        ImmutableList immutableList = this.b;
        int n3 = immutableList.size();
        Object object = this.b;
        boolean bl2 = object.isEmpty() ^ true;
        if (bl2 && !(bl2 = ((RecyclerViewScrollListener)(object = this.d)).isLastPage())) {
            ++n3;
        }
        if (bl2 = this.g()) {
            ++n3;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int getItemViewType(int n3) {
        Serializable serializable;
        int n4 = og1_1.c();
        int n7 = 3;
        int n8 = 7;
        int n10 = 6;
        if (n4 != 0) {
            ImmutableList immutableList;
            if (n3 == 0) {
                n4 = this.g();
                if (n4 != 0) return 8;
            }
            if ((n4 = this.g()) != 0) {
                n3 += -1;
            }
            if (n3 >= (n4 = (immutableList = this.b).size())) return n7;
            if ((n3 %= 2) != 0) return 7;
            return 6;
        }
        if (n3 == 0 && (n4 = this.g()) != 0) {
            return 8;
        }
        n4 = this.g();
        if (n4 != 0) {
            n3 += -1;
        }
        if (n3 >= (n4 = ((AbstractCollection)((Object)(serializable = this.b))).size())) return n7;
        serializable = this.b;
        Object object = (PlpProductUIModel)CollectionsKt.N(n3, (List)((Object)serializable));
        if (object != null && (serializable = ((PlpProductUIModel)object).getViewTypeWishlist()) != null && (n4 = ((Integer)serializable).intValue()) == n10) {
            return 6;
        }
        if (object == null) return 23;
        if ((object = ((PlpProductUIModel)object).getViewTypeWishlist()) == null) return 23;
        n3 = (Integer)object;
        if (n3 != n8) return 23;
        return 7;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof qw_1;
        if (bl2) {
            recyclerView$B = (qw_1)recyclerView$B;
            ((qw_1)recyclerView$B).w();
        } else {
            bl2 = recyclerView$B instanceof vv2_1;
            if (bl2) {
                Object e2;
                bl2 = this.g();
                if (bl2) {
                    n3 += -1;
                }
                Object object2 = e2 = this.b.get(n3);
                object2 = (PlpProductUIModel)e2;
                object = recyclerView$B;
                object = (vv2_1)recyclerView$B;
                recyclerView$B = this.a.get(n3);
                Object object3 = recyclerView$B;
                object3 = (Product)((Object)recyclerView$B);
                ScreenType screenType = ScreenType.SCREEN_WISHLIST;
                int n4 = 48;
                vv2_1.D((vv2_1)object, n3, (Product)object3, object2, screenType, null, n4);
            } else {
                n3 = recyclerView$B instanceof sw_2;
                if (n3 != 0) {
                    n3 = (int)(this.e ? 1 : 0);
                    if (n3 != 0) {
                        recyclerView$B = (sw_2)recyclerView$B;
                        ArrayList arrayList = this.f;
                        ((sw_2)recyclerView$B).w(arrayList);
                    }
                } else {
                    n3 = recyclerView$B instanceof ue2_0;
                    if (n3 != 0) {
                        recyclerView$B = (ue2_0)recyclerView$B;
                        String string2 = "WIHSLIST";
                        ((ue2_0)recyclerView$B).w(string2);
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 3;
        if (n3 != n4) {
            n4 = 23;
            if (n3 != n4) {
                n4 = 6;
                hy0_0 hy0_02 = this.g;
                p82_0 p82_02 = this.c;
                if (n3 != n4) {
                    n4 = 7;
                    if (n3 != n4) {
                        n4 = 8;
                        if (n3 != n4) {
                            Object object2 = LayoutInflater.from((Context)viewGroup.getContext());
                            n4 = R$layout.common_product_item_view;
                            viewGroup = object2.inflate(n4, viewGroup, false);
                            Intrinsics.checkNotNull(viewGroup);
                            object2 = new vv2_1((View)viewGroup);
                            object2.n = p82_02;
                            object2.k = hy0_02;
                            return object2;
                        }
                        n3 = (int)(og1_1.d() ? 1 : 0);
                        if (n3 != 0) {
                            Object object3 = LayoutInflater.from((Context)viewGroup.getContext());
                            n4 = R$layout.luxe_closet_price_drop_row;
                            viewGroup = object3.inflate(n4, viewGroup, false);
                            Intrinsics.checkNotNull(viewGroup);
                            object3 = new sw_2((View)viewGroup, p82_02);
                            return object3;
                        }
                        Object object4 = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_pricedrop_layout_refresh;
                        viewGroup = object4.inflate(n4, viewGroup, false);
                        Intrinsics.checkNotNull(viewGroup);
                        object4 = new sw_2((View)viewGroup, p82_02);
                        return object4;
                    }
                    Object object5 = LayoutInflater.from((Context)viewGroup.getContext());
                    n4 = R$layout.common_product_item_view;
                    viewGroup = object5.inflate(n4, viewGroup, false);
                    Intrinsics.checkNotNull(viewGroup);
                    object5 = new vv2_1((View)viewGroup);
                    object5.n = p82_02;
                    object5.k = hy0_02;
                    return object5;
                }
                Object object6 = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.common_product_item_view;
                viewGroup = object6.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
                object6 = new vv2_1((View)viewGroup);
                object6.n = p82_02;
                object6.k = hy0_02;
                return object6;
            }
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.home_rating_view;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
            ue2_0 ue2_02 = new ue2_0((View)viewGroup);
            return ue2_02;
        }
        Object object7 = LayoutInflater.from((Context)viewGroup.getContext());
        n4 = R$layout.closet_load_more_view;
        viewGroup = object7.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = this.d;
        object7 = new qw_1((View)viewGroup, (RecyclerViewScrollListener)object);
        return object7;
    }
}

