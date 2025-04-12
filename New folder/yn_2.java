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
import com.ril.ajio.services.data.Cart.GiftProducts$AssociatedProduct;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yN
 */
public final class yn_2
extends RecyclerView$f {
    public final List a;

    public yn_2(List list) {
        Intrinsics.checkNotNullParameter(list, "giftParentProducts");
        this.a = list;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof zn_2;
        if (bl2) {
            int n4;
            boolean bl3;
            recyclerView$B = (zn_2)recyclerView$B;
            Object object2 = (GiftProducts$AssociatedProduct)this.a.get(n3);
            recyclerView$B.getClass();
            Intrinsics.checkNotNullParameter(object2, "giftParentProduct");
            object2 = ((GiftProducts$AssociatedProduct)object2).getImage();
            object = new da$a();
            ((da$a)object).k = bl3 = true;
            ((da$a)object).a = n4 = R$drawable.component_placeholder;
            ((da$a)object).b = n4;
            ((da$a)object).c = n4;
            ((da$a)object).s = bl3;
            n4 = R$string.acc_icon_product_placeholder;
            Object object3 = hv3_0.K(n4);
            ((da$a)object).b((String)object3);
            object3 = UrlHelper.Companion.getInstance();
            ((da$a)object).n = object2 = ((UrlHelper)object3).getImageUrl((String)object2);
            recyclerView$B = ((zn_2)recyclerView$B).a;
            ((da$a)object).u = recyclerView$B;
            ((da$a)object).i = bl3;
            ((da$a)object).a();
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.cart_gwp_combo_items_holder;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        zn_2 zn_22 = new zn_2((View)viewGroup);
        return zn_22;
    }
}

