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
import com.ril.ajio.R$string;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zy2
 */
public final class zy2_1
extends RecyclerView$f {
    public final ArrayList a;

    public zy2_1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "entryList");
        this.a = arrayList;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = this.a;
        int n4 = ((ArrayList)object).size();
        if (n4 > 0) {
            n4 = recyclerView$B instanceof az2_0;
            String string2 = "url";
            String string3 = "get(...)";
            if (n4 == 0) {
                n4 = recyclerView$B instanceof bz2_0;
                if (n4 != 0) {
                    recyclerView$B = (bz2_0)recyclerView$B;
                    Object object2 = ((ArrayList)object).get(n3);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    object2 = (String)object2;
                    recyclerView$B.getClass();
                    Intrinsics.checkNotNullParameter(object2, string2);
                    recyclerView$B = ((bz2_0)recyclerView$B).a;
                    recyclerView$B.setVisibility(0);
                    object = new da$a();
                    n4 = 1;
                    ((da$a)object).k = n4;
                    ((da$a)object).r = n4;
                    n4 = R$string.acc_banner;
                    Object object3 = hv3_0.K(n4);
                    ((da$a)object).b((String)object3);
                    object3 = UrlHelper.Companion.getInstance();
                    object2 = ((UrlHelper)object3).getImageUrl((String)object2);
                    ((da$a)object).n = object2;
                    ((da$a)object).u = recyclerView$B;
                    ((da$a)object).a();
                }
            } else {
                recyclerView$B = (az2_0)recyclerView$B;
                Object object4 = ((ArrayList)object).get(n3);
                Intrinsics.checkNotNullExpressionValue(object4, string3);
                object4 = (String)object4;
                recyclerView$B.getClass();
                Intrinsics.checkNotNullParameter(object4, string2);
                throw null;
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_merge_oos_products_refresh;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new bz2_0((View)viewGroup);
        return object;
    }
}

