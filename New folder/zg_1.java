/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZG
 */
public final class zg_1
extends RecyclerView$f {
    public final ArrayList a;
    public final ZG$a b;

    public zg_1(ArrayList arrayList, ZG$a zG$a) {
        Intrinsics.checkNotNullParameter(arrayList, "dataList");
        Intrinsics.checkNotNullParameter(zG$a, "categoryClickListener");
        this.a = arrayList;
        this.b = zG$a;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        object = (bh_2)object;
        Intrinsics.checkNotNullParameter(object, "viewHolder");
        Object object2 = this.a;
        Object object3 = ((ArrayList)object2).get(n3);
        Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
        object3 = (NavImpl)object3;
        int n4 = ((ArrayList)object2).size();
        object.getClass();
        Intrinsics.checkNotNullParameter(object3, "navImpl");
        View view = ((bh_2)object).b;
        View view2 = ((bh_2)object).f;
        int n7 = 8;
        int n8 = 1;
        if (n3 == 0) {
            n4 = R$drawable.category_list_top_bg;
            view2.setBackgroundResource(n4);
            view.setVisibility(n7);
        } else if (n3 == (n4 -= n8)) {
            n4 = R$drawable.category_list_bottom_bg;
            view2.setBackgroundResource(n4);
            view.setVisibility(0);
        } else {
            n4 = hv3_0.m(R$color.white);
            view2.setBackgroundColor(n4);
            view.setVisibility(0);
        }
        n4 = object3 instanceof CMSNavigation;
        view = ((bh_2)object).d;
        if (n4 != 0) {
            boolean bl2;
            object2 = ((CMSNavigation)(object3 = (CMSNavigation)object3)).getInactiveAltText();
            if (object2 != null) {
                object2 = ((CMSNavigation)object3).getInactiveAltText();
                view2.setContentDescription((CharSequence)object2);
            }
            object2 = ((CMSNavigation)object3).getName();
            ImageView imageView = ((bh_2)object).e;
            imageView.setVisibility(0);
            String string2 = ((CMSNavigation)object3).getInactiveImageUrl();
            int n10 = TextUtils.isEmpty((CharSequence)string2);
            ImageView imageView2 = ((bh_2)object).c;
            int n14 = 20;
            if (n10 == 0) {
                n10 = mz3_0.d(n14);
                view.setPadding(n10, 0, 0, 0);
                imageView2.setVisibility(0);
                string2 = UrlHelper.Companion.getInstance().getImageUrl(string2);
                da$a da$a = new da$a();
                da$a.k = n8;
                da$a.a = n14 = 17170445;
                da$a.b = n14;
                da$a.c = n14;
                da$a.s = n8;
                n14 = R$string.acc_icon_product_placeholder;
                String string3 = hv3_0.K(n14);
                da$a.b(string3);
                da$a.g = n8;
                da$a.n = string2;
                da$a.u = imageView2;
                da$a.i = n8;
                da$a.a();
            } else {
                n8 = mz3_0.d(n14);
                view.setPadding(n8, 0, 0, 0);
                imageView2.setVisibility(n7);
            }
            object3 = ((CMSNavigation)object3).getChildDetails();
            if (object3 != null && !(bl2 = object3.isEmpty())) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(n7);
            }
        } else {
            object2 = "";
        }
        object3 = new ah_2((bh_2)object, n3);
        view2.setOnClickListener((View.OnClickListener)object3);
        object = hv3_0.u((String)object2);
        view.setText((CharSequence)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_category;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        ZG$a zG$a = this.b;
        object = new bh_2((View)viewGroup, zG$a);
        return object;
    }
}

