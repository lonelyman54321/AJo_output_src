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
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ic0
 */
public final class ic0_1
extends RecyclerView$f {
    public final List a;

    public ic0_1(ArrayList arrayList) {
        this.a = arrayList;
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
        recyclerView$B = (jc0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a;
        if (object != null) {
            int n4;
            String string2 = (String)object.get(n3);
            recyclerView$B.getClass();
            object = new da$a();
            ((da$a)object).k = n4 = 1;
            ((da$a)object).r = n4;
            n4 = R$string.acc_banner;
            Object object2 = hv3_0.K(n4);
            ((da$a)object).b((String)object2);
            object2 = UrlHelper.Companion.getInstance();
            string2 = ((UrlHelper)object2).getImageUrl(string2);
            ((da$a)object).n = string2;
            recyclerView$B = ((jc0)recyclerView$B).a;
            ((da$a)object).u = recyclerView$B;
            ((da$a)object).a();
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.coupon_item_image_layout_refresh;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new jc0((View)viewGroup);
        return object;
    }
}

