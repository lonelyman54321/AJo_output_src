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
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from i32
 */
public final class i32_0
extends RecyclerView$f {
    public static final i32$a Companion;
    public x82_0 a;
    public final yi2_1 b;
    public final hy0_0 c;
    public final ArrayList d;
    public final ArrayList e;
    public final long f;
    public final String g;

    static {
        i32$a i32$a;
        Companion = i32$a = new Object();
    }

    public i32_0(x82_0 object, yi2_1 yi2_12, hy0_0 hy0_02) {
        long l2;
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        this.a = object;
        this.b = yi2_12;
        this.c = hy0_02;
        object = new ArrayList();
        this.d = object;
        object = new ArrayList();
        this.e = object;
        object = z40_0.Companion;
        this.f = l2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("price_drop_min_value");
        this.g = "";
    }

    public final void g(List collection, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(collection, "recentlyViewedProductUiList");
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        collection = collection;
        arrayList3.addAll(collection);
        this.notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.e.size();
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        return 1;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        recyclerView$B2 = (vv2_1)recyclerView$B;
        recyclerView$B = this.d.get(n3);
        Object object = recyclerView$B;
        object = (Product)((Object)recyclerView$B);
        recyclerView$B = this.e.get(n3);
        Object object2 = recyclerView$B;
        object2 = (PlpProductUIModel)((Object)recyclerView$B);
        ScreenType screenType = ScreenType.SCREEN_PDP;
        vv2_1.D((vv2_1)recyclerView$B2, n3, (Product)object, (PlpProductUIModel)object2, screenType, null, 48);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        if (n3 == 0) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
            int n4 = R$layout.layout_recently_viewed;
            View view = layoutInflater.inflate(n4, object, false);
            Intrinsics.checkNotNull(view);
            x82_0 x82_02 = this.a;
            String string2 = this.g;
            long l2 = this.f;
            object = new hf2_1(view, x82_02, null, string2, null, l2, false, false);
            return object;
        }
        Object object2 = this.b;
        n3 = (int)(object2.c9() ? 1 : 0);
        if (n3 != 0) {
            object2 = LayoutInflater.from((Context)object.getContext());
            int n7 = R$layout.common_product_item_view;
            object = object2.inflate(n7, object, false);
        } else {
            object2 = LayoutInflater.from((Context)object.getContext());
            int n8 = R$layout.common_product_item_view;
            object = object2.inflate(n8, object, false);
        }
        Intrinsics.checkNotNull(object);
        object2 = new vv2_1((View)object);
        object = this.a;
        ((vv2_1)object2).d = object;
        ((vv2_1)object2).g = null;
        object = this.g;
        Intrinsics.checkNotNullParameter(object, "mTitle");
        ((vv2_1)object2).e = object;
        object = this.c;
        ((vv2_1)object2).k = object;
        return object2;
    }
}

