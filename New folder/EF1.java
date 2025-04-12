/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

public final class EF1
extends RecyclerView$f {
    public final Product a;

    public EF1(Product product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.a = product;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getItemCount() {
        int n3;
        float f5;
        Object object = this.a;
        Object object2 = ((Product)object).getWasPriceData();
        if (object2 == null) return 1;
        object2 = ((Price)object2).getValue();
        float f6 = 0.0f;
        if (object2 != null) {
            f5 = Float.parseFloat((String)object2);
        } else {
            f5 = 0.0f;
            object2 = null;
        }
        object = ((Product)object).getPrice();
        if (object != null && (object = ((Price)object).getValue()) != null) {
            f6 = Float.parseFloat((String)object);
        }
        if ((n3 = Float.compare(f5, f6)) <= 0) return 1;
        return 3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        CharSequence charSequence = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)charSequence);
        int n4 = recyclerView$B instanceof FF1;
        if (n4 != 0) {
            recyclerView$B = (FF1)recyclerView$B;
            recyclerView$B.getClass();
            charSequence = "product";
            Product product = this.a;
            Intrinsics.checkNotNullParameter(product, (String)charSequence);
            recyclerView$B = ((FF1)recyclerView$B).a;
            if (n3 != 0) {
                n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 == n4) {
                        n3 = R$style.muli_bold_10_accent_21;
                        Hm3.f((TextView)recyclerView$B, n3);
                        Object object = product.getWasPriceData();
                        object = qz2_0.g(product.getPrice(), (Price)object);
                        charSequence = product.getDiscountPercent();
                        n4 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
                        if (n4 == 0) {
                            object = product.getDiscountPercent();
                            recyclerView$B.setText((CharSequence)object);
                            recyclerView$B.setVisibility(0);
                        } else {
                            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                            if (n4 == 0) {
                                charSequence = new StringBuilder();
                                ((StringBuilder)charSequence).append((String)object);
                                ((StringBuilder)charSequence).append("% OFF");
                                object = ((StringBuilder)charSequence).toString();
                                recyclerView$B.setText((CharSequence)object);
                                recyclerView$B.setVisibility(0);
                            } else {
                                n3 = 8;
                                recyclerView$B.setVisibility(n3);
                            }
                        }
                    }
                } else {
                    n3 = R$style.muli_regular_10_new_accent_30;
                    Hm3.f((TextView)recyclerView$B, n3);
                    Object object = product.getWasPriceData();
                    if (object != null) {
                        object = ((Price)object).getValue();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object = qz2_0.s(mz3_0.h((String)object));
                    charSequence = new SpannableString((CharSequence)object);
                    product = new StrikethroughSpan();
                    n3 = ((String)object).length();
                    int n7 = 33;
                    charSequence.setSpan((Object)product, 0, n3, n7);
                    recyclerView$B.setText(charSequence);
                }
            } else {
                n3 = R$style.muli_regular_12_accent_21;
                Hm3.f((TextView)recyclerView$B, n3);
                String string2 = qz2_0.r(product.getPrice());
                recyclerView$B.setText(string2);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.luxe_plp_prd_row_price_view;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        FF1 fF1 = new FF1((View)viewGroup);
        return fF1;
    }
}

