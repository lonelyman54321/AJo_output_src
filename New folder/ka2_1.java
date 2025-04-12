/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ka2
 */
public final class ka2_1
extends RecyclerView$f {
    public List a;

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
        recyclerView$B = (ka2$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object = (Product)object.get(n3);
            recyclerView$B.getClass();
            String string2 = "product";
            Intrinsics.checkNotNullParameter(object, string2);
            Object object2 = ((ka2$a)recyclerView$B).c;
            if (n3 == 0) {
                object2.setPadding(0, 0, 0, 0);
            } else {
                n3 = mz3_0.d(10);
                object2.setPadding(n3, 0, 0, 0);
            }
            Object object3 = ((Product)object).getImages();
            object2 = null;
            if (object3 != null) {
                block9: {
                    boolean bl2;
                    object3 = ((Product)object).getImages();
                    Intrinsics.checkNotNull(object3);
                    object3 = object3.iterator();
                    while (bl2 = object3.hasNext()) {
                        ProductImage productImage = (ProductImage)object3.next();
                        String string3 = productImage.getFormat();
                        boolean bl3 = string2.equalsIgnoreCase(string3);
                        if (!bl3) continue;
                        object3 = productImage.getUrl();
                        break block9;
                    }
                    n3 = 0;
                    object3 = null;
                }
                if (object3 == null) {
                    object3 = ((Product)object).getImages();
                    if (object3 != null && (object3 = (ProductImage)object3.get(0)) != null) {
                        object2 = ((ProductImage)object3).getUrl();
                    }
                } else {
                    object2 = object3;
                }
            }
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0)) == 0) {
                int n4;
                object3 = new da$a();
                ((da$a)object3).k = true;
                ((da$a)object3).a = n4 = 17170445;
                ((da$a)object3).b = n4;
                ((da$a)object3).n = object = UrlHelper.Companion.getInstance().getImageUrl((String)object2);
                recyclerView$B = ((ka2$a)recyclerView$B).b;
                ((da$a)object3).u = recyclerView$B;
                ((da$a)object3).a();
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_orderlist_closet;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new ka2$a((View)viewGroup);
        return object;
    }
}

