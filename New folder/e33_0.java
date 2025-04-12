/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
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
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from E33
 */
public final class e33_0
extends RecyclerView$f {
    public final List a;
    public final g71_0 b;

    public e33_0(List list, g71_0 g71_02) {
        Intrinsics.checkNotNullParameter(list, "bannerList");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        this.a = list;
        this.b = g71_02;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        int n7;
        recyclerView$B = (m33_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        List list = this.a;
        BannerData bannerData = (BannerData)list.get(n3);
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(list, "bannerList");
        ((m33_0)recyclerView$B).g = list;
        Object object = ((m33_0)recyclerView$B).b;
        Object object2 = object.getLayoutParams();
        ((ViewGroup.LayoutParams)object2).height = n7 = bannerData.getHeight();
        object2 = object.getLayoutParams();
        ((ViewGroup.LayoutParams)object2).width = n7 = bannerData.getWidth();
        object2 = new da$a();
        n7 = 1;
        ((da$a)object2).k = n7;
        ((da$a)object2).b = n4 = R$drawable.item_dummy_noimg;
        ((da$a)object2).c = n4 = R$drawable.component_placeholder;
        ((da$a)object2).a = n4;
        ((da$a)object2).r = n7;
        ((da$a)object2).s = n7;
        n4 = R$string.acc_icon_product_placeholder;
        String string2 = hv3_0.K(n4);
        ((da$a)object2).b(string2);
        string2 = bannerData.getBannerUrl();
        ((da$a)object2).n = string2;
        ((da$a)object2).u = object;
        ((da$a)object2).i = n7;
        ((da$a)object2).a();
        object = bannerData.getProductCount();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" Products");
        object = ((StringBuilder)object2).toString();
        ((m33_0)recyclerView$B).c.setText((CharSequence)object);
        object = bannerData.getDynamicPageMetadata();
        object2 = ((m33_0)recyclerView$B).d;
        if (object != null && (object = ((DynamicPageMetadata)object).getDuration()) != null) {
            long l2 = ((Number)object).longValue();
            m33_0.w(l2);
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                ai0_2.i((View)object2);
            } else {
                ai0_2.B((View)object2);
                object = m33_0.w(l2);
                object2 = ((m33_0)recyclerView$B).e;
                object2.setText((CharSequence)object);
            }
        } else {
            ai0_2.i((View)object2);
        }
        object2 = ((m33_0)recyclerView$B).a;
        object = new l33_0((g71_0)object2, bannerData, list);
        ((m33_0)recyclerView$B).f.setOnClickListener((View.OnClickListener)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.shop_the_look_home_layout;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.b;
        m33_0 m33_02 = new m33_0((View)viewGroup, (g71_0)object);
        return m33_02;
    }
}

