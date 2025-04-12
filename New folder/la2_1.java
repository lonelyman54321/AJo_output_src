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
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.Stock;
import java.util.List;

/*
 * Renamed from LA2
 */
public final class la2_1
extends RecyclerView$f {
    public List a;
    public List b;
    public Product c;
    public u21_0 d;

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = list.size();
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4 = object instanceof LA2$a;
        List list = null;
        List list2 = this.a;
        if (n4 != 0) {
            Integer n7;
            object = (LA2$a)object;
            Object object2 = (ProductOptionItem)list2.get(n3);
            ((LA2$a)object).a = object2;
            object2 = ((ProductOptionItem)object2).getVariantOptionQualifiers();
            object = ((LA2$a)object).a.getStock();
            if (object != null && (n7 = ((Stock)object).getStockLevel()) != null) {
                object = ((Stock)object).getStockLevel();
                ((Integer)object).intValue();
            }
            if (object2 != null && (n3 = (int)((object = object2.iterator()).hasNext() ? 1 : 0)) != 0) {
                object = (ProductOptionVariant)object.next();
                throw null;
            }
        } else {
            n4 = object instanceof ma2_2;
            if (n4 != 0) {
                Object object3 = this.b;
                Product product = this.c;
                if (object3 != null && (n4 = object3.size()) > 0) {
                    object = (ma2_2)object;
                    object3 = (ProductOptionItem)list2.get(n3);
                    list = this.b;
                    ProductOptionVariant productOptionVariant = (ProductOptionVariant)list.get(n3);
                    ((ma2_2)object).w((ProductOptionItem)object3, productOptionVariant, product);
                } else {
                    object = (ma2_2)object;
                    ProductOptionItem productOptionItem = (ProductOptionItem)list2.get(n3);
                    ((ma2_2)object).w(productOptionItem, null, product);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        n3 = (int)(og1_1.c() ? 1 : 0);
        u21_0 u21_02 = null;
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.halfcard_closet_item_sizelist_layout_luxe;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.halfcard_closet_item_sizelist_layout_refresh;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        u21_02 = this.d;
        object = new ma2_2((View)viewGroup, u21_02);
        return object;
    }
}

