/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.analytics.utils.GAUtils$Companion;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oP
 */
public final class op_2
extends RecyclerView$B {
    public final nw_0 a;
    public final List b;
    public final RecyclerViewScrollListener c;
    public final ao_1 d;
    public final hy0_0 e;
    public final RecyclerView f;
    public final AjioTextView g;
    public final View h;
    public np_2 i;
    public final WrapperLinearLayoutManager j;
    public int k;
    public final ArrayList l;
    public final ArrayList m;

    public op_2(View object, nw_0 object2, List object3, RecyclerViewScrollListener object4, ao_1 object5, hy0_0 hy0_02) {
        int n3 = 1;
        String string2 = "itemView";
        Intrinsics.checkNotNullParameter(object, string2);
        super((View)object);
        this.a = object2;
        this.b = object3;
        this.c = object4;
        this.d = object5;
        this.e = hy0_02;
        int n4 = R$id.rvWishList;
        object2 = object.findViewById(n4);
        object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        this.f = object2 = (RecyclerView)object2;
        int n7 = R$id.tvViewAll;
        object5 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        this.g = object5 = (AjioTextView)object5;
        n7 = R$id.saleHeader;
        object = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        this.h = object;
        super();
        this.l = object;
        object4 = new ArrayList();
        this.m = object4;
        AJIOApplication.Companion.getClass();
        object5 = AJIOApplication$a.a();
        this.j = object4 = new WrapperLinearLayoutManager((Context)object5);
        Intrinsics.checkNotNull(object4);
        n7 = 0;
        object5 = null;
        ((LinearLayoutManager)object4).setOrientation(0);
        object4 = this.j;
        ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object4);
        int n8 = 16;
        int n10 = mz3_0.d(n8);
        n8 = mz3_0.d(n8);
        object4 = new lo_1(n10, n8);
        ((RecyclerView)object2).addItemDecoration((RecyclerView$n)object4);
        if (object3 != null) {
            object2 = object3;
            object2 = (Collection)object3;
            ((ArrayList)object).addAll(object2);
        }
        if (object3 != null) {
            boolean bl2;
            object3 = (Iterable)object3;
            object = object3.iterator();
            n4 = 0;
            object2 = null;
            while (bl2 = object.hasNext()) {
                object3 = object.next();
                int n14 = n4 + 1;
                if (n4 >= 0) {
                    object3 = (Product)object3;
                    object2 = n00.a;
                    object2 = n00.b((Product)object3);
                    object3 = this.m;
                    ((ArrayList)object3).add(object2);
                    n4 = n14;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        object = new t7_0(this, n3);
        object2 = this.g;
        object2.setOnClickListener((View.OnClickListener)object);
        boolean bl3 = tr2_2.y(false);
        if (!bl3 || !(bl3 = tr2_2.i())) {
            n3 = 0;
        }
        object = this.h;
        if (n3 == 0 && (n4 = (int)(tr2_2.l((ScreenType)((Object)(object2 = ScreenType.SCREEN_WISHLIST))) ? 1 : 0)) == 0) {
            n4 = 8;
            object.setVisibility(n4);
        } else {
            object.setVisibility(0);
            ur2_2.a((View)object, false);
        }
    }

    public final void w(List object) {
        int n3;
        int n4;
        Object object2 = this.j;
        if (object2 != null) {
            n4 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
            object2 = n4;
        } else {
            n4 = 0;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        n4 = (Integer)object2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (object != null && n4 > (n3 = this.k)) {
            boolean bl2;
            kp_1 kp_12;
            String string2;
            Object object3;
            Object object4;
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            n3 = this.k;
            if (n3 <= n4) {
                while (true) {
                    int n7;
                    if (n3 < (n7 = object.size())) {
                        ((Product)object.get(n3)).setPosition(n3);
                        object4 = (Product)object.get(n3);
                        object3 = "product";
                        Intrinsics.checkNotNullParameter(object4, (String)object3);
                        boolean bl3 = og1_1.b();
                        if (!bl3) {
                            object3 = h40_0.a;
                            bl3 = h40_0.Y1();
                            if (bl3 && (bl3 = h40_0.T0())) {
                                object3 = ((Product)object4).getAverageRating();
                                string2 = ((Product)object4).getNumUserRatings();
                                kp_12 = new kp_1((Product)object4);
                                ai0_2.r(kp_12, object3, string2);
                            }
                        }
                        arrayList2.add(object4);
                        object4 = object.get(n3);
                        arrayList.add(object4);
                    }
                    if (n3 == n4) break;
                    ++n3;
                }
            }
            if (bl2 = arrayList2.isEmpty() ^ true) {
                object4 = GAEcommerceEvents.INSTANCE;
                object = GAUtils.Companion;
                object3 = ((GAUtils$Companion)object).getGAViewItemSearchResults();
                string2 = "bag screen - wishlist screen";
                kp_12 = null;
                String string3 = "bag screen";
                String string4 = "bag screen";
                ((GAEcommerceEvents)object4).pushWishListImpressionData((String)object3, arrayList2, string2, false, string3, string4);
            }
            this.k = ++n4;
        }
    }

    public final void x() {
        Object object;
        np_2 np_22;
        Object object2;
        RecyclerViewScrollListener recyclerViewScrollListener = this.c;
        if (recyclerViewScrollListener != null) {
            ArrayList arrayList = this.l;
            ArrayList arrayList2 = this.m;
            boolean bl2 = true;
            hy0_0 hy0_02 = this.e;
            object2 = this.a;
            object = np_22;
            np_22 = new np_2((nw_0)object2, arrayList, arrayList2, bl2, recyclerViewScrollListener, hy0_02);
        } else {
            np_22 = null;
        }
        this.i = np_22;
        object = this.f;
        ((RecyclerView)object).setAdapter(np_22);
        object2 = new op$a_0(this);
        ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object2);
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new Gj(this, 1);
        object.postDelayed((Runnable)object2, 500L);
    }
}

