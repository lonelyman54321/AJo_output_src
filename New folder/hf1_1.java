/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hF1
 */
public final class hf1_1
extends RecyclerView$B {
    public c92 a;
    public TextView b;

    public final void w(ProductOptionVariant productOptionVariant, int n3) {
        Intrinsics.checkNotNullParameter(productOptionVariant, "productOptionVariant");
        Object object = productOptionVariant.getValue();
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 != 0) {
            return;
        }
        object = productOptionVariant.getSizeValue();
        object = object != null && (n4 = object.length()) != 0 ? productOptionVariant.getSizeValue() : Y63.f(productOptionVariant);
        TextView textView = this.b;
        textView.setText((CharSequence)object);
        n4 = (int)(productOptionVariant.isStockAvailable() ? 1 : 0);
        if (n4 == 0) {
            n4 = R$drawable.half_cart_closet_size_oos_luxe;
            textView.setBackgroundResource(n4);
            n4 = hv3_0.m(R$color.luxe_color_989898);
            textView.setTextColor(n4);
        } else {
            n4 = (int)(productOptionVariant.isSelected() ? 1 : 0);
            if (n4 != 0) {
                n4 = R$color.accent_color_21;
                textView.setBackgroundResource(n4);
                n4 = hv3_0.m(R$color.new_accent_color_31);
                textView.setTextColor(n4);
            } else {
                n4 = R$drawable.rect_black_stroke;
                textView.setBackgroundResource(n4);
                n4 = hv3_0.m(R$color.luxe_color_121212);
                textView.setTextColor(n4);
            }
        }
        object = new gf1_0(productOptionVariant, this, n3);
        textView.setOnClickListener((View.OnClickListener)object);
    }
}

