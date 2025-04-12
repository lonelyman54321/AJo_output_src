/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
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
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class RC2
extends RecyclerView$f {
    public final List a;
    public final String b;
    public final sc2_0 c;
    public final String d;

    public RC2(List list, String string2, sc2_0 sc2_02, String string3) {
        Intrinsics.checkNotNullParameter(sc2_02, "itemClickListener");
        this.a = list;
        this.b = string2;
        this.c = sc2_02;
        this.d = string3;
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
        Object object;
        recyclerView$B = (OC2)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object2 = this.a;
        Intrinsics.checkNotNull(object2);
        object2 = (ProductImage)object2.get(n3);
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object2, "prodImage");
        int n4 = 1;
        Object object3 = new eQ(recyclerView$B, n4);
        recyclerView$B = ((OC2)recyclerView$B).d;
        recyclerView$B.setOnClickListener((View.OnClickListener)object3);
        int n7 = -1;
        if (n3 == n7) {
            n3 = R$string.acc_banner;
            object = hv3_0.K(n3);
        } else {
            n7 = R$string.acc_banner;
            object3 = hv3_0.K(n7);
            String string2 = " index ";
            object = LO1.a(n3, (String)object3, string2);
        }
        object3 = new da$a();
        ((da$a)object3).a = n4 = R$drawable.item_dummy_noimg;
        ((da$a)object3).b = n4;
        n4 = 1;
        ((da$a)object3).s = n4;
        ((da$a)object3).r = n4;
        ((da$a)object3).b((String)object);
        object = UrlHelper.Companion.getInstance();
        object2 = ((ProductImage)object2).getUrl();
        ((da$a)object3).n = object = ((UrlHelper)object).getImageUrl((String)object2);
        ((da$a)object3).u = recyclerView$B;
        ((da$a)object3).i = n4;
        ((da$a)object3).a();
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.b() ? 1 : 0);
        String string2 = null;
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.quickview_list_item_row_luxe;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.quickview_list_item_row_refresh;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        string2 = this.d;
        String string3 = this.b;
        sc2_0 sc2_02 = this.c;
        object = new OC2((View)viewGroup, string3, sc2_02, string2);
        return object;
    }
}

