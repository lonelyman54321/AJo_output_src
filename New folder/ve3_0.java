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
import com.ril.ajio.services.data.Cart.ExcludedProduct;
import com.ril.ajio.services.data.Cart.ExcludedProduct$Image;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VE3
 */
public final class ve3_0
extends RecyclerView$f {
    public final List a;

    public ve3_0(List list) {
        this.a = list;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2 = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        boolean bl2 = recyclerView$B instanceof we3_0;
        if (bl2) {
            int n4;
            Object object;
            recyclerView$B = (we3_0)recyclerView$B;
            bl2 = false;
            string2 = null;
            Object object2 = this.a;
            if (object2 != null) {
                object = (ExcludedProduct)object2.get(n3);
            } else {
                n3 = 0;
                object = null;
            }
            recyclerView$B.getClass();
            if (object != null) {
                object2 = ((ExcludedProduct)object).getImages();
            } else {
                n4 = 0;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && (n4 = object2.isEmpty()) == 0) {
                if (object != null && (object = ((ExcludedProduct)object).getImages()) != null) {
                    n4 = 0;
                    object2 = null;
                    if ((object = (ExcludedProduct$Image)object.get(0)) != null) {
                        string2 = ((ExcludedProduct$Image)object).getUrl();
                    }
                }
                object = new da$a();
                ((da$a)object).k = n4 = 1;
                ((da$a)object).r = n4;
                n4 = R$string.acc_banner;
                object2 = hv3_0.K(n4);
                ((da$a)object).b((String)object2);
                ((da$a)object).n = string2;
                recyclerView$B = ((we3_0)recyclerView$B).a;
                ((da$a)object).u = recyclerView$B;
                ((da$a)object).a();
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.row_wallet_exc_product;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        we3_0 we3_02 = new we3_0((View)viewGroup);
        return we3_02;
    }
}

