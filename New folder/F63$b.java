/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
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

public class F63$b
extends RecyclerView$B {
    public TextView a;
    public final F63$d b;

    public F63$b(View view, F63$d f63$d) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(f63$d, "onSizeClickListener");
        super(view);
        this.b = f63$d;
    }

    public final void w(ProductOptionVariant object, int n3) {
        int n4;
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(object, "productOptionVariant");
        Object object2 = ((ProductOptionVariant)object).getValue();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        object2 = this.a;
        if (object2 != null) {
            charSequence = ((ProductOptionVariant)object).getSizeValue();
            charSequence = charSequence != null && (n4 = ((String)charSequence).length()) != 0 ? ((ProductOptionVariant)object).getSizeValue() : Y63.f((ProductOptionVariant)object);
            object2.setText(charSequence);
        }
        if ((object2 = this.a) != null) {
            n4 = hv3_0.m(R$color.black);
            object2.setTextColor(n4);
        }
        n3 = (int)(((ProductOptionVariant)object).isStockAvailable() ? 1 : 0);
        n4 = 0;
        charSequence = null;
        if (n3 == 0) {
            object = this.a;
            if (object != null) {
                object.setTag(null);
            }
            if ((object = this.a) != null) {
                n3 = R$drawable.product_size_not_available;
                object.setBackgroundResource(n3);
            }
            if ((object = this.a) != null) {
                n3 = hv3_0.m(R$color.accent_color_12);
                object.setTextColor(n3);
            }
            if ((object = this.a) != null) {
                n3 = 2;
                object.setImportantForAccessibility(n3);
            }
        } else {
            n3 = (int)(((ProductOptionVariant)object).isSelected() ? 1 : 0);
            if (n3 != 0) {
                object = this.a;
                if (object != null) {
                    object.setTag(null);
                }
                if ((object = this.a) != null) {
                    n3 = hv3_0.m(R$color.accent_color_10);
                    object.setBackgroundColor(n3);
                }
                if ((object = this.a) != null) {
                    n3 = hv3_0.m(R$color.white);
                    object.setTextColor(n3);
                }
            } else {
                object2 = this.a;
                if (object2 != null) {
                    object2.setTag(object);
                }
                if ((object = this.a) != null) {
                    n3 = R$drawable.product_size_available;
                    object.setBackgroundResource(n3);
                }
                if ((object = this.a) != null) {
                    n3 = hv3_0.m(R$color.accent_color_10);
                    object.setTextColor(n3);
                }
            }
        }
        if ((object = this.a) != null && (object = object.getText()) != null && (object2 = this.a) != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append(" size");
            object = ((StringBuilder)charSequence).toString();
            object2.setContentDescription((CharSequence)object);
        }
        if ((object = this.a) != null) {
            object2 = new F63$b$a(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }
}

