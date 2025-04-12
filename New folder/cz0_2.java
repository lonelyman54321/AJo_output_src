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
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cz0
 */
public final class cz0_2
extends RecyclerView$f {
    public final List a;
    public final z82_0 b;

    public cz0_2(List list, z82_0 z82_02) {
        Intrinsics.checkNotNullParameter(z82_02, "onEmptyCartClosetClickListener");
        this.a = list;
        this.b = z82_02;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            int n4;
            int n7 = list.size();
            n3 = n7 > (n4 = 3) ? 3 : list.size();
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        Object object;
        int n7;
        Object object2;
        Intrinsics.checkNotNullParameter(recyclerView$B, "baseholder");
        Intrinsics.checkNotNull(recyclerView$B, "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.viewholder.EmptyCartClosetViewHolderRefresh");
        recyclerView$B = (ez0_2)recyclerView$B;
        Object object3 = object2 = this.a;
        object3 = (Collection)object2;
        if (object3 != null && (n7 = object3.isEmpty()) == 0) {
            object2 = object = ((Product)object2.get(n3)).getImages();
            object2 = (Collection)object;
            if (object2 != null && (n4 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                object = object.iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object2 = (ProductImage)object.next();
                    object3 = ((ProductImage)object2).component1();
                    object2 = ((ProductImage)object2).component2();
                    String string2 = "product";
                    n7 = Intrinsics.areEqual(object3, string2);
                    if (n7 == 0 || object2 == null || (n7 = ((String)object2).length()) == 0) continue;
                    recyclerView$B.getClass();
                    Intrinsics.checkNotNullParameter(object2, "imageUrl");
                    object = new da$a();
                    n7 = 1;
                    ((da$a)object).k = n7;
                    ((da$a)object).r = n7;
                    n7 = R$string.acc_banner;
                    object3 = hv3_0.K(n7);
                    ((da$a)object).b((String)object3);
                    object3 = UrlHelper.Companion.getInstance();
                    ((da$a)object).n = object2 = ((UrlHelper)object3).getImageUrl((String)object2);
                    object2 = ((ez0_2)recyclerView$B).b;
                    ((da$a)object).u = object2;
                    ((da$a)object).a();
                    ((ez0_2)recyclerView$B).w();
                    return;
                }
            }
        }
        object = ((ez0_2)recyclerView$B).b;
        n4 = R$drawable.product_cell_placeholder;
        object.setImageResource(n4);
        ((ez0_2)recyclerView$B).w();
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.b() ? 1 : 0);
        z82_0 z82_02 = this.b;
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.emptybag_closet_list_row_luxe;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object = new ez0_2((View)viewGroup, z82_02);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.emptybag_closet_list_row_refresh;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object = new ez0_2((View)viewGroup, z82_02);
        }
        return object;
    }
}

