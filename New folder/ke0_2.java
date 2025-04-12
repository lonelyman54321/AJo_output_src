/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ke0
 */
public final class ke0_2
extends RecyclerView$f
implements M82 {
    public static final ke0$a Companion;
    public final s82_0 a;
    public final v82_0 b;
    public final List c;
    public final List d;
    public final boolean e;

    static {
        ke0$a ke0$a;
        Companion = ke0$a = new Object();
    }

    public ke0_2() {
        throw null;
    }

    public ke0_2(s82_0 s82_02, v82_0 v82_02, List list, List list2, boolean bl2) {
        Intrinsics.checkNotNullParameter("", "listType");
        this.a = s82_02;
        this.b = v82_02;
        this.c = list;
        this.d = list2;
        this.e = bl2;
    }

    public final void C(Product product, String string2) {
        s82_0 s82_02 = this.a;
        if (s82_02 != null) {
            s82_02.Y0(product, string2, false);
        }
    }

    public final void R4(Product product, String string2) {
        s82_0 s82_02 = this.a;
        if (s82_02 != null) {
            s82_02.x4(product, string2, false);
        }
    }

    public final void S6(String object, int n3, Product product, String string2, SaleGAData saleGAData, String string3) {
        Intrinsics.checkNotNullParameter(string3, "ajiogramTag");
        object = this.b;
        if (object != null) {
            object.k7(n3, product);
        }
    }

    public final int getItemCount() {
        int n3;
        List list = this.d;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        return 1;
    }

    public final void h9(Product product, String string2) {
    }

    public final void n0() {
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = this.d;
        Object object2 = null;
        Object object3 = object != null ? (object = (PlpProductUIModel)object.get(n3)) : null;
        object = this.c;
        if (object != null) {
            object2 = object = object.get(n3);
            object2 = (Product)object;
        }
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        recyclerView$B2 = (vv2_1)recyclerView$B;
        ScreenType screenType = ScreenType.SCREEN_PDP;
        vv2_1.D((vv2_1)recyclerView$B2, n3, (Product)object2, (PlpProductUIModel)object3, screenType, null, 16);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        boolean bl2;
        Object object2 = ck0.a(object, "parent");
        int n4 = R$layout.common_product_item_view;
        object = object2.inflate(n4, object, false);
        Intrinsics.checkNotNull(object);
        object2 = new vv2_1((View)object);
        Intrinsics.checkNotNullParameter(this, "onPLPProductClickListener");
        object2.h = this;
        object = tr2_2.a;
        object2.j = bl2 = tr2_2.t(this.e);
        object2.p = true;
        return object2;
    }
}

