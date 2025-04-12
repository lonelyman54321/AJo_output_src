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
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iO1
 */
public final class io1_1
extends RecyclerView$f {
    public final ArrayList a;

    public io1_1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (ho1_2)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = this.a;
        if (object != null) {
            Object object2 = (CartEntry)((ArrayList)object).get(n3);
            recyclerView$B = ((ho1_2)recyclerView$B).a;
            object = null;
            recyclerView$B.setVisibility(0);
            int n4 = 2;
            recyclerView$B.setImportantForAccessibility(n4);
            if (object2 != null && (object = ((CartEntry)object2).getProduct()) != null && (object = ((CartEntry)object2).getProduct().getOrderConfirmImage()) != null) {
                int n7;
                object = new da$a();
                ((da$a)object).k = n7 = 1;
                ((da$a)object).r = n7;
                n7 = R$string.acc_banner;
                Object object3 = hv3_0.K(n7);
                ((da$a)object).b((String)object3);
                object3 = UrlHelper.Companion.getInstance();
                object2 = ((CartEntry)object2).getProduct().getOrderConfirmImage();
                if (object2 != null) {
                    object2 = ((ProductImage)object2).getUrl();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                ((da$a)object).n = object2 = ((UrlHelper)object3).getImageUrl((String)object2);
                ((da$a)object).u = recyclerView$B;
                ((da$a)object).a();
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.b() ? 1 : 0);
        String string2 = "inflate(...)";
        if (n3 != 0) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.row_merge_oos_products_luxe;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = new ho1_2((View)viewGroup);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_merge_oos_products_refresh;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = new ho1_2((View)viewGroup);
        }
        return object;
    }
}

