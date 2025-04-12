/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OP
 */
public final class op_1
extends RecyclerView$f {
    public final ArrayList a;
    public final OP$a b;

    public op_1(ArrayList arrayList, OP$a oP$a) {
        Intrinsics.checkNotNullParameter(arrayList, "dataList");
        Intrinsics.checkNotNullParameter(oP$a, "categoryClickListener");
        this.a = arrayList;
        this.b = oP$a;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        object = (mq_1)object;
        Intrinsics.checkNotNullParameter(object, "viewHolder");
        Object object2 = this.a;
        Object object3 = ((ArrayList)object2).get(n3);
        Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
        object3 = (NavImpl)object3;
        int n4 = ((ArrayList)object2).size();
        object.getClass();
        Intrinsics.checkNotNullParameter(object3, "navImpl");
        Object object4 = ((mq_1)object).b;
        View view = ((mq_1)object).f;
        int n7 = 8;
        int n8 = 1;
        if (n3 == 0) {
            n4 = R$drawable.category_list_top_bg;
            view.setBackgroundResource(n4);
            object4.setVisibility(n7);
        } else if (n3 == (n4 -= n8)) {
            n4 = R$drawable.category_list_bottom_bg;
            view.setBackgroundResource(n4);
            object4.setVisibility(0);
        } else {
            n4 = hv3_0.m(R$color.white);
            view.setBackgroundColor(n4);
            object4.setVisibility(0);
        }
        n4 = object3 instanceof Navigation;
        object4 = ((mq_1)object).c;
        TextView textView = ((mq_1)object).d;
        ImageView imageView = ((mq_1)object).e;
        if (n4 != 0) {
            int n10;
            boolean bl2;
            object3 = (Navigation)object3;
            object2 = ((Navigation)object3).getName();
            imageView.setVisibility(0);
            String string2 = ((Navigation)object3).getImageUrl2();
            int n14 = TextUtils.isEmpty((CharSequence)string2);
            int n15 = 20;
            if (n14 == 0) {
                n14 = mz3_0.d(n15);
                textView.setPadding(n14, 0, 0, 0);
                object4.setVisibility(0);
                string2 = UrlHelper.Companion.getInstance().getImageUrl(string2);
                da$a da$a = new da$a();
                da$a.k = n8;
                da$a.a = n15 = 17170445;
                da$a.b = n15;
                da$a.c = n15;
                da$a.s = n8;
                n15 = R$string.acc_icon_product_placeholder;
                String string3 = hv3_0.K(n15);
                da$a.b(string3);
                da$a.g = n8;
                da$a.n = string2;
                da$a.u = object4;
                da$a.i = n8;
                da$a.a();
            } else {
                int n16 = mz3_0.d(n15);
                textView.setPadding(n16, 0, 0, 0);
                object4.setVisibility(n7);
            }
            object4 = ((Navigation)object3).getChildDetails();
            if (!(object4 == null || (bl2 = object4.isEmpty()) || (object3 = ((Navigation)object3).getChildDetails()) != null && (n10 = object3.size()) == n8)) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(n7);
            }
        } else {
            n4 = object3 instanceof LinkDetail;
            if (n4 != 0) {
                object3 = (LinkDetail)object3;
                object2 = ((LinkDetail)object3).getLinkName();
                px3.a((LinkDetail)object3);
                object4.setVisibility(n7);
                imageView.setVisibility(n7);
                textView.setPadding(0, 0, 0, 0);
            } else {
                object2 = "";
            }
        }
        object3 = new lq_1((mq_1)object, n3);
        view.setOnClickListener((View.OnClickListener)object3);
        object = hv3_0.u((String)object2);
        textView.setText((CharSequence)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_category;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        OP$a oP$a = this.b;
        object = new mq_1((View)viewGroup, oP$a);
        return object;
    }
}

