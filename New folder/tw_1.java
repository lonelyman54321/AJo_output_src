/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tW
 */
public final class tw_1
extends RecyclerView$f {
    public final c92 a;
    public final List b;

    public tw_1(c92 c922, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(c922, "sizeClickListener");
        this.a = c922;
        this.b = arrayList;
    }

    public final int getItemCount() {
        int n3;
        List list = this.b;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (bw_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = this.b;
        Intrinsics.checkNotNull(object);
        object = (ProductOptionVariant)object.get(n3);
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object, "productOptionVariant");
        String string2 = ((ProductOptionVariant)object).getValue();
        int n4 = TextUtils.isEmpty((CharSequence)string2);
        if (n4 == 0) {
            string2 = ((ProductOptionVariant)object).getSizeValue();
            string2 = string2 != null && (n4 = string2.length()) != 0 ? ((ProductOptionVariant)object).getSizeValue() : Y63.f((ProductOptionVariant)object);
            TextView textView = ((bw_0)recyclerView$B).a;
            textView.setText((CharSequence)string2);
            n4 = hv3_0.m(R$color.black);
            textView.setTextColor(n4);
            n4 = (int)(((ProductOptionVariant)object).isStockAvailable() ? 1 : 0);
            if (n4 == 0) {
                textView.setTag(null);
                int n7 = R$drawable.half_cart_closet_size_oos_refresh;
                textView.setBackgroundResource(n7);
                n7 = hv3_0.m(R$color.accent_color_26);
                textView.setTextColor(n7);
            } else {
                n4 = (int)(((ProductOptionVariant)object).isSelected() ? 1 : 0);
                if (n4 != 0) {
                    textView.setTag(null);
                    int n8 = hv3_0.m(R$color.accent_color_10);
                    textView.setBackgroundColor(n8);
                    n8 = hv3_0.m(R$color.white);
                    textView.setTextColor(n8);
                } else {
                    textView.setTag(object);
                    int n10 = hv3_0.m(R$color.white);
                    textView.setBackgroundColor(n10);
                    n10 = hv3_0.m(R$color.accent_color_10);
                    textView.setTextColor(n10);
                }
            }
            object = new BW$a((bw_0)recyclerView$B, n3);
            textView.setOnClickListener((View.OnClickListener)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.row_wishlist_variable_size_refresh;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.a;
        bw_0 bw_02 = new bw_0((View)viewGroup, (c92)object);
        return bw_02;
    }
}

